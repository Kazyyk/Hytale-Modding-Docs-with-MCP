# BoolArg

Type: class | Package: com.hypixel.hytale.server.core.asset.type.buildertool.config.args | Extends: ToolArg<Boolean>

public class BoolArg extends ToolArg<Boolean>

Extends `ToolArg` to provide BoolArg functionality.

## Methods

- public BoolArg()
- public BoolArg(boolean value)
- @Nonnull @Override public Codec<Boolean> getCodec()
- @Nonnull public Boolean fromString(@Nonnull String str)
- @Nonnull public BuilderToolBoolArg toBoolArgPacket()
- @Override protected void setupPacket(@Nonnull BuilderToolArg packet)
- @Nonnull @Override public String toString()

Also in this package: BlockArg, BrushAxisArg, BrushOriginArg, BrushRotationArg, BrushShapeArg, FloatArg, IntArg, MaskArg, OptionArg, StringArg, ToolArg, ToolArgException

Complete API:
  public Codec<Boolean> getCodec()
  public Boolean fromString(String str)
  public BuilderToolBoolArg toBoolArgPacket()
  protected void setupPacket(BuilderToolArg packet)
  public String toString()

Fields:
public static final BuilderCodec<BoolArg> CODEC
