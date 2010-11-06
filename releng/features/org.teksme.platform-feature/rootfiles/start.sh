#!/bin/bash
#
#          \\\\ ////
#         \\  - -  //
#            @ @
# ---oOOo-( )-oOOo---
#
# Provider: TeksMe Inc.
#

ABOUT=./about.inf

# set path to eclipse folder. If local folder, use '.'; otherwise, use /path/to/eclipse/
eclipsehome='.';

# get path to equinox jar inside $eclipsehome folder
cp=$(find $eclipsehome -name "org.eclipse.equinox.launcher_*.jar" | sort | tail -1);

framework_args=org.eclipse.core.runtime.adaptor.EclipseStarter 

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

java -XX:MaxPermSize=256m -Xms128m -Xmx1g -jar $cp $* $framework_args$ -os macosx -ws cocoa -arch x86 -consoleLog -console

