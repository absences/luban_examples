
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

package cfg.ai;

import luban.*;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;


public final class Selector extends cfg.ai.ComposeNode {
    public Selector(JsonObject _buf) { 
        super(_buf);
        { com.google.gson.JsonArray _json0_ = _buf.get("children").getAsJsonArray(); children = new java.util.ArrayList<cfg.ai.FlowNode>(_json0_.size()); for(JsonElement _e0 : _json0_) { cfg.ai.FlowNode _v0;  _v0 = cfg.ai.FlowNode.deserialize(_e0.getAsJsonObject());  children.add(_v0); }   }
    }

    public static Selector deserialize(JsonObject _buf) {
            return new cfg.ai.Selector(_buf);
    }

    public final java.util.ArrayList<cfg.ai.FlowNode> children;

    public static final int __ID__ = -1946981627;
    
    @Override
    public int getTypeId() { return __ID__; }

    @Override
    public String toString() {
        return "{ "
        + "id:" + id + ","
        + "nodeName:" + nodeName + ","
        + "decorators:" + decorators + ","
        + "services:" + services + ","
        + "children:" + children + ","
        + "}";
    }
}

