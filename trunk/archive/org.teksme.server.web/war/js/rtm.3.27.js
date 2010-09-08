// Copyright (c) 2009 Remember The Milk Pty Ltd. All Rights Reserved.
var globalScope = this;
var RTM = {};
RTM.isEnglish = function() {
	return rtmLanguage === "en-US" || rtmLanguage === "en-GB"
};
var HAS_GEARS = (typeof window != "undefined" && !(!window.google || !google.gears));
function is(A) {
	return !!(A === 0 || A)
}
function exists(A) {
	return typeof A !== "undefined"
}
function map(F, A) {
	var D = [];
	for ( var E = 0, B = A.length; E < B; E++) {
		D.push(F(A[E]))
	}
	return D
}
function mapkv(E, A) {
	var B = {};
	for ( var D in A) {
		B[D] = E(D, A[D])
	}
	return B
}
String.prototype.trim = function() {
	return this.replace(/^\s+|\s+$/g, "")
};
String.prototype.replaceStr = function(B, A) {
	return this.split(B).join(A)
};
String.prototype.escapeForXML = function() {
	return this.replace(/\&/g, "&amp;").replace(/\"/g, "&quot;").replace(/\</g,
			"&lt;").replace(/\>/g, "&gt;")
};
String.prototype.escapeForField = function() {
	return this.replaceStr("&lt;", "<").replaceStr("&", "&amp;").replaceStr(
			'"', "&quot;").replaceStr("<", "&lt;").replaceStr(">", "&gt;")
};
String.prototype.escapeForDisplay = function() {
	return this.replaceStr("<", "&lt;")
};
String.prototype.escapeForAttr = function() {
	return this.replaceStr("'", "\\'").replaceStr("<", "&lt;")
};
function url_repl(E) {
	var B = [];
	for ( var D = 0, A = E.length; D < A; D++) {
		B.push(E.charAt(D));
		B.push("<wbr />")
	}
	return '<a href="' + E + '" target="_blank">' + B.join("") + "</a>"
}
function email_repl(E) {
	var B = [];
	for ( var D = 0, A = E.length; D < A; D++) {
		B.push(E.charAt(D));
		B.push("<wbr />")
	}
	return '<a href="mailto:' + E + '">' + B.join("") + "</a>"
}
function wbr_repl(E) {
	var B = [];
	for ( var D = 0, A = E.length; D < A; D++) {
		var F = E.charAt(D);
		switch (F) {
		case "&":
			B.push("&amp;");
			break;
		case '"':
			B.push("&quot;");
			break;
		case "<":
			B.push("&lt;");
			break;
		case ">":
			B.push("&gt;");
			break;
		default:
			B.push(F);
			break
		}
		B.push("<wbr></wbr>")
	}
	return B.join("")
}
String.prototype.wbrize = function() {
	if (!(is_gecko && !is_safari)) {
		return this
	}
	var E = this;
	var B = [];
	for ( var D = 0, A = E.length; D < A; D++) {
		if (D > 0 && D % 4 === 0) {
			B.push("<wbr />")
		}
		var F = E.charAt(D);
		switch (F) {
		case "&":
			B.push("&amp;");
			break;
		case '"':
			B.push("&quot;");
			break;
		case "<":
			B.push("&lt;");
			break;
		case ">":
			B.push("&gt;");
			break;
		default:
			B.push(F);
			break
		}
	}
	return B.join("")
};
String.prototype.insertWbrs = function() {
	return this.escapeForXML().replace(/[\w\.+-]+:\/\/([^\s<>'"]+)/g, wbr_repl)
};
String.prototype.autoLink = function(A) {
	var F = this;
	var D = /(([a-zA-Z0-9_\.\-\+])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+)/g;
	var B = /[\w\.+-]+:\/\/([^\s<>\'"]+)/;
	F = F.replaceStr("mailto:", "");
	F = F.replace(D, email_repl);
	F = F.replace(/[\w\.+-]+:\/\/([^\s<>'"]+)/g, url_repl);
	if (A) {
		if (B.test(F) === false) {
			var E = "http://" + F;
			if (B.test(E) === true) {
				F = E.replace(/(http|https):\/\/([^\s<>'"]+)/g, url_repl)
			}
		}
	}
	return F
};
Array.prototype.unique = function() {
	var A = {};
	for ( var D = 0; D < this.length; D++) {
		A[this[D]] = true
	}
	var B = [];
	for ( var E in A) {
		B.push(E)
	}
	return B
};
var HAS_GMAPS = true;
if (typeof window !== "undefined") {
	if (!("GEvent" in window)) {
		(function() {
			window.HAS_GMAPS = false;
			function E() {
			}
			E.addDomListener = function(J, I, K, M) {
				if (!J) {
					return
				}
				var H = function H(O) {
					O || (O = window.event);
					return K.call(J, O)
				};
				if (J.addEventListener) {
					J.addEventListener(I, H, !!M)
				} else {
					J.attachEvent("on" + I, H)
				}
			};
			E.trigger = function(I, H, J) {
			};
			window.GEvent = E;
			function A() {
			}
			window.GControl = A;
			function D() {
			}
			window.GOverlay = D;
			function F() {
			}
			window.GIcon = F;
			function B() {
				return false
			}
			window.GBrowserIsCompatible = B
		})()
	}
}
var isBrowser = (typeof navigator !== "undefined");
var is_ie = isBrowser
		&& (/msie/i.test(navigator.userAgent) && !/opera/i
				.test(navigator.userAgent));
var is_ie5 = isBrowser && (is_ie && /msie 5\.0/i.test(navigator.userAgent));
var is_ie6 = isBrowser && (is_ie && /msie 6\.0/i.test(navigator.userAgent));
var is_ie7 = isBrowser && (is_ie && /msie 7\.0/i.test(navigator.userAgent));
var is_ie8 = isBrowser && (is_ie && /msie 8\.0/i.test(navigator.userAgent));
var is_opera = isBrowser && (/opera/i.test(navigator.userAgent));
var is_win_opera = isBrowser && (/Windows/i.test(navigator.userAgent));
var is_khtml = isBrowser
		&& (/Konqueror|Safari|KHTML/i.test(navigator.userAgent));
var is_gecko = isBrowser && (/Gecko/i.test(navigator.userAgent));
var is_gecko18 = isBrowser && (is_gecko && /rv:1.8/i.test(navigator.userAgent));
var is_gecko19 = isBrowser && (is_gecko && /rv:1.9/i.test(navigator.userAgent));
var is_safari = isBrowser && (/Safari/i.test(navigator.userAgent));
var is_safari_2 = is_safari && (/t\/4/i.test(navigator.userAgent));
var is_safari_3 = is_safari && (/t\/5/i.test(navigator.userAgent));
var is_webkit_52 = is_safari && (/t\/5[23]/i.test(navigator.userAgent));
var is_khtml_43 = is_khtml && (/KHTML\/4\.3/i.test(navigator.userAgent));
var is_safari_31 = is_safari && (/Version\/3.[12]/i.test(navigator.userAgent));
var is_safari_4 = is_safari && (/Version\/4/i.test(navigator.userAgent));
is_safari_31 = is_khtml_43 || is_webkit_52 || is_safari_31 || is_safari_4;
var is_chrome = isBrowser && (/Chrome/i.test(navigator.userAgent));
var is_mac = isBrowser && (/Mac/i.test(navigator.userAgent));
var is_iphone = isBrowser && is_safari && (/Mobile/i.test(navigator.userAgent));
function cloneObj(B) {
	var D = {};
	for ( var A in B) {
		D[A] = B[A]
	}
	return D
}
function cloneArr(D) {
	var A = [];
	for ( var B = 0; B < D.length; B++) {
		A[B] = D[B]
	}
	return A
}
Array.prototype.spliceAll = function(B) {
	for ( var A in this) {
		if (B == this[A]) {
			this.splice(A, 1)
		}
	}
	return this
};
Array.prototype.toHash = function() {
	var B = {};
	for ( var A = 0; A < this.length; A++) {
		B[this[A]] = true
	}
	return B
};
if (!Array.prototype.indexOf) {
	Array.prototype.indexOf = function(B) {
		for ( var A = 0; A < this.length; A++) {
			if (this[A] == B) {
				return A
			}
		}
		return -1
	}
}
function isHashEmpty(D) {
	var B = true;
	for ( var A in D) {
		if (is(D[A])) {
			B = false;
			break
		}
	}
	return B
}
if (isBrowser && !window.XMLHttpRequest) {
	window.XMLHttpRequest = function() {
		var A = null;
		var B;
		try {
			A = new ActiveXObject("Msxml2.XMLHTTP.4.0")
		} catch (B) {
			try {
				A = new ActiveXObject("MSXML2.XMLHTTP")
			} catch (B) {
				try {
					A = new ActiveXObject("Microsoft.XMLHTTP")
				} catch (B) {
				}
			}
		}
		return A
	}
}
function Utility() {
}
Utility.prototype.stopEvent = function(A) {
	A || (A = window.event);
	if (!A) {
		return false
	}
	if (is_ie) {
		A.cancelBubble = true;
		A.returnValue = false
	} else {
		A.preventDefault();
		A.stopPropagation()
	}
	return false
};
Utility.stopPropagation = function(A) {
	A || (A = window.event);
	if (is_ie) {
		A.cancelBubble = true
	} else {
		A.stopPropagation()
	}
	return true
};
Utility.prototype.escapeText = function(A) {
	A = A.replace(/\</g, "&lt;");
	A = A.replace(/\>/g, "&gt;");
	A = A.replace(/\&/g, "&amp;");
	A = A.replace(/\"/g, "&quot;");
	A = A.replace(/\'/g, "&39#;");
	A = A.replace(/\*/g, "&42#;");
	return A
};
Utility.prototype.getEventTarget = function(B) {
	var A = null;
	if (B.target) {
		A = B.target
	} else {
		if (B.srcElement) {
			A = B.srcElement
		}
	}
	if (A.nodeType == 3) {
		A = A.parentNode
	}
	return A
};
Utility.getEventTarget = Utility.prototype.getEventTarget;
Utility.prototype.getRandomInt = function(A) {
	return Math.floor(A * Math.random())
};
Utility.getRandomInt = function(A) {
	return Math.floor(A * Math.random())
};
Utility.prototype.suffixize = function(A) {
	var D = ("" + A);
	var B = parseInt(D[D.length - 1], 10);
	if (B == 1 && A != 11) {
		return A + "st"
	} else {
		if (B == 2 && A != 12) {
			return A + "nd"
		} else {
			if (B == 3 && A != 13) {
				return A + "rd"
			} else {
				return A + "th"
			}
		}
	}
};
Utility.prototype.pluralize = function(B, A) {
	if (rtmLanguage == "en_US") {
		if (B == 1) {
			return B + " " + A
		} else {
			return B + " " + A + "s"
		}
	}
	return B + " " + fmt(A)
};
function el(A) {
	if (document.getElementById) {
		return document.getElementById(A)
	} else {
		if (window[A]) {
			return window[A]
		}
	}
	return null
}
function quoted(A) {
	return A ? '"' + A + '"' : '""'
}
function padded(A) {
	return (A < 10 ? ("0" + A) : A.toString())
}
function setCookie(B, E, A, H, D, F) {
	document.cookie = B + "=" + escape(E)
			+ ((A) ? "; expires=" + A.toGMTString() : "")
			+ ((H) ? "; path=" + H : "") + ((D) ? "; domain=" + D : "")
			+ ((F) ? "; secure" : "")
}
function getCookie(D) {
	var B = document.cookie;
	var F = D + "=";
	var E = B.indexOf("; " + F);
	if (E == -1) {
		E = B.indexOf(F);
		if (E != 0) {
			return null
		}
	} else {
		E += 2
	}
	var A = document.cookie.indexOf(";", E);
	if (A == -1) {
		A = B.length
	}
	return unescape(B.substring(E + F.length, A))
}
function deleteCookie(A, D, B) {
	if (getCookie(A)) {
		document.cookie = A + "=" + ((D) ? "; path=" + D : "")
				+ ((B) ? "; domain=" + B : "")
				+ "; expires=Thu, 01-Jan-70 00:00:01 GMT"
	}
}
function extendObject(B, D) {
	for ( var A in D.prototype) {
		B.prototype[A] = D.prototype[A]
	}
}
var HAS_STRING_TABLE = (typeof STRING_TABLE !== "undefined");
function getfmt(A) {
	return HAS_STRING_TABLE && (A in STRING_TABLE) ? STRING_TABLE[A] : A
}
function fmt(D, A) {
	D = HAS_STRING_TABLE && (D in STRING_TABLE) ? STRING_TABLE[D] : D;
	if (A instanceof Array) {
		for ( var B = 0; B < A.length; B++) {
			D = D.replace("%" + (B + 1), A[B])
		}
		return D
	} else {
		return D.replace("%1", A)
	}
}
var STRING_TABLE_CACHE = {};
function _T(E, B) {
	E = HAS_STRING_TABLE && (E in STRING_TABLE) ? STRING_TABLE[E] : E;
	E = E.replace(new RegExp("{RTM}", "g"), "Remember The Milk");
	if (B) {
		var D, F;
		for ( var A in B) {
			F = B[A];
			if (typeof (F) === "string") {
				F = F.replace(/\$/g, "$$$$")
			}
			if (A in STRING_TABLE_CACHE) {
				E = E.replace(STRING_TABLE_CACHE[A], F)
			} else {
				D = new RegExp("{" + A + "}", "g");
				STRING_TABLE_CACHE[A] = D;
				E = E.replace(D, F)
			}
		}
	}
	return E
}
function _TF(D, B) {
	if (!B) {
		B = {}
	}
	B["START_BOLD"] = "<b>";
	B["END_BOLD"] = "</b>";
	B["START_ITALIC"] = "<i>";
	B["END_ITALIC"] = "</i>";
	B["START_LINK"] = '<a href=" ">';
	B["END_LINK"] = "</a>";
	if (D instanceof Array) {
		var A = D[1];
		var H = D[2];
		var F = "";
		if (is(B["LINK_ID"])) {
			F = " id=" + qtd(B["LINK_ID"])
		}
		var E = "";
		if (is(B["LINK_ONCLICK"])) {
			E = " onclick=" + qtd(B["LINK_ONCLICK"])
		}
		if (H) {
			B["START_LINK"] = "<a " + F + " " + E + " href=" + qtd(A)
					+ ' target="_blank">'
		} else {
			B["START_LINK"] = "<a " + F + " " + E + " href=" + qtd(A) + ">"
		}
		if (is(B["LINK_WRAP"])) {
			B["START_LINK"] = "<span id=" + qtd(B["LINK_WRAP"]) + ">"
					+ B["START_LINK"];
			B["END_LINK"] = B["END_LINK"] + "</span>"
		}
		D = D[0]
	}
	return _T(D, B)
}
function qtd(A) {
	return A ? '"' + A + '"' : '""'
}
function quoteSearchTerm(A) {
	if (A.charAt(0) !== '"' && A.indexOf(" ") > -1
			&& A.charAt(A.length - 1) !== '"') {
		return '"' + A + '"'
	}
	if (A.indexOf("(") > -1 || A.indexOf(")") > -1) {
		return '"' + A + '"'
	}
	return A
}
function debracket(A) {
	if (A && A.charAt(0) === "(" && A.charAt(A.length - 1) == ")") {
		return A.substring(1, A.length - 1)
	}
	return A
}
function normalizeSearchEntry(H) {
	var B = H.split(/[\s;,]+/);
	var A = B.length;
	var D = {};
	var J = false;
	var I;
	for ( var F = 0; F < A; F++) {
		if (B[F].charAt(0) == '"') {
			I = [];
			while (F < A && B[F].charAt(B[F].length - 1) !== '"') {
				I.push(B[F]);
				F++
			}
			if (F < A) {
				I.push(B[F])
			}
			D[I.join(" ")] = true
		} else {
			D[B[F]] = true
		}
	}
	var E = [];
	for ( var B in D) {
		if (B.indexOf("(") > -1 || B.indexOf(")") > -1) {
			E.push('"' + B + '"')
		} else {
			E.push(B)
		}
	}
	return E
}
function getWindowSize() {
	var A, B;
	if (window.innerWidth) {
		A = window.innerWidth;
		B = window.innerHeight
	} else {
		if (document.documentElement && document.documentElement.clientWidth) {
			A = document.documentElement.clientWidth;
			B = document.documentElement.clientHeight
		} else {
			if (document.body) {
				A = document.body.clientWidth;
				B = document.body.clientHeight
			}
		}
	}
	return [ A, B ]
}
function EscapeUnicode(D) {
	var A = [], F, E;
	for ( var B = 0; B < D.length; B++) {
		F = D.charCodeAt(B);
		E = (Math.floor(F / 16).toString(16) + (F % 16).toString(16))
				.toString();
		if (E.length == 2) {
			A.push("\\u00" + E)
		} else {
			A.push("\\u" + E)
		}
	}
	return A.join("")
}
(function() {
	if (typeof JSON != "undefined") {
		Utility.prototype.encodeJavaScript = Utility.toJSON = JSON.stringify;
		return
	}
	var A = {
		"\b" : "\\b",
		"\t" : "\\t",
		"\n" : "\\n",
		"\f" : "\\f",
		"\r" : "\\r",
		'"' : '\\"',
		"\\" : "\\\\"
	}, B = {
		array : function(E) {
			var H = [ "[" ], D, K, J, F = E.length, I;
			for (J = 0; J < F; J += 1) {
				I = E[J];
				K = B[typeof I];
				if (K) {
					I = K(I);
					if (typeof I == "string") {
						if (D) {
							H[H.length] = ","
						}
						H[H.length] = I;
						D = true
					}
				}
			}
			H[H.length] = "]";
			return H.join("")
		},
		"boolean" : function(D) {
			return String(D)
		},
		"null" : function(D) {
			return "null"
		},
		number : function(D) {
			return isFinite(D) ? String(D) : "null"
		},
		object : function(E) {
			if (E) {
				if (E instanceof Array) {
					return B.array(E)
				}
				var F = [ "{" ], D, J, I, H;
				for (I in E) {
					H = E[I];
					J = B[typeof H];
					if (J) {
						H = J(H);
						if (typeof H == "string") {
							if (D) {
								F[F.length] = ","
							}
							F.push(B.string(I), ":", H);
							D = true
						}
					}
				}
				F[F.length] = "}";
				return F.join("")
			}
			return "null"
		},
		string : function(D) {
			if (/["\\\x00-\x1f]/.test(D)) {
				D = D.replace(/([\x00-\x1f\\"])/g, function(F, E) {
					var H = A[E];
					if (H) {
						return H
					}
					H = E.charCodeAt();
					return "\\u00" + Math.floor(H / 16).toString(16)
							+ (H % 16).toString(16)
				})
			}
			return '"' + D + '"'
		}
	};
	Utility.toJSON = Utility.prototype.encodeJavaScript = function(D) {
		var E = B[typeof D];
		if (E) {
			return E(D)
		}
		return B.string(String(D))
	}
})();
Utility.SortAndSign = function(E) {
	var I = getCookie("SID");
	var D = [];
	for ( var J in E) {
		D.push( [ J, E[J] ])
	}
	D.sort(function(O, M) {
		return (O[0] === M[0]) ? 0 : (O[0] < M[0] ? -1 : 1)
	});
	var K = [], B, A = [];
	for ( var H = 0, F = D.length; H < F; H++) {
		B = D[H];
		K.push(B[0] + B[1]);
		A.push(B[0] + "=" + B[1])
	}
	if (I) {
		A.push("sig=" + hex_sha1(I.substring(0, 40) + K.join("")))
	}
	return A.join("&")
};
Utility.IS_HTTPS = isBrowser && window && "location" in window
		&& "protocol" in window.location
		&& window.location.protocol === "https:";
Utility.getImageUrl = function(A) {
	if (Utility.IS_HTTPS || (HAS_GEARS && window.rtmIsOffline)) {
		return A
	}
	return "http://static.rememberthemilk.com" + A
};
Utility.enableForm = function(B, A) {
	map(function(H) {
		if (!H) {
			return 

		}
		H = (typeof (H) === "string" ? el(H) : H);
		if (!H) {
			return
		}
		var E = H.getElementsByTagName("input");
		map(function(I) {
			I.disabled = !A;
			if (A) {
				Utility.removeClass(I, "disabled")
			} else {
				Utility.addClass(I, "disabled")
			}
		}, E);
		var F = H.getElementsByTagName("select");
		map(function(I) {
			I.disabled = !A;
			if (A) {
				Utility.removeClass(I, "disabled")
			} else {
				Utility.addClass(I, "disabled")
			}
		}, F);
		var D = H.getElementsByTagName("textarea");
		map(function(I) {
			I.disabled = !A;
			if (A) {
				Utility.removeClass(I, "disabled")
			} else {
				Utility.addClass(I, "disabled")
			}
		}, D)
	}, B instanceof Array ? B : [ B ])
};
Utility.CLASS_REGEXP_CACHE = {};
Utility.CLASS_REGEXP_REMOVE_CACHE = {};
Utility.hasClass = function(D, B) {
	var A;
	if (B in Utility.CLASS_REGEXP_CACHE) {
		A = Utility.CLASS_REGEXP_CACHE[B]
	} else {
		A = new RegExp("(?:^|\\s+)" + B + "(?:\\s+|$)");
		Utility.CLASS_REGEXP_CACHE[B] = A
	}
	return A.test(D.className)
};
Utility.addClass = function(B, A) {
	if (Utility.hasClass(B, A)) {
		return false
	}
	B.className = [ B.className, A ].join(" ")
};
Utility.removeClass = function(D, B) {
	var A;
	if (B in Utility.CLASS_REGEXP_REMOVE_CACHE) {
		A = Utility.CLASS_REGEXP_REMOVE_CACHE[B]
	} else {
		A = new RegExp("(?:^|\\s+)" + B + "(?:\\s+|$)", "g");
		Utility.CLASS_REGEXP_REMOVE_CACHE[B] = A
	}
	if (!Utility.hasClass(D, B)) {
		return false
	}
	var E = D.className;
	D.className = E.replace(A, " ");
	if (Utility.hasClass(D, B)) {
		Utility.removeClass(D, B)
	}
};
Utility.replaceHTML = function(B, A) {
	if (is_ie) {
		B.innerHTML = A;
		return B
	}
	var D = B.cloneNode(false);
	D.innerHTML = A;
	B.parentNode.replaceChild(D, B);
	return D
};
function getGeolocationInstance() {
	if (typeof navigator == "undefined") {
		return null
	}
	if (navigator.geolocation) {
		return navigator.geolocation
	}
	if (typeof google != "undefined") {
		var A;
		try {
			A = google.gears.factory.create("beta.geolocation")
		} catch (B) {
			A = null
		}
		if (A) {
			navigator.geolocation = A;
			return A
		}
	}
	return null
}
function DateRange(B, A) {
	this.from = B;
	this.to = A;
	this.cache = {};
	this.fromEpoch = this.from.getTime() / 1000;
	this.toEpoch = this.to.getTime() / 1000
}
DateRange.prototype.toString = function() {
	return "[DateRange] from = " + this.from + ", to = " + this.to
};
DateRange.prototype.withinRange = function(A) {
	return (this.from.getTime() <= A.getTime() && A.getTime() <= this.to
			.getTime())
};
DateRange.prototype.withinRangeExc = function(A) {
	return (this.from.getTime() <= A.getTime() && A.getTime() < this.to
			.getTime())
};
DateRange.prototype.epochWithinRange = function(A) {
	if (this.cache[A]) {
		return this.cache[A]
	}
	return (this.cache[A] = (A >= this.fromEpoch) && (A < this.toEpoch))
};
DateRange.prototype.intersectsRange = function(A) {
	return ((A.from.getTime() <= this.to.getTime() && this.to.getTime() <= A.to
			.getTime()) || (A.from.getTime() <= this.from.getTime() && this.from
			.getTime() <= A.to.getTime()))
};
DateRange.prototype.intersectsRanges = function(A) {
	for ( var B = 0; B < A.length; ++B) {
		if (this.intersectsRange(A[B])) {
			return true
		}
	}
};
Date.Days = [ "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
		"Saturday" ];
Date.ICALDays = {
	"SU" : 0,
	"MO" : 1,
	"TU" : 2,
	"WE" : 3,
	"TH" : 4,
	"FR" : 5,
	"SA" : 6
};
Date.Months = [ "January", "February", "March", "April", "May", "June", "July",
		"August", "September", "October", "November", "December" ];
Date.prototype.padded = function(A) {
	return (A < 10 ? ("0" + A) : A.toString())
};
Date.prototype.timezone = function(D) {
	var F = this.getTimezoneOffset();
	var E = Math.floor(Math.abs(F / 60));
	E = this.padded(E);
	var A = Math.floor(Math.abs(F % 60));
	var B = A == 0 ? E : E + ":" + A;
	if (F < 0) {
		return "+" + B
	} else {
		return "-" + B
	}
};
Date.prototype.getFullMonth = function() {
	return Date.Months[this.getMonth()]
};
Date.prototype.getShortMonth = function() {
	return Date.Months[this.getMonth()].substring(0, 3)
};
Date.prototype.getFullDay = function() {
	return Date.Days[this.getDay()]
};
Date.prototype.getShortDay = function() {
	return Date.Days[this.getDay()].substring(0, 3)
};
Date.prototype.getUTCFullMonth = function() {
	return Date.Months[this.getUTCMonth()]
};
Date.prototype.getUTCShortMonth = function() {
	return Date.Months[this.getUTCMonth()].substring(0, 3)
};
Date.prototype.getUTCFullDay = function() {
	return Date.Days[this.getUTCDay()]
};
Date.prototype.getUTCShortDay = function() {
	return Date.Days[this.getUTCDay()].substring(0, 3)
};
Date.prototype.formatUTC = function(A) {
	var B = new String(A);
	B = B.replace("HH", this.padded(this.getUTCHours()));
	B = B.replace("H", this.getUTCHours().toString());
	B = B.replace("MM", this.padded(this.getUTCMinutes()));
	B = B.replace("M", this.getUTCMinutes().toString());
	B = B.replace("SS", this.padded(this.getUTCSeconds()));
	B = B.replace("S", this.getUTCSeconds().toString());
	B = B.replace("YYYY", this.getUTCFullYear().toString());
	B = B.replace("YY", this.getUTCFullYear().toString().substring(2, 4));
	B = B.replace("DDDD", this.getUTCFullDay());
	B = B.replace("DDD", this.getUTCShortDay());
	B = B.replace("DD", this.padded(this.getUTCDate()));
	B = B.replace("D", this.getUTCDate().toString());
	B = B.replace("mmmm", this.getUTCFullMonth());
	B = B.replace("mmm", this.getUTCShortMonth());
	B = B.replace("mm", this.padded(this.getUTCMonth() + 1));
	B = B.replace("XX", this.padded(this.getUTCHours()) > 11 ? "PM" : "AM");
	B = B.replace("ZZ", this.padded((this.getUTCHours()) > 11 ? (this
			.getUTCHours() - 12) : this.getUTCHours()));
	B = B.replace("V", (this.getUTCHours()) > 11 ? (this.getUTCHours() - 12)
			: this.getUTCHours());
	var D = this.getUTCHours() > 11 ? (this.getUTCHours() - 12) : this
			.getUTCHours();
	B = B.replace("Z", (D == 0 ? 12 : D));
	return B
};
Date.prototype.withinRange = function(A) {
	return (A.from.getTime() <= this.getTime() && this.getTime() <= A.to
			.getTime())
};
Date.prototype.withinRanges = function(A) {
	for ( var B = 0; B < A.length; ++B) {
		if (this.withinRange(A[B])) {
			return true
		}
	}
	return false
};
Date.prototype.dateWithinRange = function(D) {
	var B = new Date(D.from.getTime());
	var A = new Date(D.to.getTime());
	B.setHours(0, 0, 0, 0);
	A.setHours(23, 59, 59, 999);
	return (B.getTime() <= this.getTime() && this.getTime() <= A.getTime())
};
Date.prototype.dateWithinRanges = function(A) {
	for ( var B = 0; B < A.length; ++B) {
		if (this.dateWithinRange(A[B])) {
			return true
		}
	}
	return false
};
Date.prototype.monthWithinRange = function(D) {
	var B = new Date(D.from.getTime());
	var A = new Date(D.to.getTime());
	B.setDate(1);
	B.setHours(0, 0, 0, 0);
	A.setMonth(D.to.getMonth() + 1, 1);
	A.setHours(0, 0, 0, 0);
	A.setTime(A.getTime() - 1);
	return (B.getTime() <= this.getTime() && this.getTime() <= A.getTime())
};
Date.prototype.monthWithinRanges = function(A) {
	for ( var B = 0; B < A.length; ++B) {
		if (this.monthWithinRange(A[B])) {
			return true
		}
	}
	return false
};
Date.isleap = function(A) {
	return A % 4 == 0 && (A % 100 != 0 || A % 400 == 0) ? 1 : 0
};
Date._days_in_month = [ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 ];
Date._days_before_month = [ 0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273,
		304, 334 ];
Date.days_before_year = function(A) {
	var B = A - 1;
	if (B >= 0) {
		return B * 365 + Math.floor(B / 4) - Math.floor(B / 100)
				+ Math.floor(B / 400)
	} else {
		return -366
	}
};
Date.days_before_month = function(A, B) {
	var D;
	D = Date._days_before_month[B];
	if (B > 2 && this.isleap(A)) {
		++D
	}
	return D
};
Date.prototype.toOrdinal = function() {
	var D = this.getFullYear();
	var A = this.getMonth() + 1;
	var B = this.getDate();
	return Date.toOrdinal(D, A, B)
};
Date.toOrdinal = function(D, A, B) {
	return Date.days_before_year(D) + Date.days_before_month(D, A) + B
};
Date.DI4Y = 1461;
Date.DI100Y = 36524;
Date.DI400Y = 146097;
Date.days_in_month = function(A, B) {
	if (B == 2 && Date.isleap(A)) {
		return 29
	} else {
		return Date._days_in_month[B]
	}
};
Date.fromOrdinal = function(J) {
	var K, H, O;
	var D, I, F, B, Q, A, E;
	if (J < 1) {
		return null
	}
	--J;
	Q = Math.floor(J / Date.DI400Y);
	D = J % Date.DI400Y;
	K = Q * 400 + 1;
	B = Math.floor(D / Date.DI100Y);
	D = D % Date.DI100Y;
	F = Math.floor(D / Date.DI4Y);
	D = D % Date.DI4Y;
	I = Math.floor(D / 365);
	D = D % 365;
	K += B * 100 + F * 4 + I;
	if (I == 4 || B == 4) {
		if (D != 0) {
			return null
		}
		K -= 1;
		H = 12;
		O = 31;
		return new Date(K, H - 1, O)
	}
	A = I == 3 && (F != 24 || B == 3);
	if (A != Date.isleap(K)) {
		return null
	}
	H = (D + 50) >> 5;
	var M = H > 2 && A ? 1 : 0;
	E = (Date._days_before_month[H] + M);
	if (E > D) {
		H -= 1;
		E -= Date.days_in_month(K, H)
	}
	D -= E;
	O = D + 1;
	return new Date(K, H - 1, O)
};
Date.fromISO = function(A) {
	return new Date(A.substring(0, 4), (A.substring(4, 6) * 1) - 1, A
			.substring(6, 8), A.substring(9, 11), A.substring(11, 13), A
			.substring(13, 15), 0)
};
function DateFormat(K, V) {
	var I = K.length;
	var H = 0;
	var E = [];
	var Q, A;
	var M = false;
	var B = V || new Date();
	var O, J, R, U, D;
	for ( var F = 0; F < I; F++) {
		var Q = K.charAt(F);
		if (F !== I) {
			A = K.charAt(F + 1)
		} else {
			A = null
		}
		if (Q == "'" && A == "'") {
			E.push(Q);
			F++
		} else {
			if (Q == "'") {
				M = !M
			} else {
				if (M) {
					E.push(Q);
					continue
				}
				switch (Q) {
				case "y":
					H++;
					if (A != "y") {
						O = B.getFullYear().toString();
						switch (H) {
						case 1:
							E.push(O);
							break;
						case 2:
							E.push(O.length == 1 ? ("0" + O) : O.substring(
									O.length - 2, O.length));
							break;
						case 3:
							E.push(O.length == 1 ? ("00" + O)
									: (O.length == 2 ? ("0" + O)
											: (O.length == 3 ? O : O.substring(
													O.length - 3, O.length))));
							break;
						case 4:
							E
									.push(O.length == 1 ? ("000" + O)
											: (O.length == 2 ? ("00" + O)
													: (O.length == 3 ? ("0" + O)
															: (O.length == 4 ? O
																	: O
																			.substring(
																					O.length - 4,
																					O.length)))));
							break;
						case 5:
							E
									.push(O.length == 1 ? ("0000" + O)
											: (O.length == 2 ? ("000" + O)
													: (O.length == 3 ? ("00" + O)
															: (O.length == 4 ? ("0" + O)
																	: (O.length == 5 ? O
																			: O
																					.substring(
																							O.length - 5,
																							O.length))))));
							break
						}
						H = 0
					}
					break;
				case "M":
					H++;
					if (A != "M") {
						J = B.getMonth() + 1;
						switch (H) {
						case 1:
							E.push(J);
							break;
						case 2:
							E.push(J < 10 ? ("0" + J) : J);
							break;
						case 3:
							E.push(Intl.month_abbreviated[J - 1]);
							break;
						case 4:
							E.push(Intl.month_wide[J - 1]);
							break;
						case 5:
							E.push(Intl.month_narrow[J - 1]);
							break
						}
						H = 0
					}
					break;
				case "d":
					H++;
					if (A != "d") {
						R = B.getDate().toString();
						switch (H) {
						case 1:
							E.push(R);
							break;
						case 2:
							E.push(R.length == 1 ? ("0" + R) : R);
							break
						}
						H = 0
					}
					break;
				case "E":
					H++;
					if (A != "E") {
						R = B.getDay();
						switch (H) {
						case 1:
							E.push(R + 1);
							break;
						case 2:
							E.push("0" + (R + 1));
							break;
						case 3:
							E.push(Intl.day_abbreviated[R]);
							break;
						case 4:
							E.push(Intl.day_wide[R]);
							break;
						case 5:
							E.push(Intl.day_narrow[R]);
							break
						}
						H = 0
					}
					break;
				case "a":
					E.push(B.getHours() > 11 ? Intl.day_period["pm"]
							: Intl.day_period["am"]);
					break;
				case "z":
					E.push(B.getHours() > 11 ? Intl.day_period["pm"]
							.toLowerCase() : Intl.day_period["am"]
							.toLowerCase());
					break;
				case "h":
					H++;
					if (A != "h") {
						U = B.getHours();
						U = (U == 0 ? 12 : (U > 12 ? (U - 12) : U));
						switch (H) {
						case 1:
							E.push(U);
							break;
						case 2:
							E.push(U < 10 ? ("0" + U) : U);
							break
						}
						H = 0
					}
					break;
				case "H":
					H++;
					if (A != "H") {
						U = B.getHours();
						switch (H) {
						case 1:
							E.push(U);
							break;
						case 2:
							E.push(U < 10 ? ("0" + U) : U);
							break
						}
						H = 0
					}
					break;
				case "K":
					H++;
					if (A != "K") {
						U = B.getHours();
						U = U > 11 ? (U - 12) : U;
						switch (H) {
						case 1:
							E.push(U);
							break;
						case 2:
							E.push(U < 10 ? ("0" + U) : U);
							break
						}
						H = 0
					}
					break;
				case "k":
					H++;
					if (A != "k") {
						U = B.getHours();
						U = U == 0 ? 24 : U;
						switch (H) {
						case 1:
							E.push(U);
							break;
						case 2:
							E.push(U < 10 ? ("0" + U) : U);
							break
						}
						H = 0
					}
					break;
				case "m":
					H++;
					if (A != "m") {
						D = B.getMinutes();
						switch (H) {
						case 1:
							E.push(D);
							break;
						case 2:
							E.push(D < 10 ? ("0" + D) : D);
							break
						}
						H = 0
					}
					break;
				case "s":
					H++;
					if (A != "s") {
						seconds = B.getSeconds();
						switch (H) {
						case 1:
							E.push(seconds);
							break;
						case 2:
							E.push(seconds < 10 ? ("0" + seconds) : seconds);
							break
						}
						H = 0
					}
					break;
				default:
					E.push(Q);
					break
				}
			}
		}
	}
	return E.join("")
}
if (typeof Intl == "undefined") {
	var Intl = {
		"month_wide" : [ "January", "February", "March", "April", "May",
				"June", "July", "August", "September", "October", "November",
				"December" ],
		"month_wide_normal" : [ "January", "February", "March", "April", "May",
				"June", "July", "August", "September", "October", "November",
				"December" ],
		"month_abbreviated" : [ "Jan", "Feb", "Mar", "Apr", "May", "Jun",
				"Jul", "Aug", "Sep", "Oct", "Nov", "Dec" ],
		"month_abbreviated_normal" : [ "Jan", "Feb", "Mar", "Apr", "May",
				"Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" ],
		"month_narrow" : [ "J", "F", "M", "A", "M", "J", "J", "A", "S", "O",
				"N", "D" ],
		"day_wide" : [ "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
				"Friday", "Saturday" ],
		"day_wide_normal" : [ "Sunday", "Monday", "Tuesday", "Wednesday",
				"Thursday", "Friday", "Saturday" ],
		"day_abbreviated" : [ "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" ],
		"day_abbreviated_normal" : [ "Sun", "Mon", "Tue", "Wed", "Thu", "Fri",
				"Sat" ],
		"day_narrow" : [ "S", "M", "T", "W", "T", "F", "S" ],
		"date_formats" : {
			"full" : "EEEE, MMMM d, yyyy",
			"long" : "MMMM d, yyyy",
			"medium" : "MMM d, yyyy",
			"short" : "M/d/yy"
		},
		"time_formats" : {
			"full" : "h:mm:ss a v",
			"long" : "h:mm:ss a z",
			"medium" : "h:mm:ss a",
			"short" : "h:mm a"
		},
		"date_time_formats" : {
			"HHmm" : "HH:mm",
			"HHmmss" : "HH:mm:ss",
			"KKmm" : "KK:mm a",
			"KKmmss" : "KK:mm:ss a",
			"MMMM" : "MMMM",
			"MMMdd" : "MMM dd",
			"MMdd" : "MM-dd",
			"mmssSS" : "mm:ss.SS",
			"ww" : "ww",
			"yyMM" : "MM/yy",
			"yyMMMEEEd" : "EEE, MMM d, yy",
			"yyMMMEEEdd" : "EEE dd/MMM yy",
			"yyMMMd" : "MMM d, yy",
			"yyMMdd" : "MM/dd/yy",
			"yyMMdd_1" : "yy-MM-dd",
			"yyMMddKKmm" : "MM/dd/yy KK:mm a",
			"yyMd" : "M/d/yy",
			"yyQQQQ" : "QQQQ yy",
			"yyyyMMMMEEEEd" : "EEEE,MMMM d, yyyy",
			"yyyyMMMMEEEEdd" : "EEEE,MMMM dd, yyyy",
			"yyyyMMMMEEEd" : "EEE, MMMM d, yyyy",
			"yyyyMMMMd" : "d. MMMM yyyy",
			"yyyyMMMMd_1" : "MMMM d, yyyy",
			"yyyyMMMd" : "MMM d, yyyy",
			"yyyyMMMd_1" : "d. MMM. yyyy",
			"yyyyMMdd" : "MM/dd/yyyy",
			"yyyyMMdd_1" : "yyyy-MM-dd",
			"yyyyMMddHHmmss" : "MM/dd/yyyy HH:mm:ss"
		},
		"date_never" : "never",
		"date_transforms" : [],
		"preferred_formats" : {
			"current_date" : "EEEE, MMMM d, yyyy' | 'h:mma",
			"current_date_24" : "EEEE, MMMM d, yyyy' | 'HH:mm",
			"list_date" : "dd MMM",
			"due" : "EEE d MMM yy",
			"due_field" : "d MMM yy",
			"due_time" : "EEE d MMM yy' at 'h:mma",
			"due_time_24" : "EEE d MMM yy' at 'HH:mm",
			"due_time_field" : "d MMM yy' at 'h:mma",
			"due_time_field_24" : "d MMM yy' at 'HH:mm",
			"weekly_planner" : "EEEE, MMMM d, yyyy",
			"MMM_d" : "MMM d",
			"hmm_a" : "h:mma",
			"hmm_a_24" : "HH:mm",
			"note_date" : "d MMM yyyy, h:mma",
			"note_date_24" : "d MMM yyyy, HH:mm",
			"mobile_day" : "EEEE, d MMM",
			"mobile_short_day" : "d MMM",
			"reminder_title" : "EEE, MMMM d, yyyy, h:mma",
			"reminder_title_24" : "EEE, MMMM d, yyyy, HH:mm"
		},
		"repeat_transforms" : [],
		"locale" : "en-GB",
		"day_period" : {
			"am" : "AM",
			"pm" : "PM"
		}
	}
}
function floatDiv(E, K, J) {
	var H = document, A = H.html, F = document.documentElement, I = H.body;
	var M = el(E);
	var D = el("listbox");
	if (!M) {
		return null
	}
	this[E + "O"] = M;
	M.B = D;
	M.nX = M.iX = K;
	M.nY = M.iY = J;
	M.last_offset_ = M.offsetTop;
	M.moveDiv = function() {
		var V = !arguments.callee.done;
		if (V) {
			arguments.callee.done = true
		}
		var Q, O;
		Q = this.iX >= 0 ? 0 : I.clientWidth;
		O = F && F.scrollTop ? F.scrollTop : I.scrollTop;
		if (this.iY < 0) {
			O += I.clientHeight
		}
		var B = this.clientHeight;
		var Y = this.B.clientHeight;
		var W = (this.offsetTop - this.B.offsetTop);
		var U = (O + this.iY - this.nY);
		var X = (0.1 * U) < 0;
		if (!((B + W + 98) > Y) || X) {
			var R = (Q + this.iX - this.nX);
			if (!(R === 0 && (U > -0.001 && U < 0.01))) {
				this.nX += 0.1 * R;
				this.nY += 0.1 * U;
				this.style.left = this.nX + "px";
				this.style.top = this.nY + "px";
				Autocomplete.handleWindowResize();
				Control.redrawSnake()
			}
		}
		if (V) {
			if (is_safari_3) {
				setInterval(this.id + "O.moveDiv()", 50)
			} else {
				setInterval(this.id + "O.moveDiv()", 52)
			}
		}
	};
	return M
}
function xg() {
	this.initialized_ = false;
	this.sources_ = [];
	this.container_ = null
}
xg.prototype.initialize = function(D, E) {
	var B = "div", F = "snake hidden", H = "snake-line", A = "snake-right-link";
	this.left_links_ = [];
	this.right_link_ = document.createElement(B);
	this.right_link_.className = A;
	this.line_ = document.createElement(B);
	this.line_.className = H;
	this.target_ = el(D);
	this.parent_ = el(E);
	this.sources_ = [];
	this.container_ = document.createElement(B);
	this.container_.className = F;
	this.container_.appendChild(this.right_link_);
	this.container_.appendChild(this.line_);
	document.body.appendChild(this.container_);
	this.initialized_ = true;
	this.drawn_ = false;
	this.shown_ = false;
	this.last_start_x_ = null;
	this.last_start_y_ = null;
	this.last_end_x_ = null;
	this.last_end_y_ = null;
	this.last_target_y_ = null;
	this.modified_ = false;
	this.force_hidden_ = true;
	this.parent_hidden_ = false
};
xg.prototype.set_parent_hidden = function(A) {
	var B = "hidden";
	this.parent_hidden_ = A;
	if (!this.container_) {
		return
	}
	if (A) {
		Utility.addClass(this.container_, B)
	} else {
		Utility.removeClass(this.container_, B)
	}
};
xg.prototype.replace_all = function(A) {
	if (!this.initialized_) {
		return false
	}
	if (this.sources_.length === 0) {
		this.add_source(A)
	} else {
		if (this.sources_.length === 1 && this.sources_[0] !== A
				|| this.sources_.length > 1) {
			this.remove_all_sources();
			this.add_source(A)
		}
	}
	this.force_hidden_ = false
};
xg.prototype.replace_all_sources = function(A) {
	var Q = "ownerDocument";
	if (!this.initialized_) {
		return false
	}
	var M = {};
	for ( var J = 0, F = this.sources_.length; J < F; J++) {
		M[this.sources_[J].entry[0]] = J
	}
	var O = [];
	var D = [];
	var B = {};
	var E = [];
	for ( var J = 0, F = A.length; J < F; J++) {
		var I = A[J].entry[0];
		B[I] = J;
		if (!(I in M)) {
			O.push(A[J])
		} else {
			var K = this.sources_[M[I]];
			var H = Q in K && K.ownerDocument === document;
			if (A[J] !== K || !H) {
				O.push(A[J]);
				D.push(K)
			} else {
				E.push(I)
			}
		}
	}
	for ( var I in M) {
		if (!(I in B) || this.sources_[M[I]] !== A[B[I]]) {
			D.push(this.sources_[M[I]])
		}
	}
	for ( var J = 0, F = D.length; J < F; J++) {
		this.remove_source(D[J])
	}
	for ( var J = 0, F = O.length; J < F; J++) {
		this.add_source(O[J])
	}
	this.force_hidden_ = false
};
xg.prototype.add_source = function(D) {
	var B = "div", A = "snake-left-link";
	if (!this.initialized_) {
		return false
	}
	this.sources_.push(D);
	var E = document.createElement(B);
	E.className = A;
	this.container_.appendChild(E);
	this.left_links_.push(E);
	this.modified_ = true;
	this.force_hidden_ = false
};
xg.prototype.remove_source = function(D) {
	if (!this.initialized_) {
		return false
	}
	for ( var B = 0, A = this.sources_.length; B < A; B++) {
		if (this.sources_[B] === D) {
			this.left_links_[B].parentNode.removeChild(this.left_links_[B]);
			this.left_links_.splice(B, 1);
			this.sources_.splice(B, 1);
			break
		}
	}
	this.modified_ = true;
	this.force_hidden_ = false
};
xg.prototype.remove_all_sources = function(D) {
	var B = "1px";
	if (!this.initialized_) {
		return false
	}
	for ( var A = 0, E = this.sources_.length; A < E; A++) {
		this.left_links_[A].parentNode.removeChild(this.left_links_[A])
	}
	this.left_links_ = [];
	this.sources_ = [];
	this.modified_ = false;
	this.force_hidden_ = false;
	if (D) {
		this.line_.style.height = B
	}
};
xg.prototype.draw = function() {
	if (!this.initialized_) {
		return false
	}
	if (!this.parent_hidden_
			&& (!this.force_hidden_ && this.sources_.length > 0)) {
		this.redraw_line();
		this.show()
	} else {
		this.hide()
	}
};
xg.prototype.show = function() {
	var B = "", A = "visible";
	if (!this.initialized_) {
		return false
	}
	if (!this.shown_) {
		this.line_.style.display = B;
		this.container_.style.visibility = A;
		this.shown_ = true
	}
	this.modified_ = false;
	this.drawn_ = true
};
xg.prototype.hide = function(D) {
	var A = "hidden", B = "none";
	if (!this.initialized_) {
		return false
	}
	if (this.shown_) {
		this.line_.style.display = B;
		this.container_.style.visibility = A;
		this.shown_ = false
	}
	this.modified_ = !!D;
	this.force_hidden_ = !!D;
	this.drawn_ = false
};
if (is_safari_2) {
	xg.prototype.redraw_line = function() {
		var AK = "px", AL = "rowPriority", AN = "table";
		if (!this.initialized_
				|| (this.force_hidden_ || (this.sources_.length === 0 || !this.sources_[0]))) {
			return 

		}
		var V = null;
		var Z = null;
		var M = null, O = null;
		var J = [];
		var K = this.sources_[0].firstChild.offsetHeight;
		if (!is_safari_3) {
			K += 18
		}
		var I = this.parent_.offsetWidth;
		var AE = this.sources_[0].lastChild.offsetWidth;
		var AH = this.parent_.getElementsByTagName(AN)[0].rows[0].firstChild.offsetTop;
		if (!is_safari_3 && !(AL in this.sources_[0])) {
			AH -= 6
		}
		for ( var AG = 0, AF = this.sources_.length; AG < AF; AG++) {
			M = this.sources_[AG];
			O = Autocomplete.findPosition(M.firstChild);
			O[1] -= AH;
			M.pos = O;
			if (V === null || O[1] < V.pos[1]) {
				V = M
			}
			if (Z === null || O[1] > Z.pos[1]) {
				Z = M
			}
			J.push(O[1] + K / 2)
		}
		var U = Autocomplete.findPosition(this.target_);
		var W = this.target_.offsetHeight;
		var R = this.target_.offsetWidth;
		var AM = U[1] + W / 2;
		var X = V.pos[1] + K / 2;
		var AB = Z.pos[1] + K / 2;
		var AI = AM;
		var Y = null;
		if (AM < X) {
			Y = AB
		} else {
			if (AM > AB) {
				Y = X;
				AI = AM
			} else {
				Y = X;
				AI = AB
			}
		}
		var AA = V.pos[0] + I;
		var AJ = U[0];
		var H = AJ - AA;
		var Q = H / 2;
		if (!this.modified_
				&& (this.last_start_x_ === AA && (this.last_start_y_ === Y && (this.last_end_x_ === AJ && this.last_end_y_ === AI)))) {
			if (this.last_target_y_ !== AM) {
				this.right_link_.style.top = AM + AK;
				this.right_link_.style.left = AJ - Q + AK;
				this.right_link_.style.width = Q + AK
			}
			return
		}
		var AC = Math.abs(Y - AI);
		for ( var AG = 0, AF = this.sources_.length; AG < AF; AG++) {
			var AD = this.left_links_[AG];
			AD.style.top = J[AG] + AK;
			AD.style.left = AA + 1 + AK;
			AD.style.width = Q + AK
		}
		this.right_link_.style.top = AM + AK;
		this.right_link_.style.left = AJ - Q + AK;
		this.right_link_.style.width = Q + AK;
		this.line_.style.top = (Y > AI ? AI : Y) + AK;
		this.line_.style.left = AJ - Q + AK;
		this.line_.style.height = AC + AK;
		this.last_start_x_ = AA;
		this.last_start_y_ = Y;
		this.last_end_x_ = AJ;
		this.last_end_y_ = AI;
		this.last_target_y_ = AM
	}
} else {
	xg.prototype.redraw_line = function() {
		var AI = "px";
		if (!this.initialized_
				|| (this.force_hidden_ || (this.sources_.length === 0 || !this.sources_[0]))) {
			return 

		}
		var Y = null;
		var AA = null;
		var Q = null, U = null;
		var K = [];
		var M = this.sources_[0].offsetHeight;
		for ( var AF = 0, AE = this.sources_.length; AF < AE; AF++) {
			Q = this.sources_[AF];
			if (is_ie && !is_opera) {
				try {
					U = Autocomplete.findPosition(Q)
				} catch (AJ) {
					return
				}
			} else {
				U = Autocomplete.findPosition(Q)
			}
			Q.pos = U;
			if (Y === null || U[1] < Y.pos[1]) {
				Y = Q
			}
			if (AA === null || U[1] > AA.pos[1]) {
				AA = Q
			}
			K.push(U[1] + M / 2)
		}
		var X = Autocomplete.findPosition(this.target_);
		var J = Y.offsetWidth;
		var F = this.target_.offsetHeight;
		var W = this.target_.offsetWidth;
		var R = X[1] + F / 2;
		var Z = Y.pos[1] + M / 2;
		var AB = AA.pos[1] + M / 2;
		var AG = R;
		var H = null;
		if (R < Z) {
			H = AB
		} else {
			if (R > AB) {
				H = Z;
				AG = R
			} else {
				H = Z;
				AG = AB
			}
		}
		var I = Y.pos[0] + J;
		var AH = X[0];
		var O = AH - I;
		var V = O / 2;
		if (!this.modified_
				&& (this.last_start_x_ === I && (this.last_start_y_ === H && (this.last_end_x_ === AH && this.last_end_y_ === AG)))) {
			if (this.last_target_y_ !== R) {
				this.right_link_.style.top = R + AI;
				this.right_link_.style.left = AH - V + AI;
				this.right_link_.style.width = V + AI
			}
			return
		}
		var AC = Math.abs(H - AG);
		for ( var AF = 0, AE = this.sources_.length; AF < AE; AF++) {
			var AD = this.left_links_[AF];
			AD.style.top = K[AF] + AI;
			AD.style.left = I + 1 + AI;
			AD.style.width = V + AI
		}
		this.right_link_.style.top = R + AI;
		this.right_link_.style.left = AH - V + AI;
		this.right_link_.style.width = V + AI;
		this.line_.style.top = (H > AG ? AG : H) + AI;
		this.line_.style.left = AH - V + AI;
		this.line_.style.height = AC + AI;
		this.last_start_x_ = I;
		this.last_start_y_ = H;
		this.last_end_x_ = AH;
		this.last_end_y_ = AG;
		this.last_target_y_ = R
	}
}
if (typeof globalScope !== "undefined") {
	globalScope.Snake = xg
}
function rg() {
	this.timeEstimateCache = {};
	this.timeEstimateFormatCache = {};
	this.timeSpecCache = {};
	this.serverDate = null;
	this.startDate = null;
	this.serverOffset = 0;
	this.chimeTimeout = null;
	this.monthLength = new Array(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
	this.numbers = {
		zero : 0,
		one : 1,
		two : 2,
		three : 3,
		four : 4,
		five : 5,
		six : 6,
		seven : 7,
		eight : 8,
		nine : 9
	};
	this.cache = {};
	this.rangeCache = {};
	this.useCache = false;
	this.formatCache = {};
	this.friendlyCache = {};
	this.friendlyTimeCache = {};
	this.timezoneOffset = null;
	this.noMaint = false
}
rg.INSTANCE = null;
rg.getInstance = function() {
	if (rg.INSTANCE === null) {
		rg.INSTANCE = new rg()
	}
	return rg.INSTANCE
};
rg.prototype.getCachedIntlFormat = function(B, A) {
	if (!is(this.formatCache[B])) {
		this.formatCache[B] = {}
	}
	if (this.formatCache[B][A]) {
		return this.formatCache[B][A]
	}
	return this.formatCache[B][A] = DateFormat(B, new Date(A * 1000))
};
rg.friendlyDateMap = {
	es : "d/MM/yy",
	fr : "dd/MM/yy",
	ja : "yy'\u5E74'M'\u6708'd'\u65E5'",
	nl : "d-MM-yy",
	"pt-BR" : "dd/MM/yy",
	"pt-PT" : "dd/MM/yy",
	"zh-CN" : "yy'\u5E74'M'\u6708'd'\u65E5'",
	"zh-TW" : "yy'\u5E74'M'\u6708'd'\u65E5'",
	tr : "dd.MM.yy",
	bs : "yy-MM-dd",
	sv : "yy-MM-dd",
	de : "dd.MM.yy",
	pl : "yy-MM-dd",
	it : "dd/MM/yy",
	ru : "dd.MM.yy",
	cs : "d.M.yy",
	ko : "yy-MM-dd",
	no : "dd.MM.yy",
	hu : "yy.MM.dd.",
	lv : "yy.d.M",
	lt : "yy.MM.dd",
	da : "dd/M/yy",
	eo : "yy-MM-dd",
	ca : "dd/MM/yy"
};
rg.prototype.getAutocompletions = function() {
	var J = "EEEE", O = "INTERFACE_OVERVIEW_TODAY", M = "INTERFACE_OVERVIEW_TOMORROW", K = "day";
	var I = new Date();
	var A = null;
	var F = [];
	if (RTM.isEnglish()) {
		F.push(_T(O).toLowerCase());
		F.push(_T(M).toLowerCase())
	} else {
		F.push(_T(O));
		F.push(_T(M))
	}
	for ( var E = 0; E < 5; E++) {
		var D = new Date(I);
		this.calculateUnit(D, E + 2, K, false);
		var B = D.getTime();
		var H = rg.getCachedIntlFormatForDate(J, D, B);
		if (RTM.isEnglish()) {
			F.push(H.toLowerCase())
		} else {
			F.push(H)
		}
	}
	return F
};
rg.prototype.getFriendlyDate = function(B, E) {
	var K = "EEEE", Q = "HH:mm", M = "INTERFACE_OVERVIEW_TODAY", I = "MM/dd/yy", J = "MMM dd", H = "dd/MM/yy", R = "en-GB", U = "en-US", O = "h:mmz";
	var A = parseInt(B, 10);
	if (!E && A in this.friendlyCache) {
		return this.friendlyCache[A]
	} else {
		if (E && A in this.friendlyTimeCache) {
			return this.friendlyTimeCache[A]
		}
	}
	var V = A * 1000;
	var F = new Date(V);
	var D = null;
	if (V >= rg.PRE_TODAY && V < rg.PRE_TOMORROW) {
		if (E) {
			if (!(rtmLanguage === U || rtmLanguage === R)) {
				D = rg.getCachedIntlFormatForDate(Intl.preferred_formats.hmm_a,
						F, V)
			} else {
				D = rg.getCachedIntlFormatForDate(rtmTime24 ? Q : O, F, V)
			}
		} else {
			D = _T(M)
		}
	} else {
		if (V >= rg.PRE_TOMORROW && V < rg.PRE_WEEK) {
			D = rg.getCachedIntlFormatForDate(K, F, V)
		} else {
			if (V >= rg.PRE_THIS_YEAR && V < rg.PRE_SIX_MONTHS) {
				if (!(rtmLanguage === U || rtmLanguage === R)) {
					D = rg.getCachedIntlFormatForDate(
							Intl.preferred_formats.list_date, F, V)
				} else {
					D = rg.getCachedIntlFormatForDate(J, F, V)
				}
			} else {
				if (!(rtmLanguage === U || rtmLanguage === R)
						&& rtmLanguage in rg.friendlyDateMap) {
					D = rg.getCachedIntlFormatForDate(
							rg.friendlyDateMap[rtmLanguage], F, V)
				} else {
					if (configurationMgr.configuration.dateFormat == 1) {
						D = rg.getCachedIntlFormatForDate(I, F, V)
					} else {
						D = rg.getCachedIntlFormatForDate(H, F, V)
					}
				}
			}
		}
	}
	if (!E) {
		this.friendlyCache[A] = D
	} else {
		this.friendlyTimeCache[A] = D
	}
	return D
};
rg.formatCache = {};
rg.getCachedIntlFormatForDate = function(A, D, B) {
	B = B || D;
	if (!(A in this.formatCache)) {
		this.formatCache[A] = {}
	}
	if (this.formatCache[A][B]) {
		return this.formatCache[A][B]
	}
	return this.formatCache[A][B] = DateFormat(A, D)
};
rg.prototype.setCache = function(A) {
	this.useCache = !!A;
	this.cache = {};
	this.rangeCache = {};
	this.friendlyCache = {};
	this.friendlyTimeCache = {}
};
rg.prototype.setTimezoneOffset = function(A) {
	this.timezoneOffset = A
};
rg.prototype.getDay = function(B) {
	var A = Date.Days;
	var D = {};
	for ( var E = 0; E < A.length; E++) {
		D[A[E].substring(0, 3).toLowerCase()] = E
	}
	B = B.length > 3 ? B.substring(0, 3).toLowerCase() : B.toLowerCase();
	return D[B]
};
rg.prototype.calculateDate = function(D, E, A) {
	var B = 0;
	if (E >= D) {
		D = D + 7
	}
	if (A) {
		B = 7 + (D - E)
	} else {
		B = D - E
	}
	return B
};
rg.prototype.checkDate = function(K, H) {
	var B = K;
	var A = parseInt(B.getFullYear(), 10);
	var E = parseInt(B.getMonth(), 10);
	if (H) {
		var I = parseInt(B.getDate(), 10);
		I += H
	} else {
		var I = parseInt(B.getDate(), 10)
	}
	if (!is(I) || (!is(E) || !is(A))) {
		return false
	}
	var D, F;
	do {
		if (E == 12) {
			A = parseInt(A, 10) + 1;
			E = 0
		}
		D = Date.days_in_month(A, E + 1);
		if (!(I > D)) {
			break
		}
		F = parseInt(I, 10) - D;
		E = parseInt(E, 10) + 1;
		I = F
	} while (I > D);
	var J = new Date(B);
	J.setYear(A);
	J.setMonth(E);
	J.setDate(I);
	J.setHours(B.getHours());
	J.setMinutes(B.getMinutes());
	J.setSeconds(B.getSeconds());
	return J
};
rg.prototype.calculateUnit = function(K, H, B, E) {
	var Y = "d", W = "m", U = "undefined", X = "w", V = "y";
	var Q = 0;
	var O = 0;
	var A = 0;
	var I = K.getFullYear();
	var J = K.getMonth();
	var M = K.getDate();
	var D = B.toLowerCase().charAt(0);
	var F = parseInt(H, 10);
	if (isNaN(F)) {
		F = this.numbers[H.toLowerCase()]
	}
	switch (D) {
	case Y:
		Q = F;
		break;
	case X:
		Q = F * 7;
		break;
	case W:
		O = F;
		break;
	case V:
		A = F;
		break
	}
	if (!E) {
		I += A;
		J += O;
		M += Q
	} else {
		I -= A;
		J -= O;
		M -= Q
	}
	K.setYear(I);
	K.setMonth(J);
	var R;
	if (typeof is_safari !== U && (is_safari && !is_safari_3)) {
		R = this.checkDate(K, Q)
	} else {
		K.setDate(M);
		R = this.checkDate(K)
	}
	return R
};
rg.prototype.getMonth = function(A) {
	var E = Date.Months;
	var D = {};
	for ( var B = 0; B < E.length; B++) {
		D[E[B].substring(0, 3).toLowerCase()] = B + 1
	}
	A = A.length > 3 ? A.substring(0, 3).toLowerCase() : A.toLowerCase();
	return D[A]
};
rg.prototype.getYear = function(D) {
	var A = "20", B = "200";
	return D.length == 1 ? parseInt(B + D, 10) : D.length == 2 ? parseInt(
			A + D, 10) : D
};
rg.prototype.getEpochForDate = function(A) {
	var B = this.parseDueDate(A);
	if (B && B[0]) {
		return parseInt(B[0].getTime(), 10)
	} else {
		return null
	}
};
rg.prototype.hideMaint = function() {
	this.noMaint = rtmMaintTS;
	this.updateDateTime(this, new Date())
};
rg.prototype.updateDateTime = function(V, W) {
	var F = '</a> [<a href=" " onclick="dateTimeMgr.hideMaint(); return false;">x</a>]</b>', H = '<b><a style="color: #EA5200;" href="http://status.rememberthemilk.com/" target="_blank">Planned maintenance starting on ', Q = "SmartAdd", U = "datetime", K = "in 1 week", J = "in 7 months", R = "today", M = "tomorrow", E = "undefined", O = "yyyy'-01-01'", I = "yyyy'-MM-01'";
	var D = el(U);
	if (D && W) {
		D.innerHTML = DateFormat(Intl.preferred_formats.current_date);
		var B = W.getHours();
		var X = W.getMinutes();
		if (B === 0 && X === 0) {
			rg.PRE_TODAY = this.getEpochForDate(R);
			rg.PRE_THIS_YEAR = this.getEpochForDate(DateFormat(O, new Date(
					rg.PRE_TODAY)));
			rg.PRE_TOMORROW = this.getEpochForDate(M);
			rg.PRE_WEEK = this.getEpochForDate(K);
			rg.PRE_SIX_MONTHS = this.getEpochForDate(J);
			rg.PRE_SIX_MONTHS = this.getEpochForDate(DateFormat(I, new Date(
					rg.PRE_SIX_MONTHS)));
			this.friendlyCache = {};
			this.friendlyTimeCache = {};
			taskList.updateForNewDay()
		}
		if (this.noMaint !== rtmMaintTS
				&& (rtmMaintTS && (W.getTime() < rtmMaintTS && X % 2 === 0))) {
			var A = new Date(rtmMaintTS);
			D.innerHTML = H + DateFormat(Intl.preferred_formats.due_time, A)
					+ F
		}
		if (typeof globalScope !== E && Q in globalScope) {
			wg.AUTO_DUE = rg.getInstance().getAutocompletions()
		}
	}
};
rg.prototype.init = function() {
	var D = "chime";
	this.mbn = this.getUniqueMessageBusName();
	var B = this;
	var A = function(F, E) {
		B.updateDateTime(F, E)
	};
	messageBus.subscribe(A, this.mbn + D);
	this.startChime()
};
rg.PRE_TODAY = null;
rg.PRE_TOMORROW = null;
rg.PRE_WEEK = null;
rg.PRE_SIX_MONTHS = null;
rg.PRE_THIS_YEAR = null;
rg.prototype.getUniqueMessageBusName = function() {
	var A = "rtm.datetimemanager.";
	return A
};
rg.prototype.startChime = function() {
	var F = "in 1 week", E = "in 7 months", B = "today", H = "tomorrow", D = "yyyy'-'MM'-01'", A = "yyyy'-01-01'";
	rg.PRE_TODAY = this.getEpochForDate(B);
	rg.PRE_THIS_YEAR = this.getEpochForDate(DateFormat(A,
			new Date(rg.PRE_TODAY)));
	rg.PRE_TOMORROW = this.getEpochForDate(H);
	rg.PRE_WEEK = this.getEpochForDate(F);
	rg.PRE_SIX_MONTHS = this.getEpochForDate(E);
	rg.PRE_SIX_MONTHS = this.getEpochForDate(DateFormat(D, new Date(
			rg.PRE_SIX_MONTHS)));
	this.chime()
};
rg.prototype.chime = function() {
	var B = "chime";
	var D = this;
	var A = function() {
		D.chime()
	};
	this.chimeTimeout = setTimeout(A, 1000 * 60);
	messageBus.broadcast(this, this.mbn + B, new Date())
};
rg.prototype.stopChime = function() {
	clearTimeout(this.chimeTimeout);
	this.chimeTimeout = null
};
rg.prototype.setServerDate = function(A) {
	if (A < 2000000000) {
		A *= 1000
	}
	if (this.startDate === null) {
		this.startDate = new Date(A)
	}
	this.serverDate = new Date(A);
	var B = new Date();
	this.serverOffset = B.getTime() - this.serverDate.getTime()
};
rg.prototype.setTimezone = function(E) {
	var A = "/", B = "TZ", F = "auth.setTimezone";
	var D = new Date();
	setCookie(B, D.getTimezoneOffset(), null, A, null, null);
	if (!E) {
		if (rtmIsOffline) {
			return
		}
		transMgr.request(F, utility.encodeJavaScript( {
			tz : D.getTimezoneOffset()
		}))
	}
};
rg.prototype.parseTimeEstimate = function(I, H) {
	var O = ".", M = "0", R = "en-GB", U = "en-US", Q = "undefined";
	if (!H && (rtmLanguage !== U && rtmLanguage !== R)) {
		if (this.timeEstimateCache[I]) {
			return this.timeEstimateCache[I]
		}
		var A = null;
		if ((A = this.parseTimeEstimate(I, true)) !== null) {
			return A
		}
		var K = this.parseDueDate(I);
		if (K !== null) {
			I = K[5]
		}
	}
	var J, F, B;
	var V = false;
	if (this.timeEstimateCache[I]) {
		return this.timeEstimateCache[I]
	}
	J = F = B = 0;
	var D = /([0-9.]+)\s*(days|day|d)/i.exec(I);
	if (D != null) {
		if (typeof D[0] != Q) {
			J += parseInt(D[1], 10);
			V = true
		}
	}
	var D = /([0-9.]+)\s*(hours|hour|hrs|hr|h)/i.exec(I);
	if (D != null) {
		if (typeof D[0] != Q) {
			var E = D[1].indexOf(O);
			if (E > -1) {
				if (E > 0) {
					F = parseInt(D[1].substring(0, E), 10)
				} else {
					F = 0
				}
				B = parseFloat(M + D[1].substring(E, D[1].length)) * 60
			} else {
				F = parseInt(D[1], 10)
			}
			V = true
		}
	}
	var D = /([0-9.]+)\s*(minutes|minute|mins|min|m)/i.exec(I);
	if (D != null) {
		if (typeof D[0] != Q) {
			B += parseInt(D[1], 10);
			V = true
		}
	}
	if (V === false) {
		return null
	}
	B = J * 24 * 60 + F * 60 + B;
	this.timeEstimateCache[I] = B;
	return B
};
rg.prototype.formatTimeEstimate = function(B) {
	var H = ", ", O = "INTERFACE_TASKS_LIST_DETAILS_TIME_ESTIMATE_NUM_DAYS", K = "INTERFACE_TASKS_LIST_DETAILS_TIME_ESTIMATE_NUM_HOURS", I = "INTERFACE_TASKS_LIST_DETAILS_TIME_ESTIMATE_NUM_MINUTES", Q = "INTERFACE_TASKS_LIST_DETAILS_TIME_ESTIMATE_ONE_DAY", M = "INTERFACE_TASKS_LIST_DETAILS_TIME_ESTIMATE_ONE_HOUR", J = "INTERFACE_TASKS_LIST_DETAILS_TIME_ESTIMATE_ONE_MINUTE";
	if (this.timeEstimateFormatCache[B]) {
		return this.timeEstimateFormatCache[B]
	}
	var F, D, A;
	F = D = A = 0;
	A = B;
	F = Math.floor(A / (24 * 60));
	A = Math.floor(A % (24 * 60));
	D = Math.floor(A / 60);
	A = Math.floor(A % 60);
	var E = [];
	if (F === 1) {
		E.push(_T(Q))
	} else {
		if (F > 1) {
			E.push(_T(O, {
				NUM : F
			}))
		}
	}
	if (D === 1) {
		E.push(_T(M))
	} else {
		if (D > 1) {
			E.push(_T(K, {
				NUM : D
			}))
		}
	}
	if (A === 1) {
		E.push(_T(J))
	} else {
		if (A > 1) {
			E.push(_T(I, {
				NUM : A
			}))
		}
	}
	E = E.join(H);
	this.timeEstimateFormatCache[B] = E;
	return E
};
rg.prototype.parseTimeSpec = function(B, V) {
	var Q = ".", O = "0", U = "_", R = "undefined";
	var A = false;
	var K, F, D;
	var V = !!V;
	var M = null;
	var I = [ B, V ].join(U);
	if (this.timeSpecCache[I]) {
		return this.timeSpecCache[I]
	}
	K = F = D = 0;
	var H = /([0-9]+)\:([0-9]+)\:([0-9]+)/i.exec(B);
	if (H != null) {
		if (typeof H[0] != R) {
			K = parseInt(H[1], 10);
			F = parseInt(H[2], 10);
			D = parseInt(H[3], 10);
			A = true;
			M = B.indexOf(H[0])
		}
	} else {
		var H = /([0-9.]+)\s*(hours|hour|hrs|hr|h)/i.exec(B);
		if (H != null) {
			if (typeof H[0] != R) {
				var J = H[1].indexOf(Q);
				if (J > -1) {
					K = parseInt(H[1].substring(0, J), 10);
					F = parseFloat(O + H[1].substring(J, H[1].length)) * 60
				} else {
					K = parseInt(H[1], 10)
				}
				A = true;
				M = B.indexOf(H[0])
			}
		}
		var H = /([0-9.]+)\s*(minutes|minute|mins|min|m)/i.exec(B);
		if (H != null) {
			if (typeof H[0] != R) {
				F += parseInt(H[1], 10);
				A = true;
				if (M === null) {
					M = B.indexOf(H[0])
				}
			}
		}
		var H = /([0-9.]+)\s*(seconds|second|secs|sec|s)/i.exec(B);
		if (H != null) {
			if (typeof H[0] != R) {
				D += parseInt(H[1], 10);
				A = true;
				if (M === null) {
					M = B.indexOf(H[0])
				}
			}
		}
	}
	D = K * 60 * 60 + F * 60 + D;
	if (A) {
		var E = V ? [ D, M ] : D;
		this.timeSpecCache[I] = E;
		return E
	} else {
		return null
	}
};
rg.prototype.splitTimeSpec = function(A) {
	var B, E, D;
	B = E = D = 0;
	D = A;
	B = Math.floor(D / (60 * 60));
	E = Math.floor(D % (60 * 60));
	D = Math.floor(E % 60);
	E = Math.floor(E / 60);
	return [ B, E, D ]
};
rg.prototype.formatTimeSpec = function(E) {
	var Q = "", J = " and ", M = ", ", O = "hour", K = "minute", I = "second";
	var B = this.splitTimeSpec(E);
	var F = B[0];
	var D = B[1];
	var A = B[2];
	var H = Q;
	if (F > 0) {
		H += utility.pluralize(F, O)
	}
	if (D > 0) {
		if (F > 0) {
			H += M + utility.pluralize(D, K)
		} else {
			H += utility.pluralize(D, K)
		}
	}
	if (A > 0) {
		if (F > 0 || D > 0) {
			H += J + utility.pluralize(A, I)
		} else {
			H += utility.pluralize(A, I)
		}
	}
	return H
};
rg.prototype.convertTimeSpec = function(D) {
	var B = ":";
	var A = this.parseTimeSpec(D);
	if (A == null) {
		return null
	}
	A = this.splitTimeSpec(A);
	for ( var E = 0; E < A.length; E++) {
		A[E] = padded(A[E])
	}
	return A.join(B)
};
rg.prototype.normalizeAMPM = function(D, B) {
	var I = "a", O = "p", H = "\u4E0A", M = "\u4E0B", F = "\u5348\u524D", K = "\u5348\u5F8C", E = "\uC624\uC804", J = "\uC624\uD6C4";
	if (B) {
		var A = B.toLowerCase().charAt(0);
		D = parseInt(D, 10);
		if (D != 12 && (A == O || (A == M || (B == K || B == J)))) {
			D = D + 12
		}
		D = parseInt(D, 10);
		if (D == 12) {
			if (A == I || (A == H || (B == F || B == E))) {
				D = 0
			} else {
				D = 12
			}
		}
	} else {
		D = parseInt(D, 10)
	}
	return D
};
rg.prototype.formatTime = function(B, D) {
	var H = "", Q = "00:00", O = "12am", M = ":", K = ":00", J = "am", I = "pm";
	if (B[0] == null) {
		if (D) {
			return Q
		}
		return O
	}
	if (D) {
		return padded(B[0]) + M + padded(B[1]) + K
	}
	var A = J;
	if (B[0] > 11) {
		A = I
	}
	var F = B[0] || 12;
	if (F > 12) {
		F = F - 12
	}
	var E = B[1] != 0 ? M + padded(B[1]) : H;
	return F + E + A
};
rg.prototype.parseTime = function(B) {
	var M = "12pm", R = "never", O = "today 12pm", Q = "tomorrow 12am";
	if (B.trim().length == 0 || B.trim().indexOf(R) > -1) {
		return [ null, null ]
	}
	B = B.replace(/midnight/i, Q);
	B = B.replace(/midday/i, O);
	B = B.replace(/noon/i, M);
	var F = /(@|at)?\s*([0-9]+)(?::|\.)([0-9]+)\s*(am|pm)?/i;
	var H = /(@|at)?\s*([0-9]{3,4})\s*(am|pm)?/i;
	var A = /(@|at)?\s*([0-9]{1,2})\s*(am|pm)?/i;
	var K = F.exec(B);
	var J = H.exec(B);
	var I = A.exec(B);
	if (!K && (!J && !I)) {
		return [ null, null ]
	}
	var E = null, D = null;
	if (K) {
		if (K[2]) {
			E = K[2];
			if (K[3]) {
				D = parseInt(K[3], 10)
			} else {
				D = 0
			}
			E = this.normalizeAMPM(E, K[4])
		}
	}
	if (!K && J) {
		if (J[2]) {
			if (J[2].length == 3) {
				E = parseInt(J[2].substring(0, 1), 10);
				D = parseInt(J[2].substring(1, 3), 10)
			} else {
				E = parseInt(J[2].substring(0, 2), 10);
				D = parseInt(J[2].substring(2, 4), 10)
			}
			E = this.normalizeAMPM(E, J[3])
		}
	}
	if (!K && (!J && I)) {
		if (I[2]) {
			E = parseInt(I[2], 10);
			D = 0;
			E = this.normalizeAMPM(E, I[3])
		}
	}
	return [ E, D ]
};
rg.prototype.parseDueRange = function(F, J) {
	var Q = "1", R = "of", U = "today";
	var H = F;
	F = F.trim();
	if (this.useCache && this.rangeCache[H]) {
		return this.rangeCache[H]
	}
	if (F.length == 0) {
		return this.useCache ? (this.rangeCache[H] = null) : null
	}
	var E = F.split(/\bof\b/i);
	var I, O;
	if (E.length == 1) {
		I = E[0];
		O = U
	} else {
		if (E.length == 2) {
			I = E[0];
			O = E[1]
		} else {
			I = E.shift();
			O = E.join(R)
		}
	}
	I = I.trim();
	O = O.trim();
	var D = this.parseDueDate(O);
	if (D[0] === null) {
		return this.useCache ? (this.rangeCache[H] = null) : null
	}
	D = new Date(D[0]);
	I = I.replace(/a /, Q).split(/\s+/);
	if (I.length == 1) {
		return this.useCache ? (this.rangeCache[H] = null) : null
	}
	var K = I.shift();
	var A = I.shift();
	var M = this.calculateUnit(new Date(D), K, A, !!J);
	if (!D || !M) {
		return this.useCache ? (this.rangeCache[H] = null) : null
	}
	if (!!J === true) {
		var B = D;
		D = M;
		M = B;
		D.setDate(D.getDate() + 1);
		M.setDate(M.getDate() + 1)
	}
	return this.useCache ? (this.rangeCache[H] = new DateRange(D, M))
			: new DateRange(D, M)
};
rg.reNow = /\bnow\b/i;
rg.tom = /(today|tod|tomorrow|tom|tonight|ton|tmr|yesterday)/i;
if (typeof is_safari == "undefined" || !is_safari) {
	rg.zero = /([0-9]{1,4})(?:\-|\/|\.|\u5e74|\u6708|\u65e5)([0-9]{1,2})(?:\-|\/|\.|\u5e74|\u6708|\u65e5)*([0-9]{1,4})*/i
} else {
	rg.zero = new RegExp(
			"([0-9]{1,4})(?:\\-|\\/|\\.|\u5E74|\u6708|\u65E5)([0-9]{1,2})(?:\\-|\\/|\\.|\u5E74|\u6708|\u65E5)*([0-9]{1,4})*",
			"i")
}
rg.one = /(on)?\s*(([0-9]*)(?:st|th|rd|nd)*(?:\s|of|\-a|\-|,|\.)*(january|jan|february|feb|march|mar|april|apr|may|june|jun|july|jul|august|aug|september|sept|sep|october|oct|november|nov|december|dec)(?:\s|\-|\.)*([0-9]*))/i;
rg.upcomingFormat = /(on)?\s*((january|jan|february|feb|march|mar|april|apr|may|june|jun|july|jul|august|aug|september|sept|sep|october|oct|november|nov|december|dec)(?:\s|,|\.|\-)*([0-9]+)(?:st|th|rd|nd)*(?:\s|,|\.|\-a|\-)*([0-9]*))/i;
rg.two = /(on)?\s*((next)?\s*(monday|mon|tuesday|tue|wednesday|wed|thursday|thu|friday|fri|saturday|sat|sunday|sun))/i;
rg.three = /(in)?\s*(one|two|three|four|five|six|seven|eight|nine|ten|[0-9]+)\s*(years|year|yrs|yr|months|month|mons|mon|weeks|week|wks|wk|days|day)/i;
rg.endofFormat = /end\s*of\s*(?:the)*\s*(week|w|month|m)/i;
rg.dateBased = /(on)?\s*([0-9]+)(?:st|th|rd|nd)/i;
if (typeof is_safari == "undefined" || !is_safari) {
	rg.four = /(@|at|,)?\s*([0-9]+)(?::|\.|\u0020\u0068\u0020|\u6642|h)([0-9]+)(?:\u5206)?\s*(am|a|pm|p|\u4e0a|\u4e0b|\u5348\u524d|\u5348\u5f8c|\uc624\uc804|\uc624\ud6c4)?/i;
	rg.five = /(@|at)?\s*([0-9]{3,4})\s*(a|p|\u4e0a|\u4e0b|\u5348\u524d|\u5348\u5f8c|\uc624\uc804|\uc624\ud6c4)?/i;
	rg.six = /(@|at)?\s*([0-9]{1,2})\s*(a|p|\u4e0a|\u4e0b|\u5348\u524d|\u5348\u5f8c|\uc624\uc804|\uc624\ud6c4)?/i
} else {
	rg.four = new RegExp(
			"(@|at|,)?\\s*([0-9]+)(?::|.| h |\u6642|h)([0-9]+)(?:\u5206)?\\s*(am|a|pm|p|\u4E0A|\u4E0B|\u5348\u524D|\u5348\u5F8C|\uC624\uC804|\uC624\uD6C4)?",
			"i");
	rg.five = new RegExp(
			"(@|at)?\\s*([0-9]{3,4})\\s*(a|p|\u4E0A|\u4E0B|\u5348\u524D|\u5348\u5F8C|\uC624\uC804|\uC624\uD6C4)?",
			"i");
	rg.six = new RegExp(
			"(@|at)?\\s*([0-9]{1,2})\\s*(a|p|\u4E0A|\u4E0B|\u5348\u524D|\u5348\u5F8C|\uC624\uC804|\uC624\uD6C4)?",
			"i")
}
rg.rtmformat = new RegExp(
		"_RTM_:(year=(\\d+))?(?:,)?(month=(\\d+))?(?:,)?(date=(\\d+))?");
rg._r_a = / a /i;
rg._r_midnight = /midnight/i;
rg._r_midday = /midday/i;
rg._r_noon = /noon/i;
rg.prototype.parseDueDate = function(J) {
	var Ai = " one ", AN = ",a", AM = ",b", AL = ",c", AK = ",timespec", Aa = "1", AJ = "12pm", AY = "day", Aj = "never", Ay = "o", Aw = "p", Ah = "q", AI = "r", AQ = "sun", Ad = "tmr", AW = "tod", Af = "tom", AO = "tomorrow 12am", AV = "ton", AH = "v", AR = "w", AG = "x", AT = "yes", Az = "z";
	var Q = J;
	var AS = null;
	if (this.useCache && this.cache[Q]) {
		return this.cache[Q]
	}
	if (J.trim().length == 0 || J.trim().indexOf(Aj) > -1) {
		return this.useCache ? (this.cache[Q] = [ null, null ])
				: [ null, null ]
	}
	var I = new Date();
	J = J.replace(rg._r_a, Ai);
	J = J.replace(rg._r_midnight, AO);
	J = J.replace(rg._r_midday, AJ);
	J = J.replace(rg._r_noon, AJ);
	var K = null, A5 = null;
	var K, AB, A5, Ak, H, BD, A1, Ap, BE, A2, AZ;
	K = AB = A5 = Ak = H = BD = A1 = Ap = BE = A2 = AZ = null;
	AB = rg.rtmformat.exec(J);
	if (!(AB && AB[0])) {
		A2 = rg.upcomingFormat.exec(J);
		Ap = rg.three.exec(J);
		AZ = rg.endofFormat.exec(J);
		if (!A2) {
			H = rg.zero.exec(J)
		}
		BD = rg.one.exec(J);
		if (!BD) {
			if (!A2 && (!Ap && (!AZ && !H))) {
				A1 = rg.two.exec(J)
			}
			BE = rg.dateBased.exec(J)
		}
		A5 = rg.reNow.exec(J);
		Ak = rg.tom.exec(J)
	}
	var A9 = this.parseTimeSpec(J, true);
	var Ae = A9 !== null ? A9[1] : null;
	A9 = A9 !== null ? A9[0] : null;
	var Av = rg.four.exec(J);
	var A4 = rg.five.exec(J);
	var An = rg.six.exec(J);
	var A6 = false;
	var O = false;
	if (!A5
			&& (!Ak && (!H && (!BD && (!A1 && (!Ap && (!BE && (!A2 && (!AB && (!AZ && (!Av && (!A4 && (!An && !A9))))))))))))) {
		return this.useCache ? (this.cache[Q] = [ null, null ])
				: [ null, null ]
	}
	var AE = null;
	var BI = null;
	var BA = null;
	var Au = null;
	if (AB) {
		BA = J.indexOf(AB[0]);
		Au = AB[0].length;
		var BF = BA + AB[0].length;
		var Aq = J.length;
		J = J.substring(BF, Aq);
		AE = AI;
		BI = AB[0]
	} else {
		if (H) {
			BA = J.indexOf(H[0]);
			Au = H[0].length;
			var BF = BA + H[0].length;
			var Aq = J.length;
			J = J.substring(BF, Aq);
			AE = AH;
			BI = H[0]
		} else {
			if (BD) {
				BA = J.indexOf(BD[0]);
				Au = BD[0].length;
				var BF = BA + BD[0].length;
				var Aq = J.length;
				J = J.substring(BF, Aq);
				AE = AG;
				BI = BD[0]
			} else {
				if (Ap) {
					BA = J.indexOf(Ap[0]);
					Au = Ap[0].length;
					var BF = BA + Ap[0].length;
					var Aq = J.length;
					J = J.substring(BF, Aq);
					AE = Az;
					BI = Ap[0]
				} else {
					if (BE) {
						BA = J.indexOf(BE[0]);
						Au = BE[0].length;
						var BF = BA + BE[0].length;
						var Aq = J.length;
						J = J.substring(BF, Aq);
						AE = Ay;
						BI = BE[0]
					} else {
						if (A2) {
							BA = J.indexOf(A2[0]);
							Au = A2[0].length;
							var BF = BA + A2[0].length;
							var Aq = J.length;
							J = J.substring(BF, Aq);
							AE = Aw;
							BI = A2[0]
						} else {
							if (AZ) {
								BA = J.indexOf(AZ[0]);
								Au = AZ[0].length;
								var BF = BA + AZ[0].length;
								var Aq = J.length;
								J = J.substring(BF, Aq);
								AE = Ah;
								BI = AZ[0]
							}
						}
					}
				}
			}
		}
	}
	AS = BA;
	A9 = this.parseTimeSpec(J, true);
	Ae = A9 !== null ? A9[1] : null;
	A9 = A9 !== null ? A9[0] : null;
	Av = rg.four.exec(J);
	A4 = rg.five.exec(J);
	An = rg.six.exec(J);
	var BG = null;
	var A0 = null;
	var A7 = null;
	var AA = null;
	var BM = null;
	var BH = true;
	var AX = false;
	var A8 = false;
	if (Ap) {
		var Y = J.split(/\s*(?:and|\,)\s*/);
		var At = [];
		At.push(Ap);
		if (Y.length > 1) {
			for ( var BK = 1; BK < Y.length; BK++) {
				At.push(rg.three.exec(Y[BK]))
			}
		}
	}
	if (AB && AB[0]) {
		if (AB[2]) {
			BG = this.getYear(AB[2]);
			A6 = true
		} else {
			BG = I.getFullYear()
		}
		if (AB[4]) {
			A0 = AB[4] * 1
		} else {
			A0 = I.getMonth() + 1
		}
		if (AB[6]) {
			A7 = AB[6] * 1
		} else {
			A7 = 1
		}
	} else {
		if (H) {
			if (H[3]) {
				BG = H[1].length == 4 ? 1 : 3;
				A0 = BG == 1 ? 2 : configurationMgr.dateStyle === 1 ? 1 : 2;
				A7 = BG == 1 ? 3 : configurationMgr.dateStyle === 1 ? 2 : 1;
				A6 = true;
				if (H[A0] > 12) {
					var BL = A0;
					A0 = A7;
					A7 = BL
				}
				BG = this.getYear(H[BG]);
				A0 = H[A0];
				A7 = H[A7]
			} else {
				if (H[1].length == 4) {
					BG = H[1];
					A0 = H[2];
					A7 = 1
				} else {
					BG = I.getFullYear();
					if (configurationMgr.dateStyle === 1) {
						A0 = 1;
						A7 = 2
					} else {
						A0 = 2;
						A7 = 1
					}
					if (H[A0] > 12) {
						var BL = A7;
						A7 = A0;
						A0 = BL
					}
					A0 = H[A0];
					A7 = H[A7]
				}
			}
		} else {
			if (BD) {
				A0 = this.getMonth(BD[4]);
				if (!BD[3]) {
					if (!BD[5]) {
						A7 = 1
					} else {
						A7 = BD[5];
						BD[5] = null
					}
				} else {
					A7 = BD[3]
				}
				if (BD[5]) {
					BG = this.getYear(BD[5]);
					A6 = true
				} else {
					BG = I.getFullYear()
				}
			} else {
				if (A1) {
					AS = J.indexOf(A1[0]);
					Au = A1[0].length;
					var W = false;
					if (A1[3]) {
						W = true
					}
					if (A1[4]) {
						BG = I.getFullYear();
						A0 = I.getMonth() + 1;
						A7 = I.getDate()
								+ this.calculateDate(this.getDay(A1[4]), I
										.getDay(), W)
					}
				} else {
					if (Ap) {
						var Am = null;
						for ( var BK = 0; BK < At.length; BK++) {
							if (At[BK][2]) {
								Am = this.calculateUnit(I, At[BK][2],
										At[BK][3], false)
							}
						}
						if (Am) {
							AX = true;
							BG = Am.getFullYear();
							A0 = Am.getMonth() + 1;
							A7 = Am.getDate()
						} else {
							return this.useCache ? (this.cache[Q] = [ null,
									null ]) : [ null, null ]
						}
					} else {
						if (Ak) {
							AS = J.indexOf(Ak[0]);
							Au = Ak[0].length;
							var Am = null;
							var V = Ak[1].toLowerCase().substring(0, 3);
							if (V == Af || V == Ad) {
								AX = true;
								Am = this.calculateUnit(I, Aa, AY, false)
							} else {
								if (V == AW || V == AV) {
									Am = I
								} else {
									if (V == AT) {
										A8 = true;
										Am = this
												.calculateUnit(I, Aa, AY, true)
									}
								}
							}
							if (Am) {
								BG = Am.getFullYear();
								A0 = Am.getMonth() + 1;
								A7 = Am.getDate()
							} else {
								return this.useCache ? (this.cache[Q] = [ null,
										null ]) : [ null, null ]
							}
						} else {
							if (BE) {
								var A7 = parseInt(BE[2], 10);
								var Am = new Date();
								A0 = Am.getMonth();
								if (A7 > 0 && A7 <= this.monthLength[A0]) {
									BG = Am.getFullYear();
									A0 = A0 + 1;
									Am.setDate(A7)
								} else {
									return this.useCache ? (this.cache[Q] = [
											null, null ]) : [ null, null ]
								}
							} else {
								if (A2) {
									A0 = this.getMonth(A2[3]);
									if (A2[4].length == 4) {
										A7 = 1;
										BG = this.getYear(A2[4]);
										A6 = true
									} else {
										A7 = parseInt(A2[4], 10);
										if (A2[5]) {
											BG = this.getYear(A2[5]);
											A6 = true
										} else {
											BG = I.getFullYear()
										}
									}
								} else {
									if (AZ) {
										BG = I.getFullYear();
										A0 = I.getMonth() + 1;
										if (AZ[1] == AR) {
											A7 = I.getDate()
													+ this.calculateDate(this
															.getDay(AQ), I
															.getDay(), false)
										} else {
											A7 = Date.days_in_month(BG, A0)
										}
									} else {
										if (A5) {
											var Am = new Date();
											BG = Am.getFullYear();
											A0 = Am.getMonth() + 1;
											A7 = Am.getDate();
											AA = Am.getHours();
											BM = Am.getMinutes()
										} else {
											var Am = new Date();
											BG = Am.getFullYear();
											A0 = Am.getMonth() + 1;
											A7 = Am.getDate();
											BH = false
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	var Ar = true;
	var M = null;
	var BJ = null;
	if (Av) {
		if (Av[2]) {
			AA = Av[2];
			if (Av[3]) {
				BM = parseInt(Av[3], 10)
			} else {
				BM = 0
			}
			AA = this.normalizeAMPM(AA, Av[4]);
			O = true;
			AE += AN;
			M = Q.indexOf(Av[0])
		}
	} else {
		if (A4) {
			if (A4[2]) {
				if (A4[2].length == 3) {
					AA = parseInt(A4[2].substring(0, 1), 10);
					BM = parseInt(A4[2].substring(1, 3), 10)
				} else {
					AA = parseInt(A4[2].substring(0, 2), 10);
					BM = parseInt(A4[2].substring(2, 4), 10)
				}
				AA = this.normalizeAMPM(AA, A4[3]);
				O = true;
				AE += AM;
				M = Q.indexOf(A4[0])
			}
		} else {
			if (A9 === null && An) {
				if (An[2]) {
					AA = parseInt(An[2], 10);
					BM = 0;
					AA = this.normalizeAMPM(AA, An[3]);
					O = true;
					AE += AL;
					M = Q.indexOf(An[0]);
					BJ = An[0].length
				}
			} else {
				An = null
			}
		}
	}
	var Ag = false;
	if (!Av && (!A4 && !An) && A9 !== null) {
		var As = this.splitTimeSpec(A9);
		AA = As[0];
		BM = As[1];
		seconds = As[2];
		if (Am) {
			Am.setHours(Am.getHours() + AA);
			Am.setMinutes(Am.getMinutes() + BM);
			AA = Am.getHours();
			BM = Am.getMinutes()
		}
		Ar = false;
		AE += AK;
		Ag = true;
		M = Ae
	}
	if (M !== null && (AS === null || M < AS)) {
		AS = M;
		Au = BJ
	}
	var Z = true;
	if (AA === null) {
		AA = 0;
		Z = false
	}
	if (BM === null) {
		BM = 0;
		Z = false
	}
	var X = new Date();
	var Ax = X.getFullYear();
	var R = X.getMonth() + 1;
	var Ao = X.getDate();
	var AU = X.getHours();
	var AC = X.getMinutes();
	var BB = AU * 60 + AC;
	var AF = parseInt(BG, 10);
	var BC = parseInt(A0, 10);
	var U = parseInt(A7, 10);
	var Al = parseInt(AA, 10) * 60 + parseInt(BM, 10);
	var AD = AF === Ax && (BC === R && Ao === U);
	A0 = parseInt(A0, 10);
	if (A8 === false && (AX == false && (A6 == false && A0 < R))) {
		BG = parseInt(BG, 10) + 1
	}
	if (AD === true && (BH == false && ((O == true || Ag == true) && Al < BB))) {
		A7 = parseInt(A7, 10) + 1
	}
	var AP = new Date(BG, A0 - 1, A7, AA, BM, 0);
	var A3 = [ AP, Z, Ar, AE, BI, Q, J, AS, Au, An ];
	return this.useCache ? (this.cache[Q] = A3) : A3
};
rg.prototype.getTimeTuple = function() {
	var F = new Date();
	var H = new Date();
	H.setHours(0, 0, 0, 0);
	var D = dateTimeMgr.checkDate(H);
	H.setDate(H.getDate() + 1);
	var B = this.checkDate(H);
	H.setDate(H.getDate() + 1);
	var K = this.checkDate(H);
	var E = parseInt(F.getTime() / 1000, 10);
	var A = parseInt(D.getTime() / 1000, 10);
	var I = parseInt(B.getTime() / 1000, 10);
	var J = parseInt(K.getTime() / 1000, 10);
	return [ E, A, I, J ]
};
rg.interval_re = new RegExp(
		"((\\d+)\\s*year(?:s)?)?\\s*((\\d+)\\s*mon(?:s)?)?\\s*((\\d+)\\s*day(?:s)?)?\\s*((\\d{2}):(\\d{2}):(\\d{2}))?");
rg.week_re = new RegExp("((\\d+)\\s*week(?:s)?)");
rg.prototype.TransformDate = function(X) {
	var AE = "", AP = " days", AI = " seconds", AD = ", ", AJ = "1 second", Y = "INTERFACE_DF_1_MONTH", U = "INTERFACE_DF_1_WEEK", AN = "INTERFACE_DF_1_YEAR", W = "INTERFACE_DF_NUM_MONTHS", Q = "INTERFACE_DF_NUM_WEEKS", AA = "INTERFACE_DF_NUM_YEARS", M = "INTERFACE_TASKS_LIST_DETAILS_TIME_ESTIMATE_NUM_DAYS", AM = "INTERFACE_TASKS_LIST_DETAILS_TIME_ESTIMATE_NUM_HOURS", AK = "INTERFACE_TASKS_LIST_DETAILS_TIME_ESTIMATE_NUM_MINUTES", O = "INTERFACE_TASKS_LIST_DETAILS_TIME_ESTIMATE_ONE_DAY", K = "INTERFACE_TASKS_LIST_DETAILS_TIME_ESTIMATE_ONE_HOUR", AL = "INTERFACE_TASKS_LIST_DETAILS_TIME_ESTIMATE_ONE_MINUTE", AF = "ja", AH = "zh-CN", AG = "zh-TW";
	var X = X.toLowerCase();
	var AC = rg.week_re.exec(X);
	if (AC && AC[0]) {
		X = X.replace(AC[1], AC[2] * 7 + AP)
	}
	var AB = rg.interval_re.exec(X);
	var I = AB[2];
	var R = AB[4];
	var J = AB[6];
	var Z = AB[8];
	var V = AB[9];
	var H = AB[10];
	var AO = [];
	if (exists(I)) {
		I = I * 1;
		if (I) {
			if (I == 1) {
				AO.push(_T(AN))
			} else {
				AO.push(_T(AA, {
					NUM : I
				}))
			}
		}
	}
	if (exists(R)) {
		R = R * 1;
		if (R) {
			if (R == 1) {
				AO.push(_T(Y))
			} else {
				AO.push(_T(W, {
					NUM : R
				}))
			}
		}
	}
	if (exists(J)) {
		J = J * 1;
		if (J > 6) {
			var AQ = Math.floor(J / 7);
			J = J % 7;
			if (AQ == 1) {
				AO.push(_T(U))
			} else {
				AO.push(_T(Q, {
					NUM : AQ
				}))
			}
		}
		if (J) {
			if (J == 1) {
				AO.push(_T(O))
			} else {
				AO.push(_T(M, {
					NUM : J
				}))
			}
		}
	}
	if (exists(Z)) {
		Z = Z * 1;
		if (Z) {
			if (Z == 1) {
				AO.push(_T(K))
			} else {
				AO.push(_T(AM, {
					NUM : Z
				}))
			}
		}
	}
	if (exists(V)) {
		V = V * 1;
		if (V) {
			if (V == 1) {
				AO.push(_T(AL))
			} else {
				AO.push(_T(AK, {
					NUM : V
				}))
			}
		}
	}
	if (exists(H)) {
		H = H * 1;
		if (H) {
			if (H == 1) {
				AO.push(AJ)
			} else {
				AO.push(H + AI)
			}
		}
	}
	if (rtmLanguage == AH || (rtmLanguage == AG || rtmLanguage == AF)) {
		return AO.join(AE)
	}
	return AO.join(AD)
};
if (typeof globalScope !== "undefined") {
	globalScope.DateTimeManager = rg
}
function vg() {
}
vg.INSTANCE = null;
vg.getInstance = function() {
	if (vg.INSTANCE === null) {
		vg.INSTANCE = new vg()
	}
	return vg.INSTANCE
};
vg.prototype.convertReoccurrenceSpecDesc = function(V) {
	var J = "DAILY", R = "FREQ", A = "INTERFACE_DF_1_MONTH", E = "INTERFACE_DF_1_WEEK", M = "INTERFACE_DF_1_YEAR", Q = "INTERFACE_DF_NUM_MONTHS", D = "INTERFACE_DF_NUM_WEEKS", K = "INTERFACE_DF_NUM_YEARS", H = "INTERFACE_TASKS_LIST_DETAILS_TIME_ESTIMATE_NUM_DAYS", I = "INTERFACE_TASKS_LIST_DETAILS_TIME_ESTIMATE_ONE_DAY", U = "INTERVAL", B = "MONTHLY", F = "WEEKLY", O = "YEARLY";
	var X = V[U] ? V[U] : 1;
	var W;
	switch (V[R]) {
	case J:
		if (X == 1) {
			return _T(I)
		} else {
			return _T(H, {
				NUM : X
			})
		}
		break;
	case F:
		if (X == 1) {
			return _T(E)
		} else {
			return _T(D, {
				NUM : X
			})
		}
		break;
	case B:
		if (X == 1) {
			return _T(A)
		} else {
			return _T(Q, {
				NUM : X
			})
		}
		break;
	case O:
		if (X == 1) {
			return _T(M)
		} else {
			return _T(K, {
				NUM : X
			})
		}
		break
	}
};
vg.prototype.convertReoccurrenceWeeklyDesc = function(A) {
	var Q = "", R = " ", U = ",", V = ", ", AA = "BYDAY", I = "FR", Z = "INTERFACE_DF_WEEKDAY", AB = "INTERVAL", O = "MO", J = "TH", M = "TU", K = "WE", W = "ja", X = "zh-CN", Y = "zh-TW";
	var H = A[AB] ? A[AB] : 1;
	var F = A[AA].split(U);
	var E = [];
	for ( var D = 0; D < F.length; D++) {
		E.push(Intl.day_wide[Date.ICALDays[F[D]]])
	}
	if (H != 1) {
		H = utility.suffixize(H) + R
	} else {
		H = Q;
		if (E.length == 5) {
			var B = 0;
			for ( var D = 0; D < F.length; D++) {
				if (B == 5) {
					break
				}
				switch (F[D]) {
				case O:
				case M:
				case K:
				case J:
				case I:
					B++;
				default:
				}
			}
			if (B == 5) {
				return _T(Z)
			}
		}
	}
	if (rtmLanguage == Y || (rtmLanguage == X || rtmLanguage == W)) {
		return H + E.join(this.getDayJoin())
	}
	return H + E.join(V)
};
vg.prototype.convertReoccurrenceDayOfMonthDesc = function(A) {
	var M = " ", O = " last ", Y = " of the month", V = " on the ", U = ",", W = ", ", R = "-", Z = "BYDAY", z = "INTERVAL", I = "ja", Q = "last ", X = "month on the ", J = "zh-CN", K = "zh-TW";
	var B = A[z] ? A[z] * 1 : 1;
	var H = 1;
	var F = A[Z].split(U);
	var E = [];
	for ( var D = 0; D < F.length; D++) {
		if (F[D].charAt(0) == R) {
			H = F[D].substring(0, 2) * 1;
			F[D] = F[D].substring(2)
		} else {
			H = F[D].substring(0, 1) * 1;
			F[D] = F[D].substring(1)
		}
		E.push(Intl.day_wide[Date.ICALDays[F[D]]])
	}
	if (H < 0) {
		if (H == -1) {
			H = Q
		} else {
			H = utility.suffixize(H * -1) + O
		}
	} else {
		H = utility.suffixize(H) + M
	}
	if (rtmLanguage == K || (rtmLanguage == J || rtmLanguage == I)) {
		return H + E.join(this.getDayJoin()) + Y
	}
	if (B === 1) {
		return X + H + E.join(W)
	} else {
		return this.convertReoccurrenceSpecDesc(A) + V + H + E.join(W)
	}
};
vg.prototype.convertReoccurrenceYearlyWeekDesc = function(A) {
	var K = " ", H = " in ", M = " last ", R = ",", Q = "-", U = "BYDAY", J = "BYMONTH", O = "last ", I = "year on the ";
	var F = A[U].split(R);
	var E = [];
	for ( var D = 0; D < F.length; D++) {
		if (F[D].charAt(0) == Q) {
			count = F[D].substring(0, 2) * 1;
			F[D] = F[D].substring(2)
		} else {
			count = F[D].substring(0, 1) * 1;
			F[D] = F[D].substring(1)
		}
		E.push(Intl.day_wide[Date.ICALDays[F[D]]])
	}
	if (count < 0) {
		if (count == -1) {
			count = O
		} else {
			count = utility.suffixize(count * -1) + M
		}
	} else {
		count = utility.suffixize(count) + K
	}
	var B = Intl.month_wide[A[J] * 1 - 1];
	return I + count + E.join(K) + H + B
};
vg.RE_DAYJOIN = new RegExp("{DAY_NAME}", "g");
vg.prototype.getDayJoin = function() {
	var A = "", B = "INTERFACE_DF_DAY_NAME_AND_DAY_NAME";
	var D = _T(B);
	D = D.replace(vg.RE_DAYJOIN, A).trim();
	return D
};
vg.prototype.convertReoccurrenceMonthlyDesc = function(A) {
	var H = "", E = ", ", I = "BYMONTHDAY", F = "month on the ";
	var D = A[I];
	var B = D ? D.split(/\,/g) : [ D ];
	B = map(function(K) {
		var J = H + K;
		J = J.trim();
		return utility.suffixize(J)
	}, B);
	return F + B.join(E)
};
vg.prototype.convertReoccurrenceDesc = function(F, K) {
	var AF = ";", AE = "=", Z = "BYDAY", Y = "BYMONTH", U = "BYMONTHDAY", Q = "COUNT", X = "FREQ", AA = "INTERFACE_DF_AFTER_INTERVAL", M = "INTERFACE_DF_EVERY_DAY_NAME_FOR_NUM_TIMES", AC = "INTERFACE_DF_EVERY_DAY_NAME_UNTIL_DATE", AB = "INTERFACE_DF_EVERY_INTERVAL", V = "MONTHLY", AD = "UNTIL", W = "YEARLY";
	var E = F[0];
	var O = F[1];
	var D;
	var H = E.split(AF);
	var R = {};
	for ( var J = 0; J < H.length; J++) {
		var I = H[J].split(AE);
		R[I[0]] = I[1]
	}
	if (Z in R && (Y in R && R[X] === W)) {
		D = this.convertReoccurrenceYearlyWeekDesc(R)
	} else {
		if (is(R[Z])) {
			if (R[X] == V) {
				D = this.convertReoccurrenceDayOfMonthDesc(R)
			} else {
				D = this.convertReoccurrenceWeeklyDesc(R)
			}
		} else {
			if (is(R[U])) {
				D = this.convertReoccurrenceMonthlyDesc(R)
			} else {
				D = this.convertReoccurrenceSpecDesc(R)
			}
		}
	}
	if (O) {
		if (is(R[Q])) {
			return _T(M, {
				DAY_NAME : D,
				NUM : R[Q]
			})
		} else {
			if (is(R[AD])) {
				return _T(AC, {
					DAY_NAME : D,
					DATE : this.formatUntil(R[AD], !!K)
				})
			} else {
				return _T(AB, {
					INTERVAL : D
				})
			}
		}
	} else {
		return _T(AA, {
			INTERVAL : D
		})
	}
};
vg.prototype.formatUntil = function(D, A) {
	var B = Date.fromISO(D);
	var E = !(B.getHours() === 0 && B.getMinutes() === 0);
	if (E) {
		if (A) {
			return dateTimeMgr.getCachedIntlFormat(
					Intl.preferred_formats.due_time_field, B.getTime() / 1000)
		} else {
			return dateTimeMgr.getCachedIntlFormat(
					Intl.preferred_formats.due_time, B.getTime() / 1000)
		}
	} else {
		if (A) {
			return dateTimeMgr.getCachedIntlFormat(
					Intl.preferred_formats.due_field, B.getTime() / 1000)
		} else {
			return dateTimeMgr.getCachedIntlFormat(Intl.preferred_formats.due,
					B.getTime() / 1000)
		}
	}
};
vg.prototype.parseReoccurrence = function(M) {
	var AZ = "$1 of the month", Ac = "2 weeks", Ae = "annually", AO = "biweekly", Ag = "daily", AR = "day_of_month", AY = "each", AX = "every", AL = "every 2 weeks", AV = "every day", V = "every month", Y = "every week", Ad = "every year", AM = "fortnightly", Ab = "mon,tue,wed,thu,fri", AW = "mont", W = "monthly", Ah = "never", AU = "of", Aa = "sat,sun", AP = "spec", AJ = "weekly", Af = "yearly", AT = "yearly_week";
	var O = null;
	if (!M || (M.trim().length == 0 || M.trim() == Ah)) {
		return null
	}
	M = M.toLowerCase();
	if (M.indexOf(Ag) > -1) {
		M = AV
	} else {
		if (M.indexOf(AO) > -1 || M.indexOf(AM) > -1) {
			M = AL
		} else {
			if (M.indexOf(AJ) > -1) {
				M = Y
			} else {
				if (M.indexOf(W) > -1) {
					M = V
				} else {
					if (M.indexOf(Af) > -1 || M.indexOf(Ae) > -1) {
						M = Ad
					}
				}
			}
		}
	}
	M = M.replace(/fortnight/i, Ac);
	M = M.replace(/biweekly/i, Ac);
	M = M.replace(/week\s?day/i, Ab);
	M = M.replace(/week\s?end/i, Aa);
	M = M.replace(/month\s*on\s*the\s*(\S*)$/i, AZ);
	M = M.replace(/month\s*on\s*the\s*(.*)/i, AZ);
	var AF = /(every|after)?\s*(([0-9]+)\s*(january|jan|february|feb|march|mar|april|apr|may|june|jun|july|jul|august|aug|september|sep|october|oct|november|nov|december|dec)\s*([0-9]*))/i;
	var Q = /(every|after)?\s*(?:year\s*on\s*the)?\s*(first|1st|second|2nd|third|3rd|fourth|4th|fifth|5th|last|[1-5])\s*(monday|mon|tuesday|tue|wednesday|wed|thursday|thu|friday|fri|saturday|sat|sunday|sun)\s*in\s*(january|jan|february|feb|march|mar|april|apr|may|june|jun|july|jul|august|aug|september|sep|october|oct|november|nov|december|dec)/i;
	var K = /(every|after)?\s*([0-9]+)(th|st|nd|rd)/i;
	var AS = /(every|after)?\s*((first|1st|second|2nd|third|3rd|fourth|4th|other|last|[1-5])?\s*(monday|mon|tuesday|tue|wednesday|wed|thursday|thu|friday|fri|saturday|sat|sunday|sun))/i;
	var AQ = /(every|after)?\s*((one|two|three|four|five|six|seven|eight|nine|ten|other|[0-9]+)\s*)?(years|year|yrs|yr|months|month|mons|mon|weeks|week|wks|wk|days|day)/i;
	var AK = /(every|after)?\s*(first|1st|second|2nd|third|3rd|fourth|4th|fifth|5th|last|[1-5])(\s*last)?\s*(monday|mon|tuesday|tue|wednesday|wed|thursday|thu|friday|fri|saturday|sat|sunday|sun)/i;
	var AE = /until\s*(.*)+\s*/;
	var J = /for\s*([0-9]+).*/;
	var AD = M;
	var AH = AE.exec(M);
	var Ai = J.exec(M);
	if (AH) {
		M = M.substring(0, M.indexOf(AH[0]));
		AH = dateTimeMgr.parseDueDate(AH[1])
	} else {
		if (Ai) {
			M = M.substring(0, M.indexOf(Ai[0]));
			Ai = Ai[1]
		}
	}
	var I = AF.exec(M);
	var AI = Q.exec(M);
	var AG = K.exec(M);
	var AA = AS.exec(M);
	var Z = AQ.exec(M);
	var X = AK.exec(M);
	var H = M.indexOf(AY) > -1 || M.indexOf(AX) > -1 ? true : false;
	if (H === false) {
		Ai = null;
		AH = null
	}
	var AC = M.indexOf(AW) > -1;
	var AN = M.indexOf(AU) > -1;
	if (AG && AA) {
		if (AC) {
			AA = null;
			if (X) {
				AG = null
			}
		} else {
			X = null;
			AG = null
		}
	}
	if (Z && (AA && !AC)) {
		Z = null
	} else {
		if (Z && (AA && AC)) {
			AA = null
		}
	}
	if (Z && (X && AN)) {
		Z = null
	} else {
		if (Z && (X && !AN)) {
			X = null
		}
	}
	if (AI && Z) {
		Z = null
	}
	if (AI) {
		O = [ AT, AI, AH, Ai, H ]
	} else {
		if (I) {
			O = [ Af, I, AH, Ai, H ]
		} else {
			if (X) {
				var R = M.split(/\s*(?:and|\,)\s*/);
				var U = [];
				U.push(X);
				if (R.length > 1) {
					for ( var AB = 1; AB < R.length; AB++) {
						U.push(AK.exec(R[AB]))
					}
				}
				X = U;
				O = [ AR, X, AH, Ai, H ]
			} else {
				if (AG) {
					var R = M.split(/\s*(?:and|\,)\s*/);
					var U = [];
					U.push(AG);
					if (R.length > 1) {
						for ( var AB = 1; AB < R.length; AB++) {
							U.push(K.exec(R[AB]))
						}
					}
					AG = U;
					O = [ W, AG, AH, Ai, H ]
				} else {
					if (AA) {
						var R = M.split(/\s*(?:and|\,)\s*/);
						var U = [];
						U.push(AA);
						if (R.length > 1) {
							for ( var AB = 1; AB < R.length; AB++) {
								U.push(AS.exec(R[AB]))
							}
						}
						AA = U;
						O = [ AJ, AA, AH, Ai, H ]
					} else {
						if (Z) {
							var R = M.split(/\s*(?:and|\,)\s*/);
							var U = [];
							U.push(Z);
							if (R.length > 1) {
								for ( var AB = 1; AB < R.length; AB++) {
									U.push(AQ.exec(R[AB]))
								}
							}
							Z = U;
							O = [ AP, Z, AH, Ai, H ]
						}
					}
				}
			}
		}
	}
	if (O !== null) {
		O.push(AD)
	}
	return O
};
vg.prototype.convertRrule = function(AB) {
	var f = ",", AZ = ";", AE = "=", AT = "BYDAY", J = "BYMONTH", a = "BYMONTHDAY", AV = "COUNT", H = "DAILY", Af = "FR", AY = "FREQ", AU = "INTERVAL", W = "MO", d = "MONTHLY", Ae = "SA", Aa = "SU", Ah = "TH", Aj = "TU", O = "UNTIL", Ai = "WE", AW = "WEEKLY", AA = "YEARLY", Al = "YYYYmmDDTHHMMSS", i = "c", AS = "day_of_month", AI = "e", AR = "f", e = "h", AN = "i", U = "l", M = "monthly", AL = "n", Q = "o", Z = "r", Ad = "s", AP = "spec", AG = "t", Ak = "undefined", Y = "v", An = "w", AC = "weekly", AD = "yearly_week";
	var j = this.parseReoccurrence(AB);
	if (!j) {
		return null
	}
	var K = j[0];
	var Ag = j[1];
	var AQ = j[2] ? j[2][0].formatUTC(Al) : null;
	var h = j[3];
	var R = j[4];
	var AO = {};
	function X(A) {
		if (typeof A === Ak || A === null) {
			return 1
		}
		var E = parseInt(A, 10);
		if (!isNaN(E)) {
			return E
		}
		A = A.trim().toLowerCase();
		var B = A.charAt(0);
		var D = A.charAt(1);
		if (B === AR) {
			if (D === AN) {
				return 1
			} else {
				if (D === Q) {
					return 4
				}
			}
		} else {
			if (B === AG) {
				return 3
			} else {
				if (B === U) {
					return 4
				} else {
					if (B === Q) {
						return 2
					} else {
						if (B === Ad) {
							if (D === AI) {
								return 2
							}
						}
					}
				}
			}
		}
		return 1
	}
	function AJ(A) {
		var D = {
			mon : W,
			tue : Aj,
			wed : Ai,
			thu : Ah,
			fri : Af,
			sat : Ae,
			sun : Aa
		};
		A = A.trim().toLowerCase();
		for ( var B in D) {
			if (A.indexOf(B) > -1) {
				return D[B]
			}
		}
		return null
	}
	function b(B) {
		var m = null;
		var o = [];
		for ( var k = 0, E = B.length; k < E; k++) {
			var D = B[k], F;
			if (k !== 0 && D[3] === null) {
				F = null
			} else {
				F = D[3] === null ? 1 : D[3];
				F = X(F);
				if (k === 0) {
					m = F
				}
			}
			var A = D[4];
			if (A === null) {
				continue
			}
			A = AJ(A);
			o.push(A)
		}
		AO[AY] = AW;
		AO[AU] = m;
		AO[AT] = o.join(f)
	}
	function AH(B) {
		var A = [];
		map(function(D) {
			var E = X(D);
			A.push(E)
		}, B);
		AO[AY] = d;
		AO[AU] = 1;
		AO[a] = A.join(f)
	}
	function AF(A) {
		if (typeof A === Ak || A === null) {
			return 1
		}
		var F = parseInt(A, 10);
		if (!isNaN(F)) {
			return F
		}
		A = A.trim().toLowerCase();
		var B = A.charAt(0);
		var E = A.charAt(1);
		var D = A.charAt(2);
		if (B === AR) {
			if (E === AN) {
				if (D === Z) {
					return 1
				} else {
					if (D === Y) {
						return 5
					}
				}
			} else {
				if (E === Q) {
					return 4
				}
			}
		} else {
			if (B === AG) {
				if (E === e) {
					return 3
				} else {
					if (E === An) {
						return 2
					} else {
						if (E === AI) {
							return 10
						}
					}
				}
			} else {
				if (B === U) {
					return 4
				} else {
					if (B === Q) {
						if (E === AG) {
							return 2
						} else {
							if (E === AL) {
								return 1
							}
						}
					} else {
						if (B === Ad) {
							if (E === AN) {
								return 6
							} else {
								if (E === AI) {
									if (D === i) {
										return 2
									} else {
										if (D === Y) {
											return 7
										}
									}
								}
							}
						} else {
							if (B === AI) {
								return 8
							} else {
								if (B === AL) {
									return 9
								}
							}
						}
					}
				}
			}
		}
		return 1
	}
	function V(B) {
		B = B[0];
		var A = B[1];
		var D = B[3] === null ? 1 : B[3];
		var k = B[4].trim().toLowerCase();
		var F = k.charAt(0);
		var E = {
			d : H,
			w : AW,
			m : d,
			y : AA
		};
		if (F in E) {
			k = E[F]
		}
		AO[AY] = k;
		AO[AU] = AF(D)
	}
	function AX(A) {
		if (typeof A === Ak || A === null) {
			return 1
		}
		var E = parseInt(A, 10);
		if (!isNaN(E)) {
			return E
		}
		A = A.trim().toLowerCase();
		var B = A.charAt(0);
		var D = A.charAt(1);
		if (B === AR) {
			if (D === AN) {
				return 1
			} else {
				if (D === Q) {
					return 4
				}
			}
		} else {
			if (B === AG) {
				return 3
			} else {
				if (B === U) {
					return -1
				} else {
					if (B === Q) {
						return 2
					} else {
						if (B === Ad) {
							if (D === AI) {
								return 2
							}
						}
					}
				}
			}
		}
		return 1
	}
	function Ac(B) {
		var m = null;
		var o = [];
		for ( var k = 0, E = B.length; k < E; k++) {
			var D = B[k], F;
			if (k !== 0 && D[2] === null) {
				F = null
			} else {
				F = D[2] === null ? 1 : D[2];
				F = AX(F);
				if (k === 0) {
					m = F
				}
			}
			var A = D[4];
			if (A === null) {
				continue
			}
			A = AJ(A);
			if (D[3] !== null) {
				A = m * -1 + A
			} else {
				A = m + A
			}
			o.push(A)
		}
		AO[AY] = d;
		AO[AU] = 1;
		AO[AT] = o.join(f)
	}
	var Ao = {
		JAN : 1,
		FEB : 2,
		MAR : 3,
		APR : 4,
		MAY : 5,
		JUN : 6,
		JUL : 7,
		AUG : 8,
		SEP : 9,
		OCT : 10,
		NOV : 11,
		DEC : 12
	};
	function Am(B) {
		var A, k;
		var E = AX(B[2]);
		var F = AJ(B[3]);
		A = E + F;
		var D = B[4].substring(0, 3).toUpperCase();
		k = D in Ao ? Ao[D] * 1 : 1;
		AO[AY] = AA;
		AO[AU] = 1;
		AO[AT] = A;
		AO[J] = k
	}
	switch (K) {
	case AP:
		V(Ag);
		break;
	case AC:
		b(Ag);
		break;
	case M:
		AH(Ag);
		break;
	case AS:
		Ac(Ag);
		break;
	case AD:
		Am(Ag);
		break
	}
	if (AQ) {
		AO[O] = AQ
	}
	if (h) {
		AO[AV] = h
	}
	var AM = [];
	for ( var AK in AO) {
		AM.push(AK + AE + AO[AK])
	}
	var I = AM.join(AZ);
	if (K === AP || (K === AC || (K === M || (K === AS || K === AD)))) {
		return [ I, R ? 1 : 0 ]
	}
	return null
};
if (typeof globalScope !== "undefined") {
	globalScope.ReoccurrenceManager = vg
}
function yg() {
}
yg.button_ = null;
yg.list_ = null;
yg.initialized_ = false;
yg.list_state_ = 0;
yg.button_clicked_ = false;
yg.initialize = function() {
	var B = "sort-button", D = "sort-list", A = "table";
	this.button_ = el(B);
	this.button_table_ = this.button_
			&& this.button_.getElementsByTagName(A)[0];
	this.list_ = el(D);
	this.list_table_ = this.list_ && this.list_.getElementsByTagName(A)[0];
	this.bindEvents();
	this.initialized_ = true
};
yg.isInitialized = function() {
	return this.initialized_
};
yg.show = function() {
	var A = "visible";
	if (this.isInitialized()) {
		this.button_.style.visibility = A
	}
};
yg.hide = function() {
	var A = "hidden";
	if (this.isInitialized()) {
		this.button_.style.visibility = A;
		this.display(false)
	}
};
yg.bindEvents = function() {
	var E = "click", I = "hover", F = "mousedown", A = "mouseenter", H = "mouseleave";
	if (is_ie6) {
		GEvent.addDomListener(this.button_, A, function(J) {
			Utility.addClass(yg.button_table_, I)
		});
		GEvent.addDomListener(this.button_, H, function(J) {
			if (yg.list_state_ === 0) {
				Utility.removeClass(yg.button_table_, I)
			}
		})
	}
	GEvent.addDomListener(this.button_, F, function(J) {
		if (is_ie) {
			yg.button_clicked_ = true;
			window.setTimeout(function() {
				yg.button_clicked_ = false
			}, 0)
		}
		yg.onButtonClick();
		Utility.stopPropagation(J);
		return false
	});
	GEvent.addDomListener(this.button_, E, function(J) {
		Utility.stopPropagation(J);
		return false
	});
	GEvent.addDomListener(document, E, function(J) {
		if (!is_ie || is_ie && yg.button_clicked_ === false) {
			yg.display(false)
		}
		if (is_ie) {
			yg.button_clicked_ = false
		}
	});
	if (this.list_table_) {
		var B = this.list_table_.rows.length;
		for ( var D = 0; D < B; D++) {
			this.list_table_.rows[D].rtm_type = yg.SORT_LIST[D];
			GEvent.addDomListener(this.list_table_.rows[D], F, function(J) {
				yg.changeSort(this.rtm_type);
				Utility.stopPropagation(J);
				return false
			});
			if (is_ie6) {
				GEvent.addDomListener(this.list_table_.rows[D], A, function(J) {
					Utility.addClass(this, I)
				});
				GEvent.addDomListener(this.list_table_.rows[D], H, function(J) {
					Utility.removeClass(this, I)
				})
			}
		}
	}
};
yg.L = function(A) {
	var B = "SortList: ";
	dbg(B + A)
};
yg.onButtonClick = function() {
	if (this.isDisplayed()) {
		this.display(false)
	} else {
		this.display(true)
	}
};
yg.display = function(D) {
	var H = "", B = "hover", F = "none", A = "px";
	if (!this.isInitialized()) {
		return false
	}
	if (D) {
		Utility.addClass(this.button_table_, B);
		var E = Autocomplete.findPosition(this.button_);
		this.list_.style.left = E[0] - 2 + A;
		this.list_.style.top = E[1]
				+ (this.button_.clientHeight || this.button_.scrollHeight) - 2
				+ A;
		this.list_.style.display = H;
		this.list_state_ = 1
	} else {
		if (this.list_state_ === 1) {
			Utility.removeClass(this.button_table_, B);
			this.list_.style.display = F;
			this.list_state_ = 0
		}
	}
};
yg.isDisplayed = function() {
	return this.list_state_ === 1
};
yg.SORT_LIST = [ "prio", "due", "name" ];
yg.SORT_MAP = {
	prio : 0,
	due : 1,
	name : 2
};
yg.reflectCheck = function(D) {
	var A = "sortchk_on", B = "td";
	if (!this.isInitialized()) {
		return false
	}
	var F = this.list_table_.rows.length;
	var E = yg.SORT_MAP[D];
	Utility.addClass(this.list_table_.rows[E].getElementsByTagName(B)[0], A);
	for ( var H = 0; H < F; H++) {
		if (H !== E) {
			Utility.removeClass(this.list_table_.rows[H]
					.getElementsByTagName(B)[0], A)
		}
	}
};
yg.changeSort = function(E) {
	var B = "lists.setSortOrder";
	if (!this.isInitialized()) {
		return false
	}
	this.display(false);
	var A = null;
	if (stateMgr.currentList !== null) {
		A = stateMgr.currentList * 1;
		var D = yg.SORT_MAP[E];
		if (stateMgr.lists[A].sort_order === D) {
			return false
		}
	}
	this.reflectCheck(E);
	taskList.resort(E);
	if (A !== null) {
		stateMgr.updateList(A, {
			sort_order : D
		});
		transMgr.request(B, Utility.toJSON( {
			list_id : A,
			sort_order : D
		}))
	}
};
if (typeof globalScope !== "undefined") {
	globalScope.SortList = yg
}
function wg(D, J, I, A, B, E, F, H) {
	var K = " ";
	this.id_ = D;
	this.el_ = el(D);
	this.box_id_ = J;
	this.box_el_ = el(J);
	this.ghost_id_ = I;
	this.ghost_el_ = el(I);
	this.spinner_id_ = A;
	this.spinner_el_ = el(A);
	this.label_id_ = B;
	this.label_el_ = el(B);
	this.help_id_ = E;
	this.help_el_ = el(E);
	this.help_icon_id_ = F;
	this.help_icon_el_ = el(F);
	this.help_close_id_ = H;
	this.help_close_el_ = el(H);
	this.has_focus_ = false;
	this.is_busy_ = false;
	this.autocomplete_ = null;
	this.initialized_ = false;
	this.shown_ = false;
	this.has_ghost_width_ = false;
	this.disabled_ = false;
	this.label_display_ = true;
	this.label_width_ = null;
	this.help_display_ = false;
	this.store_last_token_ = null;
	this.extraChar = K;
	this.has_id_ = null
}
wg.INSTANCE = null;
wg.getInstance = function() {
	var A = "add-box", J = "add-ghost", E = "add-helpicon", H = "add-label", I = "add-spinner", B = "add-text", F = "smartadd-cheat", D = "smartadd-keyclose";
	if (wg.INSTANCE === null) {
		wg.INSTANCE = new wg(B, A, J, I, H, F, E, D);
		wg.initializeAutocomplete();
		wg.INSTANCE.initialize()
	}
	return wg.INSTANCE
};
wg.initializeAutocomplete = function() {
	var Q = "1", E = "1 hr", M = "10 min", I = "15 min", K = "2", AD = "2 min", J = "3", H = "30 min", F = "45 min", AC = "5 min", X = "FREQ=DAILY;INTERVAL=1", U = "FREQ=MONTHLY;INTERVAL=1", W = "FREQ=WEEKLY;INTERVAL=1", V = "FREQ=WEEKLY;INTERVAL=2", R = "FREQ=YEARLY;INTERVAL=1", AB = "biweekly", D = "daily", O = "en-GB", AA = "fortnightly", Z = "monthly", B = "weekly", Y = "yearly";
	if (RTM.isEnglish()) {
		wg.AUTO_ESTIMATES = [ AD, AC, M, I, H, F, E ]
	} else {
		wg.AUTO_ESTIMATES = [ rg.getInstance().formatTimeEstimate(2),
				rg.getInstance().formatTimeEstimate(5),
				rg.getInstance().formatTimeEstimate(10),
				rg.getInstance().formatTimeEstimate(15),
				rg.getInstance().formatTimeEstimate(30),
				rg.getInstance().formatTimeEstimate(45),
				rg.getInstance().formatTimeEstimate(60) ]
	}
	if (RTM.isEnglish()) {
		wg.AUTO_REPEATS = [ D, B, rtmLanguage !== O ? AB : AA, Z, Y,
				vg.getInstance().convertReoccurrenceDesc( [ X, false ]),
				vg.getInstance().convertReoccurrenceDesc( [ W, false ]),
				vg.getInstance().convertReoccurrenceDesc( [ V, false ]),
				vg.getInstance().convertReoccurrenceDesc( [ U, false ]),
				vg.getInstance().convertReoccurrenceDesc( [ R, false ]) ]
	} else {
		wg.AUTO_REPEATS = [
				vg.getInstance().convertReoccurrenceDesc( [ X, true ]),
				vg.getInstance().convertReoccurrenceDesc( [ W, true ]),
				vg.getInstance().convertReoccurrenceDesc( [ V, true ]),
				vg.getInstance().convertReoccurrenceDesc( [ U, true ]),
				vg.getInstance().convertReoccurrenceDesc( [ R, true ]),
				vg.getInstance().convertReoccurrenceDesc( [ X, false ]),
				vg.getInstance().convertReoccurrenceDesc( [ W, false ]),
				vg.getInstance().convertReoccurrenceDesc( [ V, false ]),
				vg.getInstance().convertReoccurrenceDesc( [ U, false ]),
				vg.getInstance().convertReoccurrenceDesc( [ R, false ]) ]
	}
	wg.AUTO_DUE = rg.getInstance().getAutocompletions();
	wg.AUTO_PRIOS = [ Q, K, J ]
};
wg.prototype.initialize = function() {
	var A = "initialize";
	this.log(A);
	this.enableAutoComplete();
	this.bindEvents();
	this.highlightBox(false);
	this.initialized_ = true
};
wg.prototype.disable = function(A) {
	var B = "disabled";
	if (this.disabled_ === A) {
		return
	}
	if (A) {
		Utility.addClass(this.el_, B)
	} else {
		Utility.removeClass(this.el_, B)
	}
	this.el_.disabled = A;
	this.disabled_ = A
};
wg.prototype.display = function(D) {
	var B = "display = ", A = "hidden";
	if (this.shown_ === D) {
		return
	}
	this.log(B + D);
	if (D) {
		Utility.removeClass(this.box_el_, A);
		if (this.label_width_ === null || this.label_width_ === 0) {
			this.setLabelWidth()
		}
	} else {
		this.hideHelp();
		Utility.addClass(this.box_el_, A)
	}
	this.shown_ = D
};
wg.prototype.busy = function(D) {
	var B = "busy = ", A = "hidden";
	if (this.is_busy_ === D) {
		return
	}
	this.log(B + D);
	if (D) {
		Utility.removeClass(this.spinner_el_, A)
	} else {
		Utility.addClass(this.spinner_el_, A)
	}
	this.is_busy_ = D;
	if (!D) {
		this.displayLabel(true)
	} else {
		this.displayLabel(false)
	}
};
wg.prototype.enableAutoComplete = function() {
	var A = this;
	this.autocomplete_ = new Autocomplete(this.id_, this);
	this.autocomplete_.setField( {
		_handle_keypress : function(D, B) {
			A.onKeyPress(D, B)
		},
		_handle_keydown : function(B) {
			A.onKeyDown(B)
		}
	})
};
wg.prototype.bindEvents = function() {
	var A = "bindEvents", E = "blur", J = "click", F = "focus", I = "help icon clicked", H = "help icon close clicked";
	this.log(A);
	var D = GEvent.addDomListener;
	var B = this;
	D(this.help_icon_el_, J, function(K) {
		B.log(I);
		B.showHelp();
		Utility.stopPropagation(K);
		return false
	});
	D(this.help_close_el_, J, function(K) {
		B.log(H);
		B.hideHelp()
	});
	D(this.el_, F, function(K) {
		B.onFocus()
	});
	D(this.el_, E, function(K) {
		B.onBlur()
	});
	D(this.box_el_, J, function(K) {
		B.onBoxClick(K)
	})
};
wg.prototype.highlightBox = function(A) {
	var B = "highlight";
	if (A) {
		Utility.addClass(this.box_el_, B)
	} else {
		Utility.removeClass(this.box_el_, B)
	}
};
wg.prototype.log = function(D) {
	var E = "[SmartAdd] ", B = "console", A = "log";
	return;
	if (B in window && A in window.console) {
		console.log(E + D)
	}
};
wg.prototype.onBoxClick = function(E) {
	var A = "input", B = "onBoxClick", F = "onBoxClick: target was input";
	this.log(B);
	var D = Utility.getEventTarget(E);
	if (D === null || D.type === A) {
		this.log(F);
		return false
	}
	if (!this.has_focus_) {
		this.el_.focus()
	}
};
wg.prototype.setLabelWidth = function(D) {
	var B = "px", A = "setLabelWidth = ";
	if (D || (this.label_width_ === null || this.label_width_ === 0)) {
		if (!D) {
			this.label_width_ = this.label_el_.offsetWidth
		}
		if (this.label_width_) {
			this.label_el_.parentNode.parentNode.style.width = this.label_width_
					+ 20 + B
		}
	}
	this.log(A + this.label_width_)
};
wg.prototype.displayLabel = function(D) {
	var E = "30px", A = "displayLabel = ", B = "displayLabel while waiting for add/fail", F = "hidden";
	if (D && this.has_id_ !== null) {
		this.log(B);
		return 

	}
	if (this.label_display_ === D) {
		return
	}
	this.log(A + D);
	if (D) {
		Utility.removeClass(this.label_el_, F);
		this.setLabelWidth(true)
	} else {
		Utility.addClass(this.label_el_, F);
		this.label_el_.parentNode.parentNode.style.width = E
	}
	this.label_display_ = D
};
wg.prototype.onFocus = function() {
	var A = "onFocus";
	this.log(A);
	this.has_focus_ = true;
	this.highlightBox(true);
	this.displayLabel(false)
};
wg.prototype.onBlur = function() {
	var A = "onBlur";
	this.log(A);
	this.has_focus_ = false;
	this.highlightBox(false);
	if (!this.is_busy_) {
		this.displayLabel(true)
	}
};
wg.prototype.onKeyDown = function(A) {
	var B = "";
	var D = A.charCode ? A.charCode : A.which ? A.which : A.keyCode;
	if (D === 27) {
		this.el_.value = B;
		this.blur()
	}
};
wg.prototype.onKeyPress = function(I, E) {
	var J = "", A = ", value = ", B = "onKeyPress: ev = ";
	var F = I.charCode ? I.charCode : I.which ? I.which : I.keyCode;
	if (F === 13) {
		this.log(B + I.keyCode + A + this.el_.value);
		var D = this.el_.value;
		if (D) {
			D = D.trim();
			if (D.length === 0) {
				D = null
			}
		} else {
			D = null
		}
		if (D === null) {
			return
		}
		var H = hex_sha1(J
				+ (transMgr.getRandomInt(600673) + (new Date()).getTime()));
		this.has_id_ = H;
		wg.getInstance().blur();
		wg.getInstance().disable(true);
		wg.getInstance().busy(true);
		setTimeout(function() {
			control.handleSmartAdd(D, H)
		}, 0)
	} else {
		if (E) {
			setTimeout(function() {
				wg.getInstance().blur()
			}, 0)
		}
	}
};
wg.AUTO_ESTIMATES = [];
wg.AUTO_REPEATS = [];
wg.AUTO_DUE = [];
wg.AUTO_PRIOS = [];
wg.prototype.getCompletions = function(A2) {
	var Ay = " ", Au = "!", At = "!1", As = "!2", Ar = "!3", Ak = "#", Ad = "*", Al = ", token_text = ", Aq = "=", Af = "@", Ap = "^", Ah = "_", AX = "biweekly", Aa = "daily", Ax = "fortnightly", Az = "getCompletions: text = ", An = "getCompletions: tokens = ", Ao = "last_token = ", Aw = "monthly", AZ = "weekly", Av = "yearly";
	this.log(Az + A2);
	if (!A2 || !view.isNewUI()) {
		return []
	}
	var AY = A2.charAt(A2.length - 1);
	if (AY === Ay) {
		this.store_last_token_ = null;
		return []
	}
	this.has_ghost_width_ = false;
	var AV = tg.tokenize(A2, false);
	this.log(An + Utility.toJSON(AV));
	if (AV.length > 0) {
		var AD = null;
		var Y = null;
		var Z = null;
		var AB = null;
		var AO = false;
		var U = false;
		var A0 = false;
		var AA = false;
		var Q = false;
		var AM = false;
		var AJ = false;
		var Ai = {}, Ae = {};
		if (AV.length > 1) {
			for ( var AW = 0, K = AV.length - 1; AW < K; AW++) {
				var AT = AV[AW][0];
				var AH = AT.charAt(0);
				if (AT.length > 1) {
					if (AH === Ak) {
						var Ac = Ah + AT.substring(1).toLowerCase();
						if (AD === null) {
							AD = stateMgr.getListsForMagicParse()
						}
						if (!AO && Ac in AD) {
							AO = true
						}
						Ai[Ac] = 1
					} else {
						if (AH === Af) {
							var AL = Ah + AT.substring(1).toLowerCase();
							if (Z === null) {
								loc_data = locationMgr
										.getLocationsForMagicParse();
								Z = loc_data[0];
								AB = loc_data[1]
							}
							if (!U && AL in Z) {
								U = true
							}
							Ae[AL] = 1
						} else {
							if (AH === Ad) {
								var Ag = AT.substring(1).toLowerCase();
								if (Ag === Aa
										|| (Ag === AZ || (Ag === AX || (Ag === Ax || (Ag === Aw || Ag === Av))))) {
									A0 = true
								}
							} else {
								if (AH === Au && AT.length === 2) {
									if (AT === At || (AT === As || AT === Ar)) {
										AA = true
									}
								} else {
									if (AH === Aq && AT.length > 1) {
										Q = true
									} else {
										if (AH === Ap && AT.length > 1) {
											AM = true
										}
									}
								}
							}
						}
					}
				}
			}
		}
		var M = AV[AV.length - 1];
		var I = M[0];
		var AG = I.length;
		var AH = I.charAt(0);
		var AF = [];
		var W = null;
		this.log(Ao + Utility.toJSON(M) + Al + I);
		this.store_last_token_ = M;
		if (AH === Ak) {
			if (AD === null) {
				AD = stateMgr.getListsForMagicParse()
			}
			if (Y === null) {
				Y = tagMgr.index
			}
			if (AG === 1) {
				var AE = [];
				if (!AO) {
					for ( var Aj in AD) {
						if (Aj in Ai) {
							continue
						}
						var R = stateMgr.lists[AD[Aj]];
						AF.push( [ R.name, R.name, false ])
					}
				}
				for ( var AR in Y) {
					var AN = Ah + AR.toLowerCase();
					if (AN in Ai || AN in AD) {
						continue
					}
					AE.push(AR)
				}
				var J = AF.length > 0;
				AE.sort();
				for ( var AW = 0, K = AE.length; AW < K; AW++) {
					AF.push( [ AE[AW], AE[AW], J && AW === 0 ])
				}
			} else {
				W = I.substring(1).toLowerCase();
				if (!AO) {
					for ( var Aj in AD) {
						if (Aj in Ai) {
							continue
						}
						var O = Aj.substring(1).toLowerCase();
						if (O.indexOf(W) === 0) {
							var R = stateMgr.lists[AD[Aj]];
							AF.push( [ R.name, R.name, false ])
						}
					}
				}
				var AE = [];
				for ( var AR in Y) {
					var AN = AR.toLowerCase();
					var AI = Ah + AN;
					if (AI in Ai || AI in AD) {
						continue
					}
					if (AN.indexOf(W) === 0) {
						AE.push(AR)
					}
				}
				var J = AF.length > 0;
				AE.sort();
				for ( var AW = 0, K = AE.length; AW < K; AW++) {
					AF.push( [ AE[AW], AE[AW], J && AW === 0 ])
				}
			}
		} else {
			if (AH === Af) {
				if (Z === null) {
					loc_data = locationMgr.getLocationsForMagicParse();
					Z = loc_data[0];
					AB = loc_data[1]
				}
				if (!U) {
					if (AG === 1) {
						for ( var AW = 0, K = AB.length; AW < K; AW++) {
							var V = AB[AW];
							if (V in Ae) {
								continue
							}
							var AP = locationMgr.locations_[Z[V]];
							AF.push( [ AP.name, AP.name, false ])
						}
					} else {
						W = I.substring(1).toLowerCase();
						for ( var AW = 0, K = AB.length; AW < K; AW++) {
							var V = AB[AW];
							if (V in Ae) {
								continue
							}
							var O = V.substring(1).toLowerCase();
							if (O.indexOf(W) === 0) {
								var AP = locationMgr.locations_[Z[V]];
								AF.push( [ AP.name, AP.name, false ])
							}
						}
					}
				}
			} else {
				if (!A0 && AH === Ad) {
					var AS = wg.AUTO_REPEATS;
					if (AG === 1) {
						for ( var AW = 0, K = AS.length; AW < K; AW++) {
							var AQ = AS[AW];
							AF.push( [ AQ, AQ, AW == 5 ])
						}
					} else {
						W = I.substring(1).toLowerCase();
						for ( var AW = 0, K = AS.length; AW < K; AW++) {
							var AQ = AS[AW];
							if (AQ.toLowerCase().indexOf(W) === 0) {
								AF.push( [ AQ, AQ, AW == 5 ])
							}
						}
					}
				} else {
					if (!Q && AH === Aq) {
						var AC = wg.AUTO_ESTIMATES;
						if (AG === 1) {
							for ( var AW = 0, K = AC.length; AW < K; AW++) {
								var AU = AC[AW];
								AF.push( [ AU, AU, false ])
							}
						} else {
							W = I.substring(1).toLowerCase();
							for ( var AW = 0, K = AC.length; AW < K; AW++) {
								var AU = AC[AW];
								if (AU.toLowerCase().indexOf(W) === 0) {
									AF.push( [ AU, AU, false ])
								}
							}
						}
					} else {
						if (!AA && AH === Au) {
							var AJ = true;
							var A1 = wg.AUTO_PRIOS;
							if (AG === 1) {
								for ( var AW = 0, K = A1.length; AW < K; AW++) {
									var Am = A1[AW];
									AF.push( [ Am, Am, Am * 1 ])
								}
							} else {
								if (AG === 2) {
									W = I.substring(1).toLowerCase();
									for ( var AW = 0, K = A1.length; AW < K; AW++) {
										var Am = A1[AW];
										if (Am === W) {
											AF.push( [ Am, Am, Am * 1 ])
										}
									}
								}
							}
						} else {
							if (!AM && AH === Ap) {
								var X = wg.AUTO_DUE;
								if (AG === 1) {
									for ( var AW = 0, K = X.length; AW < K; AW++) {
										var H = X[AW];
										AF.push( [ H, H, false ])
									}
								} else {
									W = I.substring(1).toLowerCase();
									for ( var AW = 0, K = X.length; AW < K; AW++) {
										var H = X[AW];
										if (H.toLowerCase().indexOf(W) === 0) {
											AF.push( [ H, H, false ])
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (AF.length > 0) {
			if (W === null) {
				this.ghost_el_.innerHTML = A2;
				this.has_ghost_width_ = true;
				return AF
			} else {
				var AK = A2.toLowerCase().lastIndexOf(W.toLowerCase());
				this.ghost_el_.innerHTML = A2.substring(0, AK);
				this.has_ghost_width_ = true;
				if (!AJ) {
					return this.formatCompletions(AF, W)
				} else {
					return AF
				}
			}
		}
	}
	return []
};
wg.prototype.getGhostWidth = function() {
	if (!this.has_ghost_width_) {
		return 0
	}
	return this.ghost_el_.clientWidth
};
wg.prototype.isExtending = function() {
	return true
};
wg.prototype.getLastStem = function() {
	var A = "";
	if (this.store_last_token_ !== null) {
		return this.store_last_token_[0]
	}
	return A
};
wg.prototype.getPrependChar = function() {
	var A = "!", H = "#", I = "*", J = "=", F = "@", B = "^";
	if (this.store_last_token_ !== null) {
		var D = this.store_last_token_[0];
		var E = D.charAt(0);
		if (E === B
				|| (E === A || (E === J || (E === I || (E === H || E === F))))) {
			return E
		}
	}
	return null
};
wg.prototype.formatCompletions = function(I, D) {
	var A = "</b>", B = "<b>";
	var E = [];
	for ( var H = 0, F = I.length; H < F; H++) {
		var J = I[H][0];
		E.push( [ J, B + J.substring(0, D.length) + A + J.substring(D.length),
				I[H][2] ])
	}
	return E
};
wg.prototype.onAddSuccess = function(A) {
	this.reset();
	this.busy(false);
	this.has_id_ = null
};
wg.prototype.onAddRetry = function() {
	this.has_id_ = true;
	wg.getInstance().blur();
	wg.getInstance().disable(true);
	wg.getInstance().busy(true)
};
wg.prototype.onAddFailure = function(A) {
	this.busy(false);
	this.disable(false);
	this.focus();
	this.has_id_ = null
};
wg.prototype.reset = function() {
	var B = "";
	this.el_.value = B;
	this.disable(false);
	if (view.isNewUI()) {
		if (this.autocomplete_) {
			this.autocomplete_.reset()
		}
		var A = this;
		setTimeout(function() {
			A.el_.focus()
		}, is_ie6 ? 200 : 0)
	}
};
wg.prototype.focus = function() {
	var A = "focus";
	if (A in this.el_) {
		this.el_.focus()
	}
};
wg.prototype.blur = function() {
	var A = "blur";
	if (A in this.el_) {
		this.el_.blur()
	}
	if (this.autocomplete_) {
		this.autocomplete_.complete(null)
	}
};
wg.prototype.repositionHelp = function() {
	var B = "px";
	var D = Autocomplete.findPosition(this.help_icon_el_);
	var A = is_gecko && is_mac;
	this.help_el_.style.top = D[1] - (!A ? 6 : 7) + B;
	this.help_el_.style.left = D[0] - 7 + B
};
wg.prototype.showHelp = function() {
	var A = "hidden";
	if (!this.help_display_) {
		this.repositionHelp();
		Utility.removeClass(this.help_el_, A);
		this.help_display_ = true
	}
};
wg.prototype.hideHelp = function() {
	var A = "hidden";
	if (this.help_display_) {
		Utility.addClass(this.help_el_, A);
		this.help_display_ = false
	}
};
wg.prototype.onWindowResize = function() {
	if (this.help_display_) {
		this.repositionHelp()
	}
};
if (typeof globalScope !== "undefined") {
	globalScope.SmartAdd = wg
}
function tg() {
}
tg.DEBUG = false;
tg.TOKEN_DEBUG = false;
tg.DATE_DEBUG = false;
tg.PRINT_TOKENS = false;
tg.PRINT_DECISION = false;
tg.DAY_RE = new RegExp(
		"^(monday|mon|tuesday|tues|tue|wednesday|wed|thursday|thurs|thur|thu|friday|fri|saturday|sat|sunday|sun)$");
tg.MONTH_RE = new RegExp(
		"(january|^jan$|february|^feb$|march|^mar$|april|^apr$|may|june|^jun$|july|^jul$|august|^aug$|september|^sept$|^sep$|october|^oct$|november|^nov$|december|^dec$)");
tg.UNIT_RE = new RegExp(
		"(years|year|yrs|yr|months|month|^mons$|^mon$|weeks|week|wks|wk|^days$|^day$|hours|hour|^hrs$|^hr$|minutes|minute|^mins$|^min$)");
tg.RELATIVE_RE = new RegExp(
		"^(today$|yesterday$|tomorrow$|tomrrow$|tomm?or[^s]+$|tod$|tom$|now$)");
tg.NUMERIC_RE = new RegExp("^([0-9]+)(?:[^0-9ap])?$");
tg.NUMERIC_TEXT_RE = new RegExp(
		"^(one|two|three|four|five|six|seven|eight|nine|ten|eleven|twelve|thirteen|fourteen|fifteen|sixteen|seventeen|eighteen|nineteen|twenty)$");
tg.NUMERIC_ORD_RE = new RegExp("([0-9]+)(st|nd|rd|th)");
tg.DAY_PERIOD_RE = new RegExp(
		"([0-9]{1,2}([\\.\\:]?[0-9]{1,2})?)?((?:[ap]\\.?m\\.?)|(?:o'clock)|(?:[ap]$))",
		"g");
tg.TIME_RE = new RegExp(
		"(^(?:(?:\\@)?([0-9]{1,2})(?:[\\.\\:h])([0-9]{1,2})(?:[^0-9])?)$|^noon$|^midday$|^midnight$|^fortnight$)");
tg.NEXT_RE = new RegExp("^(next|this|last)$");
tg.DATE_RE = new RegExp(
		"^(([0-9]{1,4})(?:[-/\\.\u5E74\u6708\u65E5])(?:([0-9]{1,2})$|([0-9]{1,2})((?:\\-|\\/|\\.|\u5E74|\u6708|\u65E5)+([0-9]{1,4})?)))");
tg.URL_RE = new RegExp("^([\\w\\.+-]+://([^\\s<>'\"]+))$");
tg.URL_HACK_RE = new RegExp("\\s+([\\w\\.+-]+://([^\\s<>'\"]+))");
tg.SENTINELS = {
	"in" : 1,
	on : 1,
	"on the" : 1,
	at : 1,
	"@" : 1,
	by : 1,
	"\xE0" : 1,
	"a las" : 1,
	the : 1,
	"the at" : 1,
	"." : 1,
	due : 1,
	"for" : 1,
	"-" : 1,
	"\xE0s" : 1
};
tg.TOKEN_POS_SORT = function(A, E) {
	var B = "position";
	var F = A[B] * 1;
	var D = E[B] * 1;
	if (F == D) {
		return 0
	} else {
		if (F < D) {
			return -1
		} else {
			return 1
		}
	}
};
tg.parse = function(H) {
	var Q = "~";
	var B = tg.tokenize;
	var O = tg.annotate;
	var I = tg.find_name_and_date;
	var K = tg.clean_name_and_parse_date;
	if (H === null) {
		return null
	}
	var F = H.trim();
	if (F.length > 0 && F.charAt(0) === Q) {
		if (F.length > 1) {
			F = F.substring(1)
		}
		return [ H, K(F, [ null, [ [], [] ] ], []), [] ]
	} else {
		var D = B(H, true);
		var A = D[0];
		var J = D[1];
		var M = O(A, J);
		var E = I(M[0]);
		return [ H, K(H, E, M[1]), M[1] ]
	}
};
tg._matches = function(B, A) {
	return B.test(A)
};
tg._findAll = function(F, D) {
	var H = F.exec(D);
	if (H && H[0] != undefined) {
		var E = [];
		for ( var B = 1, A = H.length; B < A; B++) {
			E.push(H[B])
		}
		return E
	} else {
		return null
	}
};
tg._findAllWithMultiple = function(F, D) {
	var H = [];
	while ((match = F.exec(D)) && match[0] != undefined) {
		var E = [];
		for ( var B = 1, A = match.length; B < A; B++) {
			E.push(match[B])
		}
		H.push(E)
	}
	if (H.length == 0) {
		return null
	}
	return H
};
tg._toInt = function(A) {
	var I = "", K = "0", J = "9";
	var B = [];
	for ( var F = 0, E = A.length; F < E; F++) {
		var H = A.charAt(F);
		if (H >= K && H <= J) {
			B.push(H)
		}
	}
	if (B.length == 0) {
		return 1
	}
	try {
		var D = parseInt(B.join(I), 10);
		if (isNaN(D)) {
			return -1
		}
		return D
	} catch (M) {
		return -1
	}
};
tg.HT = String.fromCharCode(9);
tg.LF = String.fromCharCode(10);
tg.VT = String.fromCharCode(11);
tg.FF = String.fromCharCode(12);
tg.CR = String.fromCharCode(13);
tg.SQ = String.fromCharCode(39);
tg.SB = String.fromCharCode(92);
tg.SPACE = " ";
tg.IDEOGRAPHIC_SPACE = "\u3000";
tg._isWhiteSpace = function(A) {
	if (A === tg.HT
			|| (A === tg.LF || (A === tg.VT || (A === tg.FF || (A === tg.CR || (A === tg.SPACE || A === tg.IDEOGRAPHIC_SPACE)))))) {
		return true
	} else {
		return false
	}
};
tg._isNumeric = function(D) {
	var B = "0", A = "9";
	for ( var F = 0, E = D.length; F < E; F++) {
		var H = D.charAt(F);
		if (!(H >= B && H <= A)) {
			return false
		}
	}
	return true
};
tg._lstrip = function(D, F) {
	var B = tg._isWhiteSpace;
	var A = D.length;
	var E = 0;
	if (F == null) {
		while (E < A && B(D.charAt(E))) {
			E++
		}
	} else {
		while (E < A && F.indexOf(D.charAt(E)) >= 0) {
			E++
		}
	}
	return E > 0 ? D.substring(E, A) : D
};
tg._rstrip = function(D, E) {
	var A = tg._isWhiteSpace;
	var F = D.length;
	var B = F - 1;
	if (E == null) {
		while (B >= 0 && A(D.charAt(B))) {
			B--
		}
	} else {
		while (B >= 0 && E.indexOf(D.charAt(B)) >= 0) {
			B--
		}
	}
	return B < F - 1 ? D.substring(0, B + 1) : D
};
tg._makeClearTime = function(E) {
	var B = "00", A = ":";
	var D = E.length;
	if (D == 1 || D == 2) {
		return [ E, B ].join(A)
	} else {
		if (D == 3) {
			return [ E.charAt(0), E.substring(1) ].join(A)
		} else {
			if (D > 3) {
				return [ E.substring(0, 2), E.substring(2) ].join(A)
			}
		}
	}
};
tg._removeQuotes = function(E) {
	var B = '"';
	var A = [];
	var D = E.length;
	if (D > 2 && (E.charAt(0) == B && E.charAt(D - 1) == B)) {
		A.push(true);
		A.push(E.substring(1, D - 1))
	} else {
		A.push(false);
		A.push(E)
	}
	return A
};
tg.log = function(D) {
	var E = "[MagicParse] ", A = "console", F = "log", B = "undefined";
	if (typeof window != B && (window && (A in window && F in window.console))) {
		window.console.log(E + D)
	} else {
		print(D)
	}
};
tg.isValidNumber = function(I, B) {
	var Y = ", strict = ", X = "0", R = "2", Q = "5", W = "9", Z = "NUMBER input = ", V = "NUMBER: num_int = ", U = "NUMBER: third_ch = ";
	var O = tg._toInt;
	if (tg.DATE_DEBUG) {
		tg.log(Z + I + Y + B)
	}
	var H = I.length;
	if (B) {
		for ( var J = 0, F = I.length; J < F; J++) {
			var M = I.charAt(J);
			if (!(M >= X && M <= W)) {
				return false
			}
		}
	}
	if (H > 4) {
		return false
	} else {
		if (H == 4) {
			var E = O(I);
			if (tg.DATE_DEBUG) {
				tg.log(V + E)
			}
			if (E < 0 || E > 2400) {
				return false
			}
			var K = I.charAt(0);
			var D = I.charAt(1);
			var A = I.charAt(2);
			if (tg.DATE_DEBUG) {
				tg.log(U + A)
			}
			if (!(K == R && D == X) && A > Q) {
				return false
			}
		}
	}
	return true
};
tg.isValidDateOrTime = function(V, U) {
	var AU = "", AP = "-", AX = "0", AW = "2", AV = "5", AT = "9", AS = "\u5E74", AQ = "\u65E5", AR = "\u6708";
	var AO = tg._toInt;
	if (V == null || V.length < 3) {
		return false
	}
	var I = V[0];
	var AB = I.length;
	if (U) {
		var AH = false;
		var AY = false;
		var AG = V[1];
		var M = V[2];
		var AE = AG != null ? AG.length : 0;
		var R = M != null ? M.length : 0;
		if (AB > 0 && (AE == 0 && R == 0)) {
			return true
		}
		if (AE == 1) {
			AH = true
		} else {
			if (AE == 2) {
				var AF = AG.charAt(0);
				if (AF >= AX && AF <= AW) {
					AH = true
				} else {
					return false
				}
			}
		}
		if (!AH || R != 2) {
			return false
		}
		var K = M.charAt(0);
		if (!(K >= AX && K <= AV)) {
			return false
		} else {
			return true
		}
	} else {
		var O = AU;
		for ( var AC = 0, Q = I.length; AC < Q; AC++) {
			var AN = I.charAt(AC);
			if (!(AN >= AX && AN <= AT)) {
				if (AN == AS || (AN == AR || AN == AQ)) {
					continue
				} else {
					if (O == AU) {
						O = AN
					} else {
						if (AN != O) {
							return false
						}
					}
				}
			}
		}
		var AJ = V[1];
		var AA = V[2];
		var AI = AJ != null ? AJ.length : 0;
		var W = AA != null ? AA.length : 0;
		if (W == 0) {
			AA = V[3];
			W = AA != null ? AA.length : 0
		}
		var AD = 0;
		var J = null;
		var AL = V[5];
		if (AL != null && AL.length > 0) {
			J = AL;
			AD = J.length
		}
		var Y = -1;
		var Z = -1;
		var AM = -1;
		if (O == AP && (AI > 0 && (W > 0 && (AD == 0 && AI == W)))) {
			return false
		}
		if (AI == 4) {
			Y = AO(AJ)
		} else {
			if (AD == 4) {
				Y = AO(J);
				J = AJ
			}
		}
		if (Y > -1) {
			if (Y < 10 || Y > 99 && Y < 2000) {
				return false
			}
			var H = AO(AA);
			if (!(H > 0 && H < 32)) {
				return false
			}
			if (AD > 0) {
				var X = AO(J);
				if (!(X > 0 && X < 32)) {
					return false
				}
			}
		} else {
			var AK = AO(AJ);
			var H = AO(AA);
			var X = -1;
			if (AD > 0) {
				X = AO(J)
			}
			if (AD == 0 && !(AK > 0 && AK < 32)) {
				return false
			}
			if (!(H > 0 && H < 32)) {
				return false
			}
			if (AI < 2 && (W < 2 && AD == 1)) {
				return false
			}
			if (AK == 0 || (H == 0 || X == 0)) {
				return false
			}
		}
	}
	return true
};
if (!("trim" in String.prototype)) {
	String.prototype.trim = function() {
		var A = "";
		return this.replace(/^\s+|\s+$/g, A)
	}
}
tg.tokenize = function(K, AV) {
	var Ai = "", U = "!", AW = '"', W = "#", AJ = "*", AP = ", buffer = ", AY = ", ch = ", AT = ", in_due = ", AU = ", in_op = ", AR = ", in_quotes = ", AX = ", last_ch = ", AO = ", tokens = ", R = "0", Ag = "9", Y = "=", V = "@", AL = "^", Ad = "biweekly", Af = "daily", Ac = "fortnightly", AZ = "i = ", Ab = "monthly", AM = "tokens = ", Ah = "url", Ae = "weekly", Aa = "yearly";
	var AD = tg._isWhiteSpace;
	var AF = [];
	var AC = false;
	var AK = false;
	var J = false;
	var AH = [];
	var AB = 0;
	var I = Ai;
	var AQ = Ai;
	var AI = {};
	if (AV) {
		var Aj = tg._findAll;
		var X = tg.URL_HACK_RE;
		var Q = Aj(X, K);
		if (Q !== null) {
			K = K.replace(Q[0], Ai);
			AI[Ah] = Q[0]
		}
	}
	var AN = K.length;
	while (AB < AN) {
		AQ = I;
		I = K.charAt(AB);
		if (I == AW) {
			if (!AC) {
				AH.push(I);
				AC = true
			} else {
				AH.push(I);
				AC = false;
				AK = false;
				J = false;
				AF.push( [ AH.join(Ai).trim(), false, true, false ]);
				AH.length = 0
			}
		} else {
			if (AD(AQ)
					&& (I == AL || (I == AJ || (I == Y || (I == W || (I == V || I == U)))))) {
				if (I === AL) {
					J = true
				}
				if (!AK) {
					AH.push(I);
					AK = true
				} else {
					if (I === V && (J && (AB + 1 < AN && AD(K.charAt(AB + 1))))) {
						AH.push(I)
					} else {
						AC = false;
						AF.push( [ AH.join(Ai).trim(), false, true, false ]);
						AH.length = 0;
						AH.push(I)
					}
				}
			} else {
				if (!AD(I)) {
					AH.push(I)
				} else {
					if (!AC && !AK && AH.length > 0) {
						AF.push( [ AH.join(Ai), true, true, false ]);
						AH.length = 0
					} else {
						if (AD(I) && (AC || AK)) {
							var AA = AH.length;
							if (AK && (AA > 1 && AH[0] == V)) {
								var AG = true;
								for ( var H = 1; H < AA; H++) {
									var Z = AH[H];
									if (!(Z >= R && Z <= Ag)) {
										AG = false;
										break
									}
								}
								if (AG) {
									AF.push( [ AH.join(Ai).trim(), true, false,
											AG ]);
									AH.length = 0;
									AK = false;
									J = false
								} else {
									AH.push(I)
								}
							} else {
								if (AK && AA == 1) {
									AK = false;
									J = false;
									AF.push( [ AH.join(Ai).trim(), true, false,
											false ]);
									AH.length = 0
								} else {
									if (AK && (AA > 1 && AH[0] === U)) {
										AK = false;
										J = false;
										AF.push( [ AH.join(Ai).trim(), true,
												true, false ]);
										AH.length = 0
									} else {
										if (AK && (AA > 1 && AH[0] === AJ)) {
											var M = AH.join(Ai);
											var AS = M.substring(1)
													.toLowerCase();
											if (AS === Af
													|| (AS === Ae || (AS === Ad || (AS === Ac || (AS === Ab || AS === Aa))))) {
												AK = false;
												J = false;
												AF.push( [ AH.join(Ai).trim(),
														true, true, false ]);
												AH.length = 0
											} else {
												AH.push(I)
											}
										} else {
											AH.push(I)
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (tg.TOKEN_DEBUG) {
			tg.log(AZ + AB + AY + I + AX + AQ + AU + AK + AT + J + AR + AC + AP
					+ tg.objDump(AH) + AO + tg.objDump(AF))
		}
		AB = AB + 1
	}
	if (AH.length > 0) {
		var O = AH.join(Ai).trim();
		var AE = O.length;
		if (AE > 0) {
			if (AK) {
				var AQ = O.charAt(0);
				if (AE > 1 && AQ === V) {
					var AG = true;
					for ( var H = 1; H < AE; H++) {
						var Z = O.charAt(H);
						if (!(Z >= R && Z <= Ag)) {
							AG = false;
							break
						}
					}
					if (AG) {
						AF.push( [ O, !AC && !AK, false, AG ])
					} else {
						AF.push( [ O, !AC && !AK, true, false ])
					}
				} else {
					if (AE === 1) {
						AF.push( [ O, !AC && !AK, false, false ])
					} else {
						if (AE > 1 && AQ === U) {
							AF.push( [ O, true, true, false ])
						} else {
							if (AE > 1 && AQ === AJ) {
								var AS = O.substring(1).toLowerCase();
								if (AS === Af
										|| (AS === Ae || (AS === Ad || (AS === Ac || (AS === Ab || AS === Aa))))) {
									AF.push( [ O, true, true ])
								} else {
									AF.push( [ O, !AC && !AK, true, false ])
								}
							} else {
								AF.push( [ O, !AC && !AK, true, false ])
							}
						}
					}
				}
			} else {
				AF.push( [ O, !AC && !AK, true, false ])
			}
		}
	}
	if (tg.TOKEN_DEBUG) {
		tg.log(AM + AF)
	}
	if (AV) {
		return [ AF, AI ]
	} else {
		return AF
	}
};
tg.annotate = function(AK, CN) {
	var CA = "", CP = "!", A7 = "#", B7 = ")", Cr = "*", CG = ", non_data = ", CE = ".,", B9 = "0", CM = "1", CL = "3", B8 = "9", CD = ":;!", BH = "=", CU = "@", CC = "T", CW = "^", AQ = "_", CT = "_@", CR = "at", Cz = "confirmed_date", CH = "data = ", A2 = "date", Ci = "date -> day", AH = "date -> numeric", H = "date-month -> month", AC = "date-month -> next", BN = "date-numeric-day-period -> numeric", CS = "day", BI = "day -> confirmed date at pos = ", B0 = "day -> day", Bo = "day -> month", BY = "day -> unit", C9 = "day_period", CF = "due", CV = "estimate", AX = "flag_is_at", Bn = "list", CQ = "location", AS = "month", DG = "month -> date", C4 = "month-day -> relative", DL = "month-day-numeric-day-period -> numeric", Bi = "month-numeric -> numeric", O = "month_day", Bu = "must_parse", B6 = "numeric", A0 = "numeric -> crappy date", Cn = "numeric after time/day_period and day/date", Ak = "numeric_ord", Bz = "of", AA = "potential date or time after confirmed date", CI = "priority", Cv = "relative", Cs = "relative -> date", DA = "relative -> day", Cp = "relative -> month", Cq = "relative -> relative", Co = "relative -> unit", Am = "repeat", BX = "tag", Ar = "time", BW = "time -> numeric.length = 4 and not day period", CB = "tom", BG = "unit", CX = "url";
	var Ax = tg._removeQuotes;
	var AO = tg._toInt;
	var BD = tg._matches;
	var C3 = tg._isNumeric;
	if (CX in CN) {
		AK.push( [ CN[CX], false, false, false ])
	}
	var AI = false;
	var U = AK.length;
	var Bk = [];
	var DE = [];
	var AB = stateMgr.getListsForMagicParse();
	var DQ = locationMgr.getLocationsForMagicParse();
	var DF = DQ[0];
	var A6 = tagMgr.index;
	var AR = tg.DAY_RE;
	var Cy = tg.MONTH_RE;
	var AW = tg.UNIT_RE;
	var BM = tg.RELATIVE_RE;
	var Bt = tg.NUMERIC_RE;
	var Bh = tg.NUMERIC_TEXT_RE;
	var B5 = tg.NUMERIC_ORD_RE;
	var Al = tg.DAY_PERIOD_RE;
	var Aq = tg.TIME_RE;
	var Ch = tg.NEXT_RE;
	var A1 = tg.DATE_RE;
	var AG = tg.URL_RE;
	for ( var BE = 0; BE < U; BE++) {
		var BA = AK[BE];
		var CJ = BA[0];
		var Bv = CJ.length;
		if (Bv == 0) {
			continue
		}
		var C8 = BA[2];
		if (Bv == 1) {
			C8 = false
		}
		var X = BA[3];
		var B1 = false;
		if (C8) {
			var BZ = CJ.charAt(0);
			var BJ = Ax(CJ.substring(1));
			switch (BZ) {
			case CW:
				var W = dateTimeMgr.parseDueDate(BJ[1]);
				if (W && W[0]) {
					var AM = [];
					AM.push(CF);
					AM.push(BJ[1]);
					AM.push( [ W[0].getTime() / 1000, W[1] ]);
					DE.push(AM);
					B1 = true;
					AI = true
				}
				break;
			case Cr:
				var A8 = reoccurMgr.convertRrule(BJ[1]);
				if (A8) {
					var As = [];
					As.push(Am);
					As.push(BJ[1]);
					As.push(A8);
					DE.push(As);
					B1 = true
				}
				break;
			case A7:
				var DI = BJ[1].toLowerCase();
				if (C3(DI)) {
					X = true
				}
				if (AQ + DI in AB) {
					var Bq = [];
					Bq.push(Bn);
					Bq.push(BJ[1]);
					Bq.push(AB[AQ + DI]);
					DE.push(Bq);
					B1 = true
				} else {
					if (X && !(DI in A6)) {
						BA[1] = false
					} else {
						var Bq = [];
						Bq.push(BX);
						Bq.push(BJ[1]);
						DE.push(Bq);
						B1 = true
					}
				}
				break;
			case BH:
				var C7 = dateTimeMgr.parseTimeEstimate(BJ[1]);
				if (C7) {
					var Cl = [];
					Cl.push(CV);
					Cl.push(BJ[1]);
					DE.push(Cl);
					B1 = true
				}
				break;
			case CU:
				var C1 = BJ[1];
				var Y = AQ + C1.toLowerCase() in DF;
				if (!Y) {
					Y = CT + C1.toLowerCase() in DF;
					if (Y) {
						C1 = CU + C1
					}
				}
				if (Y && (!BD(Bt, C1) && (!BD(Aq, C1) && !BD(Al, C1)))) {
					var BQ = [];
					BQ.push(CQ);
					BQ.push(C1);
					BQ.push(DF[AQ + C1.toLowerCase()]);
					DE.push(BQ);
					B1 = true
				} else {
					BA[1] = true
				}
				break;
			case CP:
				var An = BJ[1];
				var AT = An.charAt(0);
				if (An.length == 1 && (AT >= CM && AT <= CL)) {
					var AD = [];
					AD.push(CI);
					AD.push(AO(An));
					DE.push(AD);
					B1 = true
				}
				break
			}
		}
		if (!B1) {
			orig_text = CJ;
			var I = Ax(CJ);
			var DH = I[0];
			CJ = I[1];
			if (BD(AG, CJ)) {
				var Ct = [];
				Ct.push(CX);
				Ct.push(CJ);
				Ct.push(orig_text);
				Ct.push(DH);
				DE.push(Ct);
				if (DH) {
					Bk.push(BA)
				}
			} else {
				Bk.push(BA)
			}
		}
	}
	if (AI) {
		for ( var BE = 0, DD = Bk.length; BE < DD; BE++) {
			Bk[BE][1] = false
		}
	}
	if (tg.DEBUG) {
		tg.log(CH + DE + CG + Bk)
	}
	var R = Bk.length;
	var Ck = [];
	var J = false;
	var AE = false;
	var AU = null;
	var Q = {};
	var Ah = tg._rstrip;
	var BU = tg._lstrip;
	var M = tg._findAll;
	var DK = tg._findAllWithMultiple;
	var Ay = tg.isValidDateOrTime;
	var Ai = tg.isValidNumber;
	for ( var BE = R - 1; BE > -1; BE--) {
		var C6 = Bk[BE];
		var BC = C6[0];
		var BA = Ah(BC.toLowerCase(), CE);
		var Aa = BA.length;
		var AZ = C6[1];
		if (!AZ) {
			var Au = {
				clean_token : BC,
				token : BA,
				must_parse : AZ
			};
			AU = Au;
			Ck.push(Au);
			continue
		}
		var BR = M(AR, Ah(BA, CD));
		var BB = BR != null ? BR.length : 0;
		var C0 = null;
		var BO = 0;
		if (BB == 0) {
			C0 = M(BM, BA);
			BO = C0 != null ? C0.length : 0;
			var BS = BC.charAt(0);
			if (BS == CC && (BO > 0 && C0[0] == CB)) {
				C0 = null;
				BO = 0
			}
		}
		var DM = null;
		var DB = 0;
		if (BB == 0 && BO == 0) {
			DM = M(AW, BA);
			DB = DM != null ? DM.length : 0
		}
		var CY = false;
		if (AE) {
			CY = true
		}
		AE = false;
		var C2 = Ah(BU(BA, CU), CE);
		var DJ = DK(Al, C2);
		var K = DJ != null ? DJ[0] : null;
		var AF = K != null ? K.length : 0;
		if (AF > 0) {
			var Bs = K[0];
			var Bg = Bs != null ? Bs.length : 0;
			var BL = K[1];
			var A5 = BL != null ? BL.length : 0;
			var Ap = K[2];
			var AV = Ap != null ? Ap.length : 0;
			if (Bg == 0 && A5 == 0) {
				if (AV == 1 || (AV > 0 && C2 != Ap || BE == 0)) {
					K = null;
					AF = 0
				} else {
					AE = true
				}
			} else {
				if (Bg > 0) {
					if (DJ.length > 1) {
						K = null;
						AF = 0
					} else {
						var BT = C2.indexOf(Bs);
						if (BT > -1 && BT > 0) {
							if (C2.charAt(BT - 1) != CU) {
								K = null;
								AF = 0
							}
						}
						if (AF > 0) {
							var C5 = CA;
							for ( var Ag = 0, DD = Bs.length; Ag < DD; Ag++) {
								var Cm = Bs.charAt(Ag);
								if (!(Cm >= B9 && Cm <= B8)) {
									C5 = Cm;
									break
								}
							}
							if (C5 != CA) {
								var Cj = Bs.indexOf(C5);
								var Bx = Bs.substring(0, Cj);
								var AY = Bs.substring(Cj + 1, Bg);
								var A3 = [];
								A3.push(Bs);
								A3.push(Bx);
								A3.push(AY);
								if (!Ay(A3, true)) {
									K = null;
									AF = 0
								}
							}
						}
					}
				}
			}
		}
		var CZ = null;
		var B2 = 0;
		var Bp = false;
		if (J) {
			Bp = true;
			J = false;
			CZ = M(Bh, BA);
			B2 = CZ != null ? CZ.length : 0
		}
		if (DB > 0) {
			J = true
		}
		var Cx = M(A1, C2);
		var B4 = Cx != null ? Cx.length : 0;
		var CK = M(Ch, BA);
		var Bw = CK != null ? CK.length : 0;
		var A9 = M(Cy, BA);
		var At = A9 != null ? A9.length : 0;
		var DC = M(Bt, BA);
		var Cu = DC != null ? DC.length : 0;
		if (Cu > 0) {
			if (!Ai(DC[0], false) || BA.charAt(Aa - 1) == B7) {
				DC = null;
				Cu = 0
			}
		}
		if (B4 > 0) {
			if (C2.charAt(Aa - 1) == B7) {
				Cx = null;
				B4 = 0
			} else {
				if (Cx[0].length + 1 < C2.length) {
					Cx = null;
					B4 = 0
				}
			}
		}
		var AL = M(B5, BA);
		var V = AL != null ? AL.length : 0;
		if (V > 0) {
			var DN = AL[0];
			var Aw = AO(DN);
			if (Aw < 1 || Aw > 31) {
				AL = null;
				V = 0
			} else {
				if (BA != [ AL[0], AL[1] ].join(CA)) {
					AL = null;
					V = 0
				}
			}
		}
		var Bj = M(Aq, BA);
		var BP = Bj != null ? Bj.length : 0;
		if (B4 > 0 && !Ay(Cx, false)) {
			Cx = null;
			B4 = 0
		}
		if (BP > 0 && !Ay(Bj, true)) {
			Bj = null;
			BP = 0
		}
		var Av = [];
		var AP = Cv in Q;
		if (AP && B4 > 0) {
			Cx = null;
			B4 = 0;
			Av.push(Cs)
		}
		if (AP && BO > 0) {
			C0 = null;
			BO = 0;
			Av.push(Cq)
		}
		if (AP && At > 0) {
			A9 = null;
			At = 0;
			Av.push(Cp)
		}
		if (AP && BB > 0) {
			BR = null;
			BB = 0;
			Av.push(DA)
		}
		if (AP && DB > 0) {
			DM = null;
			DB = 0;
			Av.push(Co)
		}
		var Bm = CS in Q;
		if (Bm && BB > 0) {
			BR = null;
			BB = 0;
			Av.push(B0)
		}
		if (Bm && At > 0) {
			A9 = null;
			At = 0;
			Av.push(Bo)
		}
		if (Bm && DB > 0) {
			DM = null;
			DB = 0;
			Av.push(BY)
		}
		if (Bm && (BE > 0 && (B4 > 0 && BP == 0))) {
			Cx = null;
			B4 = 0;
			Av.push(BI + BE)
		}
		var By = A2 in Q;
		var BF = AS in Q;
		if ((By || BF) && Bw > 0) {
			CK = null;
			Bw = 0;
			Av.push(AC)
		}
		if ((By || BF) && At > 0) {
			A9 = null;
			At = 0;
			Av.push(H)
		}
		if (BF && B4 > 0) {
			Cx = null;
			B4 = 0;
			Av.push(DG)
		}
		var CO = Cz in Q;
		if (CO && (BE > 0 && BB > 0)) {
			BR = null;
			BB = 0;
			Av.push(Ci)
		}
		var Aj = B6 in Q;
		var A4 = null;
		if (Aj) {
			A4 = Q[B6]
		}
		if (BF
				&& (Aj && (Cu > 0 && (A4 != null && (A4[0].length != 4 && AU != null))))) {
			var AJ = AU[Bu];
			var Bl = AU[AS] != null;
			if (AJ && !Bl) {
				DC = null;
				Cu = 0;
				Av.push(Bi)
			}
		}
		if (By && (Cu > 0 && !CY)) {
			DC = null;
			Cu = 0;
			Av.push(BN)
		}
		var Z = Ar in Q;
		if (By
				&& (B4 > 0 && (BP == 0 && (AU == null || AU[Bu]
						&& (!AU[AX] && (AU[Ar] == null && !Z)))))) {
			Cx = null;
			B4 = 0;
			Av.push(AH)
		}
		var Az = O in Q;
		if (Az && (Cu > 0 && !CY)) {
			DC = null;
			Cu = 0;
			Av.push(DL);
			delete Q[O]
		}
		if (Az && BO > 0) {
			C0 = null;
			BO = 0;
			Av.push(C4);
			delete Q[O]
		}
		if (Z && (Cu > 0 && (DC[0].length == 4 && !CY))) {
			DC = null;
			Cu = 0;
			Av.push(BW)
		}
		var DP = BG in Q;
		if (A4 != null && (!CY && (!DP && B4 > 0))) {
			var Cw = BC.charAt(BC.length - 1);
			if (!(Cw >= B9 && Cw <= B8)) {
				Cx = null;
				B4 = 0;
				Av.push(A0)
			}
		}
		if (At > 0 && (AU != null && AU[Bu])) {
			A4 = AU[B6];
			var Ao = A4 != null ? A4.length : 0;
			if (Ao > 0 && A4[0].length < 3) {
				var Br = A4[0];
				if (!(Br.length == 2 && Br.charAt(0) == B9)) {
					Q[O] = true
				}
			} else {
				var Ba = AU[Ak];
				var BK = Ba != null ? Ba.length : 0;
				if (BK > 0) {
					Q[O] = true
				}
			}
		}
		if (B4 > 0 && (BP > 0 && CO)) {
			Cx = null;
			B4 = 0;
			Av.push(AA)
		}
		var BV = C9 in Q;
		if (Cu > 0 && (!CY && ((Z || BV) && (Bm || (CO || By))))) {
			DC = null;
			Cu = 0;
			Av.push(Cn)
		}
		if (BB > 0) {
			Q[CS] = true
		}
		if (Cu > 0) {
			Q[B6] = DC
		}
		if (DB > 0) {
			Q[BG] = true
		}
		if (B4 == 0 && BP > 0) {
			Q[Ar] = true
		}
		if (At > 0) {
			Q[AS] = true
		}
		if (B4 > 0) {
			Q[A2] = true;
			var Cg = Cx[4];
			if (Cg != null && Cg.length > 0 || BP == 0) {
				Q[Cz] = true
			}
		}
		if (BO > 0) {
			Q[Cv] = true
		}
		if (AF > 0) {
			Q[C9] = true
		}
		if (Bp && (Cu == 0 && B2 == 0)) {
			Bp = false
		}
		var AN = false;
		if (BA == CU || BA == CR) {
			AN = true;
			Q[CR] = true
		}
		var DO = false;
		var Ca = 0;
		if (AU != null && AU[Bu]) {
			var B3 = AU[AS];
			Ca = B3 != null ? B3.length : 0
		}
		if (BA == Bz && (AU != null && (AU[Bu] && Ca > 0))) {
			DO = true
		}
		if (!Az && (!(DO || (Cu > 0 || V > 0)) && Ca > 0)) {
			delete Q[AS]
		}
		var Au = {
			clean_token : BC,
			token : BA,
			must_parse : AZ,
			flag_is_at : AN,
			flag_is_of : DO,
			day : BR,
			month : A9,
			unit : DM,
			relative : C0,
			numeric : DC,
			numeric_text : CZ,
			numeric_ord : AL,
			day_period : K,
			date : Cx,
			time : Bj,
			next : CK,
			flag_was_unit : Bp,
			flag_was_day_period : CY
		};
		AU = Au;
		if (tg.PRINT_TOKENS) {
			tg.log(tg.objDump(Au))
		}
		if (tg.PRINT_DECISION) {
			tg.log(tg.objDump(Av))
		}
		Ck.push(Au)
	}
	return [ Ck, DE ]
};
tg.objDump = function(A) {
	var B = "undefined";
	if (typeof JSON != B) {
		return JSON.stringify(A)
	}
};
tg.find_name_and_date = function(CF) {
	var C8 = "", A4 = " ", AG = ", left = ", C3 = ", next_pos = ", BL = ", token = ", Cy = ", total = ", Bl = ".", CN = "0", B3 = "2 * day", B5 = "2 * day_period", Cp = "2 * numeric_ord", B4 = "2 * time", Cs = "9", Ba = "@", CD = "AT: appending @ to name_tokens [1]", CC = "AT: appending @ to name_tokens [2]", Ap = "NON SKIP: ", B7 = "OF: appending of to name_tokens [1]", BK = "PREV: ", AV = "WORKING WITH: ", CS = "clean_token", CM = "date", Bg = "date skip decision:", Bw = "date skip decision: [2] time does not follow @/at = ", BV = "date skip decision: date does not follow @/at and is all alone = ", BF = "date skip decision: is_numeric && prev_was_at && !was_day_period && valid = 1 or left = 0 ", Az = "date skip decision: is_numeric && prev_was_at && !was_day_period && valid = 1 or left = 0 && len = 2 && > 24", DI = "date skip decision: numeric_ord skipped ", Bq = "date token = ", CR = "day", CQ = "day_period", Cm = "flag_", CE = "flag_is_at", CA = "flag_is_of", AU = "flag_was_at", CH = "flag_was_day_period", Ay = "flag_was_unit", Ak = "has_month", Ao = "join_is_of", B8 = "month", H = "month = 1", C9 = "month, prev_pos < i - 1", CT = "must_parse", B6 = "next", A0 = "next = no day", BG = "next unit", AP = "next_is_join", O = "now", CL = "numeric", Cj = "numeric -> day", Bm = "numeric -> next", Bx = "numeric -> relative", Cn = "numeric-all", Ck = "numeric-length = 3 && !prev_was_at", Cl = "numeric-next = 1", C4 = "numeric-next, next_pos > i + 1", AQ = "numeric-next, prev_pos < i - 1", CI = "numeric_ord", Br = "numeric_ord -> day", B2 = "numeric_ord = 1", B9 = "numeric_text", AO = "position", CO = "relative", CX = "skip_decision: date at end -- seen day = ", BT = "skip_decision: next, but no more tokens or token far away", Ai = "skip_decision: not prev unit or skipped and this = unit", DE = "skip_decision: now not in first or last place, pos = ", AA = "skip_decision: numeric at end -- seen date and/or time", Z = "skip_decision: numeric followed by random, pos = ", Ci = "skip_decision: numeric followed by time. pos = ", Aj = "skip_decision: numeric surrounded by crap", B1 = "skip_decision: numeric_text without unit", BE = "skip_decision: prev = relative and this = month | day | date", A5 = "skipped", CP = "time", CB = "token", BW = "unit", Ct = "unit = 1", CY = "unit prev = non-numeric", AB = "was_day_period, but not numeric or time";
	var BS = tg._toInt;
	var DD = tg._makeClearTime;
	var V = tg.isValidNumber;
	var AJ = tg.isValidDateOrTime;
	var M = tg._lstrip;
	var Cx = tg._rstrip;
	var AS = [];
	var C7 = [];
	CF.reverse();
	var BA = 0;
	var AK = 0;
	var BQ = 0;
	var Au = 0;
	var Bi = 0;
	for ( var AZ = 0, Bz = CF.length; AZ < Bz; AZ++) {
		var BC = true;
		var CZ = CF[AZ];
		if (CZ[CT]) {
			for ( var BY in CZ) {
				if (BY == CS || (BY == CB || BY == CT)) {
					continue
				}
				if (BY.indexOf(Cm) == 0) {
					if (CZ[BY]) {
						BC = false;
						break
					}
				} else {
					if (CZ[BY] != null) {
						BC = false;
						break
					}
				}
			}
		}
		CZ[Ak] = false;
		CZ[A5] = false;
		CZ[AO] = AZ;
		CZ[AP] = false;
		CZ[Ao] = false;
		CZ[AU] = false;
		if (BC) {
			AS.push(CZ)
		} else {
			if (Bi > 0 && CZ[CR] != null) {
				AS.push(CZ)
			} else {
				var Bp = CZ[CQ];
				var B0 = Bp != null ? Bp.length : 0;
				if (B0 > 0) {
					BA++
				}
				var BP = CZ[CP] != null;
				var AE = CZ[CM] != null;
				var DC = CZ[CL] != null;
				var K = CZ[CR] != null;
				var Cw = CZ[CI] != null;
				if (BP && !AE) {
					AK++
				} else {
					var BZ = Bp != null ? Bp[0] : null;
					var Ag = DC && CZ[CH] || B0 > 0
							&& (BZ != null && Bp[0].length > 0);
					if (Ag) {
						AK++
					}
				}
				if (K) {
					BQ++
				}
				if (Cw) {
					Au++
				}
				if (AE && !BP) {
					Bi++
				}
				C7.push(CZ)
			}
		}
	}
	var DH = C7.length;
	var Cr = DH;
	var A9 = DH > 0;
	var BU = [];
	var AH = [];
	if (A9) {
		var Bh = CF.length;
		var Aq = false;
		var CZ = null;
		var BH = null;
		var Bt = [];
		var BI = C7[DH - 1][AO];
		for ( var AZ = 0; AZ < DH; AZ++) {
			BH = CZ;
			CZ = C7[AZ];
			if (Aq) {
				Aq = false;
				CZ[A5] = true;
				AS.push(CZ);
				Cr--;
				continue
			}
			var CU = CZ[AO];
			var R = -1;
			var Ca = null;
			if (AZ + 1 < DH) {
				Ca = C7[AZ + 1];
				R = Ca[AO]
			}
			var A8 = Ca != null ? Ca[CL] != null : false;
			var A3 = CZ[CE];
			if (A3) {
				CZ[A5] = true;
				if (!(R > -1 && (CU + 1 == R && A8))) {
					if (tg.PRINT_DECISION) {
						tg.log(CD)
					}
					AS.push(CZ)
				} else {
					if (A8
							&& (!Ca[CH] && (R + 1 != Bh && (BH == null
									&& R == BI || Cr == 0)))) {
						if (tg.PRINT_DECISION) {
							tg.log(CC)
						}
						AS.push(CZ);
						Ca[AU] = true
					}
				}
				Cr--;
				continue
			}
			var An = CZ[CA];
			if (An) {
				CZ[A5] = true;
				var DG = false;
				if (BH != null) {
					DG = BH[CL] != null || (BH[B9] != null || BH[CI] != null)
				}
				if (!(BH != null && (DG && (CU + 1 == R && (Ca != null && Ca[B8] != null))))) {
					if (tg.PRINT_DECISION) {
						tg.log(B7)
					}
					AS.push(CZ);
					CZ[CA] = false
				}
				Cr--;
				continue
			}
			var Al = false;
			var A1 = false;
			var Bn = -1;
			if (BH != null) {
				Bn = BH[AO];
				if (CU - 1 == Bn) {
					A1 = BH[CE];
					Al = BH[CA]
				}
			}
			var Am = CZ[B8];
			var Bu = Am != null;
			var C5 = CZ[CL];
			var Aw = C5 != null;
			var C0 = CZ[B6];
			var Bj = C0 != null;
			var Q = CZ[CP];
			var Cq = Q != null;
			var Bp = CZ[CQ];
			var CJ = Bp != null;
			var AT = CZ[CH];
			var A6 = [];
			var BM = false;
			if (CJ && BA > 1) {
				AS.push(CZ);
				BM = true;
				A6.push(B5)
			} else {
				var CW = Bp != null ? Bp[0] : null;
				var Ag = Aw && AT || CJ && (CW != null && CW.length > 0);
				if ((Cq || Ag) && AK > 1) {
					AS.push(CZ);
					BM = true;
					A6.push(B4);
					if (Ag && AT) {
						Aq = true
					}
				}
			}
			var BJ = CZ[CR];
			var Cg = BJ != null;
			if (Cg && BQ > 1) {
				AS.push(CZ);
				BM = true;
				A6.push(B3)
			}
			var DB = Ca != null ? Ca[CE] : false;
			var Cv = Ca != null ? Ca[CA] : false;
			if (Ca != null && (CU + 1 == R && (DB || Cv))) {
				CZ[AP] = true;
				CZ[Ao] = Ca[CA]
			}
			var DF = CZ[CI];
			var AM = DF != null;
			if (AM && Au > 1) {
				if (!(Bn > -1 && CU - 1 == Bn)
						&& (!(R > -1 && CU + 1 == R) && !(R > -1 && (DB || Cv)))) {
					AS.push(CZ);
					BM = true;
					A6.push(Cp)
				}
			}
			var By = BH != null ? BH[B8] != null : false;
			if (Bn > -1 && By) {
				CZ[Ak] = true
			}
			if (Aw
					&& (!A1 && ((Bn == -1 || (CU - 1 != Bn || BH[CL] != null
							&& !BH[Ak])) && (R == -1 || (CU + 1 != R || A8))))) {
				AS.push(CZ);
				BM = true;
				A6.push(Cn)
			} else {
				if (Aw && !A1 || Bj) {
					if (Cr == 1) {
						AS.push(CZ);
						BM = true;
						A6.push(Cl)
					} else {
						if (Aw && (!A1 && (!AT && C5[0].length == 3))) {
							AS.push(CZ);
							BM = true;
							A6.push(Ck)
						} else {
							if (R > -1) {
								var BO = Ca[CR] != null;
								if (CU + 1 != R) {
									if (!(Bn > -1 && By)) {
										AS.push(CZ);
										BM = true;
										A6.push(C4)
									}
								} else {
									if (Aw && BO) {
										AS.push(CZ);
										BM = true;
										A6.push(Cj)
									} else {
										if (Aw && Ca[CO] != null) {
											AS.push(CZ);
											BM = true;
											A6.push(Bx)
										} else {
											if (Aw && Ca[B6] != null) {
												AS.push(CZ);
												BM = true;
												A6.push(Bm)
											} else {
												if (Bj && Ca[BW] != null) {
													AS.push(CZ);
													Aq = true;
													BM = true;
													A6.push(BG)
												} else {
													if (Bj && !BO) {
														AS.push(CZ);
														Aq = true;
														BM = true;
														A6.push(A0)
													}
												}
											}
										}
									}
								}
							} else {
								if (Bn > -1) {
									if (CU - 1 != Bn) {
										AS.push(CZ);
										BM = true;
										A6.push(AQ)
									}
								}
							}
						}
					}
				}
			}
			if (AT && (!Cq && (!Aw || !V(C5[0], true)))) {
				AS.push(CZ);
				BM = true;
				Aq = true;
				A6.push(AB);
				BA--
			}
			if (Bu) {
				if (Cr == 1) {
					AS.push(CZ);
					BM = true;
					A6.push(H)
				} else {
					var BR = false;
					if (R > -1) {
						BR = A8 || (Ca[B9] != null || Ca[CI] != null)
					}
					var BX = BH != null ? BH[A5] : false;
					if (!Al
							&& ((R == -1 || !BR) && (Bn == -1 || Bn > -1
									&& (CU - 1 != Bn || BX)))) {
						AS.push(CZ);
						BM = true;
						A6.push(C9)
					}
				}
			}
			var A7 = CZ[BW];
			var CV = A7 != null;
			if (CV) {
				if (Cr == 1) {
					AS.push(CZ);
					BM = true;
					A6.push(Ct)
				} else {
					if (Bn == -1 || Bn > -1
							&& (BH[CL] == null && BH[B9] == null)) {
						AS.push(CZ);
						BM = true;
						A6.push(CY)
					}
				}
			}
			if (AM && (Cr == 1 && CU + 1 != Bh)) {
				AS.push(CZ);
				BM = true;
				A6.push(B2)
			} else {
				if (AM && (R > -1 && Ca[CR] != null)) {
					AS.push(CZ);
					BM = true;
					A6.push(Br)
				}
			}
			if (BM) {
				Cr--;
				CZ[A5] = true;
				if (tg.PRINT_DECISION) {
					tg.log(Bg + tg.objDump(A6) + BL + CZ[CB])
				}
			} else {
				if (tg.PRINT_TOKENS) {
					tg.log(Ap + tg.objDump(CZ))
				}
				Bt.push( [ CZ, Aw, R, A1, BH ])
			}
		}
		var Ca = null;
		BH = null;
		CZ = null;
		var As = Bt.length;
		var Bs = As;
		var I = -1;
		var DA = -1;
		for ( var AZ = 0; AZ < As; AZ++) {
			BH = CZ;
			var BN = Bt[AZ];
			CZ = BN[0];
			var C2 = BN[1];
			var Ch = BN[2];
			var Bv = BN[3];
			var CK = BN[4];
			if (tg.PRINT_TOKENS) {
				tg.log(AV + CZ[CB] + AG + Bs)
			}
			var R = -1;
			if (AZ + 1 < As) {
				Ca = Bt[AZ + 1][0];
				R = Ca[AO]
			} else {
				Ca = null;
				R = -1
			}
			var CU = CZ[AO];
			var AC = CZ[CO];
			var C6 = AC != null;
			if (C6 && (AC[0] === O && (CU > 0 && CU + 1 < Bh))) {
				CZ[A5] = true;
				AS.push(CZ);
				Bs--;
				if (tg.PRINT_DECISION) {
					tg.log(DE + CU + Cy + Bh)
				}
				continue
			}
			var C0 = CZ[B6];
			var Bj = C0 != null;
			if (Bj && (Ca == null || Ca != null && CU + 1 != R)) {
				CZ[A5] = true;
				AS.push(CZ);
				Bs--;
				if (tg.PRINT_DECISION) {
					tg.log(BT)
				}
				continue
			}
			var Am = CZ[B8];
			var Bu = Am != null;
			var BJ = CZ[CR];
			var Cg = BJ != null;
			var BD = CZ[CM];
			var C1 = BD != null;
			var Q = CZ[CP];
			var Cq = Q != null;
			var BX = BH != null ? BH[A5] : false;
			if (BH != null
					&& (BH[CO] != null && (!BX && (Bu || (Cg || C1 && !Cq))))) {
				CZ[A5] = true;
				AS.push(CZ);
				Bs--;
				if (tg.PRINT_DECISION) {
					tg.log(BE)
				}
				continue
			}
			var A7 = CZ[BW];
			var CV = A7 != null;
			if (CV) {
				DA = CZ[AO]
			}
			var AR = BH != null ? BH[Ay] : false;
			if (BH != null && ((!AR || BX) && CV)) {
				CZ[A5] = true;
				AS.push(CZ);
				Bs--;
				if (tg.PRINT_DECISION) {
					tg.log(Ai)
				}
				continue
			}
			var J = Ca != null ? Ca[CQ] : null;
			var Ar = J != null;
			var CG = Ca != null ? Ca[CH] : false;
			var AI = false;
			var AD = J != null ? J[0] : null;
			if (Ca != null
					&& (Ca[CP] != null || (Ar && (AD != null && AD.length > 0) || Ca[CL] != null
							&& CG))) {
				AI = true
			}
			var Bo = CZ[Ao];
			var AT = CZ[CH];
			if (BH == null && (C2 && (Bs > 1 && (!Bo && (!AT && Ca != null))))) {
				if (CU + 1 != R) {
					CZ[A5] = true;
					if (tg.PRINT_DECISION) {
						tg.log(Z + CU + C3 + R)
					}
					AS.push(CZ);
					Bs--;
					continue
				} else {
					if (AI) {
						CZ[A5] = true;
						if (tg.PRINT_DECISION) {
							tg.log(Ci + CU + C3 + R)
						}
						AS.push(CZ);
						Bs--;
						continue
					}
				}
			}
			if (C1
					&& (Cq && !AT && (BH == null && (Bs == 1 || Bs > 1
							&& (Ca != null && (Ca[CP] == null && !Ar)))))) {
				var Ah = BD != null ? BD[1] : null;
				var AN = BD != null ? BD[2] : null;
				var Y = BD != null ? BD[5] : null;
				if ((Y == null || Y.length == 0)
						&& (AN != null && (AN.length == 2 && AN.charAt(0) == CN))) {
					if (Bs > 1) {
						if (tg.PRINT_DECISION) {
							tg.log(Bw + CZ[CB])
						}
						AS.push(CZ);
						Bs--;
						CZ[A5] = true;
						continue
					} else {
						if (Ah != null && Ah.length == 1) {
							if (tg.PRINT_DECISION) {
								tg.log(Bw + CZ[CB])
							}
							AS.push(CZ);
							Bs--;
							CZ[A5] = true;
							continue
						}
					}
				}
			}
			var Ax = BD != null ? BD[0] : null;
			var Ah = BD != null ? BD[1] : null;
			var AN = BD != null ? BD[2] : null;
			var Y = BD != null ? BD[5] : null;
			if (C1
					&& (Bs == 1 && ((Y == null || Y.length == 0) && (Ah != null && (Ah.length == 1 && (AN != null && (AN.length == 1 && (Ax != null && Ax
							.charAt(1) == Bl)))))))) {
				if (tg.PRINT_DECISION) {
					tg.log(BV + CZ[CB])
				}
				AS.push(CZ);
				Bs--;
				CZ[A5] = true;
				continue
			}
			var C5 = CZ[CL];
			var Aw = C5 != null;
			if (C2 && (Bv && (!AT && (As == 1 || Bs == 0)))) {
				if (CU + 1 != Bh && BU.length == 0 || AH.length > 0) {
					if (tg.PRINT_DECISION) {
						tg.log(BF + CZ[CB])
					}
					AS.push(CZ);
					Bs--;
					CZ[A5] = true;
					continue
				} else {
					if (C5[0].length == 2 && BS(C5[0]) > 24) {
						if (tg.PRINT_DECISION) {
							tg.log(Az + CZ[CB])
						}
						AS.push(CZ);
						Bs--;
						CZ[A5] = true;
						continue
					}
				}
			}
			var Bn = BH != null ? BH[AO] : -1;
			if (C2
					&& (!Bv && (!AT && (BH != null && (Ca == null || Ca[B8] == null))))) {
				if (CU - 1 != Bn) {
					if (tg.PRINT_DECISION) {
						tg.log(Aj)
					}
					AS.push(CZ);
					Bs--;
					CZ[A5] = true;
					continue
				} else {
					if (BH != null
							&& (Ca == null && (BH[CP] != null || BH[CQ] != null))) {
						if (tg.PRINT_DECISION) {
							tg.log(AA)
						}
						AS.push(CZ);
						Bs--;
						CZ[A5] = true;
						continue
					}
				}
			}
			var AY = CZ[AP];
			var DF = CZ[CI];
			var AM = DF != null;
			if (!AY && AM) {
				if ((BH != null || Ca != null)
						&& ((BH == null || BH != null && CU - 1 != Bn) && (Ca == null || Ca != null
								&& CU + 1 != R))) {
					if (tg.PRINT_DECISION) {
						tg.log(DI + CZ[CB])
					}
					AS.push(CZ);
					Bs--;
					CZ[A5] = true;
					continue
				}
			}
			if (Cg) {
				I = CU
			}
			if (C1 && I > -1) {
				var Cu = C8;
				var Bk = BD[0];
				for ( var Aa = 0, AL = Bk.length; Aa < AL; Aa++) {
					var Av = Bk.charAt(Aa);
					if (!(Av >= CN && Av <= Cs)) {
						Cu = Av;
						break
					}
				}
				if (Cu == Bl || I == 0) {
					if (tg.PRINT_DECISION) {
						tg.log(CX + tg.objDump(BD))
					}
					AS.push(CZ);
					Bs--;
					CZ[A5] = true;
					continue
				}
			}
			var Co = CZ[B9];
			var X = Co != null;
			if (X && (DA === -1 && (!Ca || Ca[BW] === null))) {
				if (tg.PRINT_DECISION) {
					tg.log(B1)
				}
				AS.push(CZ);
				Bs--;
				CZ[A5] = true;
				continue
			}
			if (tg.PRINT_TOKENS) {
				tg.log(Bq + tg.objDump(CZ))
			}
			var W = CZ[CS];
			var Cz = CZ[CB];
			if (C6) {
				BU.push(W)
			} else {
				var Bp = CZ[CQ];
				var CJ = Bp != null;
				var At = CZ[Ak];
				if (Cq && C1) {
					if (BU.length > 0 || AT) {
						AH.push(M(W, Ba))
					} else {
						BU.push(W)
					}
				} else {
					if ((C2 && AT || Cq) && Ch > -1) {
						AH.push(W)
					} else {
						if (Cq) {
							AH.push(M(W, Ba))
						} else {
							if (CJ) {
								AH.push(W)
							} else {
								if (C2 && Bv) {
									var U = BS(C5[0]);
									if (C5[0].length == 2 && U > 24) {
										BU.push(Cz)
									} else {
										if (Ca != null
												&& (Ca[B8] != null && CU + 1 == R)) {
											BU.push(Cz)
										} else {
											AH.push(DD(Cz))
										}
									}
								} else {
									if (C2
											&& (Cz.length == 4 && (BU.length > 0 && (AH.length == 0 && (!At && !(CK != null && CK[Ak])))))) {
										if (tg.PRINT_TOKENS) {
											tg.log(BK + tg.objDump(BH))
										}
										AH.push(DD(Cz))
									} else {
										var BB = C2 || (AM || CZ[B9] != null);
										if (C2
												&& (BH != null && ((BH[CO] != null || BH[CR] != null) && !(Ca != null && (Ca[B8] != null && CU + 1 == R))))) {
											AH.push(W)
										} else {
											BU.push(W)
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	AS.sort(tg.TOKEN_POS_SORT);
	var AW = [];
	AS.reverse();
	if (A9) {
		var AX = true;
		var AF = tg.SENTINELS;
		for ( var AZ = 0, Bz = AS.length; AZ < Bz; AZ++) {
			var Cz = AS[AZ];
			var A2 = Cz[CB].toLowerCase();
			if (!(AX && A2 in AF)) {
				AW.push(Cz[CS]);
				AX = false
			}
		}
	} else {
		for ( var AZ = 0, Bz = AS.length; AZ < Bz; AZ++) {
			var Cz = AS[AZ];
			AW.push(Cz[CS])
		}
	}
	AW.reverse();
	if (AW.length > 0) {
		return [ AW.join(A4), [ BU, AH ] ]
	} else {
		return [ null, [ BU, AH ] ]
	}
};
tg.clean_name_and_parse_date = function(K, H, F) {
	var Y = " ", X = " @ ", V = "due", W = "url";
	var U = tg._rstrip;
	var I = H[0];
	var R = H[1];
	var Q = R[0];
	var B = R[1];
	var A = [];
	if (Q.length > 0) {
		A.push(Q.join(Y))
	}
	if (B.length > 0) {
		A.push(B.join(Y))
	}
	var D = null;
	var O = null;
	if (A.length > 0) {
		D = A.join(X);
		O = dateTimeMgr.parseDueDate(D);
		if (O && O[0]) {
			O = [ O[0].getTime() / 1000, O[1] ]
		}
	}
	if (I == null || A.length === 0 && (F !== null && F.length === 0)) {
		I = K;
		I = I.trim()
	} else {
		I = I.trim()
	}
	for ( var M = 0, J = F.length; M < J; M++) {
		var E = F[M];
		if (E[0] === W && (E.length > 3 && E[3] != null)) {
			I = I.replace(E[2], E[1])
		} else {
			if (E[0] === V) {
				D = E[1];
				O = E[2]
			}
		}
	}
	return [ I, D, O ]
};
tg.test = function() {
	var R = " not matched = ";
	var Q = TEST_CASES;
	for ( var B in TEST_CASES) {
		var J = TEST_CASES[B];
		var D = J[0];
		var K = J[1];
		var H = tg.parse(D);
		var M = K[0];
		var O = K[1];
		var I = H[1][0];
		var A = H[1][1];
		var E = M === I;
		var F = O === A;
		if (!(E && F)) {
			tg.log(D + R + tg.objDump( [ M, O, I, A ]))
		}
	}
};
if (typeof globalScope !== "undefined") {
	globalScope.MagicParse = tg
}
function sg(B) {
	for ( var A = 0, D = B.length; A < D; A++) {
		sg.Handle(B[A])
	}
}
sg.Handle = function(e) {
	var W = "/help/loggedout.rtm", AM = "cd", AS = "cf", AF = "filter !== null", AR = "fl", AO = "gd", AY = "in", AW = "ld", AX = "le", Q = "lo", J = "ls", AK = "mle", Z = "mt", K = "name.toLowerCase()", AQ = "nd", V = "ni", a = "no", AZ = "ov", AH = "pd", R = "pi", AT = "pld", b = "position", AU = "pr", I = "rtmMaintTS", AJ = "sd", AP = "td", AC = "tds", AD = "tl", H = "tms", AB = "tok", Y = "trs", AV = "ts", X = "wn", AG = "xd", U = "xs", AE = "yd";
	var AA = e[0];
	var AI = e[1];
	var O = ug.isReady() && ug.Sync.isStartup();
	switch (AA) {
	case AY:
		break;
	case AX:
		legend.show();
		break;
	case AK:
		map_legend.show();
		break;
	case AZ:
		overviewnews.setText(AI[0], AI[1]);
		overviewnews.show();
		break;
	case AD:
		transMgr.setTimeline(AI);
		break;
	case a:
		window.setTimeout(function() {
			var D = [], B;
			for ( var A = 0, E = AI.length; A < E; A++) {
				B = AI[A];
				D.push( {
					id : B[0],
					ntype : B[1],
					value : B[2],
					state : B[3],
					mtype : B[4],
					mlimit : B[5]
				})
			}
			UN(D)
		}, 0);
		break;
	case J:
		listTabs.setSortParameters(stateMgr.lists, [ AF, b, K ], [
				List.LIST_SORT_ASC, List.LIST_SORT_ASC, List.LIST_SORT_ASC ]);
		break;
	case AW:
		window.setTimeout(function() {
			var D = [], B;
			for ( var A = 0, E = AI.length; A < E; A++) {
				B = AI[A];
				D.push( {
					id : B[0],
					name : B[1],
					deleted : B[2],
					locked : B[3],
					archived : B[4],
					position : B[5],
					filter : B[6],
					date_last_modified : B[7],
					date_created : B[8],
					sort_order : B[9],
					syncable : B[10],
					token : B[11]
				})
			}
			if (ug.isReady()) {
				(function() {
					ug.Sync.startup_ = O;
					ug.Sync.updateLists(D);
					ug.Sync.startup_ = false
				}())
			}
			L(l, D, O)
		}, 0);
		break;
	case AV:
		if (ug.isReady()) {
			ug.Sync.setStartup(true, AI);
			ug.ping()
		}
		dateTimeMgr.setServerDate(AI);
		break;
	case AU:
		window.setTimeout(function() {
			Control.isPro(AI)
		}, 0);
		break;
	case AT:
		window.setTimeout(function() {
			var D = [], B;
			for ( var A = 0, E = AI.length; A < E; A++) {
				B = AI[A];
				D.push( {
					from : B[0],
					id : B[1],
					name : B[2],
					queued : B[3],
					accepted : B[4],
					rejected : B[5],
					from_username : B[6],
					from_first_name : B[7],
					from_last_name : B[8],
					filter : B[9],
					position : B[10]
				})
			}
			L(l, D, false, true)
		}, 0);
		break;
	case AS:
		window.setTimeout(function() {
			UC(AI)
		}, 0);
		break;
	case AR:
		if (stateMgr.currentList === null
				|| rtmRequestedList === stateMgr.currentList) {
			stateMgr.setCurrentList(AI[0]);
			stateMgr.setCurrentFilter(AI[1]);
			stateMgr.setCurrentType(AI[2])
		}
		break;
	case AQ:
		window.setTimeout(function() {
			var D = [], B;
			for ( var A = 0, E = AI.length; A < E; A++) {
				B = AI[A];
				D.push( {
					task_series_id : B[0],
					id : B[1],
					title : B[2],
					content : B[3],
					date_created : B[4],
					date_deleted : B[5],
					date_last_modified : B[6]
				})
			}
			if (ug.isReady()) {
				(function() {
					ug.Sync.startup_ = O;
					ug.Sync.updateNotes(D);
					ug.Sync.startup_ = false
				}())
			}
			N(n, D, O)
		}, 0);
		break;
	case AP:
		overviewList.hideLoading();
		window.setTimeout(function() {
			if (ug.isReady()) {
				(function() {
					ug.Sync.startup_ = O;
					ug.Sync.updateTasks(AI, {});
					ug.Sync.startup_ = false
				}())
			}
			T(t, AI, {}, O)
		}, 0);
		break;
	case AO:
		if (AI === null) {
			G(null, null)
		} else {
			var AN = [], d;
			for ( var M = 0, AL = AI.length; M < AL; M++) {
				d = AI[M];
				AN.push( {
					id : d[0],
					name : d[1],
					members : d[2]
				})
			}
			if (ug.isReady()) {
				ug.Sync.updateGroups(AN)
			}
			G(g, AN, O)
		}
		break;
	case AM:
		if (AI === null) {
			C(null, null)
		} else {
			var AN = [], d;
			for ( var M = 0, AL = AI.length; M < AL; M++) {
				d = AI[M];
				AN.push( {
					id : d[0],
					firstname : d[1],
					lastname : d[2],
					username : d[3]
				})
			}
			if (ug.isReady()) {
				ug.Sync.updateContacts(AN)
			}
			C(c, AN, O)
		}
		break;
	case AJ:
		S(AI);
		break;
	case AH:
		P(AI);
		break;
	case AG:
		window.setTimeout(function() {
			if (AI[0] === 0) {
				if (ug.isReady()) {
					(function() {
						ug.Sync.startup_ = O;
						ug.Sync.updateTags(AI[1]);
						ug.Sync.startup_ = false
					}())
				}
				UT(AI[1], O)
			} else {
				UTC(AI[1])
			}
		}, 0);
		break;
	case AE:
		window.setTimeout(function() {
			if (AI[0] === 0) {
				LOC( {})
			} else {
				if (ug.isReady()) {
					(function() {
						ug.Sync.startup_ = O;
						ug.Sync.updateLocations(AI[1]);
						ug.Sync.startup_ = false
					}())
				}
				LOC(AI[1], O);
				if (AI[2] === null) {
					LOCU( {})
				} else {
					if (ug.isReady()) {
						(function() {
							ug.Sync.startup_ = O;
							ug.Sync.updateLocationTaskSeries(AI[2]);
							ug.Sync.startup_ = false
						}())
					}
					LOCU(AI[2])
				}
			}
		}, 0);
		break;
	case X:
		UWN( {
			shared_tasks : AI[0],
			shared_lists : AI[1],
			emailed_tasks : AI[2]
		});
		break;
	case V:
		window.setTimeout(function() {
			statusBox.hide();
			publishMgr.fillPublicInfo();
			dateTimeMgr.setTimezone();
			if (is_safari) {
				if (taskCloud) {
					taskCloud.hide();
					setTimeout(function() {
						taskCloud.show()
					}, 60)
				}
			}
			if (!configurationMgr.configuration.seen_v3_dialog) {
				ug.Dialog.showV3Dialog()
			}
		}, 0);
		if (ug.isReady()) {
			ug.Sync.setStartup(false);
			setTimeout(function() {
				ug.Desktop.intialize()
			}, 1000)
		}
		break;
	case U:
		if (ug.isReady()) {
			ug.Sync.onSyncDone(AI[0], AI[1], AI[2], AI[3], AI[4])
		}
		break;
	case R:
		if (ug.isReady()) {
			ug.onPingSuccess(AI[0], AI[1], AI[2])
		} else {
			if (AI[2] === true) {
				window.location.reload(true)
			}
		}
		break;
	case Q:
		if (!(ug.isReady() && ug.Dialog.isLoggedOut())) {
			window.location = W
		}
		break;
	case AB:
		setTimeout(function() {
			Control.updatePrivate(AI)
		}, 0);
		break;
	case Y:
		setTimeout(function() {
			Control.onTagRenamed(AI)
		}, 0);
		break;
	case H:
		setTimeout(function() {
			Control.onTagsMerged(AI)
		}, 0);
		break;
	case AC:
		setTimeout(function() {
			Control.onTagsDeleted(AI)
		}, 0);
		break;
	case Z:
		if (I in window && rtmMaintTS !== AI) {
			rtmMaintTS = AI;
			if (dateTimeMgr) {
				dateTimeMgr.chime(dateTimeMgr, new Date())
			}
		}
		break
	}
};
if (typeof globalScope !== "undefined") {
	globalScope.Dispatch = sg
}
function ug() {
}
ug.initialized_ = false;
ug.Dialog = function() {
};
ug.Dialog.initialized_ = false;
ug.Dialog.displayed_ = false;
ug.Dialog.logged_out_ = false;
ug.Dialog.initialize = function() {
	var B = "cancel", D = "dialog-cancel", M = "dialog-content-text", J = "dialog-cover", I = "dialog-frame", H = "dialog-iframe", F = "dialog-ok", A = "dialog-other", O = "dialog-title-text", E = "ok", K = "other";
	this.title_ = el(O);
	this.content_ = el(M);
	this.cover_ = el(J);
	this.frame_ = el(I);
	this.frame_class_ = null;
	this.iframe_ = el(H);
	this.button_ok_ = el(F);
	this.button_ok_.onclick = function() {
		ug.Dialog.onButtonClick(E)
	};
	this.button_cancel_ = el(D);
	this.button_cancel_.onclick = function() {
		ug.Dialog.onButtonClick(B)
	};
	this.button_other_ = el(A);
	this.button_other_.onclick = function() {
		ug.Dialog.onButtonClick(K)
	};
	this.initialized_ = true
};
ug.Dialog.isLoggedOut = function() {
	return this.logged_out_
};
ug.Dialog.onButtonClick = function(A) {
};
ug.Dialog.triggerCancel = function() {
	this.button_cancel_.onclick();
	return true
};
ug.Dialog.onTabPressed = function(D) {
	var B = "dialog-cancel", E = "dialog-ok", A = "hidden";
	if (D.id === B && ug.Dialog.button_ok_.className !== A) {
		ug.Dialog.button_ok_.focus()
	} else {
		if (D.id === E && ug.Dialog.button_other_.className !== A) {
			ug.Dialog.button_other_.focus()
		} else {
			ug.Dialog.button_cancel_.focus()
		}
	}
	return false
};
ug.Dialog._getScrollTop = function() {
	var A = "CSS1Compat";
	if (is_safari || (is_gecko || is_khtml)) {
		return window.scrollY
	}
	if (document.compatMode && document.compatMode == A) {
		return document.documentElement.scrollTop
	}
	return document.body.scrollTop
};
ug.Dialog.show = function(J) {
	var Z = "Locations", V = "dialog-bg", X = "dialog-frame", Y = "hidden", W = "px", U = "visible";
	if (this.initialized_ === false) {
		this.initialize()
	}
	if (view.getViewToken(Z)) {
		J = true
	}
	J = !!J;
	var F = this._getScrollTop();
	var A = getWindowSize();
	var H = document.body.scrollHeight - A[1];
	var K = 0;
	if (J) {
		K = 30;
		A[1] -= K
	}
	this.frame_.style.visibility = Y;
	this.frame_.className = X;
	if (this.frame_class_) {
		Utility.addClass(this.frame_, this.frame_class_)
	}
	var E = ug.Dialog.frame_.scrollHeight;
	var R = ug.Dialog.frame_.clientHeight;
	var D = ug.Dialog.frame_.scrollWidth;
	var Q = ug.Dialog.frame_.clientWidth;
	var O = E > R ? E : R;
	var M = D > Q ? D : Q;
	var B = Math.ceil(A[1] / 2 - O / 2) + K;
	var I = Math.floor(A[0] / 2 - M / 2);
	this.cover_.style.width = A[0] + W;
	this.cover_.style.height = A[1] + H + W;
	this.iframe_.style.width = A[0] + W;
	this.iframe_.style.height = A[1] + H + W;
	this.cover_.style.top = K + W;
	this.iframe_.style.top = K + W;
	this.frame_.style.top = F + B + W;
	this.frame_.style.left = I + W;
	this.cover_.className = V;
	this.iframe_.className = V;
	this.frame_.style.visibility = U;
	window.document.documentElement.style.overflowX = Y;
	this.displayed_ = true;
	this.button_cancel_.focus()
};
ug.Dialog.hide = function() {
	var A = "", E = "dialog-bg hidden", F = "dialog-frame hidden", B = "dialog-frame-delete", D = "hidden";
	this.logged_out_ = false;
	ug.Dialog.onButtonClick = function(H) {
	};
	window.document.documentElement.style.overflowX = A;
	this.button_ok_.blur();
	this.button_cancel_.blur();
	this.button_other_.blur();
	this.frame_.className = F;
	this.iframe_.className = E;
	this.cover_.className = E;
	this.showing_map_ = false;
	this.displayed_ = false;
	this.frame_class_ = null;
	this.button_ok_.className = A;
	this.button_cancel_.className = A;
	this.button_other_.className = D;
	Utility.removeClass(this.frame_, B)
};
ug.Dialog.isDisplayed = function() {
	return this.displayed_
};
ug.Dialog.showV3Dialog = function() {
	var H = "", D = '<p>We\'ve made a number of big changes to the web app in this edition: we\'ve added Smart Add, improved how task selection and multi-edit mode work, and made the app faster. Check out the blog to see what\'s changed.</p><p style="margin-bottom: 0;"><a href="http://blog.rememberthemilk.com/2009/09/introducing-smart-add-a-smarter-way-to-add-your-tasks/" target="_blank" style="font-size: 1.2em;">Learn more about the changes</a> (opens in new window)</p>', F = "INTERFACE_DIALOG_CONNECTION_LOST_BUTTON_OK", E = "Welcome to the Smart Add Edition", B = "configuration.seenV3Dialog", A = "hidden";
	this.button_ok_.className = A;
	this.button_cancel_.className = H;
	this.button_cancel_.innerHTML = _T(F);
	this.title_.innerHTML = E;
	this.content_.innerHTML = D;
	ug.Dialog.onButtonClick = function(I) {
		transMgr.request(B, Utility.toJSON( {
			meh : 1
		}));
		ug.Dialog.hide()
	};
	this.show()
};
ug.Dialog.showGears = function() {
	var V = "", B = "</h2>", H = "</p>", E = "<h2>", J = "<p>", Y = "INTERFACE_DIALOG_GEARS_BUTTON_OK", I = "INTERFACE_DIALOG_GEARS_TEXT_1", F = "INTERFACE_DIALOG_GEARS_TEXT_2", D = "INTERFACE_DIALOG_GEARS_TEXT_3", W = "INTERFACE_DIALOG_GEARS_TEXT_4", K = "INTERFACE_DIALOG_GEARS_TITLE", R = "INTERFACE_GOOGLE_GEARS_MESSAGE", X = "INTERFACE_TASKS_NOTES_CANCEL_BUTTON", O = "gears", Q = "http://gears.google.com/?action=install&message=", U = "ok", M = "status=1,resizable=1,width=790,height=500";
	this.button_ok_.innerHTML = _T(Y);
	this.button_cancel_.innerHTML = _T(X);
	this.title_.innerHTML = _T(K);
	var A = [ J + _TF(I) + H, J + _TF(F) + H, E + _TF(D) + B, J + _TF(W) + H ];
	this.content_.innerHTML = A.join(V);
	ug.Dialog.onButtonClick = function(Z) {
		if (Z === U) {
			var d = encodeURIComponent(_T(R));
			window.open(Q + d, O, M);
			return false
		}
		ug.Dialog.hide()
	};
	this.show()
};
ug.Dialog.showRepeatingDeleteDialog = function(V, U, W) {
	var R = "", X = "</p>", D = "<p>", Q = "INTERFACE_DIALOG_REPEAT_BUTTON_CONTINUE", I = "INTERFACE_DIALOG_REPEAT_BUTTON_STOP", A = "INTERFACE_DIALOG_REPEAT_TEXT_NUM", B = "INTERFACE_DIALOG_REPEAT_TEXT_ONE", E = "INTERFACE_DIALOG_REPEAT_TITLE_NUM", F = "INTERFACE_DIALOG_REPEAT_TITLE_ONE", H = "INTERFACE_TASKS_NOTES_CANCEL_BUTTON", O = "cancel", J = "dialog-frame-delete", M = "ok", K = "other";
	this.button_cancel_.className = R;
	this.button_other_.className = R;
	this.button_ok_.innerHTML = _T(Q);
	this.button_other_.innerHTML = _T(I);
	this.button_cancel_.innerHTML = _T(H);
	this.title_.innerHTML = _T(V === 1 ? F : E);
	this.content_.innerHTML = D + _T(V === 1 ? B : A) + X;
	ug.Dialog.onButtonClick = function(Y) {
		if (Y === O) {
			ug.Dialog.hide()
		} else {
			if (Y === M) {
				W(false);
				ug.Dialog.hide()
			} else {
				if (Y === K) {
					W(true);
					ug.Dialog.hide()
				}
			}
		}
	};
	this.frame_class_ = J;
	this.show()
};
ug.Dialog.showTagMergeDialog = function(R) {
	var O = "", B = '</label><input type="text" id="dialog-content-tag-merge-input" value=""></input></form></div>', E = '<br /></p><div style="overflow: auto;"><form style="display: inline;" action="#" method="post" onsubmit="Offline.Dialog.onButtonClick(\'ok\'); return false;"><label id="dialog-content-tag-merge-label" for="dialog-content-tag-merge-input">', H = '<p style="z-index: 5000;">', D = "INTERFACE_DIALOG_MERGE_TAG_NAME_LABEL", F = "INTERFACE_DIALOG_MERGE_TEXT_ONE", M = "INTERFACE_DIALOG_MERGE_TITLE", I = "INTERFACE_TASKS_NOTES_CANCEL_BUTTON", A = "cancel", K = "dialog-content-tag-merge-input", J = "dialog-frame-tag-merge", U = "ok";
	this.button_cancel_.className = O;
	this.button_ok_.innerHTML = _T(M);
	this.button_cancel_.innerHTML = _T(I);
	this.title_.innerHTML = _T(M);
	this.content_.innerHTML = H + _T(F) + E + _T(D) + B;
	ug.Dialog.onButtonClick = function(X) {
		if (X === A) {
			ug.Dialog.hide()
		} else {
			if (X === U) {
				var W = el(K);
				if (!W) {
					return
				}
				var V = W.value.trim();
				if (V.length === 0) {
					return
				}
				R(V);
				ug.Dialog.hide()
			}
		}
	};
	var Q = el(K);
	Q.value = O;
	this.frame_class_ = J;
	this.show();
	setTimeout(function() {
		var V = el(K);
		V.focus()
	}, 0)
};
if (HAS_GEARS) {
	ug.VERSIONS_ = {
		db : 1,
		ls : 1,
		wp : 1
	};
	ug.start_ = (new Date()).getTime();
	ug.first_ping_ = true;
	ug.in_ping_ = false;
	ug.updated_ = 0;
	ug.can_prune_ = null;
	ug.onConnectionLost = function(A, B) {
		this.forceOffline();
		var B = !!B;
		if (A !== null) {
			transMgr.retryRequest(A)
		}
		if (!B) {
			ug.Dialog.showConnectionLost()
		}
	};
	ug.forceOffline = function() {
		var D = "", A = "hidden", B = "is-connected", E = "is-disconnected", F = "is-syncing";
		el(B).className = A;
		el(F).className = A;
		el(E).className = D;
		this.onStateOffline()
	};
	ug.forceOnline = function() {
		var D = "", A = "hidden", E = "is-connected", B = "is-disconnected", F = "is-syncing";
		el(B).className = A;
		el(F).className = A;
		el(E).className = D;
		this.onStateOnline()
	};
	ug.last_state_ = null;
	ug.switchState = function(D, B) {
		this.last_state_ = this.state_;
		if (this.state_ === 0 && D === 1) {
			ug.UI.showSyncing();
			this.state_ = D;
			if (B) {
				ug.Sync.prepareForOffline()
			} else {
				this.ping(5)
			}
		} else {
			if (this.state_ === 1 && D === 2) {
				ug.UI.showOffline();
				this.onStateOffline()
			} else {
				if ((this.state_ === -1 || this.state_ === 2) && D === 3) {
					ug.UI.showSyncing();
					var A = this.state_ === -1;
					this.state_ = D;
					if (B) {
						ug.Sync.prepareForOnline(A)
					} else {
						this.ping()
					}
				} else {
					if ((this.state_ === -1 || (this.state_ === 1 || this.state_ === 3))
							&& D === 0) {
						if (this.isWaitingManifest()) {
							ug.UI.showSyncing();
							ug.Sync.prepareForOffline(true)
						} else {
							ug.UI.showOnline()
						}
						this.state_ = D;
						this.onStateOnline()
					}
				}
			}
		}
	};
	ug.UI = function() {
	};
	ug.UI.updateListTabs = function() {
		var A = "SELECT * FROM list GROUP BY id ORDER BY filter, position, name, id", B = "listtabs";
		if (rtmIsOffline) {
			delete listTabs;
			listTabs = new XTabs(B);
			listTabs.init();
			var D = ug.DB.fetch(A);
			var E;
			for ( var H = 0, F = D.length; H < F; H++) {
				E = D[H];
				if (!E.deleted && !E.archived) {
					if (E.filter !== null) {
						listTabs.addEntry(E.name, [ 1, E.id * 1, E.filter ])
					} else {
						listTabs.addEntry(E.name, [ 0, E.id * 1 ])
					}
				}
			}
			listTabs.blitDiv()
		}
	};
	ug.UI.showOnline = function() {
		var D = "", A = "hidden", E = "is-connected", B = "is-disconnected", F = "is-syncing";
		el(B).className = A;
		el(F).className = A;
		el(E).className = D
	};
	ug.UI.showSyncing = function() {
		var D = "", E = "INTERFACE_OFFLINE_ICON_SYNC", F = "INTERFACE_OFFLINE_ICON_UPDATING", A = "hidden", J = "is-connected", B = "is-disconnected", I = "is-syncing", H = "title";
		el(B).className = A;
		el(J).className = A;
		if (ug.isWaitingManifest()) {
			el(I).setAttribute(H, _T(F))
		} else {
			el(I).setAttribute(H, _T(E))
		}
		el(I).className = D
	};
	ug.UI.showOffline = function() {
		var D = "", A = "hidden", F = "is-connected", E = "is-disconnected", B = "is-syncing";
		el(B).className = A;
		el(F).className = A;
		el(E).className = D
	};
	ug.Status = function() {
	};
	ug.Status.initialized_ = false;
	ug.Status.initialize = function() {
		var B = "offline-status-box", D = "offline-status-box-content", A = "offline-status-box-shadow";
		this.box_ = el(B);
		this.shadow_ = el(A);
		this.content_ = el(D);
		this.initialized_ = true;
		this.showing_ = null
	};
	ug.Status.showOnline = function() {
		var E = "</a></div>", H = '<br /><br /><a href="#" onclick="Offline.Status.hide(); return false;">', B = "<div>", F = "INTERFACE_OFFLINE_STATUS_DISMISS", A = "INTERFACE_OFFLINE_STATUS_SHOW_READY", D = "is-connected";
		if (!ug.LS.new_manifest_) {
			this.hide();
			return false
		}
		ug.LS.setNewManifest(false);
		this.content_.innerHTML = B + _TF(A) + H + _TF(F) + E;
		this.show(D)
	};
	ug.Status.showOffline = function() {
		var D = "</a></div>", F = '<br/><br/><a href="#" onclick="Offline.Status.hide(); Offline.switchState(3); return false;">', A = "<div>", E = "INTERFACE_OFFLINE_STATUS_GO_ONLINE", H = "INTERFACE_OFFLINE_STATUS_OFFLINE", B = "is-disconnected";
		if (this.showing_ !== B) {
			this.content_.innerHTML = A + _TF(H) + F + _TF(E) + D;
			this.show(B)
		} else {
			this.hide()
		}
	};
	ug.Status.showUpdating = function() {
		var D = "</a></div>", I = "<br/>", F = '<br/><br/><a href="#" onclick="Offline.Status.hide(); return false;">', J = "<div>", E = "INTERFACE_OFFLINE_STATUS_DISMISS", H = "INTERFACE_OFFLINE_STATUS_PLEASE_WAIT", M = "INTERFACE_OFFLINE_STATUS_START", K = "INTERFACE_OFFLINE_STATUS_UPDATING", B = "is-syncing";
		var A = _TF(M, {
			STATUS_MESSAGE : _T(K)
		});
		this.content_.innerHTML = J + A + I + _T(H) + F + _T(E) + D;
		this.show(B)
	};
	ug.Status.showSync = function() {
		var F = "</div>", I = "<br/><br/>", J = "<div>", H = "INTERFACE_OFFLINE_STATUS_PLEASE_WAIT", B = "INTERFACE_OFFLINE_STATUS_START", A = "INTERFACE_OFFLINE_STATUS_SYNC", E = "is-syncing";
		var D = _TF(B, {
			STATUS_MESSAGE : _T(A)
		});
		this.content_.innerHTML = J + D + I + _T(H) + F;
		this.show(E)
	};
	ug.Status.show = function(F) {
		var B = "px", A = "visible";
		var E = Autocomplete.findPosition(el(F));
		var H = E[0];
		var D = E[1];
		this.box_.style.left = H + B;
		this.shadow_.style.left = H + 3 + B;
		var I = this.box_.clientHeight;
		this.shadow_.style.height = I - 6 + B;
		this.box_.style.visibility = A;
		this.shadow_.style.visibility = A;
		this.showing_ = F
	};
	ug.Status.hide = function() {
		var A = "-1000px", B = "hidden";
		this.shadow_.style.visibility = B;
		this.box_.style.visibility = B;
		this.shadow_.style.left = A;
		this.box_.style.left = A;
		this.showing_ = null
	};
	ug.isDiscovery = function() {
		return this.state_ === -1
	};
	ug.isOnline = function() {
		return this.state_ === 0
	};
	ug.isWaitingManifest = function() {
		return !ug.LS.hasManifest()
	};
	ug.isUpdating = function() {
		return this.state_ === 1
	};
	ug.isOffline = function() {
		return this.state_ === 2
	};
	ug.isSyncing = function() {
		return this.state_ === 3
	};
	ug.changeToolboxes = function(J) {
		var H = "contactsToolbox", F = "groupsToolbox", B = "input", E = "listsToolbox", D = "locationsToolbox", A = "select";
		var I = [ H, F, E, D ];
		map(function(M) {
			M = el(M);
			var K = M.getElementsByTagName(B);
			map(function(Q) {
				Q.disabled = J
			}, K);
			var O = M.getElementsByTagName(A);
			map(function(Q) {
				Q.disabled = J
			}, O)
		}, I)
	};
	ug.onStateOffline = function() {
		ug.Status.hide();
		this.state_ = 2;
		ug.LS.enableStore();
		this.disableView();
		clearInterval(this.ping_interval_);
		this.ping_interval_ = null
	};
	ug.online_only_links_ = [ "reset-private-urls" ];
	ug.disableView = function() {
		var E = "INTERFACE_SETTINGS_LISTS_TAB", D = "INTERFACE_SETTINGS_LOCATIONS_TAB", B = "INTERFACE_TASKS_TASK_DETAILS_TAGS", F = "Settings", H = "disabled";
		view.blitSpan();
		configurationMgr.disableAll();
		this.changeToolboxes(true);
		notificationMgr.disable();
		map(function(J) {
			var I = el(J);
			Utility.addClass(I, H)
		}, this.online_only_links_);
		contactsToolbox.disable();
		groupsToolbox.disable();
		listsToolbox.disable();
		locationsToolbox.disable();
		tagToolbox.disable();
		adder.blit();
		tasksView.reflectOffline(true);
		shareMgr.radiogroup.disable();
		publishMgr.radiogroup.disable();
		inviteMgr.disable();
		if (view.getSelected() == F) {
			var A = settingsView.getSelected();
			if (A === _T(E)) {
				control.listsFormat()
			} else {
				if (A === _T(D)) {
					control.locationsFormat()
				} else {
					if (A === _T(B)) {
						control.tagsFormat()
					}
				}
			}
		}
	};
	ug.enableView = function() {
		var E = "INTERFACE_SETTINGS_LISTS_TAB", D = "INTERFACE_SETTINGS_LOCATIONS_TAB", B = "INTERFACE_TASKS_TASK_DETAILS_TAGS", F = "Settings", H = "disabled";
		view.blitSpan();
		configurationMgr.enableAll();
		this.changeToolboxes(false);
		notificationMgr.enable();
		map(function(J) {
			var I = el(J);
			Utility.removeClass(I, H)
		}, this.online_only_links_);
		contactsToolbox.enable();
		groupsToolbox.enable();
		listsToolbox.enable();
		locationsToolbox.enable();
		tagToolbox.enable();
		adder.blit();
		tasksView.reflectOffline(false);
		shareMgr.radiogroup.enable();
		publishMgr.radiogroup.enable();
		inviteMgr.enable();
		if (view.getSelected() == F) {
			var A = settingsView.getSelected();
			if (A === _T(E)) {
				control.listsFormat()
			} else {
				if (A === _T(D)) {
					control.locationsFormat()
				} else {
					if (A === _T(B)) {
						control.tagsFormat()
					}
				}
			}
		}
	};
	ug.onStateOnline = function() {
		if (!this.isWaitingManifest()) {
			ug.UI.showOnline()
		}
		ug.LS.disableStore();
		ug.LS.checkForUpdate();
		this.enableView();
		this.first_ping_ = true;
		this.ping()
	};
	ug.Desktop = function() {
	};
	ug.Desktop.intialize = function() {
		var O = "/", H = "/img/gears/desktop_128x128.png", D = "/img/gears/desktop_16x16.png", E = "/img/gears/desktop_32x32.png", F = "/img/gears/desktop_48x48.png", Q = "GEARS_SHORTCUT", M = "Remember The Milk", R = "beta.desktop", J = "http://", K = "https://", I = "www.rememberthemilk.com/offline";
		var A = null;
		try {
			A = google.gears.factory.create(R)
		} catch (U) {
			A = null
		}
		if (A && getCookie(Q) === null) {
			A.createShortcut(M, (Utility.IS_HTTPS ? K : J) + I, {
				"128x128" : H,
				"48x48" : F,
				"32x32" : E,
				"16x16" : D
			});
			var B = new Date();
			B.setMonth(B.getMonth() + 1);
			setCookie(Q, 1, B, O, null, null)
		}
	};
	ug.initialize = function() {
		var A = "", K = "/", Q = "1.0", M = "GEARS", J = "beta.database", R = "beta.localserver", I = "beta.workerpool", B = "has-gears", F = "hidden", H = "is-connected", D = "is-disconnected", E = "is-syncing", O = "offline-status";
		try {
			this.ls_ = google.gears.factory.create(R, Q);
			this.db_ = google.gears.factory.create(J, Q);
			this.wp_ = google.gears.factory.create(I, Q)
		} catch (U) {
			el(H).className = F;
			el(E).className = F;
			el(D).className = F;
			el(B).className = A;
			el(O).className = A;
			ug.Dialog.initialize();
			return false
		}
		el(O).className = A;
		el(H).onclick = function() {
			ug.Status.hide();
			ug.switchState(1)
		};
		el(D).onclick = function() {
			ug.Status.showOffline()
		};
		if (this.ls_ && (this.db_ && this.wp_)) {
			this.state_ = -1;
			this.initialized_ = true;
			this.unloading_ = false;
			setCookie(M, 1, null, K, null, null);
			return true
		}
		return false
	};
	ug.setUnloading = function(A) {
		this.unloading_ = A
	};
	ug.isUnloading = function() {
		return this.unloading_
	};
	ug.DB = function() {
	};
	ug.DB.initialize = function() {
		this.db_name_ = this.getDatabaseName(rtmUsername);
		this.db_ = ug.db_
	};
	ug.DB.getDatabaseName = function(A) {
		var B = "rtm_";
		return B + A
	};
	ug.DB.fetch = function(D, E) {
		var A = null, F;
		try {
			A = this.db_.execute(D, E);
			F = [];
			if (A && A.isValidRow()) {
				var J = A.fieldCount();
				var I = [];
				for ( var H = 0; H < J; H++) {
					I.push(A.fieldName(H))
				}
				while (A.isValidRow()) {
					var B = {};
					for ( var H = 0; H < J; H++) {
						B[I[H]] = A.field(H)
					}
					F.push(B);
					A.next()
				}
				A.close()
			}
			return F
		} catch (K) {
			if (A) {
				A.close()
			}
			return null
		}
	};
	ug.DB.execute = function(D, A) {
		try {
			this.db_.execute(D, A);
			return true
		} catch (B) {
			return false
		}
	};
	ug.DB.objectExists = function(D, A) {
		var B = "SELECT 1 FROM sqlite_master WHERE type = ? AND name = ?";
		var E = this.fetch(B, [ D, A ]);
		if (E == null || E.length === 0) {
			return false
		}
		return true
	};
	ug.DB.tableExists = function(A) {
		var B = "table";
		return this.objectExists(B, A)
	};
	ug.DB.indexExists = function(A) {
		var B = "index";
		return this.objectExists(B, A)
	};
	ug.DB.VERSIONS_ = {
		task : 1,
		task_participant : 2,
		list : 4,
		note : 1,
		contact : 1,
		grp : 1,
		grp_member : 1,
		location : 1,
		task_series_location : 1,
		tag : 1,
		task_series_tag : 1,
		operation_queue : 1,
		task_addition : 1,
		note_addition : 1,
		offline_session : 1
	};
	ug.DB.VERSION_DDL_ = "CREATE TABLE version (name text, version integer)";
	ug.DB.DDL_ = {
		task : {
			create : "CREATE TABLE task (version integer primary key autoincrement, version_ts timestamp default current_timestamp, id integer, list_id integer, series_id integer, name text, date_created timestamp, date_completed timestamp, date_last_modified timestamp, date_due timestamp, time_due bool, date_added timestamp, priority char(2), postponed integer, estimate text, completed bool, rrule text, rrule_every bool, url text, source text, date_deleted timestamp)",
			indexes : {
				task_id_idx : [ "id" ],
				task_list_id_idx : [ "list_id" ],
				task_date_last_modified_idx : [ "date_last_modified" ],
				task_date_deleted_idx : [ "date_deleted" ]
			}
		},
		task_participant : {
			create : "CREATE TABLE task_participant (version integer primary key autoincrement, version_ts timestamp default current_timestamp, task_version integer, id integer, contact_id integer, contact_first_name text, contact_last_name text, contact_username text, is_shared integer)",
			indexes : {
				task_participant_id_idx : [ "task_version", "id" ]
			},
			transition : {
				v1 : {
					v2 : "ALTER TABLE task_participant ADD COLUMN is_shared integer"
				}
			}
		},
		list : {
			create : "CREATE TABLE list (version integer primary key autoincrement, version_ts timestamp default current_timestamp, id integer, name text, deleted bool, locked bool, archived bool, position integer, filter text, date_created timestamp, date_last_modified timestamp, sort_order integer default 0, syncable integer default 0, token text)",
			indexes : {
				list_id_idx : [ "id" ]
			},
			transition : {
				v1 : {
					v2 : "ALTER TABLE list ADD COLUMN sort_order integer DEFAULT 0"
				},
				v2 : {
					v3 : "ALTER TABLE list ADD COLUMN syncable integer DEFAULT 0"
				},
				v3 : {
					v4 : "ALTER TABLE list ADD COLUMN token TEXT"
				}
			}
		},
		note : {
			create : "CREATE TABLE note (version integer primary key autoincrement, version_ts timestamp default current_timestamp, id integer, task_series_id integer, title text, content text, date_created timestamp, date_deleted timestamp, date_last_modified timestamp)",
			indexes : {
				note_id_idx : [ "id" ],
				note_task_series_id_idx : [ "task_series_id" ]
			}
		},
		contact : {
			create : "CREATE TABLE contact (version integer primary key autoincrement, version_ts timestamp default current_timestamp, id integer, firstname text, lastname text, username text)",
			indexes : {
				contact_id_idx : [ "id" ],
				contact_username_idx : [ "username" ]
			}
		},
		grp : {
			create : "CREATE TABLE grp (version integer primary key autoincrement, version_ts timestamp default current_timestamp, id integer, name text, deleted bool)",
			indexes : {
				grp_id_idx : [ "id" ]
			}
		},
		grp_member : {
			create : "CREATE TABLE grp_member (version integer primary key autoincrement, version_ts timestamp default current_timestamp, grp_version integer, id integer, contact_id integer)",
			indexes : {
				grp_member_id_idx : [ "grp_version", "id" ]
			}
		},
		location : {
			create : "CREATE TABLE location (version integer primary key autoincrement, version_ts timestamp default current_timestamp, id integer, name text, latitude double, longitude double, address text, zoom integer, viewable bool)",
			indexes : {
				location_id_idx : [ "id" ]
			}
		},
		task_series_location : {
			create : "CREATE TABLE task_series_location (version integer primary key autoincrement, version_ts timestamp default current_timestamp, id integer, location_id integer)",
			indexes : {
				task_series_location_id_idx : [ "id", "location_id" ]
			}
		},
		tag : {
			create : "CREATE TABLE tag (version integer primary key autoincrement, version_ts timestamp default current_timestamp, task_series_id integer)",
			indexes : {
				tag_task_series_id_idx : [ "task_series_id" ]
			}
		},
		task_series_tag : {
			create : "CREATE TABLE task_series_tag (version integer primary key autoincrement, version_ts timestamp default current_timestamp, task_series_version integer, task_series_id integer, tag text)",
			indexes : {
				task_series_tag_id_idx : [ "task_series_version",
						"task_series_id", "tag" ]
			}
		},
		operation_queue : {
			create : "CREATE TABLE operation_queue (id integer primary key autoincrement, ts timestamp default current_timestamp, action text, arguments text, sent timestamp, ack timestamp)",
			indexes : {
				operation_queue_ts_idx : [ "ts" ],
				operation_queue_sent_ack_idx : [ "sent", "ack" ]
			}
		},
		task_addition : {
			create : "CREATE TABLE task_addition (task_series_id text primary key, task_id text, ts timestamp default current_timestamp, name text, list_id integer, sent timestamp, ack timestamp, server_task_series_id integer, server_task_id integer)",
			indexes : {
				task_addition_server_task_id_idx : [ "server_task_id" ],
				task_addition_task_id_idx : [ "task_id" ]
			}
		},
		note_addition : {
			create : "CREATE TABLE note_addition (note_id text primary key, ts timestamp default current_timestamp, title text, content text, task_series_id integer, sent timestamp, ack timestamp, server_note_id integer)",
			indexes : {
				note_addition_server_note_id_idx : [ "server_note_id" ],
				note_addition_ts_idx : [ "task_series_id" ]
			}
		},
		offline_session : {
			create : "CREATE TABLE offline_session (session_start timestamp default current_timestamp primary key, session_up timestamp, session_dirty bool, session_end timestamp)",
			indexes : {
				offline_session_end_idx : [ "session_end" ]
			}
		}
	};
	ug.DB.checkDatabaseVersion = function() {
		var AK = " (", O = " ON ", AJ = ")", X = ",", AD = "BEGIN", AH = "COMMIT", R = "CREATE INDEX ", W = "DROP INDEX ", AB = "DROP TABLE ", AC = "DROP TABLE version", AI = "INSERT INTO version VALUES (?, ?)", AL = "SELECT * FROM version", AE = "UPDATE version SET version = ? WHERE name = ?", Z = "indexes", AF = "transition", AG = "v", AN = "version";
		var AM = this.tableExists(AN);
		var H = AM ? this.fetch(AL) : null;
		if (H === null || H.length === 0) {
			this.execute(AD);
			if (AM) {
				this.execute(AC)
			}
			for ( var Q in this.VERSIONS_) {
				var K = this.DDL_[Q].create;
				if (this.tableExists(Q)) {
					this.execute(AB + Q)
				}
				this.execute(K);
				if (Z in this.DDL_[Q]) {
					for ( var I in this.DDL_[Q].indexes) {
						var M = this.DDL_[Q].indexes[I].join(X);
						if (this.indexExists(I)) {
							this.execute(W + I)
						}
						this.execute(R + I + O + Q + AK + M + AJ)
					}
				}
			}
			this.execute(this.VERSION_DDL_);
			for ( var Q in this.VERSIONS_) {
				this.execute(AI, [ Q, this.VERSIONS_[Q] ])
			}
			this.execute(AH);
			H = this.fetch(AL)
		} else {
			for ( var J = 0, AA = H.length; J < AA; J++) {
				if (H[J].name in this.VERSIONS_
						&& this.VERSIONS_[H[J].name] !== H[J].version) {
					var Y = H[J].name;
					var U = AG + H[J].version;
					var V = AG + this.VERSIONS_[Y];
					if (Y in this.DDL_
							&& (AF in this.DDL_[Y] && (this.DDL_[Y][AF][U] && this.DDL_[Y][AF][U][V]))) {
						this.execute(AD);
						this.execute(this.DDL_[Y][AF][U][V]);
						this.execute(AE, [ this.VERSIONS_[Y], Y ]);
						this.execute(AH)
					}
				}
			}
		}
	};
	ug.DB.open = function() {
		var A = "SELECT 1";
		this.db_.open(this.db_name_);
		this.fetch(A);
		this.checkDatabaseVersion()
	};
	ug.DB.close = function() {
		this.db_.close()
	};
	ug.DB.dropAll = function() {
		var B = "DROP TABLE ", A = "DROP TABLE version";
		for ( var D in this.VERSIONS_) {
			this.execute(B + D)
		}
		this.execute(A)
	};
	ug.DB.prune = function() {
		var H = " WHERE version <= ?", B = "BEGIN", F = "COMMIT", A = "DELETE FROM ";
		if (!rtmIsOffline && ug.can_prune_ !== null) {
			this.execute(B);
			for ( var D in ug.can_prune_) {
				var E = ug.can_prune_[D];
				if (E !== null) {
					this.execute(A + D + H, [ E ])
				}
			}
			this.execute(F);
			ug.can_prune_ = null
		}
	};
	ug.LS = function() {
	};
	ug.LS.initialize = function() {
		this.ls_ = ug.ls_;
		this.bv_ = 127;
		this.check_interval_ = null;
		this.new_manifest_ = false
	};
	ug.LS.onPingSuccess = function(A) {
		this.disableStore();
		if (A) {
			this.monitorUpdate(A)
		}
	};
	ug.LS.hasManifest = function() {
		var A = "";
		return this.store_ && this.store_.currentVersion != A
	};
	ug.LS.setNewManifest = function(A) {
		this.new_manifest_ = A
	};
	ug.LS.monitorUpdate = function(B) {
		if (this.check_interval_ === null) {
			var A = this.store_.currentVersion;
			if (B) {
				this.removeStore();
				this.prepareStore(true)
			}
			this.checkForUpdate();
			ug.updated_ = 0;
			this.check_interval_ = setInterval(function() {
				var D = ug.LS.store_;
				if (!D) {
					clearInterval(ug.LS.check_interval_);
					ug.LS.check_interval_ = null;
					return false
				}
				if (D.currentVersion !== A && D.updateStatus === 0) {
					clearInterval(ug.LS.check_interval_);
					ug.LS.check_interval_ = null;
					if (ug.isOnline() && B) {
						ug.LS.disableStore();
						window.location.reload(true)
					}
					ug.updated_ = 1;
					ug.LS.new_manifest_ = true
				} else {
					if (D.currentVersion === A
							&& (D.updateStatus === 0 || D.updateStatus === 3)) {
						clearInterval(ug.LS.check_interval_);
						ug.LS.check_interval_ = null;
						ug.updated_ = D.updateStatus === 0 ? 1 : 2
					} else {
					}
				}
			}, B ? 5 * 1000 : 200)
		} else {
		}
	};
	ug.LS.removeStore = function() {
		var A = "RTM";
		this.ls_.removeManagedStore(A)
	};
	ug.LS.prepareStore = function(B) {
		var H = "&bv=", F = "&pv=", D = "&ts=", E = "&ui=", K = "/offline-manifest.json", I = "/services/googlegears/manifest.rtm?lang=", J = "RTM", M = "RTM_offline";
		var B = !!B;
		var A = (new Date()).getTime();
		this.offline_store_ = this.ls_.createManagedStore(M);
		if (this.offline_store_) {
			this.offline_store_.manifestUrl = K;
			this.offline_store_.checkForUpdate();
			this.offline_store_.enabled = true
		}
		this.store_ = this.ls_.createManagedStore(J);
		this.store_.manifestUrl = I + rtmLanguage + H + this.bv_ + F + version
				+ E + rtmUIVersion + D + A;
		if (!B) {
			ug.LS.monitorUpdate(false)
		}
	};
	ug.LS.enableStore = function() {
		if (this.store_) {
			this.store_.enabled = true
		}
	};
	ug.LS.disableStore = function() {
		if (this.store_) {
			this.store_.enabled = false
		}
	};
	ug.LS.checkForUpdate = function() {
		this.store_.checkForUpdate()
	};
	ug.WP = function() {
	};
	ug.WP.initialize = function() {
		this.wp_ = ug.wp_
	};
	ug.prepareGears = function() {
		ug.DB.initialize();
		ug.DB.open();
		ug.Dialog.initialize();
		ug.Status.initialize();
		ug.LS.initialize();
		ug.LS.prepareStore();
		ug.WP.initialize();
		if (rtmIsOffline) {
			ug.UI.updateListTabs();
			ug.Sync.interceptDispatch()
		}
	};
	ug.isReady = function() {
		return this.initialized_
	};
	ug.Sync = function() {
	};
	ug.Sync.startup_ = false;
	ug.Sync.setStartup = function(B, A) {
		this.startup_ = B;
		if (B === true) {
			this.startSession(A)
		} else {
			this.setSessionUp()
		}
	};
	ug.Sync.isStartup = function() {
		return this.startup_
	};
	ug.Sync.conditionalDirty = function() {
		if (!this.isStartup()) {
			this.setSessionDirty()
		}
	};
	ug.Sync.TASK_INSERT_ = "INSERT INTO task (id, list_id, series_id, name, date_created, date_completed, date_last_modified, date_due, time_due, date_added, priority, postponed, estimate, completed, rrule, rrule_every, url, source, date_deleted) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	ug.Sync.TASK_PARTICIPANT_INSERT_ = "INSERT INTO task_participant (task_version, id, contact_id, contact_first_name, contact_last_name, contact_username, is_shared) VALUES (?, ?, ?, ?, ?, ?, ?)";
	ug.Sync.updateTask = function(B) {
		var J = "SELECT version FROM task WHERE rowid = ?", K = "date_deleted";
		this.conditionalDirty();
		var E = B.reoccur ? B.reoccur[0] : null;
		var D = B.reoccur ? B.reoccur[1] : null;
		ug.DB.execute(this.TASK_INSERT_, [ B.id, B.list_id, B.series_id,
				B.name, B.date_created, B.date_completed, B.date_last_modified,
				B.date_due, B.time_due, B.date_added, B.priority, B.postponed,
				B.estimate, B.completed, E, D, B.url, B.source,
				K in B ? B.date_deleted : null ]);
		if (B.participants && B.participants.length > 0) {
			var A = ug.DB.fetch(J, [ ug.DB.db_.lastInsertRowId ]);
			if (A && A.length > 0) {
				A = A[0].version;
				var F;
				for ( var I = 0, H = B.participants.length; I < H; I++) {
					F = B.participants[I];
					ug.DB.execute(this.TASK_PARTICIPANT_INSERT_, [ A, B.id,
							F.person_id, F.person_first_name,
							F.person_last_name, F.person_username,
							F.is_shared ? 1 : 0 ])
				}
			}
		}
	};
	ug.Sync.isWritable = function() {
		return !this.isStartup()
				|| (!rtmIsOffline || rtmIsOffline && this.isDirty())
	};
	ug.Sync.updateTasks = function(H, D) {
		var B = "BEGIN", A = "COMMIT";
		if (!this.isWritable()) {
			return false
		}
		if (H === null || H.length === 0) {
			return false
		}
		ug.DB.execute(B);
		for ( var F = 0, E = H.length; F < E; F++) {
			this.updateTask(H[F])
		}
		ug.DB.execute(A)
	};
	ug.Sync.LIST_INSERT_ = "INSERT INTO list (id, name, deleted, locked, archived, position, filter, date_created, date_last_modified, sort_order, syncable, token) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	ug.Sync.updateList = function(A) {
		this.conditionalDirty();
		ug.DB.execute(this.LIST_INSERT_, [ A.id, A.name, A.deleted ? 1 : 0,
				A.locked ? 1 : 0, A.archived ? 1 : 0, A.position, A.filter,
				A.date_created, A.date_last_modified, A.sort_order, A.syncable,
				A.token ])
	};
	ug.Sync.updateLists = function(F) {
		var B = "BEGIN", A = "COMMIT";
		if (!this.isWritable()) {
			return false
		}
		ug.DB.execute(B);
		for ( var E = 0, D = F.length; E < D; E++) {
			this.updateList(F[E])
		}
		ug.DB.execute(A)
	};
	ug.Sync.NOTE_INSERT_ = "INSERT INTO note (id, task_series_id, title, content, date_created, date_deleted, date_last_modified) VALUES (?, ?, ?, ?, ?, ?, ?)";
	ug.Sync.updateNote = function(A) {
		this.conditionalDirty();
		ug.DB.execute(this.NOTE_INSERT_,
				[ A.id, A.task_series_id, A.title, A.content, A.date_created,
						A.date_deleted, A.date_last_modified ])
	};
	ug.Sync.updateNotes = function(F) {
		var B = "BEGIN", A = "COMMIT";
		if (!this.isWritable()) {
			return false
		}
		ug.DB.execute(B);
		for ( var E = 0, D = F.length; E < D; E++) {
			this.updateNote(F[E])
		}
		ug.DB.execute(A)
	};
	ug.Sync.CONTACT_INSERT_ = "INSERT INTO contact (id, firstname, lastname, username) VALUES (?, ?, ?, ?)";
	ug.Sync.updateContact = function(A) {
		this.conditionalDirty();
		ug.DB.execute(this.CONTACT_INSERT_, [ A.id, A.firstname, A.lastname,
				A.username ])
	};
	ug.Sync.updateContacts = function(F) {
		var B = "BEGIN", A = "COMMIT";
		if (!this.isWritable()) {
			return false
		}
		ug.DB.execute(B);
		for ( var E = 0, D = F.length; E < D; E++) {
			this.updateContact(F[E])
		}
		ug.DB.execute(A)
	};
	ug.Sync.GROUP_INSERT_ = "INSERT INTO grp (id, name, deleted) VALUES (?, ?, ?)";
	ug.Sync.GROUP_MEMBER_INSERT_ = "INSERT INTO grp_member (grp_version, id, contact_id) VALUES (?, ?, ?)";
	ug.Sync.updateGroup = function(H) {
		var A = "SELECT version FROM grp WHERE rowid = ?", B = "deleted";
		this.conditionalDirty();
		ug.DB.execute(this.GROUP_INSERT_, [ H.id, H.name,
				B in H ? H.deleted : null ]);
		if (H.members && H.members.length > 0) {
			var D = ug.DB.fetch(A, [ ug.DB.db_.lastInsertRowId ]);
			if (D && D.length > 0) {
				D = D[0].version;
				for ( var F = 0, E = H.members.length; F < E; F++) {
					ug.DB.execute(this.GROUP_MEMBER_INSERT_, [ D, H.id,
							H.members[F].contact_id ])
				}
			}
		}
	};
	ug.Sync.updateGroups = function(F) {
		var B = "BEGIN", A = "COMMIT";
		if (!this.isWritable()) {
			return false
		}
		ug.DB.execute(B);
		for ( var E = 0, D = F.length; E < D; E++) {
			this.updateGroup(F[E])
		}
		ug.DB.execute(A)
	};
	ug.Sync.LOCATION_INSERT_ = "INSERT INTO location (id, name, latitude, longitude, address, zoom, viewable) VALUES (?, ?, ?, ?, ?, ?, ?)";
	ug.Sync.updateLocation = function(A) {
		this.conditionalDirty();
		ug.DB.execute(this.LOCATION_INSERT_, [ A.id, A.name, A.latitude,
				A.longitude, A.address, A.zoom, A.viewable ])
	};
	ug.Sync.updateLocations = function(E) {
		var B = "BEGIN", A = "COMMIT";
		if (!this.isWritable()) {
			return false
		}
		ug.DB.execute(B);
		for ( var D in E) {
			this.updateLocation(E[D])
		}
		ug.DB.execute(A)
	};
	ug.Sync.LOCATION_TS_INSERT_ = "INSERT INTO task_series_location (id, location_id) VALUES (?, ?)";
	ug.Sync.updateLocationTaskSeries_ = function(B, A) {
		this.conditionalDirty();
		ug.DB.execute(this.LOCATION_TS_INSERT_, [ B, A ])
	};
	ug.Sync.updateLocationTaskSeries = function(E) {
		var B = "BEGIN", A = "COMMIT";
		if (!this.isWritable()) {
			return false
		}
		ug.DB.execute(B);
		for ( var D in E) {
			this.updateLocationTaskSeries_(D, E[D])
		}
		ug.DB.execute(A)
	};
	ug.Sync.TAG_INSERT_ = "INSERT INTO tag (task_series_id) VALUES (?)";
	ug.Sync.TASK_SERIES_TAG_INSERT_ = "INSERT INTO task_series_tag (task_series_version, task_series_id, tag) VALUES (?, ?, ?)";
	ug.Sync.updateTag = function(E, F) {
		var B = "SELECT version FROM tag WHERE rowid = ?";
		this.conditionalDirty();
		ug.DB.execute(this.TAG_INSERT_, [ E ]);
		if (F && F.length > 0) {
			var D = ug.DB.fetch(B, [ ug.DB.db_.lastInsertRowId ]);
			if (D && D.length > 0) {
				D = D[0].version;
				for ( var A = 0, H = F.length; A < H; A++) {
					ug.DB.execute(this.TASK_SERIES_TAG_INSERT_, [ D, E, F[A] ])
				}
			}
		}
	};
	ug.Sync.updateTags = function(J) {
		var B = "BEGIN", A = "COMMIT";
		if (!this.isWritable()) {
			return false
		}
		var D = {}, E;
		for ( var F in J) {
			for ( var I = 0, H = J[F].length; I < H; I++) {
				E = J[F][I];
				if (E in D) {
					D[E].push(F)
				} else {
					D[E] = [ F ]
				}
			}
		}
		ug.DB.execute(B);
		for ( var E in D) {
			ug.Sync.updateTag(E, D[E])
		}
		ug.DB.execute(A)
	};
	ug.Sync.prepare_offline_interval_ = null;
	ug.Sync.prepareForOffline = function(A) {
		var A = !!A;
		if (A) {
			ug.Status.showUpdating()
		} else {
			ug.Status.showSync()
		}
		if (A) {
			if (this.prepare_offline_interval_ === null) {
				ug.LS.monitorUpdate(false);
				this.prepare_offline_interval_ = setInterval(function() {
					if (ug.updated_ !== 0) {
						clearInterval(ug.Sync.prepare_offline_interval_);
						ug.Sync.prepare_offline_interval_ = null;
						ug.UI.showOnline();
						ug.Status.showOnline()
					}
				}, 100)
			}
		} else {
			ug.Sync.refreshAllData()
		}
	};
	ug.cancelOffline = function() {
		clearInterval(ug.Sync.prepare_offline_interval_);
		ug.Sync.prepare_offline_interval_ = null;
		this.switchState(0)
	};
	ug.Sync.refreshAllData = function() {
		var D = [], B;
		for ( var A in stateMgr.lists) {
			B = stateMgr.lists[A];
			if (!B.deleted && (!B.archived && (!B.queued && B.filter === null))) {
				D.push(A)
			}
		}
		control.doListsLoad(D, true)
	};
	ug.Sync.onSyncDataReady = function() {
		ug.switchState(2)
	};
	ug.Sync.QUEUE_SELECT_ = "SELECT * FROM operation_queue WHERE sent IS NULL AND ack IS NULL ORDER BY id ASC";
	ug.Sync.QUEUE_SYNC_SELECT_ = "SELECT id, ts, action, arguments FROM operation_queue WHERE sent IS NULL AND ack IS NULL ORDER BY id ASC";
	ug.Sync.TASK_ADDITION_SELECT_ = "SELECT * FROM task_addition WHERE ts >= ? AND sent IS NULL AND ack IS NULL ORDER BY rowid ASC";
	ug.Sync.NOTE_ADDITION_SELECT_ = "SELECT * FROM note_addition WHERE ts >= ? AND sent IS NULL AND ack IS NULL ORDER BY rowid ASC";
	ug.Sync.hasPendingOperations = function() {
		var A = ug.DB.fetch(this.QUEUE_SYNC_SELECT_);
		if (A && A.length > 0) {
			return true
		}
		return false
	};
	ug.Sync.prepareForOnline = function(H) {
		var B = "offline.sync";
		ug.Status.showSync();
		H = !!H;
		var E = ug.DB.fetch(this.QUEUE_SYNC_SELECT_);
		if (E.length > 0) {
			var A = E[0].ts;
			var D = ug.DB.fetch(this.TASK_ADDITION_SELECT_, [ A ]);
			var F = ug.DB.fetch(this.NOTE_ADDITION_SELECT_, [ A ]);
			transMgr.request(B, Utility.toJSON( {
				initial_sync : H,
				st : this.getSessionStart(),
				ts : (new Date()).getTime(),
				task_additions : D,
				note_additions : F,
				operations : E
			}))
		} else {
			ug.Status.hide();
			ug.switchState(0);
			if (!H) {
				this.refreshAllData()
			}
		}
	};
	ug.Sync.QUEUE_INSERT_ = "INSERT INTO operation_queue (action, arguments) VALUES (?, ?)";
	ug.Sync.queueOperation = function(A, B) {
		ug.DB.execute(this.QUEUE_INSERT_, [ A, B ])
	};
	ug.Sync.QUEUE_CLEAR_ = "DELETE FROM operation_queue";
	ug.Sync.clearQueue = function() {
		ug.DB.execute(this.QUEUE_CLEAR_)
	};
	ug.Sync.START_SESSION_ = "INSERT INTO offline_session DEFAULT VALUES";
	ug.Sync.SESSION_SELECT_ = "SELECT session_start FROM offline_session WHERE rowid = ?";
	ug.Sync.session_start_ = null;
	ug.Sync.startSession = function(D) {
		var B = "SELECT max(version) AS max FROM ";
		ug.DB.execute(this.START_SESSION_);
		var A = ug.DB
				.fetch(this.SESSION_SELECT_, [ ug.DB.db_.lastInsertRowId ]);
		if (A && A.length > 0) {
			this.session_start_ = A[0].session_start
		}
		if (!rtmIsOffline && !ug.Sync.hasPendingOperations()) {
			ug.can_prune_ = {};
			var F = {
				operation_queue : 1,
				task_addition : 1,
				note_addition : 1,
				offline_session : 1
			};
			for ( var E in ug.DB.VERSIONS_) {
				if (E in F) {
					continue
				}
				var H = ug.DB.fetch(B + E);
				if (H && H.length > 0) {
					H = H[0].max;
					ug.can_prune_[E] = H
				}
			}
		}
	};
	ug.Sync.setSessionUp = function() {
		var B = "UPDATE offline_session SET session_up = CURRENT_TIMESTAMP WHERE session_start = ?";
		var A = this.getSessionStart();
		if (A) {
			ug.DB.execute(B, [ A ]);
			ug.DB.prune()
		}
	};
	ug.Sync.last_session_dirty_ = null;
	ug.Sync.isLastSessionDirty = function() {
		var B = "SELECT session_dirty FROM task ORDER BY session_start DESC LIMIT 1";
		if (this.last_session_dirty_ !== null) {
			return this.last_session_dirty_
		}
		var A = ug.DB.fetch(B);
		if (A && A.length > 0) {
			A = A[0];
			if (A.session_dirty) {
				this.last_session_dirty_ = true
			} else {
				this.last_session_dirty_ = false
			}
		}
		return this.last_session_dirty_
	};
	ug.Sync.session_dirty_ = false;
	ug.Sync.setSessionDirty = function() {
		var B = "UPDATE offline_session SET session_dirty = 1 WHERE session_start = ?";
		if (this.session_dirty_) {
			return false
		}
		var A = this.getSessionStart();
		if (A) {
			ug.DB.execute(B, [ A ]);
			this.session_dirty_ = true
		}
	};
	ug.Sync.getSessionStart = function() {
		return this.session_start_
	};
	ug.Sync.QUEUE_ACK_ = "UPDATE operation_queue SET ack = CURRENT_TIMESTAMP WHERE id = ?";
	ug.Sync.onSyncDone = function(F, D, I, A, B) {
		var K = "BEGIN", J = "COMMIT";
		if (D && D.length > 0) {
			ug.DB.execute(K);
			for ( var H = 0, E = D.length; H < E; H++) {
				ug.DB.execute(this.QUEUE_ACK_, [ D[H] ])
			}
			ug.DB.execute(J)
		}
		ug.Sync.remapTasks(A);
		ug.Sync.remapNotes(B);
		ug.Status.hide();
		ug.switchState(0);
		if (I && I.length > 0) {
		} else {
			if (!F) {
				this.refreshAllData()
			}
		}
	};
	ug.Sync.remapTasks = function(B) {
		var z = "BEGIN", O = "COMMIT", Q = "UPDATE note SET task_series_id = ? WHERE task_series_id = ?", V = "UPDATE tag SET task_series_id = ? WHERE task_series_id = ?", Y = "UPDATE task SET id = ? WHERE id = ?", W = "UPDATE task SET series_id = ? WHERE series_id = ?", Z = "UPDATE task_addition SET ack = CURRENT_TIMESTAMP, server_task_series_id = ?, server_task_id = ? WHERE task_series_id = ? AND task_id = ?", X = "UPDATE task_participant SET id = ? WHERE id = ?", R = "UPDATE task_series_location SET id = ? WHERE id = ?", U = "UPDATE task_series_tag SET task_series_id = ? WHERE task_series_id = ?";
		var M, J, D, K, E;
		var A = {};
		ug.DB.execute(z);
		for ( var I = 0, H = B.length; I < H; I++) {
			M = B[I];
			J = M[0][0];
			D = M[0][1];
			K = M[1][0];
			E = M[1][1];
			A[J] = D;
			if (K in stateMgr.tasks && stateMgr.tasks[K] !== null) {
				stateMgr.tasks[E] = stateMgr.tasks[K];
				stateMgr.tasks[E].series_id = D;
				stateMgr.tasks[K] = null
			}
			ug.DB.execute(Z, [ D, E, J, K ]);
			ug.DB.execute(Y, [ E, K ]);
			ug.DB.execute(X, [ E, K ]);
			taskList.taskUpdateId(K, E)
		}
		for (J in A) {
			D = A[J];
			ug.DB.execute(W, [ D, J ]);
			ug.DB.execute(V, [ D, J ]);
			ug.DB.execute(U, [ D, J ]);
			ug.DB.execute(R, [ D, J ]);
			ug.DB.execute(Q, [ D, J ]);
			for ( var F in stateMgr.notes) {
				if (stateMgr.notes[F].series_id == J) {
					stateMgr.notes[F].series_id = D
				}
			}
		}
		ug.DB.execute(O);
		taskList.reflectMaps()
	};
	ug.Sync.remapNotes = function(B) {
		var M = "BEGIN", I = "COMMIT", K = "UPDATE note SET id = ? WHERE id = ?", J = "UPDATE note_addition SET ack = CURRENT_TIMESTAMP, server_note_id = ? WHERE note_id = ?";
		var H, F, A;
		ug.DB.execute(M);
		for ( var E = 0, D = B.length; E < D; E++) {
			H = B[E];
			F = H[0];
			A = H[1];
			if (F in stateMgr.notes) {
				stateMgr.notes[A] = stateMgr.notes[F];
				stateMgr.notes[F] = {
					date_deleted : 1
				}
			}
			ug.DB.execute(K, [ A, F ]);
			ug.DB.execute(J, [ A, F ])
		}
		ug.DB.execute(I)
	};
	ug.Backend = function() {
	};
	ug.Backend.TASK_ADDITION_INSERT_ = "INSERT INTO task_addition (task_series_id, task_id, name, list_id) VALUES (?, ?, ?, ?)";
	ug.Backend.addTask = function(AL) {
		var Af = "<", Ae = ">", Ad = "P", Ak = "PN", Ab = "_", Aa = "_task_", AW = "due", Ai = "estimate", AZ = "js", AV = "list", AT = "listId", AR = "location", AY = "parse_data", AQ = "priority", Ag = "repeat", AN = "tag", Ac = "task_series_", Ah = "timeEstimate", AO = "url", Aj = "view_props";
		var AD = AL.id;
		var U = AL.list;
		var Al = AL.name;
		var R = false;
		var X = null, O = false, AU = null, AB = Ak, Z = null, AP = [];
		var AG = null, AM = null;
		var H = null, AA = null;
		var AX = null;
		if (Aj in AL) {
			AX = AL.view_props
		}
		if (AY in AL) {
			var AI = AL.parse_data;
			var AJ = AI[1];
			if (AJ[0] !== null) {
				H = AJ[0];
				Al = H
			}
			if (AX === null) {
				AX = []
			}
			if (AJ[1] !== null && AJ[2] !== null) {
				AA = AJ[2];
				AX.unshift( [ AW, AA ])
			}
			var AK = AI[2];
			if (AK !== null) {
				for ( var W = 0, V = AK.length; W < V; W++) {
					var I = AK[W];
					var AC = I[0];
					var J = I[1];
					switch (AC) {
					case AV:
						AX.unshift( [ AT, I[2] ]);
						break;
					case AR:
						AX.unshift( [ AR, I[1] ]);
						break;
					case AQ:
						AX.unshift( [ AQ, I[1] ]);
						break;
					case AO:
						AX.unshift( [ AO, I[1] ]);
						break;
					case AN:
						AX.unshift( [ AN, I[1] ]);
						break;
					case Ai:
						AX.unshift( [ Ah, I[1] ]);
						break;
					case Ag:
						AX.unshift( [ Ag, I[2] ]);
						break
					}
				}
			}
			if (AX.length === 0) {
				AX = null
			}
		}
		if (AX != null) {
			var K = {};
			var AE = null;
			for ( var W = 0, V = AX.length; W < V; W++) {
				var Q = AX[W][0];
				var AH = AX[W][1];
				switch (Q) {
				case AT:
					if (!(AT in K)) {
						if (AH in stateMgr.lists
								&& (stateMgr.lists[AH] && !stateMgr.lists[AH].deleted)) {
							AE = AH;
							R = true;
							K[AT] = 1
						}
					}
					break;
				case AW:
					if (!(AW in K)) {
						X = AH[0];
						O = !!AH[1];
						R = true;
						K[AW] = 1
					}
					break;
				case Ah:
					if (!(Ah in K)
							&& (AH.indexOf(Af) === -1 && AH.indexOf(Ae) === -1)) {
						AU = AH;
						R = true;
						K[Ah] = 1
					}
					break;
				case AQ:
					AH *= 1;
					if (!(AQ in K) && (AH >= 1 && AH <= 3)) {
						AB = Ad + AH;
						R = true;
						K[AQ] = 1
					}
					break;
				case AR:
					if (!(AR in K)) {
						Z = locationMgr.getLocationForName(AH);
						if (Z) {
							R = true
						}
						K[AR] = 1
					}
					break;
				case Ag:
					if (!(Ag in K)) {
						AM = AH;
						R = true;
						K[Ag] = 1
					}
					break;
				case AO:
					if (!(AO in K)) {
						AG = AH;
						R = true;
						K[AO] = 1
					}
					break;
				case AN:
					AP.push(AH);
					R = true;
					break;
				default:
					break
				}
			}
			if (AE !== null) {
				U = AE
			}
		}
		U = stateMgr.getListForViewProps(U);
		var AF = hex_sha1(Ac + (new Date()).getTime() + Ab
				+ Utility.getRandomInt(987654321));
		var AS = hex_sha1(AF + Aa + (new Date()).getTime());
		ug.DB.execute(this.TASK_ADDITION_INSERT_, [ AF, AS, Al, U ]);
		var Y = (new Date()).getTime();
		Y /= 1000;
		var M = {
			list_id : U,
			id : AS,
			series_id : AF,
			name : Al,
			date_created : Y,
			date_completed : null,
			date_last_modified : null,
			date_due : X,
			time_due : O,
			date_added : Y,
			priority : AB,
			postponed : 0,
			estimate : AU,
			participants : null,
			completed : false,
			reoccur : AM,
			url : AG,
			source : AZ
		};
		if (R) {
			if (Z) {
				locationMgr.updateSeriesLocation(AF, Z)
			}
			if (AP.length > 0) {
				tagMgr.updateTaskSeries( [ AF ], [ [], AP, [] ])
			}
		}
		control.addingListAddSuccess(null, M.id, T(t, [ M ], {}));
		return [ AF, AS ]
	};
	ug.Backend.setTags = function(W) {
		var a = "", Z = ", ";
		var H = W.tags;
		var U, F;
		if (H.length === 0) {
			U = [];
			F = a
		} else {
			U = TagAutocompleteStore.prototype.splitStem(H);
			U.sort();
			new_exploded = [];
			map(function(b) {
				if (b.length !== 0) {
					new_exploded.push(b)
				}
			}, U);
			U = new_exploded;
			F = U.join(Z)
		}
		var V, O, K;
		V = [];
		O = [];
		K = [];
		var R = {};
		map(function(b) {
			R[b] = 1
		}, U);
		var X = W.append;
		var Q = false;
		var D = W.task;
		var E = 0;
		for ( var B in D) {
			E++
		}
		var M = false;
		if (E > 1) {
			X = true;
			Q = true
		}
		if (U.length === 0) {
			M = true
		}
		var J = [];
		for ( var B in D) {
			if (X) {
				V = [];
				O = [];
				K = []
			}
			var A = tagMgr.getTagsForTaskSeries(B);
			var I = {};
			map(function(b) {
				I[b] = 1;
				if ((!X || (M || Q)) && !(b in R)) {
					K.push(b)
				}
				V.push(b)
			}, A);
			map(function(b) {
				if (b in I) {
					V.push(b)
				} else {
					O.push(b)
				}
			}, U);
			if (X) {
				V = V.unique();
				O = O.unique();
				K = K.unique();
				J.push( [ V, O, K ])
			}
		}
		if (!X) {
			V = V.unique();
			O = O.unique();
			K = K.unique()
		}
		if (O.length > 0) {
			F = O.join(Z)
		} else {
			if (!X && K.length > 0) {
				F = a
			}
		}
		var Y;
		if (!X) {
			J.push( [ V, O, K ])
		}
		var Y = [ -1, W.list, W.task, F, J ];
		control.tasksDetailsTagsDone(Y)
	};
	ug.Backend.handle = function(I, AC) {
		var a = "0", AA = "_smart_list", J = "lists.addSmartList", M = "lists.setFilter", K = "lists.setSyncable", AJ = "location", U = "notes.add", O = "notes.delete", Q = "notes.edit", X = "tasks.add", AL = "tasks.complete", Y = "tasks.delete", AB = "tasks.movePriorityDown", AD = "tasks.movePriorityUp", W = "tasks.moveTo", R = "tasks.postpone", V = "tasks.setDueDate", AM = "tasks.setEstimate", AN = "tasks.setLocation", Z = "tasks.setName", AH = "tasks.setPriority1", AG = "tasks.setPriority2", AF = "tasks.setPriority3", AE = "tasks.setPriorityNone", AI = "tasks.setReoccurrence", b = "tasks.setTags", H = "tasks.setURL", AK = "tasks.uncomplete";
		switch (I) {
		case AL:
			control.tasksCompleted( [ -1, AC.tasks, [] ]);
			break;
		case AK:
			control.tasksUncompleted( [ -1, AC.tasks ]);
			break;
		case W:
			control.tasksMoved( [ -1, AC ]);
			break;
		case X:
			return this.addTask(AC);
			break;
		case V:
			control.tasksDetailsDueDone( [ -1, AC.task, AC.dueDateEpoch,
					AC.timeSpec ]);
			break;
		case R:
			control.tasksPostponed( [ -1, AC.tasks ]);
			break;
		case AM:
			control.tasksDetailsDurationDone( [ -1, AC.task, AC.estimate ]);
			break;
		case H:
			control.tasksDetailsURLDone( [ -1, AC.task, AC.url ]);
			break;
		case b:
			this.setTags(AC);
			break;
		case AN:
			control.tasksDetailsLocationDone( [ -1, AC.task, AC[AJ] ]);
			break;
		case AI:
			control.tasksDetailsReoccurrenceDone( [ -1, AC.list, AC.task,
					reoccurMgr.convertRrule(AC.rrule) ]);
			break;
		case AH:
		case AG:
		case AF:
		case AE:
		case AD:
		case AB:
			window.setTimeout(function() {
				control.tasksSetPriority( [ -1, AC.tasks ])
			}, 0);
			break;
		case Z:
			control.tasksRenamed( [ -1, AC.task, AC.name ]);
			break;
		case Y:
			control.tasksDeleted( [ -1, AC.tasks ]);
			break;
		case U:
			this.addNote(AC, false);
			break;
		case Q:
			this.addNote(AC, true);
			break;
		case O:
			control.notesDeleteSuccess( [ -1, AC.note ]);
			break;
		case M:
			control.listsSetFilterSuccess( [ -1, AC.list_id, AC.filter ]);
			break;
		case K:
			Control.updateListSyncable(AC.list_id, AC.syncable);
			break;
		case J:
			window.setTimeout(function() {
				var B = (new Date()).getTime() / 1000;
				listList.list.setAdvise(true);
				var A = hex_sha1(B + AA);
				control.createSmartList( {
					id : A,
					name : AC.name,
					deleted : false,
					locked : false,
					archived : false,
					position : a,
					filter : AC.filter,
					date_created : B,
					date_last_modified : B,
					sort_order : 0
				});
				listList.addList(stateMgr.lists[A]);
				listList.list.tableBlitRows();
				listList.list.setAdvise(false);
				listList.list.sort()
			}, 0);
			break
		}
	};
	ug.Backend.NOTE_ADDITION_INSERT_ = "INSERT INTO note_addition (note_id, title, content, task_series_id) VALUES (?, ?, ?, ?)";
	ug.Backend.addNote = function(B, H) {
		for ( var D in B.task) {
		}
		if (!H) {
			ug.DB.execute(this.NOTE_ADDITION_INSERT_, [ B.hash, B.title,
					B.content, D ])
		}
		var A = (new Date()).getTime();
		A /= 1000;
		var F;
		if (H) {
			F = B.note
		} else {
			F = B.hash
		}
		var E = {
			task_series_id : D,
			id : F,
			title : B.title,
			content : B.content,
			date_created : A,
			date_deleted : null,
			date_last_modified : A
		};
		N(n, [ E ]);
		control.notesAddSuccess( [ F, H ? null : B.hash ])
	};
	ug.ping_interval_ = null;
	ug.ping = function(A) {
		var B = "offline.ping";
		if (this.ping_interval_ !== null) {
			clearInterval(this.ping_interval_);
			this.ping_interval_ = null
		}
		this.ping_interval_ = setInterval(function() {
			if (!ug.in_ping_) {
				transMgr.request(B, Utility.toJSON( {
					start : ug.start_
				}), 30, true)
			}
		}, 30 * 1000);
		if (!ug.in_ping_) {
			transMgr.request(B, Utility.toJSON( {
				start : this.start_
			}), A, false)
		}
	};
	ug.onPingSuccess = function(E, D, A) {
		var B = "/help/loggedout.rtm";
		this.in_ping_ = false;
		if (this.first_ping_ && this.isDiscovery()) {
			if (D === null) {
				return ug.Dialog.showLoggedOut()
			} else {
				if (D !== rtmUsername) {
					window.location = B
				}
			}
			this.switchState(3, true)
		} else {
			if (this.state_ === 3) {
				if (D === null) {
					return ug.Dialog.showLoggedOut()
				} else {
					if (D !== rtmUsername) {
						window.location = B
					}
				}
				ug.Sync.prepareForOnline(this.last_state_ === -1)
			} else {
				if (this.state_ === 1) {
					ug.Sync.prepareForOffline()
				}
			}
		}
		ug.LS.onPingSuccess(A);
		this.first_ping_ = false
	};
	ug.onPingFailure = function(A, B) {
		this.in_ping_ = false;
		if (!B) {
			ug.onConnectionLost(null, A)
		} else {
			ug.LS.enableStore()
		}
		this.first_ping_ = false
	};
	ug.Dialog.showing_map_ = false;
	ug.Dialog.isShowingMap = function() {
		return this.showing_map_
	};
	ug.onDisabledClick = function(A) {
		utility.stopEvent(A);
		return ug.Dialog.showDisabledAction()
	};
	ug.Dialog.showLoggedOut = function() {
		var K = "", A = "/login/?offline=1", F = "</p>", I = "<p>", M = "HOMEPAGE_TOP_NAV_LOGIN", O = "INTERFACE_DIALOG_LOGGED_OUT_BUTTON_OK", H = "INTERFACE_DIALOG_LOGGED_OUT_TEXT", J = "INTERFACE_DIALOG_LOGGED_OUT_TITLE", D = "cancel", B = "http://", E = "ok";
		this.logged_out_ = true;
		this.button_ok_.innerHTML = _T(O);
		this.button_cancel_.innerHTML = _T(M);
		this.title_.innerHTML = _T(J);
		this.content_.innerHTML = I + _TF(H) + F;
		ug.Dialog.onButtonClick = function(Q) {
			if (Q === E) {
				ug.Dialog.hide();
				ug.ping()
			} else {
				if (Q === D) {
					var R = B + document.domain + A;
					window.open(R, K, K)
				}
			}
		};
		this.show()
	};
	ug.Dialog.showDisabledAction = function() {
		var D = "</p>", F = "<p>", I = "INTERFACE_DIALOG_DISABLED_ACTION_BUTTON_CANCEL", A = "INTERFACE_DIALOG_DISABLED_ACTION_BUTTON_OK", E = "INTERFACE_DIALOG_DISABLED_ACTION_TEXT", H = "INTERFACE_DIALOG_DISABLED_ACTION_TITLE", B = "ok";
		this.button_ok_.innerHTML = _T(A);
		this.button_cancel_.innerHTML = _T(I);
		this.title_.innerHTML = _T(H);
		this.content_.innerHTML = F + _TF(E) + D;
		ug.Dialog.onButtonClick = function(J) {
			ug.Dialog.hide();
			if (J === B) {
				ug.switchState(3)
			}
		};
		this.show()
	};
	ug.Dialog.showConnectionLost = function() {
		var B = "</p>", E = "<p>", H = "INTERFACE_DIALOG_CONNECTION_LOST_BUTTON_OK", D = "INTERFACE_DIALOG_CONNECTION_LOST_TEXT", F = "INTERFACE_DIALOG_CONNECTION_LOST_TITLE", A = "hidden";
		this.button_ok_.className = A;
		this.button_cancel_.innerHTML = _T(H);
		this.title_.innerHTML = _T(F);
		this.content_.innerHTML = E + _TF(D) + B;
		ug.Dialog.onButtonClick = function(I) {
			ug.Dialog.hide()
		};
		this.show()
	};
	ug.Dialog.showMapDisabled = function() {
		var B = "</p>", F = "<p>", I = "INTERFACE_DIALOG_CONNECTION_LOST_BUTTON_OK", E = "INTERFACE_DIALOG_LOCATIONS_DISABLED_TEXT", H = "INTERFACE_DIALOG_LOCATIONS_DISABLED_TITLE", D = "INTERFACE_LOCATIONS_NO_GOOGLE_MAPS", A = "hidden";
		this.button_ok_.className = A;
		this.button_cancel_.className = A;
		this.button_cancel_.innerHTML = _T(I);
		this.title_.innerHTML = _T(H);
		this.content_.innerHTML = F + _TF(rtmIsOffline ? E : D) + B;
		ug.Dialog.onButtonClick = function(J) {
			ug.Dialog.hide()
		};
		this.showing_map_ = true;
		this.show(true)
	};
	ug.Dialog.showDeleteDialog = function(B, A, D) {
		var Q = "", O = "INTERFACE_CONTACTS_GROUPS_DELETE_BUTTON", H = "INTERFACE_DIALOG_DELETE_TASK_TEXT_NUM", I = "INTERFACE_DIALOG_DELETE_TASK_TEXT_ONE", J = "INTERFACE_DIALOG_DELETE_TASK_TITLE_NUM", K = "INTERFACE_DIALOG_DELETE_TASK_TITLE_ONE", M = "INTERFACE_TASKS_NOTES_CANCEL_BUTTON", F = "cancel", E = "ok";
		this.button_cancel_.className = Q;
		this.button_ok_.innerHTML = _T(O);
		this.button_cancel_.innerHTML = _T(M);
		this.title_.innerHTML = _T(B === 1 ? K : J);
		this.content_.innerHTML = _TF(B === 1 ? I : H, {
			TASK_NAME : A.insertWbrs(),
			NUM : B
		});
		ug.Dialog.onButtonClick = function(R) {
			if (R === F) {
				ug.Dialog.hide()
			} else {
				if (R === E) {
					D();
					ug.Dialog.hide()
				}
			}
		};
		this.show()
	};
	ug.Sync.dirty_ = false;
	ug.Sync.isDirty = function() {
		return this.dirty_
	};
	ug.Sync.interceptDispatch = function(Z) {
		var X = ")", AM = ",", AF = "SELECT * FROM contact GROUP BY id", AI = "SELECT * FROM grp GROUP BY id", AG = "SELECT * FROM grp_member WHERE grp_version IN (", AU = "SELECT * FROM list GROUP BY id", J = "SELECT * FROM location GROUP BY id", Ah = "SELECT * FROM note GROUP BY id", Aq = "SELECT * FROM tag GROUP BY task_series_id", AN = "SELECT * FROM task GROUP BY id", AL = "SELECT * FROM task_participant WHERE task_version IN (", AO = "SELECT * FROM task_series_location GROUP BY id", Aa = "SELECT * FROM task_series_tag WHERE task_series_version IN (", Aj = "cd", AJ = "date_deleted", AH = "deleted", Ak = "gd", AE = "ld", AC = "nd", AS = "sort_order", AD = "syncable", Am = "td", Ai = "token", AQ = "true", AB = "xd", AA = "yd";
		this.dirty_ = false;
		Z = !!Z;
		var AR = ug.DB;
		var AZ = dispatches;
		var H = AR.fetch(AU);
		var f = [], V, Ap, AK, Af;
		for ( var An = 0, AY = H.length; An < AY; An++) {
			V = H[An];
			Ap = AS in V ? V.sort_order * 1 : 0;
			AK = AD in V ? V.syncable * 1 : 0;
			Af = Ai in V ? V.token : null;
			f.push( [ V.id, V.name, V.deleted ? true : false,
					V.locked ? true : false, V.archived ? true : false,
					V.position, V.filter, V.date_created, V.date_last_modified,
					Ap, AK, Af ])
		}
		var AT = AR.fetch(Ah);
		var At = [], Ae;
		for ( var An = 0, AY = AT.length; An < AY; An++) {
			Ae = AT[An];
			At.push( [ Ae.task_series_id, Ae.id, Ae.title, Ae.content,
					Ae.date_created, Ae.date_deleted, Ae.date_last_modified ])
		}
		var Az = AR.fetch(Aq);
		var Al = [], AP = [], AV = [], W;
		for ( var An = 0, AY = Az.length; An < AY; An++) {
			AP.push(Az[An].version);
			AV.push(Az[An].task_series_id)
		}
		var Aw = AR.fetch(Aa + AP.join(AM) + X);
		var I = {}, A4;
		for ( var An = 0, AY = Aw.length; An < AY; An++) {
			A4 = Aw[An];
			if (!(A4.tag in I)) {
				I[A4.tag] = [ A4.task_series_id ]
			} else {
				I[A4.tag].push(A4.task_series_id)
			}
		}
		var AX = Aw.length > 0 ? 0 : 1;
		Al = [ AX, AX === 0 ? I : AV ];
		var A1 = AR.fetch(J);
		var e = [], Ay, Ao = {};
		for ( var An = 0, AY = A1.length; An < AY; An++) {
			Ay = A1[An];
			Ao[Ay.id] = {
				id : Ay.id,
				name : Ay.name,
				latitude : Ay.latitude,
				longitude : Ay.longitude,
				address : Ay.address,
				zoom : Ay.zoom,
				viewable : Ay.viewable === AQ
			}
		}
		var b = AR.fetch(AO);
		var Q = {};
		for ( var An = 0, AY = b.length; An < AY; An++) {
			Q[b[An].id] = b[An].location_id
		}
		var U = A1.length === 0 ? 0 : 1;
		e = [ U, Ao, b.length > 0 ? Q : null ];
		var A2 = AR.fetch(AN);
		var Ar;
		var K = [];
		var Y;
		for ( var An = 0, AY = A2.length; An < AY; An++) {
			if (An % 800 === 0) {
				Y = [];
				Y.push(A2[An].version);
				K.push(Y)
			} else {
				Y.push(A2[An].version)
			}
		}
		var Ac = {}, O;
		map(function(D) {
			var F = AL + D.join(AM) + X;
			var E = AR.fetch(F);
			if (!E) {
				return
			}
			for ( var B = 0, A = E.length; B < A; B++) {
				O = E[B];
				if (!(O.id in Ac)) {
					Ac[O.id] = []
				}
				Ac[O.id].push( {
					person_id : O.contact_id,
					person_first_name : O.contact_first_name,
					person_last_name : O.contact_last_name,
					person_username : O.contact_username,
					is_shared : O.is_shared ? true : false,
					task_id : O.id
				})
			}
		}, K);
		var Au = [];
		for ( var An = 0, AY = A2.length; An < AY; An++) {
			Ar = A2[An];
			if (AJ in Ar && Ar.date_deleted !== null) {
				continue
			}
			Au.push( {
				list_id : Ar.list_id,
				id : Ar.id,
				series_id : Ar.series_id,
				name : Ar.name,
				date_created : Ar.date_created,
				date_completed : Ar.date_completed,
				date_last_modified : Ar.date_last_modified,
				date_due : Ar.date_due,
				time_due : Ar.time_due === AQ,
				date_added : Ar.date_added,
				priority : Ar.priority,
				postponed : Ar.postponed,
				estimate : Ar.estimate,
				participants : Ar.id in Ac ? Ac[Ar.id] : null,
				completed : Ar.completed === AQ,
				reoccur : Ar.rrule ? [ Ar.rrule, !!Ar.rrule_every ] : null,
				url : Ar.url,
				source : Ar.source
			})
		}
		var A5 = AR.fetch(AI);
		var R = [];
		var AW = {};
		for ( var An = 0, AY = A5.length; An < AY; An++) {
			if (AH in A5[An] && A5[An].deleted !== null) {
				continue
			}
			R.push(A5[An].version);
			AW[A5[An].id] = A5[An].name
		}
		var d = AR.fetch(AG + R.join(AM) + X);
		var Ax = {}, A3;
		for ( var An = 0, AY = d.length; An < AY; An++) {
			var A3 = d[An];
			if (!(A3.id in Ax)) {
				Ax[A3.id] = []
			}
			Ax[A3.id].push( {
				contact_id : A3.contact_id
			})
		}
		var M = [], Av;
		for ( var Ag in AW) {
			Av = AW[Ag];
			M.push( [ Ag, Av, Ag in Ax ? Ax[Ag] : [] ])
		}
		var Ad = AR.fetch(AF);
		var A0 = [], As;
		for ( var An = 0, AY = Ad.length; An < AY; An++) {
			As = Ad[An];
			A0.push( [ As.id, As.firstname, As.lastname, As.username ])
		}
		var a;
		for ( var An = 0, AY = AZ.length; An < AY; An++) {
			a = AZ[An][0];
			if (a === AE) {
				AZ[An][1] = f
			} else {
				if (a === AC) {
					AZ[An][1] = At
				} else {
					if (a === AB) {
						AZ[An][1] = Al
					} else {
						if (a === AA) {
							AZ[An][1] = e
						} else {
							if (a === Am) {
								AZ[An][1] = Au
							} else {
								if (a === Ak) {
									AZ[An][1] = M
								} else {
									if (a === Aj) {
										AZ[An][1] = A0
									}
								}
							}
						}
					}
				}
			}
		}
		dispatches = AZ;
		this.dirty_ = true
	};
	ug.isNotOnline = function() {
		return this.isReady() && !this.isOnline()
	}
} else {
	ug.initialize = function() {
		var E = "", F = "has-gears", A = "hidden", B = "is-connected", H = "is-disconnected", I = "is-syncing", D = "offline-status";
		el(B).className = A;
		el(I).className = A;
		el(H).className = A;
		el(F).className = E;
		el(D).className = E;
		ug.Dialog.initialize();
		return false
	};
	ug.isReady = function() {
		return false
	};
	ug.isNotOnline = function() {
		return false
	}
}
if (typeof globalScope !== "undefined") {
	globalScope.Offline = ug
}
function MessageBus() {
	this.channels = {};
	this.channelsOnce = {}
}
MessageBus.prototype.doSubscribe = function(A, D, B) {
	if (!A[B]) {
		A[B] = []
	}
	A[B].push(D)
};
MessageBus.prototype.subscribe = function(B, A) {
	this.doSubscribe(this.channels, B, A)
};
MessageBus.prototype.subscribeOnce = function(B, A) {
	this.doSubscribe(this.channelsOnce, B, A)
};
MessageBus.prototype.broadcast = function(H, B, E) {
	var D = this.channels[B];
	var F = this.channelsOnce[B];
	if (!D && !F) {
		return false
	}
	if (D) {
		for ( var A = 0; A < D.length; A++) {
			D[A](H, E)
		}
	}
	if (F) {
		for ( var A = 0; A < F.length; A++) {
			F[A](H, E)
		}
		F.length = 0
	}
	return true
};
function Configuration() {
	this.inited = false;
	this.dateStyle = 0;
	this.mbn = null;
	this.configuration = {};
	this.pendingDelta = {};
	this.pendingReminderDelta = {};
	this.fields = [];
	this.overrideGeneralSave = false
}
Configuration.prototype.init = function() {
	this.mbn = this.getUniqueMessageBusName();
	this.inited = true
};
Configuration.prototype.setData = function(A) {
	this.configuration = A;
	this.updateGeneralSettings();
	this.updateReminderSettings();
	this.updateSyncSettings();
	this.setupGeneral();
	this.setupReminder();
	this.setupSync()
};
Configuration.prototype.setup = function() {
	this.addField("language", "language");
	this.addField("country", "country");
	this.addField("timezone", "timezone");
	this.addField("dateformat_eu", "dateformat_eu");
	this.addField("dateformat_am", "dateformat_am");
	this.addField("timeformat_12", "timeformat_12");
	this.addField("timeformat_24", "timeformat_24");
	this.addField("taskcloud", "taskcloud");
	this.addField("tagslist", "tagslist");
	this.addField("taskdueoncheck", "taskdueoncheck");
	this.addField("taskduespeccheck", "taskduespeccheck");
	this.addField("taskduespec", "taskduespec");
	this.addField("taskduestart", "taskduestart");
	this.addField("timedueoncheck", "timedueoncheck");
	this.addField("timeduespeccheck", "timeduespeccheck");
	this.addField("timeduespec", "timeduespec");
	this.addField("generalFirstname", "firstname");
	this.addField("generalLastname", "lastname");
	this.addField("generalEmail", "email");
	this.addField("settingsSave", "settingssubmit");
	this.addField("settingsCancel", "settingscancel");
	this.addField("reminderSave", "reminder_save");
	this.addField("reminderCancel", "reminder_cancel");
	this.addField("syncAll", "settings-sync-when-all");
	this.addField("syncSome", "settings-sync-when-some");
	this.addField("syncSave", "settings-sync-save");
	this.addField("syncCancel", "settings-sync-cancel");
	this.addField("private_on", "private_on");
	this.addField("private_off", "private_off");
	this.addField("smart_on", "smart_on");
	this.addField("smart_off", "smart_off");
	var A = this;
	this.settingsSave.onclick = function() {
		A.configurationDelta();
		return false
	};
	this.settingsCancel.onclick = function() {
		A.settingsSave.disabled = true;
		A.settingsCancel.disabled = true;
		A.updateGeneralSettings();
		return false
	};
	this.settingsCancel.onclick();
	this.reminderSave.onclick = function() {
		A.reminderDelta();
		return false
	};
	this.reminderCancel.onclick = function() {
		A.reminderSave.disabled = true;
		A.reminderCancel.disabled = true;
		A.updateReminderSettings();
		return false
	};
	this.reminderCancel.onclick();
	this.syncSave.onclick = function() {
		A.syncDelta();
		return false
	};
	this.syncCancel.onclick = function() {
		A.syncSave.disabled = true;
		A.syncCancel.disabled = true;
		A.updateSyncSettings();
		return false
	};
	this.syncCancel.onclick();
	this.taskduespec.onfocus = function() {
		helpBox.showHelpText("reminders.datedue")
	};
	this.taskduespec.onblur = function() {
		var B = function() {
			helpBox.stopShowing("reminders.datedue");
			if (view.getViewToken("Settings", "Reminders")) {
				helpBox.showHelpText("settings.reminders")
			}
		};
		setTimeout(B, 1000)
	};
	this.taskduestart.onfocus = function() {
		helpBox.showHelpText("reminders.start")
	};
	this.taskduestart.onblur = function() {
		var B = function() {
			helpBox.stopShowing("reminders.start");
			if (view.getViewToken("Settings", "Reminders")) {
				helpBox.showHelpText("settings.reminders")
			}
		};
		setTimeout(B, 1000)
	};
	this.timeduespec.onfocus = function() {
		helpBox.showHelpText("reminders.timedue")
	};
	this.timeduespec.onblur = function() {
		var B = function() {
			helpBox.stopShowing("reminders.timedue");
			if (view.getViewToken("Settings", "Reminders")) {
				helpBox.showHelpText("settings.reminders")
			}
		};
		setTimeout(B, 1000)
	};
	el("reset-private-urls").onclick = function(B) {
		if (Utility.hasClass(el("reset-private-urls"), "disabled")) {
			return Offline.onDisabledClick(B)
		}
		utility.stopEvent(B);
		Control.resetPrivate();
		try {
			if (this.blur) {
				this.blur()
			}
		} catch (D) {
		}
		return false
	};
	Configuration.original_language_ = rtmLanguage;
	if (!Configuration.isEnglish()) {
		el("settings-general-timeformat").style.display = "none"
	}
	Configuration.updateTimeFormats(true)
};
Configuration.original_language_ = null;
Configuration.last_time_format_ = null;
Configuration.updateTimeFormats = function(F) {
	if (!Configuration.isEnglish()
			|| Configuration.original_language_ !== rtmLanguage) {
		return false
	}
	if (Configuration.last_time_format_ === null) {
		Configuration.last_time_format_ = rtmTime24
	} else {
		if (Configuration.last_time_format_ === rtmTime24) {
			return false
		}
	}
	var D = [ "current_date", "due_time", "due_time_field", "hmm_a",
			"note_date", "reminder_title" ];
	for ( var E = 0, B = D.length; E < B; E++) {
		var A = D[E];
		if (F) {
			Intl.preferred_formats[A + "_orig"] = Intl.preferred_formats[A]
		}
		if (rtmTime24) {
			Intl.preferred_formats[A] = Intl.preferred_formats[A + "_24"]
		} else {
			Intl.preferred_formats[A] = Intl.preferred_formats[A + "_orig"]
		}
	}
	Configuration.last_time_format_ = rtmTime24;
	if (dateTimeMgr) {
		dateTimeMgr.updateDateTime(null, new Date())
	}
};
Configuration.isEnglish = function() {
	return (rtmLanguage === "en-US" || rtmLanguage === "en-GB")
};
Configuration.prototype.addField = function(localName, name) {
	var self = this;
	eval("self." + localName + " = el('" + name + "');");
	this.fields.push(localName)
};
Configuration.prototype.getUniqueMessageBusName = function() {
	return "rtm.configuration."
};
Configuration.prototype.confCountryDelta = function() {
	return this.country.options[this.country.selectedIndex].text.trim()
};
Configuration.prototype.confTimeZoneDelta = function() {
	var A = this.timezone.options[this.timezone.selectedIndex].value.split("_");
	return A[1]
};
Configuration.prototype.confLanguageDelta = function() {
	return this.language.options[this.language.selectedIndex].value.trim()
};
Configuration.prototype._stripEmailSecret = function(D) {
	var B = /^([a-zA-Z0-9_\.])+$/;
	if (D == null) {
		return ""
	}
	D = D.trim();
	var A = D.indexOf("+");
	if (A > -1) {
		D = D.substring(A + 1, D.length)
	}
	if (D.length == 0) {
		return D
	}
	var E = B.exec(D);
	if (!E) {
		return null
	}
	return E[0]
};
Configuration.prototype.vetEmailSecret = function(A) {
	if ((A == 8 || A == 13 || A == 37 || A == 39) || (A >= 48 && A <= 57)
			|| (A >= 65 && A <= 90) || (A >= 97 && A <= 122)) {
		return true
	} else {
		return false
	}
};
Configuration.prototype.confEmailSecretDelta = function() {
	var A = this._stripEmailSecret(this.emailSecret.value);
	if (A == null) {
		this.setError(el("emailSecretStatus"),
				"Letters and numbers only, please.");
		this.overrideGeneralSave = true
	} else {
		if (A.length < 4) {
			this.setError(el("emailSecretStatus"), "Minimum 4 characters.");
			this.overrideGeneralSave = true
		} else {
			if (A.length > 30) {
				this.setError(el("emailSecretStatus"), "Max. 30 characters.");
				this.overrideGeneralSave = true
			} else {
				this.setSuccess(el("emailSecretStatus"), null);
				this.overrideGeneralSave = false
			}
		}
	}
	return A
};
Configuration.prototype.confDateFormatDelta = function() {
	if (this.dateformat_eu.checked == true) {
		return 0
	} else {
		return 1
	}
};
Configuration.prototype.confTimeFormatDelta = function() {
	if (this.timeformat_12.checked == true) {
		return 0
	} else {
		return 1
	}
};
Configuration.prototype.confTaskCloudDelta = function() {
	if (this.taskcloud.checked == true) {
		return true
	}
	return false
};
Configuration.prototype.confTagsDelta = function() {
	return this.tagslist.options[this.tagslist.selectedIndex].value.trim() * 1
};
Configuration.prototype.reminderRemindOnDelta = function() {
	if (this.taskdueoncheck.checked == true) {
		return "t"
	}
	return "f"
};
Configuration.prototype.confPrivateDelta = function() {
	if (this.private_on.checked == true) {
		return 1
	}
	return 0
};
Configuration.prototype.confSmartDelta = function() {
	if (this.smart_on.checked == true) {
		return 1
	}
	return 0
};
Configuration.formatInterval = function(A) {
	A = A.replace(/_RTM_:/, "");
	A = A.replace(/year=1/, "1 year");
	A = A.replace(/year=(\d+)/, "$1 years");
	A = A.replace(/month=1/, "1 mon");
	A = A.replace(/month=(\d+)/, "$1 mons");
	A = A.replace(/date=1/, "1 day");
	A = A.replace(/date=(\d+)/, "$1 days");
	A = A.replace(/1 YEAR/, "1 year");
	A = A.replace(/(\d+) YEAR(?:S)?/, "$1 years");
	A = A.replace(/1 MONTH/, "1 mon");
	A = A.replace(/(\d+) MONTH(?:S)?/, "$1 mons");
	A = A.replace(/1 DAY/, "1 day");
	A = A.replace(/(\d+) DAY(?:S)?/, "$1 days");
	A = A.replace(/\s*\,\s*/, " ");
	return A
};
Configuration.prototype.reminderRemindIntervalDelta = function() {
	if (this.taskduespeccheck.checked == true) {
		var A = dateTimeMgr.parseDueDate(this.taskduespec.value.trim());
		if (A[0] !== null) {
			return Configuration.formatInterval(A[5])
		} else {
			return null
		}
	} else {
		return null
	}
};
Configuration.prototype.reminderRemindDayStartDelta = function() {
	var A = dateTimeMgr.parseTime(this.taskduestart.value.trim());
	return dateTimeMgr.formatTime(A, true)
};
Configuration.prototype.reminderRemindTimeOnDelta = function() {
	if (this.timedueoncheck.checked == true) {
		return "t"
	}
	return "f"
};
Configuration.prototype.reminderRemindTimeIntervalDelta = function() {
	if (this.timeduespeccheck.checked == true) {
		var A = dateTimeMgr.parseDueDate(this.timeduespec.value.trim());
		if (A[0] !== null) {
			return dateTimeMgr.convertTimeSpec(Configuration
					.formatInterval(A[5]))
		} else {
			return null
		}
	} else {
		return null
	}
};
Configuration.prototype.reminderDelta = function(A) {
	var D = this;
	var I = {
		"remindOn" : function() {
			return D.reminderRemindOnDelta()
		},
		"remindInterval" : function() {
			return D.reminderRemindIntervalDelta()
		},
		"remindTimeOn" : function() {
			return D.reminderRemindTimeOnDelta()
		},
		"remindTimeInterval" : function() {
			return D.reminderRemindTimeIntervalDelta()
		},
		"remindDayStart" : function() {
			return D.reminderRemindDayStartDelta()
		}
	};
	var H = {};
	var E = false;
	for (F in I) {
		var B = I[F];
		if (typeof B == "function") {
			B = B()
		}
		if (B != this.configuration[F]) {
			H[F] = B;
			E = true
		}
	}
	if (E) {
		if (!A) {
			transMgr.request("notifies.configuration.update", utility
					.encodeJavaScript(H));
			for ( var F in H) {
				this.pendingReminderDelta[F] = H[F]
			}
		} else {
			this.reminderSave.disabled = false;
			this.reminderCancel.disabled = false
		}
	} else {
		if (A) {
			this.reminderSave.disabled = true;
			this.reminderCancel.disabled = true
		}
	}
	return E
};
Configuration.prototype.configurationDelta = function(A) {
	var D = this;
	var I = {
		"firstname" : this.generalFirstname.value.trim(),
		"lastname" : this.generalLastname.value.trim(),
		"email" : this.generalEmail.value.trim(),
		"dateFormat" : function() {
			return D.confDateFormatDelta()
		},
		"time24" : function() {
			return D.confTimeFormatDelta()
		},
		"timeZone" : function() {
			return D.confTimeZoneDelta()
		},
		"country" : function() {
			return D.confCountryDelta()
		},
		"language" : function() {
			return D.confLanguageDelta()
		},
		"taskcloud" : function() {
			return D.confTaskCloudDelta()
		},
		"show_tags" : function() {
			return D.confTagsDelta()
		},
		"private" : function() {
			return D.confPrivateDelta()
		},
		"smart_add" : function() {
			return D.confSmartDelta()
		}
	};
	var H = {};
	var E = false;
	this.configuration["language"] = rtmLanguage;
	for (F in I) {
		var B = I[F];
		if (typeof B == "function") {
			B = B()
		}
		if (B != this.configuration[F]) {
			H[F] = B;
			E = true
		}
	}
	if (E) {
		if (!A) {
			transMgr.request("configuration.update", utility
					.encodeJavaScript(H));
			for ( var F in H) {
				this.pendingDelta[F] = H[F]
			}
		} else {
			if (this.overrideGeneralSave == false) {
				this.settingsSave.disabled = false
			} else {
				this.settingsSave.disabled = true
			}
			this.settingsCancel.disabled = false
		}
	} else {
		if (A) {
			this.settingsSave.disabled = true;
			this.settingsCancel.disabled = true
		}
	}
	return E
};
Configuration.prototype.syncDelta = function(A) {
	var D = this;
	var I = {
		"sync_which" : function() {
			return D.syncWhichDelta()
		}
	};
	var H = {};
	var E = false;
	for (F in I) {
		var B = I[F];
		if (typeof B == "function") {
			B = B()
		}
		if (B != this.configuration[F]) {
			H[F] = B;
			E = true
		}
	}
	if (E) {
		if (!A) {
			transMgr.request("configuration.update", utility
					.encodeJavaScript(H));
			for ( var F in H) {
				this.pendingDelta[F] = H[F]
			}
		} else {
			if (this.overrideGeneralSave == false) {
				this.syncSave.disabled = false
			} else {
				this.syncSave.disabled = true
			}
			this.syncCancel.disabled = false
		}
	} else {
		if (A) {
			this.syncSave.disabled = true;
			this.syncCancel.disabled = true
		}
	}
	return E
};
Configuration.prototype.updateReminderSettings = function() {
	if (this.configuration["remindOn"] == "t") {
		this.taskdueoncheck.checked = true
	} else {
		this.taskdueoncheck.checked = false
	}
	if (this.configuration["remindTimeOn"] == "t") {
		this.timedueoncheck.checked = true
	} else {
		this.timedueoncheck.checked = false
	}
	if (this.configuration["remindInterval"] == null) {
		this.taskduespeccheck.checked = false;
		this.taskduespec.disabled = true;
		this.taskduespec.value = ""
	} else {
		this.taskduespeccheck.checked = true;
		this.taskduespec.disabled = false;
		this.taskduespec.value = dateTimeMgr
				.TransformDate(this.configuration["remindInterval"])
	}
	if (this.configuration["remindTimeInterval"] == null) {
		this.timeduespeccheck.checked = false;
		this.timeduespec.disabled = true;
		this.timeduespec.value = ""
	} else {
		this.timeduespec.disabled = false;
		this.timeduespeccheck.checked = true;
		this.timeduespec.value = dateTimeMgr
				.TransformDate(this.configuration["remindTimeInterval"])
	}
	if (this.configuration["remindDayStart"] == null) {
		this.taskduestart.value = "12am"
	} else {
		var A = dateTimeMgr.parseTime(this.configuration["remindDayStart"]);
		this.taskduestart.value = dateTimeMgr.formatTime(A)
	}
	this.toggleStartDay()
};
Configuration.prototype.updateSyncSettings = function() {
	if (!rtmHasMilkSync) {
		return false
	}
	if (this.configuration["sync_which"] === 0) {
		this.syncAll.checked = true
	} else {
		this.syncSome.checked = true
	}
};
Configuration.prototype.updateShowOverview = function() {
	if (this.configuration["showOverview"]) {
		overviewView.continueTasksAlways.innerHTML = _T("INTERFACE_ALWAYS_SKIP_THIS_PAGE");
		overviewView.continueTasksAlways.title = _T("INTERFACE_ALWAYS_SKIP_THIS_PAGE");
		overviewView.continueTasksAlways.onclick = function() {
			messageBus.broadcast(configurationMgr, configurationMgr.mbn
					+ "continueToTasks", [ true, false ]);
			return false
		}
	} else {
		overviewView.continueTasksAlways.innerHTML = _T("INTERFACE_DONT_SKIP_THIS_PAGE");
		overviewView.continueTasksAlways.title = _T("INTERFACE_DONT_SKIP_THIS_PAGE");
		overviewView.continueTasksAlways.onclick = function() {
			messageBus.broadcast(configurationMgr, configurationMgr.mbn
					+ "continueToTasks", [ true, true ]);
			return false
		}
	}
};
Configuration.prototype.updateGeneralSettings = function() {
	this.updateShowOverview();
	this.generalFirstname.value = this.configuration["firstname"];
	this.generalLastname.value = this.configuration["lastname"];
	this.generalEmail.value = this.configuration["email"];
	this.taskcloud.checked = this.configuration["taskcloud"];
	if (this.taskcloud.checked && view.getViewToken("Tasks")) {
		if (taskCloud) {
			taskCloud.showCopy()
		}
	} else {
		if (taskCloud) {
			taskCloud.hideCopy()
		}
	}
	for ( var A = 0; A < this.country.options.length; A++) {
		if (this.country.options[A].text.trim() == this.configuration["country"]) {
			this.country.selectedIndex = A;
			break
		}
	}
	for ( var A = 0; A < this.timezone.options.length; A++) {
		var B = this.timezone.options[A].value.split("_");
		if (B[1] == this.configuration["timeZone"]) {
			this.timezone.selectedIndex = A;
			break
		}
	}
	for ( var A = 0; A < this.language.options.length; A++) {
		if (this.language.options[A].value.trim() == rtmLanguage) {
			this.language.selectedIndex = A;
			break
		}
	}
	if (this.configuration["dateFormat"] == 0) {
		this.dateformat_eu.checked = true
	} else {
		this.dateformat_am.checked = true
	}
	if (this.configuration["time24"] == 0) {
		this.timeformat_12.checked = true;
		rtmTime24 = false;
		Configuration.updateTimeFormats(false)
	} else {
		this.timeformat_24.checked = true;
		rtmTime24 = true;
		Configuration.updateTimeFormats(false)
	}
	if (this.configuration["private"]) {
		this.private_on.checked = true;
		el("reset-private-urls-row").style.display = ""
	} else {
		this.private_off.checked = true;
		el("reset-private-urls-row").style.display = "none"
	}
	if (this.configuration["smart_add"]) {
		this.smart_on.checked = true
	} else {
		this.smart_off.checked = true
	}
	var E = 1;
	for ( var A = 0; A < this.tagslist.options.length; A++) {
		var D = this.tagslist.options[A].value * 1;
		if (D === this.configuration["show_tags"]) {
			E = D;
			this.tagslist.selectedIndex = A;
			break
		}
	}
	rtmTagPosition = this.configuration["show_tags"];
	taskList.onShowTagsChanged(E);
	this.dateStyle = parseInt(this.configuration["dateFormat"], 10)
};
Configuration.prototype.enableTaskDue = function() {
	this.taskduespec.disabled = !this.taskduespeccheck.checked;
	this.reminderDelta(true);
	this.toggleStartDay()
};
Configuration.prototype.enableTimeDue = function() {
	this.timeduespec.disabled = !this.timeduespeccheck.checked;
	this.reminderDelta(true)
};
Configuration.prototype.checkTimeSpec = function() {
	this.reminderDelta(true)
};
Configuration.prototype.checkTaskSpec = function() {
	this.reminderDelta(true)
};
Configuration.prototype.checkTaskStart = function() {
	this.reminderDelta(true)
};
Configuration.prototype.checkTaskOnCheck = function() {
	this.reminderDelta(true);
	this.toggleStartDay()
};
Configuration.prototype.toggleStartDay = function() {
	if (this.taskdueoncheck.checked || this.taskduespeccheck.checked) {
		if (el("taskduestartwrap").style.display == "none") {
			el("taskduestartwrap").style.display = ""
		}
	} else {
		if (!this.taskdueoncheck.checked && !this.taskduespeccheck.checked) {
			el("taskduestartwrap").style.display = "none"
		}
	}
};
Configuration.prototype.checkTimeOnCheck = function() {
	this.reminderDelta(true)
};
Configuration.prototype.setupSync = function() {
	var A = this;
	this.syncAll.onclick = function() {
		A.syncDelta(true)
	};
	this.syncSome.onclick = function() {
		A.syncDelta(true)
	};
	this.syncSave.disabled = true;
	this.syncCancel.disabled = true;
	if (this.configuration["sync_which"]) {
		listList.doStyles()
	}
};
Configuration.prototype.setupReminder = function() {
	var A = this;
	this.taskduespeccheck.onclick = function() {
		A.enableTaskDue()
	};
	this.timeduespeccheck.onclick = function() {
		A.enableTimeDue()
	};
	this.timeduespec.onkeyup = function() {
		A.checkTimeSpec()
	};
	this.taskduespec.onkeyup = function() {
		A.checkTaskSpec()
	};
	this.taskduestart.onkeyup = function() {
		A.checkTaskStart()
	};
	this.timeduespec.onkeypress = function() {
		A.checkTimeSpec()
	};
	this.taskduespec.onkeypress = function() {
		A.checkTaskSpec()
	};
	this.taskduestart.onkeypress = function() {
		A.checkTaskStart()
	};
	this.taskdueoncheck.onclick = function() {
		A.checkTaskOnCheck()
	};
	this.timedueoncheck.onclick = function() {
		A.checkTimeOnCheck()
	};
	this.enableTaskDue();
	this.enableTimeDue()
};
Configuration.prototype.setupGeneral = function() {
	var A = this;
	this.generalFirstname.onkeyup = function() {
		A.configurationDelta(true)
	};
	this.generalLastname.onkeyup = function() {
		A.configurationDelta(true)
	};
	this.generalEmail.onkeyup = function() {
		A.configurationDelta(true)
	};
	this.generalFirstname.onkeypress = function() {
		A.configurationDelta(true)
	};
	this.generalLastname.onkeypress = function() {
		A.configurationDelta(true)
	};
	this.generalEmail.onkeypress = function() {
		A.configurationDelta(true)
	};
	this.timezone.onchange = function() {
		A.configurationDelta(true)
	};
	this.country.onchange = function() {
		A.configurationDelta(true)
	};
	this.language.onchange = function() {
		A.configurationDelta(true)
	};
	this.dateformat_eu.onclick = function() {
		A.configurationDelta(true)
	};
	this.dateformat_am.onclick = function() {
		A.configurationDelta(true)
	};
	this.timeformat_12.onclick = function() {
		A.configurationDelta(true)
	};
	this.timeformat_24.onclick = function() {
		A.configurationDelta(true)
	};
	this.private_on.onclick = function() {
		el("reset-private-urls-row").style.display = "";
		A.configurationDelta(true)
	};
	this.private_off.onclick = function() {
		el("reset-private-urls-row").style.display = "none";
		A.configurationDelta(true)
	};
	this.smart_on.onclick = function() {
		A.configurationDelta(true)
	};
	this.smart_off.onclick = function() {
		A.configurationDelta(true)
	};
	this.taskcloud.onclick = function() {
		A.configurationDelta(true)
	};
	this.tagslist.onchange = function() {
		A.configurationDelta(true)
	};
	this.settingsSave.disabled = true;
	this.settingsCancel.disabled = true
};
Configuration.prototype.mergePendingReminderDelta = function() {
	for ( var A in this.pendingReminderDelta) {
		this.configuration[A] = this.pendingReminderDelta[A]
	}
	this.pendingReminderDelta = {};
	this.reminderSave.disabled = true;
	this.reminderCancel.disabled = true;
	this.updateReminderSettings()
};
Configuration.prototype.mergePendingDelta = function() {
	var D = null;
	var A = false;
	for ( var B in this.pendingDelta) {
		this.configuration[B] = this.pendingDelta[B];
		if (B == "language") {
			rtmLanguage = this.pendingDelta[B]
		} else {
			if (B == "show_tags") {
				D = rtmTagPosition = this.pendingDelta[B]
			} else {
				if (B == "smart_add") {
					A = false
				}
			}
		}
	}
	this.pendingDelta = {};
	this.settingsSave.disabled = true;
	this.settingsCancel.disabled = true;
	this.updateGeneralSettings();
	this.updatePersonName();
	if (D !== null) {
		taskList.changeTagPosition(D)
	}
	if (A) {
		Control.onSmartAddChanged()
	}
	dateTimeMgr.updateDateTime(dateTimeMgr, new Date());
	this.overrideGeneralSave = false
};
Configuration.prototype.updatePersonName = function() {
	var D = el("personName");
	var B = this.generalFirstname.value;
	var A = this.generalLastname.value;
	D.innerHTML = [ B, A ].join(" ").escapeForDisplay();
	if (B.charAt(B.length - 1) == "s") {
		B += "'"
	} else {
		B += "'s"
	}
	document.title = fmt("Remember The Milk - %1 Tasks", B)
};
Configuration.prototype.updateEmailIn = function() {
	var D = el("infoEmailAddress");
	var B = this.emailSecret.value;
	var A = rtmUsername + "+" + B + "@" + rtmMailHost;
	D.innerHTML = A.escapeForDisplay();
	D.href = "mailto:" + A
};
Configuration.prototype.setDefaultList = function(A) {
	this.configuration.defaultList = A
};
Configuration.prototype.setDefaultLocation = function(A) {
	this.configuration.defaultLocation = A
};
Configuration.prototype.setSuccess = function(B, A) {
	B.innerHTML = '<span class="success_msg">' + (A == null ? "&nbsp;" : A)
			+ "</span>";
	B.className = "success"
};
Configuration.prototype.setError = function(B, A) {
	B.innerHTML = '<span class="error_msg">' + (A == null ? "&nbsp;" : A)
			+ "</span>";
	B.className = "error"
};
Configuration.prototype.setClear = function(A) {
	A.innerHTML = "";
	A.className = ""
};
Configuration.prototype.disableAll = function() {
	for ( var B = 0, A = this.fields.length; B < A; B++) {
		this[this.fields[B]].disabled = true
	}
};
Configuration.prototype.enableAll = function() {
	for ( var B = 0, A = this.fields.length; B < A; B++) {
		if (this[this.fields[B]].type !== "submit") {
			this[this.fields[B]].disabled = false
		}
	}
	this.reminderCancel.onclick();
	this.syncCancel.onclick()
};
Configuration.prototype.syncWhichDelta = function() {
	return this.syncAll.checked ? 0 : 1
};
Configuration.onSyncUpdated = function() {
	var A = configurationMgr;
	A.configuration["sync_which"] = A.syncWhichDelta();
	A.syncCancel.disabled = true;
	A.syncSave.disabled = true;
	statusBox.setText(_T("INTERFACE_STATUS_SETTINGS_SAVED"), false, true);
	listList.doStyles()
};
function assert(A, B) {
	return false;
	dbg(B + " = " + A);
	if (A == false) {
		if (is_opera) {
			dbg("ASSERT: " + B);
			this.fred = bob
		} else {
			alert("ASSERT: " + B)
		}
	}
}
function dbg(A) {
	if (is_opera) {
		opera.postError(A)
	}
	if ((is_safari || is_gecko) && window.console) {
		window.console.log(A)
	}
}
function ied(A) {
	if (is_ie) {
		alert(A)
	}
}
function dump(B) {
	if (typeof B == "object") {
		for ( var A in B) {
			dbg("dump: x = " + A + ", obj[x] = " + B[A])
		}
	} else {
		dbg("dump: " + B)
	}
}
function EventManager() {
	this.locationTimeout = null;
	this.lastLocation = null;
	this.lastHistoryLength = null;
	this.mbn = null
}
EventManager.prototype.init = function() {
	var A = this;
	var D = is_gecko && !is_gecko18 && !(is_mac && is_gecko19);
	document.onkeypress = function(F) {
		return A.bodyKeyPressHandler(F, D)
	};
	if (is_ie) {
		document.onkeyup = function(F) {
			return A.bodyKeyEventHandler(F, false)
		}
	}
	if (D) {
		document.onkeydown = function(F) {
			return A.bodyKeyEventHandler(F, true)
		}
	}
	if (is_safari_31 || is_chrome) {
		document.onkeydown = function(F) {
			return A.bodyKeyDownHandler(F)
		}
	}
	document.onselectstart = function(F) {
		return A.bodySelectStartHandler(F)
	};
	this.mbn = this.getUniqueMessageBusName();
	var A = this;
	var B = null;
	if (is_gecko || is_safari) {
		B = function() {
			A.checkLocationGecko()
		};
		this.lastLocation = window.location.toString();
		this.lastHistoryLength = window.history.length
	} else {
		if (is_opera || is_ie) {
			var E = window.location.hash;
			this.lastLocation = E || "#overview";
			B = function() {
				A.checkLocationOpera()
			}
		}
	}
	return;
	this.locationTimeout = setTimeout(B, 100)
};
EventManager.prototype.getUniqueMessageBusName = function() {
	return "rtm.eventmanager."
};
EventManager.prototype.checkLocationGecko = function() {
	var E = window.location.toString();
	var D = window.history.length;
	if (this.lastLocation != E) {
		messageBus.broadcast(this, this.mbn + "locationChanged", E);
		this.lastLocation = E
	}
	var A = this;
	var B = function() {
		A.checkLocationGecko()
	};
	this.locationTimeout = setTimeout(B, 100)
};
EventManager.prototype.checkLocationOpera = function() {
	var D = window.location.hash;
	if (this.lastLocation != D) {
		messageBus.broadcast(this, this.mbn + "locationChanged", D);
		this.lastLocation = D
	}
	var A = this;
	var B = function() {
		A.checkLocationOpera()
	};
	this.locationTimeout = setTimeout(B, 200)
};
EventManager.prototype.bodySelectStartHandler = function(A) {
	A || (A = window.event);
	var B = utility.getEventTarget(A);
	if (B == null) {
		return true
	}
	if (B && /^(textarea|input|text|password|select)/i.test(B.type)) {
		return true
	}
	if (A.shiftKey) {
		utility.stopEvent(A);
		return false
	}
	return true
};
EventManager.prototype.bodyKeyEventHandler = function(D, A) {
	D || (D = window.event);
	var F = utility.getEventTarget(D);
	if (F == null) {
		return true
	}
	if (F && /^(textarea|input|text|password|select)/i.test(F.type)) {
		return true
	}
	var E = (D.charCode) ? D.charCode : ((D.which) ? D.which : D.keyCode);
	if (is_mac && E == 30) {
		E = 54
	}
	switch (E) {
	case 37:
		if (D.ctrlKey && D.shiftKey && !A) {
			var B = view.getViewTabs();
			if (B) {
				B.selectLeft();
				utility.stopEvent(D);
				return false
			}
		}
		return true;
		break;
	case 39:
		if (D.ctrlKey && D.shiftKey && !A) {
			var B = view.getViewTabs();
			if (B) {
				B.selectRight();
				utility.stopEvent(D);
				return false
			}
		}
		return true;
	case 45:
		if (D.ctrlKey && D.shiftKey) {
			view.selectView("Help");
			return false
		}
		return true;
	case 46:
		if (is_ie7 && !tasksView.isLocked(false)) {
			control.tasksDelete();
			utility.stopEvent(D);
			return false
		}
		return true;
	case 47:
	case 191:
		if (D.ctrlKey && D.shiftKey) {
			el("listFilter").focus();
			utility.stopEvent(D);
			return false
		}
		return true;
	case 48:
		if (D.ctrlKey && D.shiftKey) {
			view.selectView("Settings");
			utility.stopEvent(D);
			return false
		}
		return true;
	case 54:
	case 94:
		if (D.ctrlKey && D.shiftKey) {
			view.selectView("Overview");
			utility.stopEvent(D);
			return false
		}
		return true;
	case 55:
		if (D.ctrlKey && D.shiftKey) {
			view.selectView("Tasks");
			utility.stopEvent(D);
			return false
		}
		return true;
	case 56:
		if (D.ctrlKey && D.shiftKey) {
			view.selectView("Locations");
			utility.stopEvent(D);
			return false
		}
		return true;
	case 57:
		if (D.ctrlKey && D.shiftKey) {
			view.selectView("Contacts");
			utility.stopEvent(D);
			return false
		}
		return true;
	default:
		return true
	}
};
EventManager.prototype.bodyClickHandler = function(A) {
	if (!Offline.isOnline()) {
		return false
	}
	var B = utility.getEventTarget(A);
	if (B == null) {
		return true
	}
	if (Utility.hasClass(B, "disabled")) {
		return Offline.onDisabledClick(A)
	}
	return true
};
EventManager.prototype._ifNotesThenSwitch = function() {
	if (view.getViewToken("Tasks", "Notes")) {
		var A = view.getViewDetailTabs();
		if (A) {
			A.selectLeft()
		}
	}
};
EventManager.prototype.bodyKeyPressHandler = function(ev, ignoreCombo) {
	ev || (ev = window.event);
	var target = utility.getEventTarget(ev);
	if (target == null) {
		return true
	}
	var pressed = (ev.charCode) ? ev.charCode : ((ev.which) ? ev.which
			: ev.keyCode);
	if (Offline.Dialog.isDisplayed()) {
		if (pressed === 9) {
			return Offline.Dialog.onTabPressed(target)
		} else {
			if (pressed === 13
					&& Offline.Dialog.frame_class_ === "dialog-frame-tag-merge") {
				return Offline.Dialog.onButtonClick("ok")
			} else {
				if (pressed === 27) {
					return Offline.Dialog.triggerCancel()
				}
			}
		}
		return true
	}
	if (target
			&& (/^(textarea|input|text|password|select|button|submit)/i
					.test(target.type) || target.id == "map")) {
		return true
	}
	if (is_safari && pressed > 63200) {
		if (pressed == 63234) {
			pressed = 37
		} else {
			if (pressed == 63235) {
				pressed = 39
			} else {
				if (pressed == 63272) {
					pressed = 46
				}
			}
		}
	}
	if (is_mac && pressed == 30) {
		pressed = 54
	}
	if (is_gecko && !ev.charCode && !ev.which && ev.keyCode == 116) {
		return true
	}
	if (is_opera && is_win_opera && pressed == 0 && !ev.ctrlKey && !ev.shiftKey
			&& !ev.metaKey) {
		pressed = 46
	}
	if (is_opera && pressed == 9) {
		if (ev.ctrlKey) {
			return true
		}
		utility.stopEvent(ev);
		return false
	}
	if (ev.keyCode === 0 && ev.which === 46 && ev.charCode === 46) {
		pressed = 190
	}
	if (is_safari_31 && pressed === 46 && ev.charCode === 46) {
		pressed = 190
	}
	if (pressed > 48
			&& pressed < 53
			&& (ev.shiftKey || (!ev.ctrlKey && !ev.metaKey && !ev.altKey && !ev.shiftKey))) {
	} else {
		if (ev.altKey
				|| ev.ctrlKey
				&& !(ev.shiftKey && [ 37, 39, 47, 48, 54, 55, 56, 57, 63, 76,
						94 ].indexOf(pressed) > -1) || ev.metaKey) {
			return true
		}
	}
	var currentView = view.getSelected();
	if (currentView === "Locations") {
		if (pressed === 27) {
			return locationMgr.handleEscape()
		} else {
			if (ev.shiftKey && ev.ctrlKey && pressed == 76) {
				return locationMgr.handleGoFocus()
			}
		}
	}
	switch (pressed) {
	case 37:
		if (ev.ctrlKey && ev.shiftKey) {
			var tabs = view.getViewTabs();
			if (tabs) {
				tabs.selectLeft();
				utility.stopEvent(ev);
				return false
			}
		}
		return true;
		break;
	case 39:
		if (ev.ctrlKey && ev.shiftKey) {
			var tabs = view.getViewTabs();
			if (tabs) {
				tabs.selectRight();
				utility.stopEvent(ev);
				return false
			}
		}
		return true;
		break;
	case 49:
	case 50:
	case 51:
	case 52:
		if (!tasksView.isLocked(true)) {
			if (ev.shiftKey) {
			} else {
				if (pressed != 52) {
					var p = Math.abs(48 - pressed);
					eval("taskList.tasksSetPriority" + p + "();")
				} else {
					taskList.tasksSetPriorityNone()
				}
			}
			utility.stopEvent(ev);
			return false
		}
		return true;
	case 46:
		if (!tasksView.isLocked(false)) {
			control.tasksDelete();
			utility.stopEvent(ev);
			return false
		}
		return true;
	case 47:
	case 63:
		if (ev.ctrlKey && ev.shiftKey && !ignoreCombo) {
			el("listFilter").focus();
			utility.stopEvent(ev);
			return false
		}
		return true;
	case 48:
		if (ev.ctrlKey && ev.shiftKey && !ignoreCombo) {
			view.selectView("Settings");
			utility.stopEvent(ev);
			return false
		}
		return true;
	case 54:
	case 94:
		if (ev.ctrlKey && ev.shiftKey && !ignoreCombo) {
			view.selectView("Overview");
			utility.stopEvent(ev);
			return false
		}
		return true;
	case 55:
		if (ev.ctrlKey && ev.shiftKey && !ignoreCombo) {
			view.selectView("Tasks");
			utility.stopEvent(ev);
			return false
		}
		return true;
	case 56:
		if (ev.ctrlKey && ev.shiftKey && !ignoreCombo) {
			view.selectView("Locations");
			utility.stopEvent(ev);
			return false
		}
		return true;
	case 57:
		if (ev.ctrlKey && ev.shiftKey && !ignoreCombo) {
			view.selectView("Contacts");
			utility.stopEvent(ev);
			return false
		}
		return true;
	case 97:
	case 97 - 32:
		switch (currentView) {
		case "Tasks":
			taskList.taskSelectAll();
			break;
		case "Contacts":
			var selected = contactsView.getSelected();
			if (selected == _T("INTERFACE_CONTACTS_CONTACTS_TAB")) {
				contactList.list.selectAll()
			} else {
				if (selected == _T("INTERFACE_CONTACTS_GROUPS_TAB")) {
					groupList.list.selectAll()
				}
			}
			break;
		case "Settings":
			var view_list = view.getViewList();
			if (view_list) {
				view_list.selectAll()
			}
			break;
		default:
			break
		}
		utility.stopEvent(ev);
		return false;
	case 99:
	case 99 - 32:
		if (!tasksView.isLocked(true)) {
			control.tasksComplete();
			utility.stopEvent(ev);
			return false
		}
		return true;
	case 100:
	case 100 - 32:
		if (!tasksView.isLocked(true) && taskList.list.selected.length > 0) {
			this._ifNotesThenSwitch();
			taskList.list.clearHover();
			tasksView.taskDetails.detailsDue.startEditing();
			utility.stopEvent(ev);
			return false
		}
		return true;
	case 102:
	case 102 - 32:
		if (!tasksView.isLocked(true) && taskList.list.selected.length > 0) {
			this._ifNotesThenSwitch();
			taskList.list.clearHover();
			tasksView.taskDetails.detailsReoccur.startEditing();
			utility.stopEvent(ev);
			return false
		}
		return true;
	case 103:
	case 103 - 32:
		if (!view.getPublicMode() && !tasksView.isLocked(true)
				&& taskList.list.selected.length > 0) {
			this._ifNotesThenSwitch();
			taskList.list.clearHover();
			tasksView.taskDetails.detailsDuration.startEditing();
			utility.stopEvent(ev);
			return false
		}
		return true;
	case 104:
	case 104 - 32:
		var tabs = view.getViewDetailTabs();
		if (tabs) {
			tabs.selectRight();
			utility.stopEvent(ev);
			return false
		}
		return true;
	case 109:
	case 109 - 32:
		if (view.getPublicMode()) {
			return false
		}
		if (!tasksView.isLocked(true) && !view.isNewUI()) {
			view.toggleMultiEditMode();
			utility.stopEvent(ev);
			return false
		}
		return true;
	case 114:
	case 114 - 32:
		if (view.getPublicMode()) {
			return false
		}
		if (!tasksView.isLocked(true) && taskList.list.selected.length > 0) {
			this._ifNotesThenSwitch();
			taskList.list.clearHover();
			tasksView.taskDetails.fieldsTitle.startEditing();
			utility.stopEvent(ev);
			return false
		} else {
			if (currentView == "Settings"
					&& settingsView.getSelected() == _T("INTERFACE_SETTINGS_LISTS_TAB")
					&& listList.list.selected.length > 0
					&& !Offline.isNotOnline()) {
				listList.list.clearHover();
				settingsView.listDetails.fieldsTitle.startEditing();
				utility.stopEvent(ev);
				return false
			} else {
				if (currentView == "Settings"
						&& settingsView.getSelected() == _T("INTERFACE_SETTINGS_LOCATIONS_TAB")
						&& locationList.list.selected.length > 0
						&& !Offline.isNotOnline()) {
					locationList.list.clearHover();
					settingsView.locationDetails.fieldsTitle.startEditing();
					utility.stopEvent(ev);
					return false
				} else {
					if (currentView == "Settings"
							&& settingsView.getSelected() == _T("INTERFACE_TASKS_TASK_DETAILS_TAGS")
							&& tagList.list.selected.length > 0
							&& !Offline.isNotOnline()) {
						tagList.list.clearHover();
						settingsView.tagDetails.fieldsTitle.startEditing();
						utility.stopEvent(ev);
						return false
					}
				}
			}
		}
		return true;
	case 110:
	case 110 - 32:
		switch (currentView) {
		case "Tasks":
			taskList.taskSelectNone();
			break;
		case "Contacts":
			if (contactsView.getSelected() == _T("INTERFACE_CONTACTS_CONTACTS_TAB")) {
				contactList.list.selectNone()
			} else {
				if (contactsView.getSelected() == _T("INTERFACE_CONTACTS_GROUPS_TAB")) {
					groupList.list.selectNone()
				}
			}
			break;
		case "Settings":
			var view_list = view.getViewList();
			if (view_list) {
				view_list.selectNone()
			}
			break;
		default:
			break
		}
		utility.stopEvent(ev);
		return false;
	case 74:
	case 106:
		this.keyboardEntryDown(ev);
		utility.stopEvent(ev);
		return false;
	case 75:
	case 107:
		this.keyboardEntryUp(ev);
		utility.stopEvent(ev);
		return false;
	case 105:
	case 105 - 32:
	case 120 - 32:
	case 120:
		this.keyboardEntrySelect(ev);
		utility.stopEvent(ev);
		return false;
	case 112:
	case 112 - 32:
		if (!view.getPublicMode() && !tasksView.isLocked(true)) {
			control.tasksPostpone();
			utility.stopEvent(ev);
			return false
		}
		return true;
	case 108:
	case 108 - 32:
		if (!view.getPublicMode() && !tasksView.isLocked(true)
				&& taskList.list.selected.length > 0) {
			this._ifNotesThenSwitch();
			taskList.list.clearHover();
			tasksView.taskDetails.detailsLocation.startEditing();
			utility.stopEvent(ev);
			return false
		}
		return true;
	case 115:
	case 115 - 32:
		if (!view.getPublicMode() && !tasksView.isLocked(true)
				&& taskList.list.selected.length > 0) {
			this._ifNotesThenSwitch();
			taskList.list.clearHover();
			tasksView.taskDetails.detailsTags.startEditing();
			utility.stopEvent(ev);
			return false
		}
		return true;
	case 116:
	case 116 - 32:
		if (view.getPublicMode()) {
			return true
		}
		if (!tasksView.isLocked(true)) {
			SmartAdd.getInstance().focus();
			utility.stopEvent(ev);
			return false
		} else {
			if (currentView == "Contacts"
					&& (contactsView.getSelected() == _T("INTERFACE_CONTACTS_CONTACTS_TAB") || contactsView
							.getSelected() == _T("INTERFACE_CONTACTS_GROUPS_TAB"))) {
				adder.div.onclick();
				utility.stopEvent(ev);
				return false
			} else {
				if (currentView == "Settings"
						&& settingsView.getSelected() == _T("INTERFACE_SETTINGS_LISTS_TAB")) {
					adder.div.onclick();
					utility.stopEvent(ev);
					return false
				}
			}
		}
		return true;
	case 117:
	case 117 - 32:
		if (!tasksView.isLocked(true) && taskList.list.selected.length > 0) {
			this._ifNotesThenSwitch();
			taskList.list.clearHover();
			tasksView.taskDetails.detailsURL.startEditing();
			utility.stopEvent(ev);
			return false
		}
		return true;
	case 121:
	case 121 - 32:
		if (!view.getPublicMode() && noteMgr.enabled === true) {
			var multiIds = false;
			if (view.getMultiEditMode(true)) {
				multiIds = taskList.getViewList().getSelected();
				if (multiIds.length == 1) {
					multiIds = false
				} else {
					multiIds = true
				}
			}
			if (multiIds === false) {
				if (view.getViewToken("Tasks", "Tasks")) {
					taskList.list.clearHover();
					var tabs = view.getViewDetailTabs();
					if (tabs) {
						tabs.selectRight()
					}
				}
				if (view.getViewToken("Tasks", "Notes")) {
					noteMgr.createNewNote();
					utility.stopEvent(ev);
					return false
				}
			}
		}
		return true;
	case 122:
	case 122 - 32:
		if (!view.getPublicMode() && statusBox.undoTimeout === null) {
			if (undoMgr.transactions.length > 0 && statusBox.visible === true
					&& statusBox.undo !== null
					&& statusBox.undo.innerHTML.indexOf("OK") === -1) {
				statusBox.undoClicked()
			} else {
				control.undoLastAction()
			}
		}
		return true;
	default:
		break
	}
};
EventManager.prototype.bodyKeyDownHandler = function(B) {
	B || (B = window.event);
	var E = utility.getEventTarget(B);
	if (E == null) {
		return true
	}
	var D = (B.charCode) ? B.charCode : ((B.which) ? B.which : B.keyCode);
	if (E
			&& (/^(textarea|input|text|password|select|button|submit)/i
					.test(E.type) || E.id == "map")) {
		return true
	}
	if (is_safari && D > 63200) {
		if (D == 63234) {
			D = 37
		} else {
			if (D == 63235) {
				D = 39
			} else {
				if (D == 63272) {
					D = 46
				}
			}
		}
	}
	if (is_mac && D == 30) {
		D = 54
	}
	if (is_gecko && !B.charCode && !B.which && B.keyCode == 116) {
		return true
	}
	if (B.keyCode === 0 && B.which === 46 && B.charCode === 46) {
		return true
	}
	if (D > 48
			&& D < 53
			&& (B.shiftKey || (!B.ctrlKey && !B.metaKey && !B.altKey && !B.shiftKey))) {
	} else {
		if (B.altKey
				|| B.ctrlKey
				&& !(B.shiftKey && [ 37, 39, 46, 47, 48, 54, 55, 56, 57, 63,
						76, 94, 191 ].indexOf(D) > -1) || B.metaKey) {
			return true
		}
	}
	switch (D) {
	case 37:
		if (B.ctrlKey && B.shiftKey) {
			var A = view.getViewTabs();
			if (A) {
				A.selectLeft();
				utility.stopEvent(B);
				return false
			}
		}
		return true;
		break;
	case 39:
		if (B.ctrlKey && B.shiftKey) {
			var A = view.getViewTabs();
			if (A) {
				A.selectRight();
				utility.stopEvent(B);
				return false
			}
		}
		return true;
		break;
	case 46:
		if (!tasksView.isLocked(false)) {
			control.tasksDelete();
			utility.stopEvent(B);
			return false
		}
		return true;
	case 191:
		if (B.ctrlKey && B.shiftKey) {
			el("listFilter").focus();
			utility.stopEvent(B);
			return false
		}
		return true;
	case 48:
		if (B.ctrlKey && B.shiftKey) {
			view.selectView("Settings");
			utility.stopEvent(B);
			return false
		}
		return true;
	case 54:
		if (B.ctrlKey && B.shiftKey) {
			view.selectView("Overview");
			utility.stopEvent(B);
			return false
		}
		return true;
	case 55:
		if (B.ctrlKey && B.shiftKey) {
			view.selectView("Tasks");
			utility.stopEvent(B);
			return false
		}
		return true;
	case 56:
		if (B.ctrlKey && B.shiftKey) {
			view.selectView("Locations");
			utility.stopEvent(B);
			return false
		}
		return true;
	case 57:
		if (B.ctrlKey && B.shiftKey) {
			view.selectView("Contacts");
			utility.stopEvent(B);
			return false
		}
		return true;
	default:
		break
	}
};
EventManager.prototype.keyboardEntryUp = function(A) {
	var B = view.getViewList();
	if (B) {
		B.keyboardUp(A.shiftKey)
	}
};
EventManager.prototype.keyboardEntryDown = function(A) {
	var B = view.getViewList();
	if (B) {
		B.keyboardDown(A.shiftKey)
	}
};
EventManager.prototype.keyboardEntrySelect = function(A) {
	var B = view.getViewList();
	if (B) {
		B.keyboardSelect(A.shiftKey)
	}
};
function Sexp(A) {
	if (A) {
		A = this._encaseIfNeeded(this._balanceIfNeeded(A))
	}
	this.str = A;
	this.len = 0;
	this.i = 0;
	this.sexpr = [];
	if (A) {
		this.len = this.str.length;
		this.sexpr = this.getSexpr()
	}
}
Sexp.prototype._balanceIfNeeded = function(H) {
	var D = 0;
	var A = H.length;
	var B = 0, E = 0;
	while (D < A) {
		if (H.charAt(D) == "(") {
			B++
		} else {
			if (H.charAt(D) == ")") {
				E++
			}
		}
		D++
	}
	if (B !== E) {
		if (B > E) {
			var F = B - E;
			for ( var D = 0; D < F; D++) {
				H += ")"
			}
		} else {
			if (E > B) {
				var F = E - B;
				for ( var D = 0; D < F; D++) {
					H = "(" + H
				}
			}
		}
	}
	return H
};
Sexp.prototype._encaseIfNeeded = function(J) {
	var F = 0;
	var B = J.length;
	var E = false;
	var D = [], I = [];
	var A = 0;
	var H = 0;
	while (F < B) {
		if (J.charAt(F) == "(") {
			D.push( [ A++, F ])
		} else {
			if (J.charAt(F) == ")") {
				I.push( [ --A, F ])
			}
		}
		if (A == 0) {
			H++
		}
		F++
	}
	E = !(D.length == I.length && (H == 1 && (D.length > 0 && D[0][1] == 0 && (I[I.length - 1][1] == (B - 1)))));
	if (E) {
		return "(" + J + ")"
	}
	return J
};
Sexp.prototype.getSexpr = function(D) {
	if (D) {
		this.i = 0;
		this.str = D;
		this.len = this.str.length
	}
	var B = null;
	var A = this.getToken();
	if (A == ")") {
		return null
	} else {
		if (A == "(") {
			B = [];
			A = this.getToken();
			while (A != ")") {
				if (A == "(") {
					this.i--;
					B.push(this.getSexpr())
				} else {
					if (A == null) {
						return B
					} else {
						B.push(A)
					}
				}
				A = this.getToken()
			}
			return B
		} else {
			return A
		}
	}
};
Sexp.HT = String.fromCharCode(9);
Sexp.LF = String.fromCharCode(10);
Sexp.VT = String.fromCharCode(11);
Sexp.FF = String.fromCharCode(12);
Sexp.CR = String.fromCharCode(13);
Sexp.SQ = String.fromCharCode(39);
Sexp.SB = String.fromCharCode(92);
Sexp.prototype._isWhiteSpace = function(A) {
	if (A == Sexp.HT || A == Sexp.LF || A == Sexp.VT || A == Sexp.FF
			|| A == Sexp.CR || A == " ") {
		return true
	} else {
		return false
	}
};
Sexp.prototype._isSpecial = function(A) {
	if (A == "(" || A == ")" || A == Sexp.SQ || A == ",") {
		return true
	} else {
		return false
	}
};
Sexp.prototype.getToken = function() {
	if (this.i >= this.len) {
		return null
	}
	while (this.i < this.len && this._isWhiteSpace(this.str.charAt(this.i))) {
		this.i++
	}
	if (this.i == this.len) {
		return null
	}
	if (this._isSpecial(this.str.charAt(this.i))) {
		this.i++;
		return this.str.charAt(this.i - 1)
	} else {
		if (this.str.charAt(this.i) == '"') {
			var B = [];
			this.i++;
			while (this.str.charAt(this.i) != '"' && this.i < this.len) {
				if (this.str.charAt(this.i) == Sexp.SB) {
					this.i++;
					var D = this.str.charAt(this.i);
					if (D == "n") {
						B.push(Sexp.LF)
					} else {
						if (D == "t") {
							B.push(Sexp.HT)
						}
					}
				} else {
					B.push(this.str.charAt(this.i));
					this.i++
				}
			}
			this.i++;
			return B.join("")
		} else {
			var A = [];
			while (this.i < this.len - 1) {
				if (this._isWhiteSpace(this.str.charAt(this.i))
						|| this._isSpecial(this.str.charAt(this.i))) {
					break
				} else {
					A.push(this.str.charAt(this.i));
					this.i++;
					if (this.str.charAt(this.i - 1) == ":") {
						A.push(this.getToken())
					}
				}
			}
			if (!(this._isWhiteSpace(this.str.charAt(this.i)) || this
					._isSpecial(this.str.charAt(this.i)))) {
				A.push(this.str.charAt(this.i));
				this.i++
			}
			return A.join("")
		}
	}
};
function Filter(E, D, B, A) {
	this.list = E;
	this.fieldMap = D;
	this.defaultField = A;
	this.sexp = this._rewriteQuery(B);
	try {
		this.nativeMatcherCode = this.rewriteSexpToNative(this.sexp);
		this.nativeMatcher = new Function("k", "v", this.nativeMatcherCode)
	} catch (F) {
		this.nativeMatcher = null
	}
	this.resultCache = {};
	this.implicitFilter = null;
	this.debug = false
}
Filter.LOGIC_AND = 0;
Filter.LOGIC_OR = 1;
Filter.LOGIC_NOT = 2;
Filter.prototype._rewriteQuery = function(E) {
	var B = {
		"lists" : {},
		"smartlists" : {},
		"this_smart" : {},
		"tags" : {}
	}, D, A;
	for ( var F in stateMgr.lists) {
		D = stateMgr.lists[F];
		A = "_" + D.name.toLowerCase();
		if (!D.archived && !D.deleted && D.filter === null && !(A in B.lists)) {
			B.lists[A] = F
		} else {
			if (!D.archived && !D.deleted && D.filter !== null
					&& !(A in B.smartlists)) {
				B.smartlists[A] = D.filter
			}
		}
	}
	return this._recursiveRewriteQuery(B, E)
};
Filter.prototype._recursiveRewriteQuery = function(A, K) {
	var I, J;
	if (!(K instanceof Array)) {
		J = this._rewriteFieldQuery(A, K);
		if (J[0] !== -1 && J[0] !== -2) {
			return [ 3, J ]
		} else {
			if (J[0] === -2) {
				var M = new Sexp(J[1]);
				return this._recursiveRewriteQuery(A, M.sexpr)
			} else {
				var M = new Sexp(J[1]);
				var D = {
					"lists" : A.lists,
					"smartlists" : A.smartlists,
					"tags" : A.tags
				};
				var B = {};
				for ( var E in A.this_smart) {
					B[E] = 1
				}
				B["_" + J[2]] = 1;
				D["this_smart"] = B;
				return this._recursiveRewriteQuery(D, M.sexpr)
			}
		}
	} else {
		for ( var H = 0, F = K.length; H < F; H++) {
			if ((I = this._isLogical(K[H])) == 3) {
				K[H] = this._recursiveRewriteQuery(A, K[H]);
				if (H + 1 < F && this._isLogical(K[H + 1]) === 3) {
					K.splice(H + 1, 0, [ Filter.LOGIC_AND, "AND" ]);
					H++;
					F++
				}
			} else {
				if (I === Filter.LOGIC_AND && H + 1 < F
						&& this._isLogical(K[H + 1]) === Filter.LOGIC_NOT) {
					K.splice(H, 1);
					F--;
					H--
				} else {
					K[H] = [ I, K[H] ]
				}
			}
		}
		return [ 4, K ]
	}
};
Filter.prototype._rewriteFieldQuery = function(H, J) {
	var F, E, D = null;
	if (J.indexOf(":") == -1) {
		E = J;
		J = this.defaultField + ":" + J;
		F = this.defaultField
	} else {
		var B = J.split(":");
		F = B.shift();
		E = B.join(":")
	}
	E = E.toLowerCase();
	D = E;
	if (F === "list") {
		if (("_" + E) in H.lists) {
			F = "listId";
			E = H.lists["_" + E]
		} else {
			if (("_" + E) in H.smartlists && (!(("_" + E) in H.this_smart))) {
				F = -1;
				E = H.smartlists["_" + E]
			}
		}
	} else {
		if (F === "tagContains") {
			if (("_" + E) in H.tags) {
				F = -2;
				E = H.tags["_" + E]
			} else {
				var I = [];
				for ( var A in tagMgr.index) {
					if (A.toLowerCase().indexOf(E) > -1 && tagMgr.index[A]
							&& tagMgr.index[A].length > 0) {
						I.push( [ "tag", A ].join(":"))
					}
				}
				if (I.length > 0) {
					F = -2;
					E = [ "(", I.join(" OR "), ")" ].join("");
					H.tags["_" + D] = E
				}
			}
		}
	}
	return [ F, E, F !== -1 ? F + ":" + E : D ]
};
Filter.prototype._isLogical = function(A) {
	if (A instanceof Array) {
		return 3
	}
	A = A.toLowerCase();
	return (A == "and" ? Filter.LOGIC_AND : (A == "or" ? Filter.LOGIC_OR
			: (A == "not" ? Filter.LOGIC_NOT : 3)))
};
Filter.prototype.dbg = function(A) {
	if (this.debug) {
		dbg(A)
	}
};
Filter.prototype.rewriteSexpToNative = function(D, E, K, I) {
	var F;
	var A = false;
	if (!E) {
		A = true;
		F = []
	} else {
		F = E
	}
	var M = D[0];
	var J = D[1];
	switch (M) {
	case 0:
		F.push(" && ");
		break;
	case 1:
		F.push(" || ");
		break;
	case 2:
		F.push("!");
		break;
	case 3:
		var B = J[0];
		var R = J[1];
		if (B in filterNameMap) {
			if (I) {
				F.push("!")
			}
			F.push(filterNameMap[B] + "(" + Utility.toJSON(R) + ", k, v)")
		} else {
			F.push("false")
		}
		break;
	case 4:
		var Q = J.length;
		if (Q === 0) {
			F.push("true")
		} else {
			if (I) {
				F.push("!(")
			} else {
				F.push("(")
			}
			var I = false;
			var O = 4;
			for ( var H = 0; H < Q; H++) {
				O = H === 0 ? 4 : J[H - 1][0];
				if (J[H][0] !== 2 && I) {
					this.rewriteSexpToNative(J[H], F, H === 0, I)
				} else {
					if (J[H][0] === 2) {
						if (H !== 0) {
							if (O === 3 || O === 4) {
								F.push(" && ")
							} else {
								if (O === 2) {
									I = false;
									continue
								}
							}
						}
						I = true;
						continue
					} else {
						this.rewriteSexpToNative(J[H], F, H === 0, I)
					}
				}
				I = false
			}
			F.push(")")
		}
		break
	}
	if (A) {
		return "return " + F.join("") + ";"
	}
};
Filter.prototype.apply = function(M, Q) {
	if (Q.length == 2 && Q[0] === 3) {
		var J = Q[1][0];
		var K = Q[1][1];
		var B = Q[1][2];
		return (J in this.fieldMap) ? (this.resultCache[B] = this.fieldMap[J](
				K, M, this.list[M])) : false
	}
	var I, D = null, A = null, H = 0, O = false;
	for ( var F = 0, E = Q[1].length; F < E; F++) {
		I = Q[1][F];
		if (I[0] < 3) {
			H = I[0];
			if (H === 0 && D === false) {
				O = true
			} else {
				if (H === 1 && D === true) {
					O = true
				} else {
					if (H === 2 && D === false) {
						O = true
					}
				}
			}
			continue
		}
		if (O) {
			O = false;
			continue
		}
		A = this.apply(M, I);
		switch (H) {
		case 0:
			if (D !== null) {
				if (!(D && A)) {
					A = false
				}
			}
			break;
		case 1:
			if (!D && !A) {
				A = false
			} else {
				A = true
			}
			break;
		case 2:
			A = !A;
			if (D !== null) {
				if (!D || !A) {
					A = false
				}
			}
			break
		}
		D = A;
		H = 0
	}
	return D
};
Filter.prototype.isMember = function(B) {
	this.resultCache = {};
	var A = this.list[B] !== null
			&& ((this.sexp[1].length == 0) || this.apply(B, this.sexp));
	this.resultCache = {};
	return A
};
Filter.prototype.setImplicitFilter = function(A) {
	this.implicitFilter = A
};
Filter.prototype.reduce = function() {
	var E = [];
	var B = !!this.nativeMatcher;
	for ( var D in this.list) {
		this.resultCache = {};
		var A = this.list[D];
		if (A !== null
				&& (!this.implicitFilter || (this.implicitFilter && this
						.implicitFilter(false, D, A)))
				&& ((this.sexp[1].length == 0) || (B ? this.nativeMatcher(D, A)
						: this.apply(D, this.sexp)))) {
			E.push(D)
		}
	}
	this.resultCache = {};
	return E
};
Filter.prototype._normalizeSexpR = function(F) {
	if (typeof F == "string") {
		var J, K;
		if (F.indexOf(":") == -1) {
			K = F;
			F = this.defaultField + ":" + F;
			J = this.defaultField
		} else {
			J = F.split(":");
			K = J[1];
			J = J[0]
		}
		return is(this.fieldMap[J]) ? [ true, K, J ] : false
	} else {
		var I = 3, D, E, A, B;
		var M = [];
		for ( var H = 0; H < F.length; H++) {
			if ((I = this._isLogical(F[H])) == 3) {
				E = this._normalizeSexpR(F[H]);
				if (D !== null && ((H + 1) % 2 == 0)) {
					B = false;
					break
				}
			} else {
				if (H >= F.length - 1) {
					break
				}
				if (I == Filter.LOGIC_AND && !E) {
					return false
				}
				A = this._normalizeSexpR(F[H + 1]);
				if (I == Filter.LOGIC_OR) {
					if ((A || E) && (!A || !E)) {
						if (A) {
							return A
						}
						if (E) {
							return E
						}
					}
				}
				if (A !== false) {
					B = [ E, this._normalizeLogical(I), A ];
					if (E instanceof Array && E[0] !== true) {
						return B
					}
					M.push(B)
				}
				E = B;
				H++
			}
			D = E
		}
		return F.length == 1 ? E : M
	}
};
Filter.prototype._quote = function(A) {
	if (A.charAt(0) !== '"' && A.indexOf(" ") > -1
			&& A.charAt(A.length - 1) !== '"') {
		return '"' + A + '"'
	}
	return A
};
Filter.prototype._combineSexp = function(B, A) {
	return B + ":" + this._quote(A)
};
Filter.prototype._sexpToString = function(F) {
	if (F === false) {
		return ""
	}
	if (typeof F == "string") {
		return F
	}
	if (F instanceof Array) {
		if (F.length == 1 && F instanceof Array && F[0] instanceof Array) {
			return this._sexpToString(F[0])
		}
		if (F.length == 3) {
			if (F[0] === true) {
				return this._combineSexp(F[2], F[1])
			}
		}
		var D = "(";
		var E = false, A;
		for ( var B = 0; B < F.length; B++) {
			A = this._sexpToString(F[B]);
			if (E && A == "" && B == F.length - 1) {
				D = D.trim();
				break
			} else {
				if (E) {
					D += F[B - 1] + " "
				}
				E = false
			}
			if (typeof F[B] == "string") {
				E = true;
				continue
			}
			D += A;
			if (B !== F.length - 1) {
				D += " "
			}
		}
		if (D.length == 1) {
			return ""
		}
		return D + ")"
	}
};
Filter.prototype.normalizeSexp = function() {
	var A = this._normalizeSexpR(this.sexp);
	return this._sexpToString(A)
};
Filter.prototype._normalizeLogical = function(A) {
	if (A == Filter.LOGIC_AND) {
		return "and"
	}
	if (A == Filter.LOGIC_OR) {
		return "or"
	}
	if (A == Filter.LOGIC_NOT) {
		return "not"
	}
	return null
};
function ImageManager() {
	this.static_n = 0;
	this.imageMap = {
		"list_locked" : {
			"src" : "/img/ico/ico_lock.gif",
			"obj" : null,
			"alt" : _T("INTERFACE_SETTINGS_LISTS_LIST_LOCKED"),
			"title" : _T("INTERFACE_SETTINGS_LISTS_LIST_LOCKED")
		},
		"list_default" : {
			"src" : "/img/ico/ico_check_gry.gif",
			"obj" : null,
			"alt" : _T("INTERFACE_SETTINGS_LISTS_LIST_DEFAULT"),
			"title" : _T("INTERFACE_SETTINGS_LISTS_LIST_DEFAULT")
		},
		"list_pending" : {
			"src" : "/img/ico/ico_exclaim_blu.gif",
			"obj" : null,
			"alt" : _T("INTERFACE_SETTINGS_LIST_PENDING"),
			"title" : _T("INTERFACE_SETTINGS_LIST_PENDING")
		},
		"list_smart" : {
			"src" : "/img/ico/ico_search_gry.gif",
			"obj" : null,
			"alt" : _T("INTERFACE_SETTINGS_LISTS_SMART_LIST"),
			"title" : _T("INTERFACE_SETTINGS_LISTS_SMART_LIST")
		},
		"search" : {
			"src" : "/img/ico/ico_search_blu.gif",
			"obj" : null,
			"alt" : "Search",
			"title" : "Search"
		},
		"busy" : {
			"src" : "/img/busy.gif",
			"obj" : null,
			"alt" : _T("INTERFACE_TASKS_LIST_DETAILS_LOADING"),
			"title" : _T("INTERFACE_TASKS_LIST_DETAILS_LOADING")
		},
		"calendar" : {
			"src" : "/img/ico/ico_calendar.gif",
			"obj" : null,
			"alt" : _T("INTERFACE_TASKS_TASK_DETAILS_TOOLTIP_DUE_DATE", {
				"KEY" : "(d)"
			}),
			"title" : _T("INTERFACE_TASKS_TASK_DETAILS_TOOLTIP_DUE_DATE", {
				"KEY" : "(d)"
			})
		},
		"reoccur" : {
			"src" : "/img/ico/ico_recur.gif",
			"obj" : null,
			"alt" : _T("INTERFACE_TASKS_TASK_DETAILS_TOOLTIP_REPEAT", {
				"KEY" : "(f)"
			}),
			"title" : _T("INTERFACE_TASKS_TASK_DETAILS_TOOLTIP_REPEAT", {
				"KEY" : "(f)"
			})
		},
		"duration" : {
			"src" : "/img/ico/ico_clock.gif",
			"obj" : null,
			"alt" : _T("INTERFACE_TASKS_TASK_DETAILS_TOOLTIP_TIME_ESTIMATE", {
				"KEY" : "(g)"
			}),
			"title" : _T("INTERFACE_TASKS_TASK_DETAILS_TOOLTIP_TIME_ESTIMATE",
					{
						"KEY" : "(g)"
					})
		},
		"tag" : {
			"src" : "/img/ico/ico_tag.gif",
			"obj" : null,
			"alt" : _T("INTERFACE_TASKS_TASK_DETAILS_TOOLTIP_TAGS", {
				"KEY" : "(s)"
			}),
			"title" : _T("INTERFACE_TASKS_TASK_DETAILS_TOOLTIP_TAGS", {
				"KEY" : "(s)"
			})
		},
		"url" : {
			"src" : "/img/ico/ico_link_gry.gif",
			"obj" : null,
			"alt" : _T("INTERFACE_TASKS_TASK_DETAILS_TOOLTIP_URL", {
				"KEY" : "(u)"
			}),
			"title" : _T("INTERFACE_TASKS_TASK_DETAILS_TOOLTIP_URL", {
				"KEY" : "(u)"
			})
		},
		"location" : {
			"src" : "/img/ico/ico_globe.gif",
			"obj" : null,
			"alt" : _T("INTERFACE_TASKS_TASK_DETAILS_TOOLTIP_LOCATION", {
				"KEY" : "(l)"
			}),
			"title" : _T("INTERFACE_TASKS_TASK_DETAILS_TOOLTIP_LOCATION", {
				"KEY" : "(l)"
			})
		},
		"edit" : {
			"src" : "/img/ico/ico_edit.gif",
			"obj" : null,
			"alt" : _T("INTERFACE_TOOLTIP_RENAME", {
				"KEY" : "(r)"
			}),
			"title" : _T("INTERFACE_TOOLTIP_RENAME", {
				"KEY" : "(r)"
			})
		},
		"filter_edit" : {
			"src" : "/img/ico/ico_edit.gif",
			"obj" : null,
			"alt" : _T("INTERFACE_TASKS_NOTES_EDIT"),
			"title" : _T("INTERFACE_TASKS_NOTES_EDIT")
		},
		"atom" : {
			"src" : "/img/ico/ico_atom.gif",
			"obj" : null,
			"alt" : "Atom Feed"
		},
		"trash" : {
			"src" : "/img/ico/ico_trash.gif",
			"obj" : null,
			"alt" : "Delete",
			"title" : "Delete"
		},
		"add_sm" : {
			"src" : "/img/ico/ico_add_sm.gif",
			"obj" : null,
			"alt" : "Add Note"
		},
		"add_lg" : {
			"src" : "/img/ico/ico_add.gif",
			"obj" : null,
			"alt" : _T("INTERFACE_TASKS_ADD_TASK"),
			"title" : _T("INTERFACE_TASKS_ADD_TASK")
		},
		"info_blue" : {
			"src" : "/img/ico/ico_info_blu.gif",
			"obj" : null,
			"alt" : "Information"
		},
		"help_blue" : {
			"src" : "/img/ico/ico_help_blu.gif",
			"obj" : null,
			"alt" : "Help"
		},
		"phone" : {
			"src" : "/img/ico/ico_phone.gif",
			"obj" : null,
			"alt" : "Enter your mobile phone number"
		},
		"email" : {
			"src" : "/img/ico/ico_email.gif",
			"obj" : null,
			"alt" : "Enter your SMS email address"
		},
		"weeklyplanner" : {
			"src" : "/img/ico/ico_weeklyplanner.gif",
			"obj" : null,
			"alt" : "Weekly Planner"
		},
		"done_grey" : {
			"src" : "/img/done_grey.gif",
			"obj" : null,
			"alt" : "Done - Inactive"
		},
		"done_blue" : {
			"src" : "/img/done_blue.gif",
			"obj" : null,
			"alt" : "Done"
		},
		"done_share_grey" : {
			"src" : "/img/btn_share_gry.gif",
			"obj" : null,
			"alt" : "Done Sharing - Inactive"
		},
		"done_share_blue" : {
			"src" : "/img/btn_share_blu.gif",
			"obj" : null,
			"alt" : "Done Sharing"
		},
		"done_send_grey" : {
			"src" : "/img/btn_send_gry.gif",
			"obj" : null,
			"alt" : "Done Sending - Inactive"
		},
		"done_send_blue" : {
			"src" : "/img/btn_send_blu.gif",
			"obj" : null,
			"alt" : "Done Sending"
		},
		"done_publish_grey" : {
			"src" : "/img/btn_publish_gry.gif",
			"obj" : null,
			"alt" : "Done Publishing - Inactive"
		},
		"done_publish_blue" : {
			"src" : "/img/btn_publish_blu.gif",
			"obj" : null,
			"alt" : "Done Publishing"
		},
		"cancel" : {
			"src" : "/img/btn_cancel_org.gif",
			"obj" : null,
			"alt" : "Cancel"
		},
		"tab_white_left" : {
			"src" : "/img/left_white.png",
			"obj" : null,
			"alt" : "Tab - Left - White"
		},
		"tab_white_right" : {
			"src" : "/img/right_white.png",
			"obj" : null,
			"alt" : "Tab - Right - White"
		},
		"tab_grey_left" : {
			"src" : "/img/left_grey.png",
			"obj" : null,
			"alt" : "Tab - Left - Grey"
		},
		"tab_grey_right" : {
			"src" : "/img/right_grey.png",
			"obj" : null,
			"alt" : "Tab - Right - Grey"
		},
		"tab_blue_left" : {
			"src" : "/img/left_blue.png",
			"obj" : null,
			"alt" : "Tab - Left - Blue"
		},
		"tab_blue_right" : {
			"src" : "/img/right_blue.png",
			"obj" : null,
			"alt" : "Tab - Right - Blue"
		},
		"whitebox_back" : {
			"src" : "/img/whitebox_back.gif",
			"obj" : null,
			"alt" : "Whitebox - Back"
		},
		"whitebox_t" : {
			"src" : "/img/whitebox_t.gif",
			"obj" : null,
			"alt" : "Whitebox - Back"
		},
		"whitebox_tl" : {
			"src" : "/img/whitebox_tl.gif",
			"obj" : null,
			"alt" : "Whitebox - Top"
		},
		"whitebox_tr" : {
			"src" : "/img/whitebox_tr.gif",
			"obj" : null,
			"alt" : "Whitebox - Top Left"
		},
		"whitebox_b" : {
			"src" : "/img/whitebox_b.gif",
			"obj" : null,
			"alt" : "Whitebox - Top Right"
		},
		"whitebox_bl" : {
			"src" : "/img/whitebox_bl.gif",
			"obj" : null,
			"alt" : "Whitebox - Bottom"
		},
		"whitebox_br" : {
			"src" : "/img/whitebox_br.gif",
			"obj" : null,
			"alt" : "Whitebox - Bottom Left"
		},
		"whitebox_l" : {
			"src" : "/img/whitebox_l.gif",
			"obj" : null,
			"alt" : "Whitebox - Left"
		},
		"whitebox_r" : {
			"src" : "/img/whitebox_r.gif",
			"obj" : null,
			"alt" : "Whitebox - Right"
		},
		"bluebox_back" : {
			"src" : "/img/bluebox_back.gif",
			"obj" : null,
			"alt" : "Bluebox - Back"
		},
		"bluebox_tl" : {
			"src" : "/img/bluebox_tl.gif",
			"obj" : null,
			"alt" : "Bluebox - Top"
		},
		"bluebox_tr" : {
			"src" : "/img/bluebox_tr.gif",
			"obj" : null,
			"alt" : "Bluebox - Top Left"
		},
		"bluebox_bl" : {
			"src" : "/img/bluebox_bl.gif",
			"obj" : null,
			"alt" : "Bluebox - Bottom"
		},
		"bluebox_br" : {
			"src" : "/img/bluebox_br.gif",
			"obj" : null,
			"alt" : "Bluebox - Bottom Left"
		},
		"bluetab" : {
			"src" : "/img/ico/ico_close_blu_blu.gif",
			"obj" : null,
			"alt" : "Blue Tab"
		},
		"whitetab" : {
			"src" : "/img/ico/ico_close_gry_whi.gif",
			"obj" : null,
			"alt" : "White Tab"
		},
		"orangetab" : {
			"src" : "/img/ico/ico_close_org_whi.gif",
			"obj" : null,
			"alt" : "Orange Tab"
		},
		"orangebluetab" : {
			"src" : "/img/ico/ico_close_org_blu.gif",
			"obj" : null,
			"alt" : "Orange Blue Tab"
		},
		"locations_ch" : {
			"src" : "/img/locations/ch.gif",
			"obj" : null,
			"alt" : ""
		},
		"locations_iw_bl" : {
			"src" : "/img/locations/iw_bl.png",
			"obj" : null,
			"alt" : ""
		},
		"locations_iw_br" : {
			"src" : "/img/locations/iw_br.png",
			"obj" : null,
			"alt" : ""
		},
		"locations_iw_l" : {
			"src" : "/img/locations/iw_l.png",
			"obj" : null,
			"alt" : ""
		},
		"locations_iw_r2" : {
			"src" : "/img/locations/iw_r2.png",
			"obj" : null,
			"alt" : ""
		},
		"locations_iw_r" : {
			"src" : "/img/locations/iw_r.png",
			"obj" : null,
			"alt" : ""
		},
		"locations_iw_tl" : {
			"src" : "/img/locations/iw_tl.png",
			"obj" : null,
			"alt" : ""
		},
		"locations_iw_tr" : {
			"src" : "/img/locations/iw_tr.png",
			"obj" : null,
			"alt" : ""
		},
		"locations_mkr_dblu" : {
			"src" : "/img/locations/mkr_dblu.png",
			"obj" : null,
			"alt" : ""
		},
		"locations_mkr_grn" : {
			"src" : "/img/locations/mkr_grn.png",
			"obj" : null,
			"alt" : ""
		},
		"locations_mkr_gry" : {
			"src" : "/img/locations/mkr_gry.png",
			"obj" : null,
			"alt" : ""
		},
		"locations_mkr_lblu" : {
			"src" : "/img/locations/mkr_lblu.png",
			"obj" : null,
			"alt" : ""
		},
		"locations_mkr_org" : {
			"src" : "/img/locations/mkr_org.png",
			"obj" : null,
			"alt" : ""
		},
		"locations_mkr_shadow" : {
			"src" : "/img/locations/mkr_shadow.png",
			"obj" : null,
			"alt" : ""
		}
	}
}
ImageManager.prototype.init = function() {
	return;
	if (typeof (is_ie) !== "undefined" && is_ie === false) {
		this.preloadImages()
	}
};
ImageManager.IS_HTTPS = isBrowser && window && "location" in window
		&& "protocol" in window.location
		&& window.location.protocol === "https:";
ImageManager.prototype.getNextStatic = function() {
	if (ImageManager.IS_HTTPS || (rtmIsOffline && Offline.isReady())) {
		return ""
	}
	if (is_ie6) {
		return "http://static.rememberthemilk.com"
	}
	var A = this.static_n++;
	if (this.static_n > 2) {
		this.static_n = 0
	}
	return "http://" + A + ".static.rememberthemilk.com"
};
ImageManager.prototype.preloadImages = function() {
	return;
	for ( var A in this.imageMap) {
		this.imageMap[A].obj = new Image();
		this.imageMap[A].obj.src = this.getNextStatic() + this.imageMap[A].src
	}
};
ImageManager.prototype.getImageHTML = function(A) {
	if (A == null) {
		return null
	}
	return "<img src=" + quoted(this.getNextStatic() + this.imageMap[A].src)
			+ " alt=" + quoted(this.imageMap[A].alt) + " />"
};
ImageManager.prototype.getImage = function(E, B, D) {
	if (E == null) {
		return null
	}
	if (D) {
		var A = document.createElement("a");
		A.href = " ";
		A.title = this.imageMap[E].title
	}
	var F = document.createElement("img");
	F.src = this.getNextStatic() + this.imageMap[E].src;
	F.alt = this.imageMap[E].alt;
	F.title = this.imageMap[E].title;
	if (B) {
		F.className = "field_img"
	}
	if (D) {
		A.appendChild(F);
		return A
	}
	return F
};
function InviteManager(H, F, D, E, B) {
	this.formId = H;
	this.firstId = F;
	this.emailId = D;
	this.noteId = E;
	this.submitId = B;
	this.form = el(H);
	this.firstname = el(F);
	this.email = el(D);
	this.note = el(E);
	this.submit = el(B);
	var A = this;
	this.submit.onclick = function(I) {
		A.sendInvite();
		return false
	};
	this.mbn = "rtm.invitemanager."
}
InviteManager.prototype.sendInvite = function() {
	var D = this.firstname.value;
	var A = this.email.value;
	var B = this.note.value;
	if (D.trim().length == 0) {
		statusBox.setText(_T("INTERFACE_STATUS_NEED_PROVIDE_FIRST_NAME"),
				false, false);
		this.firstname.focus();
		return false
	}
	if (A.trim().length == 0) {
		statusBox.setText(_T("INTERFACE_STATUS_NEED_PROVIDE_EMAIL"), false,
				false);
		this.email.focus();
		return false
	}
	this.submit.disabled = true;
	this.submit.value = _T("INTERFACE_CONTACTS_INVITES_SENDING");
	transMgr.request("invites.send", utility.encodeJavaScript( {
		"firstname" : D,
		"email" : A,
		"note" : B
	}))
};
InviteManager.prototype.setEmail = function(A) {
	this.email.value = A
};
InviteManager.prototype.show = function() {
	if (view.getSelected() != "Contacts") {
		view.selectView("Contacts")
	}
	if (contactsView.getSelected() != "Invites") {
		contactsView.switchView(_T("INTERFACE_CONTACTS_INVITES_TAB"))
	}
};
InviteManager.prototype.enable = function() {
	Utility.enableForm(this.form, true)
};
InviteManager.prototype.disable = function() {
	Utility.enableForm(this.form, false)
};
function StringManager() {
	this.strings = {
		"error.contacts.add.alreadyExists" : "INTERFACE_ERROR_CONTACTS_ADD_ALREADYEXISTS",
		"error.contacts.add.failure" : "INTERFACE_ERROR_CONTACTS_ADD_FAILURE",
		"error.contacts.add.emailSpecified" : [
				"INTERFACE_ERROR_CONTACTS_ADD_EMAILSPECIFIED", "", false ],
		"error.contacts.add.noYourself" : "INTERFACE_ERROR_CONTACTS_ADD_NOYOURSELF",
		"error.contacts.add.noExist" : "INTERFACE_ERROR_CONTACTS_ADD_NOEXIST",
		"error.groups.add.failure" : "INTERFACE_ERROR_GROUPS_ADD_FAILURE",
		"error.groups.add.alreadyExists" : "INTERFACE_ERROR_GROUPS_ADD_ALREADYEXISTS",
		"help.lists.removing" : "INTERFACE_HELP_LISTS_REMOVING",
		"help.tasks.duedate" : [ "INTERFACE_HELP_TASKS_DUEDATE",
				"/help/answers/basics/dateformat.rtm", true ],
		"help.tasks.reoccur" : [ "INTERFACE_HELP_TASKS_REOCCUR",
				"/help/answers/basics/repeatformat.rtm", true ],
		"help.tasks.duration" : [ "INTERFACE_HELP_TASKS_DURATION",
				"/help/answers/basics/timeestimateformat.rtm", true ],
		"help.tasks.tags" : [ "INTERFACE_HELP_TASKS_TAGS",
				"/help/answers/tags/whatare.rtm", true ],
		"help.tasks.inbox" : [ "INTERFACE_HELP_TASKS_INBOX",
				"/help/answers/tasks/whatinbox.rtm", true ],
		"help.tasks.sent" : [ "INTERFACE_HELP_TASKS_SENT",
				"/help/answers/tasks/whatsent.rtm", true ],
		"help.tasks.publishing" : [ "INTERFACE_HELP_TASKS_PUBLISHING",
				"/help/answers/sharing/whatpublish.rtm", true ],
		"help.tasks.sharing" : [ "INTERFACE_HELP_TASKS_SHARING",
				"/help/answers/sharing/whatshare.rtm", true ],
		"help.tasks.save" : [ "INTERFACE_HELP_TASKS_SAVE",
				"/help/answers/smartlists/whatare.rtm", true ],
		"help.contacts" : [ "INTERFACE_HELP_CONTACTS",
				"/help/answers/contacts/whatcontacts.rtm", true ],
		"help.contacts.add" : "INTERFACE_HELP_CONTACTS_ADD",
		"help.groups" : [ "INTERFACE_HELP_GROUPS",
				"/help/answers/contacts/whatgroups.rtm", true ],
		"help.invites" : "INTERFACE_HELP_INVITES",
		"help.reminders.datedue" : [ "INTERFACE_HELP_REMINDERS_DATEDUE",
				"/help/answers/reminders/whenreminders.rtm", true ],
		"help.reminders.start" : [ "INTERFACE_HELP_REMINDERS_START",
				"/help/answers/reminders/whenreminders.rtm", true ],
		"help.reminders.timedue" : [ "INTERFACE_HELP_REMINDERS_TIMEDUE",
				"/help/answers/reminders/whenreminders.rtm", true ],
		"help.reminders.email" : "INTERFACE_HELP_REMINDERS_EMAIL",
		"help.reminders.im" : "INTERFACE_HELP_REMINDERS_IM",
		"help.reminders.phone" : "INTERFACE_HELP_REMINDERS_PHONE",
		"help.reminders.username" : "INTERFACE_HELP_REMINDERS_USERNAME",
		"help.reminders.other" : [ "INTERFACE_HELP_REMINDERS_OTHER",
				"/help/answers/reminders/setreminders.rtm", true ],
		"help.reminders.network" : "INTERFACE_HELP_REMINDERS_NETWORK",
		"help.reminders.smsmax" : "INTERFACE_HELP_REMINDERS_SMSMAX",
		"help.settings.general" : "INTERFACE_HELP_SETTINGS_GENERAL",
		"help.settings.lists" : [ _T("INTERFACE_HELP_SETTINGS_LISTS"),
				_T("INTERFACE_HELP_LISTS_REMOVING").replace(/BOLD/g, "ITALIC") ]
				.join(" "),
		"help.settings.tags" : [ _T("INTERFACE_TAGS_HELP_MANAGE"),
				_T("INTERFACE_TAGS_HELP_REMOVING") ].join(" "),
		"help.settings.locations" : "INTERFACE_HELP_LOCATIONS",
		"help.settings.reminders" : "INTERFACE_HELP_SETTINGS_REMINDERS",
		"help.settings.services" : [ "INTERFACE_HELP_SETTINGS_SERVICES",
				"/services/", true ],
		"help.settings.sync" : [ "INTERFACE_SYNC_MSG_PREFS",
				"/services/milksync/", true ],
		"help.settings.info" : [ "INTERFACE_HELP_SETTINGS_INFO",
				"/help/answers/sending/emailinbox.rtm", true ]
	}
}
StringManager.prototype.getString = function(A) {
	if (this.strings[A]) {
		return _TF(this.strings[A], {
			"MILKSYNC" : "MilkSync"
		})
	} else {
		return "STRING_NOT_FOUND"
	}
};
function Legend(D, B, A) {
	this.boxId = D;
	this.closeId = B;
	this.boxDiv = el(D);
	this.closeButton = el(B);
	if (A) {
		this.mapLegend = true
	} else {
		this.mapLegend = false
	}
	this.visible = false
}
Legend.prototype.init = function() {
	var A = this;
	this.closeButton.onclick = function() {
		A.hide();
		if (!view.getPublicMode()
				&& (typeof rtmRequestedList == "undefined" || rtmRequestedList === null)) {
			transMgr.request(A.mapLegend ? "legend.setMapVisible"
					: "legend.setVisible", utility.encodeJavaScript( {
				"visible" : false
			}))
		} else {
			A.setCookie()
		}
	}
};
Legend.prototype.show = function() {
	this.boxDiv.style.display = "";
	this.visible = true;
	if (this.mapLegend) {
		locationMgr.handleListResize()
	}
};
Legend.prototype.toggle = function() {
	if (this.visible) {
		this.hide()
	} else {
		this.show()
	}
	if (!view.getPublicMode()
			&& (typeof rtmRequestedList == "undefined" || rtmRequestedList === null)) {
		transMgr.request(this.mapLegend ? "legend.setMapVisible"
				: "legend.setVisible", utility.encodeJavaScript( {
			"visible" : this.visible
		}))
	}
};
Legend.prototype.hide = function() {
	this.boxDiv.style.display = "none";
	this.visible = false;
	if (this.mapLegend) {
		locationMgr.handleListResize()
	}
};
Legend.prototype.setCookie = function() {
	setCookie("LEGEND_SHOW", 0, null, "/", null, null)
};
function OverviewNews(B, A, E, D) {
	this.boxId = B;
	this.closeId = A;
	this.textId = E;
	this.dateId = D;
	this.boxDiv = el(B);
	this.closeButton = el(A);
	this.text = el(E);
	this.date = el(D)
}
OverviewNews.prototype.init = function() {
	var A = this;
	this.closeButton.onclick = function() {
		A.hide();
		transMgr.request("configuration.overviewnews.setVisible", utility
				.encodeJavaScript( {
					"visible" : false
				}))
	}
};
OverviewNews.prototype.show = function() {
	this.boxDiv.style.display = ""
};
OverviewNews.prototype.hide = function() {
	this.boxDiv.style.display = "none"
};
OverviewNews.prototype.setText = function(B, A) {
	this.text.innerHTML = B;
	this.date.innerHTML = _T("INTERFACE_OVERVIEW_NEWS_POSTED", {
		"DATE" : (DateFormat(Intl.preferred_formats.weekly_planner, new Date(
				A * 1000)))
	})
};
function List(D, B) {
	this.id = D;
	this.table = el(D);
	this.entries = [];
	this.selected = [];
	this.selectedMap = {};
	this.busy = [];
	this.busyMap = {};
	this.map = {};
	this.reverseMap = {};
	this.present = {};
	this.type = B;
	this.inited = false;
	this.invalidated = [];
	this.prioState = List.LIST_PRIO_INCOMPLETE;
	this.inAdvise = false;
	this.needToBlit = true;
	this.dateKlass = "xtd_date";
	this.hashMap = null;
	this.sortFields = null;
	this.sortSpec = null;
	this.sortSpecClean = null;
	this.clickable = true;
	this.visible = false;
	this.emptyMessage = null;
	this.showingEmpty = false;
	this.tableKlass = null;
	this.hoverable = true;
	this.multiSelectable = true;
	this.hoveringId = null;
	this.keyboardPosition = null;
	this.keyboardEntries = [];
	this.keyboardHover = [];
	this.table.className = "xtable";
	this.table.cellSpacing = "0";
	this.table.cellPadding = "0";
	if (!is_ie && (is_safari || !is_khtml)) {
		this.table.innerHTML = "<tbody></tbody>"
	} else {
		var A = this.table.tBodies[0];
		if (A) {
			while (A.childNodes.length > 0) {
				A.removeChild(A.firstChild)
			}
		}
	}
}
List.LIST_TYPE_PLAIN = 1;
List.LIST_TYPE_PRIO = 2;
List.LIST_TYPE_CHECK = 4;
List.LIST_TYPE_DATE = 8;
List.LIST_TYPE_IMAGE = 22;
List.LIST_TYPE_LOADING = 50;
List.LIST_TYPE_ADDING = 100;
List.LIST_PRIO_INCOMPLETE = 0;
List.LIST_PRIO_COMPLETED = 1;
List.LIST_SORT_ASC = 0;
List.LIST_SORT_DESC = 1;
List.LIST_SORT_NULL_IS_NEGATIVE = 2;
List.prototype.isMultiSelectable = function() {
	return this.multiSelectable
};
List.prototype.setTableKlass = function(A) {
	this.tableKlass = A
};
List.prototype.setEmptyMessage = function(A) {
	this.emptyMessage = A
};
List.prototype.setDateKlass = function(A) {
	this.dateKlass = A
};
List.prototype.setMultiSelectable = function(A) {
	this.multiSelectable = A
};
List.prototype.show = function() {
	this.visible = true;
	this.table.style.display = "";
	this.fireSelectionStarted();
	this.fireSelectionFinished()
};
List.prototype.hide = function() {
	this.visible = false;
	this.table.style.display = "none";
	if ("snake_" in this) {
		this.snake_.hide(true)
	}
	if ("multi_snake_" in this) {
		this.multi_snake_.hide(true)
	}
	this.fireSelectionCleared()
};
List.prototype._findPosition = function(A) {
	var B = 0;
	if (A.offsetParent) {
		while (A.offsetParent) {
			B += A.offsetTop;
			A = A.offsetParent
		}
	} else {
		if (A.y) {
			B += A.y
		}
	}
	return B
};
List.prototype._findInnerHeight = function() {
	if (window.innerHeight) {
		return window.innerHeight
	}
	if (is_ie) {
		return document.documentElement.clientHeight
	}
};
List.prototype._findScrollTop = function(A) {
	if (is_safari || is_gecko || is_khtml) {
		return window.scrollY
	}
	if (is_ie || is_opera) {
		if (document.compatMode && document.compatMode == "CSS1Compat") {
			return document.documentElement.scrollTop
		}
		return document.body.scrollTop
	}
	if (A.parentNode) {
		while (A.parentNode) {
			top = A.scrollTop;
			if (top !== 0) {
				break
			}
			A = A.parentNode
		}
		if (!A.parentNode && A.scrollTop === 0) {
			top = A.scrollTop
		}
	}
	return top
};
List.prototype.keyboardUp = function(B) {
	if (this.showingEmpty) {
		return false
	}
	if (this.keyboardPosition === null) {
		this.keyboardPosition = 0;
		Utility
				.addClass(this.table.rows[this.keyboardPosition],
						"xtr_keyboard");
		this.keyboardEntries.push(this.keyboardPosition)
	} else {
		this.keyboardEnsureBounds();
		Utility.removeClass(this.table.rows[this.keyboardPosition],
				"xtr_keyboard");
		if (!B) {
			this.keyboardHover.spliceAll(this.keyboardPosition);
			this.setRowHover(this.table.rows[this.keyboardPosition], false);
			this.keyboardEntries.spliceAll(this.keyboardPosition)
		} else {
			this.keyboardHover.push(this.keyboardPosition);
			this.setRowHover(this.table.rows[this.keyboardPosition], true)
		}
		if (this.keyboardPosition === 0) {
			this.keyboardPosition = this.table.rows.length - 1;
			var E = is_opera ? document.documentElement.clientHeight
					: document.body.clientHeight;
			window.scrollBy(0, E)
		} else {
			this.keyboardPosition--;
			var D = this._findPosition(this.table.rows[this.keyboardPosition]);
			var A = this._findInnerHeight() / 2;
			if (is_safari_2) {
				D += (32 * this.keyboardPosition) + this.keyboardPosition
			}
			if (D < this._findScrollTop(document.body)) {
				window.scrollBy(0, -A)
			}
		}
		Utility
				.addClass(this.table.rows[this.keyboardPosition],
						"xtr_keyboard");
		this.keyboardEntries.spliceAll(this.keyboardPosition);
		this.keyboardEntries.push(this.keyboardPosition)
	}
	if (B) {
		this.keyboardHover.push(this.keyboardPosition);
		this.setRowHover(this.table.rows[this.keyboardPosition], true)
	}
};
List.prototype.keyboardDown = function(B) {
	if (this.showingEmpty) {
		return false
	}
	if (this.keyboardPosition === null) {
		this.keyboardPosition = 0;
		Utility
				.addClass(this.table.rows[this.keyboardPosition],
						"xtr_keyboard");
		this.keyboardEntries.push(this.keyboardPosition)
	} else {
		this.keyboardEnsureBounds();
		Utility.removeClass(this.table.rows[this.keyboardPosition],
				"xtr_keyboard");
		if (!B) {
			this.keyboardHover.spliceAll(this.keyboardPosition);
			this.setRowHover(this.table.rows[this.keyboardPosition], false);
			this.keyboardEntries.spliceAll(this.keyboardPosition)
		} else {
			this.keyboardHover.push(this.keyboardPosition);
			this.setRowHover(this.table.rows[this.keyboardPosition], true)
		}
		var F = this._findScrollTop(document.body);
		if (this.keyboardPosition + 1 < this.table.rows.length) {
			this.keyboardPosition++;
			var D = this._findPosition(this.table.rows[this.keyboardPosition]);
			if (is_safari_2) {
				D += (32 * this.keyboardPosition) + this.keyboardPosition
			}
			var E = this._findInnerHeight();
			var A = E / 2;
			if (D + 32 > E + F) {
				window.scrollBy(0, A)
			}
		} else {
			this.keyboardPosition = 0;
			window.scrollBy(0, -F)
		}
		Utility
				.addClass(this.table.rows[this.keyboardPosition],
						"xtr_keyboard");
		this.keyboardEntries.spliceAll(this.keyboardPosition);
		this.keyboardEntries.push(this.keyboardPosition)
	}
	if (B) {
		this.keyboardHover.push(this.keyboardPosition);
		this.setRowHover(this.table.rows[this.keyboardPosition], true)
	}
};
List.prototype.keyboardSelect = function(A) {
	if (this.showingEmpty) {
		return false
	}
	if (this.keyboardEntries.length > 0) {
		this.keyboardEnsureBounds();
		var D = {};
		for ( var B = 0; B < this.keyboardEntries.length; B++) {
			if (this.keyboardPosition !== this.keyboardEntries[B]) {
				D[this.keyboardEntries[B]] = true;
				this.setRowHover(this.table.rows[this.keyboardEntries[B]],
						false)
			}
		}
		if (!A) {
			this.selectSome(D);
			this.selectOne(this.entries[this.keyboardPosition][0], false, true)
		} else {
			this.keyboardHover.spliceAll(this.keyboardPosition);
			if (this.keyboardHover.length > 0) {
				this.selectOne(this.entries[this.keyboardHover[0]][0], false,
						true)
			}
			this.selectMulti(this.entries[this.keyboardPosition][0], true)
		}
		this.keyboardHover = [];
		this.setRowHover(this.table.rows[this.keyboardPosition], false)
	}
};
List.prototype.keyboardClearHover = function(A) {
	if (this.showingEmpty) {
		return false
	}
	for ( var B = 0; B < this.keyboardEntries.length; B++) {
		var D = this.keyboardEntries[B];
		if (this.table.rows[D]) {
			this.setRowHover(this.table.rows[D], false);
			Utility.removeClass(this.table.rows[D], "xtr_keyboard")
		}
	}
	this.keyboardHover = [];
	this.keyboardEntries = [];
	this.keyboardEnsureBounds();
	if (A && this.keyboardPosition !== null) {
		if (this.table.rows[this.keyboardPosition]) {
			Utility.addClass(this.table.rows[this.keyboardPosition],
					"xtr_keyboard")
		}
		this.keyboardEntries.push(this.keyboardPosition)
	}
};
List.prototype.keyboardEnsureBounds = function() {
	if (this.keyboardPosition !== null
			&& this.keyboardPosition > this.table.rows.length - 1) {
		this.keyboardPosition = this.table.rows.length - 1
	}
};
List.prototype.getLastSelected = function() {
	if (this.selected.length) {
		return this.selected[this.selected.length - 1]
	} else {
		return null
	}
};
List.prototype.getLastSelectedId = function() {
	var A = this.getLastSelected();
	if (A !== null) {
		return this.entries[A][0]
	}
	return null
};
List.prototype.setSortParameters = function(E, A, B) {
	this.hashMap = E;
	this.sortFields = A;
	this.sortSpec = [];
	this.sortSpecClean = B;
	for ( var D = 0; D < B.length; D++) {
		this.sortSpec[D] = 1;
		if (B[D] == List.LIST_SORT_DESC) {
			this.sortSpec[D] = -1
		}
		if (B[D] == List.LIST_SORT_NULL_IS_NEGATIVE) {
			this.sortSpec[D] = -2
		}
	}
};
List.prototype.doSort = function(B, A) {
	for ( var D = 0; D < B.length; D++) {
		if (B[D] === null && A[D] !== null) {
			return 1
		} else {
			if (B[D] !== null && A[D] === null) {
				return -1
			}
		}
		if (B[D] > A[D]) {
			return 1
		} else {
			if (B[D] < A[D]) {
				return -1
			}
		}
	}
	return 0
};
List.prototype.getSelected = function() {
	var A = [];
	for ( var B = 0; B < this.selected.length; B++) {
		A.push(this.reverseMap[this.selected[B]])
	}
	return A
};
List.prototype.getBusy = function() {
	var B = [];
	for ( var A = 0; A < this.busy.length; A++) {
		B.push(this.reverseMap[this.busy[A]])
	}
	return B
};
List.prototype.sort = function() {
	messageBus.broadcast(this, this.mbn + "sortStarted");
	if (this.hashMap == null || this.sortFields == null) {
		return false
	}
	var was_empty = this.showingEmpty;
	if (this.entries.length > 0) {
		this.showingEmpty = false
	}
	var keyboardPositionId = this.keyboardPosition !== null ? this.reverseMap[this.keyboardPosition]
			: null;
	var selectedIds = this.getSelected();
	var busyIds = this.getBusy();
	var startTime = new Date();
	var entriesSort = [];
	for ( var j = 0; j < this.entries.length; j++) {
		var entry = this.entries[j];
		var entryTuple = [];
		for ( var i = 0; i < this.sortFields.length; i++) {
			var f = this.sortFields[i];
			var v = eval("this.hashMap[entry[0]]." + f);
			entryTuple.push(v)
		}
		entryTuple.list = this;
		entryTuple.id = this.entries[j];
		entriesSort.push(entryTuple)
	}
	entriesSort.sort(this.doSort);
	var remapList = [];
	for ( var i = 0; i < this.entries.length; i++) {
		remapList.push( [ entriesSort[i].id[0], i ])
	}
	var iters = 0;
	var needUpdate = [];
	for ( var i = 0; i < remapList.length; i++) {
		var oldId = this.reverseMap[remapList[i][1]];
		var newId = remapList[i][0];
		var oldPos = remapList[i][1];
		var newPos = this.map[newId];
		if (oldPos == newPos) {
			continue
		}
		this.map[oldId] = newPos;
		this.reverseMap[newPos] = oldId;
		this.map[newId] = oldPos;
		this.reverseMap[oldPos] = newId;
		var tmpEntry = this.entries[oldPos];
		this.entries[oldPos] = this.entries[newPos];
		this.entries[newPos] = tmpEntry;
		needUpdate.push(oldPos);
		needUpdate.push(newPos);
		iters++
	}
	var rcuSelected = [];
	var rcuSelectedMap = {};
	for ( var i = 0; i < selectedIds.length; i++) {
		var pos = this.map[selectedIds[i]];
		rcuSelected.push(pos);
		rcuSelectedMap[pos] = true;
		this.setRowSelect(this.table.rows[pos], true)
	}
	for ( var i = 0; i < this.selected.length; i++) {
		var pos = this.selected[i];
		if (!rcuSelectedMap[pos]) {
			this.setRowSelect(this.table.rows[pos], false)
		}
	}
	this.selected = rcuSelected;
	this.selectedMap = rcuSelectedMap;
	var rcuBusy = [];
	var rcuBusyMap = {};
	for ( var i = 0; i < busyIds.length; i++) {
		var pos = this.map[busyIds[i]];
		rcuBusy.push(pos);
		rcuBusyMap[pos] = true;
		this.tableSetRowBusy(pos, true)
	}
	for ( var i = 0; i < this.busy.length; i++) {
		var pos = this.busy[i];
		if (!is(rcuBusyMap[pos])) {
			this.tableSetRowBusy(pos, false)
		}
	}
	this.busy = rcuBusy;
	this.busyMap = rcuBusyMap;
	var endTime = new Date();
	var startTime = new Date();
	var seen = {};
	for ( var i = 0; i < needUpdate.length; i++) {
		var id = needUpdate[i];
		if (!seen[id]) {
			seen[id] = true
		} else {
			continue
		}
		if (this.entries[id] === null) {
		} else {
			this.updateEntry(this.entries[id], true)
		}
	}
	var endTime = new Date();
	if (was_empty || keyboardPositionId !== null) {
		var pos = 0;
		if (keyboardPositionId in this.map && is(this.map[keyboardPositionId])) {
			pos = this.map[keyboardPositionId]
		}
		this.keyboardPosition = pos;
		this.keyboardClearHover(true)
	}
	messageBus.broadcast(this, this.mbn + "sortFinished")
};
List.prototype.printMappings = function() {
	for ( var A = 0; A < this.entries.length; A++) {
	}
};
List.prototype.getUniqueMessageBusName = function() {
	return "rtm.list." + this.id + "."
};
List.prototype.setPrioState = function(A) {
	this.prioState = A
};
List.prototype.setClickable = function(A) {
	this.clickable = A
};
List.prototype.setHoverable = function(A) {
	this.hoverable = A
};
List.prototype.init = function() {
	this.addRow = this.getAddFunc();
	this.inited = true;
	this.inAdvise = false;
	this.needToBlit = true;
	this.mbn = this.getUniqueMessageBusName();
	this.prioState = List.LIST_PRIO_INCOMPLETE;
	this.clickable = true;
	this.snake_ = new Snake()
};
List.prototype.clear = function() {
	this.entries = [];
	this.invalidated = [];
	this.selected = [];
	this.selectedMap = {};
	this.busy = [];
	this.busyMap = {};
	this.map = {};
	this.reverseMap = {};
	this.present = {};
	this.needToBlit = true;
	this.inAdvise = false;
	this.showingEmpty = false;
	this.hoveringId = null;
	this.keyboardPosition = null;
	this.keyboardEntries = [];
	this.fireSelectionCleared();
	var A = this.visible;
	this.clearTable();
	if (A) {
		this.show()
	} else {
		this.hide()
	}
};
List.prototype.clearTable = function() {
	if (!is_ie && (is_safari || !is_khtml)) {
		this.table.innerHTML = "<tbody></tbody>"
	} else {
		var A = this.table.tBodies[0];
		while (A.childNodes.length > 0) {
			A.removeChild(A.firstChild)
		}
	}
};
List.prototype.setAdvise = function(A) {
	this.inAdvise = A;
	this.needToBlit = false;
	if (A) {
		this.memory = {}
	}
};
List.prototype.conditionalAddOrReplaceEntry = function(A, B) {
	if (is(this.map[A[0]])) {
		if (this.entries.length > this.map[A[0]]
				&& is(this.entries[this.map[A[0]]])) {
			this.updateEntry(A, B)
		} else {
			this.entries[this.map[A[0]]] = A
		}
		if (this.inAdvise) {
			this.memory[A[0]] = true
		}
		return false
	} else {
		this.addEntryDelayed(A);
		if (this.inAdvise) {
			this.memory[A[0]] = true;
			this.needToBlit = true
		}
		return true
	}
};
List.prototype.addEntryDelayed = function(A) {
	if (this.inited == false) {
		return false
	}
	this.entries.push(A);
	this.map[A[0]] = this.entries.length - 1;
	this.reverseMap[this.entries.length - 1] = A[0];
	return true
};
List.prototype.getEntry = function(A) {
	return this.entries[this.map[A]]
};
List.prototype.prune = function() {
	if (this.memory === null) {
		return false
	}
	var A = [];
	for ( var B = 0; B < this.entries.length; B++) {
		var D = this.entries[B][0];
		if (!this.memory[D] && is(this.map[D])
				&& this.table.rows.length > this.map[D]
				&& this.table.rows[this.map[D]]) {
			A.push(D)
		}
	}
	for ( var B = 0; B < A.length; B++) {
		this.removeEntry(A[B])
	}
	this.memory = null
};
List.prototype.addEntry = function(B) {
	var A = this.addEntryDelayed(B);
	this.addRow(B);
	this.present[B[0]] = true;
	return A
};
List.prototype.tableBlitRows = function() {
	var D = new Date();
	this.tableBlitEmpty();
	if (this.inAdvise && this.needToBlit == false) {
		return false
	}
	for ( var B = 0; B < this.entries.length; B++) {
		var E = this.entries[B];
		if (!this.present[E[0]]) {
			this.addRow(E);
			this.present[E[0]] = true
		}
	}
	var A = new Date();
	if (is_gecko18) {
		this._redraw(true)
	}
};
List.prototype.tableBlitEmpty = function() {
	if (this.emptyMessage && !this.showingEmpty && this.entries.length == 0) {
		var A = null;
		if (this.type == (List.LIST_TYPE_PLAIN | List.LIST_TYPE_PRIO | List.LIST_TYPE_DATE)) {
			A = [ 0, "N", this.emptyMessage, null ]
		} else {
			if (this.type == (List.LIST_TYPE_PLAIN | List.LIST_TYPE_PRIO
					| List.LIST_TYPE_DATE | List.LIST_TYPE_CHECK)) {
				A = [ 0, "N", this.emptyMessage, null, null ]
			} else {
				if (this.type == (List.LIST_TYPE_PLAIN | List.LIST_TYPE_CHECK | List.LIST_TYPE_IMAGE)) {
					A = [ 0, this.emptyMessage, null ]
				} else {
					if (this.type == (List.LIST_TYPE_PLAIN | List.LIST_TYPE_CHECK)) {
						A = [ 0, this.emptyMessage ]
					}
				}
			}
		}
		var B = this.addRow(A);
		if (B) {
			B.rowText.className += " xtr_empty";
			B.onmouseover = function() {
			};
			B.onmouseout = function() {
			};
			B.onclick = function() {
			};
			if (B.rowCheckBox) {
				B.rowCheck.style.display = "none";
				B.rowText.colSpan = 2
			}
			B.rowText.style.fontWeight = "bold"
		}
		this.showingEmpty = true;
		this._redraw(false)
	}
	this.tableClearEmpty()
};
List.prototype._redraw = function(B) {
	if (is_gecko18 && B) {
		if (this.visible
				&& !(this.type == List.LIST_TYPE_LOADING || this.type == List.LIST_TYPE_ADDING)) {
			this.table.style.display = "none";
			var A = this;
			var D = function() {
				A.table.style.display = ""
			};
			setTimeout(D, 0)
		}
	}
	this.table.style.visibility = "hidden";
	this.table.style.visibility = "visible"
};
List.prototype.tableClearEmpty = function() {
	if (this.emptyMessage && this.showingEmpty && this.entries.length > 0) {
		this.clearTable();
		this.showingEmpty = false
	}
};
List.prototype.tableAddRow = function(B) {
	var D = this.table.insertRow(-1);
	D.className = "xtr";
	var A = D.insertCell(0);
	A.className = "xtd xtd_text";
	A.innerHTML = B[1];
	D.rowText = A;
	return D
};
List.prototype.setRowHover = function(D, B) {
	if (!D || !("entry" in D)) {
		return false
	}
	if (B) {
		Utility.removeClass(D, "xtr_select");
		Utility.addClass(D, "xtr_hover");
		if (this.type & List.LIST_TYPE_PRIO
				&& this.prioState == List.LIST_PRIO_COMPLETED) {
			var A = D.rowPriority;
			A.className = A.className.replace(/(prio[123N])C*/, "$1")
		}
	} else {
		if (is(this.selectedMap[this.map[D.entry[0]]])) {
			Utility.addClass(D, "xtr_select")
		}
		Utility.removeClass(D, "xtr_hover");
		if (this.type & List.LIST_TYPE_PRIO
				&& this.prioState == List.LIST_PRIO_COMPLETED) {
			var A = D.rowPriority;
			A.className = A.className.replace(/(prio[123N])C*/, "$1C")
		}
	}
	return false
};
List.prototype.setRowSelect = function(B, A) {
	if (A) {
		Utility.addClass(B, "xtr_select");
		if (this.type & List.LIST_TYPE_CHECK) {
			B.rowCheckBox.checked = true
		}
	} else {
		Utility.removeClass(B, "xtr_select");
		if (this.type & List.LIST_TYPE_CHECK) {
			B.rowCheckBox.checked = false
		}
	}
	return false
};
List.prototype.onRowMouseOver = function(B, D, A) {
	if (!this.clickable || !this.hoverable) {
		return false
	}
	B || (B = window.event);
	var E = A[0];
	this.setRowHover(D, true);
	this.hoveringId = E;
	messageBus.broadcast(this, this.mbn + "hoverOn", E)
};
List.prototype.onRowMouseOut = function(B, D, A) {
	if (!this.clickable || !this.hoverable) {
		return false
	}
	B || (B = window.event);
	var E = A[0];
	this.setRowHover(D, false);
	this.hoveringId = null;
	messageBus.broadcast(this, this.mbn + "hoverOff", E)
};
List.prototype.fireSelectionStarted = function() {
	messageBus.broadcast(this, this.mbn + "selectStarted")
};
List.prototype.fireSelectionCleared = function() {
	messageBus.broadcast(this, this.mbn + "selectCleared")
};
List.numcmp = function(B, A) {
	return B - A
};
List.numrevcmp = function(B, A) {
	return A - B
};
List.prototype.selectMulti = function(J, A) {
	var X = this.map[J];
	var F = this.selectedMap[X] ? true : false;
	var M = cloneArr(this.selected);
	M.sort(List.numcmp);
	var Q = M.length > 0 ? M[M.length - 1] : null;
	if (Q == null) {
		this.fireSelectionStarted()
	}
	var B = F ? (M.length > 0 ? (M[M.length - 1] > X ? X : X - 1) : X - 1) : X;
	var Y = (B == -1) || (M.length == 1 && M[0] == X);
	Q = (Q == null) ? B : Q;
	var D = null;
	var W = null;
	if (F && X < M[M.length - 1]) {
		D = F ? X : X + 1;
		W = M[M.length - 1]
	}
	var K = [];
	var I = [];
	var V = Q < B ? false : true;
	var O = Q < B ? Q : B;
	var R = Q < B ? B : Q;
	if (!Y) {
		for ( var U = O; U < R + 1; U++) {
			K.push(U)
		}
	}
	if (D != null && W != null) {
		var E = D < W ? D : W;
		var H = D < W ? W : D;
		if (Y || E >= M[0]) {
			for ( var U = E; U < H + 1; U++) {
				if (!Y) {
					K.spliceAll(U)
				}
				I.push(U)
			}
		}
	}
	if (!Y && K.length) {
		for ( var U = K[0]; U < K[K.length - 1] + 1; U++) {
			F = this.selectedMap[U] ? true : false;
			if (!F) {
				this.setRowSelect(this.table.rows[U], true);
				this.reflectSelected(U, true)
			}
		}
	}
	if (Y && D == null) {
		I.push(X)
	}
	if (I.length) {
		for ( var U = I[0]; U < I[I.length - 1] + 1; U++) {
			F = this.selectedMap[U] ? true : false;
			if (F) {
				this.setRowSelect(this.table.rows[U], false);
				this.reflectSelected(U, false)
			}
		}
	}
	if (V) {
		this.selected.sort(List.numrevcmp)
	} else {
		this.selected.sort(List.numcmp)
	}
	if (A) {
		this.reflectSelected(X, true)
	}
	this.fireSelectionFinished();
	return false
};
List.prototype.reflectBusy = function(B, A) {
	if (!A) {
		this.busyMap[B] = false;
		this.busy.spliceAll(B)
	} else {
		if (!this.busyMap[B]) {
			this.busyMap[B] = true
		} else {
			this.busy.spliceAll(B)
		}
		this.busy.push(B)
	}
};
List.prototype.reflectSelected = function(B, A) {
	if (!A) {
		this.selectedMap[B] = false;
		this.selected.spliceAll(B)
	} else {
		if (!this.selectedMap[B]) {
			this.selectedMap[B] = true
		} else {
			this.selected.spliceAll(B)
		}
		this.selected.push(B)
	}
};
List.prototype.selectAll = function() {
	if (this.showingEmpty) {
		return false
	}
	messageBus.broadcast(this, this.mbn + "selectStarted");
	for ( var A = 0; A < this.table.rows.length; A++) {
		this.setRowSelect(this.table.rows[A], true);
		this.reflectSelected(A, true)
	}
	this.fireSelectionFinished();
	this.keyboardClearHover(true)
};
List.prototype.selectSome = function(B) {
	messageBus.broadcast(this, this.mbn + "selectStarted");
	for ( var A = 0; A < this.table.rows.length; A++) {
		if (B[A] !== null && typeof B[A] != "undefined") {
			this.setRowSelect(this.table.rows[A], true);
			this.reflectSelected(A, true)
		}
	}
	this.fireSelectionFinished()
};
List.prototype.deselectSome = function(B) {
	messageBus.broadcast(this, this.mbn + "selectStarted");
	for ( var A = 0; A < this.table.rows.length; A++) {
		if (is(B[A])) {
			this.setRowSelect(this.table.rows[A], false);
			this.reflectSelected(A, false)
		}
	}
	this.fireSelectionFinished()
};
List.prototype.selectNone = function(B) {
	this.keyboardClearHover(true);
	if (this.selected.length == 0) {
		return
	}
	if (!B) {
		this.fireSelectionStarted()
	}
	for ( var A = 0; A < this.selected.length; A++) {
		var D = this.selected[A];
		this.setRowSelect(this.table.rows[D], false);
		this.reflectSelected(D, false);
		A--
	}
	if (!B) {
		this.fireSelectionFinished()
	}
};
List.prototype.selectOne = function(H, D, B) {
	B = !!B;
	this.fireSelectionStarted();
	var A = false;
	if (!B && this.isMultiSelectable() === false) {
		var F = this.map[H];
		if (this.selected.length === 1 && typeof (F) !== "undefined") {
			A = this.selectedMap[F] ? true : false
		}
		this.selectNone()
	}
	var F = this.map[H];
	if (!A && typeof (F) !== "undefined") {
		var E = !D && this.selectedMap[F] ? true : false;
		this.setRowSelect(this.table.rows[F], !E);
		if (E) {
			this.reflectSelected(F, false)
		} else {
			this.reflectSelected(F, true)
		}
	}
	this.fireSelectionFinished()
};
List.prototype.fireSelectionFinished = function() {
	messageBus.broadcast(this, this.mbn + "selectFinished", [
			this.selected.length,
			this.selected.length > 0 ? this.selected[this.selected.length - 1]
					: null ]);
	if (this.selected.length == 0) {
		this.fireSelectionCleared()
	}
};
List.prototype.onRowMouseClick = function(B, E, A, D) {
	if (!this.clickable) {
		return false
	}
	B || (B = window.event);
	var F = A[0];
	D = !!D;
	if (!B.shiftKey) {
		this.selectOne(F, undefined, D)
	} else {
		this.selectMulti(F)
	}
};
List.prototype.tableAddRowBase = function(A) {
	var B = this;
	var D = this.table.insertRow(-1);
	D.entry = A;
	D.onmouseover = function(E) {
		B.onRowMouseOver(E, this, this.entry);
		return false
	};
	D.onmouseout = function(E) {
		B.onRowMouseOut(E, this, this.entry);
		return false
	};
	D.onclick = function(E) {
		B.onRowMouseClick(E, this, this.entry);
		return true
	};
	D.onmousedown = function(E) {
		E || (E = window.event);
		if (E.shiftKey) {
			return false
		}
		return true
	};
	D.className = "xtr";
	return D
};
List.prototype.tableAddRowWithCheckBase = function(B) {
	var E = this.tableAddRowBase(B);
	var A = E.insertCell(-1);
	A.className = "xtd xtd_arr";
	E.rowArrow = A;
	var D = E.insertCell(-1);
	D.className = "xtd xtd_check";
	D.innerHTML = '<form action="#"><div style="display: inline;"><input type="checkbox"></input></div></form>';
	E.rowCheck = D;
	E.rowCheckBox = D.getElementsByTagName("input")[0];
	return E
};
List.prototype.tableAddRowWithCheck = function(A) {
	var E = this.tableAddRowWithCheckBase(A);
	var D = E.insertCell(-1);
	D.className = "xtd xtd_text";
	D.innerHTML = A[1];
	E.rowText = D;
	var B = E.insertCell(-1);
	B.className = "xtd xtd_image";
	E.rowImage = B;
	return E
};
List.prototype.tableConditionalImageAttach = function(B, D) {
	D.rowImage.innerHTML = "";
	if (B[2] != null) {
		var A = imageMgr.getImage(B[2]);
		D.rowImage.appendChild(A)
	} else {
		D.rowImage.innerHTML = "&nbsp;"
	}
};
List.prototype.tableAddRowWithCheckAndImage = function(A) {
	var B = this.tableAddRowWithCheck(A);
	this.tableConditionalImageAttach(A, B);
	return B
};
List.prototype.tableAddRowWithPriorityBase = function(B) {
	var E = this.tableAddRowBase(B);
	var D = E.insertCell(-1);
	var F = "prio" + B[1];
	if (this.prioState == List.LIST_PRIO_COMPLETED) {
		F = F + "C"
	}
	D.className = "xtd xtd_prio " + F;
	E.rowPriority = D;
	D.innerHTML = "&nbsp;";
	var A = E.insertCell(-1);
	A.className = "xtd xtd_arr";
	E.rowArrow = A;
	return E
};
List.prototype.tableAddRowWithPriority = function(A) {
	var D = this.tableAddRowWithPriorityBase(A);
	var B = D.insertCell(-1);
	B.className = "xtd xtd_text";
	B.innerHTML = A[2];
	D.rowText = B;
	return D
};
List.prototype.tableAddRowWithLoading = function(B) {
	var A = [ 0, "N", B[0] ];
	var E = this.tableAddRowWithPriority(A);
	var D = E.insertCell(-1);
	D.className = "xtd xtd_image";
	E.rowImage = D;
	A = [ null, null, B[1] ];
	this.tableConditionalImageAttach(A, E);
	return E
};
List.prototype.tableAddRowWithAdding = function(B) {
	var H = B[0];
	var F = null;
	if (adder.type == Adder.ADDER_TYPE_TASK) {
		Utility.removeClass(this.table, "xtable_adding_noprio");
		F = this.tableAddRowWithPriorityAndCheck(B)
	} else {
		Utility.addClass(this.table, "xtable_adding_noprio");
		F = this.tableAddRowWithCheck(B)
	}
	F.rowText.innerHTML = '<div style="position: relative; left: 0.5em;" id='
			+ quoted("adder_" + H) + '"></div>';
	var E = new Field("adder_" + H);
	E.init();
	E.setKlass("xtd_entry");
	E.blit();
	control.registerAdder(B[0], E);
	E.show();
	E.startEditing();
	F.rowField = E;
	this.parent.fields.push(E);
	if (adder.type === Adder.ADDER_TYPE_TASK) {
		var D = F.insertCell(-1);
		D.className = "xtd xtd_image";
		F.rowImage = D
	}
	var A = [ null, null, null ];
	this.tableConditionalImageAttach(A, F);
	return F
};
List.prototype.tableAddRowWithPriorityAndCheck = function(A) {
	var E = this.tableAddRowWithPriorityBase(A);
	var D = E.insertCell(-1);
	D.className = "xtd xtd_check";
	D.innerHTML = "<form id="
			+ quoted(this.id + "_row_form_" + A[0])
			+ ' action="#"><div style="display: inline;"><input type="checkbox"></input></div></form>';
	E.rowCheck = D;
	E.rowCheckBox = D.getElementsByTagName("input")[0];
	var B = E.insertCell(-1);
	B.className = "xtd xtd_text";
	B.innerHTML = A[2];
	E.rowText = B;
	return E
};
List.prototype.tableAddRowWithPriorityAndDate = function(A) {
	var D = this.tableAddRowWithPriority(A);
	var B = D.insertCell(-1);
	B.className = "xtd " + this.dateKlass;
	B.innerHTML = A[3] ? A[3] : "&nbsp;";
	D.rowDate = B;
	return D
};
List.prototype.tableAddRowWithPriorityAndCheckAndDate = function(B) {
	var D = this.tableAddRowWithPriorityAndCheck(B);
	var A = D.insertCell(-1);
	A.className = "xtd " + this.dateKlass;
	A.innerHTML = B[3] ? B[3] : "&nbsp;";
	D.rowDate = A;
	return D
};
List.prototype.tableSetRowBusy = function(E, B) {
	var F = this.table.rows[E];
	if (!F) {
		return false
	}
	if (B) {
		var A = ("rowDate" in F) ? F.rowDate : ("rowImage" in F ? F.rowImage
				: null);
		if (A) {
			var D = imageMgr.getImageHTML("busy");
			A.innerHTML = D
		}
		this.reflectBusy(E, true)
	} else {
		this.updateEntry(this.entries[E], true);
		this.reflectBusy(E, false)
	}
	this._redraw(false);
	return F
};
List.prototype.tableSetRowBusyById = function(B, A) {
	return this.tableSetRowBusy(this.map[B], A)
};
List.prototype.updateEntry = function(B, D) {
	var H = this.map[B[0]];
	var E = this.table.rows[H];
	var A = this.entries[H];
	if (E == null || !("rowText" in E && E.rowText)) {
		return false
	}
	E.entry = B;
	if (this.showingEmpty) {
		E.rowText.style.fontWeight = "bold";
		return true
	}
	if (this.type == (List.LIST_TYPE_PLAIN | List.LIST_TYPE_CHECK)) {
		if (!D && B[1] == A[1]) {
			return true
		}
		E.rowText.innerHTML = B[1]
	} else {
		if (this.type == (List.LIST_TYPE_PLAIN | List.LIST_TYPE_CHECK | List.LIST_TYPE_IMAGE)) {
			if (!D && B[1] == A[1] && B[2] == A[2]) {
				return true
			}
			E.rowText.innerHTML = B[1];
			this.tableConditionalImageAttach(B, E)
		} else {
			if (this.type == (List.LIST_TYPE_PLAIN | List.LIST_TYPE_PRIO
					| List.LIST_TYPE_CHECK | List.LIST_TYPE_DATE)
					|| this.type == (List.LIST_TYPE_PLAIN | List.LIST_TYPE_PRIO | List.LIST_TYPE_DATE)) {
				if (this.type === 15) {
					if (!D && B[1] == A[1] && B[2] == A[2] && B[3] == A[3]
							&& B[4] == A[4] && B[5] == A[5] && B[6] == A[6]) {
						return true
					}
				} else {
					if (this.type === 11) {
						if (!D && B[1] == A[1] && B[2] == A[2] && B[3] == A[3]
								&& B[4] == A[4]) {
							return true
						}
					} else {
						if (!D && B[1] == A[1] && B[2] == A[2] && B[3] == A[3]) {
							return true
						}
					}
				}
				var F = "prio" + B[1];
				if (this.prioState == List.LIST_PRIO_COMPLETED) {
					F = F + "C"
				}
				E.rowPriority.className = "xtd xtd_prio " + F;
				if (this.type === 15) {
					if (B[6]) {
						Utility.addClass(E, "xtr_repeat")
					} else {
						Utility.removeClass(E, "xtr_repeat")
					}
					E.rowTextSpan.innerHTML = B[2];
					if (B[4]) {
						E.rowTags.innerHTML = B[4].join(", ");
						if (E.rowTags.className !== "xtd_tag") {
							E.rowTags.className = "xtd_tag"
						}
					} else {
						if (E.rowTags.childNodes.length) {
							E.rowTags.innerHTML = ""
						}
						if (E.rowTags.className) {
							E.rowTags.className = ""
						}
					}
					if (B[5]) {
						Utility.addClass(E.rowIcon, "has_note")
					} else {
						Utility.removeClass(E.rowIcon, "has_note")
					}
				} else {
					if (this.type === 11) {
						if (B[4]) {
							Utility.addClass(E, "xtr_repeat")
						} else {
							Utility.removeClass(E, "xtr_repeat")
						}
						E.rowTextSpan.innerHTML = B[2]
					} else {
						E.rowText.innerHTML = B[2]
					}
				}
				E.rowDate.innerHTML = B[3] ? B[3] : ""
			} else {
				return false
			}
		}
	}
	this.entries[H] = B;
	this.invalidated.push(H);
	return true
};
List.prototype.debugDump = function() {
	var B = [];
	for ( var A in this.reverseMap) {
		B.push(A)
	}
};
List.prototype.removeEntry = function(F) {
	var E = this.map[F];
	if (E === null || typeof E == "undefined" || !this.table.rows[E]) {
		return false
	}
	this.reflectSelected(E, false);
	this.reflectBusy(E, false);
	this.table.rows[E].onmouseover = {};
	this.table.rows[E].onmouseout = {};
	this.table.rows[E].onclicked = {};
	this.entries.splice(E, 1);
	if (this.rows) {
		this.rows.splice(E, 1)
	}
	this.table.deleteRow(E);
	this.reverseMap[E] = null;
	this.map[F] = null;
	this.present[F] = null;
	var A = this.entries.length;
	for ( var B = E + 1; B < A + 1; B++) {
		var D = this.reverseMap[B];
		this.map[D] = B - 1;
		if (this.selectedMap[B]) {
			this.reflectSelected(B, false);
			this.reflectSelected(B - 1, true)
		}
		if (this.busyMap[B]) {
			this.reflectBusy(B, false);
			this.reflectBusy(B - 1, false)
		}
		this.reverseMap[B - 1] = D
	}
	if (this.entries.length == 0) {
		this.tableBlitEmpty()
	} else {
		if (this.keyboardPosition === E) {
			this.keyboardClearHover(true)
		}
	}
	return true
};
List.prototype.getAddFunc = function() {
	if (this.type == List.LIST_TYPE_PLAIN) {
		return this.tableAddRow
	}
	if (this.type == List.LIST_TYPE_LOADING) {
		return this.tableAddRowWithLoading
	}
	if (this.type == List.LIST_TYPE_ADDING) {
		return this.tableAddRowWithAdding
	}
	if (this.type == (List.LIST_TYPE_PLAIN | List.LIST_TYPE_CHECK)) {
		return this.tableAddRowWithCheck
	}
	if (this.type == (List.LIST_TYPE_PLAIN | List.LIST_TYPE_CHECK | List.LIST_TYPE_IMAGE)) {
		return this.tableAddRowWithCheckAndImage
	}
	if (this.type == (List.LIST_TYPE_PLAIN | List.LIST_TYPE_PRIO)) {
		return this.tableAddRowWithPriority
	}
	if (this.type == (List.LIST_TYPE_PLAIN | List.LIST_TYPE_PRIO | List.LIST_TYPE_CHECK)) {
		return this.tableAddRowWithPriorityAndCheck
	}
	if (this.type == (List.LIST_TYPE_PLAIN | List.LIST_TYPE_PRIO | List.LIST_TYPE_DATE)) {
		return this.tableAddRowWithPriorityAndDate
	}
	if (this.type == (List.LIST_TYPE_PLAIN | List.LIST_TYPE_PRIO
			| List.LIST_TYPE_DATE | List.LIST_TYPE_CHECK)) {
		return this.tableAddRowWithPriorityAndCheckAndDate
	}
	return this.tableAddRowWithPriorityAndDate
};
List.prototype.clearHover = function() {
	if (!this.hoveringId) {
		return null
	}
	if (!(this.hoveringId in this.map)) {
		return null
	}
	var A = this.table.rows[this.map[this.hoveringId]];
	if (A) {
		A.onmouseout(null)
	}
};
List.prototype.getTableCols = function() {
	if (this.type === 15) {
		return '<col class="col_prio" /><col class="col_arr" /><col class="col_check" /><col class="col_text" /><col class="col_date" /><col class="col_ico" />'
	} else {
		if (this.type === 11) {
			return '<col class="col_prio" /><col class="col_text" /><col class="col_date" />'
		} else {
			if (this.type === 50) {
				return '<col class="col_prio" /><col class="col_text" /><col class="col_image" />'
			} else {
				if (this.type === 100) {
					if (is_ie) {
						if (!("adder" in window) || !adder
								|| adder.type === Adder.ADDER_TYPE_TASK) {
							return '<col class="col_prio" /><col class="col_arr" /><col class="col_check" /><col class="col_text" /><col class="col_image" />'
						} else {
							return '<col class="col_arr" /><col class="col_check" /><col class="col_text" /><col class="col_image" />'
						}
					} else {
						return '<col class="col_prio" /><col class="col_arr" /><col class="col_check" /><col class="col_text" /><col class="col_image" />'
					}
				} else {
					if (this.type === 5 || this.type === 23) {
						return '<col class="col_arr" /><col class="col_check" /><col class="col_text" /><col class="col_image" />'
					}
				}
			}
		}
	}
	return ""
};
List.prototype.getEmptyTableCols = function() {
	if (!is_ie || is_opera) {
		return this.getTableCols()
	}
	if (this.type === 15) {
		return '<col class="col_prio" /><col class="col_text" /><col class="col_date" /><col class="col_ico" />'
	} else {
		if (this.type === 11) {
			return '<col class="col_prio" /><col class="col_text" /><col class="col_date" />'
		} else {
			if (this.type === 50) {
				return '<col class="col_prio" /><col class="col_text" /><col class="col_image" />'
			} else {
				if (this.type === 100) {
					return '<col class="col_prio" /><col class="col_arr" /><col class="col_check" /><col class="col_text" /><col class="col_image" />'
				} else {
					if (this.type === 5 || this.type === 23) {
						return '<col class="col_text" /><col class="col_image" />'
					}
				}
			}
		}
	}
	return ""
};
function ListBase() {
	this.list = null;
	this.hidden_ = false
}
ListBase.prototype.show = function() {
	this.list.show();
	if (this.hidden_ === true && "parent" in this.list
			&& "onShow" in this.list.parent) {
		this.hidden_ = false;
		this.list.parent.onShow()
	}
	this.hidden_ = false
};
ListBase.prototype.hide = function() {
	this.list.hide();
	if (this.hidden_ === false && "parent" in this.list
			&& "onHide" in this.list.parent) {
		this.hidden_ = true;
		this.list.parent.onHide()
	}
	this.hidden_ = true
};
function AddingList(A) {
	this.id = A;
	this.list = new XList(A, List.LIST_TYPE_ADDING);
	this.list.setTableKlass("xtable_adding");
	this.list.init();
	this.list.clear();
	this.type = "adding";
	this.list.parent = this;
	this.mbn = null;
	this.list.setClickable(false);
	this.fields = []
}
AddingList.prototype.clear = function() {
	this.list.clear()
};
AddingList.prototype.init = function() {
	this.mbn = this.getUniqueMessageBusName()
};
AddingList.prototype.blit = function() {
	this.list.tableBlitRows()
};
AddingList.prototype.getUniqueMessageBusName = function() {
	return "rtm.addinglist."
};
AddingList.prototype.addEntry = function() {
	if (is_ie) {
		this.clear()
	}
	var A = [
			hex_sha1(""
					+ (transMgr.getRandomInt(600673) + new Date().getTime())),
			"N", "" ];
	this.list.addEntry(A);
	Control.redrawSnake()
};
AddingList.prototype.onHide = function() {
	Control.redrawSnake()
};
AddingList.prototype.onShow = function() {
	Control.redrawSnake()
};
AddingList.prototype.show = ListBase.prototype.show;
AddingList.prototype.hide = ListBase.prototype.hide;
function LoadingList(A) {
	this.id = A;
	this.list = new XList(A, List.LIST_TYPE_LOADING);
	this.list.init();
	this.list.setTableKlass("xtable_loading");
	this.type = "loading";
	this.list.parent = this;
	this.list.setHoverable(false);
	this.hidden_ = false
}
LoadingList.prototype.init = function() {
	var A = [ _T("INTERFACE_TASKS_LIST_DETAILS_LOADING"), "busy" ];
	this.list.clear();
	this.list.conditionalAddOrReplaceEntry(A);
	this.list.tableBlitRows()
};
LoadingList.prototype.show = function() {
	this.hidden_ = false;
	this.list.show();
	this.shownAt = new Date().getTime()
};
LoadingList.prototype.hide = function() {
	this.hidden_ = true;
	this.list.hide();
	this.hideAt = new Date().getTime();
	if (this.hideAt && this.shownAt) {
	}
};
LoadingList.prototype.showLoadingMessage = function() {
	this.list.table.className = "xtable";
	this.list.table.cellSpacing = "0";
	this.list.table.cellPadding = "0";
	this.init()
};
function GroupList(A) {
	this.id = A;
	this.list = new XList(A, List.LIST_TYPE_PLAIN | List.LIST_TYPE_CHECK
			| List.LIST_TYPE_IMAGE);
	this.list.setTableKlass("xtable_other");
	this.list.init();
	this.list.snake_.initialize("detailswrap", A);
	this.list.setEmptyMessage(_T("INTERFACE_CONTACTS_GROUPS_NO_GROUPS"));
	this.list.setSortParameters(stateMgr.groups, [ "name.toLowerCase()" ],
			[ List.LIST_SORT_ASC ]);
	this.list.tableBlitRows();
	this.type = "group";
	this.list.parent = this
}
GroupList.prototype.addGroup = function(B) {
	var A = [ B.id, B.name.escapeForXML() ];
	this.list.conditionalAddOrReplaceEntry(A)
};
GroupList.prototype.show = ListBase.prototype.show;
GroupList.prototype.hide = ListBase.prototype.hide;
function ContactList(A) {
	this.id = A;
	this.list = new XList(A, List.LIST_TYPE_PLAIN | List.LIST_TYPE_CHECK
			| List.LIST_TYPE_IMAGE);
	this.list.setTableKlass("xtable_other");
	this.list.init();
	this.list.snake_.initialize("detailswrap", A);
	this.list.setEmptyMessage(_T("INTERFACE_CONTACTS_NO_CONTACTS"));
	this.list.setSortParameters(stateMgr.contacts, [ "firstname.toLowerCase()",
			"lastname.toLowerCase()" ], [ List.LIST_SORT_ASC,
			List.LIST_SORT_ASC ]);
	this.list.tableBlitRows();
	this.type = "contact";
	this.list.parent = this
}
ContactList.prototype.addContact = function(A) {
	var B = [ A.id, [ A.firstname, A.lastname ].join(" ").escapeForXML() ];
	return this.list.conditionalAddOrReplaceEntry(B)
};
ContactList.prototype.show = ListBase.prototype.show;
ContactList.prototype.hide = ListBase.prototype.hide;
function ListList(A) {
	this.id = A;
	this.list = new XList(A, List.LIST_TYPE_PLAIN | List.LIST_TYPE_CHECK
			| List.LIST_TYPE_IMAGE);
	this.list.setTableKlass("xtable_other");
	this.list.init();
	this.list.snake_.initialize("detailswrap", A);
	this.list.setEmptyMessage(_T("INTERFACE_SETTINGS_LISTS_NO_LISTS"));
	this.list.setSortParameters(stateMgr.lists, [ "position",
			"name.toLowerCase()" ], [ List.LIST_SORT_ASC, List.LIST_SORT_ASC ]);
	this.type = "list";
	this.list.parent = this;
	this.mbn = "rtm.listslist."
}
ListList.prototype.show = ListBase.prototype.show;
ListList.prototype.hide = ListBase.prototype.hide;
ListList.prototype.addList = function(A) {
	var E = imageMgr.getNextStatic() + "/img/ico/ico_sync.gif";
	var D = null;
	if (A.id === configurationMgr.configuration.defaultList) {
		D = "list_default"
	} else {
		if (A.locked) {
			D = "list_locked"
		} else {
			if (A.queued) {
				D = "list_pending"
			} else {
				if (A.filter !== null) {
					D = "list_smart"
				}
			}
		}
	}
	var F = A.name.toLowerCase();
	if (F == "inbox") {
		A.name = _T("INTERFACE_TASKS_INBOX")
	}
	if (F == "sent") {
		A.name = _T("INTERFACE_TASKS_SENT")
	}
	var B = [
			A.id,
			A.name.escapeForXML()
					+ (A.syncable ? ' <img src="'
							+ E
							+ '" width="13" height="13" style="vertical-align: top; padding-left: 2px;" />'
							: ""), D ];
	this.list.conditionalAddOrReplaceEntry(B)
};
ListList.prototype.doStyles = function() {
	for ( var A = 0; A < this.list.entries.length; A++) {
		var B = stateMgr.lists[this.list.entries[A][0]];
		if (B) {
			if (B.archived) {
				this.setListArchived(B.id)
			} else {
				this.setListClear(B.id)
			}
			if (typeof configurationMgr.configuration["sync_which"] !== "undefined") {
				this
						.listUpdateSyncable(
								B.id,
								rtmHasMilkSync
										&& configurationMgr.configuration["sync_which"] ? B.syncable
										: false)
			}
		}
	}
};
ListList.prototype.setListArchived = function(D) {
	var B = this.list.map[D];
	var A = this.list.table.rows[B];
	A.rowText.style.fontStyle = "italic"
};
ListList.prototype.addListTab = function(A, B) {
	if (stateMgr.lists[B].filter !== null) {
		listTabs.addEntry(A, [ TasksView.LIST_TYPE_SMART, B,
				stateMgr.lists[B].filter ])
	} else {
		listTabs.addEntry(A, [ TasksView.LIST_TYPE_NORMAL, B ])
	}
	listTabs.sort();
	listTabs.blitDiv()
};
ListList.prototype.removeListTab = function(A) {
	listTabs.removeEntryByData(A);
	listTabs.sort();
	listTabs.blitDiv()
};
ListList.prototype.setListClear = function(D) {
	var B = this.list.map[D];
	var A = this.list.table.rows[B];
	A.rowText.style.fontStyle = "normal"
};
ListList.prototype.listUpdateName = function(E, A) {
	var D = this.list.map[E];
	stateMgr.updateList(E, {
		"name" : A
	});
	var B = stateMgr.lists[E].syncable && rtmHasMilkSync
			&& configurationMgr.configuration["sync_which"];
	this.list.entries[D][1] = ListList.withSyncable(A, B);
	this.list.updateEntry(this.list.entries[D], true);
	this.list.sort();
	listTabs.renameEntry(E, A)
};
ListList.withSyncable = function(A, B) {
	var D = imageMgr.getNextStatic() + "/img/ico/ico_sync.gif";
	return A.escapeForXML()
			+ (B ? ' <img src="'
					+ D
					+ '" width="13" height="13" style="vertical-align: top; padding-left: 2px;" />'
					: "")
};
ListList.prototype.listUpdateSyncable = function(D, A) {
	var B = this.list.map[D];
	if (!is(B)) {
		return false
	}
	this.list.entries[B][1] = ListList.withSyncable(stateMgr.lists[D].name, A);
	this.list.updateEntry(this.list.entries[B], true)
};
ListList.prototype.listUpdateDefault = function(D, A) {
	var B = this.list.map[D];
	if (A) {
		this.list.entries[B][2] = "list_default"
	} else {
		if (is(stateMgr.lists[D]) && stateMgr.lists[D].filter !== null) {
			this.list.entries[B][2] = "list_smart"
		} else {
			this.list.entries[B][2] = null
		}
	}
	this.list.updateEntry(this.list.entries[B], true);
	this.list.sort()
};
function OverviewList(A) {
	this.overviewId = A;
	this.list = new XList(A, List.LIST_TYPE_PLAIN | List.LIST_TYPE_PRIO
			| List.LIST_TYPE_DATE);
	this.list.setTableKlass("xtable_overview");
	this.list.init();
	this.list.setEmptyMessage(_T("INTERFACE_OVERVIEW_NO_TASKS_DUE_TODAY"));
	this.list.setMultiSelectable(false);
	this.list.setSortParameters(stateMgr.tasks, [ "priority.charAt(1)",
			"date_due", "name.toLowerCase()" ], [ List.LIST_SORT_ASC,
			List.LIST_SORT_ASC, List.LIST_SORT_ASC ]);
	this.mbn = null;
	this.drawn = null;
	this.list.parent = this;
	this.views = [];
	this.currentView = 0;
	this.filterObj = null
}
OverviewList.prototype.showLoading = function() {
	this.list.setEmptyMessage(_T("INTERFACE_TASKS_LIST_DETAILS_LOADING"));
	this.blit();
	this.show()
};
OverviewList.prototype.hideLoading = function() {
	this.list.setEmptyMessage(_T("INTERFACE_OVERVIEW_NO_TASKS_DUE_TODAY"))
};
OverviewList.prototype.update = function() {
	if (this.filterObj === null) {
		return this.updateForFilter(this.views[0][1], 0)
	} else {
		return this.refresh()
	}
};
OverviewList.prototype.addView = function(A) {
	this.views.push(A);
	overviewTabs.addEntry(A[0], A[1]);
	overviewView.addState(A[0], [ overviewList ], null, overviewTabs);
	overviewTabs.blitDiv()
};
OverviewList.prototype.init = function() {
	this.mbn = this.getUniqueMessageBusName();
	var A = this;
	var B = function(D, E) {
		A.doTriage(E)
	};
	messageBus.subscribe(B, dateTimeMgr.mbn + "chime")
};
OverviewList.prototype.getUniqueMessageBusName = function() {
	return "rtm.overviewlist."
};
OverviewList.prototype.doTriage = function(E) {
	var B = new Date();
	var A = B.getHours();
	var D = B.getMinutes();
	if (A == 0 && D == 0) {
		this.refresh();
		locationMgr.redrawWhenNeeded()
	}
};
OverviewList.prototype.clear = function() {
	this.list.clear()
};
OverviewList.prototype.show = function() {
	this.list.show()
};
OverviewList.prototype.hide = function() {
	this.list.hide()
};
OverviewList.prototype.switchView = function(A) {
	this.view = A;
	this.show();
	messageBus.broadcast(this, this.mbn + "viewChanged", this.view)
};
OverviewList.prototype.getViewList = function() {
	return this.list
};
OverviewList.prototype.removeTask = function(A) {
	this.list.removeEntry(A)
};
OverviewList.prototype.addTask = function(D) {
	var E;
	var B = true;
	if (this.currentView !== 2) {
		var A = (rtmLanguage === "en-US" || rtmLanguage === "en-GB") ? (rtmTime24 ? "HH:mm"
				: "h:mmz")
				: Intl.preferred_formats.hmm_a;
		E = [
				D.id,
				D.priority.charAt(1),
				Control.safeWbrs(D.name),
				(D.date_due && D.time_due ? dateTimeMgr.getCachedIntlFormat(A,
						D.date_due) : null), (D.reoccur && D.reoccur[0]) ]
	} else {
		var A = (rtmLanguage === "en-US" || rtmLanguage === "en-GB") ? "MMM dd"
				: Intl.preferred_formats.list_date;
		E = [
				D.id,
				D.priority.charAt(1),
				Control.safeWbrs(D.name),
				(D.date_due ? dateTimeMgr.getCachedIntlFormat(A, D.date_due)
						: null), (D.reoccur && D.reoccur[0]) ]
	}
	this.list.conditionalAddOrReplaceEntry(E);
	return B
};
OverviewList.prototype.setAdvise = function(A) {
	this.list.setAdvise(A)
};
OverviewList.prototype.blit = function() {
	this.list.tableBlitRows()
};
OverviewList.prototype.prune = function() {
	this.list.prune()
};
OverviewList.prototype.sortAndBlit = function() {
	this.list.sortAndBlit()
};
OverviewList.prototype.sort = function() {
	this.list.sort()
};
OverviewList.prototype.getFilteredList = function(D) {
	var A = new Sexp(D);
	this.filterObj = new Filter(stateMgr.tasks, filterMap, A.sexpr, "name");
	this.filterObj.setImplicitFilter(_includeArchived);
	dateTimeMgr.setCache(true);
	var B = this.filterObj.reduce();
	dateTimeMgr.setCache(false);
	return B
};
OverviewList.prototype.taskBelongs = function(A) {
	return this.filterObj.isMember(A)
};
OverviewList.prototype.taskPresent = function(A) {
	return is(this.list.map[A])
};
OverviewList.prototype.taskUpdateDueDate = function(F, D) {
	if (this.taskPresent(F) === false) {
		return false
	}
	var E = this.list.map[F];
	var B = stateMgr.tasks[F];
	var A;
	if (rtmLanguage === "en-US" || rtmLanguage === "en-GB") {
		if (this.currentView !== 2) {
			A = rtmTime24 ? "HH:mm" : "h:mmz";
			this.list.entries[E][3] = (B.date_due && B.time_due ? dateTimeMgr
					.getCachedIntlFormat(A, B.date_due) : null)
		} else {
			A = "MMM dd";
			this.list.entries[E][3] = (B.date_due ? dateTimeMgr
					.getCachedIntlFormat(A, B.date_due) : null)
		}
	} else {
		if (this.currentView !== 2) {
			A = Intl.preferred_formats.hmm_a;
			this.list.entries[E][3] = (B.date_due && B.time_due ? dateTimeMgr
					.getCachedIntlFormat(A, B.date_due) : null)
		} else {
			A = Intl.preferred_formats.list_date;
			this.list.entries[E][3] = (B.date_due ? dateTimeMgr
					.getCachedIntlFormat(A, B.date_due) : null)
		}
	}
	this.list.updateEntry(this.list.entries[E], true);
	if (!!D !== true) {
		this.list.sort()
	}
	return true
};
OverviewList.prototype.taskUpdateRepeat = function(D) {
	var B = this;
	var A = this.list;
	setTimeout(function() {
		for ( var F = 0; F < D.length; F++) {
			var I = D[F];
			if (B.taskPresent(I) === false) {
				continue
			}
			var H = A.map[I];
			if (!is(H)) {
				continue
			}
			var E = stateMgr.tasks[I];
			A.entries[H][4] = (E.reoccur && E.reoccur[0]);
			A.updateEntry(A.entries[H], true)
		}
	}, 0)
};
OverviewList.prototype.updateForFilter = function(B, E) {
	if (this.drawn === B) {
		return false
	}
	this.currentView = E;
	this.list.setEmptyMessage(this.views[E][2]);
	this.clear();
	this.setAdvise(true);
	var D = this.getFilteredList(B);
	for ( var A = 0; A < D.length; A++) {
		this.addTask(stateMgr.tasks[D[A]])
	}
	this.setAdvise(false);
	this.sortAndBlit();
	this.prune();
	this.drawn = B
};
OverviewList.prototype.refresh = function() {
	var B = this.drawn;
	var A = this.currentView;
	this.drawn = null;
	this.updateForFilter(B, A)
};
OverviewList.prototype.removeTask = function(A) {
	if (is(this.list.map[A])) {
		this.list.removeEntry(A)
	}
};
OverviewList.prototype.setTaskOverdue = function(A) {
	A.rowText.style.fontWeight = "bold";
	A.rowText.style.textDecoration = "underline"
};
function TaskList(B, A) {
	this.id = B;
	this.completedid = A;
	this.list = new XList(B, List.LIST_TYPE_PLAIN | List.LIST_TYPE_PRIO
			| List.LIST_TYPE_DATE | List.LIST_TYPE_CHECK);
	this.completedList = new XList(A, List.LIST_TYPE_PLAIN
			| List.LIST_TYPE_PRIO | List.LIST_TYPE_DATE | List.LIST_TYPE_CHECK);
	this.list.init();
	this.list.snake_.initialize("detailswrap", B);
	this.list.multi_snake_ = new Snake();
	this.list.multi_snake_.initialize("detailswrap", B);
	this.completedList.init();
	this.completedList.snake_.initialize("detailswrap", A);
	this.completedList.setPrioState(List.LIST_PRIO_COMPLETED);
	this.list.setEmptyMessage(_T("INTERFACE_TASKS_NO_INCOMPLETE"));
	this.completedList.setEmptyMessage(_T("INTERFACE_TASKS_NO_COMPLETED"));
	this.list.setSortParameters(stateMgr.tasks, [ "priority.charAt(1)",
			"date_due", "name.toLowerCase()", "id" ], [ List.LIST_SORT_ASC,
			List.LIST_SORT_ASC, List.LIST_SORT_ASC, List.LIST_SORT_ASC ]);
	this.completedList.setSortParameters(stateMgr.tasks, [
			"date_completed * -1", "priority.charAt(1)", "name.toLowerCase()",
			"id" ], [ List.LIST_SORT_ASC, List.LIST_SORT_ASC,
			List.LIST_SORT_ASC, List.LIST_SORT_ASC ]);
	this.view = TaskList.TASK_LIST_VIEW_INCOMPLETE;
	this.mbn = null;
	this.type = "task";
	this.list.parent = this;
	this.completedList.parent = this;
	this.loadTimeout = null;
	this.dirty_ = false;
	this.last_sort_ = "prio"
}
TaskList.TASK_LIST_VIEW_INCOMPLETE = 0;
TaskList.TASK_LIST_VIEW_COMPLETED = 1;
TaskList.prototype.init = function() {
	this.mbn = this.getUniqueMessageBusName();
	this.view = TaskList.TASK_LIST_VIEW_INCOMPLETE;
	var A = this;
	var B = function(D, E) {
		A.doDues(E)
	};
	messageBus.subscribe(B, dateTimeMgr.mbn + "chime")
};
TaskList.prototype.repositionTags = function(A) {
	var B = function(I) {
		if (I.table.rows.length > 0 && I.showingEmpty === false
				&& I.table.rows[0] && "rowText" in I.table.rows[0]) {
			if (A === 1
					&& I.table.rows[0].rowText.firstChild === I.table.rows[0].rowTags) {
				return false
			} else {
				if (A === 2
						&& I.table.rows[0].rowText.firstChild === I.table.rows[0].rowText) {
					return false
				}
			}
			for ( var H = 0, F = I.table.rows.length; H < F; H++) {
				var K = I.table.rows[H];
				var E = K.rowTags;
				var J = K.rowTextSpan;
				var D = K.rowText;
				if (A === 1) {
					D.insertBefore(D.removeChild(E), J)
				} else {
					D.insertBefore(D.removeChild(J), E)
				}
			}
		}
	};
	setTimeout(function() {
		B(taskList.list)
	}, 0);
	setTimeout(function() {
		B(taskList.completedList)
	}, 0)
};
TaskList.prototype.changeTagPosition = function(A) {
	this.onShowTagsChanged(A);
	this.repositionTags(A)
};
TaskList.prototype.onShowTagsChanged = function(B) {
	if (B > 0) {
		var A = (B === 1 ? "xtable_tags_left" : "xtable_tags_right");
		this.list.setTableKlass(A);
		this.completedList.setTableKlass(A);
		if (Utility.hasClass(this.list.table, "xtable_empty") === false) {
			this.list.table.className = "xtable " + A
		}
		if (Utility.hasClass(this.completedList.table, "xtable_empty") === false) {
			this.completedList.table.className = "xtable " + A
		}
	} else {
		this.list.setTableKlass("xtable_notags");
		this.completedList.setTableKlass("xtable_notags");
		if (Utility.hasClass(this.list.table, "xtable_empty") === false) {
			this.list.table.className = "xtable xtable_notags"
		}
		if (Utility.hasClass(this.completedList.table, "xtable_empty") === false) {
			this.completedList.table.className = "xtable xtable_notags"
		}
	}
};
TaskList.prototype.setLoadTimeout = function(A) {
	this.loadTimeout = A
};
TaskList.prototype.clearLoadTimeout = function() {
	clearTimeout(this.loadTimeout)
};
TaskList.prototype.getUniqueMessageBusName = function() {
	return "rtm.tasklists." + this.id + "."
};
TaskList.prototype.clear = function() {
	this.list.clear();
	this.completedList.clear()
};
TaskList.prototype.show = function() {
	if (view.getSelected() == "Tasks") {
		if (this.view == TaskList.TASK_LIST_VIEW_INCOMPLETE) {
			this.completedList.hide();
			this.list.show();
			if (!view.getPublicMode()) {
				SortList.show();
				SmartAdd.getInstance().display(true)
			}
		} else {
			this.list.hide();
			this.completedList.show();
			if (!view.getPublicMode()) {
				SortList.hide();
				SmartAdd.getInstance().display(false)
			}
		}
	} else {
		this.hide();
		if (!view.getPublicMode()) {
			SortList.hide();
			SmartAdd.getInstance().display(false)
		}
	}
};
TaskList.prototype.hide = function() {
	this.list.hide();
	this.completedList.hide()
};
TaskList.prototype.setDirty = function(A) {
	this.dirty_ = A
};
TaskList.prototype.switchView = function(B) {
	var A = this.view !== B;
	this.view = B;
	if (this.view == TaskList.TASK_LIST_VIEW_COMPLETED
			&& (this.dirty_ || this.completedList.rows.length !== this.completedList.entries.length)) {
		this.setDirty(false);
		this.completedList.sortAndBlit();
		this.completedList.prune();
		if (view.multiEditMode) {
			view.multiEditMode = false
		}
	}
	this.show();
	if (A) {
		messageBus.broadcast(this, this.mbn + "viewChanged", this.view)
	} else {
		control.tasksViewChanged(this.view, true)
	}
};
TaskList.prototype.getViewList = function() {
	if (this.view == TaskList.TASK_LIST_VIEW_INCOMPLETE) {
		return this.list
	} else {
		return this.completedList
	}
};
TaskList.prototype.getTaskList = function(A) {
	if (is(this.list.map[A])) {
		return this.list
	} else {
		if (is(this.completedList.map[A])) {
			return this.completedList
		} else {
			return null
		}
	}
};
TaskList.prototype.doDues = function(D) {
	if (this.view == TaskList.TASK_LIST_VIEW_COMPLETED) {
		if (!this.completedList.showingEmpty) {
			for ( var H = 0; H < this.completedList.table.rows.length; H++) {
				this.setTaskClear(this.completedList.table.rows[H])
			}
		}
		return
	}
	var A = dateTimeMgr.getTimeTuple();
	var F = A[0];
	var I = A[1];
	var B = A[2];
	var E = A[3];
	for ( var H = 0; H < this.list.table.rows.length; H++) {
		this.doDueForRow(H, F, I, B, E)
	}
};
TaskList.TASK_LIST_STATUS_CLEAR = 0;
TaskList.TASK_LIST_STATUS_TODAY = 1;
TaskList.TASK_LIST_STATUS_TOMORROW = 2;
TaskList.TASK_LIST_STATUS_OVERDUE = 3;
TaskList.prototype.checkTaskStatus = function(D, E, A, B) {
	if (D.date_due == null) {
		return TaskList.TASK_LIST_STATUS_CLEAR
	}
	var F = D.date_due;
	if (F < E) {
		return TaskList.TASK_LIST_STATUS_OVERDUE
	}
	if (F >= E && F < A) {
		return TaskList.TASK_LIST_STATUS_TODAY
	}
	if (F >= A && F < B) {
		return TaskList.TASK_LIST_STATUS_TOMORROW
	}
	return TaskList.TASK_LIST_STATUS_CLEAR
};
TaskList.prototype.doDueForRow = function(F, B, M, H, K) {
	var Q = stateMgr.tasks[this.list.reverseMap[F]];
	if (!Q) {
		return null
	}
	var O = this.taskTimeStatus(Q, B, M, H, K);
	var A = O[0];
	var E = O[1];
	var I = O[2];
	var J = O[3];
	var D = O[4];
	if (A) {
		this.setTaskClear(this.list.table.rows[F])
	} else {
		if (E) {
			this.setTaskDueToday(this.list.table.rows[F])
		} else {
			if (I) {
				this.setTaskClear(this.list.table.rows[F])
			} else {
				if (J) {
					this.setTaskOverdue(this.list.table.rows[F])
				}
			}
		}
	}
	if (D) {
		this.setTaskOverdue(this.list.table.rows[F])
	}
};
TaskList.prototype.taskTimeStatus = function(F, E, D, A, H) {
	if (!F) {
		return null
	}
	F.duetoday = false;
	F.duetomorrow = false;
	F.overdue = false;
	var B = new Array(5);
	switch (this.checkTaskStatus(F, D, A, H)) {
	case TaskList.TASK_LIST_STATUS_CLEAR:
		B[0] = true;
		break;
	case TaskList.TASK_LIST_STATUS_TODAY:
		B[1] = true;
		F.duetoday = true;
		break;
	case TaskList.TASK_LIST_STATUS_TOMORROW:
		B[2] = true;
		F.duetomorrow = true;
		break;
	case TaskList.TASK_LIST_STATUS_OVERDUE:
		B[3] = true;
		F.overdue = true;
		break
	}
	if (F.time_due
			&& this.checkTaskStatus(F, E, A, H) == TaskList.TASK_LIST_STATUS_OVERDUE) {
		B[4] = true;
		F.overdue = true
	}
	return B
};
TaskList.prototype.doDueForRowScratch = function(F) {
	if (this.view == TaskList.TASK_LIST_VIEW_COMPLETED) {
		this.setTaskClear(this.list.table.rows[F]);
		return
	}
	var A = dateTimeMgr.getTimeTuple();
	var E = A[0];
	var H = A[1];
	var B = A[2];
	var D = A[3];
	this.doDueForRow(F, E, H, B, D)
};
TaskList.prototype.setAdvise = function(A) {
	this.list.setAdvise(A);
	this.completedList.setAdvise(A)
};
TaskList.prototype.blit = function() {
	this.list.tableBlitRows();
	this.completedList.tableBlitRows()
};
TaskList.prototype.prune = function() {
	this.list.prune();
	this.completedList.prune()
};
TaskList.prototype.sort = function() {
	this.list.sort();
	this.completedList.sort()
};
TaskList.prototype.addTask = function(A) {
	var B = null;
	if (A.date_completed == null) {
		B = [
				A.id,
				A.priority.charAt(1),
				Control.safeWbrs(A.name),
				(A.date_due ? dateTimeMgr.getFriendlyDate(A.date_due,
						!!A.time_due) : null),
				tagMgr.getTagsForTaskSeriesX(A.series_id),
				noteMgr.getNoteCount(A.series_id), (A.reoccur && A.reoccur[0]) ];
		this.list.conditionalAddOrReplaceEntry(B);
		if (A.id in this.completedList.map
				&& this.completedList.map[A.id] !== null) {
			this.completedList.removeEntry(A.id)
		}
	} else {
		B = [
				A.id,
				A.priority.charAt(1),
				Control.safeWbrs(A.name),
				(A.date_completed ? dateTimeMgr.getFriendlyDate(
						A.date_completed, true) : null),
				tagMgr.getTagsForTaskSeriesX(A.series_id),
				noteMgr.getNoteCount(A.series_id), (A.reoccur && A.reoccur[0]) ];
		this.completedList.conditionalAddOrReplaceEntry(B)
	}
};
TaskList.prototype.taskUpdateDueDate = function(H, D, A, E) {
	var F = taskList.list.map[H];
	var B = stateMgr.tasks[H];
	B.date_due = D;
	B.time_due = A;
	this.list.entries[F][3] = D ? dateTimeMgr.getFriendlyDate(D, !!A) : null;
	this.list.updateEntry(this.list.entries[F], true);
	if (!!E !== true) {
		this.list.sort()
	}
};
TaskList.prototype.updateForNewDay = function() {
	var A = function(I, E) {
		var B = I.entries;
		for ( var H = 0, F = B.length; H < F; H++) {
			var J = B[H][0];
			var D = (J in stateMgr.tasks && stateMgr.tasks[J]) ? stateMgr.tasks[J]
					: null;
			if (!D || !is(I.map[J])) {
				continue
			}
			if (!E) {
				I.entries[H][3] = D.date_due ? dateTimeMgr.getFriendlyDate(
						D.date_due, !!D.time_due) : null
			} else {
				I.entries[H][3] = D.date_completed ? dateTimeMgr
						.getFriendlyDate(D.date_completed, true) : null
			}
			I.updateEntry(I.entries[H], true)
		}
	};
	setTimeout(function() {
		try {
			A(taskList.list, false);
			A(taskList.completedList, true)
		} catch (B) {
		}
	}, 0)
};
TaskList.prototype.taskUpdateId = function(A, B) {
	var D = this.list.map[A];
	if (is(D)) {
		this.list.entries[D][0] = B;
		this.list.updateEntry(this.list.entries[D], true)
	}
	D = this.completedList.map[A];
	if (is(D)) {
		this.completedList.entries[D][0] = B;
		this.completedList.updateEntry(this.completedList.entries[D], true)
	}
};
TaskList.prototype.reflectMaps = function() {
	this.list.reflectMaps();
	this.completedList.reflectMaps()
};
TaskList.prototype.getTasksForTaskSeries = function(B) {
	var A = [];
	for ( var D in stateMgr.tasks) {
		if (is(stateMgr.tasks[D]) && stateMgr.tasks[D].series_id == B) {
			A.push(D)
		}
	}
	return A
};
TaskList.prototype.taskUpdateName = function(F, E) {
	var A = this.getTasksForTaskSeries(F);
	var I = false;
	var J = false;
	for ( var H = 0; H < A.length; H++) {
		var B = A[H];
		var K = taskList.getTaskList(B);
		var M = K.map[B];
		var D = stateMgr.tasks[B];
		if (typeof (D) !== "undefined" && D !== null) {
			stateMgr.updateTask(B, {
				"name" : E
			})
		}
		if (!is(M)) {
			continue
		}
		if (K == taskList.completedList) {
			J = true
		}
		D.name = E;
		K.entries[M][2] = Control.safeWbrs(E);
		K.updateEntry(K.entries[M], true);
		if (overviewList.taskPresent(B)) {
			var O = overviewList.list.map[B];
			I = true;
			overviewList.list.entries[O][2] = Control.safeWbrs(E);
			overviewList.list.updateEntry(overviewList.list.entries[O], true)
		}
	}
	this.list.sort();
	if (J) {
		this.completedList.sort()
	}
	if (I) {
		overviewList.sort()
	}
};
TaskList.prototype.onTagsModified = function(D) {
	for ( var B = 0, A = D.length; B < A; B++) {
		if (!(D[B] instanceof Array)) {
			this.taskUpdateTags(D[B])
		} else {
			map(function(E) {
				taskList.taskUpdateTags(E)
			}, D[B])
		}
	}
};
TaskList.prototype.taskUpdateTags = function(A) {
	setTimeout(function() {
		var H = taskList.getTasksForTaskSeries(A);
		var E = tagMgr.getTagsForTaskSeriesX(A);
		for ( var F = 0; F < H.length; F++) {
			var J = H[F];
			var B = taskList.getTaskList(J);
			if (!B) {
				continue
			}
			var I = B.map[J];
			var D = stateMgr.tasks[J];
			if (!is(I)) {
				continue
			}
			B.entries[I][4] = E;
			B.updateEntry(B.entries[I], true)
		}
		control.ensureValidity(H)
	}, 0)
};
TaskList.prototype.taskUpdateRepeat = function(A) {
	setTimeout(function() {
		for ( var E = 0; E < A.length; E++) {
			var H = A[E];
			var B = taskList.getTaskList(H);
			if (!B) {
				continue
			}
			var F = B.map[H];
			if (!is(F)) {
				continue
			}
			var D = stateMgr.tasks[H];
			B.entries[F][6] = (D.reoccur && D.reoccur[0]);
			B.updateEntry(B.entries[F], true)
		}
	}, 0)
};
TaskList.prototype.taskUpdateNotes = function(A) {
	setTimeout(function() {
		noteMgr.prepareIndex();
		var H = taskList.getTasksForTaskSeries(A);
		var F = noteMgr.getNoteCount(A);
		for ( var E = 0; E < H.length; E++) {
			var J = H[E];
			var B = taskList.getTaskList(J);
			if (!B) {
				continue
			}
			var I = B.map[J];
			var D = stateMgr.tasks[J];
			if (!is(I)) {
				continue
			}
			B.entries[I][5] = F;
			B.updateEntry(B.entries[I], true)
		}
		noteMgr.clearIndex()
	}, 0)
};
TaskList.prototype.setTaskClear = function(A) {
	if (!A.rowText.rtm_style || A.rowText.rtm_style !== "clear") {
		A.rowText.rtm_style = "clear";
		Utility.removeClass(A.rowTextSpan, "taskduetoday");
		Utility.removeClass(A.rowTextSpan, "taskoverdue")
	}
};
TaskList.prototype.setTaskDueToday = function(A) {
	if (!A.rowText.rtm_style || A.rowText.rtm_style !== "today") {
		A.rowText.rtm_style = "today";
		Utility.removeClass(A.rowTextSpan, "taskoverdue");
		Utility.addClass(A.rowTextSpan, "taskduetoday")
	}
};
TaskList.prototype.setTaskOverdue = function(A) {
	if (!A.rowText.rtm_style || A.rowText.rtm_style !== "overdue") {
		A.rowText.rtm_style = "overdue";
		Utility.removeClass(A.rowTextSpan, "taskduetoday");
		Utility.addClass(A.rowTextSpan, "taskoverdue")
	}
};
TaskList.prototype.taskSelectAll = function(A) {
	var B = this.getViewList();
	if (!A) {
		B.selectNone()
	}
	B.selectAll()
};
TaskList.prototype.taskSelectDueToday = function(D) {
	var E = this.getViewList();
	if (!D) {
		E.selectNone()
	}
	var B = {};
	for ( var A = 0; A < E.entries.length; A++) {
		var F = E.entries[A][0];
		if (stateMgr.tasks[F].completed == false && stateMgr.tasks[F].duetoday) {
			B[A] = true
		}
	}
	E.selectSome(B)
};
TaskList.prototype.taskSelectDueTomorrow = function(D) {
	var E = this.getViewList();
	if (!D) {
		E.selectNone()
	}
	var B = {};
	for ( var A = 0; A < E.entries.length; A++) {
		var F = E.entries[A][0];
		if (stateMgr.tasks[F].completed == false
				&& stateMgr.tasks[F].duetomorrow) {
			B[A] = true
		}
	}
	E.selectSome(B)
};
TaskList.prototype.taskSelectOverdue = function(D) {
	var E = this.getViewList();
	if (!D) {
		E.selectNone()
	}
	var B = {};
	for ( var A = 0; A < E.entries.length; A++) {
		var F = E.entries[A][0];
		if (stateMgr.tasks[F].completed == false && stateMgr.tasks[F].overdue) {
			B[A] = true
		}
	}
	E.selectSome(B)
};
TaskList.prototype.taskSelectNone = function(A) {
	this.getViewList().selectNone()
};
TaskList.prototype.taskGetPriorityDown = function(A) {
	if (A == "N") {
		return A
	}
	if (A == "3") {
		return "N"
	}
	return ((A - 0) + 1)
};
TaskList.prototype.taskGetPriorityUp = function(A) {
	if (A == "1") {
		return A
	}
	if (A == "N") {
		return "3"
	}
	return ((A - 0) - 1)
};
TaskList.prototype.tasksSetPriority = function(M, O) {
	var X = M.length;
	var Y = false;
	if (O == "U" || O == "D") {
		Y = true
	} else {
		U = O
	}
	var H = [];
	var E = 0;
	var I = {};
	for ( var V = 0; V < X; V++) {
		var R = M[V];
		if (is(I[stateMgr.tasks[R].series_id])) {
			continue
		} else {
			I[stateMgr.tasks[R].series_id] = R
		}
		var F = taskList.list.map[R];
		var A = taskList.list.entries[F];
		E++;
		var D = A[1];
		if (Y) {
			U = O == "U" ? this.taskGetPriorityUp(D) : this
					.taskGetPriorityDown(D)
		}
		if (U != D) {
			A[1] = U;
			stateMgr.updateTask(R, {
				"priority" : "P" + U
			});
			H.push(A)
		}
	}
	for ( var R in I) {
		var W = I[R];
		var Q = this.getTasksForTaskSeries(R);
		var U = stateMgr.tasks[W].priority.charAt(1);
		for ( var V = 0; V < Q.length; V++) {
			var R = Q[V];
			var J = this.getTaskList(R);
			if (!J || (R == W)) {
				continue
			}
			var F = J.map[R];
			var A = J.entries[F];
			A[1] = U;
			stateMgr.updateTask(R, {
				"priority" : "P" + U
			});
			H.push(A)
		}
	}
	var K = false;
	for ( var V = 0; V < H.length; V++) {
		var J = this.getTaskList(H[V][0]);
		J.updateEntry(H[V], true);
		if (is(overviewList.list.map[H[V][0]])) {
			var B = overviewList.list.map[H[V][0]];
			overviewList.list.entries[B][1] = H[V][1];
			overviewList.list.updateEntry(overviewList.list.entries[B], true);
			K = true
		}
	}
	taskList.sort();
	if (K) {
		overviewList.sort()
	}
	return H.length
};
TaskList.prototype.tasksSetPriority1 = function() {
	if (this.view == TaskList.TASK_LIST_VIEW_COMPLETED) {
		return false
	}
	var A = this;
	var B = function(D, E) {
		return A.tasksSetPriority(D, E)
	};
	transMgr.executeTxn(B, "tasks.setPriority1", "1")
};
TaskList.prototype.tasksSetPriority2 = function() {
	if (this.view == TaskList.TASK_LIST_VIEW_COMPLETED) {
		return false
	}
	var B = this;
	var A = function(D, E) {
		return B.tasksSetPriority(D, E)
	};
	transMgr.executeTxn(A, "tasks.setPriority2", "2")
};
TaskList.prototype.tasksSetPriority3 = function() {
	if (this.view == TaskList.TASK_LIST_VIEW_COMPLETED) {
		return false
	}
	var A = this;
	var B = function(D, E) {
		return A.tasksSetPriority(D, E)
	};
	transMgr.executeTxn(B, "tasks.setPriority3", "3")
};
TaskList.prototype.tasksSetPriorityNone = function() {
	if (this.view == TaskList.TASK_LIST_VIEW_COMPLETED) {
		return false
	}
	var B = this;
	var A = function(D, E) {
		return B.tasksSetPriority(D, E)
	};
	transMgr.executeTxn(A, "tasks.setPriorityNone", "N")
};
TaskList.prototype.tasksMovePriorityUp = function() {
	if (this.view == TaskList.TASK_LIST_VIEW_COMPLETED) {
		return false
	}
	var B = this;
	var A = function(D, E) {
		return B.tasksSetPriority(D, E)
	};
	transMgr.executeTxn(A, "tasks.movePriorityUp", "U")
};
TaskList.prototype.tasksMovePriorityDown = function() {
	if (this.view == TaskList.TASK_LIST_VIEW_COMPLETED) {
		return false
	}
	var B = this;
	var A = function(D, E) {
		return B.tasksSetPriority(D, E)
	};
	transMgr.executeTxn(A, "tasks.movePriorityDown", "D")
};
TaskList.prototype.removeTask = function(A) {
	if (is(this.list.map[A])) {
		this.list.removeEntry(A)
	} else {
		if (is(this.completedList.map[A])) {
			this.completedList.removeEntry(A)
		}
	}
	stateMgr.workingSet.spliceAll(A)
};
TaskList.SORT_PRIO = [ "priority.charAt(1)", "date_due", "name.toLowerCase()",
		"id" ];
TaskList.SORT_DUE = [ "date_due", "priority.charAt(1)", "name.toLowerCase()",
		"id" ];
TaskList.SORT_NAME = [ "name.toLowerCase()", "priority.charAt(1)", "date_due",
		"id" ];
TaskList.SORT_MAP = {
	"prio" : TaskList.SORT_PRIO,
	"due" : TaskList.SORT_DUE,
	"name" : TaskList.SORT_NAME
};
TaskList.prototype.resort = function(B, A) {
	if (B === this.last_sort_) {
		return 

	}
	this.last_sort_ = B;
	this.list.setSortParameters(stateMgr.tasks, TaskList.SORT_MAP[B], [
			List.LIST_SORT_ASC, List.LIST_SORT_ASC, List.LIST_SORT_ASC,
			List.LIST_SORT_ASC ]);
	if (!A) {
		this.list.sort()
	}
};
TaskList.prototype.reset_snake = function() {
	this.list.snake_.remove_all_sources(true);
	this.list.multi_snake_.remove_all_sources(true);
	this.completedList.snake_.remove_all_sources(true)
};
function LocationList(A) {
	this.id = A;
	this.list = new XList(A, List.LIST_TYPE_PLAIN | List.LIST_TYPE_CHECK
			| List.LIST_TYPE_IMAGE);
	this.list.setTableKlass("xtable_other");
	this.list.init();
	this.list.snake_.initialize("detailswrap", A);
	this.list.setEmptyMessage(_T("INTERFACE_SETTINGS_LOCATIONS_NO_LOCATIONS"));
	this.list.setSortParameters(locationMgr.data, [ "name.toLowerCase()" ],
			[ List.LIST_SORT_ASC ]);
	this.type = "location";
	this.list.parent = this;
	this.data_ = {};
	this.list.tableBlitRows()
}
LocationList.prototype.show = ListBase.prototype.show;
LocationList.prototype.hide = ListBase.prototype.hide;
LocationList.prototype.addLocation = function(D) {
	var A = null;
	if (is(configurationMgr.configuration.defaultLocation)
			&& D.id === configurationMgr.configuration.defaultLocation) {
		A = "list_default"
	}
	var B = [ D.id, D.name.escapeForXML(), A ];
	this.list.conditionalAddOrReplaceEntry(B)
};
LocationList.prototype.locationUpdateName = function(E, A) {
	var D = this.list.map[E];
	var B = locationMgr.locations_[E];
	B.name = A;
	this.list.entries[D][1] = A.escapeForXML();
	this.list.updateEntry(this.list.entries[D], true);
	this.list.sort()
};
LocationList.prototype.listUpdateDefault = function(D, A) {
	var B = this.list.map[D];
	if (A) {
		this.list.entries[B][2] = "list_default"
	} else {
		this.list.entries[B][2] = null
	}
	this.list.updateEntry(this.list.entries[B], true);
	this.list.sort()
};
LocationList.prototype.onDataChanged = function(A) {
	this.data_ = A
};
function TagList(A) {
	this.id = A;
	this.list = new XList(A, List.LIST_TYPE_PLAIN | List.LIST_TYPE_CHECK
			| List.LIST_TYPE_IMAGE);
	this.list.setTableKlass("xtable_other");
	this.list.init();
	this.list.snake_.initialize("detailswrap", A);
	this.list.setEmptyMessage(_T("INTERFACE_TAGS_NO_TAGS"));
	this.hash_ = {};
	this.list.setSortParameters(this.hash_, [ "toLowerCase()" ],
			[ List.LIST_SORT_ASC ]);
	this.type = "tag";
	this.list.parent = this;
	this.data_ = null;
	this.dirty_ = false;
	this.list.tableBlitRows()
}
TagList.prototype.addTag = function(A) {
	var B = [ A, A.escapeForXML() ];
	return this.list.conditionalAddOrReplaceEntry(B)
};
TagList.prototype.show = ListBase.prototype.show;
TagList.prototype.hide = ListBase.prototype.hide;
TagList.prototype.onDataUpdated = function(D) {
	if (this.data_ !== null && D !== null) {
		var B = [];
		var E = [];
		var F = [];
		for ( var A in D) {
			if (!(A in this.data_)) {
				B.push(A)
			} else {
				F.push(A)
			}
		}
		for ( var A in this.data_) {
			if (!(A in D)) {
				E.push(A)
			}
		}
		if (B.length > 0 || E.length > 0) {
			this.dirty_ = true
		}
	} else {
		this.dirty_ = true
	}
	this.data_ = D
};
TagList.prototype.update = function() {
	if (this.dirty_ === false || this.hidden_ || this.data_ === null) {
		return 

	}
	var F = [];
	for ( var A in this.data_) {
		F.push(A);
		this.hash_[A] = A
	}
	F.sort();
	tagList.list.setAdvise(true);
	for ( var D = 0, B = F.length; D < B; D++) {
		var A = F[D];
		var E = this.data_[A];
		this.addTag(A)
	}
	tagList.list.setAdvise(false);
	tagList.list.sortAndBlit();
	tagList.list.prune();
	this.dirty_ = false;
	control.tagsFormat();
	tagList.list.fireSelectionFinished()
};
TagList.prototype.onShow = function() {
	this.update()
};
TagList.prototype.onHide = function() {
};
TagList.prototype.updateTagName = function(B, A) {
	var D = this.list.map[B];
	this.list.entries[D][1] = A.escapeForXML();
	this.list.updateEntry(this.list.entries[D], true);
	this.list.entries[D][0] = A;
	this.list.map[A] = D;
	this.list.reverseMap[D] = A;
	this.list.map[B] = null;
	this.hash_[A] = A;
	this.list.sort();
	control.tagsFormat()
};
function RTMTimeFilterControl(A) {
	this.initialized_ = false;
	this.manager_ = A;
	this.overlays_ = [];
	this.selected_ = null;
	this.container_ = null;
	this.div_ = null
}
RTMTimeFilterControl.prototype = new GControl();
RTMTimeFilterControl.prototype.initialize = function(D) {
	var A = document.createElement("div");
	A.id = "mapfilters";
	var B = document.createElement("table");
	var E = document.createElement("tr");
	E.id = "map_overlay";
	B.appendChild(E);
	A.appendChild(B);
	D.getContainer().appendChild(A);
	this.container_ = A;
	this.div_ = E;
	this.redraw(true);
	this.display(true);
	return A
};
RTMTimeFilterControl.prototype.printable = function() {
	return true
};
RTMTimeFilterControl.prototype.selectable = function() {
	return true
};
RTMTimeFilterControl.prototype.getDefaultPosition = function() {
	return new GControlPosition(G_ANCHOR_TOP_RIGHT, new GSize(4, 4))
};
RTMTimeFilterControl.prototype.addOverlay = function(E, B, D, A) {
	this.overlays_.push( [ E, B, D, A ])
};
RTMTimeFilterControl.prototype.redraw = function(A) {
	var M = this;
	var I = [ '<table><tr id="map_overlay">' ];
	var D = this.selected_ || this.overlays_[0][1];
	for ( var H = 0, E = this.overlays_.length; H < E; H++) {
		var B = this.overlays_[H];
		var K = D === B[1] ? "" : "mfbtn_opaque";
		var J = D === B[1] ? "mfbtn_content_bold" : "";
		I
				.push('<td><div id="map_overlay_'
						+ B[0]
						+ '" class="mfbtn '
						+ B[3]
						+ " "
						+ K
						+ '"><b class="mfbtnwrap"><b class="mfbtn1"></b><b class="mfbtn2"></b></b><div class="mfbtn_content '
						+ J
						+ '">'
						+ B[2]
						+ '</div><b class="mfbtnwrap"><b class="mfbtn2"></b><b class="mfbtn1"></b></b></div></td>')
	}
	I.push("</tr></table>");
	this.container_.innerHTML = I.join("");
	this.div_ = el("map_overlay");
	for ( var H = 0, E = this.overlays_.length; H < E; H++) {
		var B = this.overlays_[H];
		var F = el("map_overlay_" + B[0]);
		F.ov_id = B[1];
		GEvent.addDomListener(F, "click", function(O) {
			M.click(this.ov_id);
			return false
		})
	}
};
RTMTimeFilterControl.prototype.findOverlay = function(D) {
	var E = null;
	for ( var B = 0, A = this.overlays_.length; B < A; B++) {
		if (this.overlays_[B][1] == D) {
			E = this.overlays_[B];
			break
		}
	}
	return E
};
RTMTimeFilterControl.prototype.select = function(A) {
	this.selected_ = A;
	this.redraw(true)
};
RTMTimeFilterControl.prototype.display = function(A) {
	if (A) {
		this.div_.display = ""
	} else {
		this.div_.display = "none"
	}
};
RTMTimeFilterControl.prototype.click = function(A) {
	var B = A !== this.selected_;
	this.select(A);
	if (B) {
		this.manager_.setWaitingFit(true);
		transMgr.request("locations.setLastFilter", Utility.toJSON( {
			"last_filter" : A
		}))
	}
	this.manager_.redraw()
};
RTMTimeFilterControl.prototype.getSelected = function() {
	return this.selected_
};
function RTMMapTypeControl(A) {
	this.initialized_ = false;
	this.manager_ = A;
	this.map_ = null;
	this.overlays_ = [];
	this.selected_ = null;
	this.open_ = false;
	this.other_ = [];
	this.onmouseout_ = null;
	this.div_ = null
}
RTMMapTypeControl.prototype = new GControl();
RTMMapTypeControl.prototype.addOverlay = function(E, B, D, A) {
	this.overlays_.push( [ E, B, D, A ])
};
RTMMapTypeControl.prototype.printable = function() {
	return true
};
RTMMapTypeControl.prototype.selectable = function() {
	return true
};
RTMMapTypeControl.prototype.redraw = function(A) {
	var R = this;
	var I = [];
	var D = this.selected_ || this.overlays_[0][1];
	var O;
	this.other_ = [];
	this.div_.innerHTML = "";
	for ( var H = 0, E = this.overlays_.length; H < E; H++) {
		var B = this.overlays_[H];
		var M = D === B[1] ? "" : "mtbtn_opaque";
		var K = D === B[1] ? "mtbtn_content_bold" : "";
		var Q = D === B[1] ? B[2] + ' <img id="map_type_arrow" src="'
				+ LocationManager.LOCATION_PREFIX
				+ '/img/ico/ico_arr_up_whi_gry.gif" class="mtbtn_arr" />'
				: B[2];
		var J = D === B[1] ? "" : ' style="display: none;"';
		var U = "<div "
				+ J
				+ ' id="map_type_'
				+ B[0]
				+ '" class="mtbtn '
				+ B[3]
				+ " "
				+ M
				+ '"><b class="mtbtnwrap"><b class="mtbtn1"></b><b class="mtbtn2"></b></b><div class="mtbtn_content '
				+ K
				+ '">'
				+ Q
				+ '</div><b class="mtbtnwrap"><b class="mtbtn2"></b><b class="mtbtn1"></b></b></div>';
		if (D !== B[1]) {
			this.other_.push( [ H, B[0] ]);
			I.push(U)
		} else {
			O = U
		}
	}
	I.push(O);
	this.div_.innerHTML = I.join("");
	this.open_ = false;
	for ( var H = 0, E = this.overlays_.length; H < E; H++) {
		var B = this.overlays_[H];
		var F = el("map_type_" + B[0]);
		F.ov_id = B[1];
		GEvent.addDomListener(F, "click", function(V) {
			R.click(this.ov_id);
			return false
		})
	}
};
RTMMapTypeControl.prototype.findOverlay = function(D) {
	var E = null;
	for ( var B = 0, A = this.overlays_.length; B < A; B++) {
		if (this.overlays_[B][1] == D) {
			E = this.overlays_[B];
			break
		}
	}
	return E
};
RTMMapTypeControl.prototype.select = function(A) {
	this.selected_ = A;
	this.redraw(true)
};
RTMMapTypeControl.prototype.display = function(A) {
	if (A) {
		this.div_.display = ""
	} else {
		this.div_.display = "none"
	}
};
RTMMapTypeControl.prototype.showOtherOptions = function() {
	el("map_type_arrow").src = LocationManager.LOCATION_PREFIX
			+ "/img/ico/ico_arr_down_whi_gry.gif";
	for ( var B = 0, A = this.other_.length; B < A; B++) {
		el("map_type_" + this.other_[B][1]).style.display = ""
	}
	this.open_ = true
};
RTMMapTypeControl.prototype.hideOtherOptions = function() {
	el("map_type_arrow").src = LocationManager.LOCATION_PREFIX
			+ "/img/ico/ico_arr_up_whi_gry.gif";
	for ( var B = 0, A = this.other_.length; B < A; B++) {
		el("map_type_" + this.other_[B][1]).style.display = "none"
	}
	this.open_ = false
};
RTMMapTypeControl.prototype.click = function(B) {
	var A = this.selected_ || this.overlays_[0][1];
	if (A !== B) {
		this.select(B);
		switch (B) {
		case "map":
			this.map_.setMapType(G_NORMAL_MAP);
			break;
		case "sat":
			this.map_.setMapType(G_SATELLITE_MAP);
			break;
		case "hyb":
			this.map_.setMapType(G_HYBRID_MAP);
			break;
		default:
			break
		}
	} else {
		this.open_ === true ? this.hideOtherOptions() : this.showOtherOptions()
	}
};
RTMMapTypeControl.prototype.initialize = function(B) {
	var A = document.createElement("div");
	A.id = "maptypes";
	this.div_ = A;
	B.getContainer().appendChild(A);
	this.redraw(true);
	this.display(true);
	this.map_ = B;
	return A
};
RTMMapTypeControl.prototype.getDefaultPosition = function() {
	return new GControlPosition(G_ANCHOR_BOTTOM_LEFT, new GSize(70, 1))
};
RTMMapTypeControl.prototype.isOpen = function() {
	return this.open_
};
function RTMInfoWindow(B, A) {
	this.manager_ = B;
	this.map_ = null;
	this.saving_ = false;
	this.location_id_ = null;
	this.page_data_ = {};
	this.hash_map_ = {};
	this.sort_fields_ = [];
	this.marker_ = A || null;
	this.last_x_ = null;
	this.navigation_ = null;
	this.container_ = null;
	this.div_ = null;
	this.shield_ = null;
	this.span_ = null
}
RTMInfoWindow.prototype = new GOverlay();
RTMInfoWindow.prototype.display = function(A) {
	if (A) {
		this.repositionCorners();
		this.div_.style.visibility = ""
	} else {
		this.div_.style.visibility = "hidden"
	}
};
RTMInfoWindow.prototype.isVisible = function() {
	return this.div_.style.visibility !== "hidden"
};
RTMInfoWindow.prototype.isSaving = function() {
	return this.saving_
};
RTMInfoWindow.prototype.saving = function(A) {
	this.saving_ = A
};
RTMInfoWindow.prototype.setMarker = function(A) {
	this.marker_ = A
};
RTMInfoWindow.prototype.getMarker = function() {
	return this.marker_
};
RTMInfoWindow.prototype.setLocationId = function(A) {
	this.location_id_ = A
};
RTMInfoWindow.prototype.getLocationId = function() {
	return this.location_id_
};
RTMInfoWindow.prototype.initialize = function(E) {
	var D = this;
	var F = document.createElement("div");
	F.style.position = "absolute";
	F.style.visibility = "hidden";
	F.innerHTML = '<div id="iw_inner" class="iw_rbroundbox"><div class="iw_rbtop"><div><div id="iw_tr"></div></div></div><div class="iw_rbcontentwrap"><div class="iw_rbcontent"><img src="'
			+ LocationManager.LOCATION_PREFIX
			+ '/img/ico/ico_close_gry_whi.gif" alt="Close" class="iw_close xtarget" /><div id="iw_r" class="iw_rbright"></div><span id="iw_inner_tasks"></span></div></div><div class="iw_rbbot"><div><div id="iw_br"></div></div></div></div>';
	var B = F.getElementsByTagName("img");
	if (B && B[0]) {
		var A = B[0];
		GEvent.addDomListener(A, "click", function() {
			this.src = LocationManager.LOCATION_PREFIX
					+ "/img/ico/ico_close_gry_whi.gif";
			D.closeSaveDialog();
			return false
		});
		GEvent.addDomListener(A, "mouseover", function() {
			this.src = LocationManager.LOCATION_PREFIX
					+ "/img/ico/ico_close_org_whi.gif"
		});
		GEvent.addDomListener(A, "mouseout", function() {
			this.src = LocationManager.LOCATION_PREFIX
					+ "/img/ico/ico_close_gry_whi.gif"
		})
	}
	E.getPane(G_MAP_FLOAT_PANE).appendChild(F);
	this.manager_.setInfoWindow(this);
	this.map_ = E;
	this.container_ = el("iw_inner");
	this.span_ = el("iw_inner_tasks");
	this.div_ = F;
	this.setSortParameters(stateMgr.tasks, [ "priority.charAt(1)", "date_due",
			"name.toLowerCase()", "id" ]);
	this.deployShields();
	if (is_ie) {
		this.repositionCorners()
	}
};
RTMInfoWindow.prototype.repositionCorners = function() {
	if (!is_ie || is_ie8) {
		return true
	}
	var D = el("iw_tr");
	var A = el("iw_br");
	var B = el("iw_r");
	D.style.position = "absolute";
	D.style.left = "0px";
	D.style.top = "0px";
	A.style.position = "absolute";
	A.style.left = "0px";
	A.style.top = "0px";
	B.style.position = "absolute";
	B.style.left = "0px";
	B.style.top = "0px";
	var E = this.div_.clientWidth - 15;
	A.style.left = D.style.left = E + "px";
	A.style.top = (this.div_.clientHeight - 15) + "px";
	B.style.top = "8px";
	B.style.left = E + "px";
	B.style.width = "15px";
	B.style.height = (this.div_.clientHeight - 15 - 8) + "px"
};
RTMInfoWindow.prototype.remove = function() {
	this.div_.parentNode.removeChild(this.div_);
	this.manager_.setInfoWindow(null)
};
RTMInfoWindow.prototype.copy = function() {
	return new RTMInfoWindow(this.manager_, this.marker_)
};
RTMInfoWindow.prototype.deployShields = function() {
	this.div_.onclick = function(A) {
		A || (A = window.event);
		Utility.stopPropagation(A);
		return true
	};
	this.div_.ondblclick = function(A) {
		A || (A = window.event);
		Utility.stopPropagation(A);
		return true
	};
	this.div_.onmousedown = function(A) {
		A || (A = window.event);
		Utility.stopPropagation(A);
		return true
	};
	this.div_.onmouseup = function(A) {
		A || (A = window.event);
		Utility.stopPropagation(A);
		return true
	}
};
RTMInfoWindow.prototype.redraw = function(D) {
	if (!this.marker_) {
		return
	}
	var A = this.map_.fromLatLngToDivPixel(this.marker_.getPoint());
	if (this.last_x_ === null) {
		this.last_x_ = A.x
	}
	if (!D) {
		var B = this.map_.getCurrentMapType().getProjection().getWrapWidth(
				this.map_.getZoom());
		if (Math.abs(this.last_x_ - A.x) > B / 2) {
			D = true
		} else {
			this.last_x_ = A.x;
			return 

		}
	}
	this.last_x_ = A.x;
	var E = A.y - this.div_.clientHeight;
	this.div_.style.left = A.x + "px";
	this.div_.style.top = (E + 1) + "px"
};
RTMInfoWindow.prototype.moveToMarker = function(D) {
	if (!D) {
		return
	}
	var B = D.getPoint();
	this.display(false);
	var E = this.map_.getBounds();
	var A = this.map_.fromLatLngToDivPixel(B);
	var H = A.x + this.div_.clientWidth + 15;
	var F = A.y - this.div_.clientHeight - 40;
	this.marker_ = D;
	this.redraw(true);
	this.display(true);
	this.map_.panTo(B)
};
RTMInfoWindow.prototype.openWindowAtMarker = function(A, D) {
	if (A) {
		this.setLocationId(null);
		if (is(A.cluster_id)) {
			var B = A.cluster_id;
			var E = this.manager_.getClusterLocationMarker(B);
			if (E) {
				this.page_data_ = {};
				var F = this.manager_.getClusterData(B);
				this.setTasks(F[0], F[2]);
				if (D && this.getNavigation()) {
					this.setLocationId(D);
					this.showPage(this.page_data_[D])
				}
			}
		}
		this.moveToMarker(A)
	}
};
RTMInfoWindow.prototype.showSaveDialog = function(A, B) {
	this.div_.style.zIndex = GOverlay.getZIndex(A.lat());
	this.div_.className = "gmnoprint";
	el("iw_inner").style.zIndex = 10;
	if (B) {
		B = '<div class="iw_address">' + B + "</div>"
	} else {
		B = ""
	}
	this.span_.innerHTML = '<div class="iw_title">'
			+ _T("INTERFACE_LOCATIONS_IW_SAVE_LOCATION")
			+ "</div>"
			+ B
			+ '<div class="iw_saveloc"><table><tr><td><form id="location_save_form" onsubmit="locationMgr.handleSaveLocation(this); return false;" autocomplete="off"><div><input autocomplete="off" id="location_name" type="text" /></div></form></td><td><div onclick="el(\'location_save_form\').onsubmit();" class="lsbtn"><b class="lsbtnwrap"><b class="lsbtn1"></b><b class="lsbtn2"></b></b><div class="lsbtn_content">'
			+ _T("INTERFACE_LOCATIONS_IW_SAVE_BUTTON")
			+ '</div><b class="lsbtnwrap"><b class="lsbtn2"></b><b class="lsbtn1"></b></b></div></td></tr></table></div>';
	var E = el("location_name");
	if (E) {
		var D = this;
		GEvent.addDomListener(E, "keypress", function(F) {
			F || (F = window.event);
			var H = (F.charCode) ? F.charCode : ((F.which) ? F.which
					: F.keyCode);
			if (H === 27) {
				D.closeSaveDialog()
			}
		})
	}
};
RTMInfoWindow.prototype.closeSaveDialog = function() {
	this.marker_ = null;
	if (this.isSaving()) {
		this.manager_.closeSaveDialog()
	} else {
		this.display(false);
		this.manager_.redraw()
	}
};
RTMInfoWindow.prototype.focusSaveInput = function() {
	if (this.isSaving()) {
		var A = el("location_name");
		if (A) {
			A.focus()
		}
	}
};
RTMInfoWindow.prototype.getNavigation = function() {
	return this.navigation_
};
RTMInfoWindow.prototype.showPage = function(A) {
	if (this.getNavigation()) {
		this.getNavigation().showPage(A)
	}
};
RTMInfoWindow.prototype.showPrevPage = function() {
	if (this.getNavigation()) {
		this.getNavigation().prevPage()
	}
};
RTMInfoWindow.prototype.showNextPage = function() {
	if (this.getNavigation()) {
		this.getNavigation().nextPage()
	}
};
RTMInfoWindow.LocationSort = function(B, A) {
	if (B[1][1] < A[1][1]) {
		return -1
	} else {
		if (B[1][1] > A[1][1]) {
			return 1
		}
	}
	var D = locationMgr.locations_[B[0]].name.toLowerCase();
	var E = locationMgr.locations_[A[0]].name.toLowerCase();
	if (!(B[1][0] === 0 || A[1][0] === 0)) {
		if (D < E) {
			return -1
		} else {
			if (D > E) {
				return 1
			}
		}
		if (B[1][0] < A[1][0]) {
			return -1
		} else {
			if (B[1][0] > A[1][0]) {
				return 1
			}
		}
	} else {
		if (B[1][0] < A[1][0]) {
			return 1
		} else {
			if (B[1][0] > A[1][0]) {
				return -1
			}
		}
		if (D < E) {
			return -1
		} else {
			if (D > E) {
				return 1
			}
		}
	}
	return 0
};
RTMInfoWindow.TASKS_PER_PAGE = 8;
RTMInfoWindow.prototype.setTasks = function(U, Q) {
	var I = [];
	var A = [];
	var W = Math.ceil((U + Q.length) / RTMInfoWindow.TASKS_PER_PAGE);
	if (!((U === (RTMInfoWindow.TASKS_PER_PAGE - 1) && Q.length === 1) && U
			+ Q.length === RTMInfoWindow.TASKS_PER_PAGE)
			&& W === Math.floor((U + Q.length) / RTMInfoWindow.TASKS_PER_PAGE)) {
		W++
	}
	if (W === 0) {
		W = 1
	}
	if (W > 1) {
		for ( var H = 0; H < W; H++) {
			A.push( [ '<span id="location_task_page' + H
					+ '" style="display: none;">' ])
		}
	} else {
		A.push( [ '<span id="location_task_page0">' ])
	}
	var O, F, K, M = 0;
	Q.sort(RTMInfoWindow.LocationSort);
	for ( var H = 0, E = Q.length; H < E; H++) {
		M++;
		O = Math.floor(M / RTMInfoWindow.TASKS_PER_PAGE);
		K = Q[H];
		A[O].push('<div class="iw_title"><span class="iw_prio iw_prio'
				+ (K[1][1] + 1) + '">' + K[1][0] + "</span><span>"
				+ locationMgr.locations_[K[0]].name + "</span></div>");
		this.page_data_[K[0]] = O;
		F = K[1][2];
		if (F.length > 0) {
			F = this.TaskSort(F);
			var V = O;
			var J = O;
			var R = M;
			A[O].push('<ul class="iw_tasks">');
			for ( var D = 0, B = F.length; D < B; D++) {
				O = Math.floor(M / RTMInfoWindow.TASKS_PER_PAGE);
				if (R !== M && J !== O) {
					A[J].push("</ul>");
					A[O]
							.push('<div class="iw_title"><span class="iw_prio iw_prio'
									+ (K[1][1] + 1)
									+ '">'
									+ K[1][0]
									+ "</span><span>"
									+ locationMgr.locations_[K[0]].name
									+ "</span></div>");
					A[O].push('<ul class="iw_tasks">')
				}
				A[O]
						.push('<li class="iw_prio'
								+ F[D][1]
								+ '"><a href="#section.tasks" onclick="control.showTaskById('
								+ F[D][0] + '); return false;">' + F[D][2]
								+ "</a></li>");
				M++;
				J = O
			}
			A[O].push("</ul>")
		}
	}
	for ( var H = 0; H < W; H++) {
		A[H].push( [ "</span>" ]);
		I.push(A[H].join(""))
	}
	if (W > 1) {
		I.push('<span id="iw_inner_nav" />')
	}
	this.span_.innerHTML = I.join("");
	if (W > 1) {
		this.navigation_ = new RTMInfoWindowNavigation(this, "iw_inner_nav", W);
		this.navigation_.showPage(0)
	} else {
		this.navigation_ = null
	}
};
RTMInfoWindow.prototype.setSortParameters = function(B, A) {
	this.hash_map_ = B;
	this.sort_fields_ = A
};
RTMInfoWindow.prototype.doSort = function(B, A) {
	for ( var D = 0; D < B.length; D++) {
		if (B[D] === null && A[D] !== null) {
			return 1
		} else {
			if (B[D] !== null && A[D] === null) {
				return -1
			}
		}
		if (B[D] > A[D]) {
			return 1
		} else {
			if (B[D] < A[D]) {
				return -1
			}
		}
	}
	return 0
};
RTMInfoWindow.prototype.TaskSort = function(tasks) {
	var entriesSort = [];
	for ( var j = 0; j < tasks.length; j++) {
		var data = tasks[j][0];
		var entryTuple = [];
		for ( var i = 0; i < this.sort_fields_.length; i++) {
			var f = this.sort_fields_[i];
			var v = eval("this.hash_map_[data]." + f);
			entryTuple.push(v)
		}
		entryTuple.list = this;
		entryTuple.id = data;
		entriesSort.push(entryTuple)
	}
	entriesSort.sort(this.doSort);
	var newtasks = [], entry;
	for ( var i = 0, j = entriesSort.length; i < j; i++) {
		entry = entriesSort[i];
		newtasks.push( [ entry[3], (entry[0] == "N" ? 4 : entry[0] * 1),
				stateMgr.tasks[entry.id].name ])
	}
	return newtasks
};
function RTMInfoWindowNavigation(B, D, A) {
	this.info_ = B;
	this.id_ = D;
	this.elm_ = el(D);
	this.previous_page_ = null;
	this.current_page_ = 0;
	this.num_pages_ = A;
	this.prev_active_ = false;
	this.next_active_ = false;
	this.redraw(true)
}
RTMInfoWindowNavigation.NAV_START = 3;
RTMInfoWindowNavigation.prototype.prevPage = function() {
	this.previous_page_ = this.current_page_;
	this.current_page_ -= 1;
	this.redraw(true);
	this.showRealPage()
};
RTMInfoWindowNavigation.prototype.nextPage = function() {
	this.previous_page_ = this.current_page_;
	this.current_page_ += 1;
	this.redraw(true);
	this.showRealPage()
};
RTMInfoWindowNavigation.prototype.showPage = function(A) {
	this.previous_page_ = this.current_page_;
	this.current_page_ = A;
	this.redraw(true);
	this.showRealPage()
};
RTMInfoWindowNavigation.prototype.showRealPage = function() {
	this.info_.display(false);
	if (this.previous_page_ !== null) {
		el("location_task_page" + this.previous_page_).style.display = "none"
	}
	el("location_task_page" + this.current_page_).style.display = "";
	this.info_.redraw(true);
	this.info_.display(true)
};
RTMInfoWindowNavigation.prototype.redraw = function(B) {
	if (!B) {
		return false
	}
	var A = [];
	if (this.current_page_ !== 0 && this.num_pages_ !== 0) {
		this.prev_active_ = true
	} else {
		this.prev_active_ = false
	}
	if (!this.prev_active_) {
		A.push('<span class="iw_nav_inactive">&laquo; '
				+ _T("INTERFACE_LOCATIONS_IW_PREV") + "</span> ")
	} else {
		A
				.push('<a href=" " onclick="locationMgr.getInfoWindow().showPrevPage(); return false;">&laquo; '
						+ _T("INTERFACE_LOCATIONS_IW_PREV") + "</a> ")
	}
	A.push('<span class="iw_nav_page">' + (this.current_page_ + 1) + "/"
			+ this.num_pages_ + "</span> ");
	if (!(this.current_page_ + 1 === this.num_pages_)) {
		this.next_active_ = true
	} else {
		this.next_active_ = false
	}
	if (!this.next_active_) {
		A.push('<span class="iw_nav_inactive">'
				+ _T("INTERFACE_LOCATIONS_IW_NEXT") + " &raquo;</span>")
	} else {
		A
				.push('<a href=" " onclick="locationMgr.getInfoWindow().showNextPage(); return false;">'
						+ _T("INTERFACE_LOCATIONS_IW_NEXT") + " &raquo;</a>")
	}
	this.elm_.innerHTML = A.join("")
};
function LocationMarker(A, D, B) {
	this.marker_ = A || null;
	this.span_ = null;
	this.count_ = is(B) ? B : null;
	this.prio_ = is(D) ? D : null;
	this.init_ = false;
	this.last_x_ = null;
	LocationMarker.addInstance(this)
}
LocationMarker.prototype = new GOverlay();
LocationMarker.INSTANCES = [];
LocationMarker.addInstance = function(A) {
	LocationMarker.INSTANCES.push(A)
};
LocationMarker.removeAll = function() {
	var D = locationMgr.getMap();
	for ( var B = 0, A = LocationMarker.INSTANCES.length; B < A; B++) {
		D.removeOverlay(LocationMarker.INSTANCES[B])
	}
	LocationMarker.INSTANCES = []
};
LocationMarker.prototype.display = function(A) {
	if (A) {
		this.div_.style.visibility = "visible"
	} else {
		this.div_.style.visibility = "hidden"
	}
};
LocationMarker.prototype.initialize = function(B) {
	var A = this;
	var D = document.createElement("div");
	D.className = "xtarget";
	D.style.position = "absolute";
	D.style.visibility = "hidden";
	D.style.width = "31px";
	D.style.textAlign = "center";
	if (this.marker_) {
		GEvent.addDomListener(D, "click", function() {
			GEvent.trigger(A.marker_, "click")
		})
	}
	this.span_ = document.createElement("span");
	this.span_.className = "map_marker_count";
	this.span_.style.color = "#fff";
	this.span_.style.fontWeight = "bold";
	this.span_.style.fontSize = "10px";
	this.span_.style.fontFamily = "verdana, arial, helvetica, sans-serif";
	D.appendChild(this.span_);
	B.getPane(G_MAP_MARKER_PANE).appendChild(D);
	this.map_ = B;
	this.div_ = D;
	this.init_ = true
};
LocationMarker.prototype.remove = function() {
	this.div_.parentNode.removeChild(this.div_)
};
LocationMarker.prototype.copy = function() {
	return new LocationMarker(this.marker_, this.prio_, this.count_)
};
LocationMarker.prototype.redraw = function(E) {
	if (!this.marker_) {
		return
	}
	var D = false;
	var A = this.map_.fromLatLngToDivPixel(this.marker_.getPoint());
	if (this.last_x_ === null) {
		this.last_x_ = A.x
	}
	if (!E) {
		var B = this.map_.getCurrentMapType().getProjection().getWrapWidth(
				this.map_.getZoom());
		if (Math.abs(this.last_x_ - A.x) > B / 2) {
			E = true;
			D = true
		} else {
			this.last_x_ = A.x;
			return
		}
	}
	this.last_x_ = A.x;
	var F = A.y - 24;
	this.div_.style.zIndex = GOverlay.getZIndex(this.marker_.getPoint().lat());
	this.div_.style.left = A.x + "px";
	this.div_.style.top = F + "px";
	if (!D) {
		this.setPriority(this.prio_);
		this.setCount(this.count_);
		this.display(true)
	}
};
LocationMarker.COLORS = [ "orange", "darkblue", "lightblue", "grey", "green" ];
LocationMarker.prototype.setPriority = function(A) {
	this.prio_ = A
};
LocationMarker.prototype.setCount = function(A) {
	this.count_ = A;
	if (this.init_) {
		this.span_.innerHTML = this.count_ + ""
	}
};
LocationMarker.prototype.getCount = function() {
	return this.count_
};
function LocationManager() {
	this.initialized_ = false;
	this.loaded_ = false;
	this.loading_ = false;
	this.dirty_ = false;
	this.pending_click_ = false;
	this.in_undo_ = false;
	this.callback_after_redraw_ = null;
	this.fit_after_redraw_ = false;
	this.last_location_ = null;
	this.last_zoom_ = null;
	this.last_location_timer_ = null;
	this.saved_cursor_ = null;
	this.locations_ = {};
	this.location_task_series_ = {};
	this.location_details_ = {};
	this.save_data_ = {};
	this.clusters_ = [];
	this.cluster_map_ = {};
	this.cluster_data = {};
	this.cluster_markers_ = [];
	this.cluster_location_markers_ = [];
	this.cluster_location_resources_ = [];
	this.save_marker_ = null;
	this.map_ = null;
	this.map_keyboard_handler_ = null;
	this.info_window_ = null;
	this.location_crosshair_ = null;
	this.location_time_filter_ = null;
	this.location_map_type_ = null;
	this.base_icon_ = null;
	this.autocomplete_ = null;
	this.pan_listeners_ = [];
	this.filter_ = null;
	this.filter_obj_ = null;
	this.working_set_ = null;
	this.working_map_ = {}
}
LocationManager.ZOOM_WORLD = 0;
LocationManager.ZOOM_COUNTRY = 3;
LocationManager.ZOOM_DEFAULT = 7;
LocationManager.ZOOM_STREET = 16;
if (document.location.hostname === "alpha.rememberthemilk.com") {
	LocationManager.LOCATION_PREFIX = ""
} else {
	LocationManager.LOCATION_PREFIX = Utility.getImageUrl("")
}
LocationManager.prototype.initialize = function() {
	this.initialized_ = this._initializeMap();
	if (!this.initialized_) {
		el("map").innerHTML = _T("INTERFACE_LOCATIONS_NO_GOOGLE_MAPS")
	}
};
LocationManager.prototype.isInitialized = function() {
	return this.initialized_
};
LocationManager.prototype.isDirty = function() {
	return this.dirty_
};
LocationManager.prototype.setDirty = function(A) {
	this.dirty_ = A
};
LocationManager.prototype.isLoaded = function() {
	return this.loaded_
};
LocationManager.prototype.setLoaded = function(A) {
	this.loaded_ = A
};
LocationManager.prototype.isPendingClick = function() {
	return this.pending_click_
};
LocationManager.prototype.setPendingClick = function(A) {
	this.pending_click_ = A;
	if (A) {
		if (this.getMap() && this.getMap().getContainer()
				&& this.getMap().getContainer().firstChild
				&& this.getMap().getContainer().firstChild.firstChild) {
			this.saved_cursor_ = this.getMap().getContainer().firstChild.firstChild.cursor;
			this.getMap().getContainer().firstChild.firstChild.style.cursor = "default"
		}
	} else {
		if (this.getMap() && this.getMap().getContainer()
				&& this.getMap().getContainer().firstChild
				&& this.getMap().getContainer().firstChild.firstChild
				&& this.saved_cursor_ !== null) {
			this.getMap().getContainer().firstChild.firstChild.style.cursor = this.saved_cursor_
		}
	}
};
LocationManager.prototype.isInUndo = function() {
	return this.in_undo_
};
LocationManager.prototype.setInUndo = function(A) {
	this.in_undo_ = A
};
LocationManager.prototype.isWaitingFit = function() {
	return this.fit_after_redraw_
};
LocationManager.prototype.setWaitingFit = function(A) {
	this.fit_after_redraw_ = A
};
LocationManager.prototype.getSaveMarker = function() {
	return this.save_marker_
};
LocationManager.prototype.setSaveMarker = function(A) {
	this.save_marker_ = A
};
LocationManager.prototype.setLoading = function(B) {
	var A = el("maploadingicon");
	if (B) {
		A.src = LocationManager.LOCATION_PREFIX + "/img/busy.gif"
	} else {
		A.src = LocationManager.LOCATION_PREFIX + "/img/busy_inactive.gif"
	}
	this.loading_ = !!B
};
LocationManager.prototype.checkResize = function() {
	if (this.isInitialized()) {
		this.map_.checkResize();
		if (this.getInfoWindow() && this.getInfoWindow().isVisible()) {
			this.getInfoWindow().redraw(true)
		}
	}
	this.handleListResize()
};
LocationManager.prototype.display = function() {
	if (this.isInitialized()) {
		this.checkResize();
		if (this.isDirty()) {
			this.redraw(true)
		}
		return false
	} else {
		if (!this.isLoaded()) {
			return LocationManager.doAsyncLoad()
		}
	}
	this.initialize();
	this.checkResize();
	this.setWaitingFit(true);
	if (exists(configurationMgr.configuration.map_due_date)) {
		el("noduedate").checked = configurationMgr.configuration.map_due_date
	}
	this.redraw(true)
};
LocationManager.prototype._startLastLocationTimer = function() {
	var A = this;
	this.last_location_timer_ = setInterval(function() {
		var D = A.getMap();
		if (D && A.last_location_ !== D.getCenter()
				&& A.last_zoom_ !== D.getZoom()) {
			var B = D.getCenter().lat() + "," + D.getCenter().lng() + ","
					+ D.getZoom();
			A.last_location_ = D.getCenter();
			A.last_zoom_ = D.getZoom();
			transMgr.request("locations.setLastLocation", Utility.toJSON( {
				"last_location" : B
			}))
		}
	}, 5000)
};
LocationManager.prototype._setCenter = function(F) {
	var I = null;
	var B = null;
	if (configurationMgr.configuration.defaultLocation
			&& this.locations_[configurationMgr.configuration.defaultLocation]) {
		var H = this.locations_[configurationMgr.configuration.defaultLocation];
		I = new GLatLng(parseFloat(H.latitude), parseFloat(H.longitude));
		B = LocationManager.ZOOM_DEFAULT
	} else {
		if (configurationMgr.configuration.map_last_location) {
			var A = configurationMgr.configuration.map_last_location.split(",");
			var J = parseFloat(A[0]);
			var E = parseFloat(A[1]);
			var D = A[2] * 1;
			I = new GLatLng(J, E);
			B = D
		} else {
			if (configurationMgr.configuration.start_lat) {
				I = new GLatLng(configurationMgr.configuration.start_lat,
						configurationMgr.configuration.start_lon);
				if (configurationMgr.configuration.start_type === 0) {
					B = LocationManager.ZOOM_COUNTRY
				} else {
					B = LocationManager.ZOOM_DEFAULT
				}
			} else {
				I = new GLatLng(-33.753228669101894, 151.2889051437378);
				B = LocationManager.ZOOM_WORLD
			}
		}
	}
	F.setCenter(I, B)
};
LocationManager.prototype._addListeners = function(B) {
	var A = this;
	GEvent.addListener(B, "click", function(E, D) {
		if (A.isPendingClick()) {
			return A.handlePendingClick(E, D)
		} else {
			if (E) {
				return A.handleMapClick(E, D)
			}
		}
		if (A.location_map_type_ && A.location_map_type_.isOpen()) {
			A.location_map_type_.hideOtherOptions()
		}
		return false
	});
	GEvent.addListener(B, "zoomend", function(D, E) {
		A.setWaitingFit(false);
		setTimeout(function() {
			A.updateClusters();
			if (A.getInfoWindow().isVisible()) {
				A.getInfoWindow().setMarker(null);
				A.getInfoWindow().display(false)
			}
		}, 0)
	})
};
LocationManager.prototype._addControls = function(A) {
	A.addControl(new GLargeMapControl());
	A.addControl(new GOverviewMapControl());
	this.location_time_filter_ = new RTMTimeFilterControl(this);
	this.location_time_filter_.addOverlay("today", "today",
			_T("INTERFACE_OVERVIEW_TODAY"), "mfbtn_tod");
	this.location_time_filter_.addOverlay("tomorrow", "tomorrow",
			_T("INTERFACE_OVERVIEW_TOMORROW"), "mfbtn_tom");
	this.location_time_filter_.addOverlay("this_week", "this_week",
			_T("MOBILE_HEADING_THIS_WEEK"), "mfbtn_tw");
	this.location_time_filter_.addOverlay("forever", "forever",
			_T("INTERFACE_LOCATIONS_TIME_FILTER_FOREVER"), "mfbtn_for");
	if (configurationMgr.configuration.map_last_filter) {
		this.location_time_filter_.selected_ = configurationMgr.configuration.map_last_filter
	}
	this.location_map_type_ = new RTMMapTypeControl(this);
	this.location_map_type_.addOverlay("map", "map",
			_T("INTERFACE_LOCATIONS_MAP_TYPE_MAP"), "mtbtn_map");
	this.location_map_type_.addOverlay("hyb", "hyb",
			_T("INTERFACE_LOCATIONS_MAP_TYPE_HYBRID"), "mtbtn_hyb");
	this.location_map_type_.addOverlay("sat", "sat",
			_T("INTERFACE_LOCATIONS_MAP_TYPE_SATELLITE"), "mtbtn_sat");
	A.addControl(this.location_map_type_);
	A.addControl(this.location_time_filter_)
};
LocationManager.prototype.getInfoWindow = function() {
	return this.info_window_
};
LocationManager.prototype.setInfoWindow = function(A) {
	this.info_window_ = A
};
LocationManager.prototype.getTimeFilter = function() {
	return this.location_time_filter_
};
LocationManager.prototype.getMap = function() {
	return this.map_
};
LocationManager.prototype._addOverlays = function(A) {
	this.info_window_ = new RTMInfoWindow(this);
	A.addOverlay(this.info_window_)
};
LocationManager.prototype._intializeBaseIcon = function() {
	this.base_icon_ = new GIcon();
	this.base_icon_.shadow = LocationManager.LOCATION_PREFIX
			+ "/img/locations/mkr_shadow.png";
	this.base_icon_.image = LocationManager.LOCATION_PREFIX
			+ "/img/locations/mkr_gry.png";
	this.base_icon_.iconSize = new GSize(31, 29);
	this.base_icon_.shadowSize = new GSize(36, 34);
	this.base_icon_.iconAnchor = new GPoint(0, 29);
	this.base_icon_.infoWindowAnchor = new GPoint(9, 2);
	this.base_icon_.infoShadowAnchor = new GPoint(18, 25)
};
LocationManager.prototype._setMapProperties = function(A) {
	A.enableContinuousZoom();
	A.enableDoubleClickZoom()
};
LocationManager.prototype._reflectMapOverview = function(B) {
	var D = el("map_overview");
	if (!B && D == null) {
		var A = this;
		setTimeout(function() {
			A._reflectMapOverview(true)
		}, 5000);
		return 

	} else {
		if (D === null) {
			return
		}
	}
	var E = D ? D.getElementsByTagName("img") : null;
	if (E && E.length > 0) {
		GEvent.trigger(E[0], "click")
	}
};
LocationManager.prototype.getBaseIcon = function() {
	return this.base_icon_
};
RTMIcon = function() {
};
RTMIcon.RTM_ICONS = {
	"orange" : "/img/locations/mkr_org.png",
	"darkblue" : "/img/locations/mkr_dblu.png",
	"lightblue" : "/img/locations/mkr_lblu.png",
	"grey" : "/img/locations/mkr_gry.png",
	"green" : "/img/locations/mkr_grn.png"
};
RTMIcon.RNew = function(D, A) {
	var B = new GIcon(D);
	A = RTMIcon.RTM_ICONS[A] ? A : "grey";
	B.image = LocationManager.LOCATION_PREFIX + RTMIcon.RTM_ICONS[A];
	return B
};
LocationManager.prototype._attachAutocomplete = function() {
	var A = this;
	var B = new Autocomplete("map_location_inp",
			new LocationAutocompleteStore());
	B.setReflectCallback(function(D, E) {
		A.handleSavedLocation(D, E)
	});
	B.setAutoselect(false);
	this.autocomplete_ = B
};
LocationManager.prototype._initializeMap = function() {
	if (!GBrowserIsCompatible()) {
		return false
	}
	var B = el("map");
	var D = new GMap2(B);
	var A = new GKeyboardHandler(D);
	this._attachAutocomplete();
	this._setMapProperties(D);
	this._setCenter(D);
	this._addListeners(D);
	this._addControls(D);
	this._addOverlays(D);
	this._intializeBaseIcon();
	this._reflectMapOverview();
	this.map_ = D;
	this.map_keyboard_handler_ = A;
	return true
};
LocationManager.prototype.redraw = function(F) {
	if (!this.isInitialized()) {
		return false
	}
	var A = this;
	var E = this.constructQuery();
	if (F
			|| this.isDirty()
			|| (this.filter_ === null || (this.filter_ !== null && E !== this.filter_))) {
		if (this.getInfoWindow()) {
			this.getInfoWindow().display(false)
		}
		this.working_set_ = this.getFilteredList(E);
		this.working_map_ = {};
		for ( var D = 0, B = this.working_set_.length; D < B; D++) {
			this.working_map_[this.working_set_[D]] = true
		}
		this.filter_ = E;
		setTimeout(function() {
			A.updateClusters()
		}, 0)
	}
	this.setDirty(false)
};
LocationManager.prototype.clusterLocations = function() {
	var R, Q = [], U, A;
	var M = {}, B, O;
	var V;
	if (this.getMap().getZoom() > 17) {
		V = Math
				.floor(Math.exp(4 + ((19 - this.getMap().getZoom()) * 0.7)) / 50) * 50
	} else {
		V = Math
				.floor(Math.exp(4 + ((17 - this.getMap().getZoom()) * 0.7)) / 50) * 50
	}
	for ( var D in this.locations_) {
		var K = this.locations_[D];
		if (!K.viewable) {
			continue
		}
		R = new GLatLng(K.latitude, K.longitude);
		O = false;
		for ( var J = 0, I = Q.length; J < I; J++) {
			A = Q[J].getCenter();
			B = R.distanceFrom(A);
			if (Q[J].contains(R) || B <= V) {
				Q[J].extend(R);
				if (!is(M[J])) {
					M[J] = []
				}
				M[J].push(D);
				O = true;
				break
			}
		}
		if (!O) {
			U = new GLatLngBounds();
			Q.push(U);
			U.extend(R);
			M[Q.length - 1] = [ D ]
		}
	}
	var H = [];
	for ( var J = 0, I = Q.length; J < I; J++) {
		H.push( [ Q[J].getCenter(), M[J] ])
	}
	this.clusters_ = H;
	this.cluster_map_ = {};
	for ( var J in M) {
		for ( var F = 0, E = M[J].length; F < E; F++) {
			this.cluster_map_[M[J][F]] = J
		}
	}
};
LocationManager.prototype.getTasksForCluster = function(E) {
	var J, H;
	var F = 0, I = 4, D = [];
	for ( var B = 0, A = E.length; B < A; B++) {
		J = E[B];
		H = this.getTasksForLocation(J);
		this.location_details_[J] = H;
		F += H[0];
		if (H[1] < I) {
			I = H[1]
		}
		D.push( [ J, H ])
	}
	return [ F, I, D ]
};
LocationManager.COLORS = [ "orange", "darkblue", "lightblue", "grey", "green" ];
LocationManager.prototype.updateClusters = function() {
	var M = this;
	var B = this.getMap();
	this.setLoading(true);
	if (!this.getInfoWindow().isSaving()) {
		this.getInfoWindow().display(false)
	}
	for ( var I = 0, F = this.cluster_markers_.length; I < F; I++) {
		B.removeOverlay(this.cluster_markers_[I])
	}
	LocationMarker.removeAll();
	this.cluster_markers_ = [];
	this.cluster_location_markers_ = [];
	this.cluster_data_ = {};
	this.clusterLocations();
	var H, J, D, K, A, E;
	for ( var I = 0, F = this.clusters_.length; I < F; I++) {
		K = this.clusters_[I];
		H = this.getTasksForCluster(K[1]);
		this.cluster_data_[I] = H
	}
	if (this.isWaitingFit()) {
		if (this.zoomToBestBounds()) {
			return false
		}
	}
	for ( var I = 0, F = this.clusters_.length; I < F; I++) {
		K = this.clusters_[I];
		point = K[0];
		H = this.cluster_data_[I];
		E = LocationManager.COLORS[H[1]] ? LocationManager.COLORS[H[1]]
				: "grey";
		J = new GMarker(point, {
			"draggable" : false,
			"icon" : RTMIcon.RNew(M.getBaseIcon(), E)
		});
		J.cluster_id = I;
		D = new LocationMarker(J);
		D.setCount(H[0]);
		D.setPriority(H[1]);
		this.cluster_markers_.push(J);
		this.cluster_location_markers_.push(D);
		B.addOverlay(J);
		B.addOverlay(D)
	}
	this.setLoading(false);
	if (this.callback_after_redraw_ !== null) {
		this.callback_after_redraw_()
	}
};
LocationManager.prototype.getClusterLocationMarker = function(A) {
	return this.cluster_location_markers_[A]
};
LocationManager.prototype.getClusterData = function(A) {
	return this.cluster_data_[A]
};
LocationManager.prototype.getTaskSeriesForLocation = function(E) {
	var B = [];
	var A = this.location_task_series_;
	for ( var D in A) {
		if (is(A[D]) && A[D] == E) {
			B.push(D)
		}
	}
	return B
};
LocationManager.prototype.getTasksForLocation = function(E) {
	var O = this.getTaskSeriesForLocation(E);
	var D = [];
	var I = {};
	for ( var H = 0, F = O.length; H < F; H++) {
		I[O[H]] = true
	}
	for ( var M in this.working_map_) {
		if (I[stateMgr.tasks[M].series_id]) {
			D.push(M)
		}
	}
	var Q = 4;
	var K = D.length;
	var J = [];
	for ( var H = 0; H < K; H++) {
		if (is(stateMgr.tasks[D[H]]) && !stateMgr.tasks[D[H]].date_completed) {
			var A = stateMgr.tasks[D[H]];
			var B = A.priority.charAt(1);
			if (B == "N") {
				B = 4
			} else {
				B = B * 1
			}
			if (B < Q) {
				Q = B
			}
			J.push( [ A.id, B, A.name ])
		}
	}
	return [ J.length, Q - 1, J ]
};
LocationManager.prototype.getFilteredList = function(D) {
	var A = new Sexp(D);
	this.filter_obj_ = new Filter(stateMgr.tasks, filterMap, A.sexpr, "name");
	this.filter_obj_.setImplicitFilter(_includeArchived);
	dateTimeMgr.setCache(true);
	var B = this.filter_obj_.reduce();
	dateTimeMgr.setCache(false);
	return B
};
LocationManager.prototype.constructQuery = function() {
	var A = el("noduedate");
	var D = this.getTimeFilter().getSelected() || "today";
	var B = null;
	if (D == "today") {
		B = "dueBefore:tomorrow"
	} else {
		if (D == "tomorrow") {
			B = "due:tomorrow"
		} else {
			if (D == "this_week") {
				B = '(dueBefore:today OR dueWithin:"1 week of today")'
			}
		}
	}
	if (A.checked) {
		if (B) {
			return "(hasLocation:true AND status:incomplete) AND (due:never OR "
					+ B + ")"
		}
	} else {
		if (B) {
			return "(hasLocation:true AND status:incomplete) AND (" + B + ")"
		}
	}
	return "(hasLocation:true AND status:incomplete)"
			+ (!A.checked ? " AND (hasDueDate:true)" : "")
};
LocationManager.LocationCompare = function(F, H) {
	var E = false;
	for ( var D in H) {
		E = true;
		if (!(D in F)) {
			return false
		}
		for ( var A in H[D]) {
			if (!(A in F[D]) || F[D][A] !== H[D][A]) {
				return false
			}
		}
	}
	var B = false;
	for ( var D in F) {
		B = true;
		if (!(D in H)) {
			return false
		}
	}
	if (!E && B) {
		return false
	}
	return true
};
LocationManager.prototype.updateLocations = function(A) {
	if (LocationManager.LocationCompare(this.locations_, A)) {
		if (this.isInUndo()) {
			this.setInUndo(false)
		}
		return true
	}
	this.locations_ = A;
	taskCloud.update();
	locationList.list.setSortParameters(locationMgr.locations_,
			[ "name.toLowerCase()" ], [ List.LIST_SORT_ASC ]);
	this.updateList();
	if (this.isInUndo()) {
		this.redrawWhenNeeded();
		this.setInUndo(false)
	}
};
LocationManager.TSCompare = function(E, F) {
	var A = false;
	for ( var D in E) {
		A = true;
		if (!(D in F)) {
			return false
		}
	}
	var B = false;
	for ( var D in F) {
		if (!A) {
			return false
		}
		B = true;
		if (!(D in E)) {
			return false
		}
		if (E[D] !== F[D]) {
			return false
		}
	}
	return true
};
LocationManager.prototype.updateTaskSeries = function(A) {
	if (LocationManager.TSCompare(this.location_task_series_, A)) {
		return false
	}
	this.location_task_series_ = A;
	taskCloud.update();
	if (this.isInitialized()) {
		this.redrawWhenNeeded()
	}
};
LocationManager.prototype.redrawWhenNeeded = function() {
	if (this.isInitialized()) {
		if (view.getViewToken("Locations") && !this.getInfoWindow().isVisible()) {
			this.redraw(true)
		} else {
			this.setDirty(true)
		}
	}
};
LocationManager.LIST_IE_CUTOFF = 83;
LocationManager.prototype.updateList = function(R) {
	var K = el("locationstblwrap");
	var F = [ '<table id="locationstbl">' ];
	if (!R) {
		locationList.list.clear();
		locationList.list.setAdvise(true)
	}
	var J = [];
	for ( var A in this.locations_) {
		J.push( [ A, this.locations_[A].name ])
	}
	J.sort(function(V, U) {
		var W = V[1].toLowerCase();
		var X = U[1].toLowerCase();
		return W < X ? -1 : 1
	});
	for ( var D = 0, B = J.length; D < B; D++) {
		var A = J[D][0];
		var I = this.locations_[J[D][0]];
		var M = I.viewable ? ' checked="1" ' : "";
		F
				.push('<tr><td><input id="location_check_'
						+ A
						+ '" type="checkbox" '
						+ M
						+ '/></td><td><div class="locwrap"><div id="location_list_name_'
						+ A
						+ '" class="locname"><a href=" ">'
						+ I.name
						+ '</a></div><div class="locsearch"><img title="'
						+ _T("INTERFACE_LOCATIONS_SHOW_TASKS_FOR_THIS_LOCATION")
						+ '" class="xtarget" src="'
						+ Utility.getImageUrl("/img/ico/ico_search_sm.gif")
						+ '" /></div></div></td></tr>');
		if (!R) {
			locationList.addLocation(I)
		}
	}
	if (!R) {
		locationList.list.tableBlitRows();
		locationList.list.setAdvise(false);
		locationList.list.sort()
	}
	F.push("</table>");
	K.innerHTML = F.join("");
	var H = K.getElementsByTagName("input");
	var O = K.getElementsByTagName("a");
	var E = K.getElementsByTagName("img");
	var Q = this;
	for ( var D = 0, B = J.length; D < B; D++) {
		H[D].uid = J[D][0];
		GEvent.addDomListener(H[D], "click", function() {
			Q.setViewable(this.uid, false)
		});
		O[D].uid = J[D][0];
		GEvent.addDomListener(O[D], "click", function(U) {
			U || (U = window.event);
			if (!Q.locations_[this.uid]) {
				Q.callback_after_redraw_ = function() {
					if (Q.locations_[this.uid]) {
						if (Q.locations_[this.uid].viewable) {
							Q.panToLocation(this.uid)
						} else {
							Q.setViewable(this.uid, true)
						}
					}
				};
				Q.callback_after_redraw_.uid = this.uid
			} else {
				if (Q.locations_[this.uid].viewable) {
					Q.panToLocation(this.uid)
				} else {
					Q.setViewable(this.uid, true)
				}
			}
			utility.stopEvent(U);
			return false
		});
		E[D].uid = J[D][0];
		GEvent.addDomListener(E[D], "click", function() {
			messageBus.broadcast(tasksView, tasksView.mbn + "showLocation",
					Q.locations_[this.uid].name)
		})
	}
};
LocationManager.prototype.setViewable = function(F, E) {
	var B = el("location_check_" + F);
	var A = E || (B.checked ? true : false);
	if (E) {
		B.checked = true
	}
	this.locations_[F].viewable = A;
	transMgr.request("locations.setViewable", Utility.toJSON( {
		"location" : F,
		"viewable" : A
	}));
	var D = this;
	setTimeout(function() {
		D.updateClusters();
		if (E && A) {
			D.panToLocation(F)
		}
	}, 0)
};
LocationManager.prototype.clearPanListeners = function() {
	for ( var A = 0; A < this.pan_listeners_.length; A++) {
		if (this.pan_listeners_[A] !== null) {
			GEvent.removeListener(this.pan_listeners_[A]);
			this.pan_listeners_[A] = null
		}
	}
};
LocationManager.prototype.panToLocation = function(D) {
	var A = this;
	var B = this.cluster_markers_[this.cluster_map_[D]];
	this.pan_listeners_.push(GEvent.addListener(this.getMap(), "moveend",
			function() {
				A.clearPanListeners();
				A.getInfoWindow().openWindowAtMarker(B, D);
				A.getInfoWindow().focusSaveInput()
			}));
	this.getMap().panTo(B.getPoint());
	if (this.pan_listeners_.length > 0) {
		A.clearPanListeners();
		A.getInfoWindow().openWindowAtMarker(B, D);
		A.getInfoWindow().focusSaveInput()
	}
};
LocationManager.prototype.panToSaveMarker = function(B, A) {
	var D = this;
	if (!A) {
		this.pan_listeners_.push(GEvent.addListener(this.getMap(), "moveend",
				function() {
					D.clearPanListeners();
					D.getInfoWindow().openWindowAtMarker(B);
					D.getInfoWindow().focusSaveInput()
				}))
	}
	this.getMap().panTo(B.getPoint());
	if (!A) {
		if (this.pan_listeners_.length > 0) {
			D.clearPanListeners();
			D.getInfoWindow().openWindowAtMarker(B);
			D.getInfoWindow().focusSaveInput()
		}
	}
};
LocationManager.prototype.getLocationForName = function(A) {
	A = A.toLowerCase();
	var B = null;
	for ( var D in this.locations_) {
		if (this.locations_[D].name.toLowerCase() == A) {
			B = D;
			break
		}
	}
	return B
};
LocationManager.prototype.getLocationsForMagicParse = function() {
	var B = {};
	var D = [];
	for ( var E in this.locations_) {
		var A = "_" + this.locations_[E].name.toLowerCase();
		B[A] = E;
		D.push(A)
	}
	D.sort();
	return [ B, D ]
};
LocationManager.prototype.getTaskLocation = function(A) {
	var B = is(this.location_task_series_[A]) ? this.location_task_series_[A]
			: null;
	if (B === null || !is(this.locations_[B])) {
		return _T("INTERFACE_TASKS_TASK_DETAILS_LOCATION_NONE")
	}
	return this.locations_[B].name
};
LocationManager.prototype.getTaskLocationLink = function(A) {
	var B = is(this.location_task_series_[A]) ? this.location_task_series_[A]
			: null;
	if (B === null || !is(this.locations_[B])) {
		return _T("INTERFACE_TASKS_TASK_DETAILS_LOCATION_NONE")
	}
	return '<a title="' + _T("INTERFACE_TASKS_TASK_DETAILS_LOCATION_TOOLTIP")
			+ '" href="#section.locations" onclick="locationMgr.goToMarker('
			+ B + '); return false;">'
			+ this.locations_[B].name.escapeForDisplay() + "</a>"
};
LocationManager.prototype.goToMarker = function(B) {
	if (!this.isInitialized() || this.isDirty()) {
		var A = this;
		this.callback_after_redraw_ = function() {
			A.panToLocation(B);
			A.callback_after_redraw_ = null
		};
		view.selectView("Locations")
	} else {
		view.selectView("Locations");
		this.panToLocation(B)
	}
};
LocationManager.prototype.updateSeriesLocation = function(A, B) {
	this.location_task_series_[A] = B;
	if (Offline.isReady()) {
		Offline.Sync.updateLocationTaskSeries_(A, B)
	}
};
LocationManager.prototype.toggleNoDueDate = function() {
	var A = el("noduedate");
	transMgr.request("locations.toggleNoDueDate", Utility.toJSON( {
		"checked" : A.checked
	}));
	this.redraw()
};
LocationManager.prototype.go = function() {
	var A = el("map_location_inp");
	var B = A.value.trim();
	if (B.length === 0) {
		return false
	}
	this.setLoading(true);
	transMgr.request("locations.geocode", Utility.toJSON( {
		"address" : B
	}))
};
LocationManager.GEOCODE_RTM = 0;
LocationManager.GEOCODE_GOOGLE = 1;
LocationManager.GEOCODE_YAHOO = 2;
LocationManager.GEOCODE_GEOCODING_JP = 3;
LocationManager.prototype._normalizeGeocoding = function(I) {
	var H = [], O, M, A, Q, J, D, K, R, B;
	J = I["RTMGeo"];
	for ( var F = 0, E = J.length; F < E; F++) {
		Q = null;
		D = J[F];
		if (D["source"] === LocationManager.GEOCODE_GEOCODING_JP) {
			if (D["choice"] === true) {
				M = null;
				A = null;
				Q = D["address"];
				H.push( {
					"lat" : M,
					"lon" : A,
					"address" : Q,
					"recurse" : true
				})
			} else {
				A = D["lng"] * 1;
				M = D["lat"] * 1;
				Q = D["address"];
				H.push( {
					"lat" : M,
					"lon" : A,
					"address" : Q,
					"recurse" : false
				})
			}
		} else {
			A = D["lng"] * 1;
			M = D["lat"] * 1;
			if (D["source"] === LocationManager.GEOCODE_RTM) {
				K = [];
				if (D["full_name"] && D["full_name"].trim().length > 0) {
					K.push(D["full_name"].trim())
				}
				if (D["adm1"] && D["adm1"].trim().length > 0) {
					K.push(D["adm1"].trim())
				}
				if (D["cc1"] && D["cc1"].trim().length > 0) {
					K.push(D["cc1"].trim())
				}
				if (K.length > 0) {
					Q = K.join(", ")
				}
			} else {
				Q = D["address"]
			}
			if (D["source"] === LocationManager.GEOCODE_GOOGLE) {
				B = D["accuracy"] * 1;
				R = ((B * 2) + 1);
				H.push( {
					"lat" : M,
					"lon" : A,
					"address" : Q,
					"zoom" : R
				})
			} else {
				H.push( {
					"lat" : M,
					"lon" : A,
					"address" : Q
				})
			}
		}
	}
	return H
};
LocationManager.prototype.handleGeocodedLocation = function(F) {
	this.setLoading(false);
	if (F === false) {
		statusBox
				.setText(_T("INTERFACE_LOCATIONS_UNABLE_TO_FIND"), false, true);
		return false
	}
	var A = this._normalizeGeocoding(F);
	var B = el("map_location_inp");
	var E = B.value.trim();
	if (A.length === 1) {
		var D = A[0];
		if (exists(D["zoom"])) {
			this.getMap().setCenter(new GLatLng(D["lat"], D["lon"]), D["zoom"])
		} else {
			if (exists(D["recurse"])) {
				this.getMap().setCenter(new GLatLng(D["lat"], D["lon"]),
						LocationManager.ZOOM_STREET)
			} else {
				this.getMap().setCenter(new GLatLng(D["lat"], D["lon"]),
						LocationManager.ZOOM_DEFAULT)
			}
		}
		this
				.showSaveDialog(new GLatLng(D["lat"], D["lon"]), D["address"],
						true);
		statusBox.setText(_T("INTERFACE_LOCATIONS_FOUND_ONE", {
			"LOCATION_NAME" : E,
			"LOCATION_ADDRESS" : D["address"]
		}), false, true)
	} else {
		this.autocomplete_.getStore().setGeocoding(A);
		this.autocomplete_.complete(null);
		statusBox.setText(_T("INTERFACE_LOCATIONS_FOUND_MORE", {
			"LOCATION_NAME" : E,
			"NUM" : (A.length > 11 ? 11 : A.length)
		}), false, true)
	}
};
LocationManager.prototype.handleGeocodedDropdownLocation = function(A) {
	if (exists(A["recurse"]) && A["recurse"] === true) {
		this.go();
		return
	}
	if (exists(A["zoom"])) {
		this.getMap().setCenter(new GLatLng(A["lat"], A["lon"]), A["zoom"])
	} else {
		this.getMap().setCenter(new GLatLng(A["lat"], A["lon"]),
				LocationManager.ZOOM_DEFAULT)
	}
	this.showSaveDialog(new GLatLng(A["lat"], A["lon"]), A["address"], true)
};
LocationManager.prototype.handleSavedLocation = function(B, E) {
	if (!E) {
		this.getInfoWindow().display(false);
		this.go();
		return false
	}
	if (typeof B === "object") {
		return this.handleGeocodedDropdownLocation(B)
	} else {
		var A = null;
		for ( var D in this.locations_) {
			if (this.locations_[D].name === B && this.locations_[D].viewable) {
				A = D;
				break
			}
		}
		if (A) {
			this.panToLocation(A)
		} else {
			this.getInfoWindow().display(false);
			this.go()
		}
	}
};
LocationManager.prototype.handleMapClick = function(B, A) {
	if (!B) {
		return false
	}
	if (this.getSaveMarker() == B) {
		this.showSaveDialog(this.getSaveMarker().getPoint(),
				this.save_data_.address, false)
	} else {
		this.getInfoWindow().openWindowAtMarker(B)
	}
	this.getInfoWindow().focusSaveInput();
	return true
};
LocationManager.prototype.showSaveDialog = function(B, D, A) {
	if (this.getSaveMarker()) {
		this.getInfoWindow().display(false);
		this.getMap().removeOverlay(this.getSaveMarker())
	}
	this.setSaveMarker(new GMarker(B, {
		"draggable" : false,
		"icon" : RTMIcon.RNew(this.getBaseIcon(), "green")
	}));
	this.save_data_ = {};
	this.save_data_.id = hex_sha1(transMgr.getRandomInt(600673)
			+ new Date().getTime());
	this.save_data_.address = D;
	this.getMap().addOverlay(this.getSaveMarker());
	this.getInfoWindow().saving(true);
	this.getInfoWindow().showSaveDialog(B, D);
	this.panToSaveMarker(this.getSaveMarker(), A)
};
LocationManager.prototype.closeSaveDialog = function() {
	this.getInfoWindow().saving(false);
	this.getInfoWindow().display(false);
	this.getMap().removeOverlay(this.getSaveMarker());
	this.setSaveMarker(null);
	this.save_data_ = {}
};
LocationManager.prototype.handleManageLocations = function() {
	settingsTabs.selectTab(_T("INTERFACE_SETTINGS_LOCATIONS_TAB"));
	view.selectView("Settings")
};
LocationManager.prototype.handleAddLocation = function() {
	this.setPendingClick(true);
	statusBox.locationStart()
};
LocationManager.prototype.handlePendingClick = function(B, A) {
	this.setPendingClick(false);
	statusBox.locationStop();
	this.showSaveDialog(A, null, false)
};
LocationManager.prototype.handleSaveLocation = function(E) {
	var I = el("location_name");
	var F = this.getSaveMarker();
	if (!I.value || !F) {
		return false
	}
	var D = I.value.trim().toLowerCase();
	for ( var H in this.locations_) {
		if (this.locations_[H].name.toLowerCase() === D) {
			statusBox.setText(_T("INTERFACE_LOCATIONS_ALREADY_HAVE", {
				"LOCATION_NAME" : I.value
			}), false, true);
			I.focus();
			I.select();
			return false
		}
	}
	var A = F.getPoint();
	var B = {
		"name" : I.value,
		"id" : this.save_data_.id,
		"lat" : A.lat(),
		"lon" : A.lng(),
		"address" : this.save_data_.address,
		"zoom" : this.getMap().getZoom()
	};
	transMgr.request("locations.add", Utility.toJSON(B));
	this.setLoading(true)
};
LocationManager.prototype.handleLocationSaved = function(A) {
	this.setLoading(true);
	A.id = A.bound_id;
	A.latitude = parseFloat(A.lat);
	A.longitude = parseFloat(A.lon);
	A.viewable = true;
	this.locations_[A.id] = A;
	this.closeSaveDialog();
	this.updateList();
	this.updateClusters();
	this.goToMarker(A.id);
	if (A.address) {
		statusBox.setText(_T("INTERFACE_LOCATIONS_LOCATION_SAVED_AT_ADDRESS", {
			"LOCATION_NAME" : A.name.escapeForDisplay(),
			"LOCATION_ADDRESS" : A.address.escapeForDisplay()
		}), false, true)
	} else {
		statusBox.setText(_T("INTERFACE_LOCATIONS_LOCATION_SAVED", {
			"LOCATION_NAME" : A.name.escapeForDisplay()
		}), false, true)
	}
};
LocationManager.prototype.refreshInfoWindow = function() {
	if (this.getInfoWindow().isVisible() && this.getInfoWindow().getMarker()) {
		this.getInfoWindow().openWindowAtMarker(
				this.getInfoWindow().getMarker(),
				this.getInfoWindow().getLocationId())
	}
};
LocationManager.prototype.handleRenameLocation = function(B, A) {
	transMgr.request("locations.setName", Utility.toJSON( {
		"location" : B,
		"name" : A
	}))
};
LocationManager.prototype.handleLocationRenamed = function(A) {
	locationList.locationUpdateName(A.location, A.name);
	this.locations_[A.location].name = A.name;
	this.updateList();
	this.refreshInfoWindow();
	statusBox.setText(_T("INTERFACE_LOCATIONS_LOCATION_RENAMED", {
		"LOCATION_NAME" : A.name.escapeForDisplay()
	}), false, true)
};
LocationManager.prototype.handleLocationsDeleted = function(I) {
	var F = I[0];
	var A = I[1];
	var D = I[2];
	var B = this;
	undoMgr.pushTransaction(F);
	var H = A.length;
	var E = H < 2 ? "INTERFACE_SETTINGS_LOCATIONS_STATUS_LOCATION_DELETED"
			: "INTERFACE_SETTINGS_LOCATIONS_STATUS_LOCATION_NUM_DELETED";
	var J = _T(E, {
		"LOCATION_NAME" : this.locations_[A[0]].name.escapeForDisplay(),
		"NUM" : H
	});
	statusBox.setText(J, true, true);
	map(function(K) {
		delete B.locations_[K];
		locationList.list.tableSetRowBusyById(K, false);
		locationList.list.removeEntry(K)
	}, A);
	map(function(K) {
		var M = control.getTasksForTaskSeries(K);
		control.ensureValidity(M)
	}, D);
	locationList.list.fireSelectionFinished();
	this.updateList();
	this.setDirty(true);
	taskCloud.update();
	control.locationsFormat();
	control.tasksFormat()
};
LocationManager.prototype.handleEscape = function() {
	if (this.location_map_type_.isOpen()) {
		this.location_map_type_.hideOtherOptions()
	}
	if (this.isPendingClick()) {
		this.setPendingClick(false);
		statusBox.locationStop()
	}
};
LocationManager.prototype.handleGoFocus = function() {
	var A = el("map_location_inp");
	A.focus()
};
LocationManager.prototype.zoomToBestBounds = function() {
	var F;
	var E = new GLatLngBounds();
	var B = false;
	for ( var J in this.cluster_map_) {
		var I = this.locations_[J];
		F = this.location_details_[J];
		if (F[0] > 0) {
			B = true;
			E.extend(new GLatLng(I.latitude, I.longitude))
		}
	}
	if (B) {
		var H = this.getMap();
		var D = this.getCenteredBoundsZoomLevel(E.getCenter(), E);
		if (D < 0) {
			D = 0
		}
		var A = H.getZoom();
		H.setZoom(D);
		D = H.getZoom();
		if (A == D) {
			H.setCenter(E.getCenter());
			this.setWaitingFit(false);
			return false
		} else {
			H.panTo(E.getCenter())
		}
	} else {
		this.setWaitingFit(false)
	}
	return B
};
LocationManager.prototype.getCenteredBoundsZoomLevel = function(D, A) {
	var E = this.getMap();
	var M = (E.getCurrentMapType() || G_NORMAL_MAP);
	var J = M.getProjection();
	var F = E.getBoundsZoomLevel(A);
	var I = J.fromLatLngToPixel(D, F);
	var B = J.fromLatLngToPixel(A.getSouthWest(), F);
	var H = J.fromLatLngToPixel(A.getNorthEast(), F);
	var O = Math.max(Math.abs(B.x - I.x), Math.abs(I.x - H.x));
	var K = Math.max(Math.abs(B.y - I.y), Math.abs(I.y - H.y));
	K += 100;
	B = new GPoint(I.x - O, I.y - K);
	H = new GPoint(I.x + O, I.y + K);
	A = new GLatLngBounds(J.fromPixelToLatLng(B, F), J.fromPixelToLatLng(H, F));
	return M.getBoundsZoomLevel(A, E.getSize())
};
LocationManager.prototype.handleListResize = function() {
	if (!map_legend) {
		return false
	}
	var D = el("map");
	var F = el("locations_display");
	var A = map_legend.visible === false ? D.clientHeight
			: (D.clientHeight - 81);
	if (A > 0) {
		F.style.height = A + "px";
		if (is_ie) {
			var B;
			for ( var E in this.locations_) {
				B = el("location_list_name_" + E);
				if (B && B.clientWidth > LocationManager.LIST_IE_CUTOFF) {
					B.style.width = LocationManager.LIST_IE_CUTOFF + "px"
				}
			}
		}
	}
};
LocationManager.PROFILES = {};
LocationManager.PROFILES_READY = {};
LocationManager.START_PROFILE = function(A) {
	LocationManager.PROFILES[A] = [ 0, 0 ]
};
LocationManager.READY_PROFILE = function(A) {
	LocationManager.PROFILES_READY[A] = new Date().getTime()
};
LocationManager.DONE_PROFILE = function(B) {
	var A = new Date().getTime();
	A = (A - LocationManager.PROFILES_READY[B]) / 1000;
	LocationManager.PROFILES[B][0] += 1;
	LocationManager.PROFILES[B][1] += A
};
LocationManager.STOP_PROFILE = function(A) {
	GLog
			.write("[PROFILE] "
					+ A
					+ ", times = "
					+ LocationManager.PROFILES[A][0]
					+ ", total = "
					+ LocationManager.PROFILES[A][1]
					+ ", mean = "
					+ (LocationManager.PROFILES[A][1] / LocationManager.PROFILES[A][0]))
};
LocationManager.GmapsAsyncCallback = function() {
	locationMgr.setLoaded(true);
	setTimeout(function() {
		window.HAS_GMAPS = true;
		locationMgr.display()
	}, 0)
};
LocationManager.doAsyncLoad = function() {
	var A = document.createElement("script");
	A.src = RTM_GMAPS_URL;
	GEvent.addDomListener(A, "error", function(B) {
		locationMgr.setLoaded(true);
		Utility.stopPropagation(B);
		locationMgr.initialize();
		Offline.Dialog.showMapDisabled()
	});
	document.body.appendChild(A)
};
function NotificationList(B) {
	this.id = B;
	this.table = el(B);
	this.entries = [];
	this.selected = [];
	this.selectedMap = {};
	this.busy = [];
	this.busyMap = {};
	this.map = {};
	this.reverseMap = {};
	this.present = {};
	this.type = List.LIST_TYPE_NOTIFICATION;
	this.inited = false;
	this.invalidated = [];
	this.prioState = List.LIST_PRIO_INCOMPLETE;
	this.inAdvise = false;
	this.needToBlit = true;
	this.hashMap = null;
	this.sortFields = null;
	this.sortSpec = null;
	this.sortSpecClean = null;
	this.clickable = true;
	this.visible = false;
	this.emptyMessage = null;
	this.showingEmpty = false;
	this.hoveringId = null;
	this.keyboardPosition = null;
	this.keyboardEntries = [];
	this.table.className = "notification_table";
	this.table.cellSpacing = "0";
	this.table.cellPadding = "0";
	if (!is_ie && (is_safari || !is_khtml)) {
		this.table.innerHTML = "<tbody></tbody>"
	} else {
		var A = this.table.tBodies[0];
		if (A) {
			while (A.childNodes.length > 0) {
				A.removeChild(A.firstChild)
			}
		}
	}
}
extendObject(NotificationList, List);
List.LIST_TYPE_NOTIFICATION = 268435456;
NotificationList.prototype.init = function() {
	this.addRow = this.addNotificationRow;
	this.inited = true;
	this.inAdvise = false;
	this.needToBlit = true;
	this.mbn = this.getUniqueMessageBusName();
	this.prioState = List.LIST_PRIO_INCOMPLETE;
	this.clickable = false
};
NotificationList.prototype.addNotificationRow = function(B) {
	var E = this.table.insertRow(-1);
	var D = E.insertCell(-1);
	var A = document.createElement("table");
	D.appendChild(A);
	E.table = A;
	E.notificationId = B[0];
	E.isHash = (B.length == 7) ? true : false;
	this.addTableRow(B[0], B, A);
	return E
};
NotificationList.prototype.updateEntry = function(A) {
	var B = this.map[A[0]];
	this.entries[B] = A;
	this.table.rows[B].notificationId = A[0];
	return true
};
NotificationList.prototype.addTableRow = function(D, M, U) {
	var V = U.insertRow(-1);
	V.className = "entry";
	var Q = V.insertCell(-1);
	var O = V.insertCell(-1);
	var K = V.insertCell(-1);
	var J = V.insertCell(-1);
	var I = V.insertCell(-1);
	var B = [];
	if (M[1] === "twitter") {
		Q.style.width = "82px";
		Q.style.paddingLeft = "5px";
		Q.innerHTML = '<a href="/services/twitter/" target="_blank">Twitter</a>'
	} else {
		if (M[1] === "iphone") {
			var R = this.splitiPhoneEntry(M[2]);
			Q.style.width = "82px";
			Q.style.paddingLeft = "5px";
			Q.innerHTML = '<a href="/services/iphone/app/" target="_blank">'
					+ R[1] + "</a>"
		} else {
			B.push("<select>");
			for ( var H = 0; H < this.parent.types.length; H++) {
				var E = this.parent.types[H].toLowerCase();
				var F = "";
				if (M[1] && E === M[1]) {
					F = ' selected="1" '
				}
				B.push("<option value="
						+ quoted(this.parent.types[H].toLowerCase()) + F + ">"
						+ this.parent.types[H] + "</option>")
			}
			B.push("</select>");
			Q.innerHTML = B.join(" ")
		}
	}
	this.setupEntryField(D, M[1], true);
	if (M.length !== 7) {
		var A = this.getRadioHTML(D, M);
		K.innerHTML = A[0];
		J.innerHTML = A[1];
		this.setupRadio(D)
	} else {
		K.innerHTML = "&nbsp;";
		J.innerHTML = "&nbsp;"
	}
	if (M[1] === "twitter" || M[1] === "iphone") {
		I.innerHTML = "&nbsp;"
	} else {
		I.innerHTML = '<a href=" " title="'
				+ _T("INTERFACE_SETTINGS_REMINDERS_DELETE_DETAILS")
				+ '"><img style="padding-left: 3px" src="'
				+ Utility.getImageUrl("/img/ico/ico_trash.gif") + '" alt="'
				+ _T("INTERFACE_SETTINGS_REMINDERS_DELETE_DETAILS")
				+ '" width="11" height="11" /></a>'
	}
	this.setupRow(D)
};
NotificationList.prototype.getRadioHTML = function(A, J) {
	var D = "xnot_" + A;
	var E = "xnot_on_" + A;
	var B = "xnot_off_" + A;
	var F = J[3] == true ? ' checked="1" ' : "";
	var K = J[3] == false ? ' checked="1" ' : "";
	var I = "<input id=" + quoted(E) + ' type="radio" ' + F + " name="
			+ quoted(D) + '></input><label class="state" for=' + quoted(E)
			+ ">" + _T("INTERFACE_SETTINGS_REMINDERS_NOTIFY_ON") + "</label>";
	var H = "<input id=" + quoted(B) + ' type="radio" ' + K + " name="
			+ quoted(D) + '></input><label class="state" for=' + quoted(B)
			+ ">" + _T("INTERFACE_SETTINGS_REMINDERS_NOTIFY_OFF") + "</label>";
	return [ I, H ]
};
NotificationList.prototype.getButtonHTML = function(F) {
	var D = "xnot_button_save_" + F;
	var E = "xnot_button_cancel_" + F;
	var B = "<input id=" + quoted(D) + ' type="submit" value="'
			+ _T("INTERFACE_SETTINGS_REMINDERS_NOTIFY_SAVE") + '"></input>';
	var A = "<input id=" + quoted(E) + ' type="submit" value="'
			+ _T("INTERFACE_SETTINGS_REMINDERS_NOTIFY_CANCEL") + '"></input>';
	return [ B, A ]
};
NotificationList.prototype.getChildRow = function(D) {
	var D = this.map[D];
	if (!is(D)) {
		return 

	}
	var B = this.table.rows[D];
	var A = B.table;
	A.rows[0].notificationId = B.notificationId;
	return A.rows[0]
};
NotificationList.prototype.getChildTable = function(B) {
	var B = this.map[B];
	var A = this.table.rows[B];
	return A.table
};
NotificationList.prototype.setupButtons = function(I) {
	var H = this.getChildRow(I);
	var D = H.cells[2];
	var B = H.cells[3];
	var E = D.getElementsByTagName("input")[0];
	var F = B.getElementsByTagName("input")[0];
	var A = this;
	E.onclick = function(J) {
		A.saveEntry(H.notificationId);
		H.modified = false;
		return false
	};
	F.onclick = function(J) {
		A.cancelEntry(H.notificationId);
		H.modified = false;
		return false
	};
	H.saveButton = E;
	H.cancelButton = F
};
NotificationList.prototype.getType = function(E) {
	var D = this.getChildRow(E);
	var B = D.cells[0].getElementsByTagName("select")[0];
	var A = B.options[B.selectedIndex].value.trim().toLowerCase();
	return A
};
NotificationList.prototype.getValue = function(A, H) {
	var Q = this.getChildTable(A);
	var R = Q.rows[0];
	if (H == "mobile") {
		var M = Q.rows[1];
		var K = Q.rows[2];
		var J = R.cells[1].getElementsByTagName("select")[0];
		var B = J.options[J.selectedIndex].value.trim().toLowerCase();
		var O = M.cells[1].getElementsByTagName("input")[0];
		var F = O.value.trim();
		var E = K.cells[1].getElementsByTagName("input")[0];
		var D = E.value.trim();
		return [ B, F, D ]
	} else {
		var O = R.cells[1].getElementsByTagName("input")[0];
		var I = O.value.trim();
		return I
	}
};
NotificationList.prototype.getState = function(D) {
	var B = this.getChildRow(D);
	var A = this.getEntry(D);
	if (B.onRadio && B.onRadio.checked) {
		return true
	}
	if (B.offRadio && B.offRadio.checked) {
		return false
	}
	return A[3]
};
NotificationList.prototype.stripMobile = function(A) {
	return A
};
NotificationList.prototype.saveEntry = function(F) {
	var B = this.getEntry(F);
	var A = this.getType(F);
	var E = this.getValue(F, A);
	var D = this.getState(F);
	B[1] = A;
	B[2] = E;
	B[3] = D;
	if (A == "mobile") {
		B[4] = E[0];
		B[2] = this.stripMobile(E[1]);
		B[5] = E[2]
	}
	if (is(B[6])) {
		B[3] = true;
		messageBus.broadcast(this, this.mbn + "notificationAdd", B)
	} else {
		messageBus.broadcast(this, this.mbn + "notificationUpdate", B)
	}
	this.switchRowState(F, false);
	this.tableSetRowBusyById(F, true)
};
NotificationList.prototype.cancelEntry = function(B) {
	var A = this.getEntry(B);
	this.setupEntryField(B, A[1]);
	this.setType(B, A[1]);
	this.switchRowState(B, false);
	this.setupRow(B);
	if (A[1] === "mobile") {
		this.setMobileValue(B, A[2])
	} else {
		this.setValue(B, A[2])
	}
};
NotificationList.prototype.setValue = function(F, D) {
	var E = this.getChildRow(F);
	var A = E.cells[1];
	var B = A.getElementsByTagName("input")[0];
	B.value = D
};
NotificationList.prototype.setMobileValue = function(F, D) {
	var B = this.getChildTable(F);
	var A = B.rows[1];
	var E = A.cells[1].getElementsByTagName("input")[0];
	E.value = D
};
NotificationList.prototype.setType = function(F, D) {
	var E = this.getChildRow(F);
	var B = E.cells[0];
	var A = B.getElementsByTagName("select")[0];
	if (D) {
		A.selectedIndex = this.parent.typeMap[D.toLowerCase()]
	} else {
		A.selectedIndex = 0
	}
};
NotificationList.prototype.setupRadio = function(J) {
	var I = this.getChildRow(J);
	var H = this.getEntry(J);
	var E = I.cells[2];
	var D = I.cells[3];
	var F = E.getElementsByTagName("input")[0];
	var A = D.getElementsByTagName("input")[0];
	var B = this;
	F.onclick = function(M) {
		var K = B.getEntry(I.notificationId);
		if (K[3] !== true) {
			K[3] = true;
			messageBus.broadcast(B, B.mbn + "notificationToggle", [ K, true ])
		}
		return true
	};
	A.onclick = function(M) {
		var K = B.getEntry(I.notificationId);
		if (K[3] !== false) {
			K[3] = false;
			messageBus.broadcast(B, B.mbn + "notificationToggle", [ K, false ])
		}
		return true
	};
	if (H[3] === true) {
		F.checked = true
	} else {
		A.checked = true
	}
	I.onRadio = F;
	I.offRadio = A
};
NotificationList.prototype.checkNewEntry = function(A, F) {
	var U = this.getChildRow(A);
	var K = this.getEntry(A);
	if (K.length !== 7 && F) {
		return false
	}
	var Q = U.cells[0].getElementsByTagName("select")[0];
	var B = Q.options[Q.selectedIndex].value.trim().toLowerCase();
	if (B === "---") {
		return false
	}
	if (B === "mobile") {
		var R = this.getChildTable(A);
		var M = R.rows[0];
		var J = M.cells[1].getElementsByTagName("select")[0];
		if (!J) {
			return false
		}
		var I = R.rows[1];
		var H = R.rows[2];
		var E = J.options[J.selectedIndex].value.trim().toLowerCase();
		if (E === "---") {
			return false
		}
		var O = I.cells[1].getElementsByTagName("input")[0].value.trim();
		if (O.length === 0) {
			return false
		}
		var D = H.cells[1].getElementsByTagName("input")[0].value.trim();
		if (D.length === 0) {
			return false
		}
		if (E === K[4] && O === K[2] && D === K[5]) {
			return false
		}
	} else {
		if (K[1] !== "mobile") {
			if (U && U.cells.length > 1
					&& U.cells[1].getElementsByTagName("input").length > 0) {
				var O = U.cells[1].getElementsByTagName("input")[0].value
						.trim();
				if (O.length === 0) {
					return false
				}
			}
		}
	}
	return true
};
NotificationList.prototype.switchRowState = function(H, A) {
	var F = this.getChildRow(H);
	var D = this.getEntry(H);
	if (A) {
		var E = this.getButtonHTML(H);
		F.cells[2].innerHTML = E[0];
		F.cells[3].innerHTML = E[1];
		this.setupButtons(H)
	} else {
		var B = this.getRadioHTML(H, D);
		if (D.length < 7) {
			F.cells[2].innerHTML = B[0];
			F.cells[3].innerHTML = B[1];
			this.setupRadio(H)
		} else {
			F.cells[2].innerHTML = "&nbsp;";
			F.cells[3].innerHTML = "&nbsp;"
		}
	}
};
NotificationList.prototype.setupRow = function(A) {
	var O = this.getChildRow(A);
	var F = this.getEntry(A);
	var M = this;
	if (F[1] === "twitter" || F[1] === "iphone") {
		return false
	}
	var I = O.cells[0];
	var K = I.getElementsByTagName("select")[0];
	K.onchange = function(U) {
		var R = M.getEntry(O.notificationId);
		var Q = this.options[this.selectedIndex].value.trim().toLowerCase();
		if (Q !== R[1]) {
			if (M.checkNewEntry(O.notificationId)) {
				O.modified = true;
				M.switchRowState(O.notificationId, true)
			}
			M.setupEntryField(O.notificationId, Q);
			if (Q == "mobile") {
				M.insertMobileRow(O.notificationId)
			}
		} else {
			if (!O.modified) {
				M.switchRowState(O.notificationId, false)
			}
		}
	};
	var B = M.getType(A);
	if (O.cells.length > 1 && B != "mobile") {
		var H = O.cells[1];
		var D = H.getElementsByTagName("input")[0];
		D.onkeyup = function(R) {
			var Q = M.getEntry(O.notificationId);
			var U = this.value.trim();
			if (U !== Q[2] && U.trim().length != 0) {
				if (M.checkNewEntry(O.notificationId)) {
					O.modified = true;
					M.switchRowState(O.notificationId, true)
				}
			} else {
				M.switchRowState(O.notificationId, false)
			}
		};
		D.onfocus = function(R) {
			var Q = M.getType(O.notificationId);
			var U = M.getValue(O.notificationId, Q);
			if (Q !== "---" && is(M.parent.imMap[Q])) {
				helpBox.showHelpText("reminders.im")
			} else {
				if (Q === "email") {
					helpBox.showHelpText("reminders.email")
				}
			}
		};
		D.onblur = function(R) {
			var Q = M.getType(O.notificationId);
			var U = M.getValue(O.notificationId, Q);
			if (Q !== "---" && is(M.parent.imMap[Q])) {
				helpBox.stopShowing("reminders.im")
			} else {
				if (Q === "email") {
					helpBox.stopShowing("reminders.email")
				}
			}
		};
		this.handleKeyPress(A, D)
	} else {
		M.insertMobileRow(A, true);
		M.setMobileValue(A, F[2])
	}
	var E = O.cells[4];
	var J = E.getElementsByTagName("img")[0];
	J.onclick = function(R) {
		if (Offline.isNotOnline()) {
			Offline.Dialog.showDisabledAction();
			return false
		}
		var Q = M.getEntry(O.notificationId);
		if (!Q) {
		}
		if (Q && Q.length < 7) {
			messageBus.broadcast(M, M.mbn + "notificationDelete", Q)
		}
		M.removeEntry(O.notificationId);
		return false
	}
};
NotificationList.prototype.getMobileSelector = function(J) {
	var F = this.getEntry(J);
	var B = [];
	B.push('<select class="field">');
	for ( var H in this.parent.mobileTypes) {
		var I = this.parent.mobileTypes[H];
		if (I === null) {
			B.push('<option disabled="1">' + H
					+ '</option><option disabled="1">---</option>');
			continue
		}
		B.push('<option style="font-weight: bold;" disabled="1">' + H
				+ "</option><option>---</option>");
		for ( var E in I) {
			var A = I[E];
			var D = "";
			if (F[4] && F[4] === A) {
				D = ' selected="1" '
			}
			B.push("<option value=" + quoted(A) + D + ">..." + E + "</option>")
		}
		B.push('<option disabled="1">---</option>')
	}
	var D = "";
	if (F[4] && F[4] === "other") {
		D = ' selected="1" '
	}
	B.push('<option value="other" ' + D + ">"
			+ _T("INTERFACE_SETTINGS_REMINDERS_MOBILE_OTHER") + "</option>");
	B.push("</select>");
	return B.join(" ")
};
NotificationList.prototype.splitiPhoneEntry = function(E) {
	var D = E.split("|");
	var A = D[0];
	var B = D[1].split(":");
	return [ A, B[0], B[1] ]
};
NotificationList.prototype.setupEntryField = function(B, F, A) {
	var K = this.getChildRow(B);
	var I = K.cells[1];
	var H = this.getEntry(B);
	if (F == "mobile") {
		I.innerHTML = this.getMobileSelector(B)
	} else {
		if (F === "twitter") {
			I.style.width = "18.95em";
			I.style.paddingLeft = "2px";
			I.innerHTML = '<a href="http://twitter.com/'
					+ H[2].escapeForDisplay() + '" target="_blank">'
					+ H[2].escapeForDisplay() + "</a>"
		} else {
			if (F === "iphone") {
				var J = this.splitiPhoneEntry(H[2]);
				I.style.width = "18.95em";
				I.style.paddingLeft = "2px";
				I.innerHTML = '<span style="color: #777;">'
						+ J[2].escapeForDisplay() + "</span>"
			} else {
				if (!A) {
					var E = I.getElementsByTagName("select");
					if (E.length > 0) {
						this.removeMobileRow(B)
					}
				}
				var D = I.getElementsByTagName("input");
				if (D.length == 0) {
					I.innerHTML = '<input class="field" type="text" value='
							+ quoted(H[2]) + "></input>"
				}
				if (!A) {
					this.setupRow(B)
				}
			}
		}
	}
};
NotificationList.prototype.removeMobileRow = function(B) {
	var A = this.getChildTable(B);
	A.deleteRow(1);
	A.deleteRow(1)
};
NotificationList.prototype.insertMobileRow = function(A, J) {
	var F = this.getEntry(A);
	var U = this.getChildRow(A);
	var Q = this.getChildTable(A);
	var K, H, I;
	var E = false;
	if (Q.rows.length === 1) {
		K = Q.insertRow(-1);
		H = Q.insertRow(-1);
		if (!J) {
			K.style.display = "none";
			H.style.display = "none"
		}
		I = K.insertCell(-1)
	} else {
		K = Q.rows[1];
		H = Q.rows[2];
		I = K.cells[1];
		I.innerHTML = "";
		E = true
	}
	if (F[4] === "other") {
		I.appendChild(imageMgr.getImage("email"))
	} else {
		I.appendChild(imageMgr.getImage("phone"))
	}
	I.style.textAlign = "right";
	I.style.paddingRight = "2px";
	var D = E ? K.cells[1] : K.insertCell(-1);
	D.innerHTML = '<input class="field" type="text"></input>';
	var O = this;
	var M = D.getElementsByTagName("input")[0];
	M.onkeyup = function(W) {
		var V = O.getEntry(U.notificationId);
		var X = this.value.trim();
		if (X !== V[2] && O.stripMobile(X).length > 0) {
			if (O.checkNewEntry(U.notificationId)) {
				U.modified = true;
				O.switchRowState(U.notificationId, true)
			}
		} else {
			if (!U.modified) {
				O.switchRowState(U.notificationId, false)
			}
		}
	};
	M.onfocus = function(X) {
		var V = O.getType(U.notificationId);
		var Y = O.getValue(U.notificationId, V);
		if (V === "mobile") {
			var W = Y[0];
			if (W === "other") {
				helpBox.showHelpText("reminders.other")
			} else {
				if (W.indexOf("jp_") == 0) {
					helpBox.showHelpText("reminders.username")
				} else {
					helpBox.showHelpText("reminders.phone")
				}
			}
		}
	};
	M.onblur = function(X) {
		var V = O.getType(U.notificationId);
		var Y = O.getValue(U.notificationId, V);
		if (V === "mobile") {
			var W = Y[0];
			if (W === "other") {
				var Z = function() {
					helpBox.stopShowing("reminders.other")
				};
				setTimeout(Z, 1000)
			} else {
				if (W.indexOf("jp_") == 0) {
					helpBox.stopShowing("reminders.username")
				} else {
					helpBox.stopShowing("reminders.phone")
				}
			}
		}
	};
	this.handleKeyPress(A, M);
	if (!E) {
		H.insertCell(-1)
	}
	var B = E ? H.cells[1] : H.insertCell(-1);
	var R = '<input style="width: 6em;" type="text" value="{UNLIMITED}"></input>';
	R = _T("INTERFACE_SETTINGS_REMINDERS_DAILY_MESSAGE_LIMIT", {
		"FIELD" : R,
		"UNLIMITED" : _T("INTERFACE_SETTINGS_REMINDERS_MOBILE_UNLIMITED")
	});
	B.innerHTML = R;
	this.setupMobile(A)
};
NotificationList.prototype.setupMobile = function(A) {
	var O = this.getChildRow(A);
	var K = this.getChildTable(A);
	var H = this.getEntry(A);
	var J = K.rows[0];
	var I = K.rows[1];
	var E = K.rows[2];
	var M = this;
	var B = M.getType(O.notificationId);
	if (B !== "mobile") {
		return
	}
	var F = J.cells[1].getElementsByTagName("select")[0];
	F.onchange = function(R) {
		var U = this.options[this.selectedIndex].value.trim().toLowerCase();
		if (M.checkNewEntry(A) === false) {
			M.switchRowState(O.notificationId, false)
		} else {
			O.modified = true;
			M.switchRowState(O.notificationId, true)
		}
		var Q = I.cells[0].getElementsByTagName("img")[0];
		if (U == "other") {
			Q.src = Utility.getImageUrl("/img/ico/ico_email.gif")
		} else {
			if (U.indexOf("jp_") == 0) {
				Q.src = Utility.getImageUrl("/img/ico/ico_username.gif")
			} else {
				Q.src = Utility.getImageUrl("/img/ico/ico_phone.gif")
			}
		}
		if (this.selectedIndex == 0) {
			I.style.display = "none";
			E.style.display = "none"
		} else {
			I.style.display = "";
			E.style.display = ""
		}
		return false
	};
	F.onfocus = function(Q) {
		helpBox.showHelpText("reminders.network")
	};
	F.onblur = function(Q) {
		helpBox.stopShowing("reminders.network")
	};
	var D = E.cells[1].getElementsByTagName("input")[0];
	D.onfocus = function(U) {
		var R = M.getEntry(O.notificationId);
		var Q = M.getType(O.notificationId);
		var V = M.getValue(O.notificationId, Q);
		if (V[2] === "unlimited"
				|| V[2] == _T("INTERFACE_SETTINGS_REMINDERS_MOBILE_UNLIMITED")) {
			this.value = ""
		} else {
			this.value = V[2]
		}
		helpBox.showHelpText("reminders.smsmax")
	};
	D.onkeyup = function(U) {
		var R = M.getEntry(O.notificationId);
		var Q = M.getType(O.notificationId);
		var V = M.getValue(O.notificationId, Q);
		if (V[2] !== R[5] && M.checkNewEntry(O.notificationId)) {
			O.modified = true;
			M.switchRowState(O.notificationId, true)
		} else {
			O.modified = false;
			M.switchRowState(O.notificationId, false)
		}
	};
	D.onblur = function(Q) {
		if (this.value.trim().length == 0) {
			this.value = _T("INTERFACE_SETTINGS_REMINDERS_MOBILE_UNLIMITED")
		}
		helpBox.stopShowing("reminders.smsmax")
	};
	D.value = this.getEntry(A)[5]
			|| _T("INTERFACE_SETTINGS_REMINDERS_MOBILE_UNLIMITED");
	this.handleKeyPress(A, D)
};
NotificationList.prototype.replaceEntryId = function(B, A) {
	var D = this.map[B];
	this.entries[D][0] = A;
	this.reverseMap[D] = A;
	this.map[A] = D;
	this.present[A] = true;
	this.map[B] = null;
	this.present[B] = null;
	this.entries[D].length = 6
};
NotificationList.prototype.tableSetRowBusy = function(B, A) {
	var E = this.reverseMap[B];
	var D = this.getChildRow(E);
	if (A) {
		D.cells[2].innerHTML = _T("INTERFACE_SETTINGS_REMINDERS_NOTIFY_SAVING");
		D.cells[3].innerHTML = "&nbsp;";
		D.cells[2].colSpan = 2
	} else {
		D.cells[2].innerHTML = _T("INTERFACE_SETTINGS_REMINDERS_NOTIFY_SAVED");
		D.cells[3].innerHTML = "&nbsp;";
		D.cells[2].colSpan = 2
	}
	this.reflectBusy(B, A)
};
NotificationList.prototype.handleKeyPress = function(E, B) {
	var A = this;
	var D = A.getChildRow(E);
	B.onkeypress = function(F) {
		F || (F = window.event);
		var H = (F.charCode) ? F.charCode : ((F.which) ? F.which : F.keyCode);
		if (H == 13) {
			if (D.modified) {
				D.saveButton.onclick()
			}
			return false
		} else {
			if (H == 27) {
				if (D.modified) {
					D.cancelButton.onclick()
				}
				return false
			}
		}
	}
};
NotificationList.prototype.enable = function() {
	Utility.enableForm(this.table, true)
};
NotificationList.prototype.disable = function() {
	Utility.enableForm(this.table, false)
};
function NoteManager(B, A) {
	this.boxId = B;
	this.notesId = A;
	if (B) {
		this.boxDiv = el(B)
	}
	if (A) {
		this.notesDiv = el(A)
	}
	this.noteTimeStampCache = {};
	this.noteMap = {};
	this.noteHashMap = {};
	this.noteEditRefCount = 0;
	this.index = null;
	this.mbn = null;
	this.inited = false;
	this.notesCount = 0;
	this.has_overflow = false;
	this.currentTask = null;
	this.enabled = true;
	this.hidden_ = true
}
NoteManager.prototype.init = function() {
	this.mbn = this.getUniqueMessageBusName();
	this.inited = true
};
NoteManager.prototype.getUniqueMessageBusName = function() {
	return "rtm.notemanager."
};
NoteManager.prototype.show = function() {
	this.hidden_ = false;
	this.boxDiv.style.display = "";
	if (this.enabled && !view.getPublicMode()) {
		el("addnote").style.display = "";
		el("notetoolbox").style.display = "";
		this.fillNotePrint()
	}
	this.checkContainerSize()
};
NoteManager.prototype.fillNotePrint = function() {
	var B = taskList.getViewList().getLastSelectedId();
	if (!B) {
		return false
	}
	if (!is(stateMgr.tasks[B])) {
		return false
	}
	var D = stateMgr.tasks[B].list_id;
	var A = "/print/" + rtmUsername + "/" + D + "/" + B + "/notes/";
	el("printnote").href = A
};
NoteManager.prototype.hide = function() {
	if (!this.hidden_) {
		taskList.list.setHoverable(true);
		taskList.completedList.setHoverable(true);
		setTimeout(function() {
			Control.redrawSnake()
		}, 0)
	}
	this.hidden_ = true;
	this.boxDiv.style.display = "none";
	if (!view.getPublicMode()) {
		el("addnote").style.display = "none";
		el("notetoolbox").style.display = "none"
	}
	this.last_height = null;
	this.has_overflow = false;
	el("detailsoverflow").style.overflow = "visible";
	el("detailsoverflow").style.height = "auto"
};
NoteManager.prototype.incrRef = function() {
	this.noteEditRefCount++;
	taskList.list.setHoverable(false);
	taskList.completedList.setHoverable(false)
};
NoteManager.prototype.decrRef = function() {
	if (this.noteEditRefCount > 0) {
		this.noteEditRefCount--
	}
	if (this.noteEditRefCount === 0) {
		taskList.list.setHoverable(true);
		taskList.completedList.setHoverable(true)
	}
};
NoteManager.prototype.enable = function() {
	if (!view.getPublicMode()) {
		el("addnote").style.display = ""
	}
	this.enabled = true;
	this.checkContainerSize()
};
NoteManager.prototype.disable = function() {
	if (!view.getPublicMode()) {
		el("addnote").style.display = "none"
	}
	this.enabled = false;
	this.checkContainerSize()
};
NoteManager.prototype.splitNoteText = function(H) {
	var F = "", D = "";
	var B = H.indexOf("\n");
	var E = H.indexOf(".");
	var J = B == -1 ? (E == -1 ? null : E + 1) : (E == -1 ? B : (E < B ? B
			: (E > B ? B : E)));
	var I = false;
	if (B > -1 || E > -1) {
		if ((H.charAt(J) === "." && H.charAt(J + 1) !== " ")
				|| (H.charAt(J - 1) === "." && H.charAt(J) !== " ")
				&& H.length > J) {
			if (B !== -1) {
				J = B
			} else {
				F = H;
				I = true
			}
		}
		if (I === false) {
			F = H.substring(0, J);
			D = H.substring(J, H.length)
		}
	} else {
		F = H
	}
	if (D.trim().length == 0) {
		D = F;
		F = ""
	}
	if (F.length > 255) {
		var J = F.substring(0, 253).lastIndexOf(".");
		if (J === -1) {
			var A = F.substring(254, F.length);
			F = F.substring(0, 254);
			D = A + D
		} else {
			var A = F.substring(J + 1, F.length);
			F = F.substring(0, J + 1);
			D = A + D
		}
	}
	return [ F.trim(), D.trim() ]
};
NoteManager.prototype.formatNoteTimestamp = function(A) {
	return dateTimeMgr.getCachedIntlFormat(Intl.preferred_formats.note_date, A)
};
NoteManager.prototype.formatNoteText = function(A) {
	return A.escapeForDisplay().replaceStr("\r\n", "<br />").replaceStr("\n",
			"<br />").autoLink()
};
NoteManager.prototype.getNoteContent = function(D, B, A) {
	if (D === 0 || (B.trim().length === 0 && A.trim().length === 0)) {
		note_content = ""
	} else {
		if (A.trim().length === 0) {
			note_content = B.trim()
		} else {
			if (B.trim().length === 0) {
				note_content = A.trim()
			} else {
				note_content = B + "\n\n" + A + "\n"
			}
		}
	}
	return note_content
};
NoteManager.prototype.createNote = function(Z, I, O, H) {
	var b = this;
	var K = document.createElement("div");
	K.id = "noteEdit_" + Z;
	K.noteId = Z;
	K.className = "notexedit notewidth";
	if (Z != 0) {
		this.noteMap[Z] = K
	}
	var R = document.createElement("div");
	var Y = document.createElement("div");
	var E = document.createElement("div");
	var X = document.createElement("span");
	var V = document.createElement("div");
	var J = document.createElement("form");
	var B = document.createElement("div");
	var M = document.createElement("span");
	var a = document.createElement("input");
	var W = document.createElement("input");
	var U = document.createElement("textarea");
	R.className = "notextitle";
	Y.className = "notextext";
	M.className = "notextimestamp";
	R.innerHTML = Control.safeWbrs(I);
	Y.innerHTML = this.formatNoteText(O);
	if (H) {
		M.appendChild(document.createTextNode(this.formatNoteTimestamp(H)))
	}
	E.appendChild(M);
	var F = document.createElement("span");
	F.appendChild(document.createTextNode(" | "));
	var D = document.createElement("a");
	D.onclick = function(e) {
		if (Z != 0) {
			if (Z in stateMgr.notes && stateMgr.notes[Z]) {
				var f = stateMgr.notes[Z];
				var d = f.title;
				var h = f.content;
				U.value = b.getNoteContent(Z, d, h)
			}
		}
		if (B.style.display != "none") {
			B.style.display = "none"
		} else {
			B.style.display = "block"
		}
		if (J.style.display != "none") {
			J.style.display = "none"
		} else {
			J.style.display = "block"
		}
		if (!is_ie7) {
			U.focus()
		} else {
			U.focus();
			setTimeout(function() {
				U.focus()
			}, 0)
		}
		b.incrRef();
		return false
	};
	K.editLink = D;
	D.href = " ";
	D.innerHTML = _T("INTERFACE_TASKS_NOTES_EDIT");
	D.className = "notexeditlink";
	F.appendChild(D);
	F.appendChild(document.createTextNode(" | "));
	var Q = document.createElement("a");
	Q.onclick = function(e) {
		var d = b.notesDiv.removeChild(K);
		delete d;
		if (K.noteId != 0) {
			b.deleteNote(K.noteId)
		}
		return false
	};
	Q.href = " ";
	Q.innerHTML = '<img src="' + Utility.getImageUrl("/img/ico/ico_trash.gif")
			+ '" class="deletenote" alt="' + _T("INTERFACE_TASKS_NOTES_DELETE")
			+ '" width="11" height="11" />';
	F.appendChild(Q);
	if (view.getPublicMode() === false && !tasksView.inSentList()
			&& this.enabled === true) {
		X.appendChild(F)
	}
	E.appendChild(X);
	U.className = "noteedittext notewidth";
	a.type = "submit";
	W.type = "submit";
	a.value = _T("INTERFACE_TASKS_NOTES_SAVE_BUTTON");
	W.value = _T("INTERFACE_TASKS_NOTES_CANCEL_BUTTON");
	U.onkeydown = function(d) {
		d || (d = window.event);
		var e = (d.charCode) ? d.charCode : ((d.which) ? d.which : d.keyCode);
		if ((e === 13 && d.ctrlKey) || (e == 77 && d.ctrlKey)) {
			a.onclick();
			return false
		} else {
			if (e === 27) {
				W.onclick();
				return false
			}
		}
		return true
	};
	a.onclick = function(d) {
		a.blur();
		if (U.value.trim().length === 0) {
			return W.onclick()
		}
		X.style.display = "none";
		M.innerHTML = _T("INTERFACE_TASKS_NOTES_SAVING_NOTE");
		var e = b.splitNoteText(U.value);
		if (K.noteId == 0) {
			var f = hex_sha1(utility.getRandomInt(376006) + e[0] + e[1]);
			K.noteHash = f;
			b.noteHashMap[f] = K;
			transMgr.request("notes.add", utility.encodeJavaScript( {
				"task" : control.taskSeriesMap( [ taskList.getViewList()
						.getLastSelectedId() ]),
				"title" : e[0],
				"content" : e[1],
				"hash" : f
			}))
		} else {
			transMgr.request("notes.edit", utility.encodeJavaScript( {
				"task" : control.taskSeriesMap( [ taskList.getViewList()
						.getLastSelectedId() ]),
				"note" : K.noteId,
				"title" : e[0],
				"content" : e[1]
			}))
		}
		R.innerHTML = Control.safeWbrs(e[0]);
		Y.innerHTML = b.formatNoteText(e[1]);
		if (B.style.display != "none") {
			B.style.display = "none"
		} else {
			B.style.display = "block"
		}
		if (J.style.display != "none") {
			J.style.display = "none"
		} else {
			J.style.display = "block"
		}
		b.decrRef();
		return false
	};
	W.onclick = function(d) {
		W.blur();
		b.decrRef();
		if (K.noteId == 0) {
			Q.onclick();
			return false
		}
		if (B.style.display != "none") {
			B.style.display = "none"
		} else {
			B.style.display = "block"
		}
		if (J.style.display != "none") {
			J.style.display = "none"
		} else {
			J.style.display = "block"
		}
		return false
	};
	K.onaddnote = function(e) {
		var d = stateMgr.notes[e];
		var h = d.date_last_modified;
		this.id = "noteEdit_" + e;
		this.noteId = e;
		b.noteMap[e] = this;
		var f = b.splitNoteText(U.value);
		R.innerHTML = Control.safeWbrs(f[0]);
		Y.innerHTML = b.formatNoteText(f[1]);
		M.innerHTML = b.formatNoteTimestamp(h);
		X.style.display = "inline"
	};
	K.onupdatenote = function() {
		var d = stateMgr.notes[this.noteId];
		var f = d.date_last_modified;
		var e = b.splitNoteText(U.value);
		R.innerHTML = Control.safeWbrs(e[0]);
		Y.innerHTML = b.formatNoteText(e[1]);
		M.innerHTML = b.formatNoteTimestamp(f);
		X.style.display = "inline"
	};
	K.ondeletenote = function(d) {
	};
	J.id = "noteeditform_" + Z;
	U.id = "noteedittext_" + Z;
	a.id = "noteeditsavebutton_" + Z;
	W.id = "noteeditcancelbutton_" + Z;
	J.style.display = "none";
	U.value = this.getNoteContent(Z, I, O);
	J.appendChild(U);
	var A = document.createElement("div");
	A.className = "noteeditbutton";
	A.style.clear = "both";
	a.style.display = "inline";
	a.style.marginRight = "1px";
	W.style.display = "inline";
	A.appendChild(a);
	A.appendChild(W);
	J.appendChild(A);
	B.appendChild(R);
	B.appendChild(Y);
	B.appendChild(E);
	K.appendChild(B);
	K.appendChild(J);
	return K
};
NoteManager.prototype.appendNote = function(E, D, A, B) {
	var F = this.createNote(E, D, A, B);
	this.notesDiv.appendChild(F);
	this.notesCount++;
	return F
};
NoteManager.prototype.prependNote = function(E, D, A, B) {
	var F = this.createNote(E, D, A, B);
	var H = this.notesDiv.getElementsByTagName("div")[0];
	if (H == null) {
		this.notesDiv.appendChild(F)
	} else {
		this.notesDiv.insertBefore(F, H)
	}
	this.notesCount++;
	return F
};
NoteManager.prototype.createNewNote = function() {
	var A = this.prependNote(0, "", "", null);
	A.editLink.onclick()
};
NoteManager.prototype.ensureValidity = function() {
	var D = this.currentTask;
	if (!D) {
		return
	}
	var F = false;
	if (stateMgr.currentType !== TasksView.LIST_TYPE_NORMAL) {
		var I = stateMgr.filterObj.sexp;
		if (I[0] === 4 && I[1].length > 0) {
			var A, H;
			while ((A = I[1]) && A.length == 1 && A[0][0] === 4) {
				I = A[0]
			}
			for ( var E = 0, B = A.length; E < B; E++) {
				H = A[E];
				if (H[0] === 3
						&& (H[1][0] === "hasNotes" || H[1][0] === "hasNote" || H[1][0] === "noteContains")) {
					F = true;
					break
				}
			}
		}
	}
	if (F) {
		control.tasksListReload(false, true)
	} else {
		taskList.taskUpdateNotes(D)
	}
};
NoteManager.prototype.deleteNote = function(A) {
	transMgr.request("notes.delete", utility.encodeJavaScript( {
		"task" : control.taskSeriesMap( [ taskList.getViewList()
				.getLastSelectedId() ]),
		"note" : A
	}));
	stateMgr.updateNote(A, {
		"date_deleted" : (new Date().getTime()) / 1000
	});
	messageBus.broadcast(this, this.mbn + "noteDeleted", A);
	format.formatNoteCount(this.currentTask);
	setTimeout(function() {
		noteMgr.ensureValidity();
		noteMgr.checkContainerSize()
	}, 0)
};
NoteManager.prototype.checkContainerSize = function() {
	if (this.hidden_) {
		return false
	}
	var A = getWindowSize();
	var E = Offline.Dialog._getScrollTop();
	var H = el("detailsoverflow");
	var D = H.offsetHeight;
	var J = H.scrollHeight;
	var F = Autocomplete.findPosition(H);
	var I = ((A[1] + E) - F[1] - 10);
	var B = F[1];
	if (B + J > A[1] + E) {
		this.has_overflow = true;
		this.last_height = I;
		H.style.overflow = "auto";
		H.style.height = I + "px";
		Control.redrawSnake();
		Utility.addClass(H, "has-overflow");
		return true
	} else {
		this.has_overflow = false;
		this.last_height = null;
		H.style.overflow = "visible";
		H.style.height = "auto";
		Control.redrawSnake();
		Utility.removeClass(H, "has-overflow");
		return false
	}
};
NoteManager.prototype.completeNewNote = function(D, B) {
	var A = this.noteHashMap[B];
	if (A) {
		A.onaddnote(D);
		messageBus.broadcast(this, this.mbn + "noteAdded", D);
		setTimeout(function() {
			noteMgr.ensureValidity();
			noteMgr.checkContainerSize()
		}, 0)
	} else {
		A = this.noteMap[D];
		A.onupdatenote();
		messageBus.broadcast(this, this.mbn + "noteUpdated", D);
		setTimeout(function() {
			noteMgr.checkContainerSize()
		}, 0)
	}
	format.formatNoteCount(stateMgr.notes[D].task_series_id)
};
NoteManager.prototype.undeleteNote = function(A) {
	stateMgr.updateNote(A, {
		"date_deleted" : null
	});
	this.fillNotes(this.currentTask)
};
NoteManager.prototype.taskAddNote = function(A) {
	this.appendNote(A.id, A.title, A.content, A.date_last_modified)
};
NoteManager.prototype.clearNotes = function() {
	this.notesDiv.innerHTML = "";
	this.notesCount = 0;
	this.currentTask = null;
	this.noteEditRefCount = 0
};
NoteManager.prototype.setCurrentTask = function(A) {
	this.currentTask = A
};
NoteManager.prototype.getNoteCount = function(E) {
	if (this.index !== null) {
		if (!(E in this.index)) {
			return 0
		}
		return this.index[E].length
	}
	var A = 0;
	for ( var B in stateMgr.notes) {
		var D = stateMgr.notes[B];
		if (D.task_series_id == E && D.date_deleted === null) {
			A++
		}
	}
	return A
};
NoteManager.prototype.sortNotes = function(a, b) {
	var fields = [ "date_last_modified", "title", "content" ];
	for ( var i = 0; i < fields.length; i++) {
		var af = eval("a." + fields[i]);
		var bf = eval("b." + fields[i]);
		if (af > bf) {
			return -1
		} else {
			(af < bf)
		}
		return 1;
		continue
	}
	return 0
};
NoteManager.prototype.fillNotes = function(E, F) {
	this.clearNotes();
	var A = [];
	for ( var D in stateMgr.notes) {
		if (stateMgr.notes[D].task_series_id == E
				&& stateMgr.notes[D].date_deleted == null) {
			A.push(stateMgr.notes[D])
		}
	}
	if (A.length > 0) {
		A.sort(this.sortNotes);
		for ( var B = 0; B < A.length; B++) {
			this.taskAddNote(A[B])
		}
	}
	setTimeout(function() {
		noteMgr.checkContainerSize()
	}, 0)
};
NoteManager.prototype.prepareIndex = function() {
	this.index = {};
	for ( var A in stateMgr.notes) {
		var B = stateMgr.notes[A];
		if (B.date_deleted === null) {
			if (!(B.task_series_id in this.index)) {
				this.index[B.task_series_id] = []
			}
			this.index[B.task_series_id].push(A)
		}
	}
};
NoteManager.prototype.clearIndex = function() {
	this.index = null
};
NoteManager.prototype.showMultiEditMessage = function() {
	this.clearNotes();
	this.disable();
	this.notesDiv.innerHTML = _T("INTERFACE_TASKS_NOTES_MULTIEDIT")
};
function XManager(B, A) {
	this.id = B;
	this.div = el(this.id);
	this.inited = false;
	this.mbn = null;
	this.buttonId = A;
	this.button = el(A)
}
XManager.prototype.init = function() {
	this.inited = true
};
XManager.prototype.show = function() {
	this.div.style.display = ""
};
XManager.prototype.hide = function() {
	this.div.style.display = "none"
};
function SaveManager(D, B) {
	this.id = D;
	this.div = el(this.id);
	this.inited = false;
	this.mbn = "rtm.savemanager.";
	this.buttonId = B;
	this.button = el(B);
	var A = this;
	this.button.onclick = function(E) {
		messageBus.broadcast(A, A.mbn + "buttonClicked");
		return false
	};
	if (is_safari) {
		new Label("savelistnamelabel", "savelistname")
	}
}
extendObject(SaveManager, XManager);
SaveManager.prototype.show = function() {
	this.div.style.display = "";
	el("savelistname").focus()
};
function ShareManager(D, B) {
	this.id = D;
	this.div = el(this.id);
	this.inited = false;
	this.radiogroup = new RadioGroup("share");
	this.mbn = "rtm.sharemanager.";
	this.buttonId = B;
	this.button = el(B);
	var A = this;
	this.button.onclick = function(E) {
		messageBus.broadcast(A, A.mbn + "buttonClicked");
		return false
	};
	if (is_safari) {
		new Label("shareprivatelabel", "shareprivate");
		new Label("sharecontactlabel", "sharecontact")
	}
}
extendObject(ShareManager, XManager);
ShareManager.prototype.showMessage = function(A) {
	var B = el("shareform");
	if (A) {
		B.style.display = "none";
		Utility.removeClass(el("share-error-message"), "hidden")
	} else {
		Utility.addClass(el("share-error-message"), "hidden");
		B.style.display = ""
	}
};
function PublishManager(D, B) {
	this.id = D;
	this.div = el(this.id);
	this.inited = false;
	this.radiogroup = new RadioGroup("publish");
	this.mbn = "rtm.publishmanager.";
	this.buttonId = B;
	this.button = el(B);
	var A = this;
	this.button.onclick = function(E) {
		messageBus.broadcast(A, A.mbn + "buttonClicked");
		return false
	};
	if (is_safari) {
		new Label("publishprivatelabel", "publishprivate");
		new Label("publishcontactlabel", "publishcontact");
		new Label("publishpubliclabel", "publishpublic")
	}
	this.publicLists = {}
}
extendObject(PublishManager, XManager);
PublishManager.prototype.fillPublicInfo = function() {
	var H = el("infoPublicLists");
	var B = stateMgr.permissions ? stateMgr.permissions["publish"] : null;
	if (B) {
		var A = [];
		var D = null;
		var F = {};
		for ( var E in B) {
			D = B[E];
			if (D.length == 1 && is(D[0]) && D[0][0] == -1 && stateMgr.lists[E]
					&& !stateMgr.lists[E].archived
					&& !stateMgr.lists[E].deleted) {
				F[E] = true;
				A.push("<div><i>"
						+ stateMgr.lists[E].name.escapeForDisplay()
						+ "</i>: <a href="
						+ quoted("http://" + rtmHostname + "/home/"
								+ rtmUsername + "/" + E + "/") + ">http://"
						+ rtmHostname + "/home/" + rtmUsername + "/" + E
						+ "/</a></div>")
			}
		}
		this.publicLists = F;
		if (A.length > 0) {
			H.innerHTML = A.join(" ")
		} else {
			this.publicLists = {};
			H.innerHTML = _TF("INTERFACE_SETTINGS_INFO_NO_PUBLIC")
		}
	} else {
		this.publicLists = {};
		H.innerHTML = _TF("INTERFACE_SETTINGS_INFO_NO_PUBLIC")
	}
};
function SearchManager(B, D) {
	this.inited = false;
	this.mbn = "rtm.searchmanager.";
	this.buttonId = B;
	this.button = el(B);
	this.cancelId = D;
	this.cancel = el(D);
	var A = this;
	this.button.onclick = function(E) {
		view.selectView("Tasks");
		messageBus.broadcast(A, A.mbn + "buttonClicked");
		A.doSearch();
		return false
	};
	this.cancel.onclick = function(E) {
		tasksView.toggleSearchOptions();
		return false
	};
	this.fieldMap = {
		"list" : [ SearchManager.FIELD_TYPE_SELECT, "search_lists" ],
		"priority" : [ SearchManager.FIELD_TYPE_SELECT, "search_priority" ],
		"status" : [ SearchManager.FIELD_TYPE_SELECT, "search_status" ],
		"sharedWith" : [ SearchManager.FIELD_TYPE_SELECT, "search_shared",
				function(E, F) {
					return A.doSharedWith(E, F)
				} ],
		"tag" : [ SearchManager.FIELD_TYPE_TEXT, "search_tags" ],
		"location" : [ SearchManager.FIELD_TYPE_SELECT, "search_location" ],
		"name" : [ SearchManager.FIELD_TYPE_TEXT, "search_words" ],
		"not name" : [ SearchManager.FIELD_TYPE_TEXT, "search_words_not" ],
		"noteContains" : [ SearchManager.FIELD_TYPE_CHECKBOX, "search_notes",
				function(E, F) {
					return A.doNoteContains(E, F)
				} ],
		"dueWithin" : [ SearchManager.FIELD_TYPE_TEXT, "search_due_range",
				function(E, F) {
					return A.doDueWithin(E, F)
				} ],
		"timeEstimate" : [ SearchManager.FIELD_TYPE_TEXT, "search_estimate",
				function(E, F) {
					return A.doEstimate(E, F)
				} ],
		"includeArchived" : [ SearchManager.FIELD_TYPE_CHECKBOX,
				"search_archived" ]
	}
}
SearchManager.FIELD_TYPE_SELECT = 0;
SearchManager.FIELD_TYPE_TEXT = 1;
SearchManager.FIELD_TYPE_CHECKBOX = 2;
SearchManager.prototype.init = function() {
	this.inited = true
};
SearchManager.prototype.doSharedWith = function(B, E) {
	if (view.getPublicMode()) {
		return null
	}
	var A = document.getElementById(E[1]);
	var D = A[A.selectedIndex].value;
	if (D == -1) {
		return null
	}
	if (D == -2) {
		return "isShared:false"
	}
	if (D == -3) {
		return "isShared:true"
	}
	return B + ":" + quoteSearchTerm(D)
};
SearchManager.prototype.doDueWithin = function(B, D) {
	var A = el(D[1]).value.trim();
	var E = el("search_due_start").value.trim();
	if (A.length == 0 && E.length == 0) {
		return null
	}
	if (A.length == 0) {
		return "due:" + quoteSearchTerm(E)
	} else {
		if (E.length == 0) {
			E = "today"
		}
		return B + ":" + quoteSearchTerm(fmt("%1 of %2", [ A, E ]))
	}
};
SearchManager.prototype.doEstimate = function(B, E) {
	if (view.getPublicMode()) {
		return null
	}
	var H = el(E[1]).value.trim();
	var A = el("search_estimatetype");
	var D = A[A.selectedIndex].value * 1;
	if (H.length == 0) {
		return null
	}
	var F = D !== 1 ? (D === 2 ? "> " : "< ") : "";
	return B + ":" + quoteSearchTerm( [ F, H ].join(""))
};
SearchManager.prototype.doNoteContains = function(H, I) {
	var A = document.getElementById(I[1]);
	if (A.checked) {
		var B = el(this.fieldMap["name"][1]).value.trim();
		var E = el(this.fieldMap["not name"][1]).value.trim();
		var D = [];
		if (B.length > 0) {
			var F = map(function(J) {
				return H + ":" + J
			}, normalizeSearchEntry(B));
			D.push(F.length == 1 ? F[0] : "(" + F.join(" and ") + ")")
		}
		if (E.length > 0) {
			var F = map(function(J) {
				return "not " + H + ":" + J
			}, normalizeSearchEntry(E));
			D.push(F.length == 1 ? F[0] : "(" + F.join(" and ") + ")")
		}
		if (E.length == 0 && B.length == 0) {
			return null
		}
		return D.length == 1 ? D[0] : "(" + D.join(" ") + ")"
	}
	return null
};
SearchManager.prototype.fieldQuery = function(E, I) {
	if (I.length == 3 && typeof I[2] == "function") {
		return I[2](E, I)
	}
	if (I[0] == SearchManager.FIELD_TYPE_SELECT) {
		var A = document.getElementById(I[1]);
		var H = A[A.selectedIndex].value;
		if (H == 0 || H == -1) {
			return null
		}
		return E + ":" + quoteSearchTerm(H)
	} else {
		if (I[0] == SearchManager.FIELD_TYPE_TEXT) {
			var F = document.getElementById(I[1]);
			var H = F.value.trim();
			if (H.length == 0) {
				return null
			}
			var D = map(function(J) {
				return E + ":" + J
			}, normalizeSearchEntry(H));
			return D.length == 1 ? D[0] : "(" + D.join(" and ") + ")"
		} else {
			if (I[0] == SearchManager.FIELD_TYPE_CHECKBOX) {
				var B = document.getElementById(I[1]);
				if (B.checked === true) {
					return E + ":true"
				}
			}
		}
	}
	return null
};
SearchManager.prototype.joinQuery = function(E) {
	var B = [];
	var A = false;
	for ( var D = E.length - 1; D >= 0; D--) {
		B.push(E[D]);
		if (D == 0) {
			break
		}
		if (E[D].indexOf("not ") > -1) {
			A = true
		}
		if (E[D].indexOf("noteContains") > -1) {
			B.push("or")
		} else {
			if (A == false) {
				B.push("and")
			}
			A = false
		}
	}
	B.reverse();
	return B.join(" ")
};
SearchManager.prototype.constructQuery = function() {
	var B = [];
	var A;
	for ( var D in this.fieldMap) {
		if (view.getPublicMode() && D == "includeArchived") {
			continue
		}
		A = this.fieldQuery(D, this.fieldMap[D]);
		if (A !== null) {
			B.push(A)
		}
	}
	if (B.length == 0) {
		return ""
	}
	return B.length == 1 ? B[0] : this.joinQuery(B)
};
SearchManager.prototype.doSearch = function() {
	el("listFilter").value = this.constructQuery();
	control.updateListFilter();
	tasksView.toggleSearchOptions()
};
SearchManager.prototype.updateLists = function() {
	var B = stateMgr.getValidLists();
	var A = document.getElementById("search_lists");
	A.options.length = 0;
	var D = document.createElement("option");
	D.value = "-1";
	D.innerHTML = _T("INTERFACE_SEARCH_ALL_LISTS");
	A.appendChild(D);
	D = document.createElement("option");
	D.value = "-1";
	D.innerHTML = "---";
	D.disabled = true;
	A.appendChild(D);
	map(function(F) {
		var E = document.createElement("option");
		E.value = F[1];
		E.innerHTML = F[1];
		A.appendChild(E)
	}, B)
};
SearchManager.prototype.updateLocations = function() {
	var B = document.getElementById("search_location");
	B.options.length = 0;
	var A = document.createElement("option");
	A.value = "-1";
	A.innerHTML = _T("INTERFACE_SEARCH_PRIORITY_ANY");
	B.appendChild(A);
	A = document.createElement("option");
	A.value = "-1";
	A.innerHTML = "---";
	A.disabled = true;
	B.appendChild(A);
	mapkv(function(F, E) {
		var D = document.createElement("option");
		D.value = E.name;
		D.innerHTML = E.name.escapeForDisplay();
		B.appendChild(D)
	}, locationMgr.locations_)
};
SearchManager.prototype.updateContacts = function() {
	var B = document.getElementById("search_shared");
	B.options.length = 0;
	var A = document.createElement("option");
	A.value = "-1";
	A.innerHTML = _T("INTERFACE_SEARCH_SHARED_WITH_DOESNT_MATTER");
	B.appendChild(A);
	A = document.createElement("option");
	A.value = "-2";
	A.innerHTML = _T("INTERFACE_SEARCH_SHARED_WITH_NO_ONE");
	B.appendChild(A);
	A = document.createElement("option");
	A.value = "-3";
	A.innerHTML = _T("INTERFACE_SEARCH_SHARED_WITH_SOMEONE");
	B.appendChild(A);
	A = document.createElement("option");
	A.value = "-1";
	A.innerHTML = "---";
	A.disabled = true;
	B.appendChild(A);
	map(function(E) {
		var D = document.createElement("option");
		D.value = stateMgr.contacts[E[0]].username;
		D.innerHTML = E[1];
		B.appendChild(D)
	}, contactList.list.entries)
};
SearchManager.prototype.updatePriority = function() {
	var B = document.getElementById("search_priority");
	B.options.length = 0;
	var A = document.createElement("option");
	A.value = "-1";
	A.innerHTML = _T("INTERFACE_SEARCH_PRIORITY_ANY");
	B.appendChild(A);
	A = document.createElement("option");
	A.value = "-1";
	A.innerHTML = "---";
	A.disabled = true;
	B.appendChild(A);
	map(function(E) {
		var D = document.createElement("option");
		D.value = E[0];
		D.innerHTML = E[1];
		B.appendChild(D)
	}, [ [ 1, _T("INTERFACE_SEARCH_PRIORITY_1") ],
			[ 2, _T("INTERFACE_SEARCH_PRIORITY_2") ],
			[ 3, _T("INTERFACE_SEARCH_PRIORITY_3") ],
			[ "N", _T("INTERFACE_SEARCH_PRIORITY_NONE") ] ])
};
SearchManager.prototype.updateStatus = function() {
	var B = document.getElementById("search_status");
	B.options.length = 0;
	var A = document.createElement("option");
	A.value = "-1";
	A.innerHTML = _T("INTERFACE_SEARCH_STATUS_ANY");
	B.appendChild(A);
	A = document.createElement("option");
	A.value = "-1";
	A.innerHTML = "---";
	A.disabled = true;
	B.appendChild(A);
	map(function(D) {
		var E = document.createElement("option");
		E.value = D[0];
		E.innerHTML = D[1];
		B.appendChild(E)
	}, [ [ "incomplete", _T("INTERFACE_SEARCH_STATUS_INCOMPLETE") ],
			[ "completed", _T("INTERFACE_SEARCH_STATUS_COMPLETED") ] ])
};
SearchManager.prototype.updateTimeEstimate = function() {
	var A = document.getElementById("search_estimatetype");
	A.options.length = 0;
	map(function(D) {
		var B = document.createElement("option");
		B.value = D[0];
		B.innerHTML = D[1];
		A.appendChild(B)
	}, [ [ 1, _T("INTERFACE_SEARCH_ESTIMATE_IS") ],
			[ 2, _T("INTERFACE_SEARCH_ESTIMATE_GREATER") ],
			[ 3, _T("INTERFACE_SEARCH_ESTIMATE_LESS") ] ])
};
SearchManager.prototype._armField = function(A) {
	A.onkeypress = function(B) {
		B || (B = window.event);
		var D = (B.charCode) ? B.charCode : ((B.which) ? B.which : B.keyCode);
		if (D == 27) {
			searchMgr.cancel.onclick()
		}
	};
	return A
};
SearchManager.prototype.clearOtherFields = function() {
	for ( var B in this.fieldMap) {
		if (view.getPublicMode() && B == "includeArchived") {
			continue
		}
		var A = this.fieldMap[B];
		if (A[0] == SearchManager.FIELD_TYPE_SELECT) {
			continue
		}
		var D = el(A[1]);
		if (A[0] == SearchManager.FIELD_TYPE_TEXT) {
			D.value = "";
			this._armField(D)
		} else {
			if (A[0] == SearchManager.FIELD_TYPE_CHECKBOX) {
				D.checked = false
			}
		}
	}
	this._armField(el("search_due_start")).value = "";
	this._armField(el("search_estimate")).value = ""
};
SearchManager.prototype.updateFields = function() {
	this.updateLists();
	if (!view.getPublicMode()) {
		this.updateContacts()
	}
	this.updatePriority();
	this.updateStatus();
	this.updateLocations();
	this.updateTimeEstimate();
	this.clearOtherFields()
};
function ServicesManager(D, A, B) {
	this.id = D;
	this.div = el(this.id);
	this.inited = false;
	this.mbn = "rtm.servicesmanager.";
	this.tableId = B;
	this.table = el(B);
	this.messageId = A;
	this.message = el(A);
	this.data = null;
	this.index = {};
	this.clear();
	this.apps = {}
}
ServicesManager.prototype.init = function() {
	this.message.style.display = "";
	this.table.style.display = "none"
};
ServicesManager.prototype.clear = function() {
	var A = this.table.tBodies[0];
	if (A) {
		while (A.childNodes.length > 0) {
			A.removeChild(A.firstChild)
		}
	}
};
ServicesManager.prototype.hasDataChanged = function(A) {
	if (A === null && this.data !== null) {
		return true
	}
	if (A !== null && this.data === null) {
		return true
	}
	if (A === null && this.data === null) {
		return false
	}
	if (this.data.length !== A.length) {
		return true
	}
	var B = A.length;
	var H, E;
	for ( var F = 0; F < B; F++) {
		H = A[F];
		if (!(H.token in this.index)) {
			return true
		}
		E = this.index[H.token];
		for ( var D in H) {
			if (H[D] !== E[D]) {
				return true
			}
		}
	}
	return false
};
ServicesManager.prototype.updateIndex = function() {
	this.index = {};
	var A = this.data ? this.data.length : 0;
	var D;
	for ( var B = 0; B < A; B++) {
		D = this.data[B];
		this.index[D.token] = D
	}
};
ServicesManager.prototype.setData = function(A) {
	if (this.hasDataChanged(A)) {
		this.data = A;
		this.updateIndex();
		this.update()
	}
};
ServicesManager.prototype.update = function() {
	if (this.data === null || this.data.length === 0) {
		this.table.style.display = "none";
		this.message.style.display = ""
	} else {
		var V = this;
		var M = [];
		var b;
		var I = Utility.getImageUrl("/img/ico/ico_check_blu.gif");
		var R = Utility.getImageUrl("/img/ico/ico_cross_org.gif");
		var X = fmt("Yes");
		var K = fmt("No");
		var Q, A, F;
		var J, U, W;
		this.apps = {};
		this.clear();
		var B = this.table.tBodies[0];
		for ( var Y = 0; Y < this.data.length; Y++) {
			b = this.data[Y];
			Q = A = F = R;
			J = U = W = K;
			if (b.perms == "read") {
				Q = I;
				J = X
			} else {
				if (b.perms == "write") {
					Q = I;
					J = X;
					A = I;
					U = X
				} else {
					if (b.perms == "delete") {
						Q = I;
						J = X;
						A = I;
						U = X;
						F = I;
						W = X
					}
				}
			}
			var H = B.insertRow(-1);
			var O = H.insertCell(-1);
			var Z = H.insertCell(-1);
			var E = H.insertCell(-1);
			var a = H.insertCell(-1);
			var D = H.insertCell(-1);
			O.innerHTML = "<a href=" + qtd(b.api_url) + ' target="_blank">'
					+ b.api_title + "</a>";
			Z.innerHTML = "<img src=" + qtd(Q) + ' width="14" height="14" alt='
					+ qtd(J) + " />";
			E.innerHTML = "<img src=" + qtd(A) + ' width="14" height="14" alt='
					+ qtd(U) + " />";
			a.innerHTML = "<img src=" + qtd(F) + ' width="14" height="14" alt='
					+ qtd(W) + " />";
			D.innerHTML = '<a href=" " title="'
					+ _T("INTERFACE_SETTINGS_SERVICES_REMOVE")
					+ '"><img style="padding-left: 3px;" src="'
					+ Utility.getImageUrl("/img/ico/ico_trash.gif") + '" alt="'
					+ _T("INTERFACE_SETTINGS_SERVICES_REMOVE") + '" title="'
					+ _T("INTERFACE_SETTINGS_SERVICES_REMOVE")
					+ '" height="11" width="11"></a>';
			Z.style.textAlign = E.style.textAlign = a.style.textAlign = "center";
			H.entry = b;
			D.firstChild.onclick = function() {
				if (Offline.isNotOnline()) {
					Offline.Dialog.showDisabledAction();
					return false
				}
				V.remove(this.tr);
				return false
			};
			D.firstChild.tr = H;
			this.apps[b.token] = b.api_title
		}
		this.message.style.display = "none";
		this.table.style.display = ""
	}
};
ServicesManager.prototype.remove = function(B) {
	var A = this.table.tBodies[0];
	A.removeChild(B);
	if (!A.rows || A.rows.length === 0) {
		this.table.style.display = "none";
		this.message.style.display = ""
	}
	transMgr.request("services.delete", utility.encodeJavaScript( {
		"token" : B.entry.token
	}))
};
ServicesManager.prototype.getApp = function(A) {
	return is(this.apps[A]) ? this.apps[A] : ""
};
function RadioGroup(A) {
	this.radios = [];
	this.inited = false;
	this.names = [];
	this.selected = null;
	this.defaultRadio = null;
	this.name = A;
	this.mbn = "rtm.radiogroups." + A + "."
}
RadioGroup.prototype.init = function() {
	this.inited = true
};
RadioGroup.prototype.addRadio = function(D, B) {
	B = el(B);
	this.radios.push(B);
	this.names.push(D);
	this[D] = B;
	var A = this;
	B.pos = this.radios.length - 1;
	B.onclick = function(F) {
		messageBus.broadcast(A, A.mbn + "radioSelected", this.pos)
	};
	var E = function(F, H) {
		A.handleRadioChecked(F, H)
	};
	messageBus.subscribe(E, this.mbn + "radioSelected")
};
RadioGroup.prototype.select = function(B, A) {
	this.radios[B].checked = true;
	this.selected = B;
	if (A) {
		this.defaultRadio = B
	}
	this.radios[B].onclick()
};
RadioGroup.prototype.enable = function() {
	for ( var A = 0; A < this.radios.length; A++) {
		this.radios[A].disabled = false
	}
};
RadioGroup.prototype.disable = function() {
	for ( var A = 0; A < this.radios.length; A++) {
		this.radios[A].disabled = true
	}
};
RadioGroup.prototype.handleRadioChecked = function(B, A) {
	this.selected = A
};
function Label(D, B) {
	this.labelId = D;
	this.label = el(D);
	this.inputId = B;
	this.input = el(B);
	if (is_safari) {
		if (typeof navigator !== "undefined"
				&& (/t\/5/i.test(navigator.userAgent))) {
			return 

		}
		var A = this;
		this.label.onclick = function() {
			if (A.input.type == "radio" || A.input.type == "checkbox") {
				A.input.checked = !A.input.checked;
				if (A.input.onclick) {
					A.input.onclick()
				}
			} else {
				if (A.input.type == "text" || A.input.type == "password") {
					A.input.focus()
				}
			}
		}
	}
}
function Button(A) {
	this.buttonId = A;
	this.button = el(this.buttonId);
	this.text = null;
	this.color = null
}
Button.COLORS = {
	"grey" : [ null, null, null, null, null ],
	"orange" : [ "roundbtn_org", "roundbtn1_org", "roundbtn2_org",
			"roundbtnwrap_org", "roundbtn_content_org" ],
	"blue" : [ "roundbtn_blu", "roundbtn1_blu", "roundbtn2_blu",
			"roundbtnwrap_blu", "roundbtn_content_blu" ]
};
Button.prototype.setText = function(A) {
	if (this.text != A) {
		this.text = A;
		this.blit()
	}
};
Button.prototype.setColor = function(A) {
	if (!A || !Button.COLORS[A]) {
		A = "grey"
	}
	if (this.color != A) {
		this.color = A;
		this.blit()
	}
};
Button.prototype.setClickFunction = function(B, A) {
	if (!this.button) {
		return false
	}
	this.button.onclick = function(D) {
		return B(D)
	};
	if (A) {
		this.button.className = "xtarget"
	} else {
		this.button.className = ""
	}
};
Button.prototype.blit = function() {
	if (!this.button) {
		return false
	}
	var A = this.color ? Button.COLORS[this.color] : Button.COLORS["grey"];
	var B = [];
	B.push('<div class="roundbtn ' + (A[0] || "") + '">');
	B.push('<b class="roundbtnwrap ' + (A[3] || "") + '">');
	B.push('<b class="roundbtn1 ' + (A[1] || "") + '"></b>');
	B.push('<b class="roundbtn2 ' + (A[2] || "") + '"></b>');
	B.push("</b>");
	B.push('<div class="roundbtn_content ' + (A[4] || "") + '">' + this.text
			+ "</div>");
	B.push('<b class="roundbtnwrap ' + (A[3] || "") + '">');
	B.push('<b class="roundbtn2 ' + (A[2] || "") + '"></b>');
	B.push('<b class="roundbtn1 ' + (A[1] || "") + '"></b>');
	B.push("</div>");
	this.button.innerHTML = B.join("");
	return true
};
function WhatsNew(B) {
	this.tableId = B;
	this.table = el(B);
	this.entries = {};
	this.labels = {};
	this.counts = {};
	this.mbn = "rtm.whatsnew.";
	this.viewDetails = {};
	if (!is_ie && (is_safari || !is_khtml)) {
		this.table.innerHTML = "<tbody></tbody>"
	} else {
		var A = this.table.tBodies[0];
		if (A) {
			while (A.childNodes.length > 0) {
				A.removeChild(A.firstChild)
			}
		}
	}
}
WhatsNew.prototype.addRow = function(D, B, A) {
	var I = this.table.insertRow(-1);
	var H = I.insertCell(-1);
	var F = I.insertCell(-1);
	I.className = "boxline";
	H.className = "box boxinactive";
	F.className = "boxdesc boxdescinactive";
	F.innerHTML = B;
	this.entries[D] = I;
	this.labels[D] = B;
	this.counts[D] = 0;
	this.viewDetails[D] = A;
	var E = this.table.insertRow(-1);
	E.className = "boxspacing";
	if (is_safari) {
		E.innerHTML = "<td>&nbsp;</td><td>&nbsp;</td>";
		E.style.height = "5px"
	}
};
WhatsNew.prototype.setCount = function(A, F) {
	var J = this.labels[A];
	var K = this.entries[A];
	var B = this.viewDetails[A];
	var I = K.cells[0];
	var H = K.cells[1];
	this.counts[A] = F;
	if (F == 0) {
		I.className = "box boxinactive";
		I.innerHTML = "&nbsp;";
		H.className = "boxdesc boxdescinactive";
		H.innerHTML = J
	} else {
		I.className = "box boxactive";
		H.className = "boxdesc";
		I.innerHTML = '<a href=" ">' + F + "</a>";
		H.innerHTML = '<a href=" ">' + J + "</a>";
		var D = K.getElementsByTagName("a");
		for ( var E = 0; E < D.length; E++) {
			D[E].viewDetails = B;
			D[E].onclick = function() {
				if (is(this.viewDetails)) {
					switch (this.viewDetails) {
					case "Inbox":
						listTabs.selectTabByPosition(0);
						view.selectView("Tasks");
						break;
					case "Contacts":
						contactsTabs
								.selectTab(_T("INTERFACE_CONTACTS_CONTACTS_TAB"));
						view.selectView("Contacts");
						break;
					case "Lists":
						settingsTabs
								.selectTab(_T("INTERFACE_SETTINGS_LISTS_TAB"));
						view.selectView("Settings");
						break
					}
				}
				return false
			}
		}
	}
};
WhatsNew.prototype.setData = function(B, D) {
	for ( var A in B) {
		if (is(this.entries[A])) {
			if (D) {
				this.setCount(A, B[A] + this.counts[A])
			} else {
				this.setCount(A, B[A])
			}
		}
	}
};
function NotificationManager(D, E) {
	this.tableId = D;
	this.list = new NotificationList(D);
	this.list.parent = this;
	this.adderId = E;
	this.adder = el(E);
	this.inited = false;
	this.mbn = null;
	this.notification = null;
	this.types = [ "---", "Email", "---", "AIM", "GaduGadu", "GoogleTalk",
			"ICQ", "Jabber", "MSN", "Skype", "Yahoo", "---", "Mobile" ];
	this.typeMap = {};
	this.imMap = {
		"aim" : "rtmremind",
		"gadugadu" : "2872848",
		"googletalk" : "rtmremind@gmail.com",
		"icq" : "304618909",
		"jabber" : "rtmremind@im.rmilk.com",
		"msn" : "remind@rememberthemilk.com",
		"skype" : "rtmremind",
		"yahoo" : "rtmremind"
	};
	this.mobileTypes = {
		"Select your network" : null,
		"Argentina" : {
			"CTI Movil" : "ar_movil",
			"Movistar" : "ar_movistar",
			"Personal" : "ar_personal"
		},
		"Brazil" : {
			"Claro" : "br_claro",
			"TIM" : "br_tim"
		},
		"Canada" : {
			"Bell Mobility" : "ca_bellmobility",
			"Fido" : "ca_fido",
			"Rogers Wireless" : "ca_rogers",
			"Sasktel Mobility" : "ca_sasktel",
			"Telus" : "ca_telus",
			"Virgin Mobile" : "ca_virgin"
		},
		"Czech Republic" : {
			"O2" : "cz_o2"
		},
		"France" : {
			"SFR" : "fr_sfr"
		},
		"Germany" : {
			"E-Plus" : "de_eplus",
			"O2" : "de_o2",
			"T-Mobile" : "de_tmobile",
			"T-Mobile (mobilcom)" : "de_mobilcom",
			"Vodafone" : "de_vodafone"
		},
		"Iceland" : {
			"OgVodafone" : "is_vodafone",
			"Síminn" : "is_siminn"
		},
		"Italy" : {
			"Vodafone" : "it_vodafone"
		},
		"Japan" : {
			"AU by KDDI" : "jp_kddi",
			"NTT DoCoMo" : "jp_docomo",
			"Vodafone/Softbank" : "jp_softbank",
			"Vodafone (Chuugoku/Western)" : "jp_vodafone_n",
			"Vodafone (Hokkaido)" : "jp_vodafone_d",
			"Vodafone (Hokuriko/Central North)" : "jp_vodafone_r",
			"Vodafone (Kansai/West, Osaka)" : "jp_vodafone_k",
			"Vodafone (Kanto/Koushin/East, Tokyo)" : "jp_vodafone_t",
			"Vodafone (Kyuushu/Okinawa)" : "jp_vodafone_q",
			"Vodafone (Shikoku)" : "jp_vodafone_s",
			"Vodafone (Touhoku/Niigata/North)" : "jp_vodafone_h",
			"Vodafone (Toukai/Central)" : "jp_vodafone_c",
			"Willcom" : "jp_willcom",
			"Willcom (di)" : "jp_willcom_di",
			"Willcom (dj)" : "jp_willcom_dj",
			"Willcom (dk)" : "jp_willcom_dk",
			"Willcom (wm)" : "jp_willcom_wm"
		},
		"Netherlands" : {
			"T-Mobile" : "nl_tmobile",
			"Vodafone" : "nl_vodafone"
		},
		"Pakistan" : {
			"Ufone" : "pk_ufone"
		},
		"Philippines" : {
			"Smart Communications" : "ph_smart"
		},
		"Poland" : {
			"Plus GSM" : "pl_plus"
		},
		"Singapore" : {
			"M1" : "sg_m1"
		},
		"South Africa" : {
			"Vodacom" : "za_vodacom"
		},
		"Spain" : {
			"Movistar" : "es_movistar",
			"Vodafone" : "es_vodafone"
		},
		"Sweden" : {
			"Tele2" : "se_tele2"
		},
		"United Kingdom" : {
			"O2" : "uk_o2",
			"T-Mobile" : "uk_tmobile"
		},
		"United States" : {
			"Alltel" : "us_alltel",
			"AT&T" : "us_cingular",
			"Boost Mobile" : "us_boost",
			"Cellular One" : "us_cellularone",
			"Cingular (formerly AT&T Wireless)" : "us_att",
			"Cricket Wireless" : "us_cricket",
			"Nextel" : "us_nextel",
			"Sprint PCS" : "us_sprint",
			"T-Mobile" : "us_tmobile",
			"US Cellular" : "us_cellular",
			"Verizon" : "us_verizon",
			"Virgin Mobile" : "us_virgin"
		}
	};
	this.mobileTypeMap = {
		"Select your network" : null,
		"Argentina" : "ar",
		"Brazil" : "br",
		"Canada" : "ca",
		"Czech Republic" : "cz",
		"France" : "fr",
		"Germany" : "de",
		"Hungary" : "hu",
		"Iceland" : "is",
		"Italy" : "it",
		"Japan" : "jp",
		"Pakistan" : "pk",
		"Philippines" : "ph",
		"Poland" : "pl",
		"Singapore" : "sg",
		"Spain" : "es",
		"Sweden" : "se",
		"United Kingdom" : "uk",
		"United States" : "us"
	};
	for ( var A = 0; A < this.types.length; A++) {
		this.typeMap[this.types[A].toLowerCase()] = A
	}
	this.mobileReverseMap = {};
	for ( var H in this.mobileTypes) {
		var F = this.mobileTypes[H];
		if (F === null) {
			continue
		}
		for ( var B in F) {
			this.mobileReverseMap[F[B]] = B
		}
	}
}
NotificationManager.prototype.init = function() {
	this.mbn = this.getUniqueMessageBusName();
	this.inited = true;
	this.list.init();
	this.list.show();
	this.setup()
};
NotificationManager.prototype.setup = function() {
	var A = this;
	this.adder.onclick = function(B) {
		if (Offline.isNotOnline()) {
			Offline.Dialog.showDisabledAction();
			return false
		}
		A.createEntry();
		return false
	}
};
NotificationManager.prototype.createEntry = function() {
	var B = hex_sha1(utility.getRandomInt(200483) + new Date().getTime());
	var A = [ B, null, "", false, null, null, true ];
	this.list.addEntry(A)
};
NotificationManager.prototype.getUniqueMessageBusName = function() {
	return "rtm.notification."
};
NotificationManager.prototype.setData = function(A) {
	this.notification = A;
	this.updateList()
};
NotificationManager.prototype.updateList = function() {
	this.list.setAdvise(true);
	for ( var B = 0; B < this.notification.length; B++) {
		var A = this.notification[B];
		var D = [ A["id"], A["ntype"], A["value"], A["state"], A["mtype"],
				A["mlimit"] ];
		this.list.conditionalAddOrReplaceEntry(D, true)
	}
	this.list.tableBlitRows();
	this.list.setAdvise(false);
	return true
};
NotificationManager.prototype.enable = function() {
	this.list.enable();
	Utility.removeClass(this.adder, "disabled")
};
NotificationManager.prototype.disable = function() {
	this.list.disable();
	Utility.addClass(this.adder, "disabled")
};
function StateManager() {
	this.tasks = {};
	this.lists = {};
	this.notes = {};
	this.groups = {};
	this.contacts = {};
	this.permissions = null;
	this.mbn = "rtm.statemanager.";
	this.currentList = null;
	this.currentFilter = null;
	this.currentType = TasksView.LIST_TYPE_NORMAL;
	this.filterObj = null;
	this.workingSet = [];
	this.tick = 0;
	this.lastLoadThreshold = 0;
	this.reduced = 0
}
StateManager.prototype.setCurrentList = function(A) {
	this.currentList = A
};
StateManager.prototype.setCurrentFilter = function(A) {
	this.currentFilter = A
};
StateManager.prototype.setCurrentType = function(A) {
	this.currentType = A
};
StateManager.prototype.getValidLists = function() {
	var D = [];
	for ( var A = 0; A < listTabs.entries.length; A++) {
		var B = listTabs.data[A];
		if (B[0] != TasksView.LIST_TYPE_NORMAL) {
			continue
		}
		D.push( [ B[1], stateMgr.lists[B[1]].name,
				stateMgr.lists[B[1]].position * 1 ])
	}
	return D
};
StateManager.prototype.getListsForMagicParse = function() {
	var A = {};
	var B;
	for ( var D in stateMgr.lists) {
		B = stateMgr.lists[D];
		if (!B.deleted && !B.archived && !B.queued && B.filter === null
				&& B.position * 1 < 1) {
			A["_" + B.name.toLowerCase()] = B.id
		}
	}
	return A
};
StateManager.prototype.getListForViewProps = function(D) {
	var E = configurationMgr.configuration.defaultList;
	var H = null;
	var B = {};
	var F;
	for ( var I in stateMgr.lists) {
		F = stateMgr.lists[I];
		if (!F.deleted && !F.archived && !F.queued && F.filter === null) {
			if (F.position == -1) {
				H = F.id
			}
			B[F.id] = 1
		}
	}
	var A = [ D, E, H ];
	var I = null;
	map(function(J) {
		if (I === null && J !== null && (J in B)) {
			I = J
		}
	}, A);
	return I * 1
};
StateManager.prototype.updateTask = function(E, A) {
	for ( var B in A) {
		stateMgr.tasks[E][B] = A[B]
	}
	var D = stateMgr.tasks[E];
	if (Offline.isReady()) {
		window.setTimeout(function() {
			Offline.Sync.updateTask(D);
			D = null
		}, 0)
	}
};
StateManager.prototype.updateList = function(E, A) {
	for ( var D in A) {
		stateMgr.lists[E][D] = A[D]
	}
	var B = stateMgr.lists[E];
	if (Offline.isReady()) {
		window.setTimeout(function() {
			Offline.Sync.updateList(B);
			B = null
		}, 0)
	}
};
StateManager.prototype.updateNote = function(E, A) {
	for ( var D in A) {
		stateMgr.notes[E][D] = A[D]
	}
	var B = stateMgr.notes[E];
	if (Offline.isReady()) {
		window.setTimeout(function() {
			Offline.Sync.updateNote(B);
			B = null
		}, 0)
	}
};
StateManager.prototype.updateContact = function(E, A) {
	for ( var D in A) {
		stateMgr.contacts[E][D] = A[D]
	}
	var B = stateMgr.contacts[E];
	if (Offline.isReady()) {
		window.setTimeout(function() {
			Offline.Sync.updateContact(B);
			B = null
		}, 0)
	}
};
StateManager.prototype.updateGroup = function(E, A) {
	for ( var B in A) {
		stateMgr.groups[E][B] = A[B]
	}
	var D = stateMgr.groups[E];
	if (Offline.isReady()) {
		window.setTimeout(function() {
			Offline.Sync.updateGroup(D);
			D = null
		}, 0)
	}
};
function Format(A) {
}
Format.FORMAT_HELP_LOCATION = "/help/answers/";
Format.prototype.formatTaskEstimate = function(A) {
	if (A == null) {
		A = _T("INTERFACE_TASKS_TASK_DETAILS_TIME_ESTIMATE_NONE")
	} else {
		A = A.trim();
		if (A.length == 0) {
			A = _T("INTERFACE_TASKS_TASK_DETAILS_TIME_ESTIMATE_NONE")
		}
	}
	tasksView.taskDetails.detailsDuration.setValue(A)
};
Format.prototype.formatNoteCountTemplate = function(B) {
	var A;
	if (B == 0) {
		A = "INTERFACE_TASKS_TASK_DETAILS_NOTES_COUNT_ZERO"
	} else {
		if (B == 1) {
			A = "INTERFACE_TASKS_TASK_DETAILS_NOTES_COUNT_ONE"
		} else {
			A = "INTERFACE_TASKS_TASK_DETAILS_NOTES_COUNT_NUM"
		}
	}
	tasksView.taskDetails.fieldsTitle.setCount(_T(A, {
		"NUM" : B
	}))
};
Format.prototype.formatNoteCount = function(A) {
	if (view.getViewToken("Tasks", "Notes")) {
		this.formatNoteCountTemplate(noteMgr.getNoteCount(A));
		tasksView.taskDetails.fieldsTitle.setEnabled(false);
		tasksView.taskDetails.fieldsTitle.blit()
	}
};
Format.prototype.getMultiEditFormat = function(E, F) {
	if (E.length === 0) {
		return fmt("No tasks selected.")
	}
	var B = stateMgr.tasks[E[0]][F];
	var H = true;
	for ( var D = 1, A = E.length; D < A; D++) {
		if (stateMgr.tasks[E[D]][F] !== B) {
			H = false;
			break
		}
	}
	return H ? B : [ null ]
};
Format.prototype.formatTask = function(b) {
	var p = stateMgr.tasks[b];
	if (!p) {
		return false
	}
	helpBox.stopShowing("tasks.publishing");
	helpBox.stopShowing("tasks.sharing");
	helpBox.stopShowing("tasks.save");
	var E = view.getViewToken("Tasks", "Tasks");
	var w = view.getViewToken("Tasks", "Notes");
	var Z = null;
	if (view.getMultiEditMode(true)) {
		Z = taskList.getViewList().getSelected()
	}
	tasksView.taskDetails.fieldsTitle.setEscape(false);
	if (E) {
		if (tasksView.taskDetails.fieldsTitle.state == Field.FIELD_STATE_DISPLAY) {
			tasksView.taskDetails.fieldsTitle.setCount(null);
			if (stateMgr.lists[p.list_id].position == TasksView.LIST_SENT) {
				tasksView.taskDetails.disable();
				tasksView.taskDetails.fieldsTitle.setEnabled(false)
			} else {
				if (view.getPublicMode()) {
					tasksView.taskDetails.disable();
					tasksView.taskDetails.fieldsTitle.setEnabled(false)
				} else {
					if (taskList.view == TaskList.TASK_LIST_VIEW_COMPLETED) {
						tasksView.taskDetails.disable()
					} else {
						tasksView.taskDetails.enable()
					}
					tasksView.taskDetails.fieldsTitle.setEnabled(true)
				}
			}
			tasksView.taskDetails.fieldsTitle.blit()
		}
	} else {
		if (w) {
			if (Z === null) {
				this.formatNoteCountTemplate(noteMgr.getNoteCount(p.series_id));
				tasksView.taskDetails.fieldsTitle.setValue(Control
						.safeWbrs(p.name), true)
			} else {
				var v = this.getMultiEditFormat(Z, "name");
				if (v instanceof Array && v[0] === null) {
					tasksView.taskDetails.fieldsTitle.setCount(null);
					tasksView.taskDetails.fieldsTitle.setFieldValue(
							"<Multiple>", true);
					tasksView.taskDetails.fieldsTitle.setValue("<Multiple>"
							.escapeForDisplay(), true)
				} else {
					if (Z !== null && Z.length > 1) {
						tasksView.taskDetails.fieldsTitle.setCount(null);
						tasksView.taskDetails.fieldsTitle.fieldValue = null;
						tasksView.taskDetails.fieldsTitle.setValue(Control
								.safeWbrs(p.name), true)
					} else {
						this.formatNoteCountTemplate(noteMgr
								.getNoteCount(p.series_id));
						tasksView.taskDetails.fieldsTitle.setValue(Control
								.safeWbrs(p.name), true)
					}
				}
			}
			tasksView.taskDetails.fieldsTitle.setEnabled(false);
			tasksView.taskDetails.fieldsTitle.blit();
			if (Z !== null && Z.length > 1) {
				noteMgr.showMultiEditMessage();
				noteMgr.setCurrentTask(null)
			} else {
				if (noteMgr.notesCount !== noteMgr.getNoteCount(p.series_id)
						|| p.series_id !== noteMgr.currentTask
						|| view.getInUndo()) {
					if (tasksView.inSentList()) {
						noteMgr.disable()
					} else {
						noteMgr.enable()
					}
					noteMgr.fillNotes(p.series_id, true);
					noteMgr.setCurrentTask(p.series_id)
				} else {
					noteMgr.setCurrentTask(p.series_id)
				}
			}
		}
	}
	el("listtoolbox").style.display = "none";
	if (!E) {
		return false
	}
	if (control.showAdded) {
		tasksView.taskDetails.detailsAdded.setValue(dateTimeMgr
				.getCachedIntlFormat(Intl.preferred_formats.due, p.date_added));
		tasksView.taskDetails.detailsAdded.show()
	} else {
		tasksView.taskDetails.detailsAdded.hide()
	}
	if (taskList.view == TaskList.TASK_LIST_VIEW_COMPLETED) {
		tasksView.taskDetails.fieldsTitle.setEnabled(false);
		tasksView.taskDetails.fieldsTitle.setValue(Control.safeWbrs(p.name),
				true);
		tasksView.taskDetails.detailsCompleted.setValue(dateTimeMgr
				.getCachedIntlFormat(Intl.preferred_formats.due,
						p.date_completed));
		var I = _T("INTERFACE_TASKS_TASK_DETAILS_DUE_NEVER");
		var m = _T("INTERFACE_TASKS_TASK_DETAILS_DUE_NEVER");
		if (p.date_due != null) {
			var A, O;
			if (p.time_due) {
				A = Intl.preferred_formats.due_time;
				O = Intl.preferred_formats.due_time_field
			} else {
				A = Intl.preferred_formats.due;
				O = Intl.preferred_formats.due_field
			}
			m = dateTimeMgr.getCachedIntlFormat(O, p.date_due);
			I = dateTimeMgr.getCachedIntlFormat(A, p.date_due)
		}
		tasksView.taskDetails.detailsDue.setFieldValue(m);
		tasksView.taskDetails.detailsDue.setValue(I)
	} else {
		if (view.getPublicMode()
				|| stateMgr.lists[p.list_id].position == TasksView.LIST_SENT) {
			tasksView.taskDetails.fieldsTitle.setEnabled(false)
		} else {
			tasksView.taskDetails.fieldsTitle.setEnabled(true)
		}
		var F = false;
		if (view.getMultiEditMode(true)) {
			var v = this.getMultiEditFormat(Z, "name");
			if (v instanceof Array && v[0] === null) {
				tasksView.taskDetails.fieldsTitle.setFieldValue("<Multiple>",
						true);
				tasksView.taskDetails.fieldsTitle.setValue("<Multiple>"
						.escapeForDisplay(), true);
				F = true
			}
		}
		if (F === false) {
			tasksView.taskDetails.fieldsTitle.fieldValue = null;
			tasksView.taskDetails.fieldsTitle.setFieldValue(p.name, true);
			tasksView.taskDetails.fieldsTitle.setValue(
					Control.safeWbrs(p.name), true)
		}
		var I = _T("INTERFACE_TASKS_TASK_DETAILS_DUE_NEVER");
		var m = _T("INTERFACE_TASKS_TASK_DETAILS_DUE_NEVER");
		var F = false;
		if (view.getMultiEditMode(true)) {
			var R = true;
			for ( var AB = 0; AB < Z.length; AB++) {
				var h = stateMgr.tasks[Z[AB]];
				if (h.date_due !== p.date_due || h.time_due !== p.time_due) {
					R = false;
					break
				}
			}
			if (R === false) {
				tasksView.taskDetails.detailsDue.setFieldValue("<Multiple>");
				tasksView.taskDetails.detailsDue.setValue("<Multiple>");
				F = true
			}
		}
		if (F === false) {
			if (p.date_due != null) {
				var A, O;
				if (p.time_due) {
					A = Intl.preferred_formats.due_time;
					O = Intl.preferred_formats.due_time_field
				} else {
					A = Intl.preferred_formats.due;
					O = Intl.preferred_formats.due_field
				}
				m = dateTimeMgr.getCachedIntlFormat(O, p.date_due);
				I = dateTimeMgr.getCachedIntlFormat(A, p.date_due)
			}
			tasksView.taskDetails.detailsDue.setFieldValue(m);
			tasksView.taskDetails.detailsDue.setValue(I)
		}
	}
	var z = "INTERFACE_TASKS_TASK_DETAILS_POSTPONED_ZERO";
	var q = p.postponed ? p.postponed * 1 : 0;
	if (q === 1) {
		z = "INTERFACE_TASKS_TASK_DETAILS_POSTPONED_ONE"
	} else {
		if (q > 1) {
			z = "INTERFACE_TASKS_TASK_DETAILS_POSTPONED_NUM"
		}
	}
	tasksView.taskDetails.detailsPostponed.setValue(_T(z, {
		"NUM" : q
	}));
	var F = false;
	if (view.getMultiEditMode(true)) {
		var v = this.getMultiEditFormat(Z, "estimate");
		if (v instanceof Array && v[0] === null) {
			this.formatTaskEstimate("<Multiple>");
			F = true
		}
	}
	if (F === false) {
		this.formatTaskEstimate(p.estimate)
	}
	var U = _T("INTERFACE_TASKS_TASK_DETAILS_SHARED_WITH_NO_ONE");
	var D = [];
	var X = {};
	var Q = false;
	if (p.participants != null) {
		U = [];
		var Y = _T("INTERFACE_TASKS_TASK_DETAILS_SHOW_CONTACT");
		var e = 0;
		for ( var AB = 0; AB < p.participants.length; AB++) {
			if (is(X[p.participants[AB].person_id])) {
				continue
			}
			if (p.participants[AB].is_shared === false) {
				Q = true
			}
			if (e > 0) {
				Q = false
			}
			e++;
			X[p.participants[AB].person_id] = true;
			var M = _T("INTERFACE_CONTACTS_CONTACT_FORMAT", {
				"CONTACT_FIRST_NAME" : p.participants[AB].person_first_name,
				"CONTACT_LAST_NAME" : p.participants[AB].person_last_name
			});
			U
					.push("<a title=" + quoted(Y) + ' id="contacts.members.'
							+ p.participants[AB].person_id + '" href=" ">' + M
							+ "</a>");
			D.push(p.participants[AB].person_id)
		}
		U = U.join(", ")
	}
	if (stateMgr.lists[p.list_id].position == TasksView.LIST_SENT) {
		tasksView.taskDetails.detailsShared
				.setTitle(_T("INTERFACE_TASKS_TASK_DETAILS_SENT_TO"))
	} else {
		if (Q) {
			tasksView.taskDetails.detailsShared
					.setTitle(_T("INTERFACE_TASKS_TASK_DETAILS_SENT_FROM"))
		} else {
			tasksView.taskDetails.detailsShared
					.setTitle(_T("INTERFACE_TASKS_TASK_DETAILS_SHARED_WITH"))
		}
	}
	if (!p.participants && p.source == "email"
			&& stateMgr.lists[p.list_id].position != TasksView.LIST_SENT) {
		tasksView.taskDetails.detailsShared
				.setTitle(_T("INTERFACE_TASKS_TASK_DETAILS_SENT_FROM"));
		tasksView.taskDetails.detailsShared.setValue(
				_T("INTERFACE_TASKS_TASK_DETAILS_SENT_FROM_EMAILED"), true)
	} else {
		if (!p.participants && p.source == "jott"
				&& stateMgr.lists[p.list_id].position != TasksView.LIST_SENT) {
			tasksView.taskDetails.detailsShared
					.setTitle(_T("INTERFACE_TASKS_TASK_DETAILS_SENT_FROM"));
			tasksView.taskDetails.detailsShared.setValue("Jott", true)
		} else {
			tasksView.taskDetails.detailsShared.setValue(U, true)
		}
	}
	if (D.length > 0) {
		var d = tasksView.taskDetails.detailsShared.div
				.getElementsByTagName("a");
		for ( var AB = 0; AB < d.length; AB++) {
			var AF = d[AB];
			AF.member = D[AB];
			if (AF.id.indexOf("contacts.members") > -1) {
				AF.onclick = function(a) {
					messageBus.broadcast(contactList, contactList.mbn
							+ "showContact", this.member);
					return false
				}
			}
		}
	}
	if (Z === null) {
		var V = noteMgr.getNoteCount(p.series_id);
		if (V > 0) {
			tasksView.taskDetails.detailsNotes.setValue('<a title="'
					+ _T("INTERFACE_TASKS_TASK_DETAILS_SHOW_NOTES")
					+ '" href=" " onclick="taskTabs.selectTab(\''
					+ _T("INTERFACE_TASKS_TASK_DETAILS_NOTES_TAB")
					+ "'); return false;\">" + V + "</a>", true)
		} else {
			tasksView.taskDetails.detailsNotes.setValue("0", true)
		}
	} else {
		noteMgr.prepareIndex();
		var v = is(noteMgr.index[p.series_id]) ? noteMgr.index[p.series_id].length
				: 0;
		if (Z.length === 1) {
			if (v > 0) {
				tasksView.taskDetails.detailsNotes.setValue('<a title="'
						+ _T("INTERFACE_TASKS_TASK_DETAILS_SHOW_NOTES")
						+ '" href=" " onclick="taskTabs.selectTab(\''
						+ _T("INTERFACE_TASKS_TASK_DETAILS_NOTES_TAB")
						+ "'); return false;\">" + v + "</a>", true)
			} else {
				tasksView.taskDetails.detailsNotes.setValue("0", true)
			}
		} else {
			var F = false;
			var R = true;
			var J, AD;
			for ( var AB = 0; AB < Z.length; AB++) {
				J = stateMgr.tasks[Z[AB]].series_id;
				if (!is(noteMgr.index[J])) {
					AD = 0
				} else {
					AD = noteMgr.index[J].length
				}
				if (AD !== v) {
					R = false;
					break
				}
			}
			if (R === false) {
				tasksView.taskDetails.detailsNotes.setValue("&lt;Multiple&gt;",
						true)
			} else {
				if (v > 0) {
					tasksView.taskDetails.detailsNotes.setValue('<a title="'
							+ _T("INTERFACE_TASKS_TASK_DETAILS_SHOW_NOTES")
							+ '" href=" " onclick="taskTabs.selectTab(\''
							+ _T("INTERFACE_TASKS_TASK_DETAILS_NOTES_TAB")
							+ "'); return false;\">" + v + "</a>", true)
				} else {
					tasksView.taskDetails.detailsNotes.setValue("0", true)
				}
			}
		}
	}
	var F = false;
	if (view.getMultiEditMode(true)) {
		var R = true;
		var H = 0;
		for ( var AB = 0; AB < Z.length; AB++) {
			var k = stateMgr.tasks[Z[AB]].reoccur;
			if ((p.reoccur === null && k !== null)
					|| (p.reoccur !== null && k === null)) {
				R = false;
				break
			} else {
				if (p.reoccur !== null && k !== null) {
					if ((p.reoccur[0] === null && k[0] !== null)
							|| (p.reoccur[0] !== null && k[0] === null)) {
						R = false;
						break
					} else {
						if (p.reoccur[0] !== null) {
							if (p.reoccur[0] !== k[0] || p.reoccur[1] !== k[1]) {
								R = false;
								break
							}
						}
					}
				}
			}
		}
		if (R === false) {
			tasksView.taskDetails.detailsReoccur.setValue("<Multiple>");
			tasksView.taskDetails.detailsReoccur.setFieldValue("<Multiple>");
			F = true
		}
	}
	if (F === false) {
		var u = p.reoccur && p.reoccur[0] ? reoccurMgr
				.convertReoccurrenceDesc(p.reoccur)
				: _T("INTERFACE_TASKS_TASK_DETAILS_REPEAT_NEVER");
		var K = p.reoccur && p.reoccur[0] ? reoccurMgr.convertReoccurrenceDesc(
				p.reoccur, true)
				: _T("INTERFACE_TASKS_TASK_DETAILS_REPEAT_NEVER");
		tasksView.taskDetails.detailsReoccur.setValue(u);
		tasksView.taskDetails.detailsReoccur.setFieldValue(K)
	}
	var W = [];
	var F = false;
	if (view.getMultiEditMode(true)) {
		var J = {};
		J[p.series_id] = true;
		var AE = tagMgr.getTagsForTaskSeries(p.series_id);
		var R = true;
		var AA = false;
		for ( var AB = 0, y = Z.length; (R === true && AB < y); AB++) {
			var h = stateMgr.tasks[Z[AB]];
			if (!is(J[h.series_id])) {
				J[h.series_id] = true;
				var AC = tagMgr.getTagsForTaskSeries(h.series_id);
				if (AC.length !== AE.length) {
					R = false;
					break
				}
				for ( var f = 0; f < AE.length; f++) {
					if (AE[f] !== AC[f]) {
						R = false;
						break
					}
				}
			}
		}
		if (R === false) {
			tasksView.taskDetails.detailsTags.setValue("<Multiple>"
					.escapeForDisplay(), true);
			tasksView.taskDetails.detailsTags.setFieldValue("<Multiple>", true);
			F = true
		} else {
			W = AE
		}
	} else {
		W = tagMgr.getTagsForTaskSeries(p.series_id)
	}
	if (F === false) {
		if (W.length == 0) {
			tasksView.taskDetails.detailsTags.setFieldValue("", true);
			tasksView.taskDetails.detailsTags
					.setValue(_T("INTERFACE_TASKS_TASK_DETAILS_TAGS_NONE"))
		} else {
			var B = [];
			for ( var AB = 0; AB < W.length; AB++) {
				var s = W[AB];
				var Y = _T("INTERFACE_TASKS_TASK_DETAILS_SHOW_LIST_FOR_TAG", {
					"TAG" : s
				});
				B
						.push("<a onclick=\"el('listFilter').value = 'tag:"
								+ s
								+ "'; control.updateListFilter(); return false;\" title="
								+ quoted(Y) + ' id="task.tags.' + s
								+ '" href="#section.tasks">' + s + "</a>")
			}
			tasksView.taskDetails.detailsTags.setFieldValue(W.join(", "), true);
			tasksView.taskDetails.detailsTags.setValue(B.join(", "))
		}
	}
	var F = false;
	if (view.getMultiEditMode(true)) {
		var v = this.getMultiEditFormat(Z, "url");
		if (v instanceof Array && v[0] === null) {
			tasksView.taskDetails.detailsURL.setFieldValue("<Multiple>", true);
			tasksView.taskDetails.detailsURL.setValue("<Multiple>"
					.escapeForDisplay(), true);
			F = true
		}
	}
	if (F === false) {
		tasksView.taskDetails.detailsURL.setFieldValue(p.url ? p.url
				: _T("INTERFACE_TASKS_TASK_DETAILS_URL_NONE"));
		tasksView.taskDetails.detailsURL.setValue(p.url ? p.url
				.escapeForDisplay().autoLink(true)
				: _T("INTERFACE_TASKS_TASK_DETAILS_URL_NONE"))
	}
	if (!view.getPublicMode()) {
		var F = false;
		if (view.getMultiEditMode(true)) {
			var R = true;
			var H = Z.length > 0 ? locationMgr.location_task_series_[stateMgr.tasks[Z[0]].series_id]
					: null;
			var J;
			for ( var AB = 0; AB < Z.length; AB++) {
				J = stateMgr.tasks[Z[AB]].series_id;
				if (locationMgr.location_task_series_[J] !== H) {
					R = false;
					break
				}
			}
			if (R === false) {
				tasksView.taskDetails.detailsLocation
						.setValue("&lt;Multiple&gt;");
				tasksView.taskDetails.detailsLocation
						.setFieldValue("<Multiple>");
				F = true
			}
		}
		if (F === false) {
			tasksView.taskDetails.detailsLocation.setFieldValue(locationMgr
					.getTaskLocation(p.series_id), true);
			tasksView.taskDetails.detailsLocation.setValue(locationMgr
					.getTaskLocationLink(p.series_id), true)
		}
	}
	if (stateMgr.currentType !== TasksView.LIST_TYPE_NORMAL) {
		var F = false;
		var o;
		if (view.getMultiEditMode(true)) {
			var v = this.getMultiEditFormat(Z, "list_id");
			if (v instanceof Array && v[0] === null) {
				o = "<Multiple>";
				F = true
			}
		}
		if (F === false) {
			o = stateMgr.lists[p.list_id].name
		}
		tasksView.taskDetails.detailsList.setValue(o.escapeForDisplay(), true)
	}
};
Format.prototype.getListStatistics = function(B) {
	var R, Q, H, E, D;
	R = Q = H = E = 0;
	D = [ 0, 0, 0, 0 ];
	var O = 0, V = 0;
	var F, U;
	F = U = 0;
	var M = [], I = [];
	for ( var J in stateMgr.tasks) {
		if (stateMgr.tasks[J] == null || stateMgr.tasks[J].list_id != B) {
			continue
		}
		var K = this.getListStatisticsTuple(J);
		R += K[0];
		Q += K[1];
		H += K[2];
		E += K[3];
		if (K[4]) {
			F += 1;
			I.push(J)
		} else {
			U += 1;
			M.push(J);
			var A = stateMgr.tasks[J].priority.charAt(1);
			if (A == "N") {
				A = 4
			} else {
				A = parseInt(A, 10)
			}
			D[A - 1]++;
			if (stateMgr.tasks[J].date_due) {
				O++;
				V += parseFloat(stateMgr.tasks[J].date_due)
			}
		}
	}
	return [ F, R, Q, H, E, U, [ M, I ], D, [ O, V ] ]
};
Format.prototype.getListStatisticsTuple = function(B) {
	var A = new Array(5);
	var D = stateMgr.tasks[B];
	if (D.duetoday) {
		A[0] = 1
	} else {
		A[0] = 0
	}
	if (D.duetomorrow) {
		A[1] = 1
	} else {
		A[1] = 0
	}
	if (D.overdue) {
		A[2] = 1
	} else {
		A[2] = 0
	}
	if (D.estimate) {
		A[3] = dateTimeMgr.parseTimeEstimate(D.estimate)
	} else {
		A[3] = 0
	}
	if (D.date_completed !== null) {
		A[4] = 1
	} else {
		A[4] = 0
	}
	return A
};
Format.prototype.getCurrentListStatistics = function() {
	var J, I, E, A;
	J = I = E = A = 0;
	var B = 0;
	var K = 0;
	for ( var D = 0; D < stateMgr.workingSet.length; D++) {
		var F = stateMgr.workingSet[D];
		if (!is(stateMgr.tasks[F])) {
			continue
		}
		var H = this.getListStatisticsTuple(F);
		if (H[4] !== 1) {
			J += H[0];
			I += H[1];
			E += H[2];
			A += H[3]
		}
		if (H[4] === 1) {
			B += 1
		} else {
			K += 1
		}
	}
	return [ B, J, I, E, A, K ]
};
Format.prototype.getPermissionsLinks = function(D) {
	var I = [];
	if (D === null) {
		return I
	}
	for ( var J in D) {
		var E = D[J];
		var A = "";
		var H = E[2] ? ' <span class="notecount">'
				+ _T("INTERFACE_TASKS_LIST_DETAILS_SHARE_PENDING") + "</span>"
				: "";
		if (E[1] === null && is(E[0]) && is(stateMgr.groups[E[0]])) {
			var F = "messageBus.broadcast(groupList, groupList.mbn + 'showGroup', "
					+ E[0] + "); return false;";
			A = '<a href=" " onclick=' + quoted(F) + ">"
					+ stateMgr.groups[E[0]].name
					+ '</a> <span class="notecount">'
					+ _T("INTERFACE_TASKS_LIST_DETAILS_SHARE_GROUP")
					+ "</span>";
			I.push(A)
		} else {
			if (is(E[1]) && is(stateMgr.contacts[E[1]])) {
				var F = "messageBus.broadcast(contactList, contactList.mbn + 'showContact', "
						+ E[1] + "); return false;";
				var B = _T("INTERFACE_CONTACTS_CONTACT_FORMAT", {
					"CONTACT_FIRST_NAME" : stateMgr.contacts[E[1]].firstname,
					"CONTACT_LAST_NAME" : stateMgr.contacts[E[1]].lastname
				});
				A = '<a href=" " onclick=' + quoted(F) + ">" + B + "</a>" + H;
				I.push(A)
			}
		}
	}
	return I
};
Format.prototype.formatSharedDetailsForList = function(J) {
	var H = stateMgr.permissions;
	var E = H ? H["share"] ? H["share"][J] ? H["share"][J] : null : null : null;
	var D = el("shareprivate");
	var B = el("sharecontact");
	var F = el("sharecontacts");
	var A = view.getViewToken("Tasks", "Share");
	if (A) {
		tasksView.taskDetails.fieldsTitle.setEnabled(false)
	}
	if (E === null || E.length === 0) {
		shareMgr.radiogroup.select(0, true);
		if (A) {
			tasksView.taskDetails.fieldsTitle
					.setCount(_T("INTERFACE_TASKS_LIST_DETAILS_SHARE_NOT_SHARED"));
			shareMgr.showMessage(stateMgr.lists[J].position != 0)
		}
		F.style.display = "none"
	} else {
		shareMgr.radiogroup.select(1, true);
		if (A) {
			tasksView.taskDetails.fieldsTitle
					.setCount(_T("INTERFACE_TASKS_LIST_DETAILS_SHARE_SHARED_WITH_CONTACTS"));
			shareMgr.showMessage(false)
		}
		var I = this.getPermissionsLinks(E);
		if (I.length > 0) {
			F.innerHTML = '<div class="sharingentry">'
					+ I.join('</div><div class="sharingentry">') + "</div>"
		} else {
			F.innerHTML = _T("INTERFACE_TASKS_LIST_DETAILS_PUBLISH_DELETED_CONTACTS")
		}
		F.style.display = ""
	}
	if (A) {
		tasksView.taskDetails.fieldsTitle.setEnabled(false);
		tasksView.taskDetails.fieldsTitle.setValue(stateMgr.lists[J].name
				.escapeForDisplay(), true)
	}
};
Format.prototype.formatSaveListDetailsForList = function(A) {
	if (view.getViewToken("Tasks", "Save")) {
		tasksView.taskDetails.fieldsTitle.setEnabled(false);
		tasksView.taskDetails.fieldsTitle.setCount(null);
		tasksView.taskDetails.fieldsTitle.setValue(
				_T("INTERFACE_TASKS_LIST_DETAILS_SEARCH_RESULTS"), true)
	}
};
Format.prototype.formatPublishDetailsForList = function(B) {
	var I = stateMgr.permissions;
	var K = I ? I["publish"] ? I["publish"][B] ? I["publish"][B] : null : null
			: null;
	var H = el("publishprivate");
	var M = el("publishcontact");
	var D = el("publishcontacts");
	var E = el("publishpublic");
	var J = el("publishurl");
	var A = view.getViewToken("Tasks", "Publish");
	if (A) {
		tasksView.taskDetails.fieldsTitle.setEnabled(false)
	}
	if (K === null || K.length === 0) {
		publishMgr.radiogroup.select(0, true);
		if (A) {
			tasksView.taskDetails.fieldsTitle
					.setCount(_T("INTERFACE_TASKS_LIST_DETAILS_PUBLISH_NOT_PUBLISHED"))
		}
		D.style.display = "none";
		J.innerHTML = "";
		J.style.display = "none"
	} else {
		if (K.length == 1 && K[0][0] == -1) {
			publishMgr.radiogroup.select(2, true);
			E.checked = true;
			if (A) {
				tasksView.taskDetails.fieldsTitle
						.setCount(_T("INTERFACE_TASKS_LIST_DETAILS_PUBLISH_PUBLIC_LIST"))
			}
			D.style.display = "none"
		} else {
			publishMgr.radiogroup.select(1, true);
			if (A) {
				tasksView.taskDetails.fieldsTitle
						.setCount(_T("INTERFACE_TASKS_LIST_DETAILS_PUBLISH_PUBLISHED_TO_CONTACTS"))
			}
			var F = this.getPermissionsLinks(K);
			if (F.length > 0) {
				D.innerHTML = '<div class="sharingentry">'
						+ F.join('</div><div class="sharingentry">') + "</div>"
			} else {
				D.innerHTML = '<div class="sharingentry">'
						+ _T("INTERFACE_TASKS_LIST_DETAILS_PUBLISH_DELETED_CONTACTS")
						+ "</div>"
			}
			D.style.display = ""
		}
		J.innerHTML = "<a href="
				+ quoted("/home/" + rtmUsername + "/" + stateMgr.currentList
						+ "/") + ">"
				+ _T("INTERFACE_TASKS_LIST_DETAILS_PUBLISH_LINK") + "</a>";
		J.style.display = ""
	}
	if (A) {
		tasksView.taskDetails.fieldsTitle.setValue(stateMgr.lists[B].name
				.escapeForDisplay(), true)
	}
};
Format.prototype.formatTaskStatisticsForList = function(U, E) {
	if (!view.getViewToken("Tasks")) {
		return false
	}
	if (view.getViewToken("Tasks", "List")) {
		tasksView.taskDetails.fieldsTitle.setCount(null);
		tasksView.taskDetails.fieldsTitle.setEnabled(false);
		tasksView.taskDetails.fieldsTitle.blit()
	}
	if (U === null) {
		if (view.getViewToken("Tasks", "List")) {
			var H = taskList.getViewList().entries.length;
			var b;
			if (H == 0) {
				b = "INTERFACE_TASKS_LIST_DETAILS_ZERO_TASKS"
			} else {
				if (H == 1) {
					b = "INTERFACE_TASKS_LIST_DETAILS_ONE_TASK"
				} else {
					b = "INTERFACE_TASKS_LIST_DETAILS_NUM_TASKS"
				}
			}
			tasksView.taskDetails.fieldsTitle.setCount(_T(b, {
				"NUM" : H
			}));
			tasksView.taskDetails.fieldsTitle.setValue(
					_T("INTERFACE_TASKS_LIST_DETAILS_SEARCH_RESULTS"), true)
		}
	} else {
		if (U == -1 || !stateMgr.lists[U]) {
			if (view.getViewToken("Tasks", "List")) {
				tasksView.taskDetails.fieldsTitle.setValue(
						_T("INTERFACE_TASKS_LIST_DETAILS_LOADING"), true)
			}
			return false
		}
	}
	if (E == true) {
		if (view.getViewToken("Tasks", "List")) {
			if (U === null) {
				tasksView.taskDetails.fieldsTitle
						.setCount(_T("INTERFACE_TASKS_LIST_DETAILS_SEARCHING"));
				tasksView.taskDetails.fieldsTitle.setValue(debracket(
						stateMgr.currentFilter).escapeForDisplay(), true)
			} else {
				tasksView.taskDetails.fieldsTitle
						.setCount(_T("INTERFACE_TASKS_LIST_DETAILS_LOADING"));
				tasksView.taskDetails.fieldsTitle.setValue(
						stateMgr.lists[U].name.escapeForDisplay(), true)
			}
		}
		return false
	}
	if (view.getViewToken("Tasks", "Share")) {
		el("listtoolbox").style.display = "none";
		helpBox.showHelpText("tasks.sharing");
		this.formatSharedDetailsForList(U);
		return false
	} else {
		if (view.getViewToken("Tasks", "Publish")) {
			el("listtoolbox").style.display = "none";
			helpBox.showHelpText("tasks.publishing");
			this.formatPublishDetailsForList(U);
			return false
		} else {
			if (view.getViewToken("Tasks", "Save")) {
				el("listtoolbox").style.display = "none";
				helpBox.showHelpText("tasks.save");
				this.formatSaveListDetailsForList(U);
				return false
			} else {
				helpBox.stopShowing("tasks.save");
				helpBox.stopShowing("tasks.publishing");
				helpBox.stopShowing("tasks.sharing")
			}
		}
	}
	if (stateMgr.currentType !== TasksView.LIST_TYPE_SEARCH) {
		if (taskList.view === TaskList.TASK_LIST_VIEW_INCOMPLETE) {
			var I = stateMgr.lists[U] ? (stateMgr.lists[U].token ? encodeURIComponent(stateMgr.lists[U].token)
					: null)
					: null;
			el("listtoolbox").style.display = "";
			var V = document.getElementById("printlista");
			V.href = "/print/" + rtmUsername + "/" + U + "/";
			var X = document.getElementById("icalendarlista");
			X.href = "webcal://" + rtmHostname + "/icalendar/" + rtmUsername
					+ "/" + U + "/";
			var D = document.getElementById("icalendareventslista");
			D.href = "webcal://" + rtmHostname + "/icalendar/" + rtmUsername
					+ "/" + U + "/events/";
			var J = document.getElementById("atomlista");
			J.href = "/atom/" + rtmUsername + "/" + U + "/";
			if (I) {
				X.href = X.href + "?tok=" + I;
				D.href = D.href + "?tok=" + I;
				J.href = J.href + "?tok=" + I
			}
			var a = document.getElementById("permalist");
			var M = document.getElementById("permalista");
			if (!(view.getPublicMode() || is(publishMgr.publicLists[U]))) {
				a.style.visibility = "hidden"
			} else {
				a.style.visibility = "visible"
			}
			el("exportlist").style.display = "";
			el("exportlistevents").style.display = "";
			el("exportlist").style.visibility = "visible";
			el("exportlistevents").style.visibility = "visible";
			el("atomlist").style.visibility = "visible";
			el("permalist").style.display = "";
			M.href = "/home/" + rtmUsername + "/" + U + "/"
		} else {
			el("listtoolbox").style.display = "";
			el("exportlist").style.display = "none";
			el("exportlistevents").style.display = "none";
			el("permalist").style.display = "none";
			var V = document.getElementById("printlista");
			V.href = "/print/" + rtmUsername + "/" + U + "/completed/";
			var I = stateMgr.lists[U] ? (stateMgr.lists[U].token ? encodeURIComponent(stateMgr.lists[U].token)
					: null)
					: null;
			var J = document.getElementById("atomlista");
			J.href = "/atom/" + rtmUsername + "/" + U + "/completed/";
			if (I) {
				J.href = J.href + "?tok=" + I
			}
		}
	} else {
		el("exportlist").style.visibility = "hidden";
		el("exportlistevents").style.visibility = "hidden";
		el("atomlist").style.visibility = "hidden";
		el("permalist").style.display = "none";
		el("listtoolbox").style.display = "";
		var V = document.getElementById("printlista");
		var R = "/print/" + rtmUsername + "/-/?filter="
				+ encodeURIComponent(stateMgr.currentFilter);
		if (taskList.view === TaskList.TASK_LIST_VIEW_COMPLETED) {
			R += "&mode=completed"
		}
		V.href = R
	}
	if (view.getViewToken("Tasks", "List")) {
		var H = taskList.getViewList().entries.length;
		var b;
		if (H == 0) {
			b = "INTERFACE_TASKS_LIST_DETAILS_ZERO_TASKS"
		} else {
			if (H == 1) {
				b = "INTERFACE_TASKS_LIST_DETAILS_ONE_TASK"
			} else {
				b = "INTERFACE_TASKS_LIST_DETAILS_NUM_TASKS"
			}
		}
		tasksView.taskDetails.fieldsTitle.setCount(_T(b, {
			"NUM" : H
		}));
		if (U !== null) {
			tasksView.taskDetails.fieldsTitle.setValue(stateMgr.lists[U].name
					.escapeForDisplay(), true)
		}
	}
	var A = el("listsearchfor");
	var W = el("listcompleted");
	var O = el("listduetoday");
	var B = el("listduetomorrow");
	var K = el("listoverdue");
	var F = el("listestimatedtime");
	if (stateMgr.currentType === TasksView.LIST_TYPE_NORMAL) {
		A.style.display = "none"
	} else {
		A.innerHTML = _T("INTERFACE_TASKS_LIST_DETAILS_SEARCHED_FOR", {
			"CRITERIA" : debracket(stateMgr.currentFilter)
		});
		A.style.paddingBottom = "8px";
		A.style.display = ""
	}
	var H, b;
	var Z = this.getCurrentListStatistics();
	if (Z[0] == 0 && taskList.view === TaskList.TASK_LIST_VIEW_INCOMPLETE) {
		W.innerHTML = _T("INTERFACE_TASKS_LIST_DETAILS_ZERO_COMPLETED")
	} else {
		var Q, Y;
		if (taskList.view == TaskList.TASK_LIST_VIEW_INCOMPLETE) {
			H = Z[0];
			b = H == 0 ? "INTERFACE_TASKS_LIST_DETAILS_ZERO_COMPLETED"
					: "INTERFACE_TASKS_LIST_DETAILS_NUM_COMPLETED";
			Y = _T(b, {
				"NUM" : H
			});
			Q = '<a href=" " title='
					+ quoted(_T("INTERFACE_TASKS_LIST_DETAILS_SHOW_COMPLETED"))
					+ ' onclick="taskList.switchView(TaskList.TASK_LIST_VIEW_COMPLETED); return false;">'
					+ Y + "</a>"
		} else {
			H = Z[5];
			b = H == 0 ? "INTERFACE_TASKS_LIST_DETAILS_ZERO_INCOMPLETE"
					: "INTERFACE_TASKS_LIST_DETAILS_NUM_INCOMPLETE";
			Y = _T(b, {
				"NUM" : H
			});
			Q = '<a href=" " title='
					+ quoted(_T("INTERFACE_TASKS_LIST_DETAILS_SHOW_INCOMPLETE"))
					+ ' onclick="taskList.switchView(TaskList.TASK_LIST_VIEW_INCOMPLETE); return false;">'
					+ Y + "</a>"
		}
		W.innerHTML = Q
	}
	H = Z[1];
	b = Z[1] == 0 ? "INTERFACE_TASKS_LIST_DETAILS_ZERO_DUE_TODAY"
			: "INTERFACE_TASKS_LIST_DETAILS_NUM_DUE_TODAY";
	O.innerHTML = _T(b, {
		"NUM" : H
	});
	H = Z[2];
	b = Z[2] == 0 ? "INTERFACE_TASKS_LIST_DETAILS_ZERO_DUE_TOMORROW"
			: "INTERFACE_TASKS_LIST_DETAILS_NUM_DUE_TOMORROW";
	B.innerHTML = _T(b, {
		"NUM" : H
	});
	H = Z[3];
	b = Z[3] == 0 ? "INTERFACE_TASKS_LIST_DETAILS_ZERO_OVERDUE"
			: "INTERFACE_TASKS_LIST_DETAILS_NUM_OVERDUE";
	K.innerHTML = _T(b, {
		"NUM" : H
	});
	if (Z[4]) {
		F.innerHTML = _T("INTERFACE_TASKS_LIST_DETAILS_TIME_ESTIMATE", {
			"TIME" : dateTimeMgr.formatTimeEstimate(Z[4])
		})
	} else {
		F.innerHTML = ""
	}
};
Format.prototype.formatContact = function(A) {
	var J = stateMgr.contacts[A];
	if (J == null) {
		return null
	}
	if (view.getViewToken("Contacts", "Contacts")) {
		contactsView.contactDetails.fieldsTitle.setEnabled(false);
		contactsView.contactDetails.fieldsTitle.blit();
		contactsView.contactDetails.fieldsTitle.setValue(this
				.formatContactName(A))
	}
	var M = _T("INTERFACE_CONTACTS_CONTACT_VIEW_TASKS_SHARED", {
		"CONTACT_FIRST_NAME" : J.firstname
	});
	var I = '<a href=" " title='
			+ quoted(M)
			+ " onclick="
			+ quoted("control.updateListFilter('(sharedWith:" + J.username
					+ ")'); return false;") + ">" + M + "</a>";
	contactsView.contactDetails.contactUsername.setValue(J.username);
	el("contactsearch").innerHTML = I;
	var Q = [];
	for ( var H in stateMgr.groups) {
		var E = stateMgr.groups[H];
		if (E.members != null) {
			for ( var F = 0; F < E.members.length; F++) {
				if (E.members[F].contact_id == A) {
					Q.push( [ E.id, E.name ]);
					break
				}
			}
		}
	}
	var D = [];
	var B = [];
	for ( var F = 0; F < Q.length; F++) {
		D.push('<a id="contact.groups.' + Q[F][0] + '" href=" ">' + Q[F][1]
				+ "</a>");
		B.push(Q[F][0])
	}
	if (D.length > 0) {
		D = D.join(", ")
	} else {
		D = _T("INTERFACE_CONTACTS_CONTACT_GROUPS_NONE")
	}
	contactsView.contactDetails.contactGroups.setValue(D, true);
	if (B.length > 0) {
		var O = contactsView.contactDetails.contactGroups.div
				.getElementsByTagName("a");
		for ( var F = 0; F < O.length; F++) {
			var K = O[F];
			K.group = B[F];
			if (K.id.indexOf("contact.groups.") > -1) {
				K.onclick = function(R) {
					messageBus.broadcast(groupList,
							groupList.mbn + "showGroup", this.group);
					return false
				}
			}
		}
	}
	contactsView.contactDetails.show()
};
Format.prototype.formatContactStatistics = function() {
	if (view.getViewToken("Contacts", "Contacts")) {
		var B = contactList.list.entries.length;
		var A = "INTERFACE_CONTACTS_CONTACTS_ZERO";
		if (B === 1) {
			A = "INTERFACE_CONTACTS_CONTACTS_ONE"
		} else {
			if (B > 1) {
				A = "INTERFACE_CONTACTS_CONTACTS_NUM"
			}
		}
		contactsView.contactDetails.fieldsTitle.setValue(_T(A, {
			"NUM" : B
		}), true)
	}
	contactsView.contactDetails.hide();
	if (view.getViewToken("Contacts", "Contacts")) {
		contactsView.contactDetails.fieldsTitle.show()
	}
};
Format.prototype.formatGroup = function(A) {
	var H = stateMgr.groups[A];
	if (!H) {
		return false
	}
	if (view.getViewToken("Contacts", "Groups")) {
		var I = groupList.list.entries.length;
		var J = "INTERFACE_CONTACTS_GROUPS_ZERO";
		if (I === 1) {
			J = "INTERFACE_CONTACTS_GROUPS_ONE"
		} else {
			if (I > 1) {
				J = "INTERFACE_CONTACTS_GROUPS_NUM"
			}
		}
		contactsView.groupDetails.fieldsTitle.setValue(_T(J, {
			"NUM" : I
		}))
	}
	if (!H.members) {
		H.members = []
	}
	if (view.getViewToken("Contacts", "Groups")) {
		var Q = 0;
		for ( var E = 0; E < H.members.length; E++) {
			var B = H.members[E].contact_id;
			var K = stateMgr.contacts[B];
			if (K) {
				Q++
			}
		}
		var J = "INTERFACE_CONTACTS_GROUPS_MEMBERS_ZERO";
		if (Q === 1) {
			J = "INTERFACE_CONTACTS_GROUPS_MEMBERS_ONE"
		} else {
			if (Q > 1) {
				J = "INTERFACE_CONTACTS_GROUPS_MEMBERS_NUM"
			}
		}
		contactsView.groupDetails.fieldsTitle.setCount(_T(J, {
			"NUM" : Q
		}));
		contactsView.groupDetails.fieldsTitle.setValue(H.name
				.escapeForDisplay())
	}
	var D = [];
	var M = [];
	if (H.members.length > 0) {
		for ( var E = 0; E < H.members.length; E++) {
			var B = H.members[E].contact_id;
			var K = stateMgr.contacts[B];
			if (K) {
				var F = this.formatContactName(B);
				D.push('<a id="contacts.members.' + B + '" href=" ">' + F
						+ "</a>");
				M.push(B)
			}
		}
		D = D.join(", ")
	} else {
		D = _T("INTERFACE_CONTACTS_CONTACT_GROUPS_NONE")
	}
	contactsView.groupDetails.groupMembers.setValue(D, true);
	if (M.length > 0) {
		var R = contactsView.groupDetails.groupMembers.div
				.getElementsByTagName("a");
		for ( var E = 0; E < R.length; E++) {
			var O = R[E];
			O.member = M[E];
			if (O.id.indexOf("contacts.members") > -1) {
				O.onclick = function(U) {
					messageBus.broadcast(contactList, contactList.mbn
							+ "showContact", this.member);
					return false
				}
			}
		}
	}
	contactsView.groupDetails.show()
};
Format.prototype.formatGroupStatistics = function(D) {
	if (view.getViewToken("Contacts", "Groups")) {
		var B = groupList.list.entries.length;
		var A = "INTERFACE_CONTACTS_GROUPS_ZERO";
		if (B === 1) {
			A = "INTERFACE_CONTACTS_GROUPS_ONE"
		} else {
			if (B > 1) {
				A = "INTERFACE_CONTACTS_GROUPS_NUM"
			}
		}
		contactsView.groupDetails.fieldsTitle.setCount(null);
		contactsView.groupDetails.fieldsTitle.setValue(_T(A, {
			"NUM" : B
		}), true)
	}
	contactsView.groupDetails.hide();
	if (view.getViewToken("Contacts", "Groups")) {
		contactsView.groupDetails.fieldsTitle.show()
	}
};
Format.prototype.formatList = function(A) {
	var B = stateMgr.lists[A];
	if (B === null) {
		B = stateMgr.pendingLists[A]
	}
	var E = view.getViewToken("Settings", "Lists");
	if (E) {
		if (B.queued || B.locked || Offline.isNotOnline()) {
			settingsView.listDetails.fieldsTitle.setEnabled(false)
		} else {
			settingsView.listDetails.fieldsTitle.setEnabled(true)
		}
		settingsView.listDetails.fieldsTitle.setValue(
				B.name.escapeForDisplay(), true)
	}
	var F = this.getListStatistics(A);
	var J;
	var I = F[0] + F[5];
	if (I == 0) {
		J = "INTERFACE_TASKS_LIST_DETAILS_ZERO_TASKS"
	} else {
		if (I == 1) {
			J = "INTERFACE_TASKS_LIST_DETAILS_ONE_TASK"
		} else {
			J = "INTERFACE_TASKS_LIST_DETAILS_NUM_TASKS"
		}
	}
	settingsView.listDetails.taskCount.setValue(
			'<span class="fieldcount" style="font-weight: bold;">(' + _T(J, {
				"NUM" : I
			}) + ")</span>", true);
	if (F[0] == 0) {
		J = "INTERFACE_TASKS_LIST_DETAILS_ZERO_COMPLETED"
	} else {
		J = "INTERFACE_TASKS_LIST_DETAILS_NUM_COMPLETED"
	}
	settingsView.listDetails.listCompleted.setValue(_T(J, {
		"NUM" : F[0]
	}), !!E);
	if (F[5] == 0) {
		J = "INTERFACE_TASKS_LIST_DETAILS_ZERO_INCOMPLETE"
	} else {
		J = "INTERFACE_TASKS_LIST_DETAILS_NUM_INCOMPLETE"
	}
	settingsView.listDetails.listIncomplete.setValue(_T(J, {
		"NUM" : F[5]
	}), !!E);
	settingsView.listDetails.listFilter.setHidden(true);
	settingsView.listDetails.listFilter.hide();
	var K = [];
	if (A === configurationMgr.configuration.defaultList) {
		K.push(_T("INTERFACE_SETTINGS_LISTS_LIST_DEFAULT"))
	}
	settingsView.listDetails.taskCount.setHidden(true);
	settingsView.listDetails.taskCount.hide();
	if (B.queued) {
		var Q = [];
		Q.push(_T("INTERFACE_SETTINGS_LIST_PENDING"));
		var J;
		if (stateMgr.contacts[B.from] == null) {
			J = "INTERFACE_SETTINGS_LIST_SENT_BY_NOT_CONTACT"
		} else {
			J = "INTERFACE_SETTINGS_LIST_SENT_BY_CONTACT"
		}
		Q.push(_T(J, {
			"CONTACT_FIRST_NAME" : B.from_first_name,
			"CONTACT_LAST_NAME" : B.from_last_name
		}));
		Q.push('<span style="text-align: center;"><input type="submit" value="'
				+ _T("INTERFACE_SETTINGS_LIST_ACCEPT")
				+ '" /> <input type="submit" value="'
				+ _T("INTERFACE_SETTINGS_LIST_REJECT") + '" /></span>');
		settingsView.listDetails.listPending.setHidden(false);
		settingsView.listDetails.listPending.setEscape(false);
		settingsView.listDetails.listPending.setValue(Q.join("<br /><br />"));
		settingsView.listDetails.listPending.show();
		var H = settingsView.listDetails.listPending.div
				.getElementsByTagName("input");
		H[0].onclick = function(R) {
			messageBus.broadcast(listList, listList.mbn + "acceptList", A);
			return false
		};
		H[1].onclick = function(R) {
			messageBus.broadcast(listList, listList.mbn + "rejectList", A);
			return false
		}
	} else {
		if (B.locked) {
			K.push(_T("INTERFACE_SETTINGS_LISTS_LIST_LOCKED"))
		}
		settingsView.listDetails.listPending.setHidden(true);
		settingsView.listDetails.listPending.hide();
		settingsView.listDetails.listDescription.setHidden(true);
		settingsView.listDetails.listDescription.hide()
	}
	if (B.filter !== null) {
		K.push(_T("INTERFACE_SETTINGS_LISTS_SMART_LIST"));
		settingsView.listDetails.listCompleted.setHidden(true);
		settingsView.listDetails.listCompleted.hide();
		settingsView.listDetails.listIncomplete.setHidden(true);
		settingsView.listDetails.listIncomplete.hide();
		settingsView.listDetails.listFilter.setHidden(false);
		settingsView.listDetails.listFilter.setValue(debracket(B.filter), true);
		settingsView.listDetails.listFilter.show();
		el("settingslistbreak").style.display = "none"
	} else {
		settingsView.listDetails.taskCount.setHidden(false);
		settingsView.listDetails.taskCount.show();
		settingsView.listDetails.listCompleted.setHidden(false);
		settingsView.listDetails.listCompleted.show();
		settingsView.listDetails.listIncomplete.setHidden(false);
		settingsView.listDetails.listIncomplete.show();
		if (rtmHasMilkSync && configurationMgr.configuration["sync_which"]
				&& !B.queue && B.position < 1) {
			if (K.length > 0) {
				K.push("")
			}
			if (!stateMgr.lists[A].syncable) {
				K.push(_TF( [ "INTERFACE_SYNC_LIST_NOT_INCLUDED", "#", false ],
						{
							"LINK_ONCLICK" : "Control.syncList(" + A
									+ ", true); return false;"
						}))
			} else {
				K.push(_TF( [ "INTERFACE_SYNC_LIST_INCLUDED", "#", false ], {
					"LINK_ONCLICK" : "Control.syncList(" + A
							+ ", false); return false;"
				}))
			}
		}
		el("settingslistbreak").style.display = ""
	}
	if (B.archived) {
		K.push(_TF( [ "INTERFACE_SETTINGS_LISTS_ARCHIVED", " ", false ], {
			"LINK_ID" : "lists.unarchive." + A
		}))
	}
	if (K.length > 0) {
		settingsView.listDetails.listPending.hide();
		settingsView.listDetails.listDescription.setEscape(false);
		settingsView.listDetails.listDescription.setHidden(false);
		settingsView.listDetails.listDescription.setValue(K.join("<br />"),
				true);
		settingsView.listDetails.listDescription.show();
		var O = settingsView.listDetails.listDescription.div
				.getElementsByTagName("a");
		for ( var D = 0; D < O.length; D++) {
			var M = O[D];
			if (M.id.indexOf("lists.unarchive") > -1) {
				M.onclick = function(R) {
					messageBus.broadcast(listList, listList.mbn
							+ "unarchiveList", A);
					return false
				}
			}
		}
	} else {
		el("settingslistbreak").style.display = "none";
		settingsView.listDetails.listDescription.setHidden(true);
		settingsView.listDetails.listDescription.hide()
	}
	if (E) {
		settingsView.listDetails.show()
	} else {
		settingsView.listDetails.hide()
	}
};
Format.prototype.formatListStatistics = function(A) {
	if (view.getViewToken("Settings", "Lists")) {
		settingsView.listDetails.taskCount.hide();
		settingsView.listDetails.fieldsTitle.setEnabled(false);
		settingsView.listDetails.fieldsTitle.setValue(_T(
				"INTERFACE_SETTINGS_LISTS_NUM_LISTS", {
					"NUM" : listList.list.entries.length
				}), true)
	}
	settingsView.listDetails.hide();
	if (view.getViewToken("Settings", "Lists")) {
		settingsView.listDetails.fieldsTitle.show()
	}
};
Format.prototype.formatContactName = function(B) {
	var A = stateMgr.contacts[B];
	if (!A) {
		return null
	}
	return _T("INTERFACE_CONTACTS_CONTACT_FORMAT", {
		"CONTACT_FIRST_NAME" : A.firstname,
		"CONTACT_LAST_NAME" : A.lastname
	}).escapeForDisplay()
};
Format.prototype.formatLearnMore = function(D, B, E) {
	var A = E || "Learn more";
	return "<a href="
			+ quoted(Format.FORMAT_HELP_LOCATION + D + "/" + B + ".rtm")
			+ ' target="_blank">' + A + "</a>"
};
Format.prototype.formatInvites = function() {
	if (view.getViewToken("Contacts", "Invites")) {
		contactsView.contactDetails.hide();
		contactsView.contactDetails.fieldsTitle.setEnabled(false);
		contactsView.contactDetails.fieldsTitle.setCount(null);
		contactsView.contactDetails.fieldsTitle.setValue(
				_T("INTERFACE_CONTACTS_INVITES_TAB"), true);
		contactsView.contactDetails.fieldsTitle.show()
	}
};
Format.prototype.formatGeneralSettings = function() {
	if (view.getViewToken("Settings", "General")) {
		settingsView.listDetails.hide();
		settingsView.listDetails.fieldsTitle.setEnabled(false);
		settingsView.listDetails.fieldsTitle.setCount(null);
		settingsView.listDetails.fieldsTitle.setValue(
				_T("INTERFACE_SETTINGS_GENERAL_DESCRIPTION"), true);
		settingsView.listDetails.fieldsTitle.show()
	}
};
Format.prototype.formatReminderSettings = function() {
	if (view.getViewToken("Settings", "Reminders")) {
		settingsView.listDetails.hide();
		settingsView.listDetails.fieldsTitle.setEnabled(false);
		settingsView.listDetails.fieldsTitle.setCount(null);
		settingsView.listDetails.fieldsTitle.setValue(
				_T("INTERFACE_SETTINGS_REMINDERS_DESCRIPTION"), true);
		settingsView.listDetails.fieldsTitle.show()
	}
};
Format.prototype.formatServicesSettings = function() {
	if (view.getViewToken("Settings", "Services")) {
		settingsView.listDetails.hide();
		settingsView.listDetails.fieldsTitle.setEnabled(false);
		settingsView.listDetails.fieldsTitle.setCount(null);
		settingsView.listDetails.fieldsTitle.setValue(
				_T("INTERFACE_SETTINGS_SERVICES_TAB"), true);
		settingsView.listDetails.fieldsTitle.show()
	}
};
Format.prototype.formatSyncSettings = function() {
	if (view.getViewToken("Settings", "Sync")) {
		settingsView.listDetails.hide();
		settingsView.listDetails.fieldsTitle.setEnabled(false);
		settingsView.listDetails.fieldsTitle.setCount(null);
		settingsView.listDetails.fieldsTitle.setValue(
				_T("INTERFACE_SYNC_TITLE"), true);
		settingsView.listDetails.fieldsTitle.show()
	}
};
Format.prototype.formatInfoSettings = function() {
	if (view.getViewToken("Settings", "Info")) {
		settingsView.listDetails.hide();
		settingsView.listDetails.fieldsTitle.setEnabled(false);
		settingsView.listDetails.fieldsTitle.setCount(null);
		settingsView.listDetails.fieldsTitle.setValue(
				_T("INTERFACE_SETTINGS_INFO_DESCRIPTION"), true);
		settingsView.listDetails.fieldsTitle.show()
	}
};
Format.prototype.formatContactList = function(D) {
	var B = [];
	for ( var A = 0; A < D.length; A++) {
		var E = this.formatContactName(D[A]);
		if (E === null) {
			continue
		}
		B.push(E)
	}
	return B
};
Format.prototype.formatContactString = function(D) {
	var B;
	if (D.length === 0) {
		return ""
	}
	if (D.length == 1) {
		B = this.formatContactName(D[0])
	} else {
		var A = this.formatContactList(D);
		B = A.join(", ")
	}
	return B
};
Format.prototype.formatParticipantsString = function(A) {
	var E = {};
	var D = [];
	for ( var B = 0; B < A.length; B++) {
		if (is(E[A[B].person_id])) {
			continue
		}
		E[A[B].person_id] = true;
		D.push(A[B].person_id)
	}
	return D.length > 0 ? this.formatContactString(D) : ""
};
Format.prototype.formatLocationStatistics = function(D) {
	if (view.getViewToken("Settings", "Locations")) {
		settingsView.locationDetails.fieldsTitle.setEnabled(false);
		var B = "INTERFACE_SETTINGS_LOCATIONS_ZERO_LOCATIONS";
		var A = locationList.list.entries.length;
		if (A === 1) {
			B = "INTERFACE_SETTINGS_LOCATIONS_ONE_LOCATION"
		} else {
			if (A > 1) {
				B = "INTERFACE_SETTINGS_LOCATIONS_NUM_LOCATIONS"
			}
		}
		settingsView.locationDetails.taskCount.setHidden(true);
		settingsView.locationDetails.taskCount.hide();
		settingsView.locationDetails.fieldsTitle.setValue(_T(B, {
			"NUM" : locationList.list.entries.length
		}), true)
	}
	settingsView.locationDetails.hide();
	if (view.getViewToken("Settings", "Locations")) {
		settingsView.locationDetails.fieldsTitle.show()
	}
};
Format.prototype.formatLocation = function(H) {
	var A = locationMgr.locations_[H];
	if (A === null) {
		return false
	}
	if (view.getViewToken("Settings", "Locations")) {
		if (Offline.isNotOnline()) {
			settingsView.locationDetails.fieldsTitle.setEnabled(false)
		} else {
			settingsView.locationDetails.fieldsTitle.setEnabled(true)
		}
		var E = (H in locationList.data_ ? locationList.data_[H] : [ 0, 0 ]);
		var F = E[0] + E[1];
		if (F == 0) {
			B = "INTERFACE_TASKS_LIST_DETAILS_ZERO_TASKS"
		} else {
			if (F == 1) {
				B = "INTERFACE_TASKS_LIST_DETAILS_ONE_TASK"
			} else {
				B = "INTERFACE_TASKS_LIST_DETAILS_NUM_TASKS"
			}
		}
		settingsView.locationDetails.taskCount.setHidden(false);
		settingsView.locationDetails.taskCount.setValue(
				'<span class="fieldcount" style="font-weight: bold;">('
						+ _T(B, {
							"NUM" : F
						}) + ")</span>", true);
		settingsView.locationDetails.taskCount.show();
		settingsView.locationDetails.fieldsTitle.setValue(A.name
				.escapeForDisplay(), true);
		var B;
		if (E[1] === 0) {
			B = "INTERFACE_TASKS_LIST_DETAILS_ZERO_COMPLETED"
		} else {
			B = "INTERFACE_TASKS_LIST_DETAILS_NUM_COMPLETED"
		}
		settingsView.locationDetails.listCompleted.setValue(_T(B, {
			"NUM" : E[1]
		}), true);
		if (E[0] === 0) {
			B = "INTERFACE_TASKS_LIST_DETAILS_ZERO_INCOMPLETE"
		} else {
			B = "INTERFACE_TASKS_LIST_DETAILS_NUM_INCOMPLETE"
		}
		settingsView.locationDetails.listIncomplete.setValue(_T(B, {
			"NUM" : E[0]
		}), true);
		settingsView.locationDetails.listCompleted.setHidden(false);
		settingsView.locationDetails.listCompleted.show();
		settingsView.locationDetails.listIncomplete.setHidden(false);
		settingsView.locationDetails.listIncomplete.show();
		var D = [];
		if (H === configurationMgr.configuration.defaultLocation) {
			D.push(_T("INTERFACE_SETTINGS_LOCATIONS_LOCATION_DEFAULT"))
		}
		if (A.address) {
			D.push(_T("INTERFACE_SETTINGS_LOCATIONS_ADDRESS", {
				"LOCATION_ADDRESS" : A.address
			}))
		}
		if (D.length > 0) {
			settingsView.locationDetails.locationDescription.setEscape(false);
			settingsView.locationDetails.locationDescription.setHidden(false);
			settingsView.locationDetails.locationDescription.setValue(D
					.join("<br />"), true);
			settingsView.locationDetails.locationDescription.show();
			settingsView.locationDetails.show()
		} else {
			settingsView.locationDetails.locationDescription.setHidden(true);
			settingsView.locationDetails.locationDescription.hide();
			settingsView.locationDetails.show()
		}
	}
	return true
};
Format.prototype.formatTagStatistics = function(D) {
	if (view.getViewToken("Settings", "Tags")) {
		settingsView.tagDetails.taskCount.setHidden(true);
		settingsView.tagDetails.taskCount.hide();
		settingsView.tagDetails.fieldsTitle.setEnabled(false);
		var B = tagList.list.entries.length;
		var A = "INTERFACE_TAGS_NUM";
		if (B === 0) {
			A = "INTERFACE_TAGS_ZERO"
		} else {
			if (B === 1) {
				A = "INTERFACE_TAGS_ONE"
			}
		}
		settingsView.tagDetails.fieldsTitle.setValue(_T(A, {
			"NUM" : tagList.list.entries.length
		}), true)
	}
	settingsView.tagDetails.hide();
	if (view.getViewToken("Settings", "Tags")) {
		settingsView.tagDetails.fieldsTitle.show()
	}
};
Format.prototype.formatTag = function(F) {
	if (!(F in tagList.data_)) {
		return null
	}
	var B = tagList.data_[F];
	var E = view.getViewToken("Settings", "Tags");
	if (E) {
		var D = B[0] + B[1];
		var A;
		if (D == 0) {
			A = "INTERFACE_TASKS_LIST_DETAILS_ZERO_TASKS"
		} else {
			if (D == 1) {
				A = "INTERFACE_TASKS_LIST_DETAILS_ONE_TASK"
			} else {
				A = "INTERFACE_TASKS_LIST_DETAILS_NUM_TASKS"
			}
		}
		settingsView.tagDetails.taskCount.setValue(
				'<span class="fieldcount" style="font-weight: bold;">('
						+ _T(A, {
							"NUM" : D
						}) + ")</span>", true);
		if (Offline.isNotOnline()) {
			settingsView.tagDetails.fieldsTitle.setEnabled(false)
		} else {
			settingsView.tagDetails.fieldsTitle.setEnabled(true)
		}
		settingsView.tagDetails.fieldsTitle
				.setValue(F.escapeForDisplay(), true)
	}
	var A;
	if (B[1] === 0) {
		A = "INTERFACE_TASKS_LIST_DETAILS_ZERO_COMPLETED"
	} else {
		A = "INTERFACE_TASKS_LIST_DETAILS_NUM_COMPLETED"
	}
	settingsView.tagDetails.listCompleted.setValue(_T(A, {
		"NUM" : B[1]
	}), !!E);
	if (B[0] === 0) {
		A = "INTERFACE_TASKS_LIST_DETAILS_ZERO_INCOMPLETE"
	} else {
		A = "INTERFACE_TASKS_LIST_DETAILS_NUM_INCOMPLETE"
	}
	settingsView.tagDetails.listIncomplete.setValue(_T(A, {
		"NUM" : B[0]
	}), !!E);
	settingsView.tagDetails.taskCount.setHidden(false);
	settingsView.tagDetails.taskCount.show();
	settingsView.tagDetails.listCompleted.setHidden(false);
	settingsView.tagDetails.listCompleted.show();
	settingsView.tagDetails.listIncomplete.setHidden(false);
	settingsView.tagDetails.listIncomplete.show();
	if (E) {
		settingsView.tagDetails.show()
	} else {
		settingsView.tagDetails.hide()
	}
};
function StatusBox(B, D, A) {
	this.boxId = B;
	this.textId = D;
	this.buttonsId = A;
	this.box = el(B);
	this.text = el(D);
	this.buttons = el(A);
	this.timeout = null;
	this.currentText = null;
	this.undoId = this.boxId + "Undo";
	this.undo = null;
	this.undoTimeout = null;
	this.sharing = false;
	this.locating = false;
	this.inited = false;
	this.visible = false
}
StatusBox.prototype.init = function() {
	this.inited = true;
	this.mbn = this.getUniqueMessageBusName();
	messageBus.subscribe(this.setText, this.mbn + "setText")
};
StatusBox.prototype.getUniqueMessageBusName = function() {
	return "rtm.statusbox." + this.boxId + "."
};
StatusBox.prototype.setText = function(E, A, D) {
	var B = [];
	this.clearStatusTimeout();
	this.currentText = E;
	if (A && Offline.isReady() && !Offline.isOnline()) {
		A = false
	}
	B.push("<span>" + E + "</span>");
	if (A) {
		B.push('<span id="' + this.undoId + '">'
				+ _TF( [ "INTERFACE_STATUS_UNDO", "", false ], {
					"LINK_ONCLICK" : "statusBox.undoClicked(); return false;"
				}) + "</span>")
	}
	if (this.sharing) {
		this.buttons.style.display = "";
		D = false
	} else {
		this.buttons.style.display = "none"
	}
	this.text.innerHTML = B.join(" ");
	if (D) {
		this.setStatusTimeout(A)
	}
	if (A) {
		this.undo = el(this.undoId)
	}
	this.show()
};
StatusBox.prototype.show = function() {
	this.box.style.visibility = "visible";
	this.visible = true
};
StatusBox.prototype.hide = function() {
	this.box.style.visibility = "hidden";
	this.visible = false;
	this.clearStatusTimeout();
	this.undo = null
};
StatusBox.prototype.setStatusTimeout = function(A) {
	var B = this;
	var E = function() {
		B.hide()
	};
	var D = !A ? (10 * 1000) : (30 * 1000);
	this.timeoutSetAt = new Date().getTime();
	this.timeout = setTimeout(E, D)
};
StatusBox.prototype.clearStatusTimeout = function() {
	if (this.timeout) {
		clearTimeout(this.timeout);
		if (this.timeoutSetAt) {
			var A = (new Date().getTime() - this.timeoutSetAt) / 1000;
			this.timeoutSetAt = null
		} else {
		}
		this.timeout = null
	}
};
StatusBox.prototype.undoSetText = function(A) {
	if (!this.undo) {
		this.setText(this.currentText, true, true)
	}
	this.undo.innerHTML = A
};
StatusBox.prototype.undoFailed = function() {
	this.undoClearTimeout();
	this.clearStatusTimeout();
	this.undoSetText(_TF(
			[ "INTERFACE_STATUS_UNDO_FAILED_TRY_AGAIN", "", false ], {
				"LINK_ONCLICK" : "statusBox.undoClicked(); return false;"
			}));
	this.setStatusTimeout(true)
};
StatusBox.prototype.undoSuccess = function() {
	this.undoClearTimeout();
	this.undoSetText(_T("INTERFACE_STATUS_UNDO_OK"));
	this.setStatusTimeout(false)
};
StatusBox.prototype.undoSetTimeout = function() {
	var B = this;
	var A = function() {
		B.undoFailed()
	};
	this.undoTimeout = setTimeout(A, 10 * 1000)
};
StatusBox.prototype.undoClearTimeout = function() {
	if (this.undoTimeout) {
		clearTimeout(this.undoTimeout);
		this.undoTimeout = null
	}
};
StatusBox.prototype.undoClicked = function() {
	var B = this.undo.id || 0;
	var A = undoMgr.undoTransaction(B);
	if (A == true) {
		this.undoSetTimeout();
		this.undoSetText(_T("INTERFACE_STATUS_UNDOING"))
	} else {
		this.undoSetText(_T("INTERFACE_STATUS_UNDO_FAILED"))
	}
};
StatusBox.prototype.sharingSetText = function(F, A) {
	var M;
	if (view.shareMode !== null) {
		if (view.shareMode == Control.SHARE_TASK_SHARE) {
			var E = taskList.getViewList().getSelected();
			if (E === null || E.length == 0) {
				return false
			}
			var I;
			I = F ? "INTERFACE_SHARING_TASK_WITH_DONE"
					: "INTERFACE_SHARING_TASK_WITH";
			if (E.length > 1) {
				I = F ? "INTERFACE_SHARING_NUM_TASKS_WITH_DONE"
						: "INTERFACE_SHARING_NUM_TASKS_WITH"
			}
			if (A && A[1].length > 0) {
				var K = A[0];
				var D = A[1];
				var H = A[2];
				var B = format.formatContactString(D);
				var J = null;
				if (H && H.length > 0) {
					J = format.formatContactString(H)
				}
				if (!(D.length === 0 || D.length === H.length)) {
					F = false
				}
				var I;
				if (E.length === 1) {
					if (F === true) {
						I = "INTERFACE_SHARING_TASK_WITH_SUCCESS"
					} else {
						I = "INTERFACE_SHARING_TASK_WITH_FAILED"
					}
				} else {
					if (F === true) {
						I = "INTERFACE_SHARING_NUM_TASKS_WITH_SUCCESS"
					} else {
						I = "INTERFACE_SHARING_NUM_TASKS_WITH_FAILED"
					}
				}
				M = _T(I, {
					"TASK_NAME" : Control.safeWbrs(stateMgr.tasks[E[0]].name),
					"TASK_NUM" : E.length,
					"SUCCESS_CONTACTS" : J,
					"FAILED_CONTACTS" : B
				})
			} else {
				M = _T(I, {
					"TASK_NAME" : Control.safeWbrs(stateMgr.tasks[E[0]].name),
					"TASK_NUM" : E.length
				})
			}
		} else {
			if (view.shareMode == Control.SHARE_TASK_SEND) {
				var E = taskList.getViewList().getSelected();
				if (E === null || E.length == 0) {
					return false
				}
				var I;
				I = F ? "INTERFACE_SENDING_TASK_TO_DONE"
						: "INTERFACE_SENDING_TASK_TO";
				if (E.length > 1) {
					I = F ? "INTERFACE_SENDING_NUM_TASK_TO_DONE"
							: "INTERFACE_SENDING_NUM_TASK_TO"
				}
				if (A && A[1].length > 0) {
					var K = A[0];
					var D = A[1];
					var H = A[2];
					var B = format.formatContactString(D);
					var J = null;
					if (H && H.length > 0) {
						J = format.formatContactString(H)
					}
					if (!(D.length === 0 || D.length === H.length)) {
						B = format.formatContactString(D);
						F = false
					}
					var I;
					if (E.length === 1) {
						if (F === true) {
							I = "INTERFACE_SENDING_TASK_TO_DONE_WITH_SUCCESS"
						} else {
							I = "INTERFACE_SENDING_TASK_TO_DONE_WITH_FAILED"
						}
					} else {
						if (F === true) {
							I = "INTERFACE_SENDING_NUM_TASK_TO_DONE_SUCCESS"
						} else {
							I = "INTERFACE_SENDING_NUM_TASK_TO_DONE_FAILED"
						}
					}
					M = _T(I, {
						"TASK_NAME" : Control
								.safeWbrs(stateMgr.tasks[E[0]].name),
						"TASK_NUM" : E.length,
						"SUCCESS_CONTACTS" : J,
						"FAILED_CONTACTS" : B
					})
				} else {
					M = _T(I, {
						"TASK_NAME" : Control
								.safeWbrs(stateMgr.tasks[E[0]].name),
						"TASK_NUM" : E.length
					})
				}
			} else {
				if (view.shareMode == Control.SHARE_LIST_SHARE) {
					M = _T("INTERFACE_SHARING_X_WITH", {
						"LIST_NAME" : stateMgr.lists[stateMgr.currentList].name
								.escapeForDisplay()
					})
				} else {
					if (view.shareMode == Control.PUBLISH_LIST_PUBLISH) {
						M = _T(
								"INTERFACE_PUBLISHING_X_TO",
								{
									"LIST_NAME" : stateMgr.lists[stateMgr.currentList].name
											.escapeForDisplay()
								})
					}
				}
			}
		}
		this.setText(M, false, true);
		return true
	}
};
StatusBox.prototype.sharingEnableDone = function(D) {
	var B = this;
	switch (view.shareMode) {
	case Control.SHARE_TASK_SHARE:
	case Control.SHARE_LIST_SHARE:
		tasksView.statusDoneButton
				.setText(_T("INTERFACE_TASKS_LIST_DETAILS_SHARE"));
		break;
	case Control.SHARE_TASK_SEND:
		tasksView.statusDoneButton.setText(_T("INTERFACE_BUTTON_SEND"));
		break;
	case Control.PUBLISH_LIST_PUBLISH:
		tasksView.statusDoneButton
				.setText(_T("INTERFACE_TASKS_LIST_DETAILS_PUBLISH_PUBLISH_BUTTON"));
		break;
	default:
		tasksView.statusDoneButton.setText("Done");
		break
	}
	if (!D) {
		tasksView.statusDoneButton.setColor("grey");
		tasksView.statusDoneButton.setClickFunction(function() {
		}, false)
	} else {
		tasksView.statusDoneButton.setColor("blue");
		var A = function(E) {
			messageBus.broadcast(B, B.mbn + "buttonClicked", "Done")
		};
		tasksView.statusDoneButton.setClickFunction(A, true)
	}
};
StatusBox.prototype.sharingEnableCancel = function() {
	var B = this;
	tasksView.statusCancelButton
			.setText(_T("INTERFACE_TASKS_NOTES_CANCEL_BUTTON"));
	tasksView.statusCancelButton.setColor("orange");
	var A = function(D) {
		messageBus.broadcast(B, B.mbn + "buttonClicked", "Cancel")
	};
	tasksView.statusCancelButton.setClickFunction(A, true)
};
StatusBox.prototype.sharingStart = function() {
	this.sharing = true;
	this.sharingEnableDone(false);
	this.sharingEnableCancel()
};
StatusBox.prototype.sharingStop = function() {
	this.sharing = false;
	this.hide()
};
StatusBox.prototype.retryClicked = function(B) {
	var A = el("requestTryAgain");
	A.innerHTML = _T("INTERFACE_TRYING");
	transMgr.retryRequest(B);
	this.setStatusTimeout(false)
};
StatusBox.prototype.locationStart = function() {
	this.locating = true;
	this.setText(_TF( [ "INTERFACE_LOCATIONS_CLICK_DESIRED", "", false ], {
		"LINK_ONCLICK" : "locationMgr.handleEscape(); return false;"
	}), false, true)
};
StatusBox.prototype.locationStop = function() {
	this.locating = false;
	this.hide()
};
function TagManager() {
	this.index = {};
	this.invertedIndex = {};
	this.tagIndex = null
}
TagManager.prototype.setIndex = function(A) {
	this.index = A
};
TagManager.prototype.updateInvertedIndex = function() {
	for ( var A in this.index) {
		for ( var B = 0; B < this.index[A].length; B++) {
			var D = this.index[A][B];
			if (!is(this.invertedIndex[D])) {
				this.invertedIndex[D] = {}
			}
			this.invertedIndex[D][A] = true
		}
	}
};
TagManager.prototype.getTagsForTaskSeries = function(D) {
	if (!(D in this.invertedIndex)) {
		return []
	}
	var B = [];
	for ( var A in this.invertedIndex[D]) {
		if (is(this.invertedIndex[D][A])) {
			B.push(A)
		}
	}
	B.sort();
	return B
};
TagManager.prototype.getTagsForTaskSeriesX = function(D) {
	if (this.tagIndex) {
		return (D in this.tagIndex) ? this.tagIndex[D] : null
	}
	if (!(D in this.invertedIndex)) {
		return null
	}
	var B = [];
	for ( var A in this.invertedIndex[D]) {
		if (this.invertedIndex[D][A]) {
			B.push(A)
		}
	}
	if (B.length === 0) {
		return null
	}
	B.sort();
	return B
};
TagManager.prototype.prepareTagIndex = function() {
	this.tagIndex = {};
	for ( var D in this.invertedIndex) {
		var B = [];
		for ( var A in this.invertedIndex[D]) {
			if (this.invertedIndex[D][A]) {
				B.push(A)
			}
		}
		if (B.length > 0) {
			B.sort();
			this.tagIndex[D] = B
		}
	}
};
TagManager.prototype.clearTagIndex = function() {
	this.tagIndex = null
};
TagManager.prototype.updateTaskSeries = function(J, B) {
	var F = B[0];
	var K = B[1];
	var H = B[2];
	for ( var E = 0; E < J.length; E++) {
		var I = J[E];
		for ( var D = 0; D < H.length; D++) {
			if (!is(this.invertedIndex[I])) {
				this.invertedIndex[I] = {}
			}
			if (is(this.invertedIndex[I][H[D]])) {
				this.invertedIndex[I][H[D]] = null
			}
			if (is(this.index[H[D]])) {
				this.index[H[D]].spliceAll(I);
				if (this.index[H[D]].length == 0) {
					this.index[H[D]] = null
				}
			}
		}
		for ( var A = 0; A < K.length; A++) {
			if (!is(this.invertedIndex[I])) {
				this.invertedIndex[I] = {}
			}
			this.invertedIndex[I][K[A]] = true;
			if (!is(this.index[K[A]])) {
				this.index[K[A]] = []
			} else {
				this.index[K[A]].spliceAll(I)
			}
			this.index[K[A]].push(I)
		}
		if (Offline.isReady()) {
			Offline.Sync.updateTag(I, this.getTagsForTaskSeries(I))
		}
	}
};
TagManager.prototype.clearTagsForTaskSeries = function(B) {
	var A = this;
	map(function(E) {
		if (!is(A.invertedIndex[E])) {
			return false
		}
		for ( var D in A.invertedIndex[E]) {
			if (is(A.index[D])) {
				A.index[D].spliceAll(E);
				if (A.index[D].length == 0) {
					A.index[D] = null
				}
			}
		}
		A.invertedIndex[E] = null;
		if (Offline.isReady()) {
			Offline.Sync.updateTag(E, [])
		}
	}, B instanceof Array ? B : [ B ])
};
TagManager.prototype.updateTags = function(B) {
	var A = this;
	mapkv(function(E, D) {
		A.clearTagsForTaskSeries(E);
		A.invertedIndex[E] = {};
		map(function(F) {
			A.invertedIndex[E][F] = true;
			if (!is(A.index[F])) {
				A.index[F] = []
			}
			A.index[F].push(E)
		}, D);
		if (Offline.isReady()) {
			Offline.Sync.updateTag(E, D)
		}
	}, B)
};
function TransactionManager() {
	this.inTxn = false;
	this.rtmPath = "/rtm.rtm";
	this.r = null;
	this.inRpc = false;
	this.SSO = null;
	this.DM = 1;
	this.timeline = null;
	this.loadSpec = null;
	this.queue = [];
	this.getMap = {
		"lists.load" : true,
		"rtm.preload" : true,
		"rtm.public.preload" : true,
		"lists.public.load" : true
	};
	this.noneMap = {
		"tasks.complete" : true,
		"tasks.uncomplete" : true,
		"tasks.postpone" : true,
		"lists.delete" : true,
		"lists.archive" : true,
		"lists.unarchive" : true
	};
	this.noneChangedMap = {
		"tasks.setPriority" : false
	};
	this.completedMap = {
		"tasks.uncomplete" : false,
		"tasks.delete" : false
	};
	this.offlineMap = {
		"offline.sync" : 1,
		"auth.setTimezone" : 1,
		"offline.ping" : 1
	}
}
TransactionManager.REQUEST_TIMEOUT = 30;
TransactionManager.prototype.setSingleSignOn = function(A) {
	this.SSO = hex_sha1(A)
};
TransactionManager.prototype.setTimeline = function(A) {
	setCookie("TIMELINE", A, null, "/", null, null)
};
TransactionManager.prototype.setLoadInformation = function(A) {
	this.loadSpec = A;
	if (parseFloat(this.loadSpec[1]) > 10) {
		messageBus.broadcast(this, this.mbn + "loadThreshold")
	}
};
TransactionManager.prototype.setDistributionMultiplier = function(A) {
	this.DM = A;
	return this.DM
};
TransactionManager.prototype.getDistributionMultiplier = function() {
	return this.DM
};
TransactionManager.prototype.createXMLHTTPRequest = function() {
	return new XMLHttpRequest()
};
TransactionManager.prototype.getRandomInt = function(A) {
	return Math.floor(A * Math.random())
};
TransactionManager.prototype.requestFailed = function(D) {
	var A = this.queue[D];
	if (!A) {
		return true
	}
	if (A[0] === "offline.ping") {
		clearTimeout(A[3]);
		A[3] = null;
		if (Offline.isReady() && Offline.isUpdating()) {
			this.handleError(D, true)
		} else {
			if (A[4] === true) {
				Offline.onPingFailure(true, true)
			}
		}
		this.shortenQueue();
		return true
	}
	clearTimeout(A[3]);
	A[3] = null;
	if (!A[4] && statusBox) {
		var B = _TF( [ "INTERFACE_STATUS_FAILED_AGAIN", "", false ],
				{
					"REQUEST_NAME" : A[0],
					"LINK_ONCLICK" : "statusBox.retryClicked(" + D
							+ "); return false;",
					"LINK_WRAP" : "requestTryAgain"
				});
		statusBox.setText(B);
		if (A[0] === "tasks.add") {
			SmartAdd.getInstance().onAddFailure(null)
		}
	}
};
TransactionManager.prototype.clearTimeout = function(A) {
	if (this.queue[A]) {
		clearTimeout(this.queue[A][3]);
		this.queue[A][3] = null
	}
};
TransactionManager.prototype.retryRequest = function(B) {
	var A = this.queue[B];
	this.queue[B] = null;
	if (A) {
		if (A[0] === "tasks.add") {
			SmartAdd.getInstance().onAddRetry()
		}
		this.request(A[0], A[1])
	} else {
		this.hideStatusBox(true)
	}
};
TransactionManager.prototype.requestSuccess = function(B) {
	var A = this.queue[B];
	clearTimeout(A[3]);
	A[3] = null;
	this.queue[B] = null;
	this.shortenQueue();
	this.hideStatusBox();
	if (rtmUsername === "okilani_demo") {
		statusBox.setText(A[0] + " success. Took " + (new Date() - A[2])
				+ " ms")
	}
	if (Offline.isReady() && Offline.isUpdating() && A && A[0] === "lists.load") {
		Offline.Sync.onSyncDataReady()
	}
};
TransactionManager.prototype.hideStatusBox = function(A) {
	var A = !!A;
	if (statusBox && (A || statusBox.text.innerHTML.indexOf("TryAgain") > -1)) {
		statusBox.hide()
	}
};
TransactionManager.prototype.shortenQueue = function(D) {
	var B = this.queue.length;
	var D = !!D;
	var E = true;
	if (D) {
		for ( var A = 0; A < B; A++) {
			if (this.queue[A] !== null && this.queue[A][3] !== null) {
				if (Offline.isReady() && this.queue[A][0] === "offline.ping") {
					Offline.onPingFailure(true, true)
				}
				clearTimeout(this.queue[A][3]);
				this.queue[A] = null
			}
		}
	} else {
		for ( var A = 0; A < B; A++) {
			if (this.queue[A] !== null) {
				E = false;
				break
			}
		}
	}
	if (E) {
		this.queue = []
	}
};
TransactionManager.prototype.handleError = function(D, A) {
	this.clearTimeout(D);
	var A = !!A;
	if (Offline.isReady() && !Offline.isUnloading()) {
		var B = this.queue[D];
		this.hideStatusBox();
		if (B[4] === false) {
			if (B) {
				if (B[0] === "offline.ping") {
					Offline.onPingFailure(A);
					return true
				}
			}
			Offline.onConnectionLost(D);
			return true
		} else {
			if (B[0] === "lists.load") {
				control.tasksFormat()
			} else {
				if (B[0] === "offline.ping") {
					Offline.onPingFailure(true, true)
				}
			}
		}
	}
	return false
};
TransactionManager.prototype.request = function(ac, ar, ac_timeout, auto) {
	var ac_timeout = ac_timeout;
	if (typeof (ac_timeout) === "undefined") {
		ac_timeout = null
	}
	var auto = auto;
	if (typeof (auto) === "undefined") {
		auto = false
	} else {
		auto = !!auto
	}
	if (Offline.isReady()
			&& (Offline.isOffline() || (Offline.isSyncing()
					&& ac !== "offline.sync" && ac !== "offline.ping"))) {
		this.shortenQueue(true);
		if (!(ac in this.getMap)) {
			if (Offline.isOffline() && !(ac in this.offlineMap)) {
				var res = Offline.Backend.handle(ac, eval("(" + ar + ")"));
				if (ac === "tasks.add" && res) {
					var ar = eval("(" + ar + ")");
					ar["sync_task_series_id"] = res[0];
					ar["sync_task_id"] = res[1];
					ar = Utility.toJSON(ar)
				}
				Offline.Sync.queueOperation(ac, ar)
			}
			return true
		}
		messageBus.broadcast(taskList, taskList.getUniqueMessageBusName()
				+ "loadStarted", false);
		control.doVirtualListLoad(stateMgr.currentFilter, false);
		return false
	}
	var self = this;
	var current_request = this.createXMLHTTPRequest();
	if (current_request) {
		var req_payload = [ ac, ar, new Date() ];
		this.queue.push(req_payload);
		var which = this.queue.length - 1;
		var failCallback = function() {
			self.requestFailed(which, req_payload)
		};
		var count = 1000;
		while (this.inRpc && count--) {
		}
		var req_params = {
			"v" : version,
			"ui" : rtmUIVersion,
			"format" : "js",
			"ac" : ac,
			"ar" : encodeURIComponent(ar),
			"sso" : this.SSO,
			"rid" : which,
			"zx" : Math.random()
		};
		var q = Utility.SortAndSign(req_params);
		if (Offline.isReady() && ac === "offline.ping") {
			Offline.in_ping_ = true
		}
		var is_get = is(this.getMap[ac]);
		if (is_get && q && q.length > 400) {
			is_get = false
		}
		if (is_get) {
			q = this.rtmPath + "?" + q;
			current_request.open("GET", q, true)
		} else {
			current_request.open("POST", this.rtmPath, true);
			current_request.setRequestHeader("Content-Type",
					"application/x-www-form-urlencoded")
		}
		var error_fn = function() {
			if (arguments.callee.done) {
				return
			}
			arguments.callee.done = true;
			self.handleError(which)
		};
		current_request.onreadystatechange = function() {
			if (current_request && current_request.readyState == 4) {
				var status = -1;
				try {
					status = current_request.status
				} catch (e) {
				}
				if (status !== 200) {
					if (Offline.isReady()) {
						error_fn()
					} else {
						self.requestFailed(which, true)
					}
				} else {
					if (current_request.responseText) {
						if (current_request.responseText.charAt(0) == "<") {
							self.requestFailed(which, true)
						} else {
							var to_eval = current_request.responseText
									.substring(9);
							window.setTimeout(function() {
								try {
									eval(to_eval);
									to_eval = null;
									delete to_eval
								} catch (e) {
									try {
										if (Offline.isReady()
												&& !Offline.isUnloading()) {
											throw e
										}
									} catch (e) {
									}
								}
							}, 0)
						}
					}
				}
				if (self.r === current_request) {
					current_request.onreadystatechange = function() {
					};
					self.inRpc = false;
					self.r = null
				}
				current_request = null
			}
		};
		if (!is_ie6) {
			current_request.onerror = error_fn
		}
		this.inRpc = true;
		this.r = current_request;
		var req_timeout = (ac_timeout ? ac_timeout
				: TransactionManager.REQUEST_TIMEOUT) * 1000;
		req_payload.push(setTimeout(failCallback, req_timeout));
		req_payload.push(auto);
		try {
			if (is_get) {
				current_request.send(null)
			} else {
				current_request.send(q)
			}
		} catch (e) {
		}
	}
};
TransactionManager.prototype.checkNoneSelected = function(A, B) {
	if (B == false) {
		return false
	}
	if (A.indexOf("tasks.setPriority") == 0) {
		return true
	}
	if (A.indexOf("applyLabel") == 0) {
		return true
	}
	if (this.noneMap[A] == null) {
		return false
	}
	return this.noneMap[A]
};
TransactionManager.prototype.checkNoneChanged = function(A, B) {
	if (!(!B)) {
		return true
	}
	if (A.indexOf("tasks.setPriority") == 0) {
		return false
	}
	if (this.noneChangedMap[A] === null) {
		return true
	}
	return this.noneChangedMap[A]
};
TransactionManager.prototype.checkCompletedView = function(A) {
	if (A.indexOf("tasks.setPriority") == 0) {
		return true
	}
	if (A.indexOf("applyLabel") == 0) {
		return false
	}
	if (this.completedMap[A] == null) {
		return true
	}
	return this.completedMap[A]
};
TransactionManager.prototype.executeTxn = function(B, O, D) {
	var A = [];
	var K = {};
	var J = view.getSelected().toString();
	switch (J) {
	case "Tasks":
		var M = taskList.getViewList();
		var E = M.selected;
		var I = M.entries;
		for ( var H = 0; H < E.length; H++) {
			A.push(I[E[H]][0])
		}
		K = {
			"list" : stateMgr.currentList,
			"tasks" : control.taskSeriesMap(M.getSelected())
		};
		break;
	default:
		break
	}
	if (this.checkNoneSelected(O, A.length == 0) == true) {
		statusBox.setText(_T("INTERFACE_STATUS_HAVE_TO_SELECT"));
		return false
	}
	if (J == "Tasks" && taskList.view == TaskList.TASK_LIST_VIEW_COMPLETED
			&& this.checkCompletedView(O) == true) {
		statusBox.setText(_T("INTERFACE_STATUS_CANT_DO_TO_COMPLETED"));
		return false
	}
	this.beginTxn();
	var F = null;
	if (!!B) {
		if (D) {
			F = B(A, D)
		} else {
			F = B(A)
		}
	}
	if (this.checkNoneChanged(O, F) == true) {
		this.request(O, utility.encodeJavaScript(K))
	} else {
		messageBus.broadcast(this, this.mbn + "noneChanged", O)
	}
	this.endTxn();
	return false
};
TransactionManager.prototype.beginTxn = function() {
	this.inTxn = true
};
TransactionManager.prototype.endTxn = function() {
	this.inTxn = false
};
function UndoManager() {
	this.inited = false;
	this.transactions = [];
	this.map = {};
	this.mbn = null;
	this.undoTimeout = null
}
UndoManager.prototype.init = function() {
	this.inited = true;
	this.mbn = this.getUniqueMessageBusName();
	this.undoTimeout = null;
	var B = this;
	var A = function() {
		B.clearUndoTimeout()
	}
};
UndoManager.prototype.clearUndoTimeout = function() {
	clearTimeout(this.undoTimeout);
	this.undoTimeout = null
};
UndoManager.prototype.setUndoTimeout = function(A) {
	this.undoTimeout = A
};
UndoManager.prototype.getUniqueMessageBusName = function() {
	return "rtm.undomanager."
};
UndoManager.prototype.undoTransaction = function() {
	var D;
	if (this.transactions.length) {
		D = this.transactions[this.transactions.length - 1];
		transMgr.request("transaction.undo", utility.encodeJavaScript( {
			"xid" : D
		}));
		var A = this;
		var B = function() {
			messageBus
					.broadcast(A, A.getUniqueMessageBusName() + "undoTimeout");
			A.undoTimeout = null
		};
		this.setUndoTimeout(setTimeout(B, TransactionManager.REQUEST_TIMEOUT
				* 1000 * transMgr.getDistributionMultiplier()));
		messageBus.broadcast(this, this.mbn + "undoStarted", D);
		return true
	}
	return false
};
UndoManager.prototype.pushTransaction = function(A) {
	if (Offline.isReady() && Offline.isOffline()) {
	} else {
		this.transactions.push(A);
		tasksView.reflectUndoSelector()
	}
};
UndoManager.prototype.undoSuccess = function(A) {
	this.clearUndoTimeout();
	if (this.transactions.length) {
		this.transactions.spliceAll(A)
	}
	messageBus.broadcast(this, this.mbn + "undoFinished", true)
};
UndoManager.prototype.undoFailed = function(A) {
	this.clearUndoTimeout();
	messageBus.broadcast(this, this.mbn + "undoFinished", false)
};
function TaskCloud(D, B, A) {
	this.id = D;
	this.div = el(D);
	this.copyId = B;
	if (this.copyId) {
		this.copyDiv = el(B)
	} else {
		this.copyDiv = null
	}
	if (A) {
		this.copyParent = el(A)
	}
}
TaskCloud.prototype.taskCloudSort = function(B, A) {
	var D = B[1].toLowerCase();
	var E = A[1].toLowerCase();
	if (D == E) {
		if (B[0] < A[0]) {
			return 1
		} else {
			if (B[0] > A[0]) {
				return -1
			}
		}
		return 0
	}
	if (D > E) {
		return 1
	} else {
		if (D < E) {
			return -1
		}
	}
};
TaskCloud.prototype.update = function() {
	var s = {};
	var Z = [];
	var a = true;
	var W = 0, AA = null, m = 0, M = null, X = 0, AB = null;
	var R = 9;
	for ( var j in stateMgr.lists) {
		a = false;
		var U = stateMgr.lists[j];
		var o = 1;
		if (!U.archived && !U.deleted && U.filter === null) {
			var r = format.getListStatistics(U.id);
			var e = r[8];
			if (e[0] > 0) {
				o = 1 / ((e[1] / e[0]) / (new Date().getTime() / 1000))
			} else {
				o = 1
			}
			var k = r[7];
			k = ((k[0] * 4) + (k[1] * 3) + (k[2] * 2) + 1);
			k = 1 / k;
			var B = r[5] / (k * o);
			Z.push( [ 0, U.name.toLowerCase(), r[5], U.id, B ]);
			if (AA === null || B < AA) {
				AA = B
			}
			if (B > W) {
				W = B
			}
		}
	}
	if (a) {
		return false
	}
	var A = {};
	var d = {};
	for ( var K in stateMgr.tasks) {
		if (!is(stateMgr.tasks[K])) {
			continue
		}
		var f = stateMgr.tasks[K];
		if (!(f.series_id in d)) {
			d[f.series_id] = f.date_completed ? [ 0, 1 ] : [ 1, 0 ]
		} else {
			if (f.date_completed) {
				d[f.series_id][1]++
			} else {
				d[f.series_id][0]++
			}
		}
		if (f.date_completed) {
			continue
		}
		if (!is(A[f.series_id])) {
			A[f.series_id] = 1
		} else {
			A[f.series_id]++
		}
	}
	for ( var p in tagMgr.index) {
		if (!is(tagMgr.index[p])) {
			continue
		}
		var z = 0, V = 0, Y = 0;
		for ( var v = 0; v < tagMgr.index[p].length; v++) {
			if (tagMgr.index[p][v] in d) {
				var H = d[tagMgr.index[p][v]];
				V += H[0];
				Y += H[1]
			}
			if (!is(A[tagMgr.index[p][v]])) {
				continue
			} else {
				z += A[tagMgr.index[p][v]]
			}
		}
		s[p.toLowerCase()] = [ V, Y ];
		if (z == 0) {
			continue
		}
		Z.push( [ 1, p.toLowerCase(), z ]);
		if (M === null || z < M) {
			M = z
		}
		if (z > m) {
			m = z
		}
	}
	setTimeout(function() {
		tagList.onDataUpdated(s)
	}, 0);
	var J, z, h = 0, Q = 0, b = {};
	for ( var w in locationMgr.locations_) {
		z = 0;
		J = locationMgr.locations_[w];
		for ( var y in locationMgr.location_task_series_) {
			if (locationMgr.location_task_series_[y] == w && y in d) {
				var H = d[y];
				h += H[0];
				Q += H[1]
			}
			if (!is(A[y]) || locationMgr.location_task_series_[y] != w) {
				continue
			} else {
				z += A[y]
			}
		}
		b[w] = [ h, Q ];
		if (z == 0) {
			continue
		}
		Z.push( [ 2, J.name.toLowerCase(), z, J.name ]);
		if (AB === null || z < AB) {
			AB = z
		}
		if (z > X) {
			X = z
		}
	}
	setTimeout(function() {
		locationList.onDataChanged(b)
	}, 0);
	Z.sort(this.taskCloudSort);
	var D = [];
	var E = "tasktag";
	var F = "0";
	var O = "";
	if (AA === null) {
		AA = 0
	}
	if (M === null) {
		M = 0
	}
	if (AB === null) {
		AB = 0
	}
	var u;
	for ( var v = 0; v < Z.length; v++) {
		var p = Z[v];
		var q, I;
		if (p[0] == 0) {
			E = "listtag";
			q = 1 + parseInt(p[4] / W * (R - 1), 10);
			I = "onclick=\"taskCloud.showList('" + String(p[3]).escapeForAttr()
					+ "'); return false;\""
		} else {
			if (p[0] == 1) {
				E = "tasktag";
				q = 1 + parseInt(p[2] / m * (R - 1), 10);
				I = "onclick=\"taskCloud.showTag('"
						+ String(p[1]).escapeForAttr() + "'); return false;\""
			} else {
				E = "locationtag";
				q = 1 + parseInt(p[2] / X * (R - 1), 10);
				I = "onclick=\"taskCloud.showLocation('"
						+ String(p[3]).escapeForAttr() + "'); return false;\""
			}
		}
		E += " level" + q;
		if (p[2] == 0) {
			u = "INTERFACE_TASKS_LIST_DETAILS_ZERO_TASKS"
		} else {
			if (p[2] == 1) {
				u = "INTERFACE_TASKS_LIST_DETAILS_ONE_TASK"
			} else {
				u = "INTERFACE_TASKS_LIST_DETAILS_NUM_TASKS"
			}
		}
		O = _T(u, {
			"NUM" : p[2]
		});
		D.push('<span class="' + E + '"><a href=" " ' + I + ' title="' + O
				+ '">' + p[1] + "</a></span>")
	}
	O = D.join("\n");
	this.div.innerHTML = O;
	if (this.copyDiv) {
		this.copyDiv.innerHTML = O
	}
};
TaskCloud.prototype.showTag = function(A) {
	messageBus.broadcast(tasksView, tasksView.mbn + "showTag", A)
};
TaskCloud.prototype.showList = function(A) {
	messageBus.broadcast(tasksView, tasksView.mbn + "showList", A)
};
TaskCloud.prototype.showLocation = function(A) {
	messageBus.broadcast(tasksView, tasksView.mbn + "showLocation", A)
};
TaskCloud.prototype.showCopy = function() {
	if (configurationMgr.configuration["taskcloud"] === true) {
		this.copyParent.style.display = ""
	} else {
		this.hideCopy()
	}
};
TaskCloud.prototype.hideCopy = function() {
	this.copyParent.style.display = "none"
};
TaskCloud.prototype.hide = function() {
	if (this.div) {
		this.div.style.display = "none"
	}
	this.hideCopy()
};
TaskCloud.prototype.show = function() {
	if (this.div) {
		this.div.style.display = ""
	}
	this.showCopy()
};
function Tabs(B, A) {
	this.id = B;
	this.div = el(B);
	if (A == "grey") {
		this.div.className = "xtabs xtabs_grey"
	} else {
		this.div.className = "xtabs"
	}
	this.entries = [];
	this.data = [];
	this.html = null;
	this.map = {};
	this.reverseMap = {};
	this.blitted = false;
	this.special = {};
	this.mbn = null;
	this.selected = null;
	this.defaultEntry = null;
	this.inited = false;
	this.hidden = false;
	this.sortSpec = null;
	this.sortSpecClean = null;
	this.hashMap = null
}
Tabs.prototype.init = function() {
	this.mbn = this.getUniqueMessageBusName();
	this.blitted = false;
	this.defaultEntry = null;
	this.inited = true;
	this.hidden = false
};
Tabs.prototype.setSortParameters = function(B, A) {
	this.hashMap = B;
	this.sortFields = A
};
Tabs.prototype.doSort = function(B, A) {
	for ( var D = 0; D < B.length; D++) {
		if (B[D] === null && A[D] !== null) {
			return 1
		} else {
			if (B[1] !== null && A[D] === null) {
				return -1
			}
		}
		if (B[D] > A[D]) {
			return 1
		} else {
			if (B[D] < A[D]) {
				return -1
			}
		}
	}
	return 0
};
Tabs.prototype.sort = function() {
	var entriesSort = [];
	for ( var j = 0; j < this.entries.length; j++) {
		var data = this.data[j];
		var entryTuple = [];
		if (data instanceof Array) {
			if (data[0] != TasksView.LIST_TYPE_NORMAL) {
				continue
			}
			data = data[1]
		}
		for ( var i = 0; i < this.sortFields.length; i++) {
			var f = this.sortFields[i];
			var v = eval("this.hashMap[data]." + f);
			entryTuple.push(v)
		}
		entryTuple.list = this;
		entryTuple.id = data;
		entriesSort.push(entryTuple)
	}
	entriesSort.sort(this.doSort);
	var remapList = [];
	for ( var i = 0; i < entriesSort.length; i++) {
		remapList.push( [ entriesSort[i].id, i ])
	}
	var iters = 0;
	var needUpdate = [];
	var selectedData = this.data[this.selected];
	var rcuEntries = cloneArr(this.entries);
	var rcuMap = cloneObj(this.map);
	var rcuReverseMap = cloneObj(this.reverseMap);
	var rcuData = cloneArr(this.data);
	for ( var i = 0; i < remapList.length; i++) {
		var oldId = rcuData[remapList[i][1]];
		if (oldId instanceof Array) {
			oldId = oldId[1]
		}
		var newId = remapList[i][0];
		var oldPos = remapList[i][1];
		var newPos = rcuReverseMap[newId];
		if (oldPos == newPos) {
			continue
		}
		rcuMap[rcuEntries[oldPos]] = newPos;
		rcuMap[rcuEntries[newPos]] = oldPos;
		rcuReverseMap[oldId] = newPos;
		rcuReverseMap[newId] = oldPos;
		var tmpEntry = rcuEntries[oldPos];
		rcuEntries[oldPos] = rcuEntries[newPos];
		rcuEntries[newPos] = tmpEntry;
		var tmpData = rcuData[oldPos];
		rcuData[oldPos] = rcuData[newPos];
		rcuData[newPos] = tmpData;
		needUpdate.push(oldPos);
		needUpdate.push(newPos);
		iters++
	}
	this.map = rcuMap;
	this.reverseMap = rcuReverseMap;
	this.data = rcuData;
	this.entries = rcuEntries;
	this.blitted = false;
	if (is(selectedData)) {
		if (selectedData instanceof Array) {
			selectedData = selectedData[1]
		}
		this.selected = this.reverseMap[selectedData]
	} else {
		this.selected = 0
	}
	this.blitDiv()
};
Tabs.prototype.printMappings = function() {
	for ( var A = 0; A < this.entries.length; A++) {
	}
};
Tabs.prototype.removeEntryByData = function(A) {
	if (A instanceof Array) {
		A = A[1]
	}
	var B = this.reverseMap[A];
	this.removeEntry(B)
};
Tabs.prototype.removeEntry = function(H, F) {
	var E = this.data[H];
	if (E instanceof Array) {
		E = E[1]
	}
	this.data[H] = null;
	this.reverseMap[E] = null;
	this.entries.splice(H, 1);
	var A = this.entries.length;
	for ( var B = H + 1; B < A + 1; B++) {
		var D = this.data[B];
		if (D instanceof Array) {
			this.reverseMap[D[1]] = B - 1
		} else {
			this.reverseMap[D] = B - 1
		}
		this.data[B - 1] = D
	}
	if (this.selected === H) {
		this.selected = 0;
		this.blitDiv();
		this.selectDefault()
	} else {
		if (this.selected > H) {
			this.selected = this.selected - 1;
			if (!F) {
				this.blitDiv()
			}
		} else {
			if (!F) {
				this.blitDiv()
			}
		}
	}
};
Tabs.prototype.setDefaultEntry = function(A) {
	this.defaultEntry = A
};
Tabs.prototype.show = function() {
	var B = this.div;
	if (false && is_gecko && !is_safari) {
		var A = function() {
			B.style.display = ""
		};
		setTimeout(A, 1)
	} else {
		B.style.display = ""
	}
	this.hidden = false
};
Tabs.prototype.hide = function() {
	var A = this.div;
	if (false && is_gecko && !is_safari) {
		var B = function() {
			A.style.display = "none"
		};
		setTimeout(B, 1)
	} else {
		this.div.style.display = "none"
	}
	this.hidden = true
};
Tabs.prototype.getUniqueMessageBusName = function() {
	return "rtm.tabs." + this.id + "."
};
Tabs.prototype.addEntry = function(D, E, B, A) {
	this.map[D] = this.entries.length;
	this.entries.push(D);
	if (E === 0 || E) {
		this.data[this.entries.length - 1] = E;
		if (E instanceof Array) {
			if (B) {
				this.special[E[1]] = 1
			}
			this.reverseMap[E[1]] = this.entries.length - 1
		} else {
			if (B) {
				this.special[E] = 1
			}
			this.reverseMap[E] = this.entries.length - 1
		}
	}
	return this.entries.length - 1
};
Tabs.prototype.entryExists = function(A) {
	return (is(this.map[A]))
};
Tabs.prototype.setDataForEntry = function(A, B) {
	if (is(this.map[A])) {
		this.data[this.map[A]] = B;
		if (B instanceof Array) {
			this.reverseMap[B[1]] = this.map[A]
		} else {
			this.reverseMap[B] = this.map[A]
		}
	}
};
Tabs.prototype.getSelected = function() {
	if (this.selected !== null) {
		return this.entries[this.selected]
	}
	return null
};
Tabs.prototype.selectDefault = function(A) {
	if (this.inited) {
		if (this.defaultEntry !== null) {
			this.selectTabByPosition(this.defaultEntry, A)
		} else {
			this.selectTabByPosition(0, A)
		}
	}
};
Tabs.prototype.selectTab = function(D, B) {
	var A = this.map[D];
	this.selectTabByPosition(A, B)
};
Tabs.prototype.selectTabByData = function(B) {
	var D = null;
	for ( var A = 0; A < this.data.length; A++) {
		if (this.data[A] instanceof Array && this.data[A][1] == B) {
			D = A;
			break
		} else {
			if (!(this.data[A] instanceof Array) && this.data[A] == B) {
				D = A;
				break
			}
		}
	}
	this.selectTabByPosition(D)
};
Tabs.prototype.selectTabByPosition = function(I, J) {
	var B = this.selected;
	if (I !== null && I < this.entries.length) {
		this.selected = I
	} else {
		return false
	}
	if (!this.blitted) {
		this.blitDiv()
	} else {
		var K = this.div.getElementsByTagName("li");
		var H = false;
		var D = false;
		for ( var F = 0; F < K.length; F++) {
			var A = K[F];
			if (A.className.indexOf("selected") > -1 && F != this.selected) {
				if (this.id == "listtabs"
						&& this.data[F][0] != TasksView.LIST_TYPE_NORMAL) {
					A.className = "xtab_smartlist"
				} else {
					A.className = ""
				}
				H = true
			}
			if (F == this.selected) {
				if (A.className.indexOf("selected") == -1) {
					A.className = "xtab_selected";
					D = true
				}
				if (H) {
					break
				}
			}
		}
		if (!D && B != I) {
			this.blitDiv()
		}
	}
	if (messageBus && !J) {
		var E = this.data[I];
		if (!is(E)) {
			E = null
		}
		messageBus.broadcast(this, this.mbn + "tabChanged", [
				[ B, (B !== null ? this.entries[B] : "") ],
				[ this.selected, this.entries[I] ], E ])
	}
};
Tabs.prototype.sortOld = function() {
	this.entries.sort();
	for ( var A = 0; A < this.entries.length; A++) {
		this.map[this.entries[A]] = A
	}
};
Tabs.prototype.renameEntry = function(D, B) {
	for ( var A = 0; A < this.entries.length; A++) {
		if (this.entries[A] == D) {
			this.map[B] = A;
			delete this.map[D];
			this.entries[A] = B;
			return
		}
	}
};
Tabs.prototype.renameEntryByData = function(D, A) {
	for ( var B = 0; B < this.entries.length; B++) {
		if (is(this.entries[B])
				&& ((this.data[B] instanceof Array && this.data[B][1] == D) || (!(this.data[B] instanceof Array) && this.data[B] == D))) {
			this.entries[B] = A;
			this.div.getElementsByTagName("a")[B].innerHTML = A;
			return
		}
	}
};
Tabs.prototype.blitDiv = function() {
	var H = [];
	H.push("<ul>");
	for ( var B = 0; B < this.entries.length; B++) {
		var A = [];
		if (this.selected === B) {
			A.push("xtab_selected")
		}
		if (this.id == "listtabs" && this.data[B] instanceof Array
				&& this.data[B][0] != TasksView.LIST_TYPE_NORMAL) {
			A.push("xtab_smartlist")
		}
		var M = A.length == 0 ? "" : ' class="' + A.join(" ") + '"';
		var D = "";
		if (this.data[B] instanceof Array && is(this.special[this.data[B][1]])) {
			D = ' <img src="' + Utility.getImageUrl("/img/tabclose.gif")
					+ '" onclick="listTabs.removeEntryByData('
					+ this.data[B][1] + '); return false;" />'
		}
		H.push("<li" + M + '><a href=" ">' + this.entries[B] + D + "</a></li>")
	}
	H.push("</ul>");
	this.html = H.join("");
	this.div.innerHTML = this.html;
	var J = this.div.getElementsByTagName("li");
	for ( var B = 0; B < this.entries.length; B++) {
		var F = J[B];
		var K = this;
		var I = this.entries[B];
		var E = B;
		F.pos = B;
		F.entry = I;
		F.onclick = function(O) {
			try {
				this.blur()
			} catch (Q) {
			}
			K.selectTabByPosition(this.pos);
			return false
		}
	}
	this.blitted = true
};
Tabs.prototype.selectLeft = function() {
	if (this.selected !== 0) {
		this.selectTabByPosition(this.selected - 1)
	} else {
		this.selectTabByPosition(this.entries.length - 1)
	}
};
Tabs.prototype.selectRight = function() {
	if (this.selected + 1 !== this.entries.length) {
		this.selectTabByPosition(this.selected + 1)
	} else {
		this.selectTabByPosition(0)
	}
};
function XTabs(B, A) {
	this.id = B;
	this.div = el(B);
	if (A == "grey") {
		this.div.className = "xtabs xtabs_grey"
	} else {
		this.div.className = "xtabs"
	}
	this.entries = [];
	this.data = [];
	this.html = null;
	this.reverseMap = {};
	this.blitted = false;
	this.special = {};
	this.mbn = null;
	this.selected = null;
	this.defaultEntry = null;
	this.inited = false;
	this.hidden = false;
	this.sortSpec = null;
	this.sortSpecClean = null;
	this.hashMap = null
}
XTabs.prototype.init = function() {
	this.mbn = this.getUniqueMessageBusName();
	this.blitted = false;
	this.defaultEntry = null;
	this.inited = true;
	this.hidden = false;
	this.entries = [];
	this.data = [];
	this.html = null;
	this.reverseMap = {};
	this.special = {}
};
XTabs.prototype.setSortParameters = function(B, A) {
	this.hashMap = B;
	this.sortFields = A
};
XTabs.prototype.doSort = function(B, A) {
	for ( var D = 0; D < B.length; D++) {
		if (B[D] === null && A[D] !== null) {
			return 1
		} else {
			if (B[D] !== null && A[D] === null) {
				return -1
			}
		}
		if (B[D] > A[D]) {
			return 1
		} else {
			if (B[D] < A[D]) {
				return -1
			}
		}
	}
	return 0
};
XTabs.prototype.sort = function() {
	var entriesSort = [];
	for ( var j = 0; j < this.entries.length; j++) {
		var data = this.data[j];
		var entryTuple = [];
		if (data instanceof Array) {
			data = data[1]
		}
		if (data === null) {
			continue
		}
		for ( var i = 0; i < this.sortFields.length; i++) {
			var f = this.sortFields[i];
			var v = eval("this.hashMap[data]." + f);
			entryTuple.push(v)
		}
		entryTuple.list = this;
		entryTuple.id = data;
		entriesSort.push(entryTuple)
	}
	entriesSort.sort(this.doSort);
	var remapList = [];
	for ( var i = 0; i < entriesSort.length; i++) {
		remapList.push( [ entriesSort[i].id, i ])
	}
	var iters = 0;
	var needUpdate = [];
	var selectedData = this.data[this.selected];
	for ( var i = 0; i < remapList.length; i++) {
		var oldId = this.data[remapList[i][1]];
		if (oldId instanceof Array) {
			oldId = oldId[1]
		}
		var newId = remapList[i][0];
		var oldPos = remapList[i][1];
		var newPos = this.reverseMap[newId];
		if (oldPos == newPos) {
			continue
		}
		this.reverseMap[oldId] = newPos;
		this.reverseMap[newId] = oldPos;
		var tmpEntry = this.entries[oldPos];
		this.entries[oldPos] = this.entries[newPos];
		this.entries[newPos] = tmpEntry;
		var tmpData = this.data[oldPos];
		this.data[oldPos] = this.data[newPos];
		this.data[newPos] = tmpData;
		needUpdate.push(oldPos);
		needUpdate.push(newPos);
		iters++
	}
	this.blitted = false;
	if (is(selectedData)) {
		if (selectedData instanceof Array) {
			selectedData = selectedData[1]
		}
		this.selected = this.reverseMap[selectedData]
	} else {
		this.selected = 0
	}
	this.blitDiv()
};
XTabs.prototype.printMappings = function() {
	for ( var A = 0; A < this.entries.length; A++) {
	}
};
XTabs.prototype.removeEntryByData = function(A) {
	this.printMappings();
	if (A instanceof Array) {
		A = A[1]
	}
	var B = this.reverseMap[A];
	this.removeEntry(B);
	this.printMappings()
};
XTabs.prototype.removeEntry = function(H, F) {
	var E = this.data[H];
	if (E instanceof Array) {
		E = E[1]
	}
	this.data[H] = null;
	this.reverseMap[E] = null;
	this.entries.splice(H, 1);
	var A = this.entries.length;
	for ( var B = H + 1; B < A + 1; B++) {
		var D = this.data[B];
		if (D instanceof Array) {
			this.reverseMap[D[1]] = B - 1
		} else {
			this.reverseMap[D] = B - 1
		}
		this.data[B - 1] = D
	}
	if (this.selected === H) {
		this.selected = 0;
		this.blitDiv();
		this.selectDefault()
	} else {
		if (this.selected > H) {
			this.selected = this.selected - 1;
			if (!F) {
				this.blitDiv()
			}
		} else {
			if (!F) {
				this.blitDiv()
			}
		}
	}
};
XTabs.prototype.setDefaultEntry = function(A) {
	this.defaultEntry = A
};
XTabs.prototype.show = function() {
	var B = this.div;
	if (false && is_gecko && !is_safari) {
		var A = function() {
			B.style.display = ""
		};
		setTimeout(A, 1)
	} else {
		B.style.display = ""
	}
	this.hidden = false
};
XTabs.prototype.hide = function() {
	var A = this.div;
	if (false && is_gecko && !is_safari) {
		var B = function() {
			A.style.display = "none"
		};
		setTimeout(B, 1)
	} else {
		this.div.style.display = "none"
	}
	this.hidden = true
};
XTabs.prototype.getUniqueMessageBusName = function() {
	return "rtm.tabs." + this.id + "."
};
XTabs.prototype.addEntry = function(B, D, A) {
	this.entries.push(B);
	if (D === 0 || D) {
		this.data[this.entries.length - 1] = D;
		if (D instanceof Array) {
			if (A) {
				this.special[D[1]] = 1
			}
			this.reverseMap[D[1]] = this.entries.length - 1
		} else {
			if (A) {
				this.special[D] = 1
			}
			this.reverseMap[D] = this.entries.length - 1
		}
	}
	return this.entries.length - 1
};
XTabs.prototype.entryExists = function(A) {
	if (A instanceof Array) {
		return (is(this.reverseMap[A[1]]))
	} else {
		return (is(this.reverseMap[A]))
	}
};
XTabs.prototype.setDataForEntry = function(A, B) {
	if (is(this.reverseMap[A])) {
		this.data[this.reverseMap[A]] = B;
		if (B instanceof Array) {
			this.reverseMap[B[1]] = this.reverseMap[A]
		} else {
			this.reverseMap[B] = this.reverseMap[A]
		}
	}
};
XTabs.prototype.getSelected = function() {
	if (this.selected !== null) {
		return this.entries[this.selected]
	}
	return null
};
XTabs.prototype.selectDefault = function(A) {
	if (this.inited) {
		if (this.defaultEntry !== null) {
			this.selectTabByPosition(this.defaultEntry, A)
		} else {
			this.selectTabByPosition(0, A)
		}
	}
};
XTabs.prototype.selectTab = function(D, B) {
	var A = this.reverseMap[D];
	this.selectTabByPosition(A, B)
};
XTabs.prototype.selectTabByData = function(B) {
	var D = null;
	for ( var A = 0; A < this.data.length; A++) {
		if (this.data[A] instanceof Array && this.data[A][1] == B) {
			D = A;
			break
		} else {
			if (!(this.data[A] instanceof Array) && this.data[A] == B) {
				D = A;
				break
			}
		}
	}
	this.selectTabByPosition(D)
};
XTabs.prototype.selectTabByPosition = function(J, K) {
	var B = this.selected;
	if (J !== null && J < this.entries.length) {
		this.selected = J
	} else {
		return false
	}
	if (!this.blitted) {
		this.blitDiv()
	} else {
		var M = this.div.getElementsByTagName("li");
		var I = false;
		var D = false;
		for ( var H = 0; H < M.length; H++) {
			var A = M[H];
			if (A.className.indexOf("selected") > -1 && H != this.selected) {
				if (this.id == "listtabs"
						&& this.data[H][0] != TasksView.LIST_TYPE_NORMAL) {
					A.className = "xtab_smartlist";
					var F = A.getElementsByTagName("img");
					if (F && F.length > 0) {
						F[0].src = Utility
								.getImageUrl("/img/ico/ico_close_blu_blu.gif")
					}
				} else {
					A.className = ""
				}
				I = true
			}
			if (H == this.selected) {
				if (A.className.indexOf("selected") == -1) {
					A.className = "xtab_selected";
					D = true;
					if (this.id == "listtabs"
							&& this.data[H][0] != TasksView.LIST_TYPE_NORMAL) {
						var F = A.getElementsByTagName("img");
						if (F && F.length > 0) {
							F[0].src = Utility
									.getImageUrl("/img/ico/ico_close_gry_whi.gif")
						}
					}
				}
				if (I) {
					break
				}
			}
		}
		if (!D && B != J) {
			this.blitDiv()
		}
	}
	if (messageBus && !K) {
		var E = this.data[J];
		if (!is(E)) {
			E = null
		}
		messageBus.broadcast(this, this.mbn + "tabChanged", [
				[ B, (B !== null ? this.entries[B] : "") ],
				[ this.selected, this.entries[J] ], E ])
	}
};
XTabs.prototype.renameEntry = function(A, D) {
	var B = this.reverseMap[A];
	if (!is(B)) {
		return false
	}
	this.entries[B] = D;
	this.div.getElementsByTagName("a")[B].innerHTML = D
};
XTabs.prototype.blitDiv = function() {
	var I = [];
	I.push("<ul>");
	for ( var B = 0; B < this.entries.length; B++) {
		var A = [];
		if (this.selected === B) {
			A.push("xtab_selected")
		}
		if (this.id == "listtabs" && this.data[B] instanceof Array
				&& this.data[B][0] != TasksView.LIST_TYPE_NORMAL) {
			A.push("xtab_smartlist")
		}
		var E = "";
		var K = "";
		if (this.data[B] instanceof Array && is(this.special[this.data[B][1]])) {
			if (is_ie) {
				var D = "ico_close_org_blu.gif";
				if (this.selected === B) {
					D = "ico_close_gry_whi.gif"
				}
				E = ' <img style="vertical-align: top; padding: 0;" src="'
						+ Utility.getImageUrl("/img/ico/" + D)
						+ '" onclick="listTabs.removeEntryByData('
						+ this.data[B][1] + '); return false;" />';
				K = ' style="vertical-align: top; padding-top: 6px; padding-bottom: 3px;"'
			} else {
				E = ' <img style="padding-top: 2px; padding-left: 1px;" src="'
						+ Utility.getImageUrl("/img/ico/ico_close_gry_whi.gif")
						+ '" onclick="listTabs.removeEntryByData('
						+ this.data[B][1] + '); return false;" />'
			}
		}
		var Q = A.length == 0 ? "" : ' class="' + A.join(" ") + '"';
		I.push("<li" + Q + "><a " + K + ' href=" ">'
				+ this.entries[B].escapeForDisplay() + E + "</a></li>")
	}
	I.push("</ul>");
	this.html = I.join("");
	this.div.innerHTML = this.html;
	var M = this.div.getElementsByTagName("li");
	for ( var B = 0; B < this.entries.length; B++) {
		var H = M[B];
		var O = this;
		var J = this.entries[B];
		var F = B;
		H.pos = B;
		H.entry = J;
		H.onclick = function(R) {
			try {
				this.blur()
			} catch (U) {
			}
			O.selectTabByPosition(this.pos);
			return false
		};
		H.onmouseover = function(U) {
			U || (U = window.event);
			var V = utility.getEventTarget(U);
			var R = this.getElementsByTagName("img");
			if (R && R.length > 0 && R[0]) {
				if (V == R[0]) {
					if (is_ie && O.selected != this.pos) {
						R[0].src = Utility
								.getImageUrl("/img/ico/ico_close_org_blu.gif")
					} else {
						R[0].src = Utility
								.getImageUrl("/img/ico/ico_close_org_whi.gif")
					}
				} else {
					if (is_ie && O.selected != this.pos) {
						R[0].src = Utility
								.getImageUrl("/img/ico/ico_close_blu_blu.gif")
					} else {
						R[0].src = Utility
								.getImageUrl("/img/ico/ico_close_gry_whi.gif")
					}
				}
				R[0].onmouseover = function() {
					if (is_ie && O.selected != this.pos) {
						this.src = Utility
								.getImageUrl("/img/ico/ico_close_org_blu.gif")
					} else {
						this.src = Utility
								.getImageUrl("/img/ico/ico_close_org_whi.gif")
					}
				};
				R[0].onmouseout = function() {
					if (is_ie && O.selected != this.pos) {
						this.src = Utility
								.getImageUrl("/img/ico/ico_close_blu_blu.gif")
					} else {
						this.src = Utility
								.getImageUrl("/img/ico/ico_close_gry_whi.gif")
					}
				}
			}
		};
		H.onmouseout = function() {
			if (O.selected != this.pos) {
				var R = this.getElementsByTagName("img");
				if (R && R.length > 0) {
					R[0].src = Utility
							.getImageUrl("/img/ico/ico_close_blu_blu.gif");
					R[0].onmouseover = function() {
					};
					R[0].onmouseout = function() {
					}
				}
			}
		}
	}
	this.blitted = true
};
XTabs.prototype.selectLeft = function() {
	if (this.selected !== 0) {
		this.selectTabByPosition(this.selected - 1)
	} else {
		this.selectTabByPosition(this.entries.length - 1)
	}
};
XTabs.prototype.selectRight = function() {
	if (this.selected + 1 !== this.entries.length) {
		this.selectTabByPosition(this.selected + 1)
	} else {
		this.selectTabByPosition(0)
	}
};
function Autocomplete(B, A) {
	this.id = B ? B : null;
	this.store = A ? A : null;
	this.bound = false;
	this.input = null;
	this.completing = null;
	this.callback = null;
	this.autoselect = true;
	this.autocommit = false;
	this.field = null;
	this.has_ghost = ("getGhostWidth" in A);
	this.has_prepend_char = ("getPrependChar" in A);
	if (this.id) {
		this.bind()
	}
	Autocomplete.AC_INSTANCES.push(this)
}
Autocomplete.AC_INSTANCES = [];
Autocomplete.AC_TIMEOUT = 0;
if (is_khtml) {
	Autocomplete.AC_LIST_OFFSET_LEFT = 0;
	Autocomplete.AC_LIST_OFFSET_TOP = 0;
	Autocomplete.AC_LIST_SIZE_LEFT = 0;
	Autocomplete.AC_LIST_SIZE_TOP = 0
} else {
	if (is_gecko) {
		Autocomplete.AC_LIST_OFFSET_LEFT = -2;
		Autocomplete.AC_LIST_OFFSET_TOP = 4;
		Autocomplete.AC_LIST_SIZE_LEFT = 2;
		Autocomplete.AC_LIST_SIZE_TOP = -16
	} else {
		if (is_ie) {
			Autocomplete.AC_LIST_OFFSET_LEFT = 0;
			Autocomplete.AC_LIST_OFFSET_TOP = 0;
			Autocomplete.AC_LIST_SIZE_LEFT = 0;
			Autocomplete.AC_LIST_SIZE_TOP = 0
		} else {
			Autocomplete.AC_LIST_OFFSET_LEFT = 0;
			Autocomplete.AC_LIST_OFFSET_TOP = 0;
			Autocomplete.AC_LIST_SIZE_LEFT = 0;
			Autocomplete.AC_LIST_SIZE_TOP = 0
		}
	}
}
Autocomplete.AC_SMART_ADD_TOP_OFFSET = 0;
Autocomplete.AC_SMART_ADD_LEFT_OFFSET = 0;
if (is_ie || is_safari) {
	Autocomplete.AC_SMART_ADD_LEFT_OFFSET = -7
} else {
	if (is_opera) {
		Autocomplete.AC_SMART_ADD_LEFT_OFFSET = -9
	}
}
if (is_gecko) {
	if (is_gecko19) {
		if (is_mac) {
			Autocomplete.AC_SMART_ADD_TOP_OFFSET = -5;
			Autocomplete.AC_SMART_ADD_LEFT_OFFSET = -5
		} else {
			Autocomplete.AC_SMART_ADD_TOP_OFFSET = -4;
			Autocomplete.AC_SMART_ADD_LEFT_OFFSET = -4
		}
	} else {
		if (is_gecko18) {
			Autocomplete.AC_SMART_ADD_TOP_OFFSET = -5;
			Autocomplete.AC_SMART_ADD_LEFT_OFFSET = -5
		}
	}
} else {
	if (is_chrome) {
		Autocomplete.AC_SMART_ADD_LEFT_OFFSET = -7
	}
}
Autocomplete.findPosition = function(A) {
	var D = 0, B = 0;
	if (A.offsetParent) {
		while (A.offsetParent) {
			D += A.offsetTop;
			B += A.offsetLeft;
			A = A.offsetParent
		}
	} else {
		if (A.y) {
			D += A.y
		}
		if (A.x) {
			B += A.x
		}
	}
	return [ B, D ]
};
Autocomplete.handleWindowResize = function(D) {
	if (Autocomplete.AC_INSTANCES.length === 0) {
		return 

	}
	for ( var B = 0, A = Autocomplete.AC_INSTANCES.length; B < A; B++) {
		var E = Autocomplete.AC_INSTANCES[B];
		if (!D && E.has_ghost) {
			continue
		}
		Autocomplete.AC_INSTANCES[B].handleWindowResize()
	}
};
Autocomplete.removeInstance = function(A) {
	for ( var D = 0, B = Autocomplete.AC_INSTANCES.length; D < B; D++) {
		if (Autocomplete.AC_INSTANCES[D] === A) {
			Autocomplete.AC_INSTANCES.splice(D, 1)
		}
	}
};
Autocomplete.prototype.reset = function() {
	this.input.ignore_keyup = false;
	this.input_last_enter = false;
	this.input.visible_during_reflect = false;
	this.complete(null)
};
Autocomplete.prototype.bind = function() {
	var A = this;
	this.input = el(this.id);
	this.input.ignore_keyup = false;
	this.input.setAttribute("autocomplete", "off");
	var D = function(H) {
		H || (H = window.event);
		var I = (H.charCode) ? H.charCode : ((H.which) ? H.which : H.keyCode);
		if (I == 16) {
			return true
		}
		if (I == 13) {
			A.input.last_enter = true;
			A.input.ignore_keyup = false;
			return true
		}
		if (!A.input.ignore_keyup) {
			A.setTimeoutWithValue(this.value)
		} else {
			A.input.ignore_keyup = false;
			utility.stopEvent(H);
			return false
		}
	};
	GEvent.addDomListener(this.input, "keyup", D);
	this.input.iscommitable = function() {
		var H = !A.list.isVisible() && (this.value.length === 0)
				|| !this.visible_during_reflect || this.last_enter
				|| A.autocommit;
		var I = "[Commit] visible = " + A.list.isVisible() + ", value = "
				+ this.value + ", visible_during_reflect = "
				+ this.visible_during_reflect + ", last_enter = "
				+ this.last_enter + ", ret = " + H;
		return H
	};
	var E = function(J) {
		J || (J = window.event);
		var M = (J.charCode) ? J.charCode : ((J.which) ? J.which : J.keyCode);
		var K = ((is_safari && M == 25 && J.shiftKey) || M == 9);
		var H = J.keyCode === 38 && (!J.charCode || !J.which);
		var I = J.keyCode === 40 && (!J.charCode || !J.which);
		if (H || M == 63232) {
			A.list.handleArrowUp();
			A.input.last_enter = false;
			A.input.ignore_keyup = true;
			utility.stopEvent(J);
			return false
		} else {
			if (I || M == 63233) {
				A.list.handleArrowDown();
				A.input.last_enter = false;
				A.input.ignore_keyup = true;
				utility.stopEvent(J);
				return false
			} else {
				if (M == 27) {
					A.list.handleEscape();
					A.input.last_enter = false;
					A.input.ignore_keyup = true
				} else {
					if (K || M == 13) {
						A.clearTimeout(true);
						A.list.handleEnter();
						if (K) {
							A.input.last_enter = true
						}
						A.input.ignore_keyup = true;
						if (!K && !A.autocommit) {
							if (is_ie) {
								if (A.field && A.field._handle_keydown) {
									return A.field._handle_keydown(J)
								}
							}
							if (is_safari_31 || is_chrome) {
								return true
							}
							utility.stopEvent(J);
							return false
						} else {
							if (A.field && A.field._handle_keydown) {
								return A.field._handle_keydown(J)
							}
							return true
						}
					} else {
						A.input.last_enter = false
					}
				}
			}
		}
		if (A.field && A.field._handle_keydown) {
			return A.field._handle_keydown(J)
		}
	};
	GEvent.addDomListener(this.input, "keydown", E);
	var B = function(J) {
		J || (J = window.event);
		var M = (J.charCode) ? J.charCode : ((J.which) ? J.which : J.keyCode);
		var K = (!(is_ie || is_opera) && ((is_safari && M == 25 && J.shiftKey) || M == 9));
		var H = !is_ie && !is_safari && !is_chrome && J.keyCode === 38
				&& (!J.charCode || !J.which);
		var I = !is_ie && !is_safari && !is_chrome && J.keyCode === 40
				&& (!J.charCode || !J.which);
		if (is_opera && J.which !== 0) {
			H = false;
			I = false
		}
		if (H || M == 63232) {
			utility.stopEvent(J);
			return false
		} else {
			if (I || M == 63233) {
				utility.stopEvent(J);
				return false
			} else {
				if ((K || M == 13) && !this.iscommitable()) {
					utility.stopEvent(J);
					return false
				}
			}
		}
		if (A.field && A.field._handle_keypress) {
			return A.field._handle_keypress(J, K)
		}
	};
	GEvent.addDomListener(this.input, "keypress", B);
	var F = function(H) {
		H || (H = window.event);
		if (A.list.mouseoveritem !== null) {
			A.list.blur_it = true;
			return false
		}
		A.list.blur_timeout = setTimeout(function() {
			A.list.display(false)
		}, 100);
		if (A.field && A.field._handle_blur) {
			return A.field._handle_blur(H)
		}
	};
	if (!is_iphone) {
		GEvent.addDomListener(this.input, "blur", F)
	}
	this.input.visible_during_reflect = false;
	this.input.last_enter = true;
	this.list = new AutocompleteList(this, this.input);
	this.input.list = this.list
};
Autocomplete.prototype.setReflectCallback = function(A) {
	this.callback = A
};
Autocomplete.prototype.setAutoselect = function(A) {
	this.autoselect = A
};
Autocomplete.prototype.setAutocommit = function(A) {
	this.autocommit = A
};
Autocomplete.prototype.setField = function(A) {
	this.field = A
};
Autocomplete.prototype.isCompleting = function() {
	return !!this.completing
};
Autocomplete.prototype.clearTimeout = function(A) {
	if (A || this.isCompleting()) {
		clearTimeout(this.completing)
	}
};
Autocomplete.prototype.setTimeoutWithValue = function(B) {
	var A = this;
	A.clearTimeout();
	this.completing = setTimeout((function() {
		A.complete(B)
	}), Autocomplete.AC_TIMEOUT)
};
Autocomplete.prototype.complete = function(B) {
	var A = this.store.getCompletions(B);
	this.list.updateCompletions(A);
	if (this.has_ghost && (!A || A.length === 0)) {
		this.input.visible_during_reflect = false
	}
};
Autocomplete.prototype.getStore = function() {
	return this.store
};
function AutocompleteList(B, A) {
	this.parent = B;
	this.input = A;
	this.position = null;
	this.is_complete = false;
	this.just_completed = false;
	this.blur_timeout = null;
	this.mouseoveritem = null;
	this.blur_it = false;
	this.last_top = null;
	this.last_left = null;
	this.create()
}
AutocompleteList.prototype.highlightRow = function(E) {
	var A = this.list.getElementsByTagName("li");
	for ( var D = 0, B = A.length; D < B; D++) {
		if (E == D) {
			Utility.addClass(A[D], "highlight")
		} else {
			Utility.removeClass(A[D], "highlight")
		}
	}
};
AutocompleteList.prototype.handleEscape = function() {
	this.list.style.display = "none"
};
AutocompleteList.prototype.isVisible = function() {
	return this.list.style.display !== "none"
};
AutocompleteList.prototype.handleArrowUp = function() {
	if (!this.completions || this.completions.length === 0) {
		return false
	}
	if (!this.isVisible()) {
		this.position = 1;
		this.display(true)
	}
	if (this.position !== null && this.position !== 0) {
		this.position--;
		this.highlightRow(this.position)
	}
};
AutocompleteList.prototype.handleEnter = function() {
	if (!this.isVisible()) {
		return 

	}
	if (this.position === null) {
		this.reflectValue(null)
	} else {
		this.reflectValue(this.completions[this.position])
	}
	this.display(false)
};
AutocompleteList.prototype.handleArrowDown = function() {
	if (!this.completions || this.completions.length === 0) {
		return false
	}
	if (!this.isVisible()) {
		this.position = null;
		this.display(true);
		if (!this.parent.autoselect) {
			return false
		}
	}
	if (this.completions
			&& (this.position !== null && this.position + 1 !== this.completions.length)) {
		this.position++
	} else {
		if (this.position === null) {
			this.position = 0
		}
	}
	this.highlightRow(this.position)
};
AutocompleteList.prototype.reflectValue = function(M) {
	if (M === null) {
		if (this.parent.callback) {
			this.parent.callback(this.input.value, false)
		}
		return false
	}
	var J = this.parent.store.isExtending();
	var E = M;
	if (M instanceof Array) {
		M = M[0]
	}
	this.input.visible_during_reflect = this.isVisible();
	if (J) {
		var F = this.parent.store.getLastStem();
		var H = null;
		var I = this.input.value;
		var D = F;
		if (this.parent.has_prepend_char) {
			H = this.parent.store.getPrependChar();
			I = I.toLowerCase();
			D = D.toLowerCase()
		}
		if (F.length > 0) {
			var K = -1;
			if (H !== null) {
				K = I.lastIndexOf(" " + D);
				if (K === -1) {
					K = I.lastIndexOf(D)
				} else {
					K++
				}
			} else {
				K = I.lastIndexOf(D)
			}
			var B = this.input.value.substring(0, K);
			if (M) {
				if (this.isVisible()) {
					this.parent.store.last_stem = M
				}
				if (H !== null) {
					M = B + H + M
				} else {
					M = B + M
				}
			} else {
				if (H !== null) {
					M = B + H + F
				} else {
					M = B + F
				}
			}
			if (this.isVisible() && exists(this.parent.store.extraChar)) {
				M += this.parent.store.extraChar
			}
		} else {
			M = this.input.value
		}
	}
	var A = M;
	if (E instanceof Array) {
		if (typeof E[0] === "object") {
			M = E[1]
		}
	}
	this.input.focus();
	this.input.value = M;
	this.goToEnd();
	if (this.parent.callback) {
		this.parent.callback(A, true)
	}
};
AutocompleteList.prototype.goToEnd = function() {
	var A = this.input.value.length;
	try {
		if (this.input.setSelectionRange) {
			this.input.setSelectionRange(A, A)
		} else {
			if (this.input.createTextRange) {
				var B = this.input.createTextRange();
				B.moveStart("character", A);
				B.moveEnd("character", 0);
				B.select()
			} else {
				this.input.select()
			}
		}
	} catch (D) {
		return false
	}
};
AutocompleteList.prototype.resizeContainer = function() {
	if (!this.isVisible()) {
		return false
	}
	var F = Autocomplete.findPosition(this.input);
	this.input_left = F[0];
	this.input_top = F[1];
	this.input_width = this.input.clientWidth;
	this.input_height = this.input.clientHeight;
	var E = this.input_top + this.input_height
			+ Autocomplete.AC_LIST_OFFSET_TOP;
	if (this.parent.has_ghost) {
		E += Autocomplete.AC_SMART_ADD_TOP_OFFSET
	}
	if (this.last_top !== E) {
		this.list.style.top = E + "px";
		this.last_top = E
	}
	var A = this.input_left + Autocomplete.AC_LIST_OFFSET_LEFT;
	var D = 0;
	if (this.parent.has_ghost) {
		D = this.parent.store.getGhostWidth();
		var B = this.input_left + this.input_width
				+ Autocomplete.AC_SMART_ADD_LEFT_OFFSET;
		if (A + D > B) {
			A = A + this.input_width
		} else {
			A = A + D
		}
	}
	if (this.last_left !== A) {
		this.list.style.left = A + "px";
		this.last_left = A
	}
	return true
};
AutocompleteList.prototype.create = function() {
	this.list_extra_width = 0;
	this.list_extra_height = 0;
	this.list = document.createElement("div");
	this.list.className = "autocomplete_list";
	this.list.style.position = "absolute";
	this.list.style.top = "0px";
	this.list.style.left = "0px";
	this.mouseoveritem = null;
	this.resizeContainer();
	this.display(false);
	document.body.appendChild(this.list)
};
AutocompleteList.prototype.display = function(A) {
	if (A) {
		this.list.style.display = ""
	} else {
		this.list.style.display = "none";
		this.mouseoveritem = null
	}
};
AutocompleteList.prototype.updateCompletions = function(A) {
	var F = [ "<ul>" ];
	for ( var E = 0, B = A.length; E < B; E++) {
		if (A[E] instanceof Array) {
			if (A[E].length === 3) {
				if (A[E][2] === true) {
					F.push('<li class="line">' + A[E][1] + "</li>")
				} else {
					if (A[E][2] === 1) {
						F.push('<li class="ac_prio1">' + A[E][1] + "</li>")
					} else {
						if (A[E][2] === 2) {
							F.push('<li class="ac_prio2">' + A[E][1] + "</li>")
						} else {
							if (A[E][2] === 3) {
								F.push('<li class="ac_prio3">' + A[E][1]
										+ "</li>")
							} else {
								F.push("<li>" + A[E][1] + "</li>")
							}
						}
					}
				}
			} else {
				F.push("<li>" + A[E][1] + "</li>")
			}
		} else {
			F.push("<li>" + A[E] + "</li>")
		}
	}
	F.push("</ul>");
	this.list.innerHTML = F.join("");
	this.list.style.visibility = "hidden";
	this.display(true);
	if (A && A.length > 0) {
		this.resizeContainer()
	}
	var D = this.list.getElementsByTagName("ul");
	D = D[0];
	this.list_extra_height = D.clientHeight;
	this.list.style.display = "none";
	this.list.style.visibility = "visible";
	this.bindMouseEvents();
	this.completions = A;
	this.position = null;
	this.mouseoveritem = null;
	if (A && A.length > 0) {
		this.handleArrowDown()
	}
};
AutocompleteList.prototype.bindMouseEventsForItem = function(B, A) {
	var D = this;
	B.onmouseover = function() {
		D.highlightRow(A);
		D.mouseoveritem = A
	};
	B.onmouseout = function() {
		D.mouseoveritem = null
	};
	B.onclick = function(E) {
		D.reflectValue(D.completions[A]);
		if (D.blur_timeout) {
			clearTimeout(D.blur_timeout)
		}
		D.input.visible_during_reflect = false;
		D.display(false);
		D.input.focus();
		if (D.blur_it && D.parent.field && D.parent.field._handle_blur) {
			return D.parent.field._handle_blur(E)
		}
		D.blur_it = false
	}
};
AutocompleteList.prototype.bindMouseEvents = function() {
	var A = this.list.getElementsByTagName("li");
	if (!A) {
		return false
	}
	for ( var D = 0, B = A.length; D < B; D++) {
		this.bindMouseEventsForItem(A[D], D)
	}
};
function AutocompleteStore() {
}
AutocompleteStore.prototype.getCompletions = function(A) {
	return [ A + "1", A + "2", A + "3", A + "4" ]
};
AutocompleteStore.prototype.isExtending = function() {
	return false
};
function TagAutocompleteStore() {
	this.extraChar = ", "
}
TagAutocompleteStore.prototype.isExtending = function() {
	return true
};
TagAutocompleteStore.sortTags = function(B, A) {
	if (B[0] < A[0]) {
		return -1
	} else {
		if (B[0] > A[0]) {
			return 1
		}
	}
	if (B[1] < A[1]) {
		return -1
	} else {
		if (B[1] > A[1]) {
			return 1
		}
	}
	return 0
};
TagAutocompleteStore.prototype.formatFound = function(E, F) {
	var B = [];
	for ( var D = 0, A = E.length; D < A; D++) {
		B.push( [
				E[D][0],
				"<b>" + E[D][0].substring(0, F.length) + "</b>"
						+ E[D][0].substring(F.length) ])
	}
	if (B.length > 11) {
		B.length = 11
	}
	return B
};
TagAutocompleteStore.prototype.splitStem = function(E) {
	var D = [];
	var F = E.split(/[\s;,]+/);
	var A = F.length;
	for ( var B = 0; B < A; B++) {
		if (F[B].charAt(0) == '"') {
			if (B < A && F[B + 1]
					&& F[B + 1].charAt(F[B + 1].length - 1) == '"') {
				D.push(F[B] + F[B + 1]);
				B++
			} else {
				D.push(F[B])
			}
		} else {
			D.push(F[B])
		}
	}
	return D
};
TagAutocompleteStore.prototype.getLastStem = function() {
	return this.last_stem
};
TagAutocompleteStore.prototype.getCompletions = function(H) {
	var F = this.splitStem(H);
	H = F[F.length - 1];
	this.last_stem = H;
	if (!H || H.length === 0) {
		return []
	}
	var E = [], I;
	var D = H.toLowerCase(), B;
	for ( var A in tagMgr.index) {
		B = A.toLowerCase();
		if ((I = B.indexOf(D)) == 0) {
			E.push( [ A, I ])
		}
	}
	E.sort(TagAutocompleteStore.sortTags);
	return this.formatFound(E, H)
};
Autocomplete.prototype.handleWindowResize = function() {
	this.list.resizeContainer()
};
function LocationAutocompleteStore() {
	this.extraChar = ", ";
	this.geocoding = false;
	this.geocoding_data = null
}
LocationAutocompleteStore.prototype.setGeocoding = function(A) {
	this.geocoding = !!A;
	this.geocoding_data = A
};
LocationAutocompleteStore.prototype.isGeocoding = function() {
	return this.geocoding
};
LocationAutocompleteStore.prototype.isExtending = function() {
	return false
};
LocationAutocompleteStore.sortLocations = function(B, A) {
	if (B[0] < A[0]) {
		return -1
	} else {
		if (B[0] > A[0]) {
			return 1
		}
	}
	if (B[1] < A[1]) {
		return -1
	} else {
		if (B[1] > A[1]) {
			return 1
		}
	}
	return 0
};
LocationAutocompleteStore.prototype.formatFound = function(E, F) {
	var B = [];
	for ( var D = 0, A = E.length; D < A; D++) {
		B.push( [
				E[D][0],
				"<b>" + E[D][0].substring(0, F.length) + "</b>"
						+ E[D][0].substring(F.length) ])
	}
	if (B.length > 11) {
		B.length = 11
	}
	return B
};
LocationAutocompleteStore.prototype.splitStem = function(B) {
	var A = [];
	var D = B.split(/,+/);
	return D
};
LocationAutocompleteStore.prototype.getLastStem = function() {
	return this.last_stem
};
LocationAutocompleteStore.prototype.getNonGeocodingCompletions = function(H) {
	var F = this.splitStem(H);
	H = F[0];
	this.last_stem = H;
	if (!H || H.length === 0) {
		return []
	}
	var D = H.toLowerCase();
	var E = [], J, B, I;
	for ( var A in locationMgr.locations_) {
		B = locationMgr.locations_[A].name;
		I = B.toLowerCase();
		if ((J = I.indexOf(D)) == 0) {
			E.push( [ B, J ])
		}
	}
	E.sort(LocationAutocompleteStore.sortLocations);
	return this.formatFound(E, H)
};
LocationAutocompleteStore.prototype.getGeocodingCompletions = function(E) {
	var B = [];
	for ( var D = 0, A = this.geocoding_data.length; D < A; D++) {
		if (this.geocoding_data[D]["address"]) {
			B
					.push( [ this.geocoding_data[D],
							this.geocoding_data[D]["address"] ])
		}
	}
	if (B.length > 11) {
		B.length = 11
	}
	return B
};
LocationAutocompleteStore.prototype.getCompletions = function(B) {
	if (!this.isGeocoding() || this.geocoding_data === null) {
		return this.getNonGeocodingCompletions(B)
	} else {
		var A = this.getGeocodingCompletions(B);
		this.setGeocoding(null);
		return A
	}
};
function Field(B, A) {
	this.id = B;
	if (A) {
		this.image = imageMgr.getImage(A, true)
	} else {
		this.image = null
	}
	this.div = el(B);
	this.mbn = null;
	this.inited = false;
	this.shared = false;
	this.last_key_ = null;
	this.title = null;
	this.value = null;
	this.fieldValue = null;
	this.klass = null;
	this.defaultValue = null;
	this.state = Field.FIELD_STATE_DISPLAY;
	this.enabled = true;
	this.hidden = false;
	this.escape = true;
	this.count = null;
	this.lockable = false;
	this.neverEmpty = false;
	this.newLine = false;
	this.delayHide = false;
	this.table = false;
	this.input = null;
	this.highlightable = false;
	this.autocompleteStore = null;
	this.autocomplete = null;
	this.autocomplete_autocommit = false;
	this.blitted = 0;
	this.nextField = null;
	this.previousField = null
}
Field.FIELD_STATE_DISPLAY = 0;
Field.FIELD_STATE_EDIT = 1;
Field.prototype.init = function() {
	this.inited = true;
	this.mbn = this.getUniqueMessageBusName();
	this.title = null;
	this.value = null;
	this.fieldValue = null;
	this.defaultValue = null;
	this.state = Field.FIELD_STATE_DISPLAY;
	this.enabled = true;
	this.hidden = false;
	this.escape = true;
	this.count = null;
	this.delayHide = false;
	this.table = false;
	this.input = null
};
Field.prototype.getUniqueMessageBusName = function() {
	return "rtm.fields." + this.id + "."
};
Field.prototype.show = function() {
	if (this.hidden) {
		this.hide()
	} else {
		this.div.style.display = ""
	}
};
Field.prototype.hide = function() {
	this.div.style.display = "none"
};
Field.prototype.setHidden = function(A) {
	this.hidden = A
};
Field.prototype.setShared = function(A) {
	this.shared = A
};
Field.prototype.setDelayedHide = function(A) {
	this.delayHide = A
};
Field.prototype.setLockable = function(A) {
	this.lockable = A
};
Field.prototype.setHighlightable = function(A) {
	this.highlightable = A
};
Field.prototype.setNeverEmpty = function(A) {
	this.neverEmpty = A
};
Field.prototype.setNewLineAfterTitle = function(A) {
	this.newLine = A
};
Field.prototype.setTitle = function(A) {
	this.title = A
};
Field.prototype.setAutocompleteStore = function(A) {
	this.autocompleteStore = A
};
Field.prototype.setAutocompleteAutocommit = function(A) {
	this.autocomplete_autocommit = A
};
Field.prototype.setCount = function(A) {
	this.count = A
};
Field.prototype.setKlass = function(A) {
	this.klass = A
};
Field.prototype.setEscape = function(A) {
	this.escape = A
};
Field.prototype.setTable = function(A) {
	this.table = A
};
Field.prototype.setValue = function(B, A) {
	if (A || (this.value !== B && B !== null)) {
		this.value = B;
		if (this.state == Field.FIELD_STATE_DISPLAY) {
			this.blit()
		}
		return true
	}
	return false
};
Field.prototype.setFieldValue = function(B, A) {
	if (A || (this.fieldValue !== B && B !== null)) {
		this.fieldValue = B;
		if (this.state == Field.FIELD_STATE_DISPLAY) {
			this.blit()
		}
		return true
	}
	return false
};
Field.prototype.setDefaultValue = function(A) {
	this.defaultValue = A
};
Field.prototype.setEnabled = function(A) {
	this.enabled = A
};
Field.prototype.setNextField = function(A) {
	this.nextField = A
};
Field.prototype.setPreviousField = function(A) {
	this.previousField = A
};
Field.handleTabPress = function(A, B, D) {
	if (is_safari_2) {
		A.fieldKeyPressed = true
	}
	view.inTab = true;
	var E = A.delayHide;
	A.delayHide = false;
	A.stopEditing(D);
	A.delayHide = E;
	if (A.id == "detailstitle" && view.getViewToken("Tasks", "Tasks")) {
		if (!B.shiftKey) {
			tasksView.taskDetails.detailsDue.startEditing()
		} else {
			tasksView.taskDetails.detailsURL.startEditing()
		}
	} else {
		if (B.shiftKey && A.id == "detailsdue"
				&& view.getViewToken("Tasks", "Tasks")) {
			tasksView.taskDetails.fieldsTitle.startEditing()
		} else {
			if (!B.shiftKey && A.id == "detailsurl"
					&& view.getViewToken("Tasks", "Tasks")) {
				tasksView.taskDetails.fieldsTitle.startEditing()
			}
		}
	}
	if (B.shiftKey === false && A.nextField !== null) {
		A.nextField.startEditing()
	} else {
		if (B.shiftKey === true && A.previousField !== null) {
			A.previousField.startEditing()
		}
	}
	if (!is_safari_2) {
		utility.stopEvent(B)
	}
	view.inTab = false;
	return false
};
Field.prototype.startEditing = function() {
	if (!this.enabled) {
		return false
	}
	messageBus.broadcast(this, this.mbn + "editStarted");
	this.state = Field.FIELD_STATE_EDIT;
	if (this.lockable) {
		view.setViewLocked(true)
	}
	this.last_key_ = null;
	var J = document.getElementById(this.id + "_span");
	if (!J) {
		this.blit()
	}
	var B = this.klass ? ' class="' + this.klass + '"' : "";
	var I = this.fieldValue || this.value || this.defaultValue || "";
	var F = '<form style="display: inline;" autocomplete="off" ' + B
			+ '><div style="display: inline;" ' + B + "><input id="
			+ quoted(this.id + "_editfield")
			+ ' style="display: inline;" type="text" value="'
			+ I.escapeForField() + '" ' + B + "></input></div></form>";
	J.innerHTML = F;
	var H = J.getElementsByTagName("input")[0];
	this.input = H;
	var K = this;
	if (this.autocompleteStore) {
		if (this.autocomplete) {
			delete this.autocomplete
		}
		this.autocomplete = new Autocomplete(this.id + "_editfield",
				this.autocompleteStore);
		this.autocomplete.setAutocommit(this.autocomplete_autocommit);
		this.autocomplete.setField(this)
	}
	H.focus();
	H.select();
	H.focus();
	var E = function(M) {
		if (K.state !== Field.FIELD_STATE_EDIT) {
			return true
		}
		if (is_safari_2 && (K.fieldKeyPressed || K.blurring)) {
			K.blurring = false;
			return true
		}
		if (is_safari_2) {
			K.blurring = true
		}
		K.stopEditing(H.value);
		return false
	};
	if (is_ie) {
		var D = function(M) {
			M || (M = window.event);
			var O = (M.charCode) ? M.charCode : ((M.which) ? M.which
					: M.keyCode);
			if (O == 9) {
				Field.handleTabPress(K, M, H.value);
				return false
			}
		}
	}
	var A = function(M) {
		M || (M = window.event);
		var O = (M.charCode) ? M.charCode : ((M.which) ? M.which : M.keyCode);
		if (!(is_ie || is_opera)
				&& ((is_safari && O == 25 && M.shiftKey) || O == 9)) {
			Field.handleTabPress(K, M, H.value);
			return false
		} else {
			if (O == 13 || (is_safari && O == 3) || (is_iphone && O == 10)) {
				if (is_safari_2) {
					K.fieldKeyPressed = true
				}
				K.stopEditing(H.value);
				utility.stopEvent(M);
				return false
			} else {
				if (O == 27) {
					if (is_safari_2) {
						K.fieldKeyPressed = true
					}
					K.stopEditing(null);
					if (!is_safari_2) {
						utility.stopEvent(M)
					}
					return false
				}
			}
		}
	};
	if (is_safari_31 || is_chrome) {
		var D = A
	}
	if (!this.autocompleteStore) {
		if (!is_iphone) {
			GEvent.addDomListener(H, "blur", E)
		}
		if (is_ie || is_safari_31 || is_chrome) {
			GEvent.addDomListener(H, "keydown", D)
		}
		GEvent.addDomListener(H, "keypress", A)
	} else {
		if (!is_iphone) {
			this._handle_blur = E
		} else {
			this._handle_blur = null
		}
		if (is_ie || is_safari_31 || is_chrome) {
			this._handle_keydown = D
		} else {
			this._handle_keydown = null
		}
		this._handle_keypress = A
	}
};
Field.prototype.stopEditing = function(E) {
	if (this.autocomplete) {
		Autocomplete.removeInstance(this.autocomplete)
	}
	if (this.input && is_safari_2) {
		this.input.blur()
	}
	var B = E ? E.trim() : "";
	this.state = Field.FIELD_STATE_DISPLAY;
	if (!(this.neverEmpty && B.length === 0)
			&& (((this.fieldValue && this.setFieldValue(E) == true) || (!this.fieldValue && this
					.setValue(E) == true)) && !(this.lockable && E.trim()
					.toLowerCase() == "<multiple>"))) {
		messageBus.broadcast(this, this.mbn + "editFinished", E)
	} else {
		messageBus.broadcast(this, this.mbn + "editCancelled", E);
		if (this.delayHide) {
			var A = this;
			var D = function() {
				A.blit()
			};
			setTimeout(D, 500)
		} else {
			this.blit()
		}
	}
	if (this.lockable) {
		view.setViewLocked(false)
	}
	this.fieldKeyPressed = false
};
Field.prototype.safeBlit = function() {
	if (this.state == Field.FIELD_STATE_DISPLAY) {
		this.blit();
		return true
	}
	return false
};
Field.prototype.getKey = function() {
	return [ this.title, this.newLine, this.value, this.count, this.table,
			this.enabled, this.highlightable, this.state ].join(":")
};
Field.SHARED_KEYS_ = {};
Field.testSharedKey = function(B) {
	if (B.id) {
		var A = B.getKey();
		if (!(B.id in Field.SHARED_KEYS_)) {
			Field.SHARED_KEYS_[B.id] = A;
			return false
		} else {
			if (A === Field.SHARED_KEYS_[B.id]) {
				return true
			}
			Field.SHARED_KEYS_[B.id] = A;
			return false
		}
	}
	return false
};
Field.prototype.blit = function() {
	if (this.last_key_ !== null) {
		if (this.shared === false) {
			var A = this.getKey();
			if (A === this.last_key_) {
				return this.html
			}
			this.last_key_ = A
		} else {
			if (Field.testSharedKey(this)) {
				return this.html
			}
		}
	}
	var H = [];
	var F = this.title ? (this.title + ": " + (this.newLine ? "<br />" : ""))
			: null;
	var I = this.value || this.defaultValue || null;
	I = I ? I : null;
	I = I && this.escape ? I.escapeForDisplay() : I;
	var E = this.count ? '<br /><span class="fieldcount">(' + this.count
			+ ")</span>" : null;
	if (this.table === false) {
		var J = (F || "") + '<span class="field" id='
				+ quoted(this.id + "_span") + ">" + (I || "") + "</span>"
				+ (E || "");
		H.push(J);
		if (this.image && this.enabled) {
			var B = '<a href=" " title=' + quoted(this.image.title)
					+ '><img class="field_img" src=' + quoted(this.image.src)
					+ " alt=" + quoted(this.image.alt) + " /></a>";
			H.push(B)
		}
	} else {
		var J = "<div id=" + quoted(this.id + "_span") + ">" + (I || "")
				+ "</div>" + (E || "");
		var B = '<a href=" " title=' + quoted(this.image.title)
				+ '><img class="field_img" src=' + quoted(this.image.src)
				+ " alt=" + quoted(this.image.alt) + " /></a>";
		H.push("<table><tbody><tr><td>" + (F || "&nbsp;") + "</td><td>" + J
				+ '</td><td style="vertical-align: bottom;">' + B
				+ "</td></tr></tbody></table>")
	}
	this.html = "<span id=" + quoted(this.id + "_highlight") + ">" + H.join("")
			+ "</span>";
	this.div.innerHTML = this.html;
	if (this.image && this.enabled) {
		var D = this.div.getElementsByTagName("img");
		D = D.length > 0 ? D[0] : null;
		if (D) {
			var K = this;
			var J = el(this.id + "_highlight");
			D.onclick = function(M) {
				if (is_safari_3 && J && "onclick" in J) {
					return false
				}
				K.startEditing();
				return false
			}
		}
	}
	if (this.highlightable && this.enabled) {
		var J = el(this.id + "_highlight");
		J.onmouseover = function() {
			this.style.backgroundColor = "#FFFFCC";
			this.style.cursor = "pointer";
			this.style.paddingTop = "2px";
			this.style.paddingBottom = "2px"
		};
		J.onmouseout = function() {
			this.style.backgroundColor = "";
			this.style.cursor = ""
		};
		if (this.image) {
			J.onclick = function(O) {
				O || (O = window.event);
				var Q = utility.getEventTarget(O);
				if (Q == null) {
					return true
				}
				var M = Q.tagName.toLowerCase();
				if (M == "a" || M == "input") {
					return true
				}
				this.onmouseover = function() {
				};
				this.onmouseout();
				K.startEditing();
				return false
			}
		}
		if (this.image.title) {
			J.setAttribute("title", this.image.title)
		}
	}
	return this.html
};
function FieldGroup(B, A) {
	this.id = B;
	this.div = el(B);
	if (A) {
		this.fieldsTitleId = A;
		this.fieldsTitle = new Field(A, "edit");
		this.fieldsTitle.init();
		this.fieldsTitle.setEnabled(false);
		this.fieldsTitle.setLockable(true);
		this.fieldsTitle.setNeverEmpty(true);
		this.fieldsTitle.setHighlightable(true);
		this.fieldsTitle.setShared(true);
		this.fieldsTitle.safeBlit()
	}
	this.inited = false;
	this.fields = []
}
FieldGroup.prototype.init = function() {
	this.inited = true
};
FieldGroup.prototype.addField = function(A, B) {
	this.fields.push(B);
	this[A] = B
};
FieldGroup.prototype.show = function() {
	for ( var A = 0; A < this.fields.length; A++) {
		this.fields[A].show()
	}
	this.div.style.display = ""
};
FieldGroup.prototype.hide = function() {
	for ( var A = 0; A < this.fields.length; A++) {
		this.fields[A].hide()
	}
	this.div.style.display = "none"
};
FieldGroup.prototype.enable = function() {
	for ( var A = 0; A < this.fields.length; A++) {
		this.fields[A].setEnabled(true);
		this.fields[A].safeBlit()
	}
	if (this.fieldsTitle) {
		this.fieldsTitle.setEnabled(true);
		this.fieldsTitle.safeBlit()
	}
};
FieldGroup.prototype.disable = function() {
	for ( var A = 0; A < this.fields.length; A++) {
		this.fields[A].setEnabled(false);
		this.fields[A].safeBlit()
	}
	if (this.fieldsTitle) {
		this.fieldsTitle.setEnabled(false);
		this.fieldsTitle.safeBlit()
	}
};
function Adder(A) {
	this.id = A;
	this.div = el(A);
	this.type = Adder.ADDER_TYPE_TASK;
	this.mbn = null
}
Adder.ADDER_TYPE_TASK = 0;
Adder.ADDER_TYPE_CONTACT = 1;
Adder.ADDER_TYPE_GROUP = 2;
Adder.ADDER_TYPE_LIST = 3;
Adder.prototype.init = function() {
	this.type = Adder.ADDER_TYPE_TASK;
	this.mbn = this.getUniqueMessageBusName();
	this.disabled = false;
	this.blit();
	var A = this;
	this.div.onclick = function(B) {
		if (A.disabled) {
			return Offline.onDisabledClick(B)
		}
		messageBus.broadcast(A, A.mbn + "adderClicked", A.type);
		return false
	}
};
Adder.prototype.getUniqueMessageBusName = function() {
	return "rtm.adders." + this.id + "."
};
Adder.prototype.show = function() {
	var A = true;
	if (this.type == Adder.ADDER_TYPE_TASK) {
		if (view.getSelected() == "Tasks") {
			this.div.style.display = "none";
			A = false;
			SmartAdd.getInstance().display(true)
		}
	} else {
		this.div.style.visibility = "visible"
	}
	if (A) {
		this.div.style.display = ""
	}
};
Adder.prototype.hide = function() {
	if (this.type == Adder.ADDER_TYPE_TASK && view.getSelected() == "Tasks") {
		this.div.style.display = "none";
		SmartAdd.getInstance().display(false)
	} else {
		this.div.style.display = "none"
	}
};
Adder.prototype.blit = function() {
	var A = this.div.getElementsByTagName("img")[0];
	var D = this.div.getElementsByTagName("a")[0];
	var E = Offline.isNotOnline();
	var B = null;
	Utility.removeClass(D, "disabled");
	this.disabled = false;
	switch (this.type) {
	case Adder.ADDER_TYPE_TASK:
		B = "INTERFACE_TASKS_ADD_TASK";
		this.div.className = "addEntryTask";
		break;
	case Adder.ADDER_TYPE_CONTACT:
		B = "INTERFACE_CONTACTS_ADD_CONTACT";
		if (E) {
			this.disabled = true;
			Utility.addClass(D, "disabled")
		}
		this.div.className = "";
		break;
	case Adder.ADDER_TYPE_GROUP:
		B = "INTERFACE_CONTACTS_GROUPS_ADD_GROUP";
		if (E) {
			this.disabled = true;
			Utility.addClass(D, "disabled")
		}
		this.div.className = "";
		break;
	case Adder.ADDER_TYPE_LIST:
		B = "INTERFACE_SETTINGS_LISTS_ADD_LIST";
		if (E) {
			this.disabled = true;
			Utility.addClass(D, "disabled")
		}
		this.div.className = "";
		break;
	default:
		break
	}
	A.alt = _T("INTERFACE_TASKS_TOOLTOP_ADD", {
		"KEY" : "t"
	});
	D.innerHTML = _T(B)
};
Adder.prototype.setType = function(A) {
	this.type = A
};
function View(A) {
	this.id = A;
	this.span = el(A);
	this.entries = [];
	this.map = {};
	this.html = null;
	this.objs = {};
	this.names = {};
	this.mbn = null;
	this.selected = null;
	this.shareMode = null;
	this.publicMode = false;
	this.multiEditMode = false;
	this.viewLocked = false;
	this.inUndo = false;
	this.clickedLink = false;
	this.waitingForClick = false;
	this.bulk = View.BULK_RESET;
	this.inTab = false
}
View.prototype.init = function() {
	this.mbn = this.getUniqueMessageBusName();
	var A = this;
	var B = function(D, E) {
		A.viewChanged(E)
	};
	messageBus.subscribe(B, this.mbn + "viewChanged")
};
View.prototype.setShareMode = function(A) {
	this.shareMode = A
};
View.prototype.setPublicMode = function(A) {
	this.publicMode = A
};
View.prototype.getPublicMode = function() {
	return this.publicMode
};
View.prototype.setInUndo = function(A) {
	this.inUndo = A
};
View.prototype.getInUndo = function() {
	return this.inUndo
};
View.prototype.setViewLocked = function(A) {
	this.viewLocked = A;
	messageBus.broadcast(this, this.mbn + "viewLocked", A)
};
View.prototype.getViewLocked = function() {
	return this.viewLocked
};
View.BULK_START = 0;
View.BULK_MODIFIED = 1;
View.BULK_END = 2;
View.BULK_IGNORE = 3;
View.BULK_REFRESH = 4;
View.BULK_RESET = 5;
View.BULK_MODIFIED_END = 6;
View.prototype.setBulk = function(A) {
	this.bulk = A
};
View.prototype.getBulk = function() {
	return this.bulk
};
View.prototype.setMultiEditMode = function(A) {
	this.multiEditMode = A
};
View.prototype.isNewUI = function() {
	var A = false;
	if (configurationMgr && "configuration" in configurationMgr
			&& "smart_add" in configurationMgr.configuration) {
		A = configurationMgr.configuration.smart_add
	}
	return A
};
View.prototype.getMultiEditMode = function(A) {
	var B = this.isNewUI() || this.multiEditMode;
	return B && (!A || (A && !tasksView.getHovering()))
};
View.prototype.toggleMultiEditMode = function() {
	var A = !this.getMultiEditMode();
	this.setMultiEditMode(A);
	messageBus
			.broadcast(this, this.mbn + "modeChanged", [ "multiEditMode", A ])
};
View.prototype.fakeMultiEdit = function(A) {
	messageBus
			.broadcast(this, this.mbn + "modeChanged", [ "multiEditMode", A ])
};
View.prototype.setClickedLink = function(A) {
	this.clickedLink = A
};
View.prototype.getClickedLink = function() {
	return this.clickedLink
};
View.prototype.setWaitingForClick = function(A) {
	this.waitingForClick = A
};
View.prototype.getWaitingForClick = function() {
	return this.waitingForClick
};
View.prototype.getSelected = function() {
	var A = this.entries[this.selected];
	if (A) {
		return A.toString()
	} else {
		return null
	}
};
View.prototype.viewChanged = function(F) {
	var D = F[0][0];
	var E = F[0][1];
	var A = F[1][0];
	var B = F[1][1];
	if (E !== null && this.objs[E] !== null) {
		this.objs[E].hide()
	}
	if (B !== null && this.objs[B] !== null) {
		this.objs[B].show()
	}
};
View.prototype.getUniqueMessageBusName = function() {
	return "rtm.view."
};
View.prototype.addEntry = function(B, D, A) {
	this.map[B[0]] = this.entries.length;
	this.objs[B[0]] = D;
	this.names[B[0]] = A || B[0];
	this.entries.push(B)
};
View.prototype.selectView = function(D, B) {
	var A = this.selected;
	this.selected = this.map[D];
	if (this.selected === null || this.selected === A) {
		return false
	}
	this.blitSpan();
	messageBus.broadcast(this, this.mbn + "viewChanged", [
			[ A, (A !== null ? this.entries[A][0] : null) ],
			[ this.selected, D ] ]);
	if (!B) {
		if (!is_safari) {
			window.location.href = "#section." + D.toLowerCase()
		}
	}
};
View.prototype.isDisabledForOffline = function(A) {
	if (A === "Locations" || A === "Logout") {
		return true
	}
	return false
};
View.prototype.blitSpan = function() {
	var I = [];
	for ( var D = 0; D < this.entries.length; D++) {
		var A = this.entries[D].length > 1;
		var H = A ? this.entries[D][1][0] : "#section."
				+ this.entries[D][0].toLowerCase();
		var E = null;
		if (A) {
			E = this.entries[D][1][1] ? "_blank" : null
		}
		if (this.selected !== D) {
			if (Offline.isReady() && !Offline.isOnline()
					&& this.isDisabledForOffline(this.entries[D][0])) {
				I.push('<a class="disabled" href=' + quoted(H) + " "
						+ (E ? "target=" + quoted(E) : "") + ">"
						+ this.names[this.entries[D][0]] + "</a>")
			} else {
				I.push("<a href=" + quoted(H) + " "
						+ (E ? "target=" + quoted(E) : "") + ">"
						+ this.names[this.entries[D][0]] + "</a>")
			}
		} else {
			I.push('<span style="font-weight: bold;">'
					+ this.names[this.entries[D][0]] + "</span>")
		}
	}
	this.html = I.join(" | ");
	this.span.innerHTML = this.html;
	var K = this.span.getElementsByTagName("a");
	for ( var D = 0; D < this.entries.length; D++) {
		var B = D;
		if (this.selected === D) {
			continue
		}
		if (this.selected !== null && D > this.selected) {
			B--
		}
		var H = K[B];
		var M = this;
		var J = this.entries[D][0];
		var F = D;
		H.pos = D;
		H.entry = J;
		H.onclick = function(O) {
			if (Utility.hasClass(this, "disabled")) {
				this.blur();
				Offline.Dialog.showDisabledAction();
				return false
			}
			if (M.entries[this.pos].length > 1) {
				return true
			} else {
				view.selectView(this.entry, true);
				return true
			}
		}
	}
};
View.prototype.getViewTabs = function() {
	switch (this.getSelected()) {
	case "Overview":
		return overviewTabs;
	case "Tasks":
		return listTabs;
	case "Contacts":
		return contactsTabs;
	case "Settings":
		return settingsTabs;
	default:
		break
	}
	return null
};
View.prototype.getViewDetailTabs = function() {
	switch (this.getSelected()) {
	case "Tasks":
		if (taskList.getViewList().selected.length > 0) {
			return taskTabs
		} else {
			return detailstab
		}
	case "Contacts":
		return contactsdetailstab;
	case "Settings":
		return settingsdetailstab;
	default:
		break
	}
	return null
};
View.prototype.getViewList = function() {
	switch (this.getSelected()) {
	case "Tasks":
		return taskList.getViewList();
	case "Contacts":
		var A = contactsView.getSelected();
		if (A == _T("INTERFACE_CONTACTS_CONTACTS_TAB")) {
			return contactList.list
		} else {
			if (A == _T("INTERFACE_CONTACTS_GROUPS_TAB")) {
				return groupList.list
			}
		}
		break;
	case "Settings":
		var A = settingsView.getSelected();
		if (settingsView.getSelected() == _T("INTERFACE_SETTINGS_LISTS_TAB")) {
			return listList.list
		} else {
			if (settingsView.getSelected() == _T("INTERFACE_SETTINGS_LOCATIONS_TAB")) {
				return locationList.list
			} else {
				if (settingsView.getSelected() == _T("INTERFACE_TASKS_TASK_DETAILS_TAGS")) {
					return tagList.list
				}
			}
		}
		break;
	default:
		break
	}
	return null
};
View.prototype.getViewToken = function(B, E) {
	var H = this.getSelected();
	if (H === B && !is(E)) {
		return true
	}
	switch (this.getSelected()) {
	case "Tasks":
		if (B == "Tasks") {
			var D = taskList.getViewList().selected.length;
			var F = tasksView.getSelected();
			var I = taskTabs.getSelected();
			var A = detailstab.getSelected();
			if ((D > 0 && E == "Tasks" && I == _T("INTERFACE_TASKS_TASK_DETAILS_TASK_TAB"))
					|| (tasksView.getHovering() && E == "Tasks" && I == _T("INTERFACE_TASKS_TASK_DETAILS_TASK_TAB"))) {
				return true
			} else {
				if (D > 0
						&& E == "Notes"
						&& I == _T("INTERFACE_TASKS_TASK_DETAILS_NOTES_TAB")
						|| (tasksView.getHovering() && E == "Notes" && I == _T("INTERFACE_TASKS_TASK_DETAILS_NOTES_TAB"))) {
					return true
				} else {
					if (D === 0 && E == "List"
							&& (A == _T("INTERFACE_TASKS_LIST_DETAILS_LIST"))) {
						return true
					} else {
						if (D === 0
								&& E == "Share"
								&& A == _T("INTERFACE_TASKS_LIST_DETAILS_SHARE")) {
							return true
						} else {
							if (D === 0
									&& E == "Publish"
									&& A == _T("INTERFACE_TASKS_LIST_DETAILS_PUBLISH")) {
								return true
							} else {
								if (D === 0 && E == "Save"
										&& A == _T("INTERFACE_TASKS_SAVE_TAB")) {
									return true
								}
							}
						}
					}
				}
			}
			return false
		}
		return false;
	case "Contacts":
		if (B == "Contacts") {
			var D = contactsView.getSelected();
			if (E == "Contacts" && D == _T("INTERFACE_CONTACTS_CONTACTS_TAB")) {
				return true
			} else {
				if (E == "Groups" && D == _T("INTERFACE_CONTACTS_GROUPS_TAB")) {
					return true
				} else {
					if (E == "Invites"
							&& D == _T("INTERFACE_CONTACTS_INVITES_TAB")) {
						return true
					}
				}
			}
			return D === E
		}
		return false;
	case "Settings":
		if (B == "Settings") {
			var D = settingsView.getSelected();
			if (E == "General" && D == _T("INTERFACE_SETTINGS_GENERAL_TAB")) {
				return true
			} else {
				if (E == "Lists" && D == _T("INTERFACE_SETTINGS_LISTS_TAB")) {
					return true
				} else {
					if (E == "Locations"
							&& D == _T("INTERFACE_SETTINGS_LOCATIONS_TAB")) {
						return true
					} else {
						if (E == "Reminders"
								&& D == _T("INTERFACE_SETTINGS_REMINDERS_TAB")) {
							return true
						} else {
							if (E == "Services"
									&& D == _T("INTERFACE_SETTINGS_SERVICES_TAB")) {
								return true
							} else {
								if (E == "Sync"
										&& D == _T("INTERFACE_SYNC_TITLE")) {
									return true
								} else {
									if (E == "Tags"
											&& D == _T("INTERFACE_TASKS_TASK_DETAILS_TAGS")) {
										return true
									} else {
										if (E == "Info"
												&& D == _T("INTERFACE_SETTINGS_INFO_TAB")) {
											return true
										}
									}
								}
							}
						}
					}
				}
			}
			return D === E
		}
		return false;
	default:
		break
	}
	return null
};
View.prototype.adjustWidths = function() {
	var A = getWindowSize()[0];
	if (A < 890) {
		Utility.addClass(document.body, "v1");
		Utility.removeClass(document.body, "v2")
	} else {
		if (A < 1000) {
			Utility.addClass(document.body, "v2");
			Utility.removeClass(document.body, "v1")
		} else {
			Utility.removeClass(document.body, "v2");
			Utility.removeClass(document.body, "v1")
		}
	}
	if (is_opera) {
		el("searchboxwrap").style.display = "none";
		el("searchboxwrap").style.display = ""
	}
	if (!view.getPublicMode() && locationMgr && locationMgr.isInitialized()) {
		locationMgr.checkResize()
	}
	Autocomplete.handleWindowResize(true);
	SmartAdd.getInstance().onWindowResize();
	Control.redrawSnake();
	if (Offline.Dialog.isDisplayed()) {
		Offline.Dialog.show()
	}
	if (!noteMgr.hidden_) {
		setTimeout(function() {
			noteMgr.checkContainerSize()
		}, 1)
	}
};
View.applyBodyStyle = function() {
	if (is_ie6) {
		Utility.addClass(document.body, "ie ie6")
	} else {
		if (is_ie7) {
			Utility.addClass(document.body, "ie ie7")
		} else {
			if (is_safari_3) {
				Utility.addClass(document.body, "sf3")
			} else {
				if (is_safari) {
					Utility.addClass(document.body, "sf2")
				} else {
					if (is_gecko18) {
						Utility.addClass(document.body, "ff2")
					} else {
						if (is_iphone) {
							Utility.addClass(document.body, "iphone")
						} else {
							if (is_opera) {
								Utility.addClass(document.body, "op")
							}
						}
					}
				}
			}
		}
	}
};
window.onscroll = function() {
	if (Offline.Dialog.isDisplayed()) {
		Offline.Dialog.show()
	}
};
function ViewBase() {
	this.inited = false;
	this.objs = [];
	this.states = [];
	this.selected = null;
	this.currentStateObjs = null;
	this.mbn = null
}
ViewBase.prototype.init = function() {
	this.inited = true
};
ViewBase.prototype.addObject = function(A) {
	if (typeof A == "string") {
		this.objs.push(el(A))
	} else {
		this.objs.push(A)
	}
};
ViewBase.prototype.addState = function(A, E, F, H) {
	var I = [];
	var D = [];
	if (E !== null) {
		for ( var B = 0; B < E.length; B++) {
			if (typeof E[B] == "string") {
				I.push(el(E[B]))
			} else {
				I.push(E[B])
			}
		}
	}
	if (F !== null) {
		for ( var B = 0; B < F.length; B++) {
			if (typeof F[B] == "string") {
				D.push(el(F[B]))
			} else {
				D.push(F[B])
			}
		}
	}
	this.states.push( [ A, I, D ]);
	if (H) {
		if (!("rtm_done" in H)) {
			H.rtm_done = true;
			var K = this;
			var J = function(M, O) {
				K.switchState(O[1][1])
			};
			messageBus.subscribe(J, H.mbn + "tabChanged")
		}
	}
};
ViewBase.prototype.switchState = function(H) {
	var D = null;
	for ( var E = 0; E < this.states.length; E++) {
		var F = this.states[E];
		if (F[0] != H) {
			var A = F[1];
			for ( var B = 0; B < A.length; B++) {
				if (A[B].hide) {
					A[B].hide()
				} else {
					A[B].style.display = "none"
				}
			}
		} else {
			this.selected = F[0];
			D = [ F[1], F[2] ]
		}
	}
	if (D !== null) {
		var A = D[0];
		for ( var E = 0; E < A.length; E++) {
			if (A[E].show) {
				A[E].show()
			} else {
				A[E].style.display = ""
			}
		}
		this.currentStateObjs = D
	}
};
ViewBase.prototype.show = function() {
	for ( var D = 0; D < this.objs.length; D++) {
		if (this.objs[D].show) {
			this.objs[D].show()
		} else {
			this.objs[D].style.display = ""
		}
	}
	if (this.currentStateObjs !== null) {
		var A = this.currentStateObjs[0];
		var B = this.currentStateObjs[1];
		for ( var D = 0; D < B.length; D++) {
			if (B[D].hide) {
				B[D].hide()
			} else {
				B[D].style.display = "none"
			}
		}
		for ( var D = 0; D < A.length; D++) {
			if (A[D].show) {
				A[D].show()
			} else {
				A[D].style.display = ""
			}
		}
	} else {
		if (this.states.length > 0) {
			this.switchState(this.states[0][0])
		}
	}
};
ViewBase.prototype.hide = function() {
	for ( var B = 0; B < this.objs.length; B++) {
		if (this.objs[B].hide) {
			this.objs[B].hide()
		} else {
			this.objs[B].style.display = "none"
		}
	}
	if (this.currentStateObjs !== null) {
		var A = this.currentStateObjs[0];
		for ( var B = 0; B < A.length; B++) {
			if (A[B].hide) {
				A[B].hide()
			} else {
				A[B].style.display = "none"
			}
		}
	}
};
ViewBase.prototype.getSelected = function() {
	return this.selected
};
ViewBase.prototype.getUniqueMessageBusName = function() {
	return this.mbn
};
function Overview() {
	this.inited = false;
	this.objs = [];
	this.states = [];
	this.selected = null;
	this.currentStateObjs = null;
	this.mbn = "rtm.views.overview";
	this.continueTasks = el("continue_tasks");
	this.continueTasksAlways = el("continue_tasks_always");
	this.continueTasks.onclick = function(A) {
		messageBus.broadcast(configurationMgr, configurationMgr.mbn
				+ "continueToTasks", [ false, false ]);
		return false
	};
	this.continueTasksAlways.onclick = function(A) {
		messageBus.broadcast(configurationMgr, configurationMgr.mbn
				+ "continueToTasks", [ true, false ]);
		return false
	}
}
extendObject(Overview, ViewBase);
Overview.prototype.createWeeklyPlanner = function() {
	this.weeklyPlanner = document.createElement("span");
	this.weeklyPlanner.id = "weeklyplanner";
	var A = document.createElement("a");
	A.href = "/printplanner/" + rtmUsername + "/";
	A.title = _T("INTERFACE_PRINT_WEEKLY_PLANNER");
	A.target = "_blank";
	A.innerHTML = '<img src="'
			+ Utility.getImageUrl("/img/ico/ico_weeklyplanner.gif") + '" alt="'
			+ _T("INTERFACE_PRINT_WEEKLY_PLANNER") + '" />';
	A.style.display = "inline";
	this.weeklyPlanner.appendChild(A);
	A = document.createElement("a");
	A.href = "/printplanner/" + rtmUsername + "/";
	A.title = _T("INTERFACE_PRINT_WEEKLY_PLANNER");
	A.target = "_blank";
	A.innerHTML = _T("INTERFACE_WEEKLY_PLANNER");
	A.style.display = "inline";
	A.id = "overview-wp-link";
	this.weeklyPlanner.appendChild(A);
	el("overviewtabs").appendChild(this.weeklyPlanner)
};
function TasksView() {
	this.inited = false;
	this.objs = [];
	this.states = [];
	this.selected = null;
	this.currentStateObjs = null;
	this.mbn = "rtm.views.tasks";
	this.hovering = false;
	this.quick_mouse_out = false;
	this.statusDoneButton = new Button("statusbutton_done");
	this.statusCancelButton = new Button("statusbutton_cancel");
	this.listDetails = new FieldGroup("listdetailsbox", "detailstitle");
	this.taskDetails = new FieldGroup("taskdetails", "detailstitle");
	var A = new Field("detailslist");
	A.init();
	A.setTitle(_T("INTERFACE_TASKS_TASK_DETAILS_LIST"));
	A.setDefaultValue("none");
	A.blit();
	this.taskDetails.addField("detailsList", A);
	var A = new Field("detailsadded");
	A.init();
	A.setTitle(_T("INTERFACE_TASKS_TASK_DETAILS_ADDED"));
	A.blit();
	this.taskDetails.addField("detailsAdded", A);
	var A = new Field("detailscompleted");
	A.init();
	A.setTitle(_T("INTERFACE_TASKS_TASK_DETAILS_COMPLETED"));
	A.setDefaultValue(_T("INTERFACE_TASKS_TASK_DETAILS_DUE_NEVER"));
	A.blit();
	this.taskDetails.addField("detailsCompleted", A);
	var A = new Field("detailsdue", "calendar");
	A.init();
	A.setTitle(_T("INTERFACE_TASKS_TASK_DETAILS_DUE"));
	A.setDefaultValue(_T("INTERFACE_TASKS_TASK_DETAILS_DUE_NEVER"));
	A.setDelayedHide(true);
	A.setLockable(true);
	A.setHighlightable(true);
	A.blit();
	this.taskDetails.addField("detailsDue", A);
	var A = new Field("detailsreoccur", "reoccur");
	A.init();
	A.setTitle(_T("INTERFACE_TASKS_TASK_DETAILS_REPEAT"));
	A.setDefaultValue(_T("INTERFACE_TASKS_TASK_DETAILS_REPEAT_NEVER"));
	A.setDelayedHide(true);
	A.setLockable(true);
	A.setHighlightable(true);
	A.blit();
	this.taskDetails.addField("detailsReoccur", A);
	this.taskDetails.detailsDue.setNextField(this.taskDetails.detailsReoccur);
	this.taskDetails.detailsReoccur
			.setPreviousField(this.taskDetails.detailsDue);
	var A = new Field("detailsduration", "duration");
	A.init();
	A.setTitle(_T("INTERFACE_TASKS_TASK_DETAILS_TIME_ESTIMATE"));
	A.setDefaultValue(_T("INTERFACE_TASKS_TASK_DETAILS_TIME_ESTIMATE_NONE"));
	A.setDelayedHide(true);
	A.setLockable(true);
	A.setHighlightable(true);
	A.blit();
	this.taskDetails.addField("detailsDuration", A);
	this.taskDetails.detailsReoccur
			.setNextField(this.taskDetails.detailsDuration);
	this.taskDetails.detailsDuration
			.setPreviousField(this.taskDetails.detailsReoccur);
	var A = new Field("detailspostponed");
	A.init();
	A.setTitle(_T("INTERFACE_TASKS_TASK_DETAILS_POSTPONED"));
	A.setDefaultValue("never");
	A.blit();
	this.taskDetails.addField("detailsPostponed", A);
	var A = new Field("detailsshared");
	A.init();
	A.setTitle(_T("INTERFACE_TASKS_TASK_DETAILS_SHARED_WITH"));
	A.setDefaultValue(_T("INTERFACE_TASKS_TASK_DETAILS_SHARED_WITH_NO_ONE"));
	A.setEscape(false);
	A.blit();
	this.taskDetails.addField("detailsShared", A);
	var A = new Field("detailstags", "tag");
	A.init();
	A.setTitle(_T("INTERFACE_TASKS_TASK_DETAILS_TAGS"));
	A.setDefaultValue(_T("INTERFACE_TASKS_TASK_DETAILS_TAGS_NONE"));
	A.setDelayedHide(true);
	A.setEscape(false);
	A.setLockable(true);
	A.setHighlightable(true);
	if (!view.getPublicMode()) {
		A.setAutocompleteStore(new TagAutocompleteStore())
	}
	A.blit();
	this.taskDetails.addField("detailsTags", A);
	this.taskDetails.detailsDuration.setNextField(this.taskDetails.detailsTags);
	this.taskDetails.detailsTags
			.setPreviousField(this.taskDetails.detailsDuration);
	if (!view.getPublicMode()) {
		var A = new Field("detailslocation", "location");
		A.init();
		A.setTitle(_T("INTERFACE_TASKS_TASK_DETAILS_LOCATION"));
		A.setDefaultValue(_T("INTERFACE_TASKS_TASK_DETAILS_TAGS_NONE"));
		A.setDelayedHide(true);
		A.setEscape(false);
		A.setLockable(true);
		A.setHighlightable(true);
		A.setAutocompleteStore(new LocationAutocompleteStore());
		A.setAutocompleteAutocommit(true);
		A.blit();
		this.taskDetails.addField("detailsLocation", A);
		this.taskDetails.detailsTags
				.setNextField(this.taskDetails.detailsLocation);
		this.taskDetails.detailsLocation
				.setPreviousField(this.taskDetails.detailsTags)
	}
	var A = new Field("detailsurl", "url");
	A.init();
	A.setTitle(_T("INTERFACE_TASKS_TASK_DETAILS_URL"));
	A.setDefaultValue(_T("INTERFACE_TASKS_TASK_DETAILS_TAGS_NONE"));
	A.setDelayedHide(true);
	A.setEscape(false);
	A.setLockable(true);
	A.setHighlightable(true);
	A.blit();
	this.taskDetails.addField("detailsURL", A);
	if (!view.getPublicMode()) {
		this.taskDetails.detailsLocation
				.setNextField(this.taskDetails.detailsURL);
		this.taskDetails.detailsURL
				.setPreviousField(this.taskDetails.detailsLocation)
	}
	var A = new Field("detailsnotes");
	A.init();
	A.setTitle(_T("INTERFACE_TASKS_TASK_DETAILS_NOTES"));
	A.setDefaultValue("0");
	A.setEscape(false);
	A.blit();
	this.taskDetails.addField("detailsNotes", A);
	this.currentDetails = this.taskDetails
}
extendObject(TasksView, ViewBase);
TasksView.LIST_INBOX = -1;
TasksView.LIST_NORMAL = 0;
TasksView.LIST_SENT = 1;
TasksView.LIST_TYPE_NORMAL = 0;
TasksView.LIST_TYPE_SMART = 1;
TasksView.LIST_TYPE_SEARCH = 2;
TasksView.prototype.setHovering = function(A) {
	this.hovering = A
};
TasksView.prototype.getHovering = function() {
	return this.hovering
};
TasksView.prototype.inSentList = function() {
	return stateMgr.currentList
			&& is(stateMgr.lists[stateMgr.currentList])
			&& stateMgr.lists[stateMgr.currentList].position == TasksView.LIST_SENT
};
TasksView.prototype.inInboxList = function() {
	return stateMgr.currentList
			&& is(stateMgr.lists[stateMgr.currentList])
			&& stateMgr.lists[stateMgr.currentList].position == TasksView.LIST_INBOX
};
TasksView.prototype.showVisibleTaskMode = function() {
	if (view.getViewToken("Tasks", "Tasks")) {
		this.taskDetails.show()
	} else {
		if (view.getViewToken("Tasks", "Notes")) {
			noteMgr.show()
		}
	}
};
TasksView.prototype.hideVisibleTaskMode = function() {
	if (view.getViewToken("Tasks", "Tasks")) {
		this.taskDetails.hide()
	} else {
		if (view.getViewToken("Tasks", "Notes")) {
			noteMgr.hide()
		}
	}
};
function ContactsView() {
	this.inited = false;
	this.objs = [];
	this.states = [];
	this.selected = null;
	this.currentStateObjs = null;
	this.mbn = "rtm.views.contacts";
	this.contactDetails = new FieldGroup("contactdetails", "detailstitle");
	var A = new Field("contactusername");
	A.init();
	A.setTitle(_T("INTERFACE_CONTACTS_CONTACT_USERNAME"));
	A.setEscape(false);
	A.blit();
	this.contactDetails.addField("contactUsername", A);
	var A = new Field("contactgroups");
	A.init();
	A.setTitle(_T("INTERFACE_CONTACTS_CONTACT_GROUPS"));
	A.setDefaultValue(_T("INTERFACE_CONTACTS_CONTACT_GROUPS_NONE"));
	A.setEscape(false);
	A.blit();
	this.contactDetails.addField("contactGroups", A);
	this.groupDetails = new FieldGroup("groupdetails", "detailstitle");
	var A = new Field("groupmembers");
	A.init();
	A.setTitle(_T("INTERFACE_CONTACTS_GROUPS_MEMBERS"));
	A.setDefaultValue(_T("INTERFACE_CONTACTS_GROUPS_MEMBERS_NONE"));
	A.setEscape(false);
	A.blit();
	this.groupDetails.addField("groupMembers", A)
}
extendObject(ContactsView, ViewBase);
TasksView.prototype.isSpecialList = function(A) {
	if (is(stateMgr.lists[A])) {
		if (stateMgr.lists[A].position == TasksView.LIST_INBOX
				|| stateMgr.lists[A].position == TasksView.LIST_SENT) {
			return true
		}
		return false
	}
	return false
};
TasksView.prototype.reflectListsInListTabs = function() {
	var D = listTabs.data[listTabs.selected][1];
	listTabs.init();
	for ( var B = 0; B < listList.list.entries.length; B++) {
		var E = listList.list.entries[B];
		var A = E[0];
		var F = stateMgr.lists[A];
		if (!F.archived && !F.deleted) {
			if (!is(listTabs.reverseMap[A])) {
				if (F.filter !== null) {
					listTabs.addEntry(stateMgr.lists[A].name, [
							TasksView.LIST_TYPE_SMART, A, F.filter ])
				} else {
					listTabs.addEntry(stateMgr.lists[A].name, [
							TasksView.LIST_TYPE_NORMAL, A ])
				}
			}
		}
	}
	listTabs.sort();
	listTabs.selected = listTabs.reverseMap[D];
	listTabs.blitDiv()
};
TasksView.prototype.reflectListsInTasksToolbox = function() {
	this.reflectListsInToolbox(tasksToolBox);
	this.reflectListsInToolbox(tasksCompletedToolBox)
};
TasksView.prototype.reflectUndoSelector = function() {
	this.reflectUndoSelectorForToolbox(tasksToolBox);
	this.reflectUndoSelectorForToolbox(tasksSentToolBox);
	this.reflectUndoSelectorForToolbox(tasksCompletedToolBox)
};
TasksView.prototype.reflectOffline = function(A) {
	this.reflectOfflineForToolbox(tasksToolBox, !A);
	this.reflectOfflineForToolbox(tasksSentToolBox, !A);
	this.reflectOfflineForToolbox(tasksCompletedToolBox, !A)
};
TasksView.prototype.reflectUndoSelectorForToolbox = function(F) {
	var B = undoMgr.transactions.length > 0 ? true : false;
	var A = F.div.getElementsByTagName("select")[0];
	for ( var D = 0; D < F.listactions.length; D++) {
		var E = F.listactions[D];
		var H = E !== null ? E[0] : null;
		if (H == _T("INTERFACE_TASKS_TOOLBOX_UNDO_LAST_ACTION")) {
			A.options[D].disabled = !B
		}
	}
};
TasksView.prototype.reflectOfflineForToolbox = function(I, F) {
	var J = I.div.getElementsByTagName("select")[0];
	var A = _T("INTERFACE_TASKS_TOOLBOX_SEND_TO");
	var D = _T("INTERFACE_TASKS_TOOLBOX_SHARE_WITH");
	var H = _T("INTERFACE_TASKS_TOOLBOX_DUPLICATE_TASK");
	for ( var E = 0; E < I.listactions.length; E++) {
		var K = I.listactions[E];
		var B = K !== null ? K[0] : null;
		if (B == A || B == D || B == H) {
			J.options[E].disabled = !F
		}
	}
};
TasksView.prototype.isLocked = function(A) {
	return !(view.getSelected() == "Tasks"
			&& (A ? taskList.view === TaskList.TASK_LIST_VIEW_INCOMPLETE : true)
			&& !tasksView.inSentList() && !view.getPublicMode())
};
TasksView.prototype.isNormal = function() {
	return stateMgr.currentType == TasksView.LIST_TYPE_NORMAL
};
TasksView.prototype.toggleSearchOptions = function() {
	var A = el("searchboxwrap");
	var F = el("searchoptions");
	var B = el("searchtoggle");
	var D = el("break");
	var E = el("break2");
	if (A.style.visibility != "hidden") {
		searchMgr.updateFields();
		F.style.display = "";
		A.style.visibility = "hidden";
		B.innerHTML = _T("INTERFACE_HIDE_SEARCH_OPTIONS");
		if (!is_ie) {
			D.style.paddingTop = "0.5em";
			D.style.paddingBottom = "0.5em"
		} else {
			D.style.paddingTop = "0.3em";
			D.style.paddingBottom = "0.3em"
		}
		E.style.display = ""
	} else {
		A.style.visibility = "visible";
		F.style.display = "none";
		B.innerHTML = _T("INTERFACE_SHOW_SEARCH_OPTIONS");
		if (!is_ie) {
			D.style.paddingTop = "0.75em";
			D.style.paddingBottom = "0.75em"
		} else {
			D.style.paddingTop = "0em";
			D.style.paddingBottom = "0em"
		}
		E.style.display = "none"
	}
};
TasksView.prototype.reflectListsInToolbox = function(H) {
	var B = null;
	var E = null;
	for ( var D = 0; D < H.listactions.length; D++) {
		var F = H.listactions[D];
		var I = F !== null ? F[0] : null;
		if (I == _T("INTERFACE_TASKS_TOOLBOX_MOVE_TO")) {
			B = D
		}
		if (I == null && B !== null && D > B) {
			E = D - 1;
			break
		}
	}
	H.listactions.splice(B + 1, E - B);
	var A = stateMgr.getValidLists();
	for ( var D = 0; D < A.length; D++) {
		if (A[D][2] === 1) {
			continue
		}
		var J = H.addListAction(B + 1 + D, _T(
				"INTERFACE_TASKS_TOOLBOX_MOVE_TO_LIST", {
					"LIST_NAME" : A[D][1]
				}), false, true);
		H.setListActionData(J + 1, "tasks.moveTo." + A[D][0])
	}
	if (A.length > 0) {
		H.blitDiv()
	}
};
ContactsView.prototype.reflectGroupsInContactsToolbox = function() {
	var J = null;
	var F = null;
	var K = null;
	var E = contactsToolbox.listactions.length;
	for ( var I = 0; I < contactsToolbox.listactions.length; I++) {
		var O = contactsToolbox.listactions[I];
		var H = O !== null ? O[0] : null;
		if (H == _T("INTERFACE_CONTACTS_CONTACTS_TOOLBOX_ADD_TO")) {
			J = I
		}
		if (H == _T("INTERFACE_CONTACTS_CONTACTS_TOOLBOX_REMOVE_FROM")) {
			K = I
		}
		if (H == null && J !== null && I > J && I < E) {
			F = I - 1
		}
	}
	groupNames = [];
	for ( var D in stateMgr.groups) {
		groupNames.push( [ D, stateMgr.groups[D].name ])
	}
	groupNames.sort();
	contactsToolbox.listactions.splice(K + 1, E - K);
	contactsToolbox.listactions.splice(J + 1, F - J);
	for ( var I = 0; I < groupNames.length; I++) {
		var D = groupNames[I][0];
		var A = groupNames[I][1];
		var B = _T("INTERFACE_CONTACTS_CONTACTS_TOOLBOX_GROUP", {
			"GROUP_NAME" : A
		});
		var M = contactsToolbox.addListAction(J + 1 + I, B, false, true);
		contactsToolbox.setListActionData(M + 1, "contacts.attachToGroup." + D);
		K++;
		M = contactsToolbox.addListAction(K + 1 + I, B, false, true);
		if (M + 1 >= contactsToolbox.listactions.length) {
			M = contactsToolbox.listactions.length - 2
		}
		contactsToolbox.setListActionData(M + 1, "contacts.detachFromGroup."
				+ D)
	}
	if (groupNames.length) {
		contactsToolbox.blitDiv()
	}
};
function SettingsView() {
	this.inited = false;
	this.objs = [];
	this.states = [];
	this.selected = null;
	this.currentStateObjs = null;
	this.mbn = "rtm.views.settings";
	this.listDetails = new FieldGroup("settingslistdetails", "detailstitle");
	var B = new Field("settings-lists-details-count");
	B.init();
	B.setEscape(false);
	B.blit();
	this.listDetails.addField("taskCount", B);
	var B = new Field("settingslistcompleted");
	B.init();
	B.setDefaultValue(_T("INTERFACE_TASKS_LIST_DETAILS_ZERO_COMPLETED"));
	B.blit();
	this.listDetails.addField("listCompleted", B);
	var B = new Field("settingslistincomplete");
	B.init();
	B.setDefaultValue(_T("INTERFACE_TASKS_LIST_DETAILS_ZERO_INCOMPLETE"));
	B.blit();
	this.listDetails.addField("listIncomplete", B);
	var B = new Field("settingslistdescription");
	B.init();
	B.setEscape(false);
	B.setHidden(true);
	B.blit();
	this.listDetails.addField("listDescription", B);
	var B = new Field("settingslistfilter", "filter_edit");
	B.init();
	B.setEscape(false);
	B.setHidden(true);
	var A = _T("INTERFACE_SETTINGS_LISTS_CRITERIA", {
		"CRITERIA" : ""
	}).trim();
	A = A.replace(":", "");
	B.setNewLineAfterTitle(true);
	B.setTitle(A);
	B.setHighlightable(true);
	B.blit();
	this.listDetails.addField("listFilter", B);
	var B = new Field("settingslistpending");
	B.init();
	B.setEscape(false);
	B.setHidden(true);
	B.blit();
	this.listDetails.addField("listPending", B);
	this.locationDetails = new FieldGroup("settingslocationdetails",
			"detailstitle");
	var B = new Field("settings-locations-details-count");
	B.init();
	B.setEscape(false);
	B.blit();
	this.locationDetails.addField("taskCount", B);
	var B = new Field("settings-locations-details-complete-count");
	B.init();
	B.setDefaultValue(_T("INTERFACE_TASKS_LIST_DETAILS_ZERO_COMPLETED"));
	B.blit();
	this.locationDetails.addField("listCompleted", B);
	var B = new Field("settings-locations-details-incomplete-count");
	B.init();
	B.setDefaultValue(_T("INTERFACE_TASKS_LIST_DETAILS_ZERO_INCOMPLETE"));
	B.blit();
	this.locationDetails.addField("listIncomplete", B);
	var B = new Field("settingslocationdescription");
	B.init();
	B.setEscape(false);
	B.setHidden(true);
	B.blit();
	this.locationDetails.addField("locationDescription", B);
	this.tagDetails = new FieldGroup("settings-tags-details", "detailstitle");
	var B = new Field("settings-tags-details-count");
	B.init();
	B.setEscape(false);
	B.blit();
	this.tagDetails.addField("taskCount", B);
	var B = new Field("settings-tags-details-complete-count");
	B.init();
	B.setDefaultValue(_T("INTERFACE_TASKS_LIST_DETAILS_ZERO_COMPLETED"));
	B.blit();
	this.tagDetails.addField("listCompleted", B);
	var B = new Field("settings-tags-details-incomplete-count");
	B.init();
	B.setDefaultValue(_T("INTERFACE_TASKS_LIST_DETAILS_ZERO_INCOMPLETE"));
	B.blit();
	this.tagDetails.addField("listIncomplete", B)
}
extendObject(SettingsView, ViewBase);
function LocationsView() {
	this.inited = false;
	this.objs = [];
	this.states = [];
	this.selected = null;
	this.currentStateObjs = null;
	this.mbn = "rtm.views.locations"
}
extendObject(LocationsView, ViewBase);
function Toolbox(A) {
	this.id = A;
	this.div = el(A);
	this.inited = false;
	this.buttons = [];
	this.listactions = [];
	this.selectors = [];
	this.mbn = null;
	this.html = null
}
Toolbox.prototype.init = function() {
	this.inited = true;
	this.mbn = this.getUniqueMessageBusName()
};
Toolbox.prototype.show = function() {
	this.div.style.display = "";
	this.div.style.visibility = "hidden";
	this.div.style.visibility = "visible"
};
Toolbox.prototype.hide = function() {
	this.div.style.visibility = "hidden";
	this.div.style.visibility = "visible";
	this.div.style.display = "none"
};
Toolbox.prototype.getUniqueMessageBusName = function() {
	return "rtm.toolbox." + this.id + "."
};
Toolbox.prototype.addButton = function(A) {
	this.buttons.push(A)
};
Toolbox.prototype.addListAction = function(D, B, A) {
	if (arguments.length == 3) {
		this.listactions.push( [ D, B, A ]);
		return this.listactions.length - 1
	} else {
		if (arguments.length == 4) {
			var E = arguments[0];
			D = arguments[1];
			B = arguments[2];
			A = arguments[3];
			this.listactions.splice(E, 0, [ D, B, A ]);
			return E - 1
		}
	}
	return null
};
Toolbox.prototype.setListActionData = function(B, A) {
	if (this.listactions && this.listactions[B]) {
		this.listactions[B].data = A
	}
};
Toolbox.prototype.addListSeperator = function() {
	if (arguments.length == 0) {
		this.listactions.push(null)
	} else {
		if (arguments.length == 1) {
			var A = arguments[0];
			this.listactions.splice(A, 0, null)
		}
	}
};
Toolbox.prototype.addSelector = function(A) {
	this.selectors.push(A)
};
Toolbox.prototype.blitDiv = function() {
	var U = this;
	var I = document.createElement("div");
	var D = document.createElement("form");
	var R = document.createElement("div");
	D.appendChild(R);
	I.className = "xtoolbox_actions";
	I.appendChild(D);
	for ( var X = 0; X < this.buttons.length; X++) {
		var A = this.buttons[X];
		var B = '<input type="submit" class="xtoolbox_button" value="' + A
				+ '"></input>';
		R.innerHTML = R.innerHTML + B
	}
	var F = R.getElementsByTagName("input");
	for ( var X = 0; X < F.length; X++) {
		var O = F[X];
		O.onclick = function() {
			messageBus.broadcast(U, U.mbn + "buttonClicked", this.value);
			return false
		}
	}
	if (this.listactions.length) {
		var W = document.createElement("select");
		for ( var X = 0; X < this.listactions.length; X++) {
			var Y = this.listactions[X];
			var Z = document.createElement("option");
			if (Y === null) {
				Z.disabled = true;
				Z.innerHTML = "---";
				Z.rtmValue = null;
				Z.rtmData = null
			} else {
				var Q = Y[0];
				var H = Y[1];
				var a = Y[2];
				Z.innerHTML = a ? ".." + Q : Q;
				Z.disabled = H;
				Z.rtmValue = Q;
				Z.rtmData = Y.data
			}
			W.appendChild(Z)
		}
		W.onchange = function(d) {
			d || (d = window.event);
			var f = this.options[this.selectedIndex].rtmValue;
			var e = this.options[this.selectedIndex].rtmData;
			if (f !== null) {
				messageBus.broadcast(U, U.mbn + "selectionChanged", [ f, e ])
			}
			utility.stopEvent(d);
			this.selectedIndex = 0;
			this.blur();
			if (is_opera) {
				U.div.focus()
			}
			return false
		};
		W.selectedIndex = 0;
		R.appendChild(W)
	}
	var K = document.createElement("div");
	var V = [];
	for ( var X = 0; X < this.selectors.length; X++) {
		var M = '<a href=" ">' + this.selectors[X] + "</a>";
		V.push(M)
	}
	var b = V.join(", ");
	K.innerHTML = _T("INTERFACE_TASKS_SELECT") + " " + b;
	K.className = "xtoolbox_selector";
	var E = K.getElementsByTagName("a");
	for ( var X = 0; X < E.length; X++) {
		var J = E[X];
		J.onclick = function(d) {
			d || (d = window.event);
			messageBus.broadcast(U, U.mbn + "selectorClicked", [
					this.innerHTML, d.shiftKey ]);
			utility.stopEvent(d);
			return false
		}
	}
	this.div.innerHTML = "";
	this.div.appendChild(I);
	this.div.appendChild(K);
	this.html = this.div.innerHTML
};
Toolbox.prototype.enable = function() {
	Utility.enableForm(this.div, true)
};
Toolbox.prototype.disable = function() {
	Utility.enableForm(this.div, false)
};
function Infobox(A, B) {
	this.boxId = A;
	this.textId = B;
	this.boxDiv = el(A);
	this.text = el(B);
	this.inited = false;
	this.mbn = null;
	this.owner = null;
	this.visible = false
}
Infobox.prototype.init = function() {
	this.inited = true;
	this.mbn = this.getUniqueMessageBusName();
	this.owner = null;
	this.visible = false
};
Infobox.prototype.getUniqueMessageBusName = function() {
	return "rtm.infobox."
};
Infobox.prototype.show = function() {
	this.boxDiv.style.display = "";
	this.visible = true
};
Infobox.prototype.hide = function() {
	this.boxDiv.style.display = "none";
	this.visible = false
};
Infobox.prototype.setOwner = function(A) {
	this.owner = A
};
Infobox.prototype.setText = function(A) {
	this.text.innerHTML = A
};
function Helpbox(A, B) {
	this.boxId = A;
	this.textId = B;
	this.boxDiv = el(A);
	this.text = el(B);
	this.inited = false;
	this.mbn = null;
	this.owner = null
}
Helpbox.prototype.init = function() {
	this.inited = true;
	this.mbn = this.getUniqueMessageBusName();
	this.owner = null
};
Helpbox.prototype.getUniqueMessageBusName = function() {
	return "rtm.infobox."
};
Helpbox.prototype.show = function() {
	this.boxDiv.style.display = ""
};
Helpbox.prototype.hide = function() {
	this.boxDiv.style.display = "none"
};
Helpbox.prototype.setOwner = function(A) {
	this.owner = A
};
Helpbox.prototype.setText = function(A) {
	this.text.innerHTML = A
};
Helpbox.prototype.showHelpText = function(A) {
	this.show();
	this.setText(stringMgr.getString("help." + A));
	this.showing = A
};
Helpbox.prototype.stopShowing = function(D, B) {
	if (is(this.showing) && this.showing == D) {
		if (B && !view.inTab) {
			var A = this;
			var E = function() {
				A.hide()
			};
			setTimeout(E, 1000)
		} else {
			this.hide()
		}
	}
};
Helpbox.prototype.stopShowingAll = function(A) {
	if (is(this.showing) && this.showing.indexOf(A) === 0) {
		this.stopShowing(this.showing)
	}
};
function Virtual(D, B, A) {
	this.expr = D;
	if (D) {
		this.sexpr = new Sexp(D)
	} else {
		this.expr = null;
		this.sexpr = null
	}
	if (B) {
		this.data = B
	} else {
		this.data = null
	}
	if (A) {
		this.filterCallbacks = A
	} else {
		this.filterCallbacks = {}
	}
	this.cache = null;
	this.resultSet = [];
	if (this.sexpr && this.data) {
		this.filter = new Filter(this.data, this.filterCallbacks, this.sexpr,
				"name")
	} else {
		this.filter = null
	}
}
Virtual.prototype.updateFilter = function(A) {
	if (A) {
		this.expr = A
	}
	this.sexpr = new Sexp(this.expr);
	if (this.sexpr && this.data) {
		this.filter = new Filter(this.data, this.filterCallbacks, this.sexpr,
				"name")
	} else {
		this.filter = null
	}
};
Virtual.prototype.update = function() {
	this.resultSet = this.filter.reduce();
	this.cache = new Date().getTime()
};
Virtual.prototype.add = function(A) {
	if (this.filter && this.filter.apply(A, this.sexpr)) {
		return true
	}
	return false
};
Virtual.DUE_CACHE = {};
function _tagFilter(F, B, A) {
	if (!is(tagMgr.index[F])) {
		return false
	}
	var E = tagMgr.index[F];
	for ( var D = 0; D < E.length; D++) {
		if (E[D] == A.series_id) {
			return true
		}
	}
	return false
}
function _isRepeatingFilter(D, B, A) {
	if (D == "false" && (!A.reoccur || !A.reoccur[0])) {
		return true
	}
	if (D == "true" && A.reoccur && A.reoccur[0]) {
		return true
	}
	return false
}
function _locationFilter(D, B, A) {
	if (!is(locationMgr.location_task_series_[A.series_id])) {
		return false
	}
	if (!is(locationMgr.locations_[locationMgr.location_task_series_[A.series_id]])) {
		return false
	}
	if (locationMgr.locations_[locationMgr.location_task_series_[A.series_id]].name
			.toLowerCase() === D) {
		return true
	}
	return false
}
function _locationIdFilter(D, B, A) {
	if (!is(locationMgr.location_task_series_[A.series_id])
			|| (locationMgr.location_task_series_[A.series_id] != D)) {
		return false
	}
	return true
}
function _isTaggedFilter(D, B, A) {
	if (D == "false"
			&& (!is(tagMgr.invertedIndex[A.series_id]) || isHashEmpty(tagMgr.invertedIndex[A.series_id]))) {
		return true
	}
	if (D == "true"
			&& (is(tagMgr.invertedIndex[A.series_id]) && !isHashEmpty(tagMgr.invertedIndex[A.series_id]))) {
		return true
	}
	return false
}
function _hasLocation(D, B, A) {
	if (D == "false" && (!is(locationMgr.location_task_series_[A.series_id]))) {
		return true
	}
	if (D == "true" && (is(locationMgr.location_task_series_[A.series_id]))) {
		return true
	}
	return false
}
function _hasDueDate(D, B, A) {
	if (A.date_due === null && D == "false") {
		return true
	}
	if (A.date_due === null) {
		return false
	}
	return true
}
function _prioFilter(D, B, A) {
	return A.priority.charAt(1) == D
			|| (A.priority.charAt(1) == "N" && D.charAt(0) == "n")
}
function _includeArchived(D, B, A) {
	return A.list_id in stateMgr.lists
			&& stateMgr.lists[A.list_id].archived == D
}
function _listIdFilter(D, B, A) {
	return A.list_id == D
}
function _listFilter(D, B, A) {
	return A.list_id in stateMgr.lists
			&& stateMgr.lists[A.list_id].name.toLowerCase() == D
}
function _nameFilter(D, B, A) {
	return A.name.toLowerCase().indexOf(D) > -1
}
function _dueBeforeFilter(D, B, A) {
	if (A.date_due === null && D == "never") {
		return true
	}
	if (A.date_due === null) {
		return false
	}
	var E = dateTimeMgr.parseDueDate(D);
	if (E[0] == null) {
		return false
	}
	return A.date_due < (E[0].getTime() / 1000)
}
function _dueFilter(F, B, A) {
	if (A.date_due === null && F == "never") {
		return true
	}
	if (A.date_due === null) {
		return false
	}
	var I = dateTimeMgr.parseDueDate(F);
	if (I[0] == null) {
		return false
	}
	var H = I[0].getTime(), E, J = Virtual.DUE_CACHE, D = H / 1000;
	if (D in J) {
		E = J[D]
	} else {
		if (!is_safari_2 || is_iphone) {
			E = new Date(I[0]);
			E.setDate(E.getDate() + 1);
			E = E.getTime() / 1000
		} else {
			E = D + (24 * 60 * 60)
		}
		J[D] = E
	}
	return A.date_due >= D && A.date_due < E
}
function _dueWithinFilter(E, D, B) {
	if (B.date_due === null) {
		return false
	}
	var A = dateTimeMgr.parseDueRange(E, false);
	if (A == null) {
		return false
	}
	return A.epochWithinRange(B.date_due)
}
function _dueAfterFilter(D, B, A) {
	if (A.date_due === null && D == "never") {
		return true
	}
	if (A.date_due === null) {
		return false
	}
	var E = dateTimeMgr.parseDueDate(D);
	if (E[0] == null) {
		return false
	}
	return A.date_due > (E[0].getTime() / 1000)
}
function _sharedWithFilter(E, B, A) {
	if (!A.participants) {
		return false
	}
	for ( var D = 0; D < A.participants.length; D++) {
		if (A.participants[D].person_username == E
				&& A.participants[D].is_shared) {
			return true
		}
	}
	return false
}
function _fromFilter(D, B, A) {
	return _SendDirectionFilter(D, B, A, false)
}
function _SendDirectionFilter(F, B, A, H) {
	if (!A.participants) {
		return false
	}
	var E = A.list_id in stateMgr.lists
			&& (stateMgr.lists[A.list_id].position * 1) === 1;
	for ( var D = 0; D < A.participants.length; D++) {
		if (A.participants[D].person_username == F
				&& ((!A.participants[D].is_shared && !H) || (E && H))) {
			return true
		}
	}
	return false
}
function _toFilter(D, B, A) {
	return _SendDirectionFilter(D, B, A, true)
}
function _isReceivedFilter(D, B, A) {
	return _SharingFilter(D, B, A, false)
}
function _isSharedFilter(D, B, A) {
	return _SharingFilter(D, B, A, true)
}
function _SharingFilter(I, B, A, H) {
	var J = A.participants;
	if (!J && I == "false") {
		return true
	}
	if (!J && I == "true") {
		return false
	}
	var F = A.list_id in stateMgr.lists
			&& (stateMgr.lists[A.list_id].position * 1) === 1;
	for ( var E = 0, D = J.length; E < D; E++) {
		if (((H && !F) || !H) && J[E].is_shared === H) {
			if (I === "true") {
				return true
			}
			if (I === "false") {
				return false
			}
		}
	}
	return (I === "true" ? false : true)
}
function _statusFilter(D, B, A) {
	if ((D.indexOf("in") > -1) && A.date_completed === null) {
		return true
	}
	if ((D.indexOf("ed") > -1) && A.date_completed !== null) {
		return true
	}
	return false
}
function _hasNoteFilter(E, B, A) {
	var D = (A.series_id in noteMgr.index);
	if (E === "false" && D) {
		return false
	}
	if (E === "true" && !D) {
		return false
	}
	return true
}
function _noteContainsFilter(E, B, A) {
	if (!is(noteMgr.index[A.series_id])) {
		return false
	}
	for ( var D = 0; D < noteMgr.index[A.series_id].length; D++) {
		if (stateMgr.notes[noteMgr.index[A.series_id][D]].title.toLowerCase()
				.indexOf(E) > -1
				|| stateMgr.notes[noteMgr.index[A.series_id][D]].content
						.toLowerCase().indexOf(E) > -1) {
			return true
		}
	}
	return false
}
function _completedBeforeFilter(D, B, A) {
	if (A.date_completed === null) {
		return false
	}
	var E = dateTimeMgr.parseDueDate(D);
	if (E[0] == null) {
		return true
	}
	return A.date_completed < (E[0].getTime() / 1000)
}
function _completedFilter(E, B, A) {
	if (A.date_completed === null) {
		return false
	}
	var F = dateTimeMgr.parseDueDate(E);
	if (F[0] == null) {
		return true
	}
	var D = F[0].getTime() / 1000;
	return A.date_completed >= D && A.date_completed < (D + (60 * 60 * 24))
}
function _completedWithinFilter(E, D, B) {
	if (B.date_completed === null) {
		return false
	}
	var A = dateTimeMgr.parseDueRange(E, true);
	if (A == null) {
		return true
	}
	return A.epochWithinRange(B.date_completed)
}
function _completedAfterFilter(D, B, A) {
	if (A.date_completed === null) {
		return false
	}
	var E = dateTimeMgr.parseDueDate(D);
	if (E[0] == null) {
		return true
	}
	return A.date_completed > (E[0].getTime() / 1000)
}
function _addedFilter(E, B, A) {
	if (A.date_added === null) {
		return false
	}
	var F = dateTimeMgr.parseDueDate(E);
	if (F[0] == null) {
		return false
	}
	var D = F[0].getTime() / 1000;
	return A.date_added >= D && A.date_added < (D + (60 * 60 * 24))
}
function _addedWithinFilter(E, D, B) {
	if (B.date_added === null) {
		return false
	}
	var A = dateTimeMgr.parseDueRange(E, true);
	if (A == null) {
		return false
	}
	return A.epochWithinRange(B.date_added)
}
function _addedBeforeFilter(D, B, A) {
	if (A.date_added === null) {
		return false
	}
	var E = dateTimeMgr.parseDueDate(D);
	if (E[0] == null) {
		return false
	}
	return A.date_added < (E[0].getTime() / 1000)
}
function _addedAfterFilter(D, B, A) {
	if (A.date_added === null) {
		return false
	}
	var E = dateTimeMgr.parseDueDate(D);
	if (E[0] == null) {
		return false
	}
	return A.date_added > (E[0].getTime() / 1000)
}
function _postponedFilter(D, B, A) {
	var F = D.charAt(0);
	if (F == "<" || F == ">") {
		D = D.substring(1)
	} else {
		F = null
	}
	var E = parseInt(D, 10);
	if (F == "<" && A.postponed < E) {
		return true
	}
	if (F == ">" && A.postponed > E) {
		return true
	}
	if (!F && A.postponed == E) {
		return true
	}
	return false
}
function _timeEstimateFilter(D, B, A) {
	if (A.estimate === null) {
		return false
	}
	var H = D.charAt(0);
	if (!(H == "<" || H == ">")) {
		H = null
	}
	var F = dateTimeMgr.parseTimeEstimate(D);
	var E = dateTimeMgr.parseTimeEstimate(A.estimate);
	if (H == "<" && E < F) {
		return true
	}
	if (H == ">" && E > F) {
		return true
	}
	if (!H && E == F) {
		return true
	}
	return false
}
var filterMap = {
	"tag" : _tagFilter,
	"priority" : _prioFilter,
	"listId" : _listIdFilter,
	"list" : _listFilter,
	"name" : _nameFilter,
	"due" : _dueFilter,
	"dueBefore" : _dueBeforeFilter,
	"dueAfter" : _dueAfterFilter,
	"sharedWith" : _sharedWithFilter,
	"completed" : _completedFilter,
	"noteContains" : _noteContainsFilter,
	"dueWithin" : _dueWithinFilter,
	"status" : _statusFilter,
	"completedBefore" : _completedBeforeFilter,
	"completedAfter" : _completedAfterFilter,
	"isShared" : _isSharedFilter,
	"postponed" : _postponedFilter,
	"timeEstimate" : _timeEstimateFilter,
	"completedWithin" : _completedWithinFilter,
	"isTagged" : _isTaggedFilter,
	"isRepeating" : _isRepeatingFilter,
	"hasLocation" : _hasLocation,
	"hasDueDate" : _hasDueDate,
	"location" : _locationFilter,
	"locationId" : _locationIdFilter,
	"isLocated" : _hasLocation,
	"added" : _addedFilter,
	"addedBefore" : _addedBeforeFilter,
	"addedAfter" : _addedAfterFilter,
	"addedWithin" : _addedWithinFilter,
	"hasNotes" : _hasNoteFilter,
	"hasNote" : _hasNoteFilter,
	"from" : _fromFilter,
	"to" : _toFilter,
	"isReceived" : _isReceivedFilter,
	"isRecieved" : _isReceivedFilter
};
var filterNameMap = {
	"tag" : "_tagFilter",
	"priority" : "_prioFilter",
	"listId" : "_listIdFilter",
	"list" : "_listFilter",
	"name" : "_nameFilter",
	"due" : "_dueFilter",
	"dueBefore" : "_dueBeforeFilter",
	"dueAfter" : "_dueAfterFilter",
	"sharedWith" : "_sharedWithFilter",
	"completed" : "_completedFilter",
	"noteContains" : "_noteContainsFilter",
	"dueWithin" : "_dueWithinFilter",
	"status" : "_statusFilter",
	"completedBefore" : "_completedBeforeFilter",
	"completedAfter" : "_completedAfterFilter",
	"isShared" : "_isSharedFilter",
	"postponed" : "_postponedFilter",
	"timeEstimate" : "_timeEstimateFilter",
	"completedWithin" : "_completedWithinFilter",
	"isTagged" : "_isTaggedFilter",
	"isRepeating" : "_isRepeatingFilter",
	"hasLocation" : "_hasLocation",
	"hasDueDate" : "_hasDueDate",
	"location" : "_locationFilter",
	"locationId" : "_locationIdFilter",
	"isLocated" : "_hasLocation",
	"added" : "_addedFilter",
	"addedBefore" : "_addedBeforeFilter",
	"addedAfter" : "_addedAfterFilter",
	"addedWithin" : "_addedWithinFilter",
	"hasNotes" : "_hasNoteFilter",
	"hasNote" : "_hasNoteFilter",
	"from" : "_fromFilter",
	"to" : "_toFilter",
	"isReceived" : "_isReceivedFilter",
	"isRecieved" : "_isReceivedFilter"
};
function XList(B, A) {
	this.id = B;
	this.div = el(B);
	this.table = null;
	this.entries = [];
	this.rows = [];
	this.selected = [];
	this.selectedMap = {};
	this.busy = [];
	this.busyMap = {};
	this.map = {};
	this.reverseMap = {};
	this.present = {};
	this.type = A;
	this.inited = false;
	this.invalidated = [];
	this.prioState = List.LIST_PRIO_INCOMPLETE;
	this.inAdvise = false;
	this.needToBlit = true;
	this.dateKlass = "xtd_date";
	this.tableKlass = null;
	this.hashMap = null;
	this.sortFields = null;
	this.sortSpec = null;
	this.sortSpecClean = null;
	this.clickable = true;
	this.visible = false;
	this.emptyMessage = null;
	this.showingEmpty = false;
	this.hoverable = true;
	this.multiSelectable = true;
	this.hoveringId = null;
	this.keyboardPosition = null;
	this.keyboardEntries = [];
	this.keyboardHover = [];
	this.clearTable()
}
extendObject(XList, List);
XList.prototype.isMultiSelectable = function() {
	return !view.isNewUI()
};
XList.prototype.setTableKlass = function(A) {
	this.tableKlass = A
};
XList.prototype.show = function() {
	this.visible = true;
	this.div.style.display = "";
	var A = this;
	setTimeout(function() {
		if ("snake_" in A) {
			A.snake_.set_parent_hidden(false)
		}
		if ("multi_snake_" in A) {
			A.multi_snake_.set_parent_hidden(false)
		}
		A.fireSelectionStarted();
		A.fireSelectionFinished()
	}, 0)
};
XList.prototype.hide = function() {
	this.visible = false;
	this.div.style.display = "none";
	if ("snake_" in this) {
		this.snake_.hide(true);
		this.snake_.set_parent_hidden(true)
	}
	if ("multi_snake_" in this) {
		this.multi_snake_.hide(true);
		this.multi_snake_.set_parent_hidden(true)
	}
	this.fireSelectionCleared()
};
XList.prototype.sortAndBlit = function(update) {
	if (this.hashMap == null || this.sortFields == null) {
		return false
	}
	if (this.entries.length > 0) {
		this.showingEmpty = false
	}
	messageBus.broadcast(this, this.mbn + "sortStarted");
	var entriesSort = [];
	var entry, entry_id, entry_tuple, sort_fields = [], hash_entry;
	for ( var i = 0, j = this.sortFields.length; i < j; i++) {
		sort_fields.push("hash_entry." + this.sortFields[i])
	}
	sort_fields = "[" + sort_fields.join(",") + "]";
	for ( var i = 0, j = this.entries.length; i < j; i++) {
		entry = this.entries[i];
		if (!entry) {
			continue
		}
		entry_id = entry[0];
		hash_entry = this.hashMap[entry_id];
		if (!hash_entry) {
			this.removeEntry(entry_id);
			i--;
			j--
		} else {
			entry_tuple = eval(sort_fields);
			entry_tuple.entry = entry;
			entriesSort.push(entry_tuple)
		}
	}
	entriesSort.sort(this.doSort);
	var keyboardPositionId = this.keyboardPosition !== null ? this.reverseMap[this.keyboardPosition]
			: null;
	var selectedIds = this.getSelected();
	var busyIds = this.getBusy();
	var need = {}, sort_entry_id, sort_entry;
	for ( var i = 0, j = entriesSort.length; i < j; i++) {
		entry = this.entries[i];
		sort_entry = entriesSort[i].entry;
		entry_id = entry[0];
		sort_entry_id = sort_entry[0];
		if (entry_id !== sort_entry_id) {
			this.entries[i] = sort_entry;
			need[i] = true
		}
	}
	var toAdd = this.entries.length - this.rows.length;
	for ( var i = this.rows.length, j = this.entries.length; i < j; i++) {
		this.rows.push("");
		need[i] = true
	}
	for ( var i = 0, j = this.invalidated.length; i < j; i++) {
		need[this.invalidated[i]] = true
	}
	var needUpdate = [];
	for ( var pos in need) {
		needUpdate.push(pos)
	}
	this.invalidated = [];
	this.reflectMaps();
	this.tableReblit(needUpdate);
	if (needUpdate.length > 0 || (selectedIds.length > 0 || busyIds.length > 0)) {
		this.selected = [];
		this.selectedMap = {};
		this.busy = [];
		this.busyMap = {};
		var pos;
		for ( var i = 0; i < selectedIds.length; i++) {
			pos = this.map[selectedIds[i]];
			this.selected.push(pos);
			this.selectedMap[pos] = true;
			this.setRowSelect(this.table.rows[pos], true)
		}
		for ( var i = 0; i < busyIds.length; i++) {
			pos = this.map[busyIds[i]];
			this.busy.push(pos);
			this.busyMap[pos] = true;
			this.tableSetRowBusy(pos, true)
		}
	}
	if (keyboardPositionId !== null) {
		var pos = (keyboardPositionId in this.map && is(this.map[keyboardPositionId])) ? this.map[keyboardPositionId]
				: null;
		this.keyboardPosition = pos;
		this.keyboardClearHover(true)
	}
	messageBus.broadcast(this, this.mbn + "sortFinished");
	return needUpdate.length
};
XList.prototype.clear = function() {
	this.entries = [];
	this.rows = [];
	this.invalidated = [];
	this.map = {};
	this.reverseMap = {};
	this.present = {};
	this.selected = [];
	this.selectedMap = {};
	this.busy = [];
	this.busyMap = {};
	this.needToBlit = true;
	this.inAdvise = false;
	this.showingEmpty = false;
	this.hoveringId = null;
	this.keyboardPosition = null;
	this.keyboardEntries = [];
	this.fireSelectionCleared();
	this.clearTable()
};
XList.prototype.clearTable = function() {
	if (this.tableKlass) {
		this.div.innerHTML = '<table class="xtable ' + this.tableKlass + '">'
				+ this.getTableCols() + "<tbody></tbody></table>"
	} else {
		this.div.innerHTML = '<table class="xtable">' + this.getTableCols()
				+ "<tbody></tbody></table>"
	}
	this.table = this.div.getElementsByTagName("table")[0]
};
XList.prototype.reflectMaps = function() {
	var D = {};
	var B = {};
	for ( var A = 0; A < this.entries.length; A++) {
		B[A] = this.entries[A][0];
		D[this.entries[A][0]] = A
	}
	this.map = D;
	this.reverseMap = B
};
XList.prototype.getTableRows = function() {
	var A = [ '<table class="xtable' ];
	if (this.tableKlass) {
		A.push(" ");
		A.push(this.tableKlass)
	}
	A.push('">');
	A.push(this.getTableCols());
	A.push("<tbody>");
	A.push(this.rows.join(""));
	A.push("</tbody></table>");
	return A.join("")
};
XList.prototype.tableReblit = function(D) {
	if (this.entries.length == 0) {
		this.tableBlitEmpty();
		return false
	}
	if (this.rows.length == 0) {
		return this.tableBlitRows()
	}
	for ( var A = 0; A < D.length; A++) {
		this.rows[D[A]] = this.getRowHtml(this.entries[D[A]])
	}
	var B = this.getTableRows();
	this.div.innerHTML = B;
	this.table = this.div.getElementsByTagName("table")[0];
	this.assignRowProperties()
};
XList.prototype.tableBlitRows = function() {
	var E = new Date().getTime();
	if (this.inAdvise && this.needToBlit == false) {
		return false
	}
	if (this.entries.length == 0) {
		this.tableBlitEmpty();
		return false
	}
	this.rows = [];
	for ( var D = 0; D < this.entries.length; D++) {
		var F = this.entries[D];
		this.rows.push(this.getRowHtml(F));
		this.present[F[0]] = true
	}
	var H = this.getTableRows();
	this.div.innerHTML = H;
	this.table = this.div.getElementsByTagName("table")[0];
	this.assignRowProperties();
	var A = new Date().getTime();
	var B = new Date().getTime();
	if (false) {
		this._redraw(true);
		if (true || (rtmUsername == "test51" && this.prioState == List.LIST_PRIO_INCOMPLETE)) {
			el("debug").innerHTML = "<br />List draw: " + ((A - E) / 1000)
					+ "secs, ";
			el("debug").innerHTML += ((B - A) / 1000) + "secs"
		}
	}
};
XList.prototype.assignRowPropertiesForPlainCheck = function() {
	var B;
	for ( var A = 0; A < this.table.rows.length; A++) {
		B = this.table.rows[A];
		B.rowCheck = B.cells[1];
		B.rowCheckBox = B.cells[1].getElementsByTagName("input")[0];
		B.rowText = B.cells[2];
		this.assignRowActions(B, this.entries[A])
	}
};
XList.prototype.assignRowPropertiesForPlainCheckImage = function() {
	var B;
	for ( var A = 0; A < this.table.rows.length; A++) {
		B = this.table.rows[A];
		B.rowCheck = B.cells[1];
		B.rowCheckBox = B.cells[1].getElementsByTagName("input")[0];
		B.rowText = B.cells[2];
		B.rowImage = B.cells[3];
		this.assignRowActions(B, this.entries[A])
	}
	if (this.keyboardPosition === 0) {
		this.keyboardPosition = null
	}
	if (this.keyboardPosition === null) {
		this.keyboardDown()
	}
};
XList.prototype.assignRowPropertiesForPlainPrioDate = function() {
	var B;
	for ( var A = 0; A < this.table.rows.length; A++) {
		B = this.table.rows[A];
		B.rowPriority = B.cells[0];
		B.rowText = B.cells[1];
		B.rowTextSpan = B.cells[1].firstChild;
		B.rowDate = B.cells[2];
		this.assignRowActions(B, this.entries[A])
	}
};
XList.prototype.assignRowPropertiesForPlainPrioDateCheck = function() {
	var H, A, F = this.table.rows;
	var D = new Date().getTime();
	for ( var E = 0, B = F.length; E < B; E++) {
		H = F[E];
		H.rowPriority = H.cells[0];
		H.rowArrow = H.cells[1];
		A = H.cells[2];
		H.rowCheck = A;
		H.rowCheckBox = A.getElementsByTagName("input")[0];
		H.rowText = H.cells[3];
		if (rtmTagPosition < 2) {
			H.rowTags = H.cells[3].firstChild;
			H.rowTextSpan = H.rowTags.nextSibling
		} else {
			H.rowTextSpan = H.cells[3].firstChild;
			H.rowTags = H.rowTextSpan.nextSibling
		}
		H.rowDate = H.cells[4];
		H.rowIcon = H.cells[5];
		H.entry = this.entries[E];
		this.assignRowActions(H, H.entry)
	}
	if (this.keyboardPosition === 0) {
		this.keyboardPosition = null
	}
	if (this.keyboardPosition === null) {
		this.keyboardDown()
	}
};
XList.prototype.assignRowProperties = function() {
	if (this.type == (List.LIST_TYPE_PLAIN | List.LIST_TYPE_CHECK)) {
		this.assignRowPropertiesForPlainCheck()
	} else {
		if (this.type == (List.LIST_TYPE_PLAIN | List.LIST_TYPE_CHECK | List.LIST_TYPE_IMAGE)) {
			this.assignRowPropertiesForPlainCheckImage()
		} else {
			if (this.type == (List.LIST_TYPE_PLAIN | List.LIST_TYPE_PRIO | List.LIST_TYPE_DATE)) {
				this.assignRowPropertiesForPlainPrioDate()
			} else {
				if (this.type == (List.LIST_TYPE_PLAIN | List.LIST_TYPE_PRIO
						| List.LIST_TYPE_DATE | List.LIST_TYPE_CHECK)) {
					this.assignRowPropertiesForPlainPrioDateCheck()
				}
			}
		}
	}
};
XList.prototype.tableBlitEmpty = function() {
	if (this.emptyMessage && !this.showingEmpty && this.entries.length == 0) {
		var A = null;
		if (this.type == (List.LIST_TYPE_PLAIN | List.LIST_TYPE_PRIO | List.LIST_TYPE_DATE)) {
			A = [ 0, "N", this.emptyMessage, null ]
		} else {
			if (this.type == (List.LIST_TYPE_PLAIN | List.LIST_TYPE_PRIO
					| List.LIST_TYPE_DATE | List.LIST_TYPE_CHECK)) {
				A = [ 0, "N", this.emptyMessage, null, null ]
			} else {
				if (this.type == (List.LIST_TYPE_PLAIN | List.LIST_TYPE_CHECK | List.LIST_TYPE_IMAGE)) {
					A = [ 0, this.emptyMessage, null ]
				} else {
					if (this.type == (List.LIST_TYPE_PLAIN | List.LIST_TYPE_CHECK)) {
						A = [ 0, this.emptyMessage ]
					}
				}
			}
		}
		this.rows = [];
		var B = this.getRowHtml(A);
		if (this.tableKlass) {
			this.div.innerHTML = '<table style="visibility: hidden;" class="xtable '
					+ this.tableKlass
					+ ' xtable_empty">'
					+ this.getEmptyTableCols()
					+ "<tbody>"
					+ B
					+ "</tbody></table>"
		} else {
			this.div.innerHTML = '<table style="visibility: hidden;" class="xtable xtable_empty">'
					+ this.getEmptyTableCols()
					+ "<tbody>"
					+ B
					+ "</tbody></table>"
		}
		this.table = this.div.getElementsByTagName("table")[0];
		this.table.style.visibility = "visible";
		this.showingEmpty = true
	}
	this.tableClearEmpty()
};
XList.prototype._redraw = function(A) {
	this.table.style.visibility = "hidden";
	this.table.style.visibility = "visible"
};
XList.getRow = function(A) {
	if (!A || !A.tagName) {
		return null
	}
	if (A.tagName === "TR" || A.tagName.toUpperCase() === "TR") {
		return A
	}
	if (A.tagName === "TD" || A.tagName.toUpperCase() === "TD") {
		return A.parentNode
	}
	if ((A.tagName === "SPAN" || A.tagName.toUpperCase() === "SPAN")
			&& A.parentNode && A.parentNode.tagName === "TD") {
		return A.parentNode.parentNode
	}
	while (A
			&& A.parentNode
			&& A.parentNode.tagName
			&& (A.parentNode.tagName === "TR" || A.parentNode.tagName
					.toUpperCase() !== "TR")) {
		A = A.parentNode
	}
	return A && A.tagName ? ((A.tagName === "TR" || A.tagName.toUpperCase()) === "TR" ? A
			: A.parentNode)
			: null
};
XList.prototype.onMouseOver = function(A, B) {
	if (this.showingEmpty) {
		return true
	}
	var D = XList.getRow(B);
	if (D === null || this.hovering_over_ === D || (!("entry" in D))
			|| tasksView.getHovering()) {
		return false
	}
	this.hovering_over_ = D;
	this.onRowMouseOver(A, D, D.entry);
	return false
};
XList.prototype.onMouseOut = function(B, E) {
	if (this.showingEmpty) {
		return true
	}
	B || (B = window.event);
	var A = null;
	try {
		A = XList.getRow(B.relatedTarget)
	} catch (D) {
	}
	if (E !== A) {
		if (E !== null && "entry" in E) {
			this.onRowMouseOut(B, E, E.entry)
		}
		this.hovering_over_ = null;
		return false
	}
	return true
};
XList.prototype.assignTableActions = function() {
	var B = this.table;
	var A = this;
	this.hovering_over_ = null;
	B.onmouseover = function(D) {
		return A.onMouseOver(D)
	};
	B.onmouseout = function(D) {
		return A.onMouseOut(D)
	};
	B.onclick = function(D) {
		if (A.showingEmpty) {
			return true
		}
		D || (D = window.event);
		var F = Utility.getEventTarget(D);
		var E = false;
		if (F && F.tagName.toLowerCase() === "input" && F.type === "checkbox") {
			E = true
		}
		var H = XList.getRow(F);
		A.onRowMouseClick(D, H, H.entry, E)
	};
	B.onmousedown = function(D) {
		if (A.showingEmpty) {
			return true
		}
		D || (D = window.event);
		if (D.shiftKey) {
			return false
		}
		return true
	}
};
XList.prototype.assignRowActions = function(D, B) {
	var A = this;
	D.entry = B;
	D.onmouseover = function(E) {
		if (tasksView.getHovering()) {
			return false
		}
		E || (E = window.event);
		A.onMouseOver(E, this, this.entry);
		return false
	};
	D.onmouseout = function(E) {
		if (E === null) {
			tasksView.quick_mouse_out = true;
			A.onRowMouseOut(E, this, this.entry);
			A.hovering_over_ = null;
			return false
		}
		E || (E = window.event);
		A.onMouseOut(E, this, this.entry);
		return false
	};
	D.onclick = function(F) {
		F || (F = window.event);
		var I = Utility.getEventTarget(F);
		var H = false;
		if (I) {
			var E = I.tagName.toLowerCase();
			if (E === "input" && I.type === "checkbox") {
				H = true
			} else {
				if (E === "td"
						&& (Utility.hasClass(I, "xtd_check") || Utility
								.hasClass(I, "xtd_arr"))) {
					H = true
				}
			}
		}
		A.onRowMouseClick(F, this, this.entry, H);
		return true
	};
	D.onmousedown = function(E) {
		E || (E = window.event);
		if (E.shiftKey) {
			return false
		}
		return true
	}
};
XList.prototype.getRowHtml = function(A) {
	var B = [];
	if (!is(A)) {
		return ""
	}
	if (this.type == List.LIST_TYPE_PLAIN) {
		B.push('<tr class="xtr"><td class="xtd xtd_text">');
		B.push(A[1]);
		B.push("</td></tr>");
		return B.join("")
	}
	if (this.type == List.LIST_TYPE_LOADING) {
		return '<tr class="xtr"><td class="xtd xtd_prio prioN">&nbsp;</td><td class="xtd xtd_text">'
				+ _T("INTERFACE_TASKS_LIST_DETAILS_LOADING")
				+ '</td><td class="xtd xtd_image">'
				+ imageMgr.getImageHTML("busy") + "</td></tr>"
	}
	if (this.type == List.LIST_TYPE_ADDING) {
		return this.tableAddRowWithAdding
	}
	if (this.type == (List.LIST_TYPE_PLAIN | List.LIST_TYPE_CHECK)) {
		B
				.push('<tr class="xtr"><td class="xtd xtd_arr"></td><td class="xtd xtd_check"><form id="');
		B.push(this.id);
		B.push("_row_form_");
		B.push(A[0]);
		B
				.push('" action="#"><div style="display: inline;"><input type="checkbox"></input></div></form></td><td class="xtd xtd_text">');
		B.push(A[1]);
		B.push("</td></tr>");
		return B.join("")
	}
	if (this.type == (List.LIST_TYPE_PLAIN | List.LIST_TYPE_CHECK | List.LIST_TYPE_IMAGE)) {
		B
				.push('<tr class="xtr"><td class="xtd xtd_arr"></td><td class="xtd xtd_check"><form id="');
		B.push(this.id);
		B.push("_row_form_");
		B.push(A[0]);
		B
				.push('" action="#"><div style="display: inline;"><input type="checkbox"></input></div></form></td><td class="xtd xtd_text">');
		B.push(A[1]);
		if (A[2]) {
			B.push('</td><td class="xtd xtd_image">');
			B.push(imageMgr.getImageHTML(A[2]))
		} else {
			B.push('</td><td class="xtd xtd_image">&nbsp;')
		}
		B.push("</td></tr>");
		return B.join("")
	}
	if (this.type == (List.LIST_TYPE_PLAIN | List.LIST_TYPE_PRIO)) {
		B.push('<tr class="xtr"><td class="xtd xtd_prio prio');
		B.push(A[1]);
		B.push('">&nbsp;</td><td class="xtd xtd_text">');
		B.push(A[2]);
		B.push("</td></tr>");
		return B.join("")
	}
	if (this.type == (List.LIST_TYPE_PLAIN | List.LIST_TYPE_PRIO | List.LIST_TYPE_CHECK)) {
		B.push('<tr class="xtr"><td class="xtd xtd_prio prio');
		B.push(A[1]);
		B.push('">&nbsp;</td><td class="xtd xtd_check"><form id="');
		B.push(this.id);
		B.push("_row_form_");
		B.push(A[0]);
		B
				.push('" action="#"><div style="display: inline;"><input type="checkbox"></input></div></form></td><td class="xtd xtd_text">');
		B.push(A[2]);
		B.push("</td></tr>");
		return B.join("")
	}
	if (this.type == (List.LIST_TYPE_PLAIN | List.LIST_TYPE_PRIO | List.LIST_TYPE_DATE)) {
		B.push('<tr class="xtr' + (A[4] ? " xtr_repeat" : "")
				+ '"><td class="xtd xtd_prio prio');
		B.push(A[1]);
		B
				.push('">&nbsp;</td><td class="xtd xtd_text"><span class="xtd_task_name">');
		B.push(A[2]);
		B.push('</span></td><td class="xtd xtd_date">');
		B.push((A[3] ? A[3] : "&nbsp;"));
		B.push("</td></tr>");
		return B.join("")
	}
	if (this.type == (List.LIST_TYPE_PLAIN | List.LIST_TYPE_PRIO
			| List.LIST_TYPE_DATE | List.LIST_TYPE_CHECK)) {
		B.push('<tr class="xtr' + (A[6] ? " xtr_repeat" : "")
				+ '"><td class="xtd xtd_prio prio');
		B.push(A[1]);
		if (this.prioState == List.LIST_PRIO_COMPLETED) {
			B.push("C")
		}
		B
				.push('">&nbsp;</td><td class="xtd xtd_arr"></td><td class="xtd xtd_check"><form id="');
		B.push(this.id);
		B.push("_row_form_");
		B.push(A[0]);
		B
				.push('" action="#"><div style="display: inline;"><input type="checkbox"></input></div></form></td><td class="xtd xtd_text">');
		if (rtmTagPosition < 2) {
			if (A[4]) {
				B.push('<span class="xtd_tag">');
				B.push(A[4].join(", "));
				B.push("</span>")
			} else {
				B.push("<span></span>")
			}
			B.push('<span class="xtd_task_name">' + A[2] + "</span>")
		} else {
			B.push('<span class="xtd_task_name">' + A[2] + "</span>");
			if (A[4]) {
				B.push('<span class="xtd_tag">');
				B.push(A[4].join(", "));
				B.push("</span>")
			} else {
				B.push("<span></span>")
			}
		}
		B.push('</td><td class="xtd xtd_date">');
		B.push((A[3] ? A[3] : "&nbsp;"));
		B.push('</td><td class="xtd xtd_ico' + (A[5] ? " has_note" : "")
				+ '"></td></tr>');
		return B.join("")
	}
	return '<tr class="xtr"><td class="xtd xtd_text">Something went wrong</td></tr>'
};
XList.prototype.flashEntry = function(B) {
	var J = this.map[B];
	if (typeof (J) === "undefined" || J === null) {
		return false
	}
	var D = this.table.rows[J];
	if (!D) {
		return false
	}
	var K = 100;
	var J = 0;
	var F = 190;
	var A = 230;
	var M = 110;
	var E = 249;
	var O = 249;
	var I = 249;
	D.style["backgroundColor"] = "#BEE66E";
	var H = function() {
		var U = J / K;
		var Q = [ parseInt(F + (E - F) * U, 10), parseInt(A + (O - A) * U, 10),
				parseInt(M + (I - M) * U, 10) ];
		var R = "rgb(" + Q.join(",") + ")";
		D.style["backgroundColor"] = R;
		J++;
		if (J === K + 1) {
			clearInterval(H.interval_);
			H.interval_ = null;
			D.setAttribute("style", "")
		}
	};
	H.interval_ = setInterval(H, 300 / K)
};
function Control() {
	this.inited = false;
	this.filterTime = null;
	this.filterTimeout = null;
	this.lastFilter = null;
	this.lastType = null;
	this.showAdded = false
}
Control.prototype.init = function() {
	var Q = this;
	var V = function(d, e) {
		if (!statusBox.visible) {
			statusBox.setText(_T("INTERFACE_STATUS_BUSY"))
		}
	};
	messageBus.subscribe(V, transMgr.mbn + "loadThreshold");
	var R = function(d, e) {
		if (stateMgr.currentList !== null
				&& stateMgr.tick++ % 2 == 0
				&& !tasksView.getHovering()
				&& !(!view.getPublicMode() && addingList && addingList.list.visible === true)
				&& taskList.getViewList().selected.length == 0
				&& (!Offline.isReady() || Offline.isOnline())) {
			if (is(stateMgr.lists[stateMgr.currentList].list_last_sync)
					&& ((new Date().getTime() - stateMgr.lists[stateMgr.currentList].list_last_sync) / 1000) < 60) {
				stateMgr.tick = 0;
				return false
			}
			if (stateMgr.currentType == TasksView.LIST_TYPE_NORMAL) {
				Q.tasksListReload(false, true)
			}
		}
	};
	messageBus.subscribe(R, dateTimeMgr.mbn + "chime");
	var J = function(d, e) {
		Q.tasksListDetailsTabChanged(e)
	};
	messageBus.subscribe(J, detailstab.mbn + "tabChanged");
	var a = function(d, e) {
		Q.tasksListTabChanged(e)
	};
	messageBus.subscribe(a, listTabs.mbn + "tabChanged");
	var M = function(d, e) {
		Q.tasksTaskTabChanged(d, e)
	};
	messageBus.subscribe(M, taskTabs.mbn + "tabChanged");
	var O = function(d, e) {
		Q.tasksTaskSelected(e)
	};
	messageBus.subscribe(O, taskList.list.getUniqueMessageBusName()
			+ "selectFinished");
	messageBus.subscribe(O, taskList.completedList.getUniqueMessageBusName()
			+ "selectFinished");
	var W = function(d, e) {
		Q.tasksSorted(e)
	};
	messageBus.subscribe(W, taskList.list.getUniqueMessageBusName()
			+ "sortFinished");
	var I = function(d, e) {
		Q.tasksTaskHoverOn(e)
	};
	messageBus
			.subscribe(I, taskList.list.getUniqueMessageBusName() + "hoverOn");
	messageBus.subscribe(I, taskList.completedList.getUniqueMessageBusName()
			+ "hoverOn");
	var D = function(d, e) {
		Q.tasksTaskHoverOff(e)
	};
	messageBus.subscribe(D, taskList.list.getUniqueMessageBusName()
			+ "hoverOff");
	messageBus.subscribe(D, taskList.completedList.getUniqueMessageBusName()
			+ "hoverOff");
	var H = function(d, e) {
		Q.tasksSelectorClicked(e)
	};
	messageBus.subscribe(H, tasksToolBox.getUniqueMessageBusName()
			+ "selectorClicked");
	var X = function(d, e) {
		Q.tasksCompletedSelectorClicked(e)
	};
	messageBus.subscribe(X, tasksCompletedToolBox.getUniqueMessageBusName()
			+ "selectorClicked");
	var B = function(d, e) {
		Q.tasksCompletedSelectorClicked(e)
	};
	messageBus.subscribe(B, tasksSentToolBox.getUniqueMessageBusName()
			+ "selectorClicked");
	var F = function(d, e) {
		Q.tasksSelectionChanged(d, e)
	};
	messageBus.subscribe(F, tasksToolBox.getUniqueMessageBusName()
			+ "selectionChanged");
	messageBus.subscribe(F, tasksCompletedToolBox.getUniqueMessageBusName()
			+ "selectionChanged");
	messageBus.subscribe(F, tasksSentToolBox.getUniqueMessageBusName()
			+ "selectionChanged");
	var E = function(d, e) {
		Q.tasksViewChanged(e)
	};
	messageBus.subscribe(E, taskList.getUniqueMessageBusName() + "viewChanged");
	var K = function(d, e) {
		Q.viewViewChanged(e)
	};
	messageBus.subscribe(K, view.getUniqueMessageBusName() + "viewChanged");
	var Z = function(d, e) {
		Q.listCountSelected(d, e)
	};
	messageBus.subscribe(Z, taskList.list.getUniqueMessageBusName()
			+ "selectFinished");
	messageBus.subscribe(Z, taskList.completedList.getUniqueMessageBusName()
			+ "selectFinished");
	var Y = function(d, e) {
		Q.listSelectedCleared(d, e)
	};
	messageBus.subscribe(Y, taskList.list.getUniqueMessageBusName()
			+ "selectCleared");
	messageBus.subscribe(Y, taskList.completedList.getUniqueMessageBusName()
			+ "selectCleared");
	var A = function(e, d) {
		if (view.getSelected() == "Tasks" && d) {
			loadingList.show()
		}
		format.formatTaskStatisticsForList(stateMgr.currentList, true)
	};
	messageBus.subscribe(A, taskList.getUniqueMessageBusName() + "loadStarted");
	var U = function() {
		loadingList.hide()
	};
	messageBus.subscribe(U, taskList.getUniqueMessageBusName() + "loadBlitted");
	var b = function() {
		taskList.clearLoadTimeout();
		if (view.getSelected() == "Tasks") {
			taskList.getViewList().fireSelectionFinished()
		}
		if (false && is_opera) {
			taskList.getViewList().table.style.visibility = "hidden";
			taskList.getViewList().table.style.visibility = "visible"
		}
	};
	messageBus
			.subscribe(b, taskList.getUniqueMessageBusName() + "loadFinished");
	this.inited = true
};
Control.prototype.doListTabChanged = function() {
	if (tasksView.inInboxList()) {
		helpBox.showHelpText("tasks.inbox");
		if (!view.getPublicMode()) {
			whatsNew.setCount("shared_tasks", 0);
			whatsNew.setCount("emailed_tasks", 0);
			if (view.getSelected() === "Tasks") {
				adder.show()
			}
		}
	} else {
		if (!view.getPublicMode()) {
			adder.show()
		}
		helpBox.stopShowing("tasks.inbox")
	}
	taskList.switchView(TaskList.TASK_LIST_VIEW_INCOMPLETE);
	if (tasksView.inSentList()) {
		taskList.list.setPrioState(List.LIST_PRIO_COMPLETED);
		tasksView.taskDetails.disable();
		helpBox.showHelpText("tasks.sent");
		noteMgr.disable()
	} else {
		noteMgr.enable();
		taskList.list.setPrioState(List.LIST_PRIO_INCOMPLETE);
		if (view.getPublicMode()
				|| (view.getViewToken("Tasks", "Share") || view.getViewToken(
						"Tasks", "Publish"))) {
			tasksView.taskDetails.disable()
		} else {
			if (view.getViewToken("Tasks")) {
				tasksView.taskDetails.enable()
			}
		}
		helpBox.stopShowing("tasks.sent")
	}
};
Control.prototype.tasksListTabChanged = function(H) {
	var F = H[0][0];
	var K = H[0][1];
	var D = H[1][0];
	var E = H[1][1];
	var V = H[2];
	var B = V[1];
	if (!view.getPublicMode()
			&& (B === null || (B in stateMgr.lists && stateMgr.lists[B] !== null))) {
		var M = "prio";
		if (B !== null) {
			M = SortList.SORT_LIST[stateMgr.lists[B].sort_order]
		}
		taskList.resort(M, false);
		window.setTimeout(function() {
			taskList.reset_snake();
			SortList.reflectCheck(M)
		}, 0)
	}
	if (F !== null) {
		if (V[0] == TasksView.LIST_TYPE_SMART
				|| V[0] == TasksView.LIST_TYPE_SEARCH) {
			stateMgr.setCurrentType(V[0]);
			if (V[0] == TasksView.LIST_TYPE_SMART) {
				stateMgr.setCurrentList(V[1])
			} else {
				stateMgr.setCurrentList(null);
				if (stateMgr.currentFilter !== V[2]) {
					taskList.getViewList().keyboardPosition = null
				}
			}
			stateMgr.setCurrentFilter(V[2]);
			var U = {};
			for ( var Q in stateMgr.tasks) {
				if (is(stateMgr.tasks[Q]) && noteMgr.index
						&& is(noteMgr.index[stateMgr.tasks[Q].series_id])) {
					U[stateMgr.tasks[Q].list_id] = true
				}
			}
			var A = [];
			var J = stateMgr.currentFilter.indexOf("includeArchived:true") > -1;
			var R = stateMgr.currentFilter.indexOf("noteContains") > -1;
			for ( var I in stateMgr.lists) {
				var O = J || stateMgr.lists[I].archived === false;
				if (!stateMgr.lists[I].deleted && !stateMgr.lists[I].queued
						&& O && stateMgr.lists[I].filter === null) {
					if (!is(U[I]) || (J && stateMgr.lists[I].archived) || R) {
						A.push(I)
					}
				}
			}
			if (A.length > 0) {
				this.doListsLoad(A)
			}
		} else {
			stateMgr.setCurrentType(V[0]);
			stateMgr.setCurrentList(V[1]);
			stateMgr.setCurrentFilter("(listId:" + V[1] + ")")
		}
		this.doListTabChanged();
		if (F != D) {
			taskTabs.selectDefault(false);
			taskTabs.hide();
			detailstab.show();
			taskList.clear();
			detailstab.selectDefault(true);
			if (!view.getPublicMode()) {
				control.addingListAddSuccess()
			}
			this.lastFilter = null
		}
		this.tasksListReload(F != D, false)
	} else {
		this.doListTabChanged()
	}
};
Control.outstandingListIds = [];
Control.prototype.doListsLoad = function(D, I) {
	var H = [], F = [];
	var I = !!I;
	for ( var B = 0; B < D.length; B++) {
		var J = D[B];
		var E = is(stateMgr.lists[J].list_last_sync) ? (stateMgr.lists[J].list_last_sync / 1000)
				: 0;
		H.push(E);
		var A = is(stateMgr.lists[J].list_last_anchor) ? stateMgr.lists[J].list_last_anchor
				: null;
		F.push(A)
	}
	if (view.getPublicMode()) {
		transMgr.request("lists.public.load", utility.encodeJavaScript( {
			"user" : rtmUsername,
			"list" : D,
			"lastSync" : H
		}))
	} else {
		transMgr.request("lists.load", utility.encodeJavaScript( {
			"list" : D,
			"anchor" : F,
			"trepo_anchor" : rtmTRepoAnchor,
			"lastSync" : H,
			"offsync" : I
		}))
	}
};
Control.prototype.tasksListReload = function(A, F) {
	if (A) {
		loadingList.showLoadingMessage();
		taskList.getViewList().keyboardPosition = null
	}
	if (stateMgr.currentType == TasksView.LIST_TYPE_NORMAL) {
		var E = is(stateMgr.lists[stateMgr.currentList].list_last_sync) ? (stateMgr.lists[stateMgr.currentList].list_last_sync / 1000)
				: 0;
		var B = is(stateMgr.lists[stateMgr.currentList].list_last_anchor) ? stateMgr.lists[stateMgr.currentList].list_last_anchor
				: null;
		taskList.list.setEmptyMessage(_T("INTERFACE_TASKS_NO_INCOMPLETE"));
		taskList.completedList
				.setEmptyMessage(_T("INTERFACE_TASKS_NO_COMPLETED"));
		if (view.getPublicMode()) {
			transMgr.request("lists.public.load", utility.encodeJavaScript( {
				"user" : rtmUsername,
				"list" : stateMgr.currentList,
				"lastSync" : E,
				"auto" : F
			}), 30, F)
		} else {
			transMgr.request("lists.load", utility.encodeJavaScript( {
				"list" : stateMgr.currentList,
				"anchor" : B,
				"trepo_anchor" : rtmTRepoAnchor,
				"lastSync" : E,
				"auto" : F
			}), 30, F)
		}
		if (Offline.isReady() && !Offline.isOnline()) {
			return false
		}
		var D = function() {
			messageBus.broadcast(taskList, taskList.getUniqueMessageBusName()
					+ "loadTimeout")
		};
		taskList.setLoadTimeout(setTimeout(D,
				TransactionManager.REQUEST_TIMEOUT * 1000
						* transMgr.getDistributionMultiplier()));
		messageBus.broadcast(taskList, taskList.getUniqueMessageBusName()
				+ "loadStarted", A)
	} else {
		messageBus.broadcast(taskList, taskList.getUniqueMessageBusName()
				+ "loadStarted", A);
		taskList.list.setEmptyMessage(_T("INTERFACE_TASKS_NO_RESULTS"));
		taskList.completedList
				.setEmptyMessage(_T("INTERFACE_TASKS_NO_RESULTS"));
		this.doVirtualListLoad(stateMgr.currentFilter)
	}
};
Control.prototype.doVirtualListLoad = function(E, F) {
	if (this.lastFilter !== null && this.lastFilter === E
			&& this.lastType !== null && this.lastType === stateMgr.currentType
			&& F == true) {
		messageBus.broadcast(taskList, taskList.getUniqueMessageBusName()
				+ "loadBlitted");
		messageBus.broadcast(taskList, taskList.getUniqueMessageBusName()
				+ "loadFinished");
		return false
	}
	var A = false;
	if (E.indexOf("includeArchived:true") > -1) {
		A = true
	}
	E = E.replace(/\s*(and|or)?\s*includeArchived:(true|false)/, "");
	this.lastFilter = E;
	this.lastType = stateMgr.currentType;
	var B = new Sexp(E);
	stateMgr.filterObj = new Filter(stateMgr.tasks, filterMap, B.sexpr, "name");
	if (A === true) {
		stateMgr.filterObj.setImplicitFilter(null)
	} else {
		stateMgr.filterObj.setImplicitFilter(_includeArchived)
	}
	tagMgr.prepareTagIndex();
	noteMgr.prepareIndex();
	dateTimeMgr.setCache(true);
	var E = new Date().getTime();
	stateMgr.workingSet = stateMgr.filterObj.reduce();
	E = (new Date().getTime() - E) / 1000;
	dateTimeMgr.setCache(false);
	messageBus.broadcast(taskList, taskList.getUniqueMessageBusName()
			+ "loadBlitted");
	taskList.setAdvise(true);
	for ( var D = 0; D < stateMgr.workingSet.length; D++) {
		taskList.addTask(stateMgr.tasks[stateMgr.workingSet[D]])
	}
	taskList.setAdvise(false);
	taskList.list.sortAndBlit();
	taskList.list.prune();
	taskList.setDirty(true);
	if (this.lastFilter.indexOf("completed") > -1
			&& taskList.list.entries.length === 0) {
		taskList.switchView(TaskList.TASK_LIST_VIEW_COMPLETED)
	}
	if (this.lastFilter.indexOf("added") > -1) {
		this.showAdded = true
	} else {
		this.showAdded = false
	}
	tagMgr.clearTagIndex();
	noteMgr.clearIndex();
	taskList.doDues();
	messageBus.broadcast(taskList, taskList.getUniqueMessageBusName()
			+ "loadFinished")
};
Control.prototype.updateListFilter = function(D) {
	var A = this;
	var B = function() {
		view.selectView("Tasks");
		var H = D || el("listFilter").value.trim();
		var F;
		var E = new Sexp(H);
		F = E.str;
		stateMgr.currentFilter = H;
		stateMgr.currentList = null;
		stateMgr.currentType = TasksView.LIST_TYPE_SEARCH;
		if (listTabs.entryExists(null)) {
			listTabs.setDataForEntry(null, [ TasksView.LIST_TYPE_SEARCH, null,
					F ])
		} else {
			listTabs.addEntry(_T("INTERFACE_TASKS_SEARCH_TAB"), [
					TasksView.LIST_TYPE_SEARCH, null, F ], true)
		}
		listTabs.blitDiv();
		listTabs.selectTabByData(null);
		clearTimeout(A.filterTimeout);
		A.filterTimeout = null
	};
	if (this.filterTimeout !== null) {
		clearTimeout(this.filterTimeout);
		this.filterTimeout = null
	}
	this.filterTimeout = setTimeout(B, 0)
};
Control.prototype.tasksTaskSelected = function(H) {
	if (view.getSelected() == "Tasks") {
		var E = H[0];
		var J = H[1];
		var M = taskList.getViewList();
		var K = null;
		if (E) {
			tasksView.setHovering(false);
			var B = taskList.getViewList().entries[J][0];
			this.tasksViewReflectDisplay();
			format.formatTask(B);
			if (M.id == "taskscompleted"
					|| (!view.isNewUI() && view.multiEditMode === false)) {
				M.snake_.replace_all(M.table.rows[J]);
				K = M.snake_;
				if (M.id === "tasks") {
					M.multi_snake_.hide(true)
				}
			} else {
				var I = M.selected;
				var A = [];
				for ( var F = 0, D = I.length; F < D; F++) {
					A.push(M.table.rows[I[F]])
				}
				M.multi_snake_.replace_all_sources(A);
				K = M.multi_snake_;
				M.snake_.hide(true)
			}
			K.draw()
		} else {
			tasksView.setHovering(false);
			taskTabs.selectDefault(false);
			this.tasksViewReflectDisplay();
			format.formatTaskStatisticsForList(stateMgr.currentList,
					!loadingList.hidden_);
			M.snake_.hide(true);
			M.snake_.draw();
			if (M.id === "tasks") {
				M.multi_snake_.hide(true);
				M.multi_snake_.draw()
			}
		}
	}
};
Control.task_hover_t_ = null;
Control.prototype.tasksTaskHoverOn = function(A) {
	var D = A;
	var B = taskList.getViewList();
	if (!tasksView.getHovering()) {
		if (Control.task_hover_t_) {
			clearTimeout(Control.task_hover_t_);
			Control.task_hover_t_ = null
		}
		tasksView.setHovering(true);
		this.tasksViewReflectDisplay();
		format.formatTask(D);
		if (B && B.id === "tasks" && (view.isNewUI() || view.multiEditMode)) {
			B.multi_snake_.hide()
		}
		Control.snakeForList(B, D)
	}
};
Control.prototype.tasksTaskHoverOff = function(B) {
	if (Control.task_hover_t) {
		clearTimeout(Control.task_hover_t);
		Control.task_hover_t = null
	}
	var E = taskList.getViewList();
	tasksView.setHovering(false);
	var D = E.getLastSelected();
	var A = function() {
		control.tasksViewReflectDisplay();
		control.tasksFormat(true);
		if (D === null) {
			Control.snakeForList(E, null)
		} else {
			var F = E.reverseMap[D];
			if (E && E.id === "tasks" && (view.isNewUI() || view.multiEditMode)) {
				Control.snakeForList(E, null);
				E.multi_snake_.show()
			} else {
				Control.snakeForList(E, F)
			}
		}
	};
	if (tasksView.quick_mouse_out) {
		tasksView.quick_mouse_out = false;
		return A()
	}
	Control.task_hover_t_ = setTimeout(A, 60);
	return
};
Control.prototype.tasksViewReflectDisplay = function(A) {
	if (A) {
		shareMgr.hide();
		publishMgr.hide();
		saveMgr.hide();
		noteMgr.hide();
		el("listdetailsbox").style.display = "none";
		tasksView.taskDetails.hide();
		taskTabs.hide();
		detailstab.hide();
		if (!view.getPublicMode()) {
			if (taskCloud) {
				taskCloud.hideCopy()
			}
			SortList.hide();
			SmartAdd.getInstance().display(false)
		}
		return false
	}
	var B = view.getViewToken("Tasks", "Tasks");
	var D = view.getViewToken("Tasks", "Notes");
	if (B || D) {
		if (!view.getPublicMode()) {
			shareMgr.hide();
			publishMgr.hide();
			saveMgr.hide();
			if (taskCloud) {
				taskCloud.hideCopy()
			}
		}
		el("listdetailsbox").style.display = "none";
		detailstab.hide();
		if (B) {
			noteMgr.hide();
			tasksView.taskDetails.show()
		} else {
			tasksView.taskDetails.hide();
			noteMgr.show()
		}
		taskTabs.show()
	} else {
		if (view.getViewToken("Tasks")) {
			taskTabs.hide();
			tasksView.taskDetails.hide();
			noteMgr.hide();
			if (!view.getPublicMode()) {
				if (taskCloud) {
					taskCloud.hideCopy()
				}
				if (stateMgr.currentType == TasksView.LIST_TYPE_NORMAL) {
					if (detailstab.entries.length == 2) {
						detailstab.removeEntry(1, true)
					}
					if (detailstab.entries.length !== 3) {
						detailstab
								.addEntry(_T("INTERFACE_TASKS_LIST_DETAILS_SHARE"));
						detailstab
								.addEntry(_T("INTERFACE_TASKS_LIST_DETAILS_PUBLISH"));
						detailstab.blitDiv()
					}
				} else {
					if (stateMgr.currentType == TasksView.LIST_TYPE_SMART) {
						if (detailstab.entries.length > 1) {
							while (detailstab.entries.length > 1) {
								detailstab.removeEntry(1, true)
							}
						}
						detailstab.blitDiv()
					} else {
						if (detailstab.entries.length == 1
								|| detailstab.entries.length > 2) {
							while (detailstab.entries.length > 1) {
								detailstab.removeEntry(1, true)
							}
							detailstab.addEntry(_T("INTERFACE_TASKS_SAVE_TAB"))
						}
						detailstab.blitDiv()
					}
				}
			}
			detailstab.show();
			if (!view.getPublicMode() && view.getViewToken("Tasks", "Share")) {
				el("listdetailsbox").style.display = "none";
				publishMgr.hide();
				saveMgr.hide();
				shareMgr.show()
			} else {
				if (!view.getPublicMode()
						&& view.getViewToken("Tasks", "Publish")) {
					el("listdetailsbox").style.display = "none";
					shareMgr.hide();
					saveMgr.hide();
					publishMgr.show()
				} else {
					if (!view.getPublicMode()
							&& view.getViewToken("Tasks", "Save")) {
						el("listdetailsbox").style.display = "none";
						shareMgr.hide();
						publishMgr.hide();
						saveMgr.show()
					} else {
						if (view.getViewToken("Tasks", "List")) {
							if (!view.getPublicMode()) {
								shareMgr.hide();
								publishMgr.hide();
								saveMgr.hide();
								if (taskCloud) {
									taskCloud.showCopy()
								}
							}
							el("listdetailsbox").style.display = ""
						}
					}
				}
			}
		} else {
			taskTabs.hide();
			tasksView.taskDetails.hide();
			noteMgr.hide();
			detailstab.hide();
			if (view.getPublicMode()) {
				shareMgr.hide();
				publishMgr.hide();
				saveMgr.hide()
			}
			el("listdetailsbox").style.display = "none"
		}
	}
};
Control.prototype.tasksSelectorClicked = function(B) {
	var D = B[0];
	var A = B[1];
	switch (D) {
	case _T("INTERFACE_TASKS_SELECT_ALL"):
		taskList.taskSelectAll(A);
		return;
	case _T("INTERFACE_TASKS_SELECT_NONE"):
		taskList.taskSelectNone(A);
		return;
	case _T("INTERFACE_TASKS_SELECT_DUE_TODAY"):
		taskList.taskSelectDueToday(A);
		return;
	case _T("INTERFACE_TASKS_SELECT_DUE_TOMORROW"):
		taskList.taskSelectDueTomorrow(A);
		return;
	case _T("INTERFACE_TASKS_SELECT_OVERDUE"):
		taskList.taskSelectOverdue(A);
		return;
	default:
		return
	}
};
Control.prototype.tasksCompletedSelectorClicked = function(B) {
	var D = B[0];
	var A = B[1];
	switch (D) {
	case _T("INTERFACE_TASKS_SELECT_ALL"):
		taskList.taskSelectAll(A);
		return;
	case _T("INTERFACE_TASKS_SELECT_NONE"):
		taskList.taskSelectNone(A);
		return;
	default:
		return
	}
};
Control.prototype.tasksViewChanged = function(A, B) {
	var D = A;
	if (view.getSelected() == "Tasks") {
		if (!view.getPublicMode()) {
			this.showTasksAdder()
		}
		this.showTasksToolbox(D)
	} else {
		this.hideTasksToolbox()
	}
	if (!B) {
		this.tasksFormat()
	}
};
Control.prototype.showTasksToolbox = function(A) {
	if (A == TaskList.TASK_LIST_VIEW_INCOMPLETE) {
		tasksCompletedToolBox.hide();
		tasksView.taskDetails.detailsCompleted.setHidden(true);
		tasksView.taskDetails.detailsCompleted.hide();
		if (tasksView.inSentList()) {
			tasksToolBox.hide();
			tasksSentToolBox.show();
			tasksView.taskDetails.disable()
		} else {
			tasksSentToolBox.hide();
			tasksToolBox.show();
			if (view.getPublicMode()) {
				tasksView.taskDetails.disable()
			} else {
				if (!(view.getViewToken("Tasks", "Share")
						|| view.getViewToken("Tasks", "Publish") || view
						.getViewToken("Tasks", "Save"))) {
					tasksView.taskDetails.enable()
				}
			}
		}
	} else {
		tasksToolBox.hide();
		if (tasksView.inSentList()) {
			tasksCompletedToolBox.hide();
			tasksSentToolBox.show()
		} else {
			tasksSentToolBox.hide();
			tasksCompletedToolBox.show()
		}
		tasksView.taskDetails.detailsCompleted.setHidden(false);
		tasksView.taskDetails.detailsCompleted.show();
		if (stateMgr.currentList !== TasksView.LIST_TYPE_NORMAL) {
			tasksView.taskDetails.detailsList.setHidden(false);
			tasksView.taskDetails.detailsList.show()
		} else {
			tasksView.taskDetails.detailsList.setHidden(true);
			tasksView.taskDetails.detailsList.hide()
		}
		tasksView.taskDetails.disable()
	}
	if (stateMgr.currentType !== TasksView.LIST_TYPE_NORMAL) {
		tasksView.taskDetails.detailsList.setHidden(false);
		tasksView.taskDetails.detailsList.show()
	} else {
		tasksView.taskDetails.detailsList.setHidden(true);
		tasksView.taskDetails.detailsList.hide()
	}
};
Control.prototype.hideTasksToolbox = function() {
	tasksToolBox.hide();
	tasksSentToolBox.hide();
	tasksCompletedToolBox.hide()
};
Control.prototype.tasksFormat = function(D) {
	var B = taskList.getViewList().getLastSelected();
	var A = taskList.getViewList().getLastSelectedId();
	this.tasksViewReflectDisplay();
	if (A === null) {
		format.formatTaskStatisticsForList(stateMgr.currentList, false);
		if (!D) {
			Control.snakeForList(taskList.getViewList(), null)
		}
	} else {
		format.formatTask(A);
		if (D) {
			Control.snakeForList(taskList.getViewList(), A)
		}
	}
};
Control.prototype.listCountSelected = function(E, H) {
	var F = H[0];
	if (!view.getPublicMode() && view.shareMode !== null) {
		var I;
		var A = contactList.list.getSelected().length;
		var D = groupList.list.getSelected().length;
		if (!(A || D)) {
			I = _T("INTERFACE_CONTACTS_SELECT_SOME_CONTACTS_OR_GROUPS");
			statusBox.sharingEnableDone(false)
		} else {
			var B;
			if (A == 0) {
				B = D == 1 ? "INTERFACE_CONTACTS_GROUPS_SELECTED_ONE"
						: "INTERFACE_CONTACTS_GROUPS_SELECTED_NUM";
				I = _T(B, {
					"NUM" : D
				})
			} else {
				if (A == 1) {
					B = "INTERFACE_CONTACTS_SELECTED_ONE";
					if (D == 1) {
						B = "INTERFACE_CONTACTS_SEL_ONE_ONE"
					} else {
						if (D > 1) {
							B = "INTERFACE_CONTACTS_SEL_ONE_NUM"
						}
					}
					I = _T(B, {
						"GROUP_NUM" : D
					})
				} else {
					if (D == 0) {
						B = "INTERFACE_CONTACTS_SELECTED_NUM";
						I = _T(B, {
							"NUM" : A
						})
					} else {
						B = D == 1 ? "INTERFACE_CONTACTS_SEL_NUM_ONE"
								: "INTERFACE_CONTACTS_SEL_NUM_NUM";
						I = _T(B, {
							"CONTACT_NUM" : A,
							"GROUP_NUM" : D
						})
					}
				}
			}
			statusBox.sharingEnableDone(true)
		}
		infoBox.setText(I);
		infoBox.show()
	} else {
		if (E.visible) {
			if (F != 0) {
				var I;
				switch (E.parent.type) {
				case "task":
					if (F == 1) {
						if (view.getMultiEditMode()) {
							I = "INTERFACE_TASKS_SELECTED_ONE_TASK_MULTIEDIT"
						} else {
							I = "INTERFACE_TASKS_SELECTED_ONE_TASK"
						}
					} else {
						if (view.getMultiEditMode()) {
							I = "INTERFACE_TASKS_SELECTED_NUM_TASKS_MULTIEDIT"
						} else {
							I = "INTERFACE_TASKS_SELECTED_NUM_TASKS"
						}
					}
					break;
				case "contact":
					if (F == 1) {
						I = "INTERFACE_CONTACTS_SELECTED_ONE"
					} else {
						I = "INTERFACE_CONTACTS_SELECTED_NUM"
					}
					break;
				case "group":
					if (F == 1) {
						I = "INTERFACE_CONTACTS_GROUPS_SELECTED_ONE"
					} else {
						I = "INTERFACE_CONTACTS_GROUPS_SELECTED_NUM"
					}
					break;
				case "list":
					if (F == 1) {
						I = "INTERFACE_SETTINGS_LISTS_SELECTED_ONE"
					} else {
						I = "INTERFACE_SETTINGS_LISTS_SELECTED_NUM"
					}
					break;
				case "location":
					if (F == 1) {
						I = "INTERFACE_SETTINGS_LOCATIONS_SELECTED_ONE"
					} else {
						I = "INTERFACE_SETTINGS_LOCATIONS_SELECTED_NUM"
					}
					break;
				case "tag":
					if (F == 1) {
						I = "INTERFACE_TAGS_SELECTED_ONE"
					} else {
						I = "INTERFACE_TAGS_SELECTED_NUM"
					}
					break;
				default:
					break
				}
				if (E.parent.type === "task" && view.isNewUI()) {
					if (F === 1) {
						I = "INTERFACE_TASKS_SELECTED_ONE_TASK"
					} else {
						I = "INTERFACE_TASKS_SELECTED_NUM_TASKS_MULTIEDIT_NEW"
					}
					infoBox.setText(_T(I, {
						"NUM" : F,
						"START_BOLD" : '<span class="multi-edit">',
						"END_BOLD" : "</span>"
					}))
				} else {
					infoBox.setText(_T(I, {
						"NUM" : F
					}))
				}
				infoBox.show()
			} else {
				infoBox.hide()
			}
		}
	}
};
Control.prototype.listSelectedCleared = function(A, B) {
	if (infoBox) {
		if (!view.getPublicMode()
				&& (view.shareMode === null && !(A == groupList.list
						|| A == contactList.list || A == locationList.list || A == tagList.list))) {
			infoBox.hide()
		}
	}
	if (!view.getPublicMode()) {
		if ("multi_snake_" in A) {
			A.multi_snake_.hide(true);
			A.multi_snake_.draw()
		}
		A.snake_.hide(true);
		A.snake_.draw()
	}
};
Control.prototype.tasksSorted = function(A, B) {
	taskList.doDues();
	control.tasksFormat()
};
Control.prototype.viewViewChanged = function(I) {
	var E = I[0][0];
	var F = I[0][1];
	var B = I[1][0];
	var D = I[1][1];
	var J = el("overview");
	var A = el("appview");
	var H = el("mapview");
	if (D != "Overview") {
		if (!view.getPublicMode()) {
			J.style.display = "none";
			if (D !== "Tasks") {
				Control.showProMessage(false)
			} else {
				Control.showProMessage(!rtmIsPro)
			}
		}
		if (D != "Locations") {
			if (Offline.isReady() && Offline.Dialog.isShowingMap()) {
				Offline.Dialog.hide()
			}
			H.style.display = "none";
			A.style.display = ""
		} else {
			A.style.display = "none";
			H.style.display = "";
			locationMgr.display();
			if (Offline.isReady()
					&& (!HAS_GMAPS && locationMgr.isLoaded() || !Offline
							.isOnline())) {
				Offline.Dialog.showMapDisabled()
			}
		}
	} else {
		if (Offline.isReady() && Offline.Dialog.isShowingMap()) {
			Offline.Dialog.hide()
		}
		H.style.display = "none";
		A.style.display = "none";
		if (!view.getPublicMode()) {
			J.style.display = ""
		}
	}
	if (F == "Tasks") {
		loadingList.hide();
		this.tasksViewReflectDisplay(true);
		if (is_gecko) {
			el("tools_spacer").style.display = "none";
			el("tools_spacer").style.display = ""
		}
	}
	if (D != "Tasks") {
		el("listtoolbox").style.display = "none";
		helpBox.stopShowingAll("tasks");
		this.hideTasksToolbox()
	}
	if (F == "Contacts") {
		if (contactsView.getSelected() == _T("INTERFACE_CONTACTS_CONTACTS_TAB")) {
			contactsView.contactDetails.hide();
			contactList.list.table.style.visibility = "hidden";
			contactList.list.table.style.visibility = "visible";
			helpBox.stopShowing("contacts")
		} else {
			if (contactsView.getSelected() == _T("INTERFACE_CONTACTS_GROUPS_TAB")) {
				contactsView.groupDetails.hide();
				helpBox.stopShowing("groups")
			} else {
				if (contactsView.getSelected() == _T("INTERFACE_CONTACTS_INVITES_TAB")) {
					helpBox.stopShowing("invites")
				}
			}
		}
	}
	if (F == "Settings") {
		if (settingsView.getSelected() == _T("INTERFACE_SETTINGS_LISTS_TAB")) {
			settingsView.listDetails.hide();
			helpBox.stopShowing("settings.lists")
		} else {
			if (settingsView.getSelected() == _T("INTERFACE_SETTINGS_LOCATIONS_TAB")) {
				settingsView.locationDetails.hide();
				helpBox.stopShowing("settings.locations")
			} else {
				if (settingsView.getSelected() == _T("INTERFACE_TASKS_TASK_DETAILS_TAGS")) {
					settingsView.tagDetails.hide();
					helpBox.stopShowing("settings.tags")
				} else {
					if (settingsView.getSelected() == _T("INTERFACE_SETTINGS_GENERAL_TAB")) {
						helpBox.stopShowing("settings.general")
					} else {
						if (settingsView.getSelected() == _T("INTERFACE_SETTINGS_REMINDERS_TAB")) {
							helpBox.stopShowing("settings.reminders")
						} else {
							if (settingsView.getSelected() == _T("INTERFACE_SETTINGS_SERVICES_TAB")) {
								helpBox.stopShowing("settings.services")
							} else {
								if (settingsView.getSelected() == _T("INTERFACE_SYNC_TITLE")) {
									helpBox.stopShowing("settings.sync")
								} else {
									if (settingsView.getSelected() == _T("INTERFACE_SETTINGS_INFO_TAB")) {
										helpBox.stopShowing("settings.info")
									}
								}
							}
						}
					}
				}
			}
		}
	}
	if (D == "Tasks") {
		if (!view.getPublicMode()) {
			this.showTasksAdder()
		}
		if (tasksView.inSentList()) {
			noteMgr.disable();
			helpBox.showHelpText("tasks.sent")
		} else {
			if (tasksView.inInboxList()) {
				helpBox.showHelpText("tasks.inbox")
			}
			noteMgr.enable()
		}
		this.showTasksToolbox(taskList.view);
		this.tasksViewReflectDisplay();
		this.tasksFormat()
	} else {
		if (D == "Contacts") {
			contactsView.contactDetails.disable();
			contactsView.groupDetails.disable();
			if (contactsView.getSelected() == _T("INTERFACE_CONTACTS_CONTACTS_TAB")) {
				contactsdetailstabs.renameEntry(contactsdetailstabs.entries[0],
						_T("INTERFACE_CONTACTS_CONTACT_TAB"));
				contactsdetailstabs.blitDiv();
				this.showContactsAdder();
				this.contactsFormat();
				helpBox.showHelpText("contacts")
			} else {
				if (contactsView.getSelected() == _T("INTERFACE_CONTACTS_GROUPS_TAB")) {
					contactsdetailstabs.renameEntry(
							contactsdetailstabs.entries[0],
							_T("INTERFACE_CONTACTS_GROUPS_GROUP_TAB"));
					contactsdetailstabs.blitDiv();
					this.showGroupsAdder();
					this.groupsFormat();
					helpBox.showHelpText("groups")
				} else {
					contactsdetailstabs.renameEntry(
							contactsdetailstabs.entries[0],
							_T("INTERFACE_CONTACTS_INVITES_TAB"));
					helpBox.showHelpText("invites");
					this.invitesFormat();
					contactsdetailstabs.blitDiv();
					if (!view.getPublicMode()) {
						adder.hide()
					}
				}
			}
		} else {
			if (D == "Settings") {
				if (settingsView.getSelected() == _T("INTERFACE_SETTINGS_LISTS_TAB")) {
					settingsdetailstabs.renameEntry(
							settingsdetailstabs.entries[0],
							_T("INTERFACE_SETTINGS_LISTS_TAB"));
					settingsdetailstabs.blitDiv();
					this.showListsAdder();
					this.listsFormat();
					helpBox.showHelpText("settings.lists")
				} else {
					if (settingsView.getSelected() == _T("INTERFACE_SETTINGS_LOCATIONS_TAB")) {
						settingsdetailstabs.renameEntry(
								settingsdetailstabs.entries[0],
								_T("INTERFACE_SETTINGS_LOCATIONS_TAB"));
						settingsdetailstabs.blitDiv();
						adder.hide();
						this.locationsFormat();
						helpBox.showHelpText("settings.locations")
					} else {
						if (settingsView.getSelected() == _T("INTERFACE_TASKS_TASK_DETAILS_TAGS")) {
							settingsdetailstabs.renameEntry(
									settingsdetailstabs.entries[0],
									_T("INTERFACE_TASKS_TASK_DETAILS_TAGS"));
							settingsdetailstabs.blitDiv();
							adder.hide();
							this.tagsFormat();
							helpBox.showHelpText("settings.tags")
						} else {
							if (settingsView.getSelected() == _T("INTERFACE_SETTINGS_GENERAL_TAB")) {
								settingsdetailstabs.renameEntry(
										settingsdetailstabs.entries[0],
										_T("INTERFACE_SETTINGS_GENERAL_TAB"));
								settingsdetailstabs.blitDiv();
								this.generalSettingsFormat();
								helpBox.showHelpText("settings.general")
							} else {
								if (settingsView.getSelected() == _T("INTERFACE_SETTINGS_REMINDERS_TAB")) {
									settingsdetailstabs
											.renameEntry(
													settingsdetailstabs.entries[0],
													_T("INTERFACE_SETTINGS_REMINDERS_TAB"));
									settingsdetailstabs.blitDiv();
									this.reminderSettingsFormat();
									helpBox.showHelpText("settings.reminders")
								} else {
									if (settingsView.getSelected() == _T("INTERFACE_SETTINGS_SERVICES_TAB")) {
										settingsdetailstabs
												.renameEntry(
														settingsdetailstabs.entries[0],
														_T("INTERFACE_SETTINGS_SERVICES_TAB"));
										settingsdetailstabs.blitDiv();
										this.servicesSettingsFormat();
										helpBox
												.showHelpText("settings.services")
									} else {
										if (settingsView.getSelected() == _T("INTERFACE_SYNC_TITLE")) {
											settingsdetailstabs
													.renameEntry(
															settingsdetailstabs.entries[0],
															_T("INTERFACE_SYNC_TITLE"));
											settingsdetailstabs.blitDiv();
											this.syncSettingsFormat();
											helpBox
													.showHelpText("settings.sync")
										} else {
											if (settingsView.getSelected() == _T("INTERFACE_SETTINGS_INFO_TAB")) {
												settingsdetailstabs
														.renameEntry(
																settingsdetailstabs.entries[0],
																_T("INTERFACE_SETTINGS_INFO_TAB"));
												settingsdetailstabs.blitDiv();
												this.infoSettingsFormat();
												helpBox
														.showHelpText("settings.info")
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
};
Control.prototype.taskSeriesMap = function(E) {
	var B = {};
	for ( var A = 0; A < E.length; A++) {
		var D = stateMgr.tasks[E[A]].series_id;
		if (!is(B[D])) {
			B[D] = []
		}
		B[D].push( [ stateMgr.tasks[E[A]].list_id, E[A] ])
	}
	return B
};
Control.prototype.getTasksForTaskSeries = function(B) {
	var D = [];
	for ( var A in stateMgr.tasks) {
		if (is(stateMgr.tasks[A]) && stateMgr.tasks[A].series_id == B) {
			D.push(A)
		}
	}
	return D
};
Control.getTasksForTaskSeriesList = function(E) {
	var F = [];
	var A = {};
	for ( var D = 0, B = E.length; D < B; D++) {
		A[E[D]] = 1
	}
	for ( var D in stateMgr.tasks) {
		if (is(stateMgr.tasks[D]) && stateMgr.tasks[D].series_id in A) {
			F.push(D)
		}
	}
	return F
};
Control.prototype.taskSeriesFlatten = function(B, F) {
	var H = [];
	if (B === null || B instanceof Array) {
		return H
	}
	for ( var E in B) {
		var A = B[E];
		for ( var D = 0; D < A.length; D++) {
			if (A[D] instanceof Array && !F) {
				H.push(A[D][1])
			} else {
				H.push(A[D])
			}
		}
	}
	return H
};
Control.prototype.getTaskSeries = function(A) {
	var B = [];
	if (A === null || A instanceof Array) {
		return B
	}
	for ( var D in A) {
		B.push(D)
	}
	return B
};
Control.prototype.tasksTaskTabChanged = function(F, H) {
	var D = H[0][0];
	var E = H[0][1];
	var A = H[1][0];
	var B = H[1][1];
	this.tasksViewReflectDisplay();
	if (F.hidden == false && D !== null) {
		this.tasksFormat()
	}
};
Control.prototype.taskSeriesExtract = function(A) {
	for ( var B in A) {
		return B
	}
};
Control.prototype.tasksListDetailsTabChanged = function() {
	this.tasksViewReflectDisplay();
	this.tasksFormat()
};
Control.onTagsUpdated = function() {
	taskCloud.update();
	setTimeout(function() {
		tagList.update()
	}, 0)
};
Control.updateTRepoAnchorForLists = function(A) {
	map(function(B) {
		Control.outstandingListIds.push(B)
	}, A)
};
Control.onTRepoAnchorChange = function(A) {
	map(function(B) {
		stateMgr.lists[B].list_last_anchor = A
	}, Control.outstandingListIds);
	rtmTRepoAnchor = A;
	Control.outstandingListIds = []
};
Control.prototype.initPrivate = function() {
	var A9 = this;
	var AF = function(BX, BY) {
		A9.inviteFailure(BY)
	};
	messageBus.subscribe(AF, inviteMgr.mbn + "inviteFailure");
	var s = function(BX, BY) {
		A9.inviteSuccess(BY)
	};
	messageBus.subscribe(s, inviteMgr.mbn + "inviteSuccess");
	var u = function(BX, BY) {
		A9.listsAcceptList(BY)
	};
	messageBus.subscribe(u, listList.mbn + "acceptList");
	var AU = function(BX, BY) {
		A9.listsRejectList(BY)
	};
	messageBus.subscribe(AU, listList.mbn + "rejectList");
	var B = function(BX, BY) {
		A9.listsSetFilterSuccess(BY)
	};
	messageBus.subscribe(B, listList.mbn + "setFilterSuccess");
	var x = function(BX, BY) {
		A9.shareRadioSelected(BY)
	};
	messageBus.subscribe(x, shareMgr.radiogroup.mbn + "radioSelected");
	var AD = function(BX, BY) {
		A9.publishRadioSelected(BY)
	};
	messageBus.subscribe(AD, publishMgr.radiogroup.mbn + "radioSelected");
	var AM = function(BX, BY) {
		A9.permissionsUpdated()
	};
	messageBus.subscribe(AM, stateMgr.mbn + "permissionsUpdated");
	var p = function(BX, BY) {
		A9.listsSharingSuccess(BY)
	};
	messageBus.subscribe(p, listList.mbn + "sharingSuccess");
	var A6 = function(BX, BY) {
		A9.shareButtonClicked()
	};
	messageBus.subscribe(A6, shareMgr.mbn + "buttonClicked");
	var BM = function(BX, BY) {
		A9.publishButtonClicked()
	};
	messageBus.subscribe(BM, publishMgr.mbn + "buttonClicked");
	var A1 = function(BX, BY) {
		A9.listSaveButtonClicked()
	};
	messageBus.subscribe(A1, saveMgr.mbn + "buttonClicked");
	var AK = function(BX, BY) {
		A9.tasksSharingSuccess(BY)
	};
	messageBus.subscribe(AK, taskList.mbn + "sharingSuccess");
	var AY = function(BX, BY) {
		A9.tasksSharingFailure(BY)
	};
	messageBus.subscribe(AY, taskList.mbn + "sharingFailure");
	var Z = function(BX, BY) {
		A9.continueToTasks(BY)
	};
	messageBus.subscribe(Z, configurationMgr.mbn + "continueToTasks");
	var AV = function(BX, BY) {
		A9.listsDeleted(BY)
	};
	messageBus.subscribe(AV, listList.mbn + "listsDeleted");
	var E = function(BX, BY) {
		A9.listDefaultChanged(BY)
	};
	messageBus.subscribe(E, listList.mbn + "listDefaultChanged");
	messageBus.subscribe(E, listList.mbn + "listDefaultCleared");
	var Ar = function(BX, BY) {
		A9.locationDefaultChanged(BY)
	};
	messageBus.subscribe(Ar, listList.mbn + "locationDefaultChanged");
	messageBus.subscribe(Ar, listList.mbn + "locationDefaultCleared");
	var b = function(BX, BY) {
		A9.configurationUpdated(BY)
	};
	messageBus.subscribe(b, configurationMgr.mbn + "configurationUpdated");
	var Af = function(BX, BY) {
		A9.notificationConfigurationUpdated(BY)
	};
	messageBus.subscribe(Af, notificationMgr.mbn + "configurationUpdated");
	var BP = function(BX, BY) {
		A9.notificationAdd(BY)
	};
	messageBus.subscribe(BP, notificationMgr.list.mbn + "notificationAdd");
	var o = function(BX, BY) {
		A9.notificationUpdate(BY)
	};
	messageBus.subscribe(o, notificationMgr.list.mbn + "notificationUpdate");
	var BG = function(BX, BY) {
		A9.notificationDelete(BY)
	};
	messageBus.subscribe(BG, notificationMgr.list.mbn + "notificationDelete");
	var AR = function(BX, BY) {
		A9.notificationToggle(BY)
	};
	messageBus.subscribe(AR, notificationMgr.list.mbn + "notificationToggle");
	var Aw = function(BX, BY) {
		A9.notificationAdded(BY)
	};
	messageBus.subscribe(Aw, notificationMgr.mbn + "notificationAdded");
	var Az = function(BX, BY) {
		A9.notificationUpdated(BY)
	};
	messageBus.subscribe(Az, notificationMgr.mbn + "notificationUpdated");
	var An = function(BX, BY) {
		A9.notificationDeleted(BY)
	};
	messageBus.subscribe(An, notificationMgr.mbn + "notificationDeleted");
	var Aq = function(BX, BY) {
		A9.notificationToggled(BY)
	};
	messageBus.subscribe(Aq, notificationMgr.mbn + "notificationToggled");
	var d = function(BX, BY) {
		A9.notesDeleteSuccess(BY)
	};
	messageBus.subscribe(d, noteMgr.mbn + "noteDeleteSuccess");
	var BJ = function(BX, BY) {
		A9.notesAddSuccess(BY)
	};
	messageBus.subscribe(BJ, noteMgr.mbn + "noteAddSuccess");
	var BT = function(BX, BY) {
		A9.notesAddFailure(BY)
	};
	messageBus.subscribe(BT, noteMgr.mbn + "noteAddFailure");
	var BR = function(BX, BY) {
		A9.fieldsTitleEditFinished(BX, BY)
	};
	messageBus.subscribe(BR, tasksView.taskDetails.fieldsTitle.mbn
			+ "editFinished");
	var At = function(BX, BY) {
		A9.tasksDetailsTagsEditStarted(BX, BY)
	};
	messageBus.subscribe(At, tasksView.taskDetails.detailsTags.mbn
			+ "editStarted");
	var A7 = function(BX, BY) {
		A9.tasksDetailsTagsEditCancelled(BX, BY)
	};
	messageBus.subscribe(A7, tasksView.taskDetails.detailsTags.mbn
			+ "editCancelled");
	var A0 = function(BX, BY) {
		A9.tasksDetailsTagsEditFinished(BX, BY)
	};
	messageBus.subscribe(A0, tasksView.taskDetails.detailsTags.mbn
			+ "editFinished");
	var Am = function(BX, BY) {
		A9.tasksDetailsDueEditStarted(BX, BY)
	};
	messageBus.subscribe(Am, tasksView.taskDetails.detailsDue.mbn
			+ "editStarted");
	var Ab = function(BX, BY) {
		A9.tasksDetailsDueEditCancelled(BX, BY)
	};
	messageBus.subscribe(Ab, tasksView.taskDetails.detailsDue.mbn
			+ "editCancelled");
	var BD = function(BX, BY) {
		A9.tasksDetailsDueEditFinished(BX, BY)
	};
	messageBus.subscribe(BD, tasksView.taskDetails.detailsDue.mbn
			+ "editFinished");
	var Aj = function(BX, BY) {
		A9.tasksDetailsReoccurEditStarted(BX, BY)
	};
	messageBus.subscribe(Aj, tasksView.taskDetails.detailsReoccur.mbn
			+ "editStarted");
	var BS = function(BX, BY) {
		A9.tasksDetailsReoccurEditCancelled(BX, BY)
	};
	messageBus.subscribe(BS, tasksView.taskDetails.detailsReoccur.mbn
			+ "editCancelled");
	var f = function(BX, BY) {
		A9.tasksDetailsReoccurEditFinished(BX, BY)
	};
	messageBus.subscribe(f, tasksView.taskDetails.detailsReoccur.mbn
			+ "editFinished");
	var A5 = function(BX, BY) {
		A9.tasksDetailsDurationEditStarted(BX, BY)
	};
	messageBus.subscribe(A5, tasksView.taskDetails.detailsDuration.mbn
			+ "editStarted");
	var A3 = function(BX, BY) {
		A9.tasksDetailsDurationEditCancelled(BX, BY)
	};
	messageBus.subscribe(A3, tasksView.taskDetails.detailsDuration.mbn
			+ "editCancelled");
	var Aa = function(BX, BY) {
		A9.tasksDetailsDurationEditFinished(BX, BY)
	};
	messageBus.subscribe(Aa, tasksView.taskDetails.detailsDuration.mbn
			+ "editFinished");
	var e = function(BX, BY) {
		A9.tasksDetailsURLEditStarted(BX, BY)
	};
	messageBus.subscribe(e, tasksView.taskDetails.detailsURL.mbn
			+ "editStarted");
	var w = function(BX, BY) {
		A9.tasksDetailsURLEditCancelled(BX, BY)
	};
	messageBus.subscribe(w, tasksView.taskDetails.detailsURL.mbn
			+ "editCancelled");
	var z = function(BX, BY) {
		A9.tasksDetailsURLEditFinished(BX, BY)
	};
	messageBus.subscribe(z, tasksView.taskDetails.detailsURL.mbn
			+ "editFinished");
	var Y = function(BX, BY) {
		A9.tasksDetailsLocationEditStarted(BX, BY)
	};
	messageBus.subscribe(Y, tasksView.taskDetails.detailsLocation.mbn
			+ "editStarted");
	var AA = function(BX, BY) {
		A9.tasksDetailsLocationEditCancelled(BX, BY)
	};
	messageBus.subscribe(AA, tasksView.taskDetails.detailsLocation.mbn
			+ "editCancelled");
	var As = function(BX, BY) {
		A9.tasksDetailsLocationEditFinished(BX, BY)
	};
	messageBus.subscribe(As, tasksView.taskDetails.detailsLocation.mbn
			+ "editFinished");
	var BQ = function(BX, BY) {
		A9.tasksSetPriority(BY)
	};
	messageBus.subscribe(BQ, taskList.mbn + "tasksSetPriority");
	var W = function(BX, BY) {
		A9.tasksMoved(BY)
	};
	messageBus.subscribe(W, taskList.mbn + "tasksMoved");
	var AB = function(BX, BY) {
		A9.tasksRenamed(BY)
	};
	messageBus.subscribe(AB, taskList.mbn + "tasksRenamed");
	var Av = function(BX, BY) {
		A9.listsRenamed(BY)
	};
	messageBus.subscribe(Av, listList.mbn + "listsRenamed");
	var O = function(BX, BY) {
		A9.tasksCompleted(BY)
	};
	messageBus.subscribe(O, taskList.mbn + "tasksCompleted");
	var AI = function(BX, BY) {
		A9.tasksUncompleted(BY)
	};
	messageBus.subscribe(AI, taskList.mbn + "tasksUncompleted");
	var AN = function(BX, BY) {
		A9.tasksPostponed(BY)
	};
	messageBus.subscribe(AN, taskList.mbn + "tasksPostponed");
	var BV = function(BX, BY) {
		A9.tasksDeleted(BY)
	};
	messageBus.subscribe(BV, taskList.mbn + "tasksDeleted");
	var U = function(BX, BY) {
		A9.tasksDuplicated(BY)
	};
	messageBus.subscribe(U, taskList.mbn + "tasksDuplicated");
	var v = function(BX, BY) {
		A9.tasksDetailsTagsDone(BY)
	};
	messageBus.subscribe(v, taskList.mbn + "tasksDetailsTagsDone");
	var AP = function(BX, BY) {
		A9.tasksDetailsDueDone(BY)
	};
	messageBus.subscribe(AP, taskList.mbn + "tasksDetailsDueDone");
	var AH = function(BX, BY) {
		A9.tasksDetailsReoccurrenceDone(BY)
	};
	messageBus.subscribe(AH, taskList.mbn + "tasksDetailsReoccurrenceDone");
	var BF = function(BX, BY) {
		A9.tasksDetailsDurationDone(BY)
	};
	messageBus.subscribe(BF, taskList.mbn + "tasksDetailsDurationDone");
	var Al = function(BX, BY) {
		A9.tasksDetailsURLDone(BY)
	};
	messageBus.subscribe(Al, taskList.mbn + "tasksDetailsURLDone");
	var AO = function(BX, BY) {
		A9.tasksDetailsLocationDone(BY)
	};
	messageBus.subscribe(AO, taskList.mbn + "tasksDetailsLocationDone");
	var BL = function(BX, BY) {
		A9.listDetailsFilterEditStarted(BX, BY)
	};
	messageBus.subscribe(BL, settingsView.listDetails.listFilter.mbn
			+ "editStarted");
	var AC = function(BX, BY) {
		A9.listDetailsFilterEditCancelled(BX, BY)
	};
	messageBus.subscribe(AC, settingsView.listDetails.listFilter.mbn
			+ "editCancelled");
	var AX = function(BX, BY) {
		A9.listDetailsFilterEditFinished(BX, BY)
	};
	messageBus.subscribe(AX, settingsView.listDetails.listFilter.mbn
			+ "editFinished");
	var AG = function(BX, BY) {
		A9.listsArchived(BY)
	};
	messageBus.subscribe(AG, listList.mbn + "listsArchived");
	var k = function(BX, BY) {
		A9.listsUnarchive(BY)
	};
	messageBus.subscribe(k, listList.mbn + "unarchiveList");
	var A2 = function(BX, BY) {
		A9.listsUnarchived(BY)
	};
	messageBus.subscribe(A2, listList.mbn + "listsUnarchived");
	var R = function(BX, BY) {
		A9.contactsAttached(BY)
	};
	messageBus.subscribe(R, contactList.mbn + "contactsAttached");
	var m = function(BX, BY) {
		A9.contactsDetached(BY)
	};
	messageBus.subscribe(m, contactList.mbn + "contactsDetached");
	var a = function(BX, BY) {
		A9.contactsDeleted(BY)
	};
	messageBus.subscribe(a, contactList.mbn + "contactsDeleted");
	var Q = function(BX, BY) {
		A9.groupsDeleted(BY)
	};
	messageBus.subscribe(Q, groupList.mbn + "groupsDeleted");
	var BO = function(BX, BY) {
		A9.showContact(BY)
	};
	messageBus.subscribe(BO, contactList.mbn + "showContact");
	var Au = function(BX, BY) {
		A9.showGroup(BY)
	};
	messageBus.subscribe(Au, groupList.mbn + "showGroup");
	var Ae = function(BX, BY) {
		A9.adderClicked(BX, BY)
	};
	messageBus.subscribe(Ae, adder.mbn + "adderClicked");
	var A8 = function(BX, BY) {
		A9.viewModeChanged(BY)
	};
	messageBus.subscribe(A8, view.mbn + "modeChanged");
	var j = function(BX, BY) {
		A9.overviewListTabChanged(BY)
	};
	messageBus.subscribe(j, overviewTabs.mbn + "tabChanged");
	var J = function(BX, BY) {
		A9.contactsTabChanged(BY)
	};
	messageBus.subscribe(J, contactsTabs.mbn + "tabChanged");
	var I = function(BX, BY) {
		A9.settingsTabChanged(BY)
	};
	messageBus.subscribe(I, settingsTabs.mbn + "tabChanged");
	var AL = function(BX, BY) {
		A9.contactsContactSelected(BY)
	};
	messageBus.subscribe(AL, contactList.list.getUniqueMessageBusName()
			+ "selectFinished");
	var Ag = function(BX, BY) {
		A9.contactsContactHoverOn(BY)
	};
	messageBus.subscribe(Ag, contactList.list.getUniqueMessageBusName()
			+ "hoverOn");
	var AT = function(BX, BY) {
		A9.contactsContactHoverOff(BY)
	};
	messageBus.subscribe(AT, contactList.list.getUniqueMessageBusName()
			+ "hoverOff");
	var h = function(BX, BY) {
		A9.groupsGroupSelected(BY)
	};
	messageBus.subscribe(h, groupList.list.getUniqueMessageBusName()
			+ "selectFinished");
	var Ak = function(BX, BY) {
		A9.groupsGroupHoverOn(BY)
	};
	messageBus.subscribe(Ak, groupList.list.getUniqueMessageBusName()
			+ "hoverOn");
	var r = function(BX, BY) {
		A9.groupsGroupHoverOff(BY)
	};
	messageBus.subscribe(r, groupList.list.getUniqueMessageBusName()
			+ "hoverOff");
	var BH = function(BX, BY) {
		A9.listsListSelected(BY)
	};
	messageBus.subscribe(BH, listList.list.getUniqueMessageBusName()
			+ "selectFinished");
	var q = function(BX, BY) {
		A9.listsListHoverOn(BY)
	};
	messageBus
			.subscribe(q, listList.list.getUniqueMessageBusName() + "hoverOn");
	var BC = function(BX, BY) {
		A9.listsListHoverOff(BY)
	};
	messageBus.subscribe(BC, listList.list.getUniqueMessageBusName()
			+ "hoverOff");
	var BU = function(BX, BY) {
		A9.locationsListSelected(BY)
	};
	messageBus.subscribe(BU, locationList.list.getUniqueMessageBusName()
			+ "selectFinished");
	var AJ = function(BX, BY) {
		A9.locationsListHoverOn(BY)
	};
	messageBus.subscribe(AJ, locationList.list.getUniqueMessageBusName()
			+ "hoverOn");
	var D = function(BX, BY) {
		A9.locationsListHoverOff(BY)
	};
	messageBus.subscribe(D, locationList.list.getUniqueMessageBusName()
			+ "hoverOff");
	var M = function(BX, BY) {
		A9.tagListSelected(BY)
	};
	messageBus.subscribe(M, tagList.list.getUniqueMessageBusName()
			+ "selectFinished");
	var Ao = function(BX, BY) {
		A9.tagListHoverOn(BY)
	};
	messageBus
			.subscribe(Ao, tagList.list.getUniqueMessageBusName() + "hoverOn");
	var A = function(BX, BY) {
		A9.tagListHoverOff(BY)
	};
	messageBus
			.subscribe(A, tagList.list.getUniqueMessageBusName() + "hoverOff");
	var y = function(BX, BY) {
		A9.statusBoxButtonClicked(BY)
	};
	messageBus.subscribe(y, statusBox.getUniqueMessageBusName()
			+ "buttonClicked");
	var BN = function(BX, BY) {
		A9.tasksButtonClicked(BY)
	};
	messageBus.subscribe(BN, tasksToolBox.getUniqueMessageBusName()
			+ "buttonClicked");
	var BE = function(BX, BY) {
		A9.tasksCompletedButtonClicked(BY)
	};
	messageBus.subscribe(BE, tasksCompletedToolBox.getUniqueMessageBusName()
			+ "buttonClicked");
	var AQ = function(BX, BY) {
		A9.contactsSelectorClicked(BY)
	};
	messageBus.subscribe(AQ, contactsToolbox.getUniqueMessageBusName()
			+ "selectorClicked");
	var Ap = function(BX, BY) {
		A9.contactsButtonClicked(BY)
	};
	messageBus.subscribe(Ap, contactsToolbox.getUniqueMessageBusName()
			+ "buttonClicked");
	var Ai = function(BX, BY) {
		A9.groupsSelectorClicked(BY)
	};
	messageBus.subscribe(Ai, groupsToolbox.getUniqueMessageBusName()
			+ "selectorClicked");
	var K = function(BX, BY) {
		A9.groupsButtonClicked(BY)
	};
	messageBus.subscribe(K, groupsToolbox.getUniqueMessageBusName()
			+ "buttonClicked");
	var Ad = function(BX, BY) {
		A9.listsSelectorClicked(BY)
	};
	messageBus.subscribe(Ad, listsToolbox.getUniqueMessageBusName()
			+ "selectorClicked");
	var H = function(BX, BY) {
		A9.listsButtonClicked(BY)
	};
	messageBus.subscribe(H, listsToolbox.getUniqueMessageBusName()
			+ "buttonClicked");
	var BK = function(BX, BY) {
		A9.locationsSelectorClicked(BY)
	};
	messageBus.subscribe(BK, locationsToolbox.getUniqueMessageBusName()
			+ "selectorClicked");
	var BB = function(BX, BY) {
		A9.locationsButtonClicked(BY)
	};
	messageBus.subscribe(BB, locationsToolbox.getUniqueMessageBusName()
			+ "buttonClicked");
	var F = function(BX, BY) {
		A9.tagsSelectorClicked(BY)
	};
	messageBus.subscribe(F, tagToolbox.getUniqueMessageBusName()
			+ "selectorClicked");
	var i = function(BX, BY) {
		A9.tagsButtonClicked(BY)
	};
	messageBus.subscribe(i, tagToolbox.getUniqueMessageBusName()
			+ "buttonClicked");
	var Ay = function(BX, BY) {
		A9.contactsSelectionChanged(BX, BY)
	};
	messageBus.subscribe(Ay, contactsToolbox.getUniqueMessageBusName()
			+ "selectionChanged");
	var BA = function(BX, BY) {
		A9.listsSelectionChanged(BX, BY)
	};
	messageBus.subscribe(BA, listsToolbox.getUniqueMessageBusName()
			+ "selectionChanged");
	var BW = function(BX, BY) {
		A9.locationsSelectionChanged(BX, BY)
	};
	messageBus.subscribe(BW, locationsToolbox.getUniqueMessageBusName()
			+ "selectionChanged");
	var X = function(BX, BY) {
		A9.tagsSelectionChanged(BX, BY)
	};
	messageBus.subscribe(X, tagToolbox.getUniqueMessageBusName()
			+ "selectionChanged");
	var AE = function(BX, BY) {
		A9.listCountSelected(BX, BY)
	};
	messageBus.subscribe(AE, groupList.list.getUniqueMessageBusName()
			+ "selectFinished");
	messageBus.subscribe(AE, contactList.list.getUniqueMessageBusName()
			+ "selectFinished");
	messageBus.subscribe(AE, listList.list.getUniqueMessageBusName()
			+ "selectFinished");
	messageBus.subscribe(AE, locationList.list.getUniqueMessageBusName()
			+ "selectFinished");
	messageBus.subscribe(AE, tagList.list.getUniqueMessageBusName()
			+ "selectFinished");
	var Ac = function(BX, BY) {
		A9.listSelectedCleared(BX, BY)
	};
	messageBus.subscribe(Ac, groupList.list.getUniqueMessageBusName()
			+ "selectCleared");
	messageBus.subscribe(Ac, contactList.list.getUniqueMessageBusName()
			+ "selectCleared");
	messageBus.subscribe(Ac, listList.list.getUniqueMessageBusName()
			+ "selectCleared");
	messageBus.subscribe(Ac, locationList.list.getUniqueMessageBusName()
			+ "selectCleared");
	messageBus.subscribe(Ac, tagList.list.getUniqueMessageBusName()
			+ "selectCleared");
	var AZ = function(BX, BY) {
		A9.overviewSelected(BX, BY)
	};
	messageBus.subscribe(AZ, overviewList.list.getUniqueMessageBusName()
			+ "selectFinished");
	var BI = function(BX, BY) {
		A9.browserLocationChanged(BX, BY)
	};
	messageBus.subscribe(BI, eventMgr.getUniqueMessageBusName()
			+ "locationChanged");
	var AS = function(BX, BY) {
		if (BY) {
			statusBox.undoSuccess();
			tasksView.reflectUndoSelector()
		} else {
			statusBox.undoFailure()
		}
	};
	messageBus
			.subscribe(AS, undoMgr.getUniqueMessageBusName() + "undoFinished");
	var AW = function(BX, BY) {
		A9.showTag(BY)
	};
	messageBus.subscribe(AW, tasksView.getUniqueMessageBusName() + "showTag");
	var Ah = function(BX, BY) {
		A9.showList(BY)
	};
	messageBus.subscribe(Ah, tasksView.getUniqueMessageBusName() + "showList");
	var V = function(BX, BY) {
		A9.showLocation(BY)
	};
	messageBus.subscribe(V, tasksView.getUniqueMessageBusName()
			+ "showLocation");
	var A4 = function(BX, BY) {
		A9.viewLocked(BY)
	};
	messageBus.subscribe(A4, view.getUniqueMessageBusName() + "viewLocked");
	var Ax = function(BX, BY) {
		A9.serviceDeleted(BY)
	};
	messageBus.subscribe(Ax, servicesMgr.mbn + "serviceDeleted");
	this.inited = true
};
Control.prototype.overviewListTabChanged = function(F) {
	var D = F[0][0];
	var E = F[0][1];
	var A = F[1][0];
	var B = F[1][1];
	if (D !== null) {
		overviewList.updateForFilter(F[2], A)
	}
};
Control.prototype.contactsContactSelected = function(B) {
	var A = B[0];
	var E = B[1];
	if (A) {
		var D = contactList.list.entries[E][0];
		format.formatContact(D);
		Control.snakeForList(contactList.list, D)
	} else {
		format.formatContactStatistics();
		Control.snakeForList(contactList.list, null)
	}
};
Control.prototype.contactsContactHoverOn = function(A) {
	var B = A;
	format.formatContact(B);
	Control.snakeForList(contactList.list, B)
};
Control.prototype.contactsContactHoverOff = function(A) {
	var D = contactList.list.getLastSelected();
	if (D === null) {
		format.formatContactStatistics();
		Control.snakeForList(contactList.list, null)
	} else {
		var B = contactList.list.entries[D][0];
		format.formatContact(B);
		Control.snakeForList(contactList.list, B)
	}
};
Control.prototype.groupsGroupSelected = function(B) {
	var A = B[0];
	var E = B[1];
	if (A) {
		var D = groupList.list.entries[E][0];
		format.formatGroup(D);
		Control.snakeForList(groupList.list, D)
	} else {
		format.formatGroupStatistics();
		Control.snakeForList(groupList.list, null)
	}
};
Control.prototype.groupsGroupHoverOn = function(A) {
	var B = A;
	format.formatGroup(B);
	Control.snakeForList(groupList.list, B)
};
Control.prototype.groupsGroupHoverOff = function(A) {
	var D = groupList.list.getLastSelected();
	if (D === null) {
		format.formatGroupStatistics();
		Control.snakeForList(groupList.list, null)
	} else {
		var B = groupList.list.entries[D][0];
		format.formatGroup(B);
		Control.snakeForList(groupList.list, B)
	}
};
Control.prototype.listsListSelected = function(B) {
	var A = B[0];
	var E = B[1];
	if (A) {
		var D = listList.list.entries[E][0];
		format.formatList(D);
		Control.snakeForList(listList.list, D)
	} else {
		format.formatListStatistics();
		Control.snakeForList(listList.list, null)
	}
};
Control.prototype.listsListHoverOn = function(A) {
	var B = A;
	format.formatList(B);
	Control.snakeForList(listList.list, B)
};
Control.prototype.listsListHoverOff = function(A) {
	var D = listList.list.getLastSelected();
	if (D === null) {
		format.formatListStatistics();
		Control.snakeForList(listList.list, null)
	} else {
		var B = listList.list.entries[D][0];
		format.formatList(B);
		Control.snakeForList(listList.list, B)
	}
};
Control.prototype.locationsListSelected = function(B) {
	var A = B[0];
	var E = B[1];
	if (A) {
		var D = locationList.list.entries[E][0];
		format.formatLocation(D);
		Control.snakeForList(locationList.list, D)
	} else {
		format.formatLocationStatistics();
		Control.snakeForList(locationList.list, null)
	}
};
Control.prototype.locationsListHoverOn = function(A) {
	var B = A;
	format.formatLocation(B);
	Control.snakeForList(locationList.list, B)
};
Control.prototype.locationsListHoverOff = function(A) {
	var D = locationList.list.getLastSelected();
	if (D === null) {
		format.formatLocationStatistics();
		Control.snakeForList(locationList.list, null)
	} else {
		var B = locationList.list.entries[D][0];
		format.formatLocation(B);
		Control.snakeForList(locationList.list, B)
	}
};
Control.prototype.tagListSelected = function(B) {
	var A = B[0];
	var E = B[1];
	if (A) {
		var D = tagList.list.entries[E][0];
		format.formatTag(D);
		Control.snakeForList(tagList.list, D)
	} else {
		format.formatTagStatistics();
		Control.snakeForList(tagList.list, null)
	}
};
Control.prototype.tagListHoverOn = function(A) {
	var B = A;
	format.formatTag(B);
	Control.snakeForList(tagList.list, B)
};
Control.prototype.tagListHoverOff = function(A) {
	var D = tagList.list.getLastSelected();
	if (D === null) {
		format.formatTagStatistics();
		Control.snakeForList(tagList.list, null)
	} else {
		var B = tagList.list.entries[D][0];
		format.formatTag(B);
		Control.snakeForList(tagList.list, B)
	}
};
Control.prototype.contactsSelectorClicked = function(B) {
	var D = B[0];
	var A = B[1];
	switch (D) {
	case _T("INTERFACE_TASKS_SELECT_ALL"):
		contactList.list.selectAll(A);
		return;
	case _T("INTERFACE_TASKS_SELECT_NONE"):
		contactList.list.selectNone(A);
		return;
	default:
		return
	}
};
Control.prototype.groupsSelectorClicked = function(B) {
	var D = B[0];
	var A = B[1];
	switch (D) {
	case _T("INTERFACE_TASKS_SELECT_ALL"):
		groupList.list.selectAll(A);
		return;
	case _T("INTERFACE_TASKS_SELECT_NONE"):
		groupList.list.selectNone(A);
		return;
	default:
		return
	}
};
Control.prototype.listsSelectorClicked = function(B) {
	var D = B[0];
	var A = B[1];
	switch (D) {
	case _T("INTERFACE_TASKS_SELECT_ALL"):
		listList.list.selectAll(A);
		return;
	case _T("INTERFACE_TASKS_SELECT_NONE"):
		listList.list.selectNone(A);
		return;
	default:
		return
	}
};
Control.prototype.locationsSelectorClicked = function(B) {
	var D = B[0];
	var A = B[1];
	switch (D) {
	case _T("INTERFACE_TASKS_SELECT_ALL"):
		locationList.list.selectAll(A);
		return;
	case _T("INTERFACE_TASKS_SELECT_NONE"):
		locationList.list.selectNone(A);
		return;
	default:
		return
	}
};
Control.prototype.contactsFormat = function() {
	var D = contactList.list;
	var B = D.getLastSelected();
	if (B === null) {
		format.formatContactStatistics();
		Control.snakeForList(D, null)
	} else {
		var A = D.entries[B][0];
		format.formatContact(A);
		Control.snakeForList(D, A)
	}
};
Control.snakeForList = function(D, B) {
	if (B !== null) {
		var A = D.map[B];
		D.snake_.replace_all(D.table.rows[A]);
		if ("multi_snake_" in D && (view.isNewUI() || view.multiEditMode)
				&& !tasksView.getHovering()) {
			D.snake_.hide(true)
		}
	} else {
		D.snake_.hide(true)
	}
	D.snake_.draw()
};
Control.prototype.groupsFormat = function() {
	var B = groupList.list.getLastSelected();
	if (B === null) {
		format.formatGroupStatistics();
		Control.snakeForList(groupList.list, null)
	} else {
		var A = groupList.list.entries[B][0];
		format.formatGroup(A);
		Control.snakeForList(groupList.list, A)
	}
};
Control.prototype.listsFormat = function() {
	var B = listList.list.getLastSelected();
	if (B === null) {
		format.formatListStatistics();
		Control.snakeForList(listList.list, null)
	} else {
		var A = listList.list.entries[B][0];
		format.formatList(A);
		Control.snakeForList(listList.list, A)
	}
};
Control.prototype.locationsFormat = function() {
	var B = locationList.list.getLastSelected();
	if (B === null) {
		format.formatLocationStatistics();
		Control.snakeForList(locationList.list, null)
	} else {
		var A = locationList.list.entries[B][0];
		format.formatLocation(A);
		Control.snakeForList(locationList.list, A)
	}
};
Control.prototype.tagsFormat = function() {
	var B = tagList.list.getLastSelected();
	if (B === null) {
		format.formatTagStatistics();
		Control.snakeForList(tagList.list, null)
	} else {
		var A = tagList.list.entries[B][0];
		format.formatTag(A);
		Control.snakeForList(tagList.list, A)
	}
};
Control.prototype.invitesFormat = function() {
	format.formatInvites()
};
Control.prototype.generalSettingsFormat = function() {
	format.formatGeneralSettings()
};
Control.prototype.reminderSettingsFormat = function() {
	format.formatReminderSettings()
};
Control.prototype.servicesSettingsFormat = function() {
	format.formatServicesSettings()
};
Control.prototype.syncSettingsFormat = function() {
	format.formatSyncSettings()
};
Control.prototype.infoSettingsFormat = function() {
	format.formatInfoSettings()
};
Control.prototype.browserLocationChanged = function(A, B) {
	var D = B.split("#");
	if (D.length > 1) {
		D = D[1];
		switch (D) {
		case "section.overview":
			view.selectView("Overview");
			break;
		case "section.contacts":
			view.selectView("Contacts");
			break;
		case "section.tasks":
			view.selectView("Tasks");
			break;
		case "section.settings":
			view.selectView("Settings");
			break;
		default:
			break
		}
	}
};
Control.prototype.listsSetDefault = function(B) {
	if (B && listList.list.selected.length > 1) {
		statusBox.setText(_T("INTERFACE_STATUS_ONE_LIST_DEFAULT"), false, true);
		return false
	}
	if (listList.list.selected.length === 0) {
		if (B) {
			statusBox.setText(_T("INTERFACE_STATUS_MUST_SELECT_DEFAULT"),
					false, true)
		} else {
			statusBox.setText(_T("INTERFACE_STATUS_MUST_SELECT_UNSET_DEFAULT"),
					false, true)
		}
		return false
	}
	var A = listList.list.getLastSelectedId();
	listList.list.tableSetRowBusyById(A, true);
	if (B) {
		transMgr.request("lists.setDefaultList", utility.encodeJavaScript( {
			"list" : A
		}))
	} else {
		transMgr.request("lists.clearDefaultList", utility.encodeJavaScript( {
			"list" : A
		}))
	}
};
Control.prototype.listsSelectionChanged = function(B, E) {
	var D = E[0];
	var A = E[1];
	switch (D) {
	case _T("INTERFACE_SETTINGS_LISTS_TOOLBOX_SET_AS_DEFAULT"):
		this.listsSetDefault(true);
		break;
	case _T("INTERFACE_SETTINGS_LISTS_TOOLBOX_UNSET_AS_DEFAULT"):
		this.listsSetDefault(false);
		break;
	case _T("INTERFACE_SETTINGS_LISTS_TOOLBOX_ARCHIVE_LIST"):
		this.listsDoArchive(true);
		break;
	case _T("INTERFACE_SETTINGS_LISTS_TOOLBOX_UNARCHIVE_LIST"):
		this.listsDoArchive(false);
		break;
	case _T("INTERFACE_SETTINGS_LISTS_TOOLBOX_DELETE_LIST"):
		this.listsDelete();
		break;
	default:
		break
	}
};
Control.SHARE_TASK_SHARE = 0;
Control.SHARE_TASK_SEND = 1;
Control.SHARE_LIST_SHARE = 2;
Control.PUBLISH_LIST_PUBLISH = 3;
Control.prototype.checkTasksSelected = function() {
	var A = taskList.getViewList().getSelected();
	if (A.length > 0) {
		return true
	}
	statusBox.setText(_T("INTERFACE_STATUS_MUST_SELECT_ONE_OR_MORE_TASKS"),
			false, true);
	return false
};
Control.prototype.tasksSelectionChanged = function(D, H) {
	var F = H[0];
	var A = H[1];
	switch (F) {
	case _T("INTERFACE_TASKS_TOOLBOX_SET_PRIORITY_1"):
		if (this.checkTasksSelected()) {
			taskList.tasksSetPriority1()
		}
		break;
	case _T("INTERFACE_TASKS_TOOLBOX_SET_PRIORITY_2"):
		if (this.checkTasksSelected()) {
			taskList.tasksSetPriority2()
		}
		break;
	case _T("INTERFACE_TASKS_TOOLBOX_SET_PRIORITY_3"):
		if (this.checkTasksSelected()) {
			taskList.tasksSetPriority3()
		}
		break;
	case _T("INTERFACE_TASKS_TOOLBOX_SET_PRIORITY_NONE"):
		if (this.checkTasksSelected()) {
			taskList.tasksSetPriorityNone()
		}
		break;
	case _T("INTERFACE_TASKS_TOOLBOX_MOVE_PRIORITY_UP"):
		if (this.checkTasksSelected()) {
			taskList.tasksMovePriorityUp()
		}
		return;
	case _T("INTERFACE_TASKS_TOOLBOX_MOVE_PRIORITY_DOWN"):
		if (this.checkTasksSelected()) {
			taskList.tasksMovePriorityDown()
		}
		return;
	case _T("INTERFACE_TASKS_TOOLBOX_DELETE_TASK"):
		if (this.checkTasksSelected()) {
			this.tasksDelete()
		}
		return;
	case _T("INTERFACE_TASKS_TOOLBOX_DUPLICATE_TASK"):
		if (Offline.isNotOnline()) {
			return Offline.Dialog.showDisabledAction()
		}
		if (this.checkTasksSelected()) {
			this.tasksDuplicate()
		}
		return;
	case _T("INTERFACE_TASKS_TOOLBOX_SHARE_WITH"):
		if (Offline.isNotOnline()) {
			return Offline.Dialog.showDisabledAction()
		}
		if (this.checkTasksSelected()) {
			this.tasksShare(Control.SHARE_TASK_SHARE)
		}
		return;
	case _T("INTERFACE_TASKS_TOOLBOX_SEND_TO"):
		if (Offline.isNotOnline()) {
			return Offline.Dialog.showDisabledAction()
		}
		if (this.checkTasksSelected()) {
			this.tasksShare(Control.SHARE_TASK_SEND)
		}
		return;
	case _T("INTERFACE_TASKS_TOOLBOX_UNDO_LAST_ACTION"):
		this.undoLastAction();
		return;
	default:
		break
	}
	if (A) {
		if (this.checkTasksSelected()) {
			if (A.indexOf("tasks.moveTo") > -1) {
				var E = A.substring(A.lastIndexOf(".") + 1);
				if (E == stateMgr.currentList) {
					statusBox.setText(
							_T("INTERFACE_STATUS_CANT_MOVE_TO_LIST_ALREADY"),
							false, true);
					return false
				}
				for ( var B = 0; B < taskList.getViewList().selected.length; B++) {
					taskList.getViewList().tableSetRowBusy(
							taskList.getViewList().selected[B], true)
				}
				transMgr.request("tasks.moveTo", utility.encodeJavaScript( {
					"list" : stateMgr.currentList,
					"targetList" : E,
					"tasks" : this.taskSeriesMap(taskList.getViewList()
							.getSelected())
				}))
			}
		}
	}
};
Control.prototype.undoLastAction = function() {
	if (Offline.isNotOnline()) {
		return Offline.Dialog.showDisabledAction()
	}
	if (undoMgr.transactions.length > 0) {
		statusBox.setText("", true, true);
		statusBox.undoSetText(_T("INTERFACE_STATUS_UNDOING_LAST_ACTION"));
		undoMgr.undoTransaction()
	} else {
		statusBox.setText(_T("INTERFACE_STATUS_NOTHING_TO_UNDO"), false, true)
	}
};
Control.prototype.contactsSelectionChanged = function(D, F) {
	var E = F[0];
	var A = F[1];
	if (A) {
		var B = contactList.list.getSelected();
		if (B.length > 0) {
			if (A.indexOf("attachToGroup") > -1) {
				var H = A.substring(A.lastIndexOf(".") + 1);
				transMgr.request("contacts.attachToGroup", utility
						.encodeJavaScript( {
							"group" : H,
							"contacts" : B
						}))
			} else {
				if (A.indexOf("detachFromGroup") > -1) {
					var H = A.substring(A.lastIndexOf(".") + 1);
					transMgr.request("contacts.detachFromGroup", utility
							.encodeJavaScript( {
								"group" : H,
								"contacts" : B
							}))
				}
			}
		} else {
			statusBox.setText(_T("INTERFACE_STATUS_MUST_SELECT_A_CONTACT"),
					false, true)
		}
	}
};
Control.prototype.showTasksAdder = function() {
	adder.setType(Adder.ADDER_TYPE_TASK);
	adder.hide();
	if (!tasksView.inSentList()
			&& taskList.view == TaskList.TASK_LIST_VIEW_INCOMPLETE) {
		adder.show()
	}
	adder.blit()
};
Control.prototype.showContactsAdder = function() {
	adder.setType(Adder.ADDER_TYPE_CONTACT);
	adder.blit();
	adder.show()
};
Control.prototype.showGroupsAdder = function() {
	adder.setType(Adder.ADDER_TYPE_GROUP);
	adder.blit();
	adder.show()
};
Control.prototype.showListsAdder = function() {
	adder.setType(Adder.ADDER_TYPE_LIST);
	adder.blit();
	adder.show()
};
Control.prototype.contactsTabChanged = function(F) {
	var D = F[0][0];
	var E = F[0][1];
	var A = F[1][0];
	var B = F[1][1];
	if (D !== null) {
		if (E == _T("INTERFACE_CONTACTS_CONTACTS_TAB")
				|| E == _T("INTERFACE_CONTACTS_GROUPS_TAB")) {
			adder.hide()
		}
		if (E == _T("INTERFACE_CONTACTS_CONTACTS_TAB")) {
			contactsView.contactDetails.hide();
			helpBox.stopShowing("contacts")
		}
		if (E == _T("INTERFACE_CONTACTS_GROUPS_TAB")) {
			contactsView.groupDetails.hide();
			helpBox.stopShowing("groups")
		}
		if (E == _T("INTERFACE_CONTACTS_INVITES_TAB")) {
			helpBox.stopShowing("invites")
		}
		if (B == _T("INTERFACE_CONTACTS_CONTACTS_TAB")) {
			contactsdetailstabs.renameEntry(contactsdetailstabs.entries[0],
					_T("INTERFACE_CONTACTS_CONTACT_TAB"));
			contactsdetailstabs.blitDiv();
			this.showContactsAdder();
			this.contactsFormat();
			helpBox.showHelpText("contacts")
		}
		if (B == _T("INTERFACE_CONTACTS_GROUPS_TAB")) {
			contactsdetailstabs.renameEntry(contactsdetailstabs.entries[0],
					_T("INTERFACE_CONTACTS_GROUPS_GROUP_TAB"));
			contactsdetailstabs.blitDiv();
			this.showGroupsAdder();
			this.groupsFormat();
			helpBox.showHelpText("groups")
		}
		if (B == _T("INTERFACE_CONTACTS_INVITES_TAB")) {
			contactsdetailstabs.renameEntry(contactsdetailstabs.entries[0],
					_T("INTERFACE_CONTACTS_INVITES_TAB"));
			contactsdetailstabs.blitDiv();
			this.invitesFormat();
			helpBox.showHelpText("invites")
		}
	}
};
Control.prototype.settingsTabChanged = function(F) {
	var D = F[0][0];
	var E = F[0][1];
	var A = F[1][0];
	var B = F[1][1];
	if (D !== null) {
		if (E == _T("INTERFACE_SETTINGS_LISTS_TAB")) {
			adder.hide();
			settingsView.listDetails.hide();
			helpBox.stopShowing("settings.lists")
		} else {
			if (E == _T("INTERFACE_SETTINGS_LOCATIONS_TAB")) {
				settingsView.locationDetails.hide();
				helpBox.stopShowing("settings.locations")
			} else {
				if (E == _T("INTERFACE_TASKS_TASK_DETAILS_TAGS")) {
					settingsView.tagDetails.hide();
					helpBox.stopShowing("settings.tags")
				} else {
					if (E == _T("INTERFACE_SETTINGS_GENERAL_TAB")) {
						helpBox.stopShowing("settings.general")
					} else {
						if (E == _T("INTERFACE_SETTINGS_REMINDERS_TAB")) {
							helpBox.stopShowing("settings.reminders")
						} else {
							if (E == _T("INTERFACE_SETTINGS_SERVICES_TAB")) {
								helpBox.stopShowing("settings.services")
							} else {
								if (E == _T("INTERFACE_SYNC_TITLE")) {
									helpBox.stopShowing("settings.sync")
								} else {
									if (E == _T("INTERFACE_SETTINGS_INFO_TAB")) {
										helpBox.stopShowing("settings.info")
									}
								}
							}
						}
					}
				}
			}
		}
		if (B == _T("INTERFACE_SETTINGS_LISTS_TAB")) {
			settingsView.listDetails.hide();
			settingsdetailstabs.renameEntry(settingsdetailstabs.entries[0],
					_T("INTERFACE_SETTINGS_LISTS_TAB"));
			settingsdetailstabs.blitDiv();
			settingsView.listDetails.fieldsTitle.setEnabled(true);
			settingsView.listDetails.fieldsTitle.blit();
			this.showListsAdder();
			this.listsFormat();
			whatsNew.setCount("shared_lists", 0);
			helpBox.showHelpText("settings.lists")
		} else {
			if (B == _T("INTERFACE_SETTINGS_LOCATIONS_TAB")) {
				settingsView.locationDetails.hide();
				settingsdetailstabs.renameEntry(settingsdetailstabs.entries[0],
						_T("INTERFACE_SETTINGS_LOCATIONS_TAB"));
				settingsdetailstabs.blitDiv();
				settingsView.locationDetails.fieldsTitle.setEnabled(true);
				settingsView.locationDetails.fieldsTitle.blit();
				adder.hide();
				this.locationsFormat();
				helpBox.showHelpText("settings.locations")
			} else {
				if (B == _T("INTERFACE_TASKS_TASK_DETAILS_TAGS")) {
					settingsView.tagDetails.hide();
					settingsdetailstabs.renameEntry(
							settingsdetailstabs.entries[0],
							_T("INTERFACE_TASKS_TASK_DETAILS_TAGS"));
					settingsdetailstabs.blitDiv();
					settingsView.tagDetails.fieldsTitle.setEnabled(true);
					settingsView.tagDetails.fieldsTitle.blit();
					adder.hide();
					this.tagsFormat();
					helpBox.showHelpText("settings.tags")
				} else {
					settingsView.listDetails.fieldsTitle.setEnabled(false);
					settingsView.listDetails.fieldsTitle.blit();
					if (settingsView.getSelected() == _T("INTERFACE_SETTINGS_INFO_TAB")) {
						settingsdetailstabs.renameEntry(
								settingsdetailstabs.entries[0],
								_T("INTERFACE_SETTINGS_INFO_TAB"));
						settingsdetailstabs.blitDiv();
						helpBox.showHelpText("settings.info");
						this.infoSettingsFormat()
					} else {
						if (settingsView.getSelected() == _T("INTERFACE_SETTINGS_GENERAL_TAB")) {
							settingsdetailstabs.renameEntry(
									settingsdetailstabs.entries[0],
									_T("INTERFACE_SETTINGS_GENERAL_TAB"));
							settingsdetailstabs.blitDiv();
							helpBox.showHelpText("settings.general");
							this.generalSettingsFormat()
						} else {
							if (settingsView.getSelected() == _T("INTERFACE_SETTINGS_REMINDERS_TAB")) {
								settingsdetailstabs.renameEntry(
										settingsdetailstabs.entries[0],
										_T("INTERFACE_SETTINGS_REMINDERS_TAB"));
								settingsdetailstabs.blitDiv();
								helpBox.showHelpText("settings.reminders");
								this.reminderSettingsFormat()
							} else {
								if (settingsView.getSelected() == _T("INTERFACE_SETTINGS_SERVICES_TAB")) {
									settingsdetailstabs
											.renameEntry(
													settingsdetailstabs.entries[0],
													_T("INTERFACE_SETTINGS_SERVICES_TAB"));
									settingsdetailstabs.blitDiv();
									helpBox.showHelpText("settings.services");
									this.servicesSettingsFormat()
								} else {
									if (settingsView.getSelected() == _T("INTERFACE_SYNC_TITLE")) {
										settingsdetailstabs.renameEntry(
												settingsdetailstabs.entries[0],
												_T("INTERFACE_SYNC_TITLE"));
										settingsdetailstabs.blitDiv();
										helpBox.showHelpText("settings.sync");
										this.syncSettingsFormat()
									}
								}
							}
						}
					}
				}
			}
		}
	}
};
Control.prototype.adderClicked = function(A, B) {
	if (addingList.list.entries.length > 0) {
		addingList.show();
		addingList.list.tableSetRowBusy(0, false);
		addingList.list.table.rows[0].rowField.startEditing()
	} else {
		addingList.show();
		addingList.addEntry()
	}
	if (adder.type == Adder.ADDER_TYPE_CONTACT) {
		helpBox.showHelpText("contacts.add")
	}
};
Control.prototype.adderFieldEditCancelled = function(A, D, B) {
	if (statusBox.adderError) {
		statusBox.hide();
		statusBox.adderError = false
	}
	if (adder.type == Adder.ADDER_TYPE_CONTACT) {
		helpBox.stopShowing("contacts.add")
	}
	this.addingListAddSuccess();
	return false
};
Control.prototype.handleSmartAdd = function(O, E) {
	var V = {
		"list" : stateMgr.currentList,
		"name" : O,
		"id" : E
	};
	if (stateMgr.currentType !== TasksView.LIST_TYPE_NORMAL) {
		V["view_type"] = stateMgr.currentType;
		var F = stateMgr.filterObj.sexp;
		var I = [];
		if (F[0] === 4 && F[1].length > 0) {
			var D, R = false, J;
			while ((D = F[1]) && D.length == 1 && D[0][0] === 4) {
				F = D[0]
			}
			for ( var M = 0, K = D.length; M < K; M++) {
				J = D[M];
				if (J[0] !== 0 && J[0] !== 3) {
					R = true;
					break
				}
			}
			if (!R) {
				var B, H;
				for ( var M = 0, K = D.length; M < K; M++) {
					J = D[M];
					if (J[0] === 3) {
						B = J[1][0];
						H = J[1][1];
						switch (B) {
						case "due":
							var Q = dateTimeMgr.parseDueDate(H);
							if (Q && Q[0]) {
								I.push( [ B, [ Q[0].getTime() / 1000, Q[1] ] ])
							}
							break;
						case "timeEstimate":
							var U = dateTimeMgr.parseTimeEstimate(H);
							if (U) {
								I.push( [ B, H ])
							}
							break;
						case "tag":
						case "location":
						case "priority":
						case "listId":
						case "sharedWith":
							I.push( [ B, H ]);
							break
						}
					}
				}
			}
		}
		if (I.length > 0) {
			V["view_props"] = I
		}
	}
	if (view.isNewUI()) {
		var A = MagicParse.parse(O);
		if (A) {
			V["parse_data"] = A
		}
	}
	transMgr.request("tasks.add", Utility.toJSON(V))
};
Control.prototype.adderFieldEditFinished = function(A, D, B) {
	if (statusBox.adderError) {
		statusBox.hide();
		statusBox.adderError = false
	}
	B = B.trim();
	addingList.currentData = B;
	if (B.length == 0) {
		addingList.currentData = null;
		this.addingListAddSuccess()
	} else {
		addingList.list.tableSetRowBusyById(D, true);
		if (adder.type == Adder.ADDER_TYPE_TASK) {
		} else {
			if (adder.type == Adder.ADDER_TYPE_LIST) {
				if (B.toLowerCase() == "inbox"
						|| B.toLowerCase() == "sent"
						|| B.toLowerCase() == _T("INTERFACE_TASKS_INBOX")
								.toLowerCase()
						|| B.toLowerCase() == _T("INTERFACE_TASKS_SENT")
								.toLowerCase()) {
					statusBox.setText(_T("INTERFACE_STATUS_CANT_CALL_LIST", {
						"LIST_NAME" : B
					}), false, true);
					this.adderClicked();
					return false
				}
				transMgr.request("lists.add", utility.encodeJavaScript( {
					"name" : B,
					"id" : D
				}))
			} else {
				if (adder.type == Adder.ADDER_TYPE_CONTACT) {
					if (B === rtmUsername) {
						this.addingListAddFailure(D,
								"error.contacts.add.noYourself");
						return false
					} else {
						transMgr.request("contacts.add", utility
								.encodeJavaScript( {
									"name" : B,
									"id" : D
								}))
					}
				} else {
					if (adder.type == Adder.ADDER_TYPE_GROUP) {
						transMgr.request("groups.add", utility
								.encodeJavaScript( {
									"name" : B,
									"id" : D
								}))
					}
				}
			}
		}
	}
	if (adder.type == Adder.ADDER_TYPE_CONTACT) {
		helpBox.stopShowing("contacts.add")
	}
};
Control.prototype.registerAdder = function(H, E) {
	var D = E.mbn + "editFinished";
	if (!messageBus.channels[D]) {
		var A = this;
		var B = function(I, J) {
			A.adderFieldEditFinished(I, H, J)
		};
		messageBus.subscribe(B, E.mbn + "editFinished");
		var F = function(I, J) {
			A.adderFieldEditCancelled(I, H, J)
		};
		messageBus.subscribe(F, E.mbn + "editCancelled")
	}
};
Control.prototype.addingListAddSuccess = function(A, H, M) {
	try {
		addingList.clear()
	} catch (K) {
	}
	addingList.hide();
	if (M && H) {
		if (M === taskList) {
			if (!view.isNewUI()) {
				M.list.selectOne(H)
			}
		} else {
			M.list.selectOne(H)
		}
		if (M == taskList) {
			try {
				if (view.isNewUI()) {
					var D = stateMgr.tasks[H];
					if (D) {
						var R = D.name;
						var O = D.date_due;
						var Q = D.time_due;
						var J = "INTERFACE_SMART_ADD_TASK_ADDED";
						if (O) {
							var U;
							if (Q) {
								U = Intl.preferred_formats.due_time
							} else {
								U = Intl.preferred_formats.due
							}
							O = dateTimeMgr.getCachedIntlFormat(U, O);
							J = "INTERFACE_SMART_ADD_TASK_ADDED_WITH_DUE"
						}
						var I = "Control.selectTaskById('" + H + "');";
						var F = "outline-color: -moz-use-text-color; outline-style: none; outline-width: 0;";
						var E = _T(J, {
							"TASK_NAME" : '<a style="' + F
									+ '" href="#" onclick="' + I + '">'
									+ Control.safeWbrs(R) + "</a>",
							"DUE_DATE" : O
						});
						statusBox.setText(E, false, true)
					}
				}
			} catch (K) {
			}
			SmartAdd.getInstance().onAddSuccess(A);
			if (view.isNewUI() && H) {
				setTimeout(function() {
					taskList.list.flashEntry(H)
				}, 0)
			}
		} else {
			if (M == listList) {
				var B = stateMgr.lists[H].name;
				listTabs.addEntry(B, [ TasksView.LIST_TYPE_NORMAL, H ]);
				listTabs.sort();
				listTabs.blitDiv();
				tasksView.reflectListsInTasksToolbox();
				searchMgr.updateLists();
				taskCloud.update()
			} else {
				if (M == contactList) {
					searchMgr.updateContacts()
				}
			}
		}
	}
};
Control.prototype.addingListAddFailure = function(H, B, E) {
	if (E === "task") {
		SmartAdd.getInstance().onAddFailure(H);
		return
	}
	var F = addingList.list.map[H];
	addingList.list.tableSetRowBusy(F, false);
	addingList.list.table.rows[F].rowField.startEditing();
	var D = null;
	statusBox.setText(stringMgr.getString(B), false, true);
	if (B === "error.contacts.add.emailSpecified") {
		var A = statusBox.text.getElementsByTagName("a");
		if (A && A.length > 0) {
			A[0].onclick = function(I) {
				inviteMgr.email.value = addingList.currentData;
				contactsTabs.selectTab("Invites");
				view.selectView("Contacts");
				setTimeout(function() {
					inviteMgr.firstname.focus()
				}, 0);
				statusBox.hide();
				return false
			}
		}
		this.adderFieldEditCancelled()
	}
	statusBox.adderError = true
};
Control.prototype.showContact = function(A) {
	contactList.list.selectOne(A, true);
	if (contactsView.getSelected() != _T("INTERFACE_CONTACTS_CONTACTS_TAB")) {
		contactsTabs.selectTab(_T("INTERFACE_CONTACTS_CONTACTS_TAB"))
	}
	if (view.getSelected() != "Contacts") {
		view.selectView("Contacts")
	}
};
Control.prototype.showGroup = function(A) {
	groupList.list.selectOne(A, true);
	if (contactsView.getSelected() != _T("INTERFACE_CONTACTS_GROUPS_TAB")) {
		contactsTabs.selectTab(_T("INTERFACE_CONTACTS_GROUPS_TAB"))
	}
	if (view.getSelected() != "Contacts") {
		view.selectView("Contacts")
	}
};
Control.prototype.contactsDeleted = function(E) {
	var B = E["contacts"];
	var D = B.length;
	var A = "INTERFACE_STATUS_CONTACT_DELETED_ONE";
	if (D > 1) {
		A = "INTERFACE_STATUS_CONTACT_DELETED_NUM"
	}
	var F = _T(A, {
		"CONTACT_NAME" : format.formatContactName(B[0]),
		"NUM" : D
	});
	statusBox.setText(F, false, true);
	map(function(H) {
		contactList.list.removeEntry(H)
	}, B);
	contactList.list.fireSelectionFinished()
};
Control.prototype.contactsButtonClicked = function(B) {
	if (B == _T("INTERFACE_CONTACTS_CONTACTS_DELETE_BUTTON")) {
		if (contactList.list.selected.length === 0) {
			statusBox.setText(_T("INTERFACE_STATUS_MUST_SELECT_TO_DELETE"));
			return false
		}
		for ( var A = 0; A < contactList.list.selected.length; A++) {
			contactList.list
					.tableSetRowBusy(contactList.list.selected[A], true)
		}
		transMgr.request("contacts.delete", utility.encodeJavaScript( {
			"contacts" : contactList.list.getSelected()
		}))
	}
};
Control.prototype.groupsDeleted = function(E) {
	var B = E["groups"];
	var D = B.length;
	var A = "INTERFACE_STATUS_GROUP_DELETED_ONE";
	if (D > 1) {
		A = "INTERFACE_STATUS_GROUP_DELETED_NUM"
	}
	var F = _T(A, {
		"GROUP_NAME" : stateMgr.groups[B[0]].name.escapeForDisplay(),
		"NUM" : D
	});
	statusBox.setText(F, false, true);
	map(function(H) {
		groupList.list.removeEntry(H);
		stateMgr.updateGroup(H, {
			"deleted" : true
		});
		delete stateMgr.groups[H]
	}, B);
	groupList.list.fireSelectionFinished()
};
Control.prototype.groupsButtonClicked = function(B) {
	if (B == _T("INTERFACE_CONTACTS_GROUPS_DELETE_BUTTON")) {
		if (groupList.list.selected.length === 0) {
			statusBox.setText(_T("INTERFACE_STATUS_MUST_SELECT_TO_DELETE"));
			return false
		}
		for ( var A = 0; A < groupList.list.selected.length; A++) {
			groupList.list.tableSetRowBusy(groupList.list.selected[A], true)
		}
		transMgr.request("groups.delete", utility.encodeJavaScript( {
			"groups" : groupList.list.getSelected()
		}))
	}
};
Control.prototype.contactsAttached = function(B) {
	var F = B[0];
	var E = B[1];
	var D = E.length;
	var A = "INTERFACE_STATUS_CONTACT_GROUP_ADD_ONE";
	if (D > 1) {
		A = "INTERFACE_STATUS_CONTACT_GROUP_ADD_NUM"
	}
	var H = _T(A, {
		"CONTACT_NAME" : format.formatContactName(E[0]),
		"GROUP_NAME" : stateMgr.groups[F].name.escapeForDisplay(),
		"NUM" : D
	});
	statusBox.setText(H, false, true);
	this.contactsFormat()
};
Control.prototype.contactsDetached = function(B) {
	var F = B[0];
	var E = B[1];
	var D = E.length;
	var A = "INTERFACE_STATUS_CONTACT_GROUP_REMOVE_ONE";
	if (D > 1) {
		A = "INTERFACE_STATUS_CONTACT_GROUP_REMOVE_NUM"
	}
	var H = _T(A, {
		"CONTACT_NAME" : format.formatContactName(E[0]),
		"GROUP_NAME" : stateMgr.groups[F].name.escapeForDisplay(),
		"NUM" : D
	});
	statusBox.setText(H, false, true);
	this.contactsFormat()
};
Control.prototype.listsArchived = function(F) {
	var D = F[0];
	var A = F[1];
	undoMgr.pushTransaction(D);
	var E = A.length;
	var B = "INTERFACE_STATUS_LIST_ARCHIVED_ONE";
	if (E > 1) {
		B = "INTERFACE_STATUS_LIST_ARCHIVED_NUM"
	}
	var H = _T(B, {
		"LIST_NAME" : stateMgr.lists[A[0]].name.escapeForDisplay(),
		"NUM" : E
	});
	statusBox.setText(H, true, true);
	map(function(I) {
		stateMgr.updateList(I, {
			"archived" : true
		});
		listList.list.tableSetRowBusyById(I, false);
		listList.setListArchived(I);
		listList.removeListTab(I)
	}, A);
	tasksView.reflectListsInTasksToolbox();
	this.listsFormat();
	taskCloud.update()
};
Control.prototype.listsUnarchived = function(F) {
	var D = F[0];
	var A = F[1];
	undoMgr.pushTransaction(D);
	var E = A.length;
	var B = "INTERFACE_STATUS_LIST_UNARCHIVED_ONE";
	if (E > 1) {
		B = "INTERFACE_STATUS_LIST_UNARCHIVED_NUM"
	}
	var H = _T(B, {
		"LIST_NAME" : stateMgr.lists[A[0]].name.escapeForDisplay(),
		"NUM" : E
	});
	statusBox.setText(H, true, true);
	map(function(I) {
		if (stateMgr.lists[I].archived === true) {
			stateMgr.updateList(I, {
				"archived" : false
			});
			listList.setListClear(I);
			listList.addListTab(stateMgr.lists[I].name, I)
		}
		listList.list.tableSetRowBusyById(I, false)
	}, A);
	tasksView.reflectListsInTasksToolbox();
	this.listsFormat();
	taskCloud.update()
};
Control.prototype.listsButtonClicked = function(A) {
	if (A == _T("INTERFACE_SETTINGS_LISTS_ARCHIVE_BUTTON")) {
		this.listsDoArchive(true)
	}
};
Control.prototype.listsCheckLockedMessage = function(K, J, M, D) {
	if (K.length) {
		var A = [];
		var H = {};
		for ( var B = 0; B < K.length; B++) {
			A.push(K[B][1]);
			var I = listList.list.map[K[B][0]];
			H[I] = true
		}
		var O = A.join(", ");
		var F = K.length;
		var E;
		if (J == "delete") {
			if (M == "locked") {
				E = F == 1 ? "INTERFACE_STATUS_CANNOT_DELETE_LOCKED_ONE"
						: "INTERFACE_STATUS_CANNOT_DELETE_LOCKED_NUM"
			} else {
				E = F == 1 ? "INTERFACE_STATUS_CANNOT_DELETE_PENDING_ONE"
						: "INTERFACE_STATUS_CANNOT_DELETE_PENDING_NUM"
			}
		} else {
			if (M == "locked") {
				E = F == 1 ? "INTERFACE_STATUS_CANNOT_ARCHIVE_LOCKED_ONE"
						: "INTERFACE_STATUS_CANNOT_ARCHIVE_LOCKED_NUM"
			} else {
				E = F == 1 ? "INTERFACE_STATUS_CANNOT_ARCHIVE_PENDING_ONE"
						: "INTERFACE_STATUS_CANNOT_ARCHIVE_PENDING_NUM"
			}
		}
		if (!D) {
			statusBox.setText(_T(E, {
				"LIST_NAME" : O,
				"LIST_NAMES" : O
			}), false, true)
		}
		listList.list.deselectSome(H);
		return true
	}
	return false
};
Control.prototype.listsCheckLocked = function(E, H, A) {
	var B = [];
	var I = [];
	for ( var D = 0; D < E.length; D++) {
		var F = stateMgr.lists[E[D]];
		if (F.locked) {
			B.push( [ F.id, F.name ])
		} else {
			if (F.queued) {
				I.push( [ F.id, F.name ])
			}
		}
	}
	if (this.listsCheckLockedMessage(B, H, "locked", A) === true) {
		return true
	}
	if (this.listsCheckLockedMessage(I, H, "pending acceptance", A) === true) {
		return true
	}
	return false
};
Control.prototype.listsDoArchive = function(E) {
	var I = E ? "lists.archive" : "lists.unarchive";
	var H = listList.list.getSelected();
	var A = E ? "archive" : "unarchive";
	if (H.length === 0) {
		var B = E ? "INTERFACE_STATUS_LIST_ARCHIVE_MUST_SELECT"
				: "INTERFACE_STATUS_LIST_UNARCHIVE_MUST_SELECT";
		statusBox.setText(_T(B), false, true);
		return false
	}
	if (this.listsCheckLocked(H, A, !E) == true) {
		if (!E) {
			H = listList.list.getSelected()
		} else {
			return false
		}
	}
	var F = [];
	for ( var D = 0; D < H.length; D++) {
		if (stateMgr.lists[H[D]].queued) {
			continue
		}
		listList.list.tableSetRowBusyById(H[D], true);
		F.push(H[D])
	}
	if (F.length == 0) {
		var B = E ? "INTERFACE_STATUS_LIST_ARCHIVE_MUST_SELECT"
				: "INTERFACE_STATUS_LIST_UNARCHIVE_MUST_SELECT";
		statusBox.setText(_T(B), false, true);
		return false
	}
	transMgr.request(I, utility.encodeJavaScript( {
		"lists" : F
	}))
};
Control.prototype.listsUnarchive = function(A) {
	listList.list.tableSetRowBusyById(A, true);
	transMgr.request("lists.unarchive", utility.encodeJavaScript( {
		"lists" : [ A ]
	}))
};
Control.prototype.tasksDetailsDurationEditFinished = function(E, F) {
	F = F.trim();
	var B = dateTimeMgr.parseTimeEstimate(F);
	if (F.trim().length != 0 && B === null) {
		statusBox.setText(_TF( [ "INTERFACE_TASKS_TIME_ESTIMATE_INVALID",
				"/help/answers/basics/timeestimateformat.rtm", true ]), false,
				true);
		this.tasksFormat();
		return false
	}
	var D = view.getMultiEditMode() ? taskList.getViewList().getSelected()
			: [ taskList.getViewList().getLastSelectedId() ];
	map(function(H) {
		taskList.getViewList().tableSetRowBusyById(H, true)
	}, D);
	if (F.length == 0) {
		F = null
	}
	var A = {
		"list" : stateMgr.currentList,
		"task" : this.taskSeriesMap(D),
		"estimate" : F
	};
	transMgr.request("tasks.setEstimate", utility.encodeJavaScript(A));
	helpBox.stopShowing("tasks.duration", true)
};
Control.prototype.tasksDetailsURLEditFinished = function(D, E) {
	E = E.trim();
	var B = view.getMultiEditMode() ? taskList.getViewList().getSelected()
			: [ taskList.getViewList().getLastSelectedId() ];
	map(function(F) {
		taskList.getViewList().tableSetRowBusyById(F, true)
	}, B);
	if (E.length == 0) {
		E = null
	}
	var A = {
		"list" : stateMgr.currentList,
		"task" : this.taskSeriesMap(B),
		"url" : E
	};
	transMgr.request("tasks.setURL", utility.encodeJavaScript(A))
};
Control.prototype.tasksDetailsLocationEditFinished = function(E, F) {
	F = F.trim();
	var B = locationMgr.getLocationForName(F);
	if (F.trim().length != 0 && B === null) {
		statusBox
				.setText(
						_TF(
								[ "INTERFACE_TASKS_LOCATION_INVALID", "", false ],
								{
									"LINK_ONCLICK" : "view.selectView('Locations'); return false;",
									"LOCATION_NAME" : F
								}), false, true);
		this.tasksFormat();
		return false
	}
	var D = view.getMultiEditMode() ? taskList.getViewList().getSelected()
			: [ taskList.getViewList().getLastSelectedId() ];
	map(function(H) {
		taskList.getViewList().tableSetRowBusyById(H, true)
	}, D);
	if (F.length == 0) {
		F = null
	}
	var A = {
		"list" : stateMgr.currentList,
		"task" : this.taskSeriesMap(D),
		"location" : F ? B : null
	};
	transMgr.request("tasks.setLocation", utility.encodeJavaScript(A))
};
Control.prototype.ensureValidity = function(D) {
	dateTimeMgr.setCache(true);
	tagMgr.prepareTagIndex();
	noteMgr.prepareIndex();
	if (D instanceof Array) {
		var B = false;
		for ( var A = 0; A < D.length; A++) {
			if (typeof stateMgr.tasks[D[A]] == "undefined") {
				continue
			}
			if (this.ensureValidityEach(D[A]) === false) {
				B = true
			}
		}
		if (B) {
			overviewList.list.sortAndBlit();
			overviewList.list.prune()
		}
	} else {
		if (this.ensureValidityEach(D) === false) {
			overviewList.list.sortAndBlit();
			overviewList.list.prune()
		}
	}
	dateTimeMgr.setCache(false);
	tagMgr.clearTagIndex();
	noteMgr.clearIndex();
	return true
};
Control.prototype.ensureValidityEach = function(B) {
	if (this.updateLiveSet(B) == true) {
		taskList.removeTask(B)
	}
	var A = overviewList.taskBelongs(B);
	if (overviewList.taskPresent(B) === true && A === false) {
		overviewList.removeTask(B)
	} else {
		if (overviewList.taskPresent(B) === false && A === true) {
			overviewList.addTask(stateMgr.tasks[B]);
			return false
		}
	}
	return true
};
Control.prototype.tasksDetailsDurationDone = function(E) {
	var B = E[0];
	var I = this.taskSeriesFlatten(E[1], true);
	var F = E[2];
	undoMgr.pushTransaction(B);
	this.tasksAllNotBusy();
	var D = I.length;
	var A = "INTERFACE_STATUS_TASK_TIME_ESTIMATE_ONE";
	if (D > 1) {
		A = "INTERFACE_STATUS_TASK_TIME_ESTIMATE_NUM"
	}
	var H = _T(A, {
		"TASK_NAME" : Control.safeWbrs(stateMgr.tasks[I[0][1]].name),
		"NUM" : D
	});
	statusBox.setText(H, true, true);
	map(function(J) {
		stateMgr.updateTask(J[1], {
			"estimate" : F
		});
		control.ensureValidity(J[1])
	}, I);
	taskList.list.fireSelectionFinished();
	this.tasksFormat()
};
Control.prototype.tasksDetailsLocationDone = function(E) {
	var B = E[0];
	var I = this.taskSeriesFlatten(E[1], true);
	var H = E[2];
	undoMgr.pushTransaction(B);
	this.tasksAllNotBusy();
	var D = I.length;
	var A = "INTERFACE_LOCATIONS_STATUS_TASK_NAME_CHANGED";
	if (D > 1) {
		A = "INTERFACE_LOCATIONS_STATUS_NUM_TASKS_CHANGED"
	}
	var F = _T(A, {
		"TASK_NAME" : Control.safeWbrs(stateMgr.tasks[I[0][1]].name),
		"NUM" : D
	});
	statusBox.setText(F, true, true);
	map(function(J) {
		locationMgr.updateSeriesLocation(stateMgr.tasks[J[1]].series_id, H);
		control.ensureValidity(J[1])
	}, I);
	taskList.list.fireSelectionFinished();
	locationMgr.setDirty(true);
	taskCloud.update();
	this.tasksFormat()
};
Control.prototype.tasksDetailsURLDone = function(F) {
	var D = F[0];
	var I = this.taskSeriesFlatten(F[1], true);
	var B = F[2];
	undoMgr.pushTransaction(D);
	this.tasksAllNotBusy();
	var E = I.length;
	var A = "INTERFACE_STATUS_TASK_URL_ONE";
	if (E > 1) {
		A = "INTERFACE_STATUS_TASK_URL_NUM"
	}
	var H = _T(A, {
		"TASK_NAME" : Control.safeWbrs(stateMgr.tasks[I[0][1]].name),
		"NUM" : E
	});
	statusBox.setText(H, true, true);
	map(function(J) {
		stateMgr.updateTask(J[1], {
			"url" : B
		});
		control.ensureValidity(J[1])
	}, I);
	taskList.list.fireSelectionFinished();
	this.tasksFormat()
};
Control.prototype.tasksDetailsReoccurEditFinished = function(E, F) {
	helpBox.stopShowing("tasks.reoccur", true);
	var B = reoccurMgr.parseReoccurrence(F);
	if ((F.trim().length != 0 && F.trim() != "never") && B === null) {
		statusBox.setText(_TF( [ "INTERFACE_TASKS_REPEAT_INVALID",
				"/help/answers/basics/repeatformat.rtm", true ]), false, true);
		this.tasksFormat();
		return false
	}
	var D = view.getMultiEditMode() ? taskList.getViewList().getSelected()
			: [ taskList.getViewList().getLastSelectedId() ];
	map(function(H) {
		taskList.getViewList().tableSetRowBusyById(H, true)
	}, D);
	var A = {
		"list" : stateMgr.currentList,
		"task" : this.taskSeriesMap(D),
		"rrule" : (F.length && B ? B[5].trim() : null)
	};
	transMgr.request("tasks.setReoccurrence", utility.encodeJavaScript(A))
};
Control.prototype.tasksDetailsTagsDone = function(J) {
	var D = J[0];
	var F = this.taskSeriesFlatten(J[2], true);
	var W = J[3];
	if (D !== null) {
		undoMgr.pushTransaction(D)
	}
	this.tasksAllNotBusy();
	if (D === null || J[4] === null) {
		return false
	}
	if (W.length == 0) {
		var K = J[4][0][2];
		var E;
		var M = K.length;
		var H = F.length;
		var A = K[0];
		var V = Control.safeWbrs(stateMgr.tasks[F[0][1]].name);
		var R;
		if (M == 1) {
			R = H == 1 ? "INTERFACE_STATUS_TASK_TAG_REMOVE_ONE_FROM_ONE"
					: "INTERFACE_STATUS_TASK_TAG_REMOVE_ONE_FROM_NUM"
		} else {
			R = H == 1 ? "INTERFACE_STATUS_TASK_TAG_REMOVE_NUM_FROM_ONE"
					: "INTERFACE_STATUS_TASK_TAG_REMOVE_NUM_FROM_NUM"
		}
		var B = _T(R, {
			"TASK_NAME" : V,
			"TAG_NAME" : A,
			"TASK_NUM" : H,
			"NUM" : H,
			"TAG_NUM" : M
		});
		statusBox.setText(B, true, true)
	} else {
		var Q = F.length;
		var R = "INTERFACE_STATUS_TASK_TAG_ONE";
		if (Q > 1) {
			R = "INTERFACE_STATUS_TASK_TAG_NUM"
		}
		var B = _T(R, {
			"TASK_NAME" : Control.safeWbrs(stateMgr.tasks[F[0][1]].name),
			"NUM" : Q,
			"TAGS" : W
		});
		statusBox.setText(B, true, true)
	}
	var U = this.getTaskSeries(J[2]);
	var O = Control.getTasksForTaskSeriesList(U);
	for ( var I = 0; I < U.length; I++) {
		if (W.length === 0 || (W.length > 0 && J[4][I] !== null)) {
			tagMgr.updateTaskSeries( [ U[I] ], J[4][I])
		}
		taskList.taskUpdateTags(U[I])
	}
	Control.onTagsUpdated();
	map(function(X) {
		control.ensureValidity(X)
	}, O);
	taskList.list.fireSelectionFinished();
	this.tasksFormat()
};
Control.prototype.tasksDetailsTagsEditFinished = function(H, J) {
	helpBox.stopShowing("tasks.tags", true);
	var F = view.getMultiEditMode() ? taskList.getViewList().getSelected()
			: [ taskList.getViewList().getLastSelectedId() ];
	map(function(K) {
		taskList.getViewList().tableSetRowBusyById(K, true)
	}, F);
	var A = false;
	if (view.getMultiEditMode()) {
		var I = J.toLowerCase();
		var B = /^\<multiple\>\s*/g;
		var E = B.exec(I);
		if (E) {
			J = I.replace(B, "");
			A = true
		}
	}
	var D = {
		"list" : stateMgr.currentList,
		"task" : this.taskSeriesMap(F),
		"tags" : J,
		"append" : A
	};
	transMgr.request("tasks.setTags", utility.encodeJavaScript(D))
};
Control.prototype.tasksDetailsTagsEditStarted = function(A, B) {
	helpBox.showHelpText("tasks.tags")
};
Control.prototype.tasksDetailsTagsEditCancelled = function(A, B) {
	helpBox.stopShowing("tasks.tags", true)
};
Control.prototype.tasksDetailsDueEditStarted = function(A, B) {
	helpBox.showHelpText("tasks.duedate")
};
Control.prototype.tasksDetailsDueEditCancelled = function(A, B) {
	helpBox.stopShowing("tasks.duedate", true)
};
Control.prototype.tasksDetailsReoccurEditStarted = function(A, B) {
	helpBox.showHelpText("tasks.reoccur")
};
Control.prototype.tasksDetailsReoccurEditCancelled = function(A, B) {
	helpBox.stopShowing("tasks.reoccur", true)
};
Control.prototype.tasksDetailsDurationEditStarted = function(A, B) {
	helpBox.showHelpText("tasks.duration")
};
Control.prototype.tasksDetailsDurationEditCancelled = function(A, B) {
	helpBox.stopShowing("tasks.duration", true)
};
Control.prototype.tasksDetailsURLEditStarted = function(A, B) {
};
Control.prototype.tasksDetailsURLEditCancelled = function(A, B) {
};
Control.prototype.tasksDetailsLocationEditStarted = function(A, B) {
};
Control.prototype.tasksDetailsLocationEditCancelled = function(A, B) {
};
Control.prototype.tasksDetailsDueEditFinished = function(E, I) {
	helpBox.stopShowing("tasks.duedate", true);
	var B = dateTimeMgr.parseDueDate(I);
	var F = B[0];
	var H = B[1];
	if ((I.trim().length != 0 && I.trim().indexOf("never") == -1) && F === null) {
		statusBox.setText(_TF( [ "INTERFACE_TASKS_DUE_DATE_INVALID",
				"/help/answers/basics/dateformat.rtm", true ]), false, true);
		this.tasksFormat();
		return false
	}
	var D = view.getMultiEditMode() ? taskList.getViewList().getSelected()
			: [ taskList.getViewList().getLastSelectedId() ];
	map(function(K) {
		taskList.getViewList().tableSetRowBusyById(K, true)
	}, D);
	var J = F ? F.getTime().toString() : null;
	if (J !== null) {
		J = J.substring(0, J.length - 3)
	}
	var A = {
		"list" : stateMgr.currentList,
		"task" : this.taskSeriesMap(D),
		"timeSpec" : H,
		"dueDateEpoch" : J
	};
	transMgr.request("tasks.setDueDate", utility.encodeJavaScript(A))
};
Control.prototype.tasksDetailsDueDone = function(E) {
	var B = E[0];
	var D = this.taskSeriesFlatten(E[1], true);
	var H = E[2];
	var K = E[3];
	undoMgr.pushTransaction(B);
	if (typeof H == "object") {
		H = null;
		K = null
	}
	this.tasksAllNotBusy();
	var I = D.length;
	var J = "INTERFACE_STATUS_TASK_DUE_DATE_ONE";
	if (I > 1) {
		J = "INTERFACE_STATUS_TASK_DUE_DATE_NUM"
	}
	var A = _T(J, {
		"TASK_NAME" : Control.safeWbrs(stateMgr.tasks[D[0][1]].name),
		"NUM" : I
	});
	statusBox.setText(A, true, true);
	var F = false;
	var M = map(function(O) {
		taskList.taskUpdateDueDate(O[1], H, K, true);
		if (overviewList.taskUpdateDueDate(O[1], true) === true) {
			F = true
		}
		return O[1]
	}, D);
	this.ensureValidity(M);
	taskList.list.sort();
	taskList.list.fireSelectionFinished();
	if (F) {
		overviewList.list.sort()
	}
	locationMgr.setDirty(true);
	taskCloud.update();
	this.tasksFormat();
	helpBox.stopShowing("tasks.duedate", true)
};
Control.prototype.tasksDetailsReoccurrenceDone = function(F) {
	var D = F[0];
	var H = F[1];
	var E = this.taskSeriesFlatten(F[2], true);
	var M = F[3];
	undoMgr.pushTransaction(D);
	this.tasksAllNotBusy();
	var I = E.length;
	var J, K;
	var K = {
		"TASK_NAME" : Control.safeWbrs(stateMgr.tasks[E[0][1]].name),
		"NUM" : I
	};
	if (M[0]) {
		var Q = reoccurMgr.convertReoccurrenceDesc(M);
		var O = (Q.charAt(0) + "").toLowerCase();
		Q = O + Q.substring(1, Q.length);
		J = "INTERFACE_STATUS_TASK_REPEAT_ONE";
		if (I > 1) {
			J = "INTERFACE_STATUS_TASK_REPEAT_NUM"
		}
		K["REPEAT_FORMAT"] = Q
	} else {
		J = "INTERFACE_STATUS_TASK_NO_REPEAT_ONE";
		if (I > 1) {
			J = "INTERFACE_STATUS_TASK_NO_REPEAT_NUM"
		}
	}
	var B = _T(J, K);
	statusBox.setText(B, true, true);
	var A = [];
	map(function(R) {
		var U = control.getTasksForTaskSeries(stateMgr.tasks[R[1]].series_id);
		map(function(V) {
			stateMgr.updateTask(V, {
				"reoccur" : M
			});
			A.push(V)
		}, U);
		control.ensureValidity(R[1])
	}, E);
	taskList.taskUpdateRepeat(A);
	overviewList.taskUpdateRepeat(A);
	taskList.list.fireSelectionFinished();
	this.tasksFormat()
};
Control.prototype.tasksComplete = function() {
	if (view.getSelected() == "Tasks"
			&& taskList.view == TaskList.TASK_LIST_VIEW_INCOMPLETE) {
		if (taskList.list.selected.length === 0) {
			statusBox.setText(_T("INTERFACE_STATUS_MUST_SELECT_TO_COMPLETE"),
					false, true);
			return false
		}
		for ( var A = 0; A < taskList.list.selected.length; A++) {
			taskList.list.tableSetRowBusy(taskList.list.selected[A], true)
		}
		transMgr.request("tasks.complete", utility.encodeJavaScript( {
			"list" : stateMgr.currentList,
			"tasks" : this.taskSeriesMap(taskList.list.getSelected())
		}))
	}
};
Control.prototype.tasksUncomplete = function() {
	if (view.getSelected() == "Tasks"
			&& taskList.view == TaskList.TASK_LIST_VIEW_COMPLETED) {
		if (taskList.completedList.selected.length === 0) {
			statusBox.setText(_T("INTERFACE_STATUS_MUST_SELECT_TO_UNCOMPLETE"),
					false, true);
			return false
		}
		for ( var A = 0; A < taskList.completedList.selected.length; A++) {
			taskList.completedList.tableSetRowBusy(
					taskList.completedList.selected[A], true)
		}
		transMgr.request("tasks.uncomplete", utility.encodeJavaScript( {
			"list" : stateMgr.currentList,
			"tasks" : this.taskSeriesMap(taskList.completedList.getSelected())
		}))
	}
};
Control.prototype.tasksPostpone = function() {
	if (view.getSelected() == "Tasks"
			&& taskList.view == TaskList.TASK_LIST_VIEW_INCOMPLETE) {
		if (taskList.list.selected.length === 0) {
			statusBox.setText(_T("INTERFACE_STATUS_MUST_SELECT_TO_POSTPONE"),
					false, true);
			return false
		}
		for ( var A = 0; A < taskList.list.selected.length; A++) {
			taskList.list.tableSetRowBusy(taskList.list.selected[A], true)
		}
		transMgr.request("tasks.postpone", utility.encodeJavaScript( {
			"list" : stateMgr.currentList,
			"tasks" : this.taskSeriesMap(taskList.list.getSelected())
		}))
	}
};
Control.prototype.tasksDelete = function() {
	if (view.getSelected() == "Tasks") {
		var A = taskList.getViewList();
		if (A.selected.length === 0) {
			statusBox.setText(_T("INTERFACE_STATUS_MUST_SELECT_TO_DELETE"),
					false, true);
			return false
		}
		function E(K) {
			for ( var J = 0; J < A.selected.length; J++) {
				A.tableSetRowBusy(A.selected[J], true)
			}
			transMgr.request("tasks.delete", utility.encodeJavaScript( {
				"list" : stateMgr.currentList,
				"tasks" : control.taskSeriesMap(A.getSelected()),
				"remove_repeat" : typeof (K) === "undefined" ? true : !!K
			}))
		}
		var I = A.getSelected();
		var F = false;
		for ( var D = 0, B = I.length; D < B; D++) {
			var H = stateMgr.tasks[I[D]].reoccur;
			if (H && H[0] && H[1]) {
				F = true
			}
		}
		if (F) {
			Offline.Dialog.showRepeatingDeleteDialog(A.selected.length,
					stateMgr.tasks[A.getLastSelectedId()].name, E);
			return false
		}
		if (Offline.isReady() && !Offline.isOnline()) {
			Offline.Dialog.showDeleteDialog(A.selected.length, stateMgr.tasks[A
					.getLastSelectedId()].name, E);
			return false
		}
		E()
	}
};
Control.prototype.tasksDuplicate = function() {
	if (view.getSelected() == "Tasks") {
		var A = taskList.getViewList();
		if (A.selected.length === 0) {
			return false
		}
		var D = 25;
		if (A.selected.length > D) {
			statusBox.setText(_T("INTERFACE_STATUS_MAX_DUPLICATE", {
				"NUM" : D
			}), false, true);
			return false
		}
		for ( var B = 0; B < A.selected.length; B++) {
			A.tableSetRowBusy(A.selected[B], true)
		}
		transMgr.request("tasks.duplicate", utility.encodeJavaScript( {
			"list" : stateMgr.currentList,
			"tasks" : this.taskSeriesMap(A.getSelected())
		}))
	}
};
Control.prototype.tasksButtonClicked = function(A) {
	if (A == _T("INTERFACE_TASKS_BUTTON_COMPLETE")) {
		this.tasksComplete()
	}
	if (A == _T("INTERFACE_TASKS_BUTTON_POSTPONE")) {
		this.tasksPostpone()
	}
};
Control.prototype.tasksCompletedButtonClicked = function(A) {
	if (A == _T("INTERFACE_TASKS_BUTTON_UNCOMPLETE")) {
		this.tasksUncomplete()
	}
};
Control.prototype.tasksCompletedForEach = function(A) {
	stateMgr.updateTask(A, {
		"date_completed" : (new Date().getTime() / 1000),
		"completed" : true
	});
	taskList.list.removeEntry(A);
	overviewList.removeTask(A);
	taskList.addTask(stateMgr.tasks[A])
};
Control.prototype.tasksUncompletedForEach = function(A) {
	stateMgr.updateTask(A, {
		"date_completed" : null,
		"completed" : false
	});
	taskList.completedList.removeEntry(A);
	overviewList.addTask(stateMgr.tasks[A]);
	taskList.addTask(stateMgr.tasks[A])
};
Control.prototype.tasksCompleted = function(H) {
	var A = H[2];
	taskList.setAdvise(true);
	var D = this.tasksActionDone(H, "completed", this.tasksCompletedForEach,
			true, null);
	var E = D[0];
	var F = D[1];
	var B = A.length == 0 ? "INTERFACE_STATUS_TASK_COMPLETED_ONE"
			: "INTERFACE_STATUS_TASK_COMPLETED_ONE_GENERATED_NUM";
	if (E > 1) {
		B = A.length == 0 ? "INTERFACE_STATUS_TASK_COMPLETED_NUM"
				: "INTERFACE_STATUS_TASK_COMPLETED_NUM_GENERATED_NUM"
	}
	var I = _T(B, {
		"TASK_NAME" : Control.safeWbrs(F),
		"GENERATED_NUM" : A.length,
		"NUM" : E
	});
	statusBox.setText(I, true, true);
	if (taskList.view == TaskList.TASK_LIST_VIEW_COMPLETED) {
		taskList.completedList.tableBlitRows()
	}
	taskList.setAdvise(false);
	if (taskList.view == TaskList.TASK_LIST_VIEW_COMPLETED) {
		taskList.completedList.sort()
	} else {
		taskList.completedList.memory = null
	}
	taskList.list.fireSelectionFinished();
	locationMgr.setDirty(true);
	taskCloud.update();
	this.tasksFormat()
};
Control.prototype.tasksUncompleted = function(F) {
	taskList.setAdvise(true);
	var B = this.tasksActionDone(F, "uncompleted",
			this.tasksUncompletedForEach, true);
	var D = B[0];
	var E = B[1];
	var A = D < 2 ? "INTERFACE_STATUS_TASK_UNCOMPLETED_ONE"
			: "INTERFACE_STATUS_TASK_UNCOMPLETED_NUM";
	var H = _T(A, {
		"TASK_NAME" : Control.safeWbrs(E),
		"NUM" : D
	});
	statusBox.setText(H, true, true);
	taskList.list.tableBlitRows();
	taskList.setAdvise(false);
	taskList.list.sort();
	overviewList.blit();
	overviewList.sort();
	taskList.list.fireSelectionFinished();
	taskList.completedList.fireSelectionFinished();
	locationMgr.setDirty(true);
	Control.onTagsUpdated();
	this.tasksFormat()
};
Control.prototype.tasksDeletedForEach = function(I, A) {
	var D = stateMgr.tasks[I];
	overviewList.removeTask(I);
	tagMgr.clearTagsForTaskSeries(D.series_id);
	taskList.getViewList().removeEntry(I);
	stateMgr.updateTask(I, {
		"date_deleted" : (new Date().getTime() / 1000)
	});
	stateMgr.tasks[I] = null;
	var H = taskList.getTasksForTaskSeries(D.series_id);
	for ( var F = 0, E = H.length; F < E; F++) {
		var B = H[F];
		if (!(B in Control._tasksDeleted)) {
			if (A && stateMgr.tasks[B] && stateMgr.tasks[B].reoccur) {
				stateMgr.updateTask(B, {
					"reoccur" : null
				})
			}
			Control._tasksDeleted[B] = 1
		}
	}
};
Control.prototype.tasksActionDone = function(E, B, K, A, F) {
	var I = E[0];
	var D = this.taskSeriesFlatten(E[1], true);
	undoMgr.pushTransaction(I);
	var M = stateMgr.tasks[D[0][1]].name;
	var J = map(function(O) {
		return O[1]
	}, D);
	J = J.unique();
	var H;
	if (E && E.length > 2) {
		H = function(O) {
			K(O, E[2])
		}
	} else {
		H = function(O) {
			K(O)
		}
	}
	map(H, J);
	if (A) {
		this.ensureValidity(J)
	}
	return [ D.length, M ]
};
Control._tasksDeleted = null;
Control.prototype.tasksDeleted = function(F) {
	Control._tasksDeleted = {};
	var B = this.tasksActionDone(F, "deleted", this.tasksDeletedForEach, true);
	var D = B[0];
	var E = B[1];
	var A = D < 2 ? "INTERFACE_STATUS_TASK_DELETED_ONE"
			: "INTERFACE_STATUS_TASK_DELETED_NUM";
	var H = _T(A, {
		"TASK_NAME" : Control.safeWbrs(E),
		"NUM" : D
	});
	statusBox.setText(H, true, true);
	taskList.getViewList().sort();
	taskList.getViewList().fireSelectionFinished();
	locationMgr.setDirty(true);
	Control.onTagsUpdated();
	this.tasksFormat()
};
Control.prototype.tasksPostponedForEach = function(I) {
	var B = stateMgr.tasks[I];
	var H = null;
	var E = B.date_due;
	if (B.overdue && !B.duetoday) {
		H = new Date(E * 1000);
		var A = new Date();
		A.setHours(H.getHours());
		A.setMinutes(H.getMinutes());
		A.setSeconds(H.getSeconds());
		A.setMilliseconds(0);
		H = A;
		H.setDate(H.getDate() - 1)
	} else {
		if (E) {
			H = new Date(E * 1000)
		} else {
			H = new Date();
			H.setDate(H.getDate() - 1);
			H.setHours(0, 0, 0, 0)
		}
	}
	var D = dateTimeMgr.calculateUnit(H, "1", "day", false);
	var E = D.getTime() / 1000;
	var F = B.time_due;
	taskList.list.tableSetRowBusyById(I, false);
	B.postponed = parseInt(B.postponed, 10) + 1;
	taskList.taskUpdateDueDate(I, E, F, true);
	stateMgr.updateTask(I, {
		"postponed" : B.postponed,
		"date_due" : E
	})
};
Control.prototype.tasksPostponed = function(F) {
	var B = this.tasksActionDone(F, "postponed", this.tasksPostponedForEach,
			true);
	var D = B[0];
	var E = B[1];
	var A = D < 2 ? "INTERFACE_STATUS_TASK_POSTPONED_ONE"
			: "INTERFACE_STATUS_TASK_POSTPONED_NUM";
	var H = _T(A, {
		"TASK_NAME" : Control.safeWbrs(E),
		"NUM" : D
	});
	statusBox.setText(H, true, true);
	taskList.list.sort();
	taskList.list.fireSelectionFinished();
	taskList.doDues();
	locationMgr.setDirty(true);
	taskCloud.update();
	this.tasksFormat()
};
Control.prototype.tasksSetPriority = function(D) {
	var J = D[0];
	undoMgr.pushTransaction(J);
	var I = this.taskSeriesFlatten(D[1], true);
	var B = I.length;
	var A = B < 2 ? "INTERFACE_STATUS_TASK_PRIORITY_ONE"
			: "INTERFACE_STATUS_TASK_PRIORITY_NUM";
	var F = _T(A, {
		"TASK_NAME" : Control.safeWbrs(stateMgr.tasks[I[0][1]].name),
		"NUM" : B
	});
	statusBox.setText(F, true, true);
	for ( var H in D[1]) {
		var E = this.getTasksForTaskSeries(H);
		this.ensureValidity(E)
	}
	taskList.list.fireSelectionFinished();
	locationMgr.setDirty(true);
	taskCloud.update();
	this.tasksFormat()
};
Control.prototype.notesAddSuccess = function(D) {
	var B = D[0];
	var A = D[1];
	noteMgr.completeNewNote(B, A)
};
Control.prototype.notesAddFailure = function(A) {
};
Control.prototype.notesDeleteSuccess = function(D) {
	var E = D[0];
	var B = D[1];
	undoMgr.pushTransaction(E);
	var A = stateMgr.notes[B];
	if (A.title.length == 0) {
		statusBox.setText(_T("INTERFACE_STATUS_NOTE_DELETED"), true, true)
	} else {
		statusBox.setText(_T("INTERFACE_STATUS_NOTE_X_DELETED", {
			"NOTE_TITLE" : A.title
		}), true, true)
	}
};
Control.prototype.fieldsTitleEditFinished = function(R, J) {
	if (view.getSelected() == "Tasks" && taskTabs.hidden == false) {
		var D = J;
		var A = view.getMultiEditMode() ? taskList.getViewList().getSelected()
				: [ taskList.getViewList().getLastSelectedId() ];
		if (D && D.length > 0) {
			if (D.toLowerCase().indexOf("<multiple>") > -1) {
				this.tasksFormat();
				return false
			}
		}
		transMgr.request("tasks.setName", utility.encodeJavaScript( {
			"task" : this.taskSeriesMap(A),
			"name" : D
		}))
	} else {
		if (view.getSelected() == "Settings"
				&& settingsView.getSelected() == _T("INTERFACE_SETTINGS_LISTS_TAB")) {
			var F = J.trim();
			var U = F.toLowerCase();
			var K = listList.list.getLastSelectedId();
			if (U == "inbox" || U == "sent" || U == _T("INTERFACE_TASKS_INBOX")
					|| U == _T("INTERFACE_TASKS_SENT")) {
				var H = _T("INTERFACE_STATUS_CANT_CALL_LIST", {
					"LIST_NAME" : F
				});
				statusBox.setText(H, false, true);
				this.listsFormat();
				R.startEditing();
				return false
			}
			transMgr.request("lists.setName", utility.encodeJavaScript( {
				"list" : K,
				"name" : F
			}))
		} else {
			if (view.getSelected() == "Settings"
					&& settingsView.getSelected() == _T("INTERFACE_SETTINGS_LOCATIONS_TAB")) {
				var B = J.trim();
				var M = B.toLowerCase();
				for ( var I in locationMgr.locations_) {
					if (locationMgr.locations_[I].name.toLowerCase() === M) {
						statusBox.setText(_T(
								"INTERFACE_LOCATIONS_ALREADY_HAVE", {
									"LOCATION_NAME" : B
								}), false, true);
						this.locationsFormat();
						R.startEditing();
						return false
					}
				}
				var Q = locationList.list.getLastSelectedId();
				locationMgr.handleRenameLocation(Q, B)
			} else {
				if (view.getSelected() == "Settings"
						&& settingsView.getSelected() == _T("INTERFACE_TASKS_TASK_DETAILS_TAGS")) {
					var E = J.trim();
					var M = E.toLowerCase();
					if (M in tagMgr.index && tagMgr.index[M]) {
						statusBox.setText(_T("INTERFACE_TAGS_ALREADY_EXISTS", {
							"TAG_NAME" : E
						}), false, true);
						this.tagsFormat();
						R.startEditing();
						return false
					}
					var O = tagList.list.getLastSelectedId();
					Control.onTagRename(O, M)
				}
			}
		}
	}
};
Control.prototype.tasksRenamed = function(H) {
	var K = H[0];
	undoMgr.pushTransaction(K);
	var E = this.taskSeriesFlatten(H[1], true);
	var F = this.taskSeriesExtract(H[1]);
	var I = E.length;
	var J = I < 2 ? "INTERFACE_STATUS_TASK_RENAME_ONE"
			: "INTERFACE_STATUS_TASK_RENAME_NUM";
	var D = _T(J, {
		"TASK_NAME" : Control.safeWbrs(H[2]),
		"NUM" : I
	});
	statusBox.setText(D, true, true);
	for ( var A in H[1]) {
		taskList.taskUpdateName(A, H[2]);
		var B = this.getTasksForTaskSeries(A);
		this.ensureValidity(B)
	}
	taskList.list.fireSelectionFinished();
	locationMgr.setDirty(true)
};
Control.prototype.listsRenamed = function(B) {
	var D = B[0];
	var A = B[1];
	undoMgr.pushTransaction(D);
	statusBox.setText(_T("INTERFACE_STATUS_LIST_RENAMED", {
		"LIST_NAME" : B[2]
	}), true, true);
	listList.listUpdateName(A, B[2]);
	listTabs.sort();
	listTabs.blitDiv();
	tasksView.reflectListsInTasksToolbox()
};
Control.prototype.tasksMovedForEach = function(B, A) {
	stateMgr.updateTask(B, {
		"list_id" : A
	})
};
Control.prototype.listsDelete = function() {
	if (view.getSelected() == "Settings"
			&& settingsView.getSelected() == _T("INTERFACE_SETTINGS_LISTS_TAB")) {
		var B = listList.list.getSelected();
		if (listList.list.selected.length === 0) {
			statusBox.setText(_T("INTERFACE_STATUS_MUST_SELECT_TO_DELETE"),
					false, true);
			return false
		}
		if (this.listsCheckLocked(B, "delete") == true) {
			return false
		}
		for ( var A = 0; A < listList.list.selected.length; A++) {
			listList.list.tableSetRowBusy(listList.list.selected[A], true)
		}
		transMgr.request("lists.delete", utility.encodeJavaScript( {
			"lists" : B
		}))
	}
};
Control.prototype.listsDeletedForEach = function(A) {
	stateMgr.updateList(A, {
		"deleted" : true
	});
	listList.list.tableSetRowBusyById(A, false);
	listList.removeListTab(A);
	listList.list.removeEntry(A)
};
Control.prototype.listsDeleted = function(E) {
	var Q = E[0];
	var F = E[1];
	var K = E[2];
	var O = this.taskSeriesFlatten(E[3]);
	undoMgr.pushTransaction(Q);
	var M = stateMgr.lists[F[0]].name;
	var J = (stateMgr.lists[F[0]].filter !== null);
	var I = F.length;
	var B = O.length;
	var R = null;
	if (O.length === 1 && is(stateMgr.tasks[O[0]])) {
		R = stateMgr.tasks[O[0]].name
	}
	for ( var D = 0; D < F.length; D++) {
		this.listsDeletedForEach(F[D])
	}
	map(function(U) {
		stateMgr.updateTask(U, {
			"list_id" : K
		})
	}, O);
	var H;
	if (I == 1) {
		if (J == true) {
			H = "INTERFACE_STATUS_LIST_SMART_DELETED"
		} else {
			H = "INTERFACE_STATUS_LIST_DELETED_ONE";
			if (B === 1 && R !== null) {
				H = "INTERFACE_STATUS_LIST_DELETED_ONE_TASK_ONE"
			} else {
				if (B > 1) {
					H = "INTERFACE_STATUS_LIST_DELETED_ONE_TASK_NUM"
				}
			}
		}
	} else {
		H = "INTERFACE_STATUS_LIST_DELETED_NUM";
		if (B == 1 && R !== null) {
			H = "INTERFACE_STATUS_LIST_DELETED_NUM_TASK_ONE"
		} else {
			if (B > 1) {
				H = "INTERFACE_STATUS_LIST_DELETED_NUM_TASK_NUM"
			}
		}
	}
	var A = _T(H, {
		"LIST_NAME" : M.escapeForDisplay(),
		"TASK_NAME" : Control.safeWbrs(R),
		"TASK_NUM" : B,
		"NUM" : I
	});
	statusBox.setText(A, true, true);
	listList.list.fireSelectionFinished();
	tasksView.reflectListsInTasksToolbox();
	this.ensureValidity(O);
	taskList.getViewList().fireSelectionFinished();
	locationMgr.setDirty(true);
	Control.onTagsUpdated()
};
Control.prototype.tasksMoved = function(J) {
	var R = J[0];
	var K = J[1]["list"];
	var O = J[1]["targetList"];
	var E = this.taskSeriesFlatten(J[1]["tasks"], true);
	undoMgr.pushTransaction(R);
	var Q = map(function(W) {
		return W[0]
	}, E);
	Q = Q.unique();
	var V = stateMgr.tasks[E[0][1]].name;
	var F = stateMgr.lists[Q[0]].name;
	var A = stateMgr.lists[O].name;
	var D = E.length;
	var I = Q.length;
	var M = "INTERFACE_STATUS_TASK_MOVED_ONE";
	if (D > 1) {
		if (I == 1) {
			M = "INTERFACE_STATUS_TASK_MOVED_NUM"
		} else {
			M = "INTERFACE_STATUS_TASK_MOVED_NUM_LIST_NUM"
		}
	}
	var B = _T(M, {
		"TASK_NAME" : Control.safeWbrs(V),
		"ORIGIN_LIST_NAME" : F.escapeForDisplay(),
		"TARGET_LIST_NAME" : A.escapeForDisplay(),
		"TASK_NUM" : D,
		"LIST_NUM" : I
	});
	statusBox.setText(B, true, true);
	var U = [];
	for ( var H = 0; H < E.length; H++) {
		stateMgr.updateTask(E[H][1], {
			"list_id" : O
		});
		U.push(E[H][1])
	}
	this.tasksAllNotBusy();
	U = U.unique();
	this.ensureValidity(U);
	taskList.getViewList().sort();
	taskList.getViewList().fireSelectionFinished();
	this.tasksFormat();
	taskCloud.update()
};
Control.prototype.notificationToggle = function(B) {
	var D = B[0][0];
	var A = B[1];
	transMgr.request("notifies.toggle", utility.encodeJavaScript( {
		"id" : D,
		"state" : A
	}))
};
Control.prototype.notificationToggled = function(E) {
	var F = E["id"];
	var D = E["state"];
	var A = D ? "INTERFACE_STATUS_REMINDER_ON"
			: "INTERFACE_STATUS_REMINDER_OFF";
	var B = notificationMgr.list.entries[notificationMgr.list.map[F]];
	B[3] = D;
	statusFmt = _T(A, {
		"NOTIFICATION_MECH" : this.formatNotificationString(B[1], B[2], B[4])
	});
	statusBox.setText(statusFmt, false, true)
};
Control.prototype.notificationAdd = function(B) {
	var A = {
		"id" : B[0],
		"ntype" : B[1],
		"value" : B[2],
		"state" : B[3],
		"mtype" : B[4],
		"mlimit" : B[5]
	};
	transMgr.request("notifies.add", utility.encodeJavaScript(A))
};
Control.prototype.formatNotificationString = function(B, D, E) {
	if (B === "iphone") {
		var A = NotificationList.prototype.splitiPhoneEntry(D);
		return _T("{TYPE}/{ADDRESS}", {
			"TYPE" : A[1],
			"ADDRESS" : A[2]
		})
	} else {
		return _T("{TYPE}/{ADDRESS}", {
			"TYPE" : (E ? (notificationMgr.mobileReverseMap[E] || "sms") : B),
			"ADDRESS" : D
		})
	}
};
Control.prototype.displayNotificationDetails = function(H) {
	var B = H["ntype"];
	var E = H["value"];
	var F = H["mtype"];
	var J = H["mlimit"];
	var I = this.formatNotificationString(H["ntype"], H["value"], H["mtype"]);
	var A = null, D = "INTERFACE_STATUS_REMINDERS_NOTIFY_DETAILS_ADDITIONAL";
	if (is(notificationMgr.imMap[B])) {
		A = _T("INTERFACE_TASKS_REMINDERS_IM_ADD", {
			"IM_ADDRESS" : notificationMgr.imMap[B]
		})
	} else {
		if (H["ntype"] == "email" && H["verified"] === false) {
			A = _T("INTERFACE_TASKS_REMINDERS_EMAIL_PENDING")
		} else {
			if (F) {
				A = J ? _T("INTERFACE_TASKS_REMINDERS_NUM_LIMIT", {
					"NUM" : J
				}) : _T("INTERFACE_TASKS_REMINDERS_NO_LIMIT")
			} else {
				D = "INTERFACE_STATUS_REMINDERS_NOTIFY_DETAILS"
			}
		}
	}
	statusBox.setText(_T(D, {
		"NOTIFICATION_MECH" : I,
		"ADDITIONAL_INFORMATION" : A
	}), false, true)
};
Control.prototype.notificationAdded = function(F) {
	var I = F["id"];
	var B = F["newId"];
	var A = F["ntype"];
	var D = F["value"];
	var E = F["mtype"];
	var H = F["mlimit"];
	this.displayNotificationDetails(F);
	notificationMgr.list.replaceEntryId(I, B);
	notificationMgr.list.updateEntry( [ B, A, D, true, E, H ]);
	notificationMgr.list.tableSetRowBusyById(B, false);
	notificationMgr.list.switchRowState(B, false)
};
Control.prototype.notificationUpdated = function(F) {
	var I = F["id"];
	var A = F["ntype"];
	var B = F["value"];
	var E = F["mtype"];
	var H = F["mlimit"];
	var D = F["state"];
	this.displayNotificationDetails(F);
	notificationMgr.list.updateEntry( [ I, A, B, D, E, H ]);
	notificationMgr.list.tableSetRowBusyById(I, false);
	notificationMgr.list.switchRowState(I, false)
};
Control.prototype.notificationDelete = function(B) {
	var A = {
		"id" : B[0],
		"ntype" : B[1],
		"value" : B[2],
		"state" : B[3],
		"mtype" : B[4],
		"mlimit" : B[5]
	};
	transMgr.request("notifies.delete", utility.encodeJavaScript(A))
};
Control.prototype.notificationDeleted = function(B) {
	var A = this.formatNotificationString(B["ntype"], B["value"], B["mtype"]);
	statusBox.setText(_T("INTERFACE_STATUS_REMINDERS_NOTIFY_NO_MORE", {
		"NOTIFICATION_MECH" : A
	}), false, true)
};
Control.prototype.notificationUpdate = function(B) {
	var A = {
		"id" : B[0],
		"ntype" : B[1],
		"value" : B[2],
		"state" : B[3],
		"mtype" : B[4],
		"mlimit" : B[5]
	};
	transMgr.request("notifies.update", utility.encodeJavaScript(A))
};
Control.prototype.notificationConfigurationUpdated = function(A) {
	if (A) {
		statusBox.setText(_T("INTERFACE_STATUS_REMINDER_SETTINGS_SAVED"),
				false, true);
		configurationMgr.mergePendingReminderDelta()
	} else {
		statusBox.setText(_T("INTERFACE_STATUS_PROBLEM_SAVING_CHANGES"), false,
				true)
	}
};
Control.prototype.configurationUpdated = function(D) {
	var H = D[0];
	var I = D[1];
	var F = D[2];
	var A = D[3];
	if (H) {
		if (I === 1) {
			statusBox.setText(_T("INTERFACE_STATUS_SORRY_EMAIL_IN_USE"), false,
					true);
			configurationMgr.settingsCancel.onclick()
		} else {
			var B = I === 2 ? "INTERFACE_STATUS_SETTINGS_SAVED_EXCEPT_EMAIL"
					: "INTERFACE_STATUS_SETTINGS_SAVED";
			statusBox.setText(_T(B), false, true);
			var J = {};
			for ( var E in configurationMgr.pendingDelta) {
				if (I === 2 && E == "email") {
					continue
				}
				J[E] = configurationMgr.pendingDelta[E]
			}
			configurationMgr.pendingDelta = J;
			configurationMgr.mergePendingDelta();
			if (I === 2) {
				configurationMgr.settingsCancel.onclick()
			}
		}
		if (F === true) {
			document.location = "/"
		}
	} else {
		statusBox.setText(_T("INTERFACE_STATUS_PROBLEM_SAVING_CHANGES"), false,
				true)
	}
};
Control.prototype.listDefaultChanged = function(F) {
	var B = F[0];
	var H = F[1];
	var A = F[2];
	listList.list.tableSetRowBusyById(B, false);
	var E = stateMgr.lists[B].name.escapeForDisplay();
	var D = H ? "INTERFACE_STATUS_X_SET_AS_DEFAULT_LIST"
			: "INTERFACE_STATUS_X_IS_NO_LONGER_DEFAULT";
	if (H) {
		if (is(configurationMgr.configuration.defaultList)) {
			listList.listUpdateDefault(
					configurationMgr.configuration.defaultList, false)
		}
		configurationMgr.setDefaultList(B);
		listList.listUpdateDefault(B, true)
	} else {
		if (is(configurationMgr.configuration.defaultList)) {
			listList.listUpdateDefault(
					configurationMgr.configuration.defaultList, false)
		}
		configurationMgr.setDefaultList(null)
	}
	statusBox.setText(_T(D, {
		"LIST_NAME" : E
	}), false, true);
	this.listsFormat()
};
Control.prototype.locationDefaultChanged = function(D) {
	var E = D[0];
	var H = D[1];
	var A = D[2];
	locationList.list.tableSetRowBusyById(E, false);
	var F = locationMgr.locations_[E].name.escapeForDisplay();
	var B = H ? "INTERFACE_STATUS_X_SET_AS_DEFAULT_LIST"
			: "INTERFACE_STATUS_X_IS_NO_LONGER_DEFAULT";
	var B = H ? '"{LOC_NAME}" set as default location.'
			: '"{LOC_NAME}" is no longer your default location.';
	if (H) {
		if (is(configurationMgr.configuration.defaultLocation)) {
			locationList.listUpdateDefault(
					configurationMgr.configuration.defaultLocation, false)
		}
		configurationMgr.setDefaultLocation(E);
		locationList.listUpdateDefault(E, true)
	} else {
		if (is(configurationMgr.configuration.defaultLocation)) {
			locationList.listUpdateDefault(
					configurationMgr.configuration.defaultLocation, false)
		}
		configurationMgr.setDefaultLocation(null)
	}
	statusBox.setText(_T(B, {
		"LOC_NAME" : F
	}), false, true);
	this.locationsFormat()
};
Control.prototype.continueToTasks = function(D) {
	var A = D[0];
	var B = D[1];
	if (A == true) {
		if (!B) {
			view.selectView("Tasks")
		}
		transMgr.request("configuration.showOverview", utility
				.encodeJavaScript( {
					"show" : B
				}));
		configurationMgr.configuration["showOverview"] = B;
		configurationMgr.updateShowOverview()
	} else {
		view.selectView("Tasks")
	}
};
Control.prototype.tasksShare = function(A) {
	view.setShareMode(A);
	statusBox.sharingStart();
	statusBox.sharingSetText();
	view.selectView("Contacts");
	contactsTabs.selectTab(_T("INTERFACE_CONTACTS_CONTACTS_TAB"))
};
Control.prototype.tasksShareFinished = function() {
	if (view.shareMode !== null) {
		var B = groupList.list.getSelected();
		var E = contactList.list.getSelected();
		var D = null;
		var A = null;
		if (view.shareMode == Control.SHARE_TASK_SHARE) {
			D = "tasks.share";
			value = taskList.list.getSelected();
			A = {
				"list" : stateMgr.currentList,
				"tasks" : this.taskSeriesMap(value),
				"contacts" : E,
				"groups" : B
			}
		} else {
			if (view.shareMode == Control.SHARE_TASK_SEND) {
				D = "tasks.send";
				value = taskList.list.getSelected();
				A = {
					"list" : stateMgr.currentList,
					"tasks" : this.taskSeriesMap(value),
					"contacts" : E,
					"groups" : B
				}
			} else {
				if (view.shareMode == Control.SHARE_LIST_SHARE) {
					D = "lists.share";
					value = listList.list.getSelected();
					A = {
						"list" : stateMgr.currentList,
						"contacts" : E,
						"groups" : B,
						"who" : "contact"
					}
				} else {
					if (view.shareMode == Control.PUBLISH_LIST_PUBLISH) {
						D = "lists.publish";
						A = {
							"list" : stateMgr.currentList,
							"contacts" : E,
							"groups" : B,
							"who" : "contact"
						}
					}
				}
			}
		}
		transMgr.request(D, utility.encodeJavaScript(A))
	}
};
Control.prototype.statusBoxButtonClicked = function(A) {
	if (A == "Cancel") {
		view.setShareMode(null);
		statusBox.sharingStop();
		view.selectView("Tasks")
	} else {
		if (A == "Done") {
			this.tasksShareFinished();
			stateMgr.pendingShareMode = view.shareMode;
			view.setShareMode(null);
			view.selectView("Tasks");
			statusBox.sharingSetText();
			if (stateMgr.pendingShareMode == Control.SHARE_TASK_SHARE
					|| stateMgr.pendingShareMode == Control.SHARE_TASK_SEND) {
				this.tasksAllBusy()
			}
		}
	}
};
Control.prototype.tasksSharingSuccess = function(H) {
	var K = H[0];
	var A = H[1];
	var J = H[2];
	var I = H[3];
	var D = H[4];
	var B = H[5];
	var E = this.taskSeriesFlatten(A);
	if (J) {
		for ( var F = 0; F < E.length; F++) {
			stateMgr.updateTask(E[F], {
				"participants" : J
			})
		}
	}
	statusBox.sharingStop();
	view.setShareMode(stateMgr.pendingShareMode);
	statusBox.sharingSetText(true, [ I, D, B ]);
	view.setShareMode(null);
	if (stateMgr.pendingShareMode == Control.SHARE_TASK_SEND) {
		if (D.length === 0 || D.length === B.length) {
			this.tasksSent(K, A)
		} else {
			this.tasksAllNotBusy();
			this.ensureValidity(E);
			this.tasksFormat()
		}
	} else {
		if (stateMgr.pendingShareMode == Control.SHARE_TASK_SHARE) {
			this.tasksAllNotBusy();
			this.ensureValidity(E);
			this.tasksFormat()
		}
	}
};
Control.prototype.tasksSharingFailure = function(A) {
	this.tasksAllNotBusy()
};
Control.prototype.tasksSentForEach = function(A, B) {
	stateMgr.updateTask(B, {
		"list_id" : A
	});
	taskList.getViewList().removeEntry(B)
};
Control.prototype.tasksSent = function(A, E) {
	E = this.taskSeriesFlatten(E);
	if (E.length == 1) {
		var D = E[0];
		this.tasksSentForEach(A, D)
	} else {
		for ( var B = 0; B < E.length; B++) {
			var D = E[B];
			this.tasksSentForEach(A, D)
		}
	}
	this.ensureValidity(E);
	taskList.getViewList().sort();
	taskList.getViewList().fireSelectionFinished();
	this.tasksFormat()
};
Control.prototype.tasksAllBusy = function() {
	for ( var A = 0; A < taskList.list.selected.length; A++) {
		taskList.list.tableSetRowBusy(taskList.list.selected[A], true)
	}
};
Control.prototype.tasksAllNotBusy = function() {
	for ( var A = 0; A < taskList.getViewList().selected.length; A++) {
		taskList.getViewList().tableSetRowBusy(
				taskList.getViewList().selected[A], false)
	}
};
Control.prototype.shareButtonClicked = function() {
	var B = shareMgr.radiogroup.selected;
	if (B === null) {
	} else {
		var D = shareMgr.radiogroup.names[B];
		if (D == "xprivate") {
			var A = {
				"list" : stateMgr.currentList,
				"who" : "none"
			};
			transMgr.request("lists.share", utility.encodeJavaScript(A))
		} else {
			if (D == "xcontact") {
				this.tasksShare(Control.SHARE_LIST_SHARE)
			}
		}
	}
};
Control.prototype.publishButtonClicked = function() {
	var D = publishMgr.radiogroup.selected;
	if (D !== null) {
		var E = publishMgr.radiogroup.names[D];
		var B = stateMgr.lists[stateMgr.currentList].name.escapeForDisplay();
		if (E == "xpublic") {
			var A = {
				"list" : stateMgr.currentList,
				"who" : "all"
			};
			transMgr.request("lists.publish", utility.encodeJavaScript(A));
			statusBox.setText(_T("INTERFACE_STATUS_MAKE_X_PUBLIC", {
				"LIST_NAME" : B
			}), false, true)
		} else {
			if (E == "xprivate") {
				var A = {
					"list" : stateMgr.currentList,
					"who" : "none"
				};
				transMgr.request("lists.publish", utility.encodeJavaScript(A));
				statusBox.setText(_T("INTERFACE_STATUS_MAKE_X_PRIVATE", {
					"LIST_NAME" : B
				}), false, true)
			} else {
				if (E == "xcontact") {
					this.tasksShare(Control.PUBLISH_LIST_PUBLISH)
				}
			}
		}
	}
};
Control.prototype.listSaveButtonClicked = function() {
	var D = el("savelistname").value.trim();
	if (D.length == 0) {
		return false
	}
	var A = {
		"name" : D,
		"filter" : stateMgr.currentFilter
	};
	transMgr.request("lists.addSmartList", utility.encodeJavaScript(A));
	var B = D.escapeForDisplay();
	statusBox.setText(_T("INTERFACE_STATUS_CREATING_SMART_LIST", {
		"LIST_NAME" : B
	}), false, true)
};
Control.prototype.listsSharingSuccess = function(H) {
	var F = H[0];
	var E = H[1];
	var D = H[2];
	statusBox.sharingStop();
	if (E == "publish") {
		var B = stateMgr.lists[F].name.escapeForDisplay();
		var A = D == "all" ? "INTERFACE_STATUS_X_IS_NOW_PUBLIC"
				: "INTERFACE_STATUS_X_IS_NOW_PRIVATE";
		statusBox.setText(_T(A, {
			"LIST_NAME" : B
		}), false, true)
	}
	if (D == "contact") {
		view.setShareMode(stateMgr.pendingShareMode);
		statusBox.sharingSetText(true);
		view.setShareMode(null)
	}
};
Control.prototype.permissionsUpdated = function() {
	publishMgr.fillPublicInfo();
	this.tasksFormat()
};
Control.prototype.publishRadioSelected = function(D) {
	var A = publishMgr.radiogroup.names[D];
	var B = publishMgr.radiogroup.defaultRadio;
	if (D == B) {
		publishMgr.button.disabled = true
	} else {
		publishMgr.button.disabled = false
	}
	if (D == B && A == "xcontact") {
		publishMgr.button.value = _T("INTERFACE_TASKS_LIST_DETAILS_PUBLISH_PUBLISH_FOR_MORE_BUTTON");
		publishMgr.button.disabled = false
	} else {
		if (A == "xpublic") {
			publishMgr.button.value = _T("INTERFACE_TASKS_LIST_DETAILS_PUBLISH_PUBLISH_BUTTON")
		}
		if (A == "xprivate") {
			publishMgr.button.value = _T("INTERFACE_TASKS_LIST_DETAILS_PUBLISH_DONT_PUBLISH_BUTTON")
		}
		if (A == "xcontact") {
			publishMgr.button.value = _T("INTERFACE_TASKS_LIST_DETAILS_PUBLISH_PUBLISH_FOR_CONTACTS_BUTTON")
		}
	}
};
Control.prototype.shareRadioSelected = function(D) {
	var A = shareMgr.radiogroup.names[D];
	var B = shareMgr.radiogroup.defaultRadio;
	if (D == B) {
		shareMgr.button.disabled = true
	} else {
		shareMgr.button.disabled = false
	}
	if (D == B && A == "xcontact") {
		shareMgr.button.value = _T("INTERFACE_TASKS_LIST_DETAILS_SHARE_SHARE_WITH_MORE_BUTTON");
		shareMgr.button.disabled = false;
		shareMgr.radiogroup.radios[0].disabled = true
	} else {
		if (A == "xprivate") {
			shareMgr.button.value = _T("INTERFACE_TASKS_LIST_DETAILS_SHARE_DONT_SHARE")
		} else {
			if (A == "xcontact") {
				shareMgr.button.value = _T("INTERFACE_TASKS_LIST_DETAILS_SHARE_SHARE_WITH_CONTACTS_BUTTON")
			}
		}
	}
};
Control.prototype.listsAcceptList = function(B) {
	listList.list.tableSetRowBusyById(B, true);
	var A = stateMgr.lists[B] || stateMgr.pendingLists[B];
	transMgr.request("lists.accept", utility.encodeJavaScript( {
		"from" : A.from,
		"pendingList" : B
	}))
};
Control.prototype.listsRejectList = function(B) {
	listList.list.tableSetRowBusyById(B, true);
	var A = stateMgr.lists[B] || stateMgr.pendingLists[B];
	transMgr.request("lists.reject", utility.encodeJavaScript( {
		"from" : A.from,
		"pendingList" : B
	}))
};
Control.prototype.listsAccepted = function(F, E, B) {
	listList.list.tableSetRowBusyById(F, false);
	var A = stateMgr.lists[F].name.escapeForDisplay();
	listTabs.addEntry(A, [ TasksView.LIST_TYPE_NORMAL, F ]);
	listTabs.sort();
	listTabs.blitDiv();
	tasksView.reflectListsInTasksToolbox();
	var D = _T("INTERFACE_STATUS_X_ACCEPTED_FROM_Y", {
		"LIST_NAME" : A,
		"CONTACT_NAME" : format.formatContactName(E)
	});
	statusBox.setText(D, false, true);
	this.listsFormat()
};
Control.prototype.listsRejected = function(H, F, D) {
	listList.list.removeEntry(H);
	listList.list.fireSelectionFinished();
	var E = format.formatContactName(F);
	var B = stateMgr.lists[H].name.escapeForDisplay();
	var A = E !== null ? "INTERFACE_STATUS_X_REJECTED_FROM_Y"
			: "INTERFACE_STATUS_LIST_REJECTED";
	statusBox.setText(_T(A, {
		"LIST_NAME" : B,
		"CONTACT_NAME" : E
	}), false, true);
	this.listsFormat()
};
Control.prototype.inviteSuccess = function(B) {
	var D = B[0];
	var A = B[1];
	var E = _T("INTERFACE_STATUS_X_HAS_BEEN_INVITED", {
		"FIRST_NAME" : D.escapeForDisplay(),
		"EMAIL" : A.escapeForDisplay()
	});
	statusBox.setText(E, false, true);
	inviteMgr.firstname.value = "";
	inviteMgr.email.value = "";
	inviteMgr.submit.value = _T("INTERFACE_CONTACTS_INVITES_SEND");
	inviteMgr.submit.disabled = false
};
Control.prototype.inviteFailure = function(B) {
	var D = B[0];
	var A = B[1];
	var E = _T("INTERFACE_STATUS_X_IS_ALREADY_A_MEMBER", {
		"FIRST_NAME" : D.escapeForDisplay(),
		"EMAIL" : A.escapeForDisplay()
	});
	statusBox.setText(E, false, true);
	inviteMgr.submit.value = _T("INTERFACE_CONTACTS_INVITES_SEND");
	inviteMgr.submit.disabled = false
};
Control.prototype.overviewSelected = function(E, F) {
	var D = F[0];
	var H = F[1];
	if (D > 0) {
		var I = E.entries[H][0];
		var A = stateMgr.tasks[I].list_id;
		view.selectView("Tasks");
		if (stateMgr.currentList == A) {
			taskList.getViewList().selectNone();
			taskList.getViewList().selectOne(I, true)
		} else {
			var B = function(J, K) {
				taskList.getViewList().selectOne(I, true)
			};
			messageBus.subscribeOnce(B, taskList.getUniqueMessageBusName()
					+ "loadFinished");
			listTabs.selectTabByData(A)
		}
		overviewList.getViewList().selectNone();
		if (is_gecko) {
			overviewList.getViewList().setRowHover(
					overviewList.getViewList().table.rows[H], false)
		}
	}
};
Control.prototype.showTaskById = function(D) {
	var A = stateMgr.tasks[D].list_id;
	view.selectView("Tasks");
	if (stateMgr.currentList == A) {
		taskList.getViewList().selectNone();
		taskList.getViewList().selectOne(D, true)
	} else {
		var B = function(E, F) {
			taskList.getViewList().selectOne(D, true)
		};
		messageBus.subscribeOnce(B, taskList.getUniqueMessageBusName()
				+ "loadFinished");
		listTabs.selectTabByData(A)
	}
};
Control.prototype.viewModeChanged = function(B) {
	var D = B[0];
	var A = B[1];
	if (D == "multiEditMode") {
		if (A == false) {
			statusBox.setText(_T("INTERFACE_STATUS_MULTI_EDIT_OFF"), false,
					true)
		} else {
			statusBox
					.setText(_T("INTERFACE_STATUS_MULTI_EDIT_ON"), false, true)
		}
		taskList.getViewList().fireSelectionFinished();
		this.tasksFormat()
	}
};
Control.prototype.createSmartList = function(A) {
	stateMgr.lists[A.id] = A;
	stateMgr.updateList(A.id, {});
	listTabs.addEntry(A.name, [ TasksView.LIST_TYPE_SMART, A.id, A.filter ]);
	listTabs.selectTabByData(A.id);
	listTabs.removeEntryByData(null);
	listTabs.sort();
	listTabs.blitDiv();
	statusBox.setText(_T("INTERFACE_STATUS_SMART_LIST_X_CREATED", {
		"LIST_NAME" : A.name.escapeForDisplay()
	}), false, true);
	el("savelistname").value = ""
};
Control.prototype.showTag = function(A) {
	view.selectView("Tasks");
	el("listFilter").value = "tag:" + quoteSearchTerm(A);
	this.updateListFilter()
};
Control.prototype.showLocation = function(A) {
	view.selectView("Tasks");
	el("listFilter").value = "location:" + quoteSearchTerm(A);
	this.updateListFilter()
};
Control.prototype.showList = function(A) {
	view.selectView("Tasks");
	listTabs.selectTabByData(A)
};
Control.prototype.updateLiveSet = function(A) {
	if (stateMgr.filterObj.isMember(A) == false) {
		return true
	}
	return false
};
Control.prototype.refreshListForUndo = function(I) {
	if (!I && stateMgr.currentType === TasksView.LIST_TYPE_NORMAL) {
		this.tasksListReload(false, false)
	} else {
		var B = {};
		if (!I) {
			for ( var E in stateMgr.tasks) {
				if (is(stateMgr.tasks[E])) {
					B[stateMgr.tasks[E].list_id] = true
				}
			}
		}
		var H = [];
		var A = stateMgr.currentFilter.indexOf("includeArchived:true") > -1;
		for ( var D in stateMgr.lists) {
			var F = A || stateMgr.lists[D].archived === false;
			if (!stateMgr.lists[D].deleted && !stateMgr.lists[D].queued && F
					&& stateMgr.lists[D].filter === null) {
				H.push(D)
			}
		}
		if (H.length > 0) {
			this.doListsLoad(H)
		}
	}
};
Control.prototype.viewLocked = function(A) {
	view.getViewList().setHoverable(!A)
};
Control.prototype.serviceDeleted = function(A) {
	statusBox.setText(_T("INTERFACE_STATUS_SERVICE_DEAUTH", {
		"SERVICE_NAME" : servicesMgr.getApp(A.token)
	}), false, true)
};
Control.prototype.locationsSetDefault = function(B) {
	if (B && locationList.list.selected.length > 1) {
		statusBox.setText(_T("INTERFACE_STATUS_ONE_LOCATION_DEFAULT"), false,
				true);
		return false
	}
	if (locationList.list.selected.length === 0) {
		if (B) {
			statusBox.setText(
					_T("INTERFACE_STATUS_LOCATION_MUST_SELECT_DEFAULT"), false,
					true)
		} else {
			statusBox.setText(
					_T("INTERFACE_STATUS_LOCATION_MUST_SELECT_UNSET_DEFAULT"),
					false, true)
		}
		return false
	}
	var A = locationList.list.getLastSelectedId();
	locationList.list.tableSetRowBusyById(A, true);
	if (B) {
		transMgr.request("locations.setDefaultLocation", utility
				.encodeJavaScript( {
					"location" : A
				}))
	} else {
		transMgr.request("locations.clearDefaultLocation", utility
				.encodeJavaScript( {
					"location" : A
				}))
	}
};
Control.prototype.locationsSelectionChanged = function(B, E) {
	var D = E[0];
	var A = E[1];
	switch (D) {
	case _T("INTERFACE_SETTINGS_LISTS_TOOLBOX_SET_AS_DEFAULT"):
		this.locationsSetDefault(true);
		break;
	case _T("INTERFACE_SETTINGS_LISTS_TOOLBOX_UNSET_AS_DEFAULT"):
		this.locationsSetDefault(false);
		break;
	case _T("INTERFACE_SETTINGS_LOCATIONS_TOOLBOX_DELETE_LOCATION"):
		this.locationsDelete();
		break;
	default:
		break
	}
};
Control.prototype.locationsDelete = function() {
	if (view.getSelected() == "Settings"
			&& settingsView.getSelected() == _T("INTERFACE_SETTINGS_LOCATIONS_TAB")) {
		var B = locationList.list.getSelected();
		if (B.length === 0) {
			statusBox.setText(_T("INTERFACE_STATUS_MUST_SELECT_TO_DELETE"));
			return false
		}
		for ( var A = 0; A < locationList.list.selected.length; A++) {
			locationList.list.tableSetRowBusy(locationList.list.selected[A],
					true)
		}
		transMgr.request("locations.delete", utility.encodeJavaScript( {
			"locations" : B
		}))
	}
};
Control.prototype.locationsButtonClicked = function(A) {
	if (A == _T("INTERFACE_CONTACTS_GROUPS_DELETE_BUTTON")) {
		this.locationsDelete()
	}
};
Control.prototype.listsSetFilter = function(A) {
};
Control.prototype.listsSetFilterSuccess = function(D) {
	var A = D[0];
	var F = D[1];
	var B = D[2];
	undoMgr.pushTransaction(A);
	stateMgr.updateList(F, {
		"filter" : B
	});
	listTabs.setDataForEntry(F, [ TasksView.LIST_TYPE_SMART, F, B ]);
	listList.list.tableSetRowBusyById(F, false);
	this.listsFormat();
	var E = _T("INTERFACE_STATUS_SMART_LIST_UPDATED", {
		"LIST_NAME" : stateMgr.lists[F].name.escapeForDisplay()
	});
	statusBox.setText(E, true, true);
	if (stateMgr.currentList == F) {
		listTabs.selectTabByPosition(listTabs.selected)
	}
};
Control.prototype.listDetailsFilterEditStarted = function(A, B) {
};
Control.prototype.listDetailsFilterEditCancelled = function(A, B) {
};
Control.prototype.listDetailsFilterEditFinished = function(A, F) {
	var E = listList.list.getLastSelectedId();
	listList.list.tableSetRowBusyById(E, true);
	var D = new Sexp(F);
	var B = D.str;
	transMgr.request("lists.setFilter", Utility.toJSON( {
		"list_id" : E,
		"filter" : D.str
	}))
};
Control.prototype.tasksDuplicatedForEach = function(A) {
};
Control.prototype.tasksDuplicated = function(E) {
	this.tasksAllNotBusy();
	var H = this.taskSeriesFlatten(E[1], true);
	var D = stateMgr.tasks[H[0][1]].name;
	var B = H.length;
	var A = B < 2 ? "INTERFACE_STATUS_TASK_DUPLICATED_ONE"
			: "INTERFACE_STATUS_TASK_DUPLICATED_NUM";
	var F = _T(A, {
		"TASK_NAME" : Control.safeWbrs(D),
		"NUM" : B
	});
	statusBox.setText(F, false, true)
};
Control.isPro = function(H) {
	try {
		var D = el("is-pro");
		var I = [ el("account-status-pro") ];
		var F = [ el("settings-sync-status-pro"), el("settings-sync-form-pro") ];
		var E = [ el("account-status-free") ];
		var A = [ el("settings-sync-status-free") ];
		var Q = el("account-status-date");
		var K = el("settings-sync-status");
		var J = [ el("appfooter-news-overview"), el("appfooter-news-list") ];
		rtmIsPro = H[0];
		if (rtmIsPro) {
			D.style.display = "";
			map(function(R) {
				if (!R) {
					return
				}
				R.style.display = "none"
			}, E);
			map(function(R) {
				if (!R) {
					return
				}
				R.style.display = ""
			}, I);
			var O = new Date(H[1] * 1000);
			var B;
			if (rtmLanguage === "ja") {
				B = DateFormat("yyyy'年'M'月'd'日", O)
			} else {
				B = O.getFullMonth() + " " + utility.suffixize(O.getDate())
						+ ", " + O.getFullYear()
			}
			Q.innerHTML = B;
			map(function(R) {
				if (!R) {
					return
				}
				R.style.display = "none"
			}, J)
		} else {
			D.style.display = "none";
			map(function(R) {
				if (!R) {
					return 

				}
				R.style.display = "none"
			}, I);
			map(function(R) {
				if (!R) {
					return
				}
				R.style.display = ""
			}, E);
			map(function(R) {
				if (!R) {
					return
				}
				R.style.display = ""
			}, J)
		}
		rtmHasMilkSync = rtmIsPro ? true : H[2][0];
		if (rtmHasMilkSync === true) {
			map(function(R) {
				if (!R) {
					return 

				}
				R.style.display = "none"
			}, A);
			map(function(R) {
				if (!R) {
					return
				}
				R.style.display = ""
			}, F);
			Utility.addClass(K, "settings-header-text")
		} else {
			map(function(R) {
				if (!R) {
					return
				}
				R.style.display = "none"
			}, F);
			map(function(R) {
				if (!R) {
					return 

				}
				R.style.display = ""
			}, A);
			Utility.removeClass(K, "settings-header-text")
		}
		listList.doStyles()
	} catch (M) {
	}
};
Control.showProMessage = function(D) {
	try {
		var A = el("appfooter-news-list");
		if (A) {
			A.style.display = D ? "" : "none"
		}
	} catch (B) {
	}
};
Control.showLists = function() {
	settingsTabs.selectTab(_T("INTERFACE_SETTINGS_LISTS_TAB"))
};
Control.syncList = function(B, A) {
	transMgr.request("lists.setSyncable", Utility.toJSON( {
		"list_id" : B,
		"syncable" : A
	}))
};
Control.updateListSyncable = function(D, B) {
	var A = B ? "INTERFACE_SYNC_STATUS_NOW_INCLUDED"
			: "INTERFACE_SYNC_STATUS_NOT_INCLUDED";
	statusBox.setText(_T(A, {
		"LIST_NAME" : stateMgr.lists[D].name.escapeForDisplay()
	}), false, true);
	stateMgr.updateList(D, {
		"syncable" : B ? 1 : 0
	});
	format.formatList(D);
	listList.listUpdateSyncable(D, B)
};
Control.updatePrivate = function(E) {
	var I = E[0];
	var H = E[1];
	for ( var D = 0, B = H.length; D < B; D++) {
		var F = H[D][0];
		if (stateMgr.lists[F]) {
			stateMgr.updateList(F, {
				"token" : H[D][1]
			})
		}
	}
	control.listsFormat();
	var A = "INTERFACE_PRIVATE_URL_ON";
	if (I === 0) {
		A = "INTERFACE_PRIVATE_URL_OFF"
	} else {
		if (I === 2) {
			A = "INTERFACE_PRIVATE_URL_RESET_STATUS";
			statusBox.setText(_T(A), false, true)
		}
	}
};
Control.resetPrivate = function() {
	transMgr.request("configuration.resetPrivate", Utility.toJSON( {
		"x" : 1
	}))
};
Control.redrawSnake = function() {
	setTimeout(function() {
		var A = view.getViewList();
		if (A) {
			if ("multi_snake_" in A) {
				if ((view.isNewUI() || view.multiEditMode)
						&& !tasksView.getHovering()) {
					if (A.multi_snake_.shown_) {
						A.multi_snake_.redraw_line()
					}
					A.snake_.hide()
				} else {
					if (A.snake_.shown_) {
						A.snake_.redraw_line()
					}
					A.multi_snake_.hide()
				}
			} else {
				A.snake_.redraw_line()
			}
		}
	}, 0)
};
Control.prototype.tagsSelectorClicked = function(B) {
	var D = B[0];
	var A = B[1];
	switch (D) {
	case _T("INTERFACE_TASKS_SELECT_ALL"):
		tagList.list.selectAll(A);
		return;
	case _T("INTERFACE_TASKS_SELECT_NONE"):
		tagList.list.selectNone(A);
		return;
	default:
		return
	}
};
Control.prototype.tagsButtonClicked = function(A) {
	if (A == _T("INTERFACE_CONTACTS_GROUPS_DELETE_BUTTON")) {
		this.tagsDelete()
	}
};
Control.prototype.tagsDelete = function() {
	var A = tagList.list.getSelected();
	if (A.length === 0) {
		statusBox.setText(_T("INTERFACE_STATUS_MUST_SELECT_TO_DELETE"));
		return false
	}
	transMgr.request("tags.deleteTags", Utility.toJSON( {
		"tags" : A
	}))
};
Control.prototype.tagsMerge = function() {
	var A = tagList.list.getSelected();
	if (A.length < 2) {
		statusBox.setText(_T("INTERFACE_TAGS_MUST_SELECT_TWO"));
		return
	}
	var B = function(D) {
		transMgr.request("tags.mergeTags", Utility.toJSON( {
			"tags" : A,
			"to_tag" : D
		}))
	};
	Offline.Dialog.showTagMergeDialog(B)
};
Control.prototype.tagsSelectionChanged = function(B, E) {
	var D = E[0];
	var A = E[1];
	switch (D) {
	case _T("INTERFACE_TAGS_SELECTOR_MERGE"):
		this.tagsMerge();
		break;
	case _T("INTERFACE_TAGS_SELECTOR_DELETE"):
		this.tagsDelete();
		break;
	default:
		break
	}
};
Control.refreshVirtualListIfTagged = function(D) {
	var F = false;
	if (stateMgr.currentType !== TasksView.LIST_TYPE_NORMAL) {
		var I = stateMgr.filterObj.sexp;
		if (I[0] === 4 && I[1].length > 0) {
			var A, H;
			while ((A = I[1]) && A.length == 1 && A[0][0] === 4) {
				I = A[0]
			}
			for ( var E = 0, B = A.length; E < B; E++) {
				H = A[E];
				if (H[0] === 3 && H[1][0] === "tag" && H[1][1] in D) {
					F = true;
					break
				}
			}
		}
	}
	if (F) {
		control.tasksListReload(false, true)
	}
};
Control.onTagRename = function(B, A) {
	transMgr.request("tags.renameTag", Utility.toJSON( {
		"from_tag" : B,
		"to_tag" : A
	}))
};
Control.onTagRenamed = function(F) {
	var B = F[0];
	undoMgr.pushTransaction(B);
	var H = F[1];
	var E = [ F[2] ];
	var D = [];
	var K = null;
	var J;
	for ( var M in H) {
		if (K === null) {
			K = H[M]
		}
		D.push(M);
		J = M
	}
	tagMgr.updateTaskSeries(K, [ [], E, D ]);
	tagList.updateTagName(J, F[2]);
	setTimeout(function() {
		taskList.onTagsModified( [ K ])
	}, 0);
	Control.onTagsUpdated();
	var I = "INTERFACE_TAGS_STATUS_RENAME";
	var A = _T(I, {
		"TAG_NAME" : J.escapeForDisplay(),
		"OTHER_TAG_NAME" : F[2].escapeForDisplay()
	});
	statusBox.setText(A, true, true);
	setTimeout(function() {
		var R = {};
		for ( var U = 0, Q = E.length; U < Q; U++) {
			R[E[U]] = 1
		}
		for ( var O in H) {
			R[O] = 1
		}
		Control.refreshVirtualListIfTagged(R)
	}, 0)
};
Control.onTagsMerged = function(F) {
	var B = F[0];
	undoMgr.pushTransaction(B);
	var I = F[1];
	var E = [ F[2] ];
	var M = {};
	var R = [];
	for ( var U in I) {
		for ( var H = 0, D = I[U].length; H < D; H++) {
			var O = I[U][H];
			if (!(O in M)) {
				M[O] = []
			}
			M[O].push(U)
		}
		R.push(U)
	}
	var Q = [];
	mapkv(function(V, W) {
		tagMgr.updateTaskSeries( [ V ], [ [], E, W ]);
		Q.push(V)
	}, M);
	setTimeout(function() {
		taskList.onTagsModified(Q)
	}, 0);
	Control.onTagsUpdated();
	var K = R.length;
	var J = "INTERFACE_TAGS_STATUS_MERGE_ONE";
	if (K > 1) {
		J = "INTERFACE_TAGS_STATUS_MERGE_NUM"
	}
	var A = _T(J, {
		"TAG_NUM" : K,
		"TAG_NAME" : R.join(", ").escapeForDisplay(),
		"OTHER_TAG_NAME" : F[2].escapeForDisplay()
	});
	statusBox.setText(A, true, true);
	setTimeout(function() {
		tagList.list.selectOne(F[2], true)
	}, 0);
	setTimeout(function() {
		var X = {};
		for ( var Y = 0, W = E.length; Y < W; Y++) {
			X[E[Y]] = 1
		}
		for ( var V in I) {
			X[V] = 1
		}
		Control.refreshVirtualListIfTagged(X)
	}, 0)
};
Control.onTagsDeleted = function(E) {
	var B = E[0];
	var H = {};
	if (B !== null) {
		H = E[1];
		undoMgr.pushTransaction(B)
	}
	var K = {};
	for ( var Q in H) {
		for ( var F = 0, D = H[Q].length; F < D; F++) {
			var M = H[Q][F];
			if (!(M in K)) {
				K[M] = []
			}
			K[M].push(Q)
		}
	}
	var O = [];
	mapkv(function(R, U) {
		tagMgr.updateTaskSeries( [ R ], [ [], [], U ]);
		O.push(R)
	}, K);
	setTimeout(function() {
		taskList.onTagsModified(O)
	}, 0);
	Control.onTagsUpdated();
	var J = E[2].length;
	var I = "INTERFACE_TAGS_STATUS_DELETED_ONE";
	if (J > 1) {
		I = "INTERFACE_TAGS_STATUS_DELETED_NUM"
	}
	var A = _T(I, {
		"TAG_NUM" : J,
		"TAG_NAME" : E[2].join(", ").escapeForDisplay()
	});
	statusBox.setText(A, B !== null ? true : false, true);
	setTimeout(function() {
		var U = {};
		for ( var R in H) {
			U[R] = 1
		}
		Control.refreshVirtualListIfTagged(U)
	}, 0)
};
Control.onTagActionUndone = function(B) {
	if (!B) {
		return
	}
	for ( var A in B) {
		taskList.taskUpdateTags(A)
	}
};
Control.onJavaScriptError = function(F, D, H) {
	try {
		var B = new Date().getTime();
		if ("last_error" in this && (this.last_error + 30 * 1000) > B) {
			return
		}
		this.last_error = B;
		var A = {
			"msg" : F,
			"url" : D,
			"line_num" : H,
			"ua" : navigator.userAgent,
			"c" : document.cookie,
			"u" : rtmUsername,
			"of" : rtmIsOffline,
			"ui" : rtmUIVersion,
			"lang" : rtmLanguage
		};
		transMgr.request("error.report", Utility.toJSON(A))
	} catch (E) {
	}
};
window.onerror = function(B, A, D) {
	setTimeout(function() {
		try {
			Control.onJavaScriptError(B, A, D)
		} catch (E) {
		}
	}, 0)
};
Control.safeWbrs = function(A) {
	if (!A) {
		return ""
	}
	return A.insertWbrs()
};
Control.startProfiling = function(A) {
	if (!("console" in window)) {
		return
	}
	console.profile();
	setTimeout(function() {
		console.profileEnd()
	}, 1000 * A)
};
Control.onSmartAddChanged = function() {
	var A = view.isNewUI();
	if (!view.multiEditMode) {
		view.fakeMultiEdit(A)
	}
};
Control.selectTaskById = function(B) {
	if (B != null) {
		if (!stateMgr.tasks[B]) {
			return
		}
		if (is(taskList.getViewList().map[B])) {
			taskList.getViewList().selectOne(B, true)
		} else {
			var A = function(D, E) {
				if (is(taskList.getViewList().map[B])) {
					taskList.getViewList().selectOne(B, true)
				}
			};
			messageBus.subscribeOnce(A, taskList.getUniqueMessageBusName()
					+ "loadFinished");
			taskCloud.showList(stateMgr.tasks[B].list_id)
		}
	}
};
var rtm = null;
var version = 25;
var rtmUIVersion = 3;
var debug = null;
var messageBus = null;
var statusBox = null;
var infoBox = null;
var helpBox = null;
var transMgr = null;
var stringMgr = null;
var eventMgr = null;
var reoccurMgr = null;
var dateTimeMgr = null;
var stateMgr = null;
var imageMgr = null;
var tagMgr = null;
var searchMgr = null;
var utility = null;
var view = null;
var control = null;
var format = null;
var legend = null;
var taskList = null;
var loadingList = null;
var tasksView = null;
var taskTabs = null;
var detailstab = null;
var noteMgr = null;
var listTabs = null;
var tasksToolBox = null;
var tasksCompletedToolBox = null;
var tasksSentToolBox = null;
var rtmUsername = null;
var rtmHostname = null;
var rtmMailHost = null;
var rtmAPIEnabled = false;
var rtmTime24 = false;
var rtmIsOffline = false;
var rtmMaintTS = null;
var rtmTRepoAnchor = null;
function l(A) {
	if (!A.deleted) {
		if (A.id == stateMgr.currentList) {
			if (stateMgr.currentType === TasksView.LIST_TYPE_SMART
					&& A.filter !== stateMgr.currentFilter) {
				listTabs.setDataForEntry(A.id, [ TasksView.LIST_TYPE_SMART,
						A.id, A.filter ])
			}
			listTabs.selectTabByData(A.id)
		}
		if (!view.getPublicMode()) {
			listList.addList(A);
			if (listList.list.getLastSelectedId() === A.id) {
				control.listsFormat()
			}
		}
	}
	return null
}
function t(A) {
	if (A.list_id == stateMgr.currentList) {
		taskList.addTask(A)
	}
	if (!view.getPublicMode()) {
		overviewList.addTask(A)
	}
	return null
}
function n(A) {
	if (noteMgr.currentTask === A.task_series_id
			&& noteMgr.noteEditRefCount == 0) {
		control.tasksFormat()
	}
}
function L(F, B, D, E) {
	if (rtm.init) {
		if (!view.getPublicMode()) {
			listList.list.setAdvise(true)
		}
		if (F != null && B != null) {
			var D = !!D;
			var E = !!E;
			if (Offline.isReady() && !D && !E) {
				window.setTimeout(function() {
					Offline.Sync.updateLists(B)
				}, 0)
			}
			for ( var A = 0, I = B.length; A < I; A++) {
				stateMgr.lists[B[A].id] = B[A];
				var H = B[A];
				F(H)
			}
		}
		if (!view.getPublicMode()) {
			listList.list.tableBlitRows();
			listList.list.setAdvise(false);
			listList.list.sort();
			listList.doStyles();
			tasksView.reflectListsInTasksToolbox()
		}
		listTabs.sort()
	}
	return !view.getPublicMode() ? listList : null
}
function T(F, K, D, B) {
	if (rtm.init) {
		var A = new Date().getTime();
		var Q = false;
		if (is(F) && is(K)) {
			var B = !!B;
			if (Offline.isReady() && !B) {
				window.setTimeout(function() {
					Offline.Sync.updateTasks(K, D)
				}, 0)
			}
			for ( var M = 0, J = K.length; M < J; M++) {
				var O = stateMgr.lists[K[M].list_id].list_last_sync;
				stateMgr.lists[K[M].list_id].list_last_sync = (new Date()
						.getTime() - dateTimeMgr.serverOffset);
				stateMgr.tasks[K[M].id] = K[M];
				Q = true
			}
			for ( var H in D) {
				if (typeof stateMgr.tasks[H] == "undefined"
						|| stateMgr.tasks[H] === null) {
					continue
				}
				stateMgr.updateTask(H, {
					"date_deleted" : (new Date().getTime() / 1000)
				});
				stateMgr.tasks[H] = null;
				Q = true
			}
		}
		if (Q && view.getBulk() === View.BULK_START) {
			view.setBulk(View.BULK_MODIFIED)
		}
		if (view.getBulk() !== View.BULK_MODIFIED_END) {
			if (view.getBulk() !== View.BULK_RESET
					&& view.getBulk() !== View.BULK_END) {
				return taskList
			}
		} else {
			Q = true
		}
		view.setBulk(View.BULK_RESET);
		view.setInUndo(false);
		control.doVirtualListLoad(stateMgr.currentFilter, !Q);
		if (!view.getPublicMode()) {
			var I = function() {
				if (Q || (K !== null && K.length > 0)) {
					overviewList.update();
					setTimeout(function() {
						taskCloud.update()
					}, 0)
				}
				messageBus.broadcast(overviewList, overviewList
						.getUniqueMessageBusName()
						+ "loadFinished")
			};
			if (view.getSelected() == "Overview") {
				I()
			} else {
				setTimeout(I, 0)
			}
		}
		var E = new Date().getTime();
		if (!view.getPublicMode()) {
		}
	}
	return taskList
}
function N(E, B, D) {
	if (rtm.init && is(B)) {
		var D = !!D;
		if (Offline.isReady() && !D) {
			window.setTimeout(function() {
				Offline.Sync.updateNotes(B)
			}, 0)
		}
		for ( var A = 0, H = B.length; A < H; A++) {
			stateMgr.notes[B[A].id] = B[A];
			var F = B[A];
			E(F)
		}
		if (B.length > 0 && view.getBulk() === View.BULK_START) {
			view.setBulk(View.BULK_MODIFIED)
		}
	}
}
function UT(A, B) {
	if (rtm.init && is(A)) {
		var B = !!B;
		if (Offline.isReady() && !B) {
			window.setTimeout(function() {
				Offline.Sync.updateTags(A)
			}, 0)
		}
		tagMgr.setIndex(A);
		tagMgr.updateInvertedIndex();
		if (!view.getPublicMode()) {
			Control.onTagsUpdated()
		}
	}
}
function UTC(A) {
	if (rtm.init && is(A)) {
		tagMgr.clearTagsForTaskSeries(A);
		if (!view.getPublicMode()) {
			Control.onTagsUpdated()
		}
		if (view.getViewToken("Tasks")) {
			control.tasksFormat()
		}
	}
}
function UTI(A) {
	if (rtm.init && is(A)) {
		tagMgr.updateTags(A);
		if (!view.getPublicMode()) {
			Control.onTagsUpdated();
			if (view.getInUndo()) {
				Control.onTagActionUndone(A)
			}
		}
		if (view.getViewToken("Tasks")) {
			control.tasksFormat()
		}
	}
}
function LOC(A, B) {
	if (rtm.init && is(A) && !view.getPublicMode()) {
		var B = !!B;
		if (Offline.isReady() && !B) {
			window.setTimeout(function() {
				Offline.Sync.updateLocations(A)
			}, 0)
		}
		locationMgr.updateLocations(A)
	}
}
function LOCU(A) {
	if (rtm.init && is(A) && !view.getPublicMode()) {
		locationMgr.updateTaskSeries(A)
	}
}
function rtmOnBeforeUnload() {
	if (Offline.isReady()) {
		Offline.setUnloading(true);
		Offline.DB.close()
	}
}
var undoMgr = null;
var inviteMgr = null;
var configurationMgr = null;
var notificationMgr = null;
var servicesMgr = null;
var whatsNew = null;
var taskCloud = null;
var saveMgr = null;
var locationMgr = null;
var smartAdd = null;
var configuration = null;
var overviewnews = null;
var groupList = null;
var contactList = null;
var listList = null;
var locationList = null;
var tagList = null;
var overviewList = null;
var addingList = null;
var overviewView = null;
var contactsView = null;
var settingsView = null;
var locationsView = null;
var overviewTabs = null;
var contactsTabs = null;
var settingsTabs = null;
var detailstab = null;
var contactsdetailstabs = null;
var settingsdetailstabs = null;
var contactsToolbox = null;
var groupsToolbox = null;
var listsToolbox = null;
var locationsToolbox = null;
var tagToolbox = null;
var adder = null;
var map_legend = null;
var rtmInboxEmail = null;
var rtmImportEmail = null;
var rtmShowOverview = null;
var rtmLanguage = null;
var rtmAPIEnabled = null;
var rtmRequestedList = null;
var rtmRequestedTask = null;
var rtmIsPro = false;
var rtmHasMilkSync = false;
var rtmTagPosition = 1;
function c(A) {
	return contactList.addContact(A)
}
function g(A) {
	return groupList.addGroup(A)
}
function P(A) {
	stateMgr.permissions = A;
	messageBus.broadcast(stateMgr, stateMgr.mbn + "permissionsUpdated")
}
function S(A) {
	window.setTimeout(function() {
		servicesMgr.setData(A)
	}, 0)
}
function UC(A) {
	configurationMgr.setData(A)
}
function UN(A) {
	notificationMgr.setData(A)
}
function UWN(B, D) {
	var A = !!D;
	whatsNew.setData(B, A)
}
function C(E, B, D) {
	if (rtm.init) {
		contactList.list.setAdvise(true);
		if (E != null && B != null) {
			var D = !!D;
			if (Offline.isReady() && !D) {
				window.setTimeout(function() {
					Offline.Sync.updateContacts(B)
				}, 0)
			}
			for ( var A = 0; A < B.length; A++) {
				stateMgr.contacts[B[A].id] = B[A];
				var F = B[A];
				E(F)
			}
		}
		contactList.list.tableBlitRows();
		contactList.list.setAdvise(false);
		contactList.list.sort();
		control.contactsFormat()
	}
	return contactList
}
function G(E, B, D) {
	if (rtm.init) {
		groupList.list.setAdvise(true);
		if (E != null && B != null) {
			var D = !!D;
			if (Offline.isReady() && !D) {
				window.setTimeout(function() {
					Offline.Sync.updateGroups(B)
				}, 0)
			}
			for ( var A = 0; A < B.length; A++) {
				stateMgr.groups[B[A].id] = B[A];
				var F = B[A];
				E(F)
			}
		}
		groupList.list.tableBlitRows();
		groupList.list.setAdvise(false);
		groupList.list.sort();
		contactsView.reflectGroupsInContactsToolbox()
	}
	return groupList
}
function RememberTheMilk() {
}
RememberTheMilk.prototype.init = function() {
	if (Offline.initialize()) {
		Offline.prepareGears()
	}
	View.applyBodyStyle();
	utility = new Utility();
	messageBus = new MessageBus();
	messageBus.broadcast(this, "rtm.initStarted");
	stateMgr = new StateManager();
	format = new Format();
	stringMgr = new StringManager();
	undoMgr = new UndoManager();
	undoMgr.init();
	eventMgr = new EventManager();
	eventMgr.init();
	reoccurMgr = new ReoccurrenceManager();
	imageMgr = new ImageManager();
	imageMgr.init();
	transMgr = new TransactionManager();
	transMgr.setSingleSignOn(rtmUsername);
	dateTimeMgr = DateTimeManager.getInstance();
	dateTimeMgr.init();
	statusBox = new StatusBox("statusbox", "statusboxtext", "statusboxbuttons");
	statusBox.init();
	statusBox.setText(_T("INTERFACE_STATUS_LOADING"), false, true);
	statusBox.show();
	locationMgr = new LocationManager();
	loadingList = new LoadingList("loading");
	loadingList.init();
	taskList = new TaskList("tasks", "taskscompleted");
	taskList.init();
	groupList = new GroupList("groups");
	contactList = new ContactList("contacts");
	listList = new ListList("lists");
	locationList = new LocationList("locations");
	tagList = new TagList("tag-manager");
	addingList = new AddingList("adding");
	addingList.init();
	addingList.blit();
	contactsTabs = new Tabs("contacttabs");
	contactsTabs.init();
	contactsTabs.addEntry(_T("INTERFACE_CONTACTS_CONTACTS_TAB"));
	contactsTabs.addEntry(_T("INTERFACE_CONTACTS_GROUPS_TAB"));
	contactsTabs.addEntry(_T("INTERFACE_CONTACTS_INVITES_TAB"));
	contactsTabs.selectTab(_T("INTERFACE_CONTACTS_CONTACTS_TAB"));
	contactsToolbox = new Toolbox("contactsToolbox");
	contactsToolbox.init();
	contactsToolbox.addButton(_T("INTERFACE_CONTACTS_CONTACTS_DELETE_BUTTON"));
	contactsToolbox.addListAction(
			_T("INTERFACE_CONTACTS_CONTACTS_TOOLBOX_MORE_ACTIONS"), false,
			false);
	contactsToolbox.addListSeperator();
	contactsToolbox.addListAction(
			_T("INTERFACE_CONTACTS_CONTACTS_TOOLBOX_ADD_TO"), true, false);
	contactsToolbox.addListSeperator();
	contactsToolbox.addListAction(
			_T("INTERFACE_CONTACTS_CONTACTS_TOOLBOX_REMOVE_FROM"), true, false);
	contactsToolbox.addSelector(_T("INTERFACE_TASKS_SELECT_ALL"));
	contactsToolbox.addSelector(_T("INTERFACE_TASKS_SELECT_NONE"));
	contactsToolbox.blitDiv();
	groupsToolbox = new Toolbox("groupsToolbox");
	groupsToolbox.init();
	groupsToolbox.addButton(_T("INTERFACE_CONTACTS_GROUPS_DELETE_BUTTON"));
	groupsToolbox.addSelector(_T("INTERFACE_TASKS_SELECT_ALL"));
	groupsToolbox.addSelector(_T("INTERFACE_TASKS_SELECT_NONE"));
	groupsToolbox.blitDiv();
	listsToolbox = new Toolbox("listsToolbox");
	listsToolbox.init();
	listsToolbox.addButton(_T("INTERFACE_SETTINGS_LISTS_ARCHIVE_BUTTON"));
	listsToolbox.addListAction(
			_T("INTERFACE_SETTINGS_LISTS_TOOLBOX_MORE_ACTIONS"), false, false);
	listsToolbox.addListSeperator();
	listsToolbox
			.addListAction(
					_T("INTERFACE_SETTINGS_LISTS_TOOLBOX_SET_AS_DEFAULT"),
					false, false);
	listsToolbox.addListAction(
			_T("INTERFACE_SETTINGS_LISTS_TOOLBOX_UNSET_AS_DEFAULT"), false,
			false);
	listsToolbox.addListSeperator();
	listsToolbox.addListAction(
			_T("INTERFACE_SETTINGS_LISTS_TOOLBOX_ARCHIVE_LIST"), false, false);
	listsToolbox
			.addListAction(
					_T("INTERFACE_SETTINGS_LISTS_TOOLBOX_UNARCHIVE_LIST"),
					false, false);
	listsToolbox.addListSeperator();
	listsToolbox.addListAction(
			_T("INTERFACE_SETTINGS_LISTS_TOOLBOX_DELETE_LIST"), false, false);
	listsToolbox.addSelector(_T("INTERFACE_TASKS_SELECT_ALL"));
	listsToolbox.addSelector(_T("INTERFACE_TASKS_SELECT_NONE"));
	listsToolbox.blitDiv();
	locationsToolbox = new Toolbox("locationsToolbox");
	locationsToolbox.init();
	locationsToolbox.addButton(_T("INTERFACE_CONTACTS_GROUPS_DELETE_BUTTON"));
	locationsToolbox.addListAction(
			_T("INTERFACE_SETTINGS_LISTS_TOOLBOX_MORE_ACTIONS"), false, false);
	locationsToolbox.addListSeperator();
	locationsToolbox
			.addListAction(
					_T("INTERFACE_SETTINGS_LISTS_TOOLBOX_SET_AS_DEFAULT"),
					false, false);
	locationsToolbox.addListAction(
			_T("INTERFACE_SETTINGS_LISTS_TOOLBOX_UNSET_AS_DEFAULT"), false,
			false);
	locationsToolbox.addListSeperator();
	locationsToolbox.addListAction(
			_T("INTERFACE_SETTINGS_LOCATIONS_TOOLBOX_DELETE_LOCATION"), false,
			false);
	locationsToolbox.addSelector(_T("INTERFACE_TASKS_SELECT_ALL"));
	locationsToolbox.addSelector(_T("INTERFACE_TASKS_SELECT_NONE"));
	locationsToolbox.blitDiv();
	tagToolbox = new Toolbox("tagToolbox");
	tagToolbox.init();
	tagToolbox.addButton(_T("INTERFACE_CONTACTS_GROUPS_DELETE_BUTTON"));
	tagToolbox.addListAction(
			_T("INTERFACE_SETTINGS_LISTS_TOOLBOX_MORE_ACTIONS"), false, false);
	tagToolbox.addListSeperator();
	tagToolbox.addListAction(_T("INTERFACE_TAGS_SELECTOR_MERGE"), false, false);
	tagToolbox.addListSeperator();
	tagToolbox
			.addListAction(_T("INTERFACE_TAGS_SELECTOR_DELETE"), false, false);
	tagToolbox.addSelector(_T("INTERFACE_TASKS_SELECT_ALL"));
	tagToolbox.addSelector(_T("INTERFACE_TASKS_SELECT_NONE"));
	tagToolbox.blitDiv();
	contactsView = new ContactsView();
	contactsView.init();
	contactsView.addObject("contactsdetailstabs");
	contactsView.addObject(contactsTabs);
	contactsView.addState(_T("INTERFACE_CONTACTS_CONTACTS_TAB"), [ contactList,
			"tools", contactsToolbox ],
			[ tasksToolBox, tasksCompletedToolBox ], contactsTabs);
	contactsView.addState(_T("INTERFACE_CONTACTS_GROUPS_TAB"), [ groupList,
			"tools", groupsToolbox ], [ tasksToolBox, tasksCompletedToolBox ],
			contactsTabs);
	contactsView.addState(_T("INTERFACE_CONTACTS_INVITES_TAB"), [ "invites" ],
			[ "tools" ], contactsTabs);
	settingsTabs = new Tabs("settingstabs");
	settingsTabs.init();
	settingsTabs.addEntry(_T("INTERFACE_SETTINGS_GENERAL_TAB"));
	settingsTabs.addEntry(_T("INTERFACE_SETTINGS_LISTS_TAB"));
	settingsTabs.addEntry(_T("INTERFACE_TASKS_TASK_DETAILS_TAGS"));
	settingsTabs.addEntry(_T("INTERFACE_SETTINGS_LOCATIONS_TAB"));
	settingsTabs.addEntry(_T("INTERFACE_SETTINGS_REMINDERS_TAB"));
	if (rtmAPIEnabled === true) {
		settingsTabs.addEntry(_T("INTERFACE_SETTINGS_SERVICES_TAB"))
	}
	settingsTabs.addEntry(_T("INTERFACE_SYNC_TITLE"));
	settingsTabs.addEntry(_T("INTERFACE_SETTINGS_INFO_TAB"));
	settingsTabs.selectTab(_T("INTERFACE_SETTINGS_GENERAL_TAB"));
	settingsView = new SettingsView();
	settingsView.init();
	settingsView.addObject("settingsdetailstabs");
	settingsView.addObject("settingstabs");
	settingsView.addState(_T("INTERFACE_SETTINGS_GENERAL_TAB"), [ "general" ],
			[ "tools" ], settingsTabs);
	settingsView.addState(_T("INTERFACE_SETTINGS_LISTS_TAB"), [ listList,
			"tools", listsToolbox ], [ tasksToolBox, tasksCompletedToolBox ],
			settingsTabs);
	settingsView.addState(_T("INTERFACE_SETTINGS_LOCATIONS_TAB"), [
			locationList, "tools", locationsToolbox ], [ tasksToolBox,
			tasksCompletedToolBox ], settingsTabs);
	settingsView.addState(_T("INTERFACE_SETTINGS_REMINDERS_TAB"),
			[ "reminders" ], [ "tools" ], settingsTabs);
	settingsView.addState(_T("INTERFACE_SETTINGS_SERVICES_TAB"),
			[ "services" ], [ "tools" ], settingsTabs);
	settingsView.addState(_T("INTERFACE_SYNC_TITLE"), [ "settings-sync" ],
			[ "tools" ], settingsTabs);
	settingsView.addState(_T("INTERFACE_TASKS_TASK_DETAILS_TAGS"), [ tagList,
			"tools", tagToolbox ], [ tasksToolBox, tasksCompletedToolBox ],
			settingsTabs);
	settingsView.addState(_T("INTERFACE_SETTINGS_INFO_TAB"), [ "info" ],
			[ "tools" ], settingsTabs);
	locationsView = new LocationsView();
	locationsView.init();
	locationsView.addObject("mapbox");
	locationsView.addObject("locationsbox");
	overviewView = new Overview();
	overviewView.addObject("overviewtabs");
	overviewView.addObject("overview");
	overviewTabs = new Tabs("overviewtabs");
	overviewTabs.init();
	overviewList = new OverviewList("overviewlist");
	overviewList.init();
	overviewList.addView( [ _T("INTERFACE_OVERVIEW_TODAY"),
			"((status:incomplete and due:today) not list:Sent)",
			_T("INTERFACE_OVERVIEW_NO_TASKS_DUE_TODAY") ]);
	overviewList.addView( [ _T("INTERFACE_OVERVIEW_TOMORROW"),
			"((status:incomplete and due:tomorrow) not list:Sent)",
			_T("INTERFACE_OVERVIEW_NO_DUE_TOMORROW") ]);
	overviewList.addView( [ _T("INTERFACE_OVERVIEW_OVERDUE"),
			"((status:incomplete and dueBefore:today) not list:Sent)",
			_T("INTERFACE_OVERVIEW_NO_TASKS_OVERDUE") ]);
	overviewList.showLoading();
	overviewView.createWeeklyPlanner();
	view = new View("viewSelector");
	view.init();
	tasksView = new TasksView();
	tasksView.init();
	tasksView.addObject(listTabs);
	tasksView.addObject("tools");
	tasksView.addObject(taskList);
	view.addEntry( [ "Overview" ], overviewView,
			_T("INTERFACE_TOP_NAV_OVERVIEW"));
	view.addEntry( [ "Tasks" ], tasksView, _T("INTERFACE_TOP_NAV_TASKS"));
	view.addEntry( [ "Locations" ], locationsView,
			_T("INTERFACE_SETTINGS_LOCATIONS_TAB"));
	view.addEntry( [ "Contacts" ], contactsView,
			_T("INTERFACE_TOP_NAV_CONTACTS"));
	view.addEntry( [ "Settings" ], settingsView,
			_T("INTERFACE_TOP_NAV_SETTINGS"));
	view.addEntry( [ "Help", [ "/help/", true ] ], null,
			_T("INTERFACE_TOP_NAV_HELP"));
	view.addEntry( [ "Logout", [ "/auth.rtm?logout", false ] ], null,
			_T("INTERFACE_TOP_NAV_LOGOUT"));
	smartAdd = SmartAdd.getInstance();
	adder = new Adder("addEntry");
	adder.init();
	adder.blit();
	adder.show();
	noteMgr = new NoteManager("notesbox", "notes");
	noteMgr.init();
	shareMgr = new ShareManager("listsharedetails", "shareset");
	shareMgr.init();
	shareMgr.radiogroup.addRadio("xprivate", "shareprivate");
	shareMgr.radiogroup.addRadio("xcontact", "sharecontact");
	publishMgr = new PublishManager("listpublishdetails", "publishset");
	publishMgr.init();
	publishMgr.radiogroup.addRadio("xprivate", "publishprivate");
	publishMgr.radiogroup.addRadio("xcontact", "publishcontact");
	publishMgr.radiogroup.addRadio("xpublic", "publishpublic");
	saveMgr = new SaveManager("listsavedetails", "listsaveset");
	saveMgr.init();
	taskTabs = new Tabs("tasktabs", "grey");
	taskTabs.init();
	taskTabs.addEntry(_T("INTERFACE_TASKS_TASK_DETAILS_TASK_TAB"));
	taskTabs.addEntry(_T("INTERFACE_TASKS_TASK_DETAILS_NOTES_TAB"));
	tasksView.addState(_T("INTERFACE_TASKS_TASK_DETAILS_TASK_TAB"), [], [],
			taskTabs);
	tasksView.addState(_T("INTERFACE_TASKS_TASK_DETAILS_NOTES_TAB"), [], [],
			taskTabs);
	tasksView.addState(_T("INTERFACE_TASKS_LIST_DETAILS_PUBLISH"), [], [],
			detailstab);
	tasksView.addState(_T("INTERFACE_TASKS_LIST_DETAILS_SHARE"), [], [],
			detailstab);
	tasksView.addState(_T("INTERFACE_TASKS_LIST_DETAILS_LIST"), [], [],
			detailstab);
	tasksView.addState(_T("INTERFACE_TASKS_SAVE_TAB"), [], [], detailstab);
	notificationMgr = new NotificationManager("notification", "addnotification");
	notificationMgr.init();
	configurationMgr = new Configuration();
	configurationMgr.init();
	configurationMgr.setup();
	inviteMgr = new InviteManager("inviteform", "invite_firstname",
			"invite_email", "invite_note", "invite_send");
	servicesMgr = new ServicesManager("services", "servicesmsg", "serviceslist");
	servicesMgr.init();
	control = new Control();
	control.init();
	control.initPrivate();
	infoBox = new Infobox("detailsstatuswrap", "detailsstatustext");
	infoBox.init();
	infoBox.hide();
	helpBox = new Helpbox("onlinehelpwrap", "onlinehelptext");
	helpBox.init();
	helpBox.hide();
	listTabs.setSortParameters(stateMgr.lists, [ "position",
			"name.toLowerCase()" ]);
	SortList.initialize();
	if (rtmRequestedList === null) {
		try {
			var F = window.location.toString().split("#")
		} catch (E) {
		}
		if (F.length > 1) {
			F = F[1];
			switch (F) {
			case "section.overview":
				view.selectView("Overview");
				break;
			case "section.contacts":
				view.selectView("Contacts");
				break;
			case "section.tasks":
				view.selectView("Tasks");
				break;
			case "section.locations":
				view.selectView("Locations");
				break;
			case "section.settings":
				view.selectView("Settings");
				break;
			default:
				rtmShowOverview ? view.selectView("Overview") : view
						.selectView("Tasks");
				break
			}
		} else {
			if (rtmShowOverview) {
				view.selectView("Overview")
			} else {
				view.selectView("Tasks")
			}
		}
	} else {
		stateMgr.setCurrentList(rtmRequestedList);
		stateMgr.setCurrentFilter("(listId:" + rtmRequestedList + ")");
		stateMgr.setCurrentType(TasksView.LIST_TYPE_NORMAL);
		view.selectView("Tasks")
	}
	overviewTabs.selectTab(_T("INTERFACE_OVERVIEW_TODAY"));
	taskTabs.selectDefault(true);
	detailstab.selectDefault(true);
	legend = new Legend("keywrap", "keyclose");
	legend.init();
	legend.hide();
	map_legend = new Legend("loc_key", "loc_key_close", true);
	map_legend.init();
	map_legend.hide();
	overviewnews = new OverviewNews("overviewnews", "newsclose",
			"overviewnews_text", "overviewnews_date");
	overviewnews.init();
	overviewnews.hide();
	whatsNew = new WhatsNew("whatsnew_table");
	whatsNew.addRow("shared_tasks", _T("INTERFACE_SHARED_TASKS"), "Inbox");
	whatsNew.addRow("emailed_tasks", _T("INTERFACE_EMAILED_TASKS"), "Inbox");
	whatsNew.addRow("shared_lists", _T("INTERFACE_SHARED_LISTS"), "Lists");
	tagMgr = new TagManager();
	taskCloud = new TaskCloud("taskcloudcontent", "taskcloudcontent_copy",
			"taskcloud_copy");
	searchMgr = new SearchManager("search_begin", "search_cancel");
	searchMgr.init();
	var B = this;
	var A = function() {
		B.reload()
	};
	messageBus.broadcast(this, "rtm.initFinished");
	window.onresize = view.adjustWidths;
	window.onresize();
	if (rtmRequestedTask !== null) {
		var D = function(H, I) {
			if (is(taskList.getViewList().map[rtmRequestedTask])) {
				taskList.getViewList().selectOne(rtmRequestedTask, true)
			}
		};
		messageBus.subscribeOnce(D, taskList.getUniqueMessageBusName()
				+ "loadFinished")
	}
	if (is_ie6) {
		try {
			document.execCommand("BackgroundImageCache", false, true)
		} catch (E) {
		}
	}
};
RememberTheMilk.prototype.reload = function() {
	transMgr.request("rtm.preload", utility.encodeJavaScript( {
		"restart" : false,
		"list_id" : rtmRequestedList
	}))
};
function rtmLoad() {
	if (arguments.callee.done) {
		return
	}
	arguments.callee.done = true;
	if (rtm === null) {
		rtm = new RememberTheMilk();
		rtm.init();
		Load()
	}
}
// Build 27 -- Generated Wed Mar 10 03:25:02 2010 UTC
