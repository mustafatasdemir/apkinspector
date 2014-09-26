#!/usr/bin/env python

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

import sys

from optparse import OptionParser

import androguard, misc, diff

option_0 = { 'name' : ('-i', '--input'), 'help' : 'file : use these filenames', 'nargs' : 2 }
option_1 = { 'name' : ('-d', '--display'), 'help' : 'display the file in human readable format', 'action' : 'count' }
option_2 = { 'name' : ('-v', '--version'), 'help' : 'version of the API', 'action' : 'count' }

options = [option_0, option_1, option_2]

def main(options, arguments) :

    if options.input != None :
        a = androguard.Androguard( options.input )
        a.ianalyze()

        vm1 = a.get_bc()[0][1].get_vm()
        vmx1 = a.get_bc()[0][1].get_analysis()

        vm2 = a.get_bc()[1][1].get_vm()
        vmx2 = a.get_bc()[1][1].get_analysis()

        d = diff.Diff( [ vm1, vmx1 ], [ vm2, vmx2 ], diff.FILTERS_DIFF )
        details = False
        if options.display != None :
            details = True

        print "DIFF METHODS :"
        diff_methods = d.get_diff_methods()
        for i in diff_methods :
            for elem in diff_methods[ i ] :
                elem.show( i, details )
                print

        print "NEW METHODS :"
        new_methods = d.get_new_methods()
        for i in new_methods :
            for elem in new_methods[ i ] :
                elem.show2( details )
                print

        print "DELETE METHODS :"
        del_methods = d.get_delete_methods()
        for i in del_methods :
            for elem in del_methods[ i ] :
                elem.show2( details )
                print

    elif options.version != None :
        print "Androdiff version %s" % misc.ANDRODIFF_VERSION

if __name__ == "__main__" :
    parser = OptionParser()
    for option in options :
        param = option['name']
        del option['name']
        parser.add_option(*param, **option)

    options, arguments = parser.parse_args()
    sys.argv[:] = arguments
    main(options, arguments)
