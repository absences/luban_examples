
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


public final class SepBean1 extends AbstractBean {
    public SepBean1(JsonObject _buf) { 
        a = _buf.get("a").getAsInt();
        b = _buf.get("b").getAsInt();
        c = _buf.get("c").getAsString();
    }

    public static SepBean1 deserialize(JsonObject _buf) {
            return new cfg.test.SepBean1(_buf);
    }

    public final int a;
    public final int b;
    public final String c;

    public static final int __ID__ = -1534339393;
    
    @Override
    public int getTypeId() { return __ID__; }

    @Override
    public String toString() {
        return "{ "
        + "a:" + a + ","
        + "b:" + b + ","
        + "c:" + c + ","
        + "}";
    }
}

