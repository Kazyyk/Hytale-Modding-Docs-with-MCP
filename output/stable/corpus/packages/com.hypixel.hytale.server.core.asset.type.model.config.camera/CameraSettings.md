# CameraSettings

Type: class | Package: com.hypixel.hytale.server.core.asset.type.model.config.camera | Implements: NetworkSerializable

public class CameraSettings implements NetworkSerializable

## Fields

- public static final BuilderCodec<CameraSettings> CODEC
- protected Vector3f positionOffset
- protected CameraAxis yaw
- protected CameraAxis pitch

## Methods

- @Nonnull public com.hypixel.hytale.protocol.CameraSettings toPacket()
- public Vector3f getPositionOffset()
- public CameraAxis getYaw()
- public CameraAxis getPitch()
- public CameraSettings scale(float scale)
- @Nonnull @Override public String toString()
- public CameraSettings clone()

Also in this package: CameraAxis

Complete API:
  public com.hypixel.hytale.protocol.CameraSettings toPacket()
  public Vector3f getPositionOffset()
  public CameraAxis getYaw()
  public CameraAxis getPitch()
  public CameraSettings scale(float scale)
  public String toString()
  public CameraSettings clone()

Fields:
public static final BuilderCodec<CameraSettings> CODEC
protected Vector3f positionOffset
protected CameraAxis yaw
protected CameraAxis pitch
