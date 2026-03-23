# SetServerCamera

Type: class | Package: com.hypixel.hytale.protocol.packets.camera | Implements: Packet, ToClientPacket

public class SetServerCamera implements Packet, ToClientPacket

Implementation of `Packet, ToClientPacket`.

## Fields

- PACKET_ID | int | Static final int field.
- IS_COMPRESSED | boolean | Static final boolean field.
- NULLABLE_BIT_FIELD_SIZE | int | Static final int field.
- FIXED_BLOCK_SIZE | int | Static final int field.
- VARIABLE_FIELD_COUNT | int | Static final int field.
- VARIABLE_BLOCK_START | int | Static final int field.
- MAX_SIZE | int | Static final int field.
- clientCameraView | ClientCameraView | ClientCameraView field.
- isLocked | boolean | boolean field.
- cameraSettings | ServerCameraSettings | ServerCameraSettings field.

## Constructors

- SetServerCamera() | Creates a new SetServerCamera instance.
- SetServerCamera(@Nonnull ClientCameraView clientCameraView, boolean isLocked, @Nullable ServerCameraSettings cameraSettings) | Creates a new SetServerCamera instance.
- SetServerCamera(@Nonnull SetServerCamera other) | Creates a new SetServerCamera instance.

## Methods

- getId() | int | public method.
- getChannel() | NetworkChannel | public method.
- deserialize(@Nonnull ByteBuf buf, int offset) | SetServerCamera | static public method.
- computeBytesConsumed(@Nonnull ByteBuf buf, int offset) | int | static public method.
- serialize(@Nonnull ByteBuf buf) | void | public method.
- computeSize() | int | public method.
- validateStructure(@Nonnull ByteBuf buffer, int offset) | ValidationResult | static public method.
- clone() | SetServerCamera | public method.
- equals(Object obj) | boolean | public method.
- hashCode() | int | public method.

Also in this package: CameraShakeEffect, RequestFlyCameraMode, SetFlyCameraMode

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static SetServerCamera deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public SetServerCamera clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int PACKET_ID
public static final boolean IS_COMPRESSED
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public ClientCameraView clientCameraView
public boolean isLocked
public ServerCameraSettings cameraSettings
