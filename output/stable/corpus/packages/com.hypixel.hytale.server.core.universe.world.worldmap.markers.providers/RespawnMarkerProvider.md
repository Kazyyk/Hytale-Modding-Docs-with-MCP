# RespawnMarkerProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.worldmap.markers.providers | Implements: WorldMapManager.MarkerProvider

public class RespawnMarkerProvider implements WorldMapManager.MarkerProvider

## Fields

- public static final RespawnMarkerProvider INSTANCE

## Constructors

- private RespawnMarkerProvider()

## Methods

- @Override public void update(@Nonnull World world, @Nonnull Player player, @Nonnull MarkersCollector collector)
- private static void addRespawnMarker(MarkersCollector collector, PlayerRespawnPointData respawnPoint, int index)

Also in this package: DeathMarkerProvider, OtherPlayersMarkerProvider, POIMarkerProvider, PerWorldDataMarkerProvider, PersonalMarkersProvider, PlayerIconMarkerProvider, SharedMarkersProvider, SpawnMarkerProvider

Complete API:
  public void update(World world, Player player, MarkersCollector collector)
  private static void addRespawnMarker(MarkersCollector collector, PlayerRespawnPointData respawnPoint, int index)

Fields:
public static final RespawnMarkerProvider INSTANCE
