# WorldMapConfig

Type: class | Package: com.hypixel.hytale.server.core.asset.type.gameplay

public class WorldMapConfig

World map configuration controlling map visibility, update intervals, and which entity types are tracked on the map.

Known subclasses: ServerWorldMapConfig, WorldWorldMapConfig

Also in this package: ArmorVisibilityOption, BrokenPenalties, CameraEffectsConfig, CombatConfig, CraftingConfig, DeathConfig, GameplayConfig, GatheringConfig, GatheringEffectsConfig, ItemDurabilityConfig, ItemsLossMode, PlayerConfig, RespawnConfig, SpawnConfig, WorldConfig

Complete API:
  public boolean isDisplaySpawn()
  public boolean isDisplayHome()
  public boolean isDisplayWarps()
  public boolean isDisplayDeathMarker()
  public boolean isDisplayPlayers()
  public PlayersMapMarkerConfig getPlayersConfig()
  public boolean canTrackPlayersInCompass()
  public boolean canTogglePlayersInMap()
  public UserMapMarkerConfig getUserMapMarkerConfig()

Fields:
public static final BuilderCodec<WorldMapConfig> CODEC
protected boolean displaySpawn
protected boolean displayHome
protected boolean displayWarps
protected boolean displayDeathMarker
protected boolean displayPlayers
protected boolean canTrackPlayersInCompass
protected boolean canTogglePlayersInMap
protected PlayersMapMarkerConfig playersConfig
protected UserMapMarkerConfig userMapMarkerConfig
