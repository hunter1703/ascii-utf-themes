/* Copyright 2016 Sven van der Meer <vdmeer.sven@mykolab.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.vandermeer.asciithemes.a7.dropcaps;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.text.StrBuilder;

import de.vandermeer.asciithemes.TA_DropCaps;

/**
 * DropCap library based on Figlet font "`oldbanner`", 6 line characters.
 * See http://www.jave.de/figlet/fonts/details/oldbanner.html
 *
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170404 (04-Apr-17) for Java 1.8
 * @since      v0.1.0
 */
public class FigletOldBanner_7L implements TA_DropCaps {

	/** Local mapping of characters to drop caps. */
	Map<Character, String[]> map = new HashMap<Character, String[]>(){
		private static final long serialVersionUID = 1L;{
			put('A', new String[]{
					"   #   ",
					"  # #  ",
					" #   # ",
					"#     #",
					"#######",
					"#     #",
					"#     #" 
			});

			put('B', new String[]{
					"###### ",
					"#     #",
					"#     #",
					"###### ",
					"#     #",
					"#     #",
					"###### " 
			});

			put('C', new String[]{
					" ##### ",
					"#     #",
					"#      ",
					"#      ",
					"#      ",
					"#     #",
					" ##### " 
			});

			put('D', new String[]{
					"###### ",
					"#     #",
					"#     #",
					"#     #",
					"#     #",
					"#     #",
					"###### " 
			});

			put('E', new String[]{
					"#######",
					"#      ",
					"#      ",
					"#####  ",
					"#      ",
					"#      ",
					"#######" 
			});

			put('F', new String[]{
					"#######",
					"#      ",
					"#      ",
					"#####  ",
					"#      ",
					"#      ",
					"#      " 
			});

			put('G', new String[]{
					" ##### ",
					"#     #",
					"#      ",
					"#  ####",
					"#     #",
					"#     #",
					" ##### " 
			});

			put('H', new String[]{
					"#     #",
					"#     #",
					"#     #",
					"#######",
					"#     #",
					"#     #",
					"#     #" 
			});

			put('I', new String[]{
					"###",
					" # ",
					" # ",
					" # ",
					" # ",
					" # ",
					"###" 
			});

			put('J', new String[]{
					"      #",
					"      #",
					"      #",
					"      #",
					"#     #",
					"#     #",
					" ##### " 
			});

			put('K', new String[]{
					"#    #",
					"#   # ",
					"#  #  ",
					"###   ",
					"#  #  ",
					"#   # ",
					"#    #" 
			});

			put('L', new String[]{
					"#      ",
					"#      ",
					"#      ",
					"#      ",
					"#      ",
					"#      ",
					"#######" 
			});

			put('M', new String[]{
					"#     #",
					"##   ##",
					"# # # #",
					"#  #  #",
					"#     #",
					"#     #",
					"#     #" 
			});

			put('N', new String[]{
					"#     #",
					"##    #",
					"# #   #",
					"#  #  #",
					"#   # #",
					"#    ##",
					"#     #" 
			});

			put('O', new String[]{
					" ##### ",
					"#     #",
					"#     #",
					"#     #",
					"#     #",
					"#     #",
					" ##### "
			});

			put('P', new String[]{
					"###### ",
					"#     #",
					"#     #",
					"###### ",
					"#      ",
					"#      ",
					"#      " 
			});

			put('Q', new String[]{
					" ##### ",
					"#     #",
					"#     #",
					"#     #",
					"#   # #",
					"#    # ",
					" #### #" 
			});

			put('R', new String[]{
					"###### ",
					"#     #",
					"#     #",
					"###### ",
					"#   #  ",
					"#    # ",
					"#     #" 
			});

			put('S', new String[]{
					" ##### ",
					"#     #",
					"#      ",
					" ##### ",
					"      #",
					"#     #",
					" ##### " 
			});

			put('T', new String[]{
					"#######",
					"   #   ",
					"   #   ",
					"   #   ",
					"   #   ",
					"   #   ",
					"   #   " 
			});

			put('U', new String[]{
					"#     #",
					"#     #",
					"#     #",
					"#     #",
					"#     #",
					"#     #",
					" ##### " 
			});

			put('V', new String[]{
					"#     #",
					"#     #",
					"#     #",
					"#     #",
					" #   # ",
					"  # #  ",
					"   #   " 
			});

			put('W', new String[]{
					"#     #",
					"#  #  #",
					"#  #  #",
					"#  #  #",
					"#  #  #",
					"#  #  #",
					" ## ## " 
			});

			put('X', new String[]{
					"#     #",
					" #   # ",
					"  # #  ",
					"   #   ",
					"  # #  ",
					" #   # ",
					"#     #" 
			});

			put('Y', new String[]{
					"#     #",
					" #   # ",
					"  # #  ",
					"   #   ",
					"   #   ",
					"   #   ",
					"   #   " 
			});

			put('Z', new String[]{
					"#######",
					"     # ",
					"    #  ",
					"   #   ",
					"  #    ",
					" #     ",
					"#######" 
			});

		}
	};

	@Override
	public String[] getDropCap(char letter) {
		return this.map.get(Character.toUpperCase(letter));
	}

	@Override
	public StrBuilder toDoc() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescription() {
		return "DropCap library based on Figlet font 'oldbanner', 6 line characters - see http://www.jave.de/figlet/fonts/details/oldbanner.html";
	}
}
