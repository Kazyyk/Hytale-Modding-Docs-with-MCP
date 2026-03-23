# FloatArg

Type: class | Package: com.hypixel.hytale.server.core.asset.type.buildertool.config.args | Extends: ToolArg<Float>

public class FloatArg extends ToolArg<Float>

Extends `ToolArg` to provide FloatArg functionality.

## Fields

- protected float min
- protected float max

## Methods

- public FloatArg()
- public FloatArg(float value, float min, float max)
- public float getMin()
- public float getMax()
- @Nonnull @Override public Codec<Float> getCodec()
- @Nonnull public Float fromString(@Nonnull String str)
- @Nonnull public BuilderToolFloatArg toFloatArgPacket()
- @Override protected void setupPacket(@Nonnull BuilderToolArg packet)
- @Nonnull @Override public String toString()
