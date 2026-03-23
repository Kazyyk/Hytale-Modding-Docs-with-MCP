# EqualsTagOp

Type: class | Package: com.hypixel.hytale.server.core.asset.type.tagpattern.config | Extends: TagPattern

public class EqualsTagOp extends TagPattern

Concrete implementation extending `TagPattern`.

## Fields

- tag | String | String field.
- tagIndex | int | int field.

## Constructors

- EqualsTagOp(String tag) | Creates a new EqualsTagOp instance.
- EqualsTagOp() | Creates a new EqualsTagOp instance.

## Methods

- test(@Nonnull Int2ObjectMap<IntSet> tags) | boolean | public method.
- toPacket() | com.hypixel.hytale.protocol.TagPattern | public method.
- toString() | String | public method.

Also in this package: AndPatternOp, MultiplePatternOp, NotPatternOp, OrPatternOp, TagPattern

Complete API:
  public boolean test(Int2ObjectMap<IntSet> tags)
  public com.hypixel.hytale.protocol.TagPattern toPacket()
  public String toString()

Fields:
public static BuilderCodec<EqualsTagOp> CODEC
protected String tag
protected int tagIndex
