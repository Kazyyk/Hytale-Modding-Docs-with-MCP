# ClientFeature

Type: enum | Package: com.hypixel.hytale.protocol.packets.setup

public enum ClientFeature

Enumeration of client-side features that can be toggled by the server: SplitVelocity, Mantling, SprintForce, CrouchSlide, SafetyRoll, DisplayHealthBars, DisplayCombatText, CanHideHelmet, CanHideCuirass, CanHideGauntlets, CanHidePants.

Also in this package: AssetFinalize, AssetInitialize, AssetPart, PlayerOptions, RemoveAssets, RequestAssets, RequestCommonAssetsRebuild, ServerTags, SetTimeDilation, SetUpdateRate, UpdateFeatures, ViewRadius, WorldLoadFinished, WorldLoadProgress, WorldSettings

Complete API:
  public int getValue()
  public static ClientFeature fromValue(int value)

Fields:
public static final ClientFeature[] VALUES
private final int value
