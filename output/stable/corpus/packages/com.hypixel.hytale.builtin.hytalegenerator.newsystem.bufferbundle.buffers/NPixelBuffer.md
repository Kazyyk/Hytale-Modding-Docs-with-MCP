# NPixelBuffer

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.newsystem.bufferbundle.buffers | Extends: NBuffer

public abstract class NPixelBuffer<T> extends NBuffer

A buffer used in the world generation pipeline for storing voxel or pixel data.

## Constants

- public static final int BUFFER_SIZE_BITS
- @Nonnull public static final Vector3i SIZE

## Methods

- @Nullable public T getPixelContent(@Nonnull Vector3i var1)
- public abstract void setPixelContent(@Nonnull Vector3i var1, @Nullable T var2)
- @Nonnull public Class<T> getPixelType()
