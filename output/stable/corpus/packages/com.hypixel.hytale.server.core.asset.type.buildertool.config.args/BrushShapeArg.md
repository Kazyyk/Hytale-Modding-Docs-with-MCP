# BrushShapeArg

Type: class | Package: com.hypixel.hytale.server.core.asset.type.buildertool.config.args | Extends: ToolArg<BrushShape>

public class BrushShapeArg extends ToolArg<BrushShape>

Extends `ToolArg` to provide BrushShapeArg functionality.

## Constants

- public static final EnumCodec<BrushShape> BRUSH_SHAPE_CODEC

## Methods

- public BrushShapeArg()
- public BrushShapeArg(BrushShape value)
- @Nonnull @Override public Codec<BrushShape> getCodec()
- @Nonnull public BrushShape fromString(@Nonnull String str)
- @Nonnull public BuilderToolBrushShapeArg toBrushShapeArgPacket()
- @Override protected void setupPacket(@Nonnull BuilderToolArg packet)
- @Nonnull @Override public String toString()

Also in this package: BlockArg, BoolArg, BrushAxisArg, BrushOriginArg, BrushRotationArg, FloatArg, IntArg, MaskArg, OptionArg, StringArg, ToolArg, ToolArgException

Complete API:
  public Codec<BrushShape> getCodec()
  public BrushShape fromString(String str)
  public BuilderToolBrushShapeArg toBrushShapeArgPacket()
  protected void setupPacket(BuilderToolArg packet)
  public String toString()

Fields:
public static final EnumCodec<BrushShape> BRUSH_SHAPE_CODEC
public static final BuilderCodec<BrushShapeArg> CODEC
