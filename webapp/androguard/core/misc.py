# This file is part of Androguard.
#
# Copyright (C) 2010, Anthony Desnos <desnos at t0t0.org>
# All rights reserved.
#
# Androguard is free software: you can redistribute it and/or modify
# it under the terms of the GNU Lesser General Public License as published by
# the Free Software Foundation, either version 3 of the License, or
# (at your option) any later version.
#
# Androguard is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU Lesser General Public License for more details.
#
# You should have received a copy of the GNU Lesser General Public License
# along with Androguard.  If not, see <http://www.gnu.org/licenses/>.

import types, random, string

ANDROGUARD_VERSION = "b0"

ANDROAXML_VERSION = "0.1"
ANDRODD_VERSION = "0.1"
ANDRODIFF_VERSION = "0.1"
ANDROSIM_VERSION = "0.1"
ANDRODUMP_VERSION = "0.1"
ANDROLYZE_VERSION = "0.2"
ANDROMARKS_VERSION = "0.1"
ANDROXGMML_VERSION = "0.1"




class Color:
    normal = "\033[0m"
    black = "\033[30m"
    red = "\033[31m"
    green = "\033[32m"
    yellow = "\033[33m"
    blue = "\033[34m"
    purple = "\033[35m"
    cyan = "\033[36m"
    grey = "\033[37m"
    bold = "\033[1m"
    uline = "\033[4m"
    blink = "\033[5m"
    invert = "\033[7m"

def long2int( l ) :
    if l > 0x7fffffff :
        l = (0x7fffffff & l) - 0x80000000
    return l

def long2str(l):
    """Convert an integer to a string."""
    if type(l) not in (types.IntType, types.LongType):
        raise ValueError, 'the input must be an integer'

    if l < 0:
        raise ValueError, 'the input must be greater than 0'
    s = ''
    while l:
        s = s + chr(l & 255L)
        l >>= 8

    return s

def str2long(s):
    """Convert a string to a long integer."""
    if type(s) not in (types.StringType, types.UnicodeType):
        raise ValueError, 'the input must be a string'

    l = 0L
    for i in s:
        l <<= 8
        l |= ord(i)

    return l

def random_string() :
    return random.choice( string.letters ) + ''.join([ random.choice(string.letters + string.digits) for i in range(10 - 1) ] )

def is_android(real_filename) :
    fd = open( real_filename, "r")
    val = None

    f_bytes = fd.read(3)

    if f_bytes[0:2] == "PK" :
        val = "APK"
    elif f_bytes[0:3] == "dex" :
        val = "DEX"

    fd.close()
    return val
