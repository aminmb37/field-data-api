------------ Boundary
insert into boundary (id, created, updated, geo_json_type, geometry_type)
values ('210c1b44-9378-4d0d-80bf-0bfb183e79e2', now(), null, 0, 4);
------------ GeoProperty
insert into geo_property (id, created, updated, prop_key, prop_val, boundary_id)
values ('53d28e5a-fd48-40ca-b66f-a616933ae4c9', now(), null, 'Area', 'One Hectare', '210c1b44-9378-4d0d-80bf-0bfb183e79e2');
------------ Coordinate
insert into coordinate (id, created, updated, coordinate, boundary_id)
values ('fc008e09-c523-4991-84fa-e00904c17501', now(), null,
 'aced0005737200226f72672e737072696e676672616d65776f726b2e646174612e67656f2e506f696e7431b9e90ef11a400602000244000178440001797870404237600f34506a404a986aca793576',
 '210c1b44-9378-4d0d-80bf-0bfb183e79e2');
------------ Coordinate
insert into coordinate (id, created, updated, coordinate, boundary_id)
values ('2af0472c-5646-49b7-818e-d5bd491ec4b7', now(), null,
 'aced0005737200226f72672e737072696e676672616d65776f726b2e646174612e67656f2e506f696e7431b9e90ef11a40060200024400017844000179787040423774a3400b89404a9886a4ca4f44',
 '210c1b44-9378-4d0d-80bf-0bfb183e79e2');
------------ Coordinate
insert into coordinate (id, created, updated, coordinate, boundary_id)
values ('f2f84732-1ce9-43b5-9ad9-2c3d28135523', now(), null,
 'aced0005737200226f72672e737072696e676672616d65776f726b2e646174612e67656f2e506f696e7431b9e90ef11a4006020002440001784400017978704042375703f2d3c8404a98a7589efd87',
 '210c1b44-9378-4d0d-80bf-0bfb183e79e2');
------------ Coordinate
insert into coordinate (id, created, updated, coordinate, boundary_id)
values ('a5a967aa-9220-41e4-ba6f-e0c316741490', now(), null,
 'aced0005737200226f72672e737072696e676672616d65776f726b2e646174612e67656f2e506f696e7431b9e90ef11a40060200024400017844000179787040423742e557de0d404a988bd230b9dc',
 '210c1b44-9378-4d0d-80bf-0bfb183e79e2');
------------ Coordinate
insert into coordinate (id, created, updated, coordinate, boundary_id)
values ('0416a900-16fd-4b1a-bd24-5739a586c90c', now(), null,
 'aced0005737200226f72672e737072696e676672616d65776f726b2e646174612e67656f2e506f696e7431b9e90ef11a400602000244000178440001797870404237600f34506a404a986aca793576',
 '210c1b44-9378-4d0d-80bf-0bfb183e79e2');
------------ Field
insert into field (id, created, updated, country_code, name, boundary_id)
values ('05b768d4-c16b-4b16-bb74-c6a835d810e9', now(), null, 'IRI', 'My Fathers Rice Field', '210c1b44-9378-4d0d-80bf-0bfb183e79e2');
------------