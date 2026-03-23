# AndPatternOp

Type: class | Package: com.hypixel.hytale.server.core.asset.type.tagpattern.config | Extends: MultiplePatternOp

public class AndPatternOp extends MultiplePatternOp

Concrete implementation extending `MultiplePatternOp`.

## Methods

- test(Int2ObjectMap<IntSet> tags) | boolean | public method.
- toPacket() | com.hypixel.hytale.protocol.TagPattern | public method.
- toString() | String | public method.

Also in this package: EqualsTagOp, MultiplePatternOp, NotPatternOp, OrPatternOp, TagPattern

Complete API:
  public boolean test(Int2ObjectMap<IntSet> tags)
  public com.hypixel.hytale.protocol.TagPattern toPacket()
  public String toString()

Fields:
public static BuilderCodec<AndPatternOp> CODEC
