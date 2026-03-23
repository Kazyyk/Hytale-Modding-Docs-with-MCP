# CameraAxis

Type: class | Package: com.hypixel.hytale.server.core.asset.type.model.config.camera | Implements: NetworkSerializable

public class CameraAxis implements NetworkSerializable

## Fields

- public static final BuilderCodec<CameraAxis> CODEC
- public static final CameraAxis STATIC_HEAD
- protected Rangef angleRange
- protected CameraNode[] targetNodes

## Methods

- @Nonnull public com.hypixel.hytale.protocol.CameraAxis toPacket()
- public Rangef getAngleRange()
- public CameraNode[] getTargetNodes()
- @Nonnull @Override public String toString()

Also in this package: CameraSettings

Complete API:
  public com.hypixel.hytale.protocol.CameraAxis toPacket()
  public Rangef getAngleRange()
  public CameraNode[] getTargetNodes()
  public String toString()

Fields:
public static final BuilderCodec<CameraAxis> CODEC
public static final CameraAxis STATIC_HEAD
protected Rangef angleRange
protected CameraNode[] targetNodes
