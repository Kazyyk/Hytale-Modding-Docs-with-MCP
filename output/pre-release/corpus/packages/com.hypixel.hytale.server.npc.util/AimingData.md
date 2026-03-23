# AimingData

Type: class | Package: com.hypixel.hytale.server.npc.util | Implements: ExtraInfoProvider

public class AimingData implements ExtraInfoProvider

Stores aiming state for NPC projectile and close-combat targeting. Computes ballistic pitch/yaw solutions for both flat and arced trajectories, tracks the current target reference, and determines whether the NPC is on-target within a specified hit angle.

## Key Methods

- public boolean isHaveAttacked()
- public void setHaveAttacked(boolean haveAttacked)
- public void requireBallistic(BallisticData ballisticData)
- public void requireCloseCombat()
- public float getPitch()
- public float getPitch(boolean flatTrajectory)
- public float getYaw()
- public float getYaw(boolean flatTrajectory)
- public BallisticData getBallisticData()
- public void setUseFlatTrajectory(boolean useFlatTrajectory)
- public void setChargeDistance(double chargeDistance)
- public double getChargeDistance()
- public void setDesiredHitAngle(double desiredHitAngle)
- public double getDesiredHitAngle()
- public Class<AimingData> getType()
- public void setDepthOffset(double depthOffset, boolean pitchAdjustOffset)
- public Ref<EntityStore> getTarget()
- public void setTarget(Ref<EntityStore> ref)
- public boolean haveOrientation()
- public void setOrientation(float yaw, float pitch)
