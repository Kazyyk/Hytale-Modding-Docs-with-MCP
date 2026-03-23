# LegacyBeaconSpatialSystem

Type: class | Package: com.hypixel.hytale.server.spawning.systems | Extends: SpatialSystem

public class LegacyBeaconSpatialSystem extends SpatialSystem

## Fields

- private static final Archetype<EntityStore> QUERY

## Methods

- @Override public Query<EntityStore> getQuery()
- @Override public void tick(float dt, int systemIndex, Store<EntityStore> store)
- @Nonnull @Override public Vector3d getPosition(ArchetypeChunk<EntityStore> archetypeChunk, int index)

Also in this package: BeaconSpatialSystem, SpawnMarkerSpatialSystem

Complete API:
  public Query<EntityStore> getQuery()
  public void tick(float dt, int systemIndex, Store<EntityStore> store)
  public Vector3d getPosition(ArchetypeChunk<EntityStore> archetypeChunk, int index)

Fields:
private static final Archetype<EntityStore> QUERY
