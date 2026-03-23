# BrushOriginArg

Type: class | Package: com.hypixel.hytale.server.core.asset.type.buildertool.config.args | Extends: ToolArg<BrushOrigin>

public class BrushOriginArg extends ToolArg<BrushOrigin>

Extends `ToolArg` to provide BrushOriginArg functionality.

## Constants

- public static final EnumCodec<BrushOrigin> BRUSH_ORIGIN_CODEC

## Methods

- public BrushOriginArg()
- public BrushOriginArg(BrushOrigin value)
- @Nonnull @Override public Codec<BrushOrigin> getCodec()
- @Nonnull public BrushOrigin fromString(@Nonnull String str)
- @Nonnull public BuilderToolBrushOriginArg toBrushOriginArgPacket()
- @Override protected void setupPacket(@Nonnull BuilderToolArg packet)
- @Nonnull @Override public String toString()

Also in this package: BlockArg, BoolArg, BrushAxisArg, BrushRotationArg, BrushShapeArg, FloatArg, IntArg, MaskArg, OptionArg, StringArg, ToolArg, ToolArgException

Complete API:
  public Codec<BrushOrigin> getCodec()
  public BrushOrigin fromString(String str)
  public BuilderToolBrushOriginArg toBrushOriginArgPacket()
  protected void setupPacket(BuilderToolArg packet)
  public String toString()

Fields:
public static final EnumCodec<BrushOrigin> BRUSH_ORIGIN_CODEC
public static final BuilderCodec<BrushOriginArg> CODEC
