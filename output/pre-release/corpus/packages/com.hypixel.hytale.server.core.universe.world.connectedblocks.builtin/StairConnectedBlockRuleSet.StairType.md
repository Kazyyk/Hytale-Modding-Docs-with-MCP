# StairConnectedBlockRuleSet.StairType

Type: enum | Package: com.hypixel.hytale.server.core.universe.world.connectedblocks.builtin

public enum StairConnectedBlockRuleSet.StairType

Stair shape variants.

## Enum Constants

- STRAIGHT | Standard straight stair
- CORNER_LEFT | Left corner
- CORNER_RIGHT | Right corner
- INVERTED_CORNER_LEFT | Left inverted corner
- INVERTED_CORNER_RIGHT | Right inverted corner

Also in this package: ConnectedBlockOutput, RoofConnectedBlockRuleSet, StairConnectedBlockRuleSet, StairConnection, StairLikeConnectedBlockRuleSet

Complete API:
  public static StairConnectedBlockRuleSet.StairType corner(boolean right)
  public static StairConnectedBlockRuleSet.StairType invertedCorner(boolean right)
  public boolean isCorner()
  public boolean isInvertedCorner()
  public boolean isLeft()
  public boolean isRight()

Fields:
private static final StairConnectedBlockRuleSet.StairType[] VALUES
