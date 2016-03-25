require recipes-kernel/linux/linux.inc
require recipes-kernel/linux/linux-dtb.inc

KERNEL_RELEASE = "4.4"
PV = "${KERNEL_RELEASE}+gitr${SRCPV}"
PE = "5"
# for bumping PR bump MACHINE_KERNEL_PR in the machine config
inherit machine_kernel_pr

SRCREV = "c8d2206e45b86ce9a5151b207f51b3b36e0518c9"

SRC_URI = "\
  git://github.com/shr-distribution/linux.git;protocol=git;branch=om-gta04/4.4/master;name=kernel \
  file://defconfig \
"
S = "${WORKDIR}/git"

#do_configure_append() {
#  kernel_conf_variable_fixup() {
#      sed -i "/CONFIG_$1[ =]/d" ${B}/.config
#      kernel_conf_variable $1 $2 ${B}/.config
#  }
#
#  # fixup some options which get changes from Y to M in oldconfig :/
#  kernel_conf_variable_fixup TWL4030_USB y
#  kernel_conf_variable_fixup USB_MUSB_OMAP2PLUS y
#  kernel_conf_variable_fixup USB_OMAP y
#  kernel_conf_variable_fixup USB_GADGET_MUSB_HDRC y
#}

# CMDLINE_om-gta04 = "console=ttyO2,115200n8 mpurate=800 vram=12M omapfb.rotate_type=0 omapdss.def_disp=lcd rootfstype=ext4,ext3,btrfs,ubifs,jffs2 rootwait twl4030_charger.allow_usb=1 twl4030_charger.charge_backup=1 musb_hdrc.preserve_vbus=1 log_buf_len=8M omapfb.vram=1:1200k,2:1200k omapfb.vrfb=y"
CMDLINE_om-gta04 = "console=ttyO2,115200n8 vram=12M omapfb.vram=0:8M,1:4M omapfb.rotate_type=0 omapdss.def_disp=lcd rootwait twl4030_charger.allow_usb=1 musb_hdrc.preserve_vbus=1 log_buf_len=8M ignore_loglevel earlyprintk"

CMDLINE_DEBUG = "debug"

# needed for make uImage
KERNEL_EXTRA_ARGS = "LOADADDR=${UBOOT_LOADADDRESS}"

# Mark archs/machines that this kernel supports
COMPATIBLE_MACHINE = "om-gta04"

DEFAULT_PREFERENCE = "-2"
DEFAULT_PREFERENCE_om-gta04 = "1"
