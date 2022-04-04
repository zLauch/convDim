__config() -> {
    'stay_loaded' -> true,
    'commands' -> {
        '' -> _() ->_cdim();
    }
};

_cdim()->(
    player = player();
    dim = query(player,'dimension');
    y=round(query(player,'y'));
    if
    (
        dim == 'the_end',
        (
            run('tellraw '+player+' ["",{"text":"------------------------------","color":"dark_gray"}]');
            run('tellraw '+player+' ["",{"text":"End","color":"light_purple"},{"text":" >> ","color":"white"},{"text":"not possible","color":"red"}]');
            run('tellraw '+player+' ["",{"text":"only you can see those messages above.","color":"dark_gray"}]');
            run('tellraw '+player+' ["",{"text":"------------------------------","color":"dark_gray"}]');
        ),
        dim == 'overworld',
        (
            x=round(query(player,'x')/8);
            z=round(query(player,'z')/8);
            
            run('tellraw '+player+' ["",{"text":"------------------------------","color":"dark_gray"}]');
            run('tellraw '+player+' ["",{"text":"Overworld","color":"green"},{"text":" >> ","color":"white"},{"text":"Nether","color":"red"},{"text":" >> ","color":"white"},{"text":"x'+x+' | y'+y+' | z'+z+'","color":"aqua"}]');
            run('tellraw '+player+' ["",{"text":"only you can see those messages above.","color":"dark_gray"}]');
            run('tellraw '+player+' ["",{"text":"------------------------------","color":"dark_gray"}]');
        ),
        dim == 'the_nether',
        (
            x=round(query(player,'x')*8);
            z=round(query(player,'z')*8);
            
            run('tellraw '+player+' ["",{"text":"------------------------------","color":"dark_gray"}]');
            run('tellraw '+player+' ["",{"text":"Nether","color":"red"},{"text":" >> ","color":"white"},{"text":"Overworld","color":"green"},{"text":" >> ","color":"white"},{"text":"x'+x+' | y'+y+' | z'+z+'","color":"aqua"}]');
            run('tellraw '+player+' ["",{"text":"only you can see those messages above.","color":"dark_gray"}]');
            run('tellraw '+player+' ["",{"text":"------------------------------","color":"dark_gray"}]');
        )
    );
)