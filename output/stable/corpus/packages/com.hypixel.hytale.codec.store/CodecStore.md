# CodecStore

Type: class | Package: com.hypixel.hytale.codec.store

public class CodecStore

## Fields

- public static final CodecStore STATIC
- private final CodecStore parent
- private final Map<CodecKey<?>,Codec<?>> codecs
- private final Map<CodecKey<?>,Supplier<Codec<?>>> codecSuppliers

## Methods

- @Nullable public Codec<T> getCodec(CodecKey<T> key)
- public void putCodec(CodecKey<T> key, Codec<T> codec)
- public Codec<?> removeCodec(CodecKey<T> key)
- public void putCodecSupplier(CodecKey<T> key, Supplier<Codec<T>> supplier)
- public Supplier<Codec<?>> removeCodecSupplier(CodecKey<T> key)

Also in this package: CodecKey, StoredCodec

Complete API:
  public Codec<T> getCodec(CodecKey<T> key)
  public void putCodec(CodecKey<T> key, Codec<T> codec)
  public Codec<?> removeCodec(CodecKey<T> key)
  public void putCodecSupplier(CodecKey<T> key, Supplier<Codec<T>> supplier)
  public Supplier<Codec<?>> removeCodecSupplier(CodecKey<T> key)

Fields:
public static final CodecStore STATIC
private final CodecStore parent
private final Map<CodecKey<?>,Codec<?>> codecs
private final Map<CodecKey<?>,Supplier<Codec<?>>> codecSuppliers
