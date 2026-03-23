# AssetEditorPreviewCameraSettings

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor

public class AssetEditorPreviewCameraSettings

Camera position and orientation settings for the asset editor 3D preview.

## Fields

- Vector3f cameraPosition
- Vector3f cameraOrientation

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 29
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 29
- MAX_SIZE | 29

Binary layout: 1 null-bit byte + 29 bytes of fixed fields + 0 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorPreviewCameraSettings deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorPreviewCameraSettings` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorPreviewCameraSettings` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorPreviewCameraSettings` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.
