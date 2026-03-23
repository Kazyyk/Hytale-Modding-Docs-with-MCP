# BallisticData

Type: interface | Package: com.hypixel.hytale.server.core.modules.projectile.config

public interface BallisticData

Interface providing ballistic trajectory parameters for projectiles: muzzle velocity, gravity, shot center offsets, and pitch adjustment.

## Methods

- public double getMuzzleVelocity()
- public double getGravity()
- public double getVerticalCenterShot()
- public double getHorizontalCenterShot()
- public double getDepthShot()
- public boolean isPitchAdjustShot()

Known implementors: Projectile, ProjectileConfig

Also in this package: BallisticDataProvider, BounceConsumer, ImpactConsumer, PhysicsConfig, ProjectileConfig, ProjectileConfigPacketGenerator, STATE, StandardPhysicsConfig, StandardPhysicsProvider

Complete API:
  double getMuzzleVelocity()
  double getGravity()
  double getVerticalCenterShot()
  double getHorizontalCenterShot()
  double getDepthShot()
  boolean isPitchAdjustShot()
