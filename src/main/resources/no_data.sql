INSERT INTO platform(id, name)
VALUES  ( 1, 'Wii'),
        ( 2, 'NEST'),
        ( 3, 'GB'),
        ( 4, 'DS'),
        ( 5,'X360'),
        ( 6, 'PS3'),
        ( 7, 'PS4'),
        ( 8,'3DS'),
        ( 9,'N64'),
        ( 10,'SNES'),
        ( 11,'PSP'),
        ( 12,'PC'),
        ( 13, '2600'),
        ( 14, 'XB');


INSERT INTO games(title, platform_id, price, year, category, photo)
VALUES  ('Wii Sports',1,'19.99', '2006', 'Sports', 'default'),
        ('Super Mario Bros',2,'14.99', '1985', 'Platform', 'default'),
        ('Mario Kart Wii',1,'9.99', '2008', 'Racing', 'default'),
        ('Wii Sports Resort',1,'9.99','2009','Sports','default'),
        ('Pokemon Red / Pokemon Blue',3,'29.99','1996', 'Role-playing', 'default'),
        ('Tetris',3, '4.99','1989', 'Puzle', 'default'),
        ('New Super Mario Bros.',4,'14.99','2006','Platform','default'),
        ('Wii Play',1,'6.99','2006','Misc','default'),
        ('New Super Mario Bros. Wii',1,'9.99','2009','Platform','default'),
        ('Duck Hunt',2,'3.95','1984','Shooter','default'),
        ('Nintendogs',3,'29.99','2005','Simulation','default'),
        ('Mario Kart DS',4,'19.99','2005','Racing','default');