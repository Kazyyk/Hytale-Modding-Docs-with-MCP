# HandleProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.plugin | Implements: IWorldGenProvider

public class HandleProvider implements IWorldGenProvider

Provider supplying Handle values based on context.

## Constants

- @Nonnull public static final String ID
- @Nonnull public static final String DEFAULT_WORLD_STRUCTURE_NAME

## Fields

- @Nonnull private final HytaleGenerator plugin
- @Nonnull private String worldStructureName
- @Nullable private String seedOverride
- private int worldCounter

## Methods

- public HandleProvider(@Nonnull HytaleGenerator plugin, int worldCounter)
- public void setWorldStructureName(@Nullable String worldStructureName)
- public void setSeedOverride(@Nullable String seedOverride)
- @Nonnull public String getWorldStructureName()
- @Nullable public String getSeedOverride()
- @Nonnull @Override public IWorldGen getGenerator()

Also in this package: Handle, HytaleGenerator

Complete API:
  public void setWorldStructureName(String worldStructureName)
  public void setSeedOverride(String seedOverride)
  public String getWorldStructureName()
  public String getSeedOverride()
  public IWorldGen getGenerator()

Fields:
public static final String ID
public static final String DEFAULT_WORLD_STRUCTURE_NAME
private final HytaleGenerator plugin
private String worldStructureName
private String seedOverride
private int worldCounter
