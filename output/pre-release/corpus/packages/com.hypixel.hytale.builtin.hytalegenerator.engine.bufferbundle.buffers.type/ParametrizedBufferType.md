# ParametrizedBufferType

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers.type | Extends: BufferType

public class ParametrizedBufferType extends BufferType

A BufferType that additionally specifies a type parameter class (e.g., `Material.class` for a `VoxelBuffer<Material>`). Used to distinguish buffer types that share the same buffer class but differ in their generic parameter. Equality includes the parameter class in addition to the base BufferType fields.

## Fields

- @Nonnull public final Class parameterClass

## Constructors

- public ParametrizedBufferType(@Nonnull String name, int index, @Nonnull Class bufferClass, @Nonnull Class parameterClass, @Nonnull Supplier<Buffer> bufferSupplier)

## Methods

- public boolean isValidType(@Nonnull Class bufferClass, @Nonnull Class parameterClass)
- @Override public boolean isValid(@Nonnull Buffer buffer)
- @Override public boolean equals(Object o)
- @Override public int hashCode()
