
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


public final class DemoType1 extends AbstractBean {
    public DemoType1(JsonObject _buf) { 
        x1 = _buf.get("x1").getAsInt();
    }

    public static DemoType1 deserialize(JsonObject _buf) {
            return new cfg.test.DemoType1(_buf);
    }

    public final int x1;

    public static final int __ID__ = -367048296;
    
    @Override
    public int getTypeId() { return __ID__; }

    @Override
    public String toString() {
        return "{ "
        + "x1:" + x1 + ","
        + "}";
    }
}

