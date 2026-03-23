# PortalDescription

Type: class | Package: com.hypixel.hytale.server.core.asset.type.portalworld

public class PortalDescription

Class in the portalworld subsystem.

## Fields

- displayNameKey | String | String field.
- flavorTextKey | String | String field.
- themeColor | Color | Color field.
- pillTags | PillTag[] | PillTag[] field.
- objectivesKeys | String[] | String[] field.
- wisdomKeys | String[] | String[] field.
- splashImageFilename | String | String field.

## Methods

- getDisplayNameKey() | String | public method.
- getDisplayName() | Message | public method.
- getFlavorTextKey() | String | public method.
- getFlavorText() | Message | public method.
- getThemeColor() | Color | public method.
- getPillTags() | List<PillTag> | public method.
- getObjectivesKeys() | String[] | public method.
- getWisdomKeys() | String[] | public method.
- getSplashImageFilename() | String | public method.

Also in this package: PillTag, PortalSpawn, PortalType

Complete API:
  public String getDisplayNameKey()
  public Message getDisplayName()
  public String getFlavorTextKey()
  public Message getFlavorText()
  public Color getThemeColor()
  public List<PillTag> getPillTags()
  public String[] getObjectivesKeys()
  public String[] getWisdomKeys()
  public String getSplashImageFilename()

Fields:
public static final BuilderCodec<PortalDescription> CODEC
private String displayNameKey
private String flavorTextKey
private Color themeColor
private PillTag[] pillTags
private String[] objectivesKeys
private String[] wisdomKeys
private String splashImageFilename
