
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

package cfg.test;

import luban.*;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;


public final class TestMap extends AbstractBean {
    public TestMap(JsonObject _buf) { 
        id = _buf.get("id").getAsInt();
        { com.google.gson.JsonArray _json0_ = _buf.get("x1").getAsJsonArray(); x1 = new java.util.HashMap<Integer, Integer>(_json0_.size()); for(JsonElement _e0 : _json0_) { int _k0;  _k0 = _e0.getAsJsonArray().get(0).getAsInt(); int _v0;  _v0 = _e0.getAsJsonArray().get(1).getAsInt();  x1.put(_k0, _v0); }   }
        { com.google.gson.JsonArray _json0_ = _buf.get("x2").getAsJsonArray(); x2 = new java.util.HashMap<Long, Integer>(_json0_.size()); for(JsonElement _e0 : _json0_) { long _k0;  _k0 = _e0.getAsJsonArray().get(0).getAsLong(); int _v0;  _v0 = _e0.getAsJsonArray().get(1).getAsInt();  x2.put(_k0, _v0); }   }
        { com.google.gson.JsonArray _json0_ = _buf.get("x3").getAsJsonArray(); x3 = new java.util.HashMap<String, Integer>(_json0_.size()); for(JsonElement _e0 : _json0_) { String _k0;  _k0 = _e0.getAsJsonArray().get(0).getAsString(); int _v0;  _v0 = _e0.getAsJsonArray().get(1).getAsInt();  x3.put(_k0, _v0); }   }
        { com.google.gson.JsonArray _json0_ = _buf.get("x4").getAsJsonArray(); x4 = new java.util.HashMap<Integer, Integer>(_json0_.size()); for(JsonElement _e0 : _json0_) { int _k0;  _k0 = _e0.getAsJsonArray().get(0).getAsInt(); int _v0;  _v0 = _e0.getAsJsonArray().get(1).getAsInt();  x4.put(_k0, _v0); }   }
    }

    public static TestMap deserialize(JsonObject _buf) {
            return new cfg.test.TestMap(_buf);
    }

    public final int id;
    public final java.util.HashMap<Integer, Integer> x1;
    public final java.util.HashMap<Long, Integer> x2;
    public final java.util.HashMap<String, Integer> x3;
    public final java.util.HashMap<Integer, Integer> x4;

    public static final int __ID__ = -543227410;
    
    @Override
    public int getTypeId() { return __ID__; }

    @Override
    public String toString() {
        return "{ "
        + "id:" + id + ","
        + "x1:" + x1 + ","
        + "x2:" + x2 + ","
        + "x3:" + x3 + ","
        + "x4:" + x4 + ","
        + "}";
    }
}

