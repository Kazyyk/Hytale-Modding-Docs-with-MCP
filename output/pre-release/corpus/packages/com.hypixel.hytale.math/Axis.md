# Axis

Type: enum | Package: com.hypixel.hytale.math

public enum Axis

Represents the three spatial axes (X, Y, Z). Each constant carries a unit direction vector and provides rotation and flip operations for both integer and double 3D vectors. Rotations are performed in 90-degree increments.

## Enum Constants

- X | (1, 0, 0) | The X axis.
- Y | (0, 1, 0) | The Y axis.
- Z | (0, 0, 1) | The Z axis.

## Methods

- getDirection() | Vector3i | Returns a clone of the unit direction vector for this axis.
- rotate(@Nonnull Vector3i vector, int angle) | void | Rotates an integer vector around this axis by the given angle in degrees (must be a multiple of 90).
- rotate(@Nonnull Vector3d vector, int angle) | void | Rotates a double vector around this axis by the given angle in degrees.
- rotate(@Nonnull Vector3i vector) | void | Rotates an integer vector 90 degrees around this axis.
- rotate(@Nonnull Vector3d vector) | void | Rotates a double vector 90 degrees around this axis.
- flip(@Nonnull Vector3i vector) | void | Negates the component of the integer vector along this axis.
- flip(@Nonnull Vector3d vector) | void | Negates the component of the double vector along this axis.
- flipRotation(@Nonnull Vector3f rotation) | void | Flips the rotation angle (yaw/pitch) corresponding to this axis.

Also in this package: Range

Complete API:
  public Vector3i getDirection()
  public void rotate(Vector3i vector, int angle)
  public void rotate(Vector3d vector, int angle)
  public void rotate(Vector3i vector)
  public void rotate(Vector3d vector)
  public void flip(Vector3i vector)
  public void flip(Vector3d vector)
  public void flipRotation(Vector3f rotation)

Fields:
private final Vector3i direction
