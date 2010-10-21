/*
 *
 *     Copyright (C) 2010  David Fernandes
 *
 *                         Rua da Quinta Amarela, 60
 *                         4475-663 MAIA
 *                         PORTUGAL
 *
 *                         <daugfernandes@aim.com>
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package s7latex;

import java.util.List;
import java.util.ArrayList;


/*

    s7latex::cPackage.java

 */
public class cPackage extends cObject {

      private List<cModule> _modules;
      private List<cOption> _options;

      public void cPackage() {
          _modules = new ArrayList<cModule>();
          _options = new ArrayList<cOption>();
          setIsContainer(false);
      }

      public void cPackage(cOption p_afirstoption) {
          _modules = new ArrayList<cModule>();
          _options = new ArrayList<cOption>();
          _options.add(p_afirstoption);
          setIsContainer(false);
      }

      public void cPackage(cModule p_afirstmodule) {
          _modules = new ArrayList<cModule>();
          _modules.add(p_afirstmodule);
          _options = new ArrayList<cOption>();
          setIsContainer(false);
      }

      public List<cModule> getModules() {
          return _modules;
      }

      public void setModules(List<cModule> value) {
          _modules = value;
      }

      public List<cOption> getOptions() {
          return _options;
      }

      public void setOptions(List<cOption> value) {
          _options = value;
      }

      public void addModule(cModule value) {
          _modules.add(value);
      }

      public void addOption(cOption value) {
          _options.add(value);
      }


    @Override public String toString() {
        return "";
    }

    @Override public String getTEX(String ident) {

        String s = ident + "\\usepackage";

        if(_options.size() > 0) {
            s += "[";

            boolean first = true;

            for(cOption o : _options) {
                if(!first) s += ",";
                s += o.getTEX("");
                first = false;
            }

            s += "]";
        }

        if(_modules.size() > 0) {
            s += "{";

            boolean first = true;

            for(cModule m : _modules) {
                if(!first) s += ",";
                s += m.getTEX("");
                first = false;
            }

            s += "}";
        }

        return s;
    }

    @Override public cObject getObjectByKey(String p_key) {
        if(getKey().equals(p_key))
            return this;
        else
            return null;
    }
}
