# Steering

Type: class | Package: com.hypixel.hytale.server.npc.movement

public class Steering

## Fields

- public static final Steering NULL
- private final Vector3d translation
- private double maxDistance
- private Vector3d maxDistanceComponentSelector
- private boolean hasTranslation
- private float yaw
- private boolean hasYaw
- private float pitch
- private boolean hasPitch
- private float roll
- private boolean hasRoll
- private double relativeTurnSpeed
- private boolean hasRelativeTurnSpeed

## Methods

- @Nonnull public Steering clear()
- @Nonnull public Steering assign(@Nonnull Steering other)
- @Override public boolean equals(@Nullable Object o)
- @Override public int hashCode()
- @Nonnull public Steering clearTranslation()
- @Nonnull public Steering clearRotation()
- @Nonnull public Vector3d getTranslation()
- public double getX()
- @Nonnull public Steering setX(double value)
- public double getY()
- @Nonnull public Steering setY(double value)
- public double getZ()
- @Nonnull public Steering setZ(double value)
- @Nonnull public Steering setTranslation(@Nonnull Vector3d translation)
- @Nonnull public Steering setTranslation(double x, double y, double z)
- @Nonnull public Steering setTranslationRelativeSpeed(double relativeSpeed)
- @Nonnull public Steering scaleTranslation(double speedFactor)
- @Nonnull public Steering ensureMinTranslation(double relativeSpeed)
- public double getMaxDistance()
- public void setMaxDistance(double maxDistance)
- public void clearMaxDistance()
- public Vector3d getMaxDistanceComponentSelector()
- public void setMaxDistanceComponentSelector(Vector3d maxDistanceComponentSelector)
- public void clearMaxDistanceComponentSelector()
- public float getYaw()
- @Nonnull public Steering setYaw(float angle)
- public void clearYaw()
- public float getPitch()
- @Nonnull public Steering setPitch(float angle)
- public void clearPitch()
- public float getRoll()
- @Nonnull public Steering setRoll(float angle)
- public void clearRoll()
- @Nonnull public Steering setRelativeTurnSpeed(double relativeTurnSpeed)
- public boolean hasTranslation()
- public boolean hasYaw()
- public boolean hasPitch()
- public boolean hasRoll()
- public double getSpeed()
- public double getRelativeTurnSpeed()
- @Nonnull @Override public String toString()

Also in this package: FlockMembershipType, FlockPlayerMembership, GroupSteeringAccumulator, MotionKind, MovementState, NavState

Complete API:
  public Steering clear()
  public Steering assign(Steering other)
  public boolean equals(Object o)
  public int hashCode()
  public Steering clearTranslation()
  public Steering clearRotation()
  public Vector3d getTranslation()
  public double getX()
  public Steering setX(double value)
  public double getY()
  public Steering setY(double value)
  public double getZ()
  public Steering setZ(double value)
  public Steering setTranslation(Vector3d translation)
  public Steering setTranslation(double x, double y, double z)
  public Steering setTranslationRelativeSpeed(double relativeSpeed)
  public Steering scaleTranslation(double speedFactor)
  public Steering ensureMinTranslation(double relativeSpeed)
  public double getMaxDistance()
  public void setMaxDistance(double maxDistance)
  public void clearMaxDistance()
  public Vector3d getMaxDistanceComponentSelector()
  public void setMaxDistanceComponentSelector(Vector3d maxDistanceComponentSelector)
  public void clearMaxDistanceComponentSelector()
  public float getYaw()
  public Steering setYaw(float angle)
  public void clearYaw()
  public float getPitch()
  public Steering setPitch(float angle)
  public void clearPitch()
  public float getRoll()
  public Steering setRoll(float angle)
  public void clearRoll()
  public Steering setRelativeTurnSpeed(double relativeTurnSpeed)
  public boolean hasTranslation()
  public boolean hasYaw()
  public boolean hasPitch()
  public boolean hasRoll()
  public double getSpeed()
  public double getRelativeTurnSpeed()
  public String toString()

Fields:
public static final Steering NULL
private final Vector3d translation
private double maxDistance
private Vector3d maxDistanceComponentSelector
private boolean hasTranslation
private float yaw
private boolean hasYaw
private float pitch
private boolean hasPitch
private float roll
private boolean hasRoll
private double relativeTurnSpeed
private boolean hasRelativeTurnSpeed
