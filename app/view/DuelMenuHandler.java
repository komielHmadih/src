package app.view;

import app.Controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DuelMenuHandler implements MenuHandler{

    @Override
    public boolean handle(Controller controller) {
        String command = UserCommandGetter.getUserCommand();
        Matcher matcher;
        if ((matcher=DuelCommand.SHOW_MENU.getStringMatcher(command)).find()){
            System.out.println("Duel Menu");}
        else if ((matcher=DuelCommand.EXIT.getStringMatcher(command)).find()){
            controller.exit();
        }
        else if ((matcher=DuelCommand.SELECT_MONSTER.getStringMatcher(command)).find()){
            controller.selectMonster(matcher.group(1));
        }
        else if ((matcher=DuelCommand.SELECT_SPELL.getStringMatcher(command)).find()){
            controller.selectSpell(matcher.group(1));
        }
        else if ((matcher=DuelCommand.MONSTER_OPP.getStringMatcher(command)).find()){
            controller.oppMonster(matcher.group(1));
        }
        else if ((matcher=DuelCommand.SPELL_OPP.getStringMatcher(command)).find()){
            controller.spelltOpp(matcher.group(1));
        }
        else if((matcher=DuelCommand.SELECT_FIELD.getStringMatcher(command)).find()){
            controller.selectField();
        }
        else if ((matcher=DuelCommand.FIELD_OPP.getStringMatcher(command)).find()){
            controller.oppField();
        }
        else if ((matcher=DuelCommand.SELECT_HAND.getStringMatcher(command)).find()){
            controller.selectHand(matcher.group(1));
        }
        else if((matcher=DuelCommand.DESELECT.getStringMatcher(command)).find()){
            controller.deselect();
        }
        else if((matcher=DuelCommand.SUMMON.getStringMatcher(command)).find()){
            controller.summon();
        }
        else if ((matcher=DuelCommand.SET.getStringMatcher(command)).find()){
            controller.set();
        }
        else if((matcher=DuelCommand.SET_POSITION.getStringMatcher(command)).find()){
            controller.setPosition(matcher.group(1));
        }
        else if((matcher=DuelCommand.FLIP.getStringMatcher(command)).find()){
            controller.flip();
        }
        else if ((matcher=DuelCommand.ATTACK.getStringMatcher(command)).find()){
            controller.attack(matcher.group(1));
        }
        else if((matcher=DuelCommand.DIRECT_ATTACK.getStringMatcher(command)).find()){
            controller.directAttack();
        }
        else if ((matcher=DuelCommand.ACTIVE_EFFECT.getStringMatcher(command)).find()){
            controller.activeEffect();
        }
        else if ((matcher=DuelCommand.SHOW_GYARD.getStringMatcher(command)).find()){
            controller.showGyard();
        }
        else if((matcher=DuelCommand.BACK.getStringMatcher(command)).find()){
            controller.back();
        }
        else if ((matcher=DuelCommand.SHOW_CARD.getStringMatcher(command)).find()){
            controller.showCard();
        }
        else if ((matcher=DuelCommand.SURRENDER.getStringMatcher(command)).find()){
            controller.surrender();
        };
        return false;
    }
}

enum DuelCommand {
    ACTIVE_EFFECT("^activate effect$"),
    ATTACK("^attack ([1-5])$"),
    BACK("^back$"),
    DESELECT("^select -d$"),
    DIRECT_ATTACK("^attack direct$"),
    EXIT("^menu exit$"),
    FIELD_OPP("^select --field --opponent$"),
    FLIP("^flip-summon$"),
    MONSTER_OPP("^select --monster --opponent ([1-5])$"),
    SELECT_FIELD("^select --field"),
    SELECT_HAND("^select --hand ([1-6])"),
    SELECT_MONSTER("^select --monster ([1-5])$"),
    SELECT_SPELL("^select --spell ([1-5])$"),
    SET("^set$"),
    SET_POSITION("^set --position (attack|defense)$"),
    SHOW_CARD("^card show --selected$"),
    SHOW_GYARD("^show graveyard$"),
    SHOW_MENU("^menu show-current$"),
    SPELL_OPP("^select --spell --opponent ([1-5])$"),
    SUMMON("^summon$"),
    SURRENDER("^surrender$");


    private Pattern commandPattern;

    public Pattern getCommandPattern() {
        return commandPattern;
    }

    public Matcher getStringMatcher(String input) {
        return this.commandPattern.matcher(input);
    }

    DuelCommand(String commandPatternString) {
        this.commandPattern = Pattern.compile(commandPatternString);
    }
}
