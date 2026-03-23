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
