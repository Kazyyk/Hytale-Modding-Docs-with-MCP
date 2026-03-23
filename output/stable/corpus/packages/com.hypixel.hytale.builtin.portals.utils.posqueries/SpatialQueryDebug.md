# SpatialQueryDebug

Type: class | Package: com.hypixel.hytale.builtin.portals.utils.posqueries

public class SpatialQueryDebug

## Fields

- private final StringBuilder builder
- private String indent
- private final Stack<String> scope

## Methods

- @Nonnull public SpatialQueryDebug appendLine(String string)
- @Nonnull public SpatialQueryDebug indent(String scopeReason)
- @Nonnull public SpatialQueryDebug unindent()
- @Nonnull public static String fmt(Vector3d point)
- @Nonnull @Override public String toString()

Also in this package: PositionPredicate, SpatialQuery

Complete API:
  public SpatialQueryDebug appendLine(String string)
  public SpatialQueryDebug indent(String scopeReason)
  public SpatialQueryDebug unindent()
  public static String fmt(Vector3d point)
  public String toString()

Fields:
private final StringBuilder builder
private String indent
private final Stack<String> scope
