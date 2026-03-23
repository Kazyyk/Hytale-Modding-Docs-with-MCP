# ToolArg

Type: class | Package: com.hypixel.hytale.server.core.asset.type.buildertool.config.args | Implements: NetworkSerializable<BuilderToolArg>

public abstract class ToolArg<T> implements NetworkSerializable<BuilderToolArg>

Abstract base class providing shared logic for ToolArg implementations.

## Constants

- public static final CodecMapCodec<ToolArg> CODEC

## Fields

- protected boolean required
- protected T value

## Methods

- public T getValue()
- public boolean isRequired()
- public abstract Codec<T> getCodec()
- @Nonnull public abstract T fromString(@Nonnull String var1)
- protected abstract void setupPacket(BuilderToolArg var1)
- @Nonnull public BuilderToolArg toPacket()
- @Nonnull @Override public String toString()

Known subclasses: BlockArg, BoolArg, BrushAxisArg, BrushOriginArg, BrushRotationArg, BrushShapeArg, FloatArg, IntArg, MaskArg, OptionArg, StringArg

Also in this package: BlockArg, BoolArg, BrushAxisArg, BrushOriginArg, BrushRotationArg, BrushShapeArg, FloatArg, IntArg, MaskArg, OptionArg, StringArg, ToolArgException

Complete API:
  public T getValue()
  public boolean isRequired()
  public abstract Codec<T> getCodec()
  public abstract T fromString(String var1)
  protected abstract void setupPacket(BuilderToolArg var1)
  public BuilderToolArg toPacket()
  public String toString()

Fields:
public static final CodecMapCodec<ToolArg> CODEC
public static final BuilderCodec<ToolArg> DEFAULT_CODEC
protected boolean required
protected T value
