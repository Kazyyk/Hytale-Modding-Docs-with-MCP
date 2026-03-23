# BuilderMotionControllerBase

Type: class | Package: com.hypixel.hytale.server.npc.movement.controllers.builders | Extends: BuilderBaseWithType<MotionController>

public abstract class BuilderMotionControllerBase extends BuilderBaseWithType<MotionController>

Abstract base builder for all motion controller JSON configurations. Reads the shared configuration properties common to all controllers (epsilon values, speed limits, rotation speed, run threshold). Subclasses: BuilderMotionControllerWalk, BuilderMotionControllerFly, BuilderMotionControllerDive.

## JSON Configuration Properties

- EpsilonSpeed | double | 0.00001 | Minimum speed considered non-zero
- EpsilonAngle | float | 3.0 | Minimum angle difference in degrees
- MaxHeadRotationSpeed | float | 360.0 | Head rotation speed in degrees/s (0..360)
- ForceVelocityDamping | double | 0.5 | External force damping rate
- RunThreshold | double | 0.7 | Relative speed for run animation (0..1)
- RunThresholdRange | double | 0.15 | Hysteresis range for run/walk switch (0..1)

## Abstract Methods

- Class<? extends MotionController> getClassType() | Returns the concrete controller class for factory registration

## Key Methods

- float getEpsilonAngle() | Returns epsilon angle converted to radians
- double getEpsilonSpeed() | Returns epsilon speed
- double getForceVelocityDamping() | Returns force damping coefficient
- double getMaxHorizontalSpeed(BuilderSupport) | Evaluates max horizontal speed expression
- float getMaxHeadRotationSpeed(BuilderSupport) | Evaluates head rotation speed and converts to radians
- boolean isEnabled(ExecutionContext) | Always returns `true
- String getIdentifier() | Returns the builder's key name from `NPCPlugin.getBuilderInfo()
