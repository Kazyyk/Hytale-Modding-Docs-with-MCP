# PositionProvider

Type: class | Package: com.hypixel.hytale.server.npc.sensorinfo | Extends: InfoProviderBase | Implements: IPositionProvider

public class PositionProvider extends InfoProviderBase implements IPositionProvider

Implementation of `IPositionProvider`.

## Fields

- x | double | double field.
- y | double | double field.
- z | double | double field.
- isValid | boolean | boolean field.

## Constructors

- PositionProvider() | Creates a new PositionProvider instance.
- PositionProvider(ParameterProvider parameterProvider) | Creates a new PositionProvider instance.
- PositionProvider(ParameterProvider parameterProvider, ExtraInfoProvider... providers) | Creates a new PositionProvider instance.

## Methods

- clear() | void | public method.
- setTarget(@Nullable Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor) | Ref<EntityStore> | public method.
- setTarget(@Nonnull Vector3d pos) | void | public method.
- setTarget(double x, double y, double z) | void | public method.
- providePosition(@Nonnull Vector3d result) | boolean | public method.
- getX() | double | public method.
- getY() | double | public method.
- getZ() | double | public method.
- getPositionProvider() | IPositionProvider | public method.
- hasPosition() | boolean | public method.
- getTarget() | Ref<EntityStore> | public method.

Known subclasses: AnchorPositionProvider, BaseHeightPositionProvider, BoundPositionProvider, CachedPositionProvider, CachedPositionProvider, EntityPositionProvider, FieldFunctionOccurrencePositionProvider, FieldFunctionPositionProvider, ListPositionProvider, Mesh2DPositionProvider, Mesh3DPositionProvider, OffsetPositionProvider, SimpleHorizontalPositionProvider, SpherePositionProvider, UnionPositionProvider

Also in this package: CachedPositionProvider, EntityPositionProvider, ExtraInfoProvider, IPathProvider, IPositionProvider, InfoProvider, InfoProviderBase, PathProvider, ValueWrappedInfoProvider, WrappedInfoProvider

Complete API:
  public void clear()
  public Ref<EntityStore> setTarget(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void setTarget(Vector3d pos)
  public void setTarget(double x, double y, double z)
  public boolean providePosition(Vector3d result)
  public double getX()
  public double getY()
  public double getZ()
  public IPositionProvider getPositionProvider()
  public boolean hasPosition()
  public Ref<EntityStore> getTarget()

Fields:
protected double x
protected double y
protected double z
protected boolean isValid
