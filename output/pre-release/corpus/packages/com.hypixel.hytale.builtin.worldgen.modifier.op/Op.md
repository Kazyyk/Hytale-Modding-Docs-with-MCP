# Op

Type: interface | Package: com.hypixel.hytale.builtin.worldgen.modifier.op

public interface Op

Interface for world-gen modification operations. Implementations apply changes to ModifyEvent entry lists.

Known implementors: AddOp, RemoveOp

Also in this package: AddOp, RemoveOp

Complete API:
  void apply(ModifyEvent<T> var1)

Fields:
Op[] EMPTY_ARRAY
String TYPE_KEY
CodecMapCodec<Op> TYPE_CODEC
ArrayCodec<Op> ARRAY_CODEC
