# CameraShakeEffect

Type: class | Package: com.hypixel.hytale.builtin.adventure.camera.asset.cameraeffect | Extends: CameraEffect

public class CameraShakeEffect extends CameraEffect

## Fields

- @Nullable protected String cameraShakeId
- protected int cameraShakeIndex
- @Nullable protected ShakeIntensity intensity

## Methods

- @Nonnull public AccumulationMode getAccumulationMode()
- public float getDefaultIntensityContext()
- public float calculateIntensity(float intensityContext)
- @Nonnull @Override public com.hypixel.hytale.protocol.packets.camera.CameraShakeEffect createCameraShakePacket()
- @Nonnull @Override public com.hypixel.hytale.protocol.packets.camera.CameraShakeEffect createCameraShakePacket(float intensityContext)
- @Nonnull @Override public String toString()

Also in this package: Modifier, ShakeIntensity

Complete API:
  public AccumulationMode getAccumulationMode()
  public float getDefaultIntensityContext()
  public float calculateIntensity(float intensityContext)
  public com.hypixel.hytale.protocol.packets.camera.CameraShakeEffect createCameraShakePacket()
  public com.hypixel.hytale.protocol.packets.camera.CameraShakeEffect createCameraShakePacket(float intensityContext)
  public String toString()

Fields:
public static final BuilderCodec<CameraShakeEffect> CODEC
protected String cameraShakeId
protected int cameraShakeIndex
protected ShakeIntensity intensity
