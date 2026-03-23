# MultiplePatternOp

Type: class | Package: com.hypixel.hytale.server.core.asset.type.tagpattern.config | Extends: TagPattern

public abstract class MultiplePatternOp extends TagPattern

Abstract base class extending `TagPattern`.

## Fields

- patterns | TagPattern[] | TagPattern[] field.

## Methods

- toPacket() | com.hypixel.hytale.protocol.TagPattern | public method.
- toString() | String | public method.

Known subclasses: AndPatternOp, OrPatternOp

Also in this package: AndPatternOp, EqualsTagOp, NotPatternOp, OrPatternOp, TagPattern

Complete API:
  public com.hypixel.hytale.protocol.TagPattern toPacket()
  public String toString()

Fields:
public static BuilderCodec<MultiplePatternOp> CODEC
protected TagPattern[] patterns
