DESCRIPTION = "The Motion Library from Invensense processes gyroscopes and accelerometers to \
provide a physical model of the movement of the sensors."
SECTION = "libs/sensors"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://mlsdk/mllite/accel.c;beginline=1;endline=17;md5=cb1d663be39a4b22223d74eb1c58227f"

SRCREV = "33ce91b37062fa63af192f5643de93f3beebe854"
PV = "4.2+gitr${SRCPV}"

SRC_URI = " \
  git://android.googlesource.com/platform/hardware/invensense;branch=master;protocol=https \
  file://0001-Implement-cmake-based-build-script-for-builds-outsid.patch"
S = "${WORKDIR}/git"

inherit cmake
