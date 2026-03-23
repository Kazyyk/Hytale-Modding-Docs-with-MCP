# PixelBuffer

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers | Extends: Buffer

public abstract class PixelBuffer<T> extends Buffer

Abstract Buffer for 2D pixel data on an 8x1x8 grid (single Y-layer). Used to store per-column data such as biome IDs and tint values. Subclasses include SimplePixelBuffer and CountedPixelBuffer.

## Fields

- public static final int BUFFER_SIZE_BITS
- @Nonnull public static final Vector3i SIZE

## Methods

- @Nullable public abstract T getPixelContent(@Nonnull Vector3i var1)
- public abstract void setPixelContent(@Nonnull Vector3i var1, @Nullable T var2)
- @Nonnull public abstract Class<T> getPixelType()
