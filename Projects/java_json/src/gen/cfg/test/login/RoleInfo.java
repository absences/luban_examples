
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

package cfg.test.login;

import luban.*;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;


public final class RoleInfo extends cfg.test.DemoD3 {
    public RoleInfo(JsonObject _buf) { 
        super(_buf);
        roleId = _buf.get("role_id").getAsLong();
    }

    public static RoleInfo deserialize(JsonObject _buf) {
            return new cfg.test.login.RoleInfo(_buf);
    }

    public final long roleId;

    public static final int __ID__ = -989153243;
    
    @Override
    public int getTypeId() { return __ID__; }

    @Override
    public String toString() {
        return "{ "
        + "x1:" + x1 + ","
        + "x3:" + x3 + ","
        + "roleId:" + roleId + ","
        + "}";
    }
}

