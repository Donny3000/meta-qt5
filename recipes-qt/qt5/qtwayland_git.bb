require qt5-git.inc
require ${PN}.inc

# qtwayland wasn't released yet, last tag before this SRCREV is 5.0.0-beta1
# qt5-git PV is only to indicate that this recipe is compatible with qt5 5.2.1

SRCREV = "e7a1e121d9cb92e89e53baba81aceedca24f2b94"

SRC_URI += " \
    file://0001-examples.pro-include-server-buffer-only-when-buildin.patch \
"
