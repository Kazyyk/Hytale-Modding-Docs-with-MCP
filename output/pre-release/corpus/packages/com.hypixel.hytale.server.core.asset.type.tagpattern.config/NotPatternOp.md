# NotPatternOp

Type: class | Package: com.hypixel.hytale.server.core.asset.type.tagpattern.config | Extends: TagPattern

public class NotPatternOp extends TagPattern

Concrete implementation extending `TagPattern`.

## Fields

- pattern | TagPattern | TagPattern field.

## Methods

- test(Int2ObjectMap<IntSet> tags) | boolean | public method.
- toPacket() | com.hypixel.hytale.protocol.TagPattern | public method.
- toString() | String | public method.

Also in this package: AndPatternOp, EqualsTagOp, MultiplePatternOp, OrPatternOp, TagPattern

Complete API:
  public boolean test(Int2ObjectMap<IntSet> tags)
  public com.hypixel.hytale.protocol.TagPattern toPacket()
  public String toString()

Fields:
public static BuilderCodec<NotPatternOp> CODEC
protected TagPattern pattern
