
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

package cfg.ai;

import luban.*;


public abstract class KeyQueryOperator extends AbstractBean {
    public KeyQueryOperator(ByteBuf _buf) { 
    }

    public static KeyQueryOperator deserialize(ByteBuf _buf) {
        switch (_buf.readInt()) {
            case cfg.ai.IsSet2.__ID__: return new cfg.ai.IsSet2(_buf);
            case cfg.ai.IsNotSet.__ID__: return new cfg.ai.IsNotSet(_buf);
            case cfg.ai.BinaryOperator.__ID__: return new cfg.ai.BinaryOperator(_buf);
            default: throw new SerializationException();
        }
    }



    @Override
    public String toString() {
        return "{ "
        + "}";
    }
}

