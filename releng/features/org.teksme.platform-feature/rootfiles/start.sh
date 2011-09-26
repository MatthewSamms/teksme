#!/bin/bash
#
#      \\\\ ////
#     \\  - -  //
#         @ @
# ---oOOo-( )-oOOo---
#
# Provider: Creative Works Inc.
#

ABOUT=./about.inf

# get the absolute path of the executable
SELF_PATH=$(cd -P -- "$(dirname -- "$0")" && pwd -P) 

# resolve symlinks
while [ -h $SELF_PATH ]; do
    # 1) cd to directory of the symlink
    # 2) cd to the directory of where the symlink points
    # 3) get the pwd
    # 4) append the basename
    DIR=$(dirname -- "$SELF_PATH")
    SYM=$(readlink $SELF_PATH)
    SELF_PATH=$(cd $DIR && cd $(dirname -- "$SYM") && pwd)
done

# set path to eclipse folder. If local folder, use '.'; otherwise, use /path/to/eclipse/
tekshome='.';

# get path to equinox jar inside $tekshome folder
cp=$(find $tekshome -name "org.eclipse.equinox.launcher_*.jar" | sort | tail -1);

framework_args=org.eclipse.core.runtime.adaptor.EclipseStarter 

config=$SELF_PATH/configuration

# User define Function (UDF)
processLine(){
  line="$@" # get all args
  #  just echo them, but you may need to customize it according to your need
  # for example, F1 will store first field of $line, see readline2 script
  # for more examples
  # F1=$(echo $line | awk '{ print $1 }')
  echo $line
}

# make sure file exist and readable
if [ ! -f $FILE ]; then
	echo "$ABOUT : does not exists"
	exit 1
elif [ ! -r $FILE ]; then
	echo "$ABOUT: can not read"
	exit 2
fi

# Set loop separator to end of line
BAKIFS=$IFS
IFS=$(echo -en "\n\b")
exec 3<&0
exec 0<"$ABOUT"
while read -r line
do
	# use $line variable to process line in processLine() function
	processLine $line
done
exec 0<&3
 
# restore $IFS which was used to determine what the field separators are
IFS=$BAKIFS

echo Java home: $JAVA_HOME

sw_vers
                                                                
echo $*

java -XX:MaxPermSize=256m -Xms128m -Xmx1g -Dteksme.configurationDir=$config -jar $cp $* $framework_args$ -os macosx -ws cocoa -arch x86 -consoleLog -console

