DESCRIPTION = "This project is a try to write real tiny and fast XMPP/Jabber \
    client for handheld devices, supported by Enlightment Foundation Library.\
    It use Elementary widget toolkit and Iksemel library to make it possible."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"
DEPENDS = "edje-native elementary iksemel gnutls eet evas ecore eina"
HOMEPAGE = "http://jefliks.sourceforge.net/"
AUTHOR = "Phoenix Kayo <kayo.k11.4@gmail.com>"
PV = "0.0.2b+gitr${SRCPV}"
PR = "r1"

inherit autotools pkgconfig

SRCREV = "c4d035f4696bf8a233a54c74dd148173fdef43c2"

SRC_URI = "git://jefliks.git.sourceforge.net/gitroot/jefliks/jefliks;protocol=git;branch=master \
  file://0001-adapt-to-EFL-api-changes-_label_set-to-elm_object_te.patch \
  file://0002-adapt-to-EFL-api-changes-genlist.patch \
  file://0003-adapt-to-EFL-api-changes-homogenous-homogeneous.patch \
  file://0004-adapt-to-EFL-api-changes-content_set.patch \
  file://0005-Makefile-fix-eina-name-and-add-gnutls-to-dynlibs-oth.patch \
  file://0006-adapt-to-EFL-api-changes-s-elm_hoversel_item_del-elm.patch \
  file://0007-ui_roster-drop-unused-_item_grp_sel.patch \
  file://0008-ui_roster-drop-unused-item_res_upd.patch \
  file://0009-ui_roster-fix-warning-about-base64_decode-param.patch \
  file://0010-ui_roster-change-genlist_item_class-prototypes-to-ma.patch \
"
#  this one is for EFL r67596 and newer
#  file://0011-adapt-to-EFL-api-changes-s-elm_genlist_item_data_get.patch 
S = "${WORKDIR}/git"
