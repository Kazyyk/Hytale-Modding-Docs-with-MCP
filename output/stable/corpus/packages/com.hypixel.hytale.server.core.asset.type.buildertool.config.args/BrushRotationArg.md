# BrushRotationArg

Type: class | Package: com.hypixel.hytale.server.core.asset.type.buildertool.config.args | Extends: ToolArg<Rotation>

public class BrushRotationArg extends ToolArg<Rotation>

Extends `ToolArg` to provide BrushRotationArg functionality.

## Constants

- public static final Codec<Rotation> ROTATION_CODEC

## Methods

- public BrushRotationArg()
- public BrushRotationArg(Rotation value)
- @Nonnull @Override public Codec<Rotation> getCodec()
- @Nonnull public Rotation fromString(@Nonnull String str)
- @Nonnull public BuilderToolRotationArg toRotationArgPacket()
- @Override protected void setupPacket(@Nonnull BuilderToolArg packet)
- @Nonnull @Override public String toString()
